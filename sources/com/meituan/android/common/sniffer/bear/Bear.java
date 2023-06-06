package com.meituan.android.common.sniffer.bear;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.kitefly.KiteFlyConstants;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.sniffer.ISnifferM;
import com.meituan.robust.common.StringUtil;
import com.sankuai.android.jarvis.c;
import com.sankuai.waimai.launcher.util.aop.b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Bear implements ISnifferM {
    private static int errorNum;
    public static BadBoyGrave sBadBodyGrave;
    Context mContext;
    HoneyConfig mDefaultHoneyConfig;
    private volatile boolean mInitDone;
    Map<Key, HoneyConfig> mKey2HoneyConfig;
    q mStorage;
    private final Map<Key, BearCub> mKey2BearCub = new ConcurrentHashMap();
    final Executor mWorker = c.a(KiteFlyConstants.SNIFFER);

    public boolean init(@NonNull Context context) {
        final String accessCache = Horn.accessCache("sniffer_config");
        Horn.preload("sniffer_config");
        if (TextUtils.isEmpty(accessCache) || StringUtil.NULL.equals(accessCache) || "{}".equals(accessCache)) {
            return false;
        }
        this.mContext = context;
        c.c("sniffer-delay").schedule(new SafeRunnable() { // from class: com.meituan.android.common.sniffer.bear.Bear.1
            @Override // com.meituan.android.common.sniffer.bear.Bear.SafeRunnable
            void safeRun() {
                b.a(Bear.this.mWorker, new SafeRunnable() { // from class: com.meituan.android.common.sniffer.bear.Bear.1.1
                    @Override // com.meituan.android.common.sniffer.bear.Bear.SafeRunnable
                    void safeRun() {
                        Bear.this.onInit(accessCache);
                    }
                });
            }
        }, 6L, TimeUnit.SECONDS);
        return true;
    }

    @WorkerThread
    @VisibleForTesting
    void onInit(String str) {
        LinkedList<BearCub> linkedList;
        try {
            JsonObject asJsonObject = new JsonParser().parse(str).getAsJsonObject();
            this.mDefaultHoneyConfig = new HoneyConfig(asJsonObject.get("sniffer$default").getAsJsonObject(), null);
            this.mKey2HoneyConfig = new HashMap();
            for (String str2 : asJsonObject.keySet()) {
                if (!str2.startsWith("sniffer$")) {
                    String[] split = str2.split("\\$");
                    if (split.length == 2) {
                        this.mKey2HoneyConfig.put(Key.of(split[0], split[1]), new HoneyConfig(asJsonObject.getAsJsonObject(str2), this.mDefaultHoneyConfig));
                    }
                }
            }
            this.mStorage = q.a(this.mContext, KiteFlyConstants.SNIFFER, 2);
        } catch (Throwable th) {
            reportError(th);
            this.mDefaultHoneyConfig = HoneyConfig.ignoreAll();
            this.mKey2HoneyConfig = Collections.emptyMap();
        }
        synchronized (this) {
            linkedList = new LinkedList(this.mKey2BearCub.values());
            this.mInitDone = true;
        }
        for (BearCub bearCub : linkedList) {
            bearCub.onCreate();
        }
    }

    private void postCreateBearCub(@NonNull final BearCub bearCub) {
        b.a(this.mWorker, new SafeRunnable() { // from class: com.meituan.android.common.sniffer.bear.Bear.2
            @Override // com.meituan.android.common.sniffer.bear.Bear.SafeRunnable
            public void safeRun() {
                bearCub.onCreate();
            }
        });
    }

    @VisibleForTesting
    @NonNull
    BearCub bearCub(@Nullable String str, @Nullable String str2) {
        Key of = Key.of(str, str2);
        BearCub bearCub = this.mKey2BearCub.get(of);
        if (bearCub == null) {
            synchronized (this) {
                bearCub = this.mKey2BearCub.get(of);
                if (bearCub == null) {
                    BearCub bearCub2 = new BearCub(this, of);
                    this.mKey2BearCub.put(of, bearCub2);
                    if (this.mInitDone) {
                        postCreateBearCub(bearCub2);
                    }
                    return bearCub2;
                }
            }
        }
        of.recycle();
        return bearCub;
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public void normal(String str, String str2, String str3) {
        bearCub(str, str2).sniffer(Honey.of(true, str3));
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public void normal(String str, String str2, String str3, String str4) {
        bearCub(str, str2).sniffer(Honey.of(true, str3, str4));
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public void smell(String str, String str2, String str3) {
        bearCub(str, str2).sniffer(Honey.of(false, str3));
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public void smell(String str, String str2, String str3, String str4) {
        bearCub(str, str2).sniffer(Honey.of(false, str3).withDescribe(str4));
    }

    @Override // com.meituan.android.common.sniffer.ISniffer
    public void smell(String str, String str2, String str3, String str4, String str5) {
        bearCub(str, str2).sniffer(Honey.of(false, str3, str5).withDescribe(str4));
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public void normal(String str, String str2, String str3, long j) {
        bearCub(str, str2).sniffer(Honey.of(true, str3).withWeight(j));
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public void normal(String str, String str2, String str3, String str4, long j) {
        bearCub(str, str2).sniffer(Honey.of(true, str3, str4).withWeight(j));
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public void normal(String str, String str2, String str3, String str4, long j, Map<String, String> map) {
        bearCub(str, str2).sniffer(Honey.of(true, str3, str4).withWeight(j).withCustomField(map));
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public void normal(String str, String str2, String str3, String str4, String str5, long j, Map<String, String> map) {
        bearCub(str, str2).sniffer(Honey.of(true, str4, str5).withWeight(j).withCustomField(map).withPage(str3));
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public void smell(String str, String str2, String str3, String str4, String str5, long j) {
        bearCub(str, str2).sniffer(Honey.of(false, str3, str5).withDescribe(str4).withWeight(j));
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public void smell(String str, String str2, String str3, String str4, String str5, long j, Map<String, String> map) {
        bearCub(str, str2).sniffer(Honey.of(false, str3, str5).withWeight(j).withDescribe(str4).withCustomField(map));
    }

    @Override // com.meituan.android.common.sniffer.ISnifferWeight
    public void smell(String str, String str2, String str3, String str4, String str5, String str6, long j, Map<String, String> map) {
        bearCub(str, str2).sniffer(Honey.of(false, str4, str6).withDescribe(str5).withPage(str3).withWeight(j).withCustomField(map));
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static abstract class SafeRunnable implements Runnable {
        abstract void safeRun();

        @Override // java.lang.Runnable
        public void run() {
            try {
                safeRun();
            } catch (Throwable th) {
                Bear.reportError(th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void reportError(@NonNull Throwable th) {
        th.printStackTrace();
        int i = errorNum + 1;
        errorNum = i;
        if (i > 3) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("errMsg", th.getMessage());
        hashMap.put("errType", th.toString());
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        hashMap.put("stacktrace", stringWriter.toString());
        hashMap.put("errorNum", Integer.valueOf(errorNum));
        Babel.logRT(new Log.Builder("").generalChannelStatus(true).tag("sniffer-error").optional(hashMap).build());
    }
}

package com.meituan.android.common.horn.monitor;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.horn.Horn;
import com.meituan.android.common.horn.HornCallback;
import com.meituan.android.common.horn.MonitorInner;
import com.meituan.android.common.horn.extra.monitor.IHornMonitorService;
import com.meituan.android.common.kitefly.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HornMonitor implements IHornMonitorService {
    private static final String HORN_CONFIG = "horn_monitor_android";
    private static final String KEY_DATE = "$HORN_MONITOR_DATE$";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile HornMonitor sInstance;
    private volatile boolean mDayLimitEnable;
    private volatile boolean mEnable;
    private volatile double mGSamples;
    private final Random mRandom;
    private q mStorage;
    private final ConcurrentHashMap<String, Double> mType2Sample;

    @Override // com.meituan.android.common.horn.extra.monitor.IHornMonitorService
    public void catchException(@Nullable String str, int i, @Nullable Throwable th) {
    }

    @WorkerThread
    public static IHornMonitorService getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b80bc474924dd849c5293cf4e2f4982", 6917529027641081856L)) {
            return (IHornMonitorService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b80bc474924dd849c5293cf4e2f4982");
        }
        if (sInstance == null) {
            synchronized (HornMonitor.class) {
                if (sInstance == null) {
                    HornMonitor hornMonitor = new HornMonitor();
                    hornMonitor.fetchHornConfig();
                    sInstance = hornMonitor;
                }
            }
        }
        return sInstance;
    }

    public HornMonitor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "921f50274cce1a812593c499abf5d31d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "921f50274cce1a812593c499abf5d31d");
            return;
        }
        this.mRandom = new Random();
        this.mEnable = false;
        this.mGSamples = 0.0d;
        this.mDayLimitEnable = false;
        this.mType2Sample = new ConcurrentHashMap<>();
    }

    @WorkerThread
    private void fetchHornConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a869cb4ccbb9b1d64b920741494aeb9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a869cb4ccbb9b1d64b920741494aeb9b");
            return;
        }
        onHornConfig(Horn.accessCache(HORN_CONFIG));
        Horn.register(HORN_CONFIG, new HornCallback() { // from class: com.meituan.android.common.horn.monitor.HornMonitor.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.horn.HornCallback
            public void onChanged(boolean z, String str) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f81c8a0f8a6f07a6fa506284f2ffd1a2", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f81c8a0f8a6f07a6fa506284f2ffd1a2");
                } else if (z) {
                    HornMonitor.this.onHornConfig(str);
                } else {
                    HornMonitor.this.onHornConfig(null);
                }
            }
        });
    }

    private synchronized void checkStorage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf7dd5bec4faea192b0848cb23579943", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf7dd5bec4faea192b0848cb23579943");
            return;
        }
        if (this.mStorage == null) {
            this.mStorage = q.a(MonitorInner.context(), "horn_monitor", 2);
        }
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        if (!format.equals(this.mStorage.b(KEY_DATE, ""))) {
            this.mStorage.c();
            this.mStorage.a(KEY_DATE, format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onHornConfig(@Nullable String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f6a4aa843e3e9e4ce59dc8522477d4e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f6a4aa843e3e9e4ce59dc8522477d4e");
        } else if (TextUtils.isEmpty(str) || StringUtil.NULL.equals(str)) {
            this.mEnable = false;
            this.mGSamples = 0.0d;
            this.mDayLimitEnable = false;
            this.mType2Sample.clear();
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.mEnable = jSONObject.optBoolean("enable", false);
                this.mGSamples = jSONObject.optDouble("gsample", 0.0d);
                this.mDayLimitEnable = jSONObject.optBoolean("dlimit", false);
                this.mType2Sample.clear();
                JSONObject optJSONObject = jSONObject.optJSONObject("samples");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        double optDouble = optJSONObject.optDouble(next, 0.0d);
                        if (optDouble != 0.0d) {
                            this.mType2Sample.put(next, Double.valueOf(optDouble));
                        }
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.meituan.android.common.horn.extra.monitor.IHornMonitorService
    public boolean shouldMonitorChange(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35beb5fa7957047fe2e0bbd1273f9b55", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35beb5fa7957047fe2e0bbd1273f9b55")).booleanValue();
        }
        if (this.mEnable) {
            Double d = this.mType2Sample.get(str);
            if (d != null) {
                return shouldMonitor(d.doubleValue());
            }
            if (HORN_CONFIG.equals(str)) {
                return true;
            }
            if (this.mGSamples > 0.0d) {
                return shouldMonitor(this.mGSamples);
            }
            return false;
        }
        return false;
    }

    private boolean shouldMonitor(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a4693fb96dd6b810071869e9cf7c537", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a4693fb96dd6b810071869e9cf7c537")).booleanValue() : this.mRandom.nextDouble() < d;
    }

    @Override // com.meituan.android.common.horn.extra.monitor.IHornMonitorService
    public void onConfigChange(@NonNull Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9d6ba4afb82d45a5457a4c4caacc8c2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9d6ba4afb82d45a5457a4c4caacc8c2");
            return;
        }
        try {
            if (this.mDayLimitEnable) {
                String str = (String) map.get("name");
                String str2 = (String) map.get("version");
                checkStorage();
                String b = this.mStorage.b(str, "");
                if (b != null && b.equals(str2)) {
                    return;
                }
                this.mStorage.a(str, str2);
            }
            Babel.log(new Log.Builder(null).tag("horn.afford.config").optional(map).reportChannel("met-horn-log").lv4LocalStatus(true).build());
        } catch (Throwable th) {
            catchException("onConfigChanged failed", 5, th);
        }
    }
}

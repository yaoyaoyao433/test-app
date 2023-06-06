package com.dianping.shield.dynamic.preload;

import android.net.Uri;
import android.os.Looper;
import android.os.MessageQueue;
import android.support.annotation.UiThread;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.env.ShieldEnvironment;
import com.meituan.metrics.common.Constants;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.w;
import kotlin.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000bJ\b\u0010\u001c\u001a\u00020\u000eH\u0002J\u001a\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0003J\"\u0010 \u001a\u00020\u00182\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\tJ\"\u0010\"\u001a\u00020\u00182\u001a\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0004\u0018\u0001`\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00040\bj\b\u0012\u0004\u0012\u00020\u0004`\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/dianping/shield/dynamic/preload/DynamicPreloadMananger;", "", "()V", "MRN_BIZ_NAME_KEY", "", "MRN_ENTRY_NAME_KEY", "MRN_PREFIX", "alreadyPreloadList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "dynamicPreloadInterface", "Lcom/dianping/shield/dynamic/preload/DynamicPreloadInterface;", "preloadBlackList", "preloadEnable", "", "getPreloadEnable", "()Z", "setPreloadEnable", "(Z)V", "preloadEnbaleBizs", "getJSBundleName", "bizName", "entryName", "handleMRNUri", "", Constants.TRAFFIC_URI, "Landroid/net/Uri;", "init", "isInit", LaunchMode.LAUNCH_MODE_PRELOAD, "className", "preloadInner", "setBlackList", "arrayList", "setPreloadBizs", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class DynamicPreloadMananger {
    private static final String MRN_BIZ_NAME_KEY = "mrn_biz";
    private static final String MRN_ENTRY_NAME_KEY = "mrn_entry";
    private static final String MRN_PREFIX = "rn";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static DynamicPreloadInterface dynamicPreloadInterface;
    private static ArrayList<String> preloadBlackList;
    private static ArrayList<String> preloadEnbaleBizs;
    public static final DynamicPreloadMananger INSTANCE = new DynamicPreloadMananger();
    private static final ArrayList<String> alreadyPreloadList = new ArrayList<>();
    private static volatile boolean preloadEnable = true;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("gc");
        preloadEnbaleBizs = arrayList;
        preloadBlackList = new ArrayList<>();
    }

    public static final /* synthetic */ DynamicPreloadInterface access$getDynamicPreloadInterface$p(DynamicPreloadMananger dynamicPreloadMananger) {
        DynamicPreloadInterface dynamicPreloadInterface2 = dynamicPreloadInterface;
        if (dynamicPreloadInterface2 == null) {
            h.a("dynamicPreloadInterface");
        }
        return dynamicPreloadInterface2;
    }

    public final boolean getPreloadEnable() {
        return preloadEnable;
    }

    public final void setPreloadEnable(boolean z) {
        preloadEnable = z;
    }

    public final void init(@NotNull DynamicPreloadInterface dynamicPreloadInterface2) {
        Object[] objArr = {dynamicPreloadInterface2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e3c0c16743d52782bc4d45caf82666b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e3c0c16743d52782bc4d45caf82666b");
            return;
        }
        h.b(dynamicPreloadInterface2, "dynamicPreloadInterface");
        dynamicPreloadInterface = dynamicPreloadInterface2;
    }

    public final void setPreloadBizs(@Nullable ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55a355af232ac4da0709f661ad6ede52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55a355af232ac4da0709f661ad6ede52");
        } else if (arrayList == null) {
        } else {
            synchronized (preloadEnbaleBizs) {
                preloadEnbaleBizs.clear();
                preloadEnbaleBizs.addAll(arrayList);
                ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                shieldLogger.i("DynamicPreloadMananger", "preload bizs: " + arrayList, new Object[0]);
                r rVar = r.a;
            }
        }
    }

    public final void setBlackList(@Nullable ArrayList<String> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7eab92657c41faa3374644d2e12220a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7eab92657c41faa3374644d2e12220a5");
        } else if (arrayList == null) {
        } else {
            synchronized (preloadBlackList) {
                preloadBlackList.clear();
                preloadBlackList.addAll(arrayList);
                ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                shieldLogger.i("DynamicPreloadMananger", "black list: " + arrayList, new Object[0]);
                r rVar = r.a;
            }
        }
    }

    @UiThread
    public final void preload(@NotNull Uri uri, @Nullable String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb5e7c7296a580d67819e861ac88eb89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb5e7c7296a580d67819e861ac88eb89");
            return;
        }
        h.b(uri, Constants.TRAFFIC_URI);
        if (isInit() && preloadEnable) {
            if (str == null || !preloadBlackList.contains(str)) {
                preloadInner(uri);
            }
        }
    }

    @UiThread
    private final void preloadInner(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f5be51d33f1505c093bef035084302c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f5be51d33f1505c093bef035084302c");
            return;
        }
        String host = uri.getHost();
        if (host != null && host.hashCode() == 108393 && host.equals("mrn")) {
            handleMRNUri(uri);
        }
    }

    @UiThread
    private final void handleMRNUri(Uri uri) {
        String queryParameter;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "86fd4e62137370eb7f8c5964d8077e75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "86fd4e62137370eb7f8c5964d8077e75");
            return;
        }
        String queryParameter2 = uri.getQueryParameter(MRN_ENTRY_NAME_KEY);
        if (queryParameter2 == null || (queryParameter = uri.getQueryParameter(MRN_BIZ_NAME_KEY)) == null) {
            return;
        }
        final String jSBundleName = getJSBundleName(queryParameter, queryParameter2);
        if (!alreadyPreloadList.contains(jSBundleName) && preloadEnbaleBizs.contains(queryParameter)) {
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.dianping.shield.dynamic.preload.DynamicPreloadMananger$handleMRNUri$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    ArrayList arrayList;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e07e49e0abf601b6bbfd3bd546b15244", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e07e49e0abf601b6bbfd3bd546b15244")).booleanValue();
                    }
                    DynamicPreloadMananger dynamicPreloadMananger = DynamicPreloadMananger.INSTANCE;
                    arrayList = DynamicPreloadMananger.alreadyPreloadList;
                    arrayList.add(jSBundleName);
                    DynamicPreloadMananger.access$getDynamicPreloadInterface$p(DynamicPreloadMananger.INSTANCE).preloadMRN(jSBundleName);
                    return false;
                }
            });
        }
    }

    private final boolean isInit() {
        return dynamicPreloadInterface != null;
    }

    private final String getJSBundleName(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "549ec08785323deb6cb2e64b71d2c128", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "549ec08785323deb6cb2e64b71d2c128");
        }
        w wVar = w.a;
        Locale locale = Locale.ENGLISH;
        h.a((Object) locale, "Locale.ENGLISH");
        String format = String.format(locale, "%s_%s_%s", Arrays.copyOf(new Object[]{MRN_PREFIX, str, str2}, 3));
        h.a((Object) format, "java.lang.String.format(locale, format, *args)");
        return format;
    }
}

package com.meituan.android.common.metricx;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.babel.Babel;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PreloadInjection {
    private static final String BEGIN_TAG = "-B";
    private static final String END_TAG = "-E";
    private static final long ONE_MINUTE = 60000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static Map<String, Object> sInjectTags = new ConcurrentHashMap();
    private static Map<String, PvWhenPreloadCollector> pvWhenPreloadCollectorMap = new ConcurrentHashMap();

    /* compiled from: ProGuard */
    @Deprecated
    /* loaded from: classes2.dex */
    public interface iInjectListener {
        void onStart(String str, String str2);

        void onStop(String str, String str2);
    }

    @Deprecated
    public static void setInjectListener(iInjectListener iinjectlistener) {
    }

    public static void notifyPreloadWillStart(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "77b9015e0c90403ff67b8405fcce8d61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "77b9015e0c90403ff67b8405fcce8d61");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            startInjectToMetrics(str, str2);
        }
    }

    public static void notifyPreloadStarted(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9965282fb8b7e9e38f0ff608171d8de0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9965282fb8b7e9e38f0ff608171d8de0");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            startInjectToMetrics(str + BEGIN_TAG, Long.valueOf(TimeUtil.currentTimeMillisSNTP()));
            if (pvWhenPreloadCollectorMap.containsKey(str)) {
                return;
            }
            PvWhenPreloadCollector pvWhenPreloadCollector = new PvWhenPreloadCollector(str);
            AppBus.getInstance().register(pvWhenPreloadCollector);
            pvWhenPreloadCollectorMap.put(str, pvWhenPreloadCollector);
        }
    }

    public static void notifyPreloadEnd(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9fa3efb6572f956d8dd6fa5df69e2a74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9fa3efb6572f956d8dd6fa5df69e2a74");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            stopInjectToMetrics(str + END_TAG, Long.valueOf(TimeUtil.currentTimeMillisSNTP()));
            PvWhenPreloadCollector pvWhenPreloadCollector = pvWhenPreloadCollectorMap.get(str);
            if (pvWhenPreloadCollector != null) {
                AppBus.getInstance().unregister(pvWhenPreloadCollector);
                pvWhenPreloadCollector.reportPvData();
                pvWhenPreloadCollectorMap.remove(str);
            }
        }
    }

    private static void startInjectToMetrics(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d1ac186994b06809685c30ac0a7e41db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d1ac186994b06809685c30ac0a7e41db");
        } else {
            sInjectTags.put(str, obj);
        }
    }

    private static void stopInjectToMetrics(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3e9ae329158a4b87304a639218494834", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3e9ae329158a4b87304a639218494834");
        } else {
            sInjectTags.put(str, obj);
        }
    }

    public static void appendTags(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "48deb1e0f7903c51b10b452303baed4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "48deb1e0f7903c51b10b452303baed4c");
        } else if (map != null && !sInjectTags.isEmpty()) {
            long currentTimeMillisSNTP = TimeUtil.currentTimeMillisSNTP();
            for (Map.Entry<String, Object> entry : sInjectTags.entrySet()) {
                if (!tryRemoveExpiredTags(entry.getKey(), entry.getValue(), currentTimeMillisSNTP)) {
                    map.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public static void appendTags(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8cd02de515ffced68ef9f8a00a4e2ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8cd02de515ffced68ef9f8a00a4e2ea");
        } else if (jSONObject != null && !sInjectTags.isEmpty()) {
            long currentTimeMillisSNTP = TimeUtil.currentTimeMillisSNTP();
            for (Map.Entry<String, Object> entry : sInjectTags.entrySet()) {
                try {
                    if (!tryRemoveExpiredTags(entry.getKey(), entry.getValue(), currentTimeMillisSNTP)) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static boolean tryRemoveExpiredTags(String str, Object obj, long j) {
        Object[] objArr = {str, obj, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "592db1d608c38103ddcb6759eb346a9d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "592db1d608c38103ddcb6759eb346a9d")).booleanValue();
        }
        if (!(obj instanceof Long) || str == null || !str.endsWith(END_TAG) || j - ((Long) obj).longValue() <= 60000) {
            return false;
        }
        sInjectTags.remove(str);
        sInjectTags.remove(str.replace(END_TAG, BEGIN_TAG));
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class PvWhenPreloadCollector implements Application.ActivityLifecycleCallbacks {
        public static final String REPORT_TAG = "preload_pv";
        public static ChangeQuickRedirect changeQuickRedirect;
        public String preloadSource;
        public int pvSum;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }

        public PvWhenPreloadCollector(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a792abfe75748a67cb17299999a67a8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a792abfe75748a67cb17299999a67a8");
                return;
            }
            this.pvSum = 0;
            this.preloadSource = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void reportPvData() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a39bfa834da300eb2840b2f7fbadcda", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a39bfa834da300eb2840b2f7fbadcda");
            } else if (this.pvSum > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("source", this.preloadSource);
                Babel.logRT(new Log.Builder("").value(this.pvSum).tag(REPORT_TAG).reportChannel("m0").lv4LocalStatus(true).optional(hashMap).build());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            Object[] objArr = {activity, bundle};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4795bc729e4825d80049565762e52fc0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4795bc729e4825d80049565762e52fc0");
            } else {
                this.pvSum++;
            }
        }
    }
}

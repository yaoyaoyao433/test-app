package com.meituan.android.common.statistics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.gesture.GestureManager;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.common.statistics.ipc.independent.ProcessController;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.common.utils.ProcessUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LxActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
    public static final String KEY_CUSTOM = "custom";
    private static final String KEY_MT_A_URL = "mt_aurl";
    private static final String KEY_PAGE_CREATE_FIRST_PV = "page_create_first_pv";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb48b74f82a73b88155225b56e8c96b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb48b74f82a73b88155225b56e8c96b1");
            return;
        }
        LogUtil.log("onActivityCreated," + activity.getClass().getName());
        Statistics.onCreate(activity, bundle);
        Intent intent = activity.getIntent();
        if (intent != null) {
            intent.putExtra("page_create_first_pv", true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ea285fbccf1c61185942338220d2b94", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ea285fbccf1c61185942338220d2b94");
            return;
        }
        LogUtil.log("onActivityStarted," + activity.getClass().getName());
        Statistics.startEvent(activity);
        if (ConfigManager.getInstance(activity.getApplicationContext()).isCollectGestureOn() || GestureManager.getInstance().isCustomCollectGestureOn()) {
            GestureManager.getInstance().registerWindowCall(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f33500d4db0fed0780162072d26bdd48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f33500d4db0fed0780162072d26bdd48");
            return;
        }
        StringBuilder sb = new StringBuilder("onActivityResumed,");
        sb.append(activity.getClass().getName());
        sb.append(" uri:");
        sb.append((activity.getIntent() == null || activity.getIntent().getData() == null) ? "" : activity.getIntent().getData().toString());
        LogUtil.log(sb.toString());
        if (activity != null) {
            String generatePageInfoKey = AppUtil.generatePageInfoKey(activity);
            Map<String, Object> parseVal_lab = parseVal_lab(activity);
            Context context = Statistics.getContext() != null ? Statistics.getContext() : activity.getApplicationContext();
            if (ConfigManager.getInstance(context).supportMultiProcess() && !ProcessUtils.isMainProcess(activity.getApplicationContext())) {
                HashMap hashMap = new HashMap();
                hashMap.put("activityName", activity.getClass().getName());
                hashMap.put("pageInfoKey", generatePageInfoKey);
                hashMap.put("vallab", parseVal_lab);
                ProcessController.getInstance().selectMethod(context, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_RESUME, hashMap);
                return;
            }
            StatisticsDelegate.getInstance().handleActivityResume(generatePageInfoKey, activity.getClass().getName(), parseVal_lab, ProcessUtils.getCurrentProcessName(Statistics.getContext()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f87ad36579f64a7d0ed3a82e0a13135e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f87ad36579f64a7d0ed3a82e0a13135e");
            return;
        }
        LogUtil.log("onActivityPaused," + activity.getClass().getName());
        if (activity != null) {
            String generatePageInfoKey = AppUtil.generatePageInfoKey(activity);
            if (ConfigManager.getInstance(activity.getApplicationContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(activity.getApplicationContext())) {
                HashMap hashMap = new HashMap();
                hashMap.put("activityName", activity.getClass().getName());
                hashMap.put("pageInfoKey", generatePageInfoKey);
                ProcessController.getInstance().selectMethod(activity, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_PAUSE, hashMap);
                return;
            }
            StatisticsDelegate.getInstance().handleActivityPause(generatePageInfoKey, activity.getClass().getName(), ProcessUtils.getCurrentProcessName(Statistics.getContext()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9da8cc04c499291c33ba1ff58fdcc39", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9da8cc04c499291c33ba1ff58fdcc39");
            return;
        }
        LogUtil.log("onActivityStopped," + activity.getClass().getName());
        Statistics.quitEvent(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbb2bdae2d547179cbe2c77f2a2a05ae", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbb2bdae2d547179cbe2c77f2a2a05ae");
            return;
        }
        LogUtil.log("onActivitySaveInstanceState," + activity.getClass().getName());
        Statistics.onSaveInstanceState(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff0cf0efd5002a9f4a1f747e8e1ad10e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff0cf0efd5002a9f4a1f747e8e1ad10e");
            return;
        }
        LogUtil.log("onActivityDestroyed," + activity.getClass().getName());
        if (activity != null) {
            String generatePageInfoKey = AppUtil.generatePageInfoKey(activity);
            if (ConfigManager.getInstance(activity.getApplicationContext()).supportMultiProcess() && !ProcessUtils.isMainProcess(activity.getApplicationContext())) {
                HashMap hashMap = new HashMap();
                hashMap.put("activityName", activity.getClass().getName());
                hashMap.put("pageInfoKey", generatePageInfoKey);
                ProcessController.getInstance().selectMethod(activity, RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, hashMap);
                return;
            }
            StatisticsDelegate.getInstance().handleActivityDestroyed(generatePageInfoKey, activity.getClass().getName(), null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(2:2|3)|(2:5|6)|7|(5:11|12|13|(6:15|(1:17)(1:37)|(1:36)(1:21)|22|(1:35)(2:24|(2:26|27)(2:29|(2:31|32)(2:33|34)))|28)|39)|(3:106|107|(4:110|(3:115|116|(3:128|129|130)(3:118|119|(3:125|126|127)(3:121|122|123)))|124|108))|42|43|(1:45)|46|(1:48)|49|(3:53|(1:55)|56)|57|(1:59)|60|(4:62|63|(2:65|(1:67)(2:70|(1:72)))(1:73)|68)|75|76|(3:78|(2:80|(3:82|(1:84)(1:88)|85)(2:89|(3:91|(1:93)(1:95)|94)))(3:96|(1:98)(1:100)|99)|86)|101|(1:(0))) */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e A[Catch: Throwable -> 0x009f, TryCatch #3 {Throwable -> 0x009f, blocks: (B:13:0x003a, B:15:0x003e, B:17:0x0048, B:20:0x0056, B:22:0x005e, B:24:0x006b, B:26:0x0071, B:28:0x0077, B:29:0x007b, B:31:0x0083, B:32:0x008f), top: B:116:0x003a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fd A[Catch: Throwable -> 0x014a, TryCatch #1 {Throwable -> 0x014a, blocks: (B:51:0x00f2, B:53:0x00fd, B:54:0x0100, B:56:0x0109, B:57:0x010c, B:59:0x011d, B:61:0x0123, B:63:0x0129, B:64:0x012c, B:65:0x012f, B:67:0x0135, B:68:0x0142), top: B:112:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0109 A[Catch: Throwable -> 0x014a, TryCatch #1 {Throwable -> 0x014a, blocks: (B:51:0x00f2, B:53:0x00fd, B:54:0x0100, B:56:0x0109, B:57:0x010c, B:59:0x011d, B:61:0x0123, B:63:0x0129, B:64:0x012c, B:65:0x012f, B:67:0x0135, B:68:0x0142), top: B:112:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0129 A[Catch: Throwable -> 0x014a, TryCatch #1 {Throwable -> 0x014a, blocks: (B:51:0x00f2, B:53:0x00fd, B:54:0x0100, B:56:0x0109, B:57:0x010c, B:59:0x011d, B:61:0x0123, B:63:0x0129, B:64:0x012c, B:65:0x012f, B:67:0x0135, B:68:0x0142), top: B:112:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0135 A[Catch: Throwable -> 0x014a, TryCatch #1 {Throwable -> 0x014a, blocks: (B:51:0x00f2, B:53:0x00fd, B:54:0x0100, B:56:0x0109, B:57:0x010c, B:59:0x011d, B:61:0x0123, B:63:0x0129, B:64:0x012c, B:65:0x012f, B:67:0x0135, B:68:0x0142), top: B:112:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0196 A[Catch: Exception -> 0x01fe, TryCatch #2 {Exception -> 0x01fe, blocks: (B:79:0x0190, B:81:0x0196, B:83:0x019e, B:85:0x01a8, B:89:0x01bb, B:102:0x01f8, B:90:0x01bf, B:92:0x01c3, B:96:0x01d6, B:97:0x01da, B:101:0x01f0), top: B:114:0x0190 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, java.lang.Object> parseVal_lab(android.app.Activity r15) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.LxActivityLifecycleCallbacks.parseVal_lab(android.app.Activity):java.util.Map");
    }

    private boolean isValLabKey(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a327a6df19b9d1be1fab2dfae2f58e1", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a327a6df19b9d1be1fab2dfae2f58e1")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.equalsIgnoreCase("abtest") || str.equalsIgnoreCase("order_id") || str.equalsIgnoreCase("cat_id") || str.equalsIgnoreCase("poi_id") || str.equalsIgnoreCase("deal_id") || str.equalsIgnoreCase("movie_id") || str.equalsIgnoreCase("goods_id") || str.equalsIgnoreCase("maiton_id") || str.equalsIgnoreCase("coupon_id") || str.equalsIgnoreCase("region_id") || str.equalsIgnoreCase("stid") || str.equalsIgnoreCase("ctpoi") || str.equalsIgnoreCase("traceid") || str.equalsIgnoreCase("keyword") || str.equalsIgnoreCase(DataConstants.ACTIVITYID) || str.equalsIgnoreCase("cinemaid") || str.equalsIgnoreCase("sortid") || str.equalsIgnoreCase("selectid") || str.equalsIgnoreCase("query_id") || str.equalsIgnoreCase("index") || str.equalsIgnoreCase("ad_id") || str.equalsIgnoreCase("title") || str.equalsIgnoreCase("biz_id") || str.equalsIgnoreCase("sku_id") || str.equalsIgnoreCase("search_id") || str.equalsIgnoreCase(DataConstants.SHOPUUID);
    }

    public static Map<String, Object> getCustomMap(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f6c8157eddfe4d9293ebea07e0707c6", 6917529027641081856L)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f6c8157eddfe4d9293ebea07e0707c6");
        }
        if (map != null && map.containsKey("custom")) {
            Object obj = map.get("custom");
            map.remove("custom");
            if (obj instanceof Map) {
                return (Map) obj;
            }
            if (obj instanceof JSONObject) {
                return JsonUtil.jsonObjectToMap((JSONObject) obj);
            }
        }
        return null;
    }
}

package com.meizu.cloud.pushsdk.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Handler;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.PushManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.d.c.b;
import com.meizu.cloud.pushsdk.d.f.e;
import com.meizu.cloud.pushsdk.handler.a.c.d;
import com.meizu.cloud.pushsdk.notification.MPushMessage;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.sankuai.waimai.platform.utils.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: classes3.dex */
public final class d {
    private static int a(Context context) {
        if (MzSystemUtils.isMeizu(context)) {
            return 1;
        }
        if (MzSystemUtils.isXiaoMi()) {
            return 2;
        }
        return MzSystemUtils.isHuaWei() ? 3 : 0;
    }

    private static Intent a(Context context, Map<String, String> map) {
        String str;
        String str2;
        String str3;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(PushConstants.MZ_PUSH_TRACKER_SERVICE_ACTION), 0);
        if (queryIntentServices != null) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str2 = null;
                    str3 = null;
                    break;
                }
                ResolveInfo next = it.next();
                if (PushConstants.PUSH_PACKAGE_NAME.equals(next.serviceInfo.packageName)) {
                    str2 = next.serviceInfo.packageName;
                    str3 = next.serviceInfo.name;
                    break;
                }
            }
            if (!TextUtils.isEmpty(str3) || queryIntentServices.size() <= 0) {
                str = str3;
            } else {
                str2 = queryIntentServices.get(0).serviceInfo.packageName;
                str = queryIntentServices.get(0).serviceInfo.name;
            }
        } else {
            str = null;
            str2 = null;
        }
        DebugLogger.i("UxIPUtils", "current process packageName " + str2);
        if (!TextUtils.isEmpty(str)) {
            try {
                String jSONObject = e.a((Map) map).toString();
                Intent intent = new Intent();
                intent.setPackage(str2);
                intent.setAction(PushConstants.MZ_PUSH_TRACKER_SERVICE_ACTION);
                intent.putExtra(PushConstants.EXTRA_PUSH_TRACKER_JSON_DATA, jSONObject);
                return intent;
            } catch (Exception e) {
                e.printStackTrace();
                DebugLogger.e("UxIPUtils", "getRemotePushTrackerIntent error " + e.getMessage());
            }
        }
        return null;
    }

    private static String a(Intent intent) {
        String a = f.a(intent, PushConstants.EXTRA_APP_PUSH_TASK_ID);
        if (TextUtils.isEmpty(a)) {
            try {
                MPushMessage mPushMessage = (MPushMessage) f.c(intent, PushConstants.MZ_PUSH_PRIVATE_MESSAGE);
                return mPushMessage != null ? mPushMessage.getTaskId() : a;
            } catch (Exception e) {
                DebugLogger.e("UxIPUtils", "parse MessageV2 error " + e.getMessage());
                return "no push platform task";
            }
        }
        return a;
    }

    public static void a(Context context, Intent intent, String str, int i) {
        a(context, intent, PushManager.TAG, str, i);
    }

    private static void a(Context context, Intent intent, String str, String str2, int i) {
        if (TextUtils.isEmpty(a(intent))) {
            return;
        }
        a(context, context.getPackageName(), f.a(intent, PushConstants.MZ_PUSH_MESSAGE_STATISTICS_IMEI_KEY), a(intent), str, str2, i);
    }

    public static void a(Context context, String str, int i, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        a(context, context.getPackageName(), str3, str2, PushManager.TAG, str, i);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5) {
        a(context, true, str, str2, str3, str4, "dpm", str5);
    }

    private static void a(Context context, String str, String str2, String str3, String str4, String str5, int i) {
        HashMap hashMap = new HashMap(8);
        hashMap.put(ResponseWithInnerData.TASK_ID, str3);
        hashMap.put("deviceId", str2);
        hashMap.put(DeviceInfo.TM, String.valueOf(System.currentTimeMillis() / 1000));
        hashMap.put("package_name", str);
        hashMap.put("pushsdk_version", str4);
        hashMap.put("push_info", str5);
        hashMap.put("push_info_type", String.valueOf(i));
        a(context, false, "notification_service_message", (Map<String, String>) hashMap);
    }

    public static void a(Context context, String str, String str2, String str3, String str4, String str5, long j) {
        a(context, true, str, str2, str3, str4, "spm", str5, j);
    }

    public static void a(Context context, boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        a(context, z, str, str2, str3, str4, str5, str6, 0L);
    }

    public static void a(Context context, boolean z, String str, String str2, String str3, String str4, String str5, String str6, long j) {
        HashMap hashMap = new HashMap(8);
        hashMap.put("en", str5);
        hashMap.put("ti", str3);
        hashMap.put(AppIconSetting.DEFAULT_LARGE_ICON, str2);
        if (TextUtils.isEmpty(str6)) {
            str6 = String.valueOf(System.currentTimeMillis() / 1000);
        }
        hashMap.put("ts", str6);
        hashMap.put("pn", str);
        hashMap.put("pv", PushManager.TAG);
        hashMap.put("nm", String.valueOf(System.currentTimeMillis() / 1000));
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("si", str4);
        }
        if (a(context, hashMap, z, j)) {
            return;
        }
        a(context, z, str5, hashMap);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [com.meizu.cloud.pushsdk.d.c.b$a] */
    public static void a(Context context, boolean z, String str, Map<String, String> map) {
        DebugLogger.e("UxIPUtils", "onLogEvent eventName [" + str + "] properties = " + map);
        if ("notification_service_message".equals(str)) {
            return;
        }
        com.meizu.cloud.pushsdk.d.a.a(context, (com.meizu.cloud.pushsdk.c.c.a) null, (com.meizu.cloud.pushsdk.d.b.f) null).a(((b.a) com.meizu.cloud.pushsdk.d.c.b.a().a(str).a(a(context)).a(Long.valueOf(map.get("ts")).longValue())).h(map.get("nm") != null ? map.get("nm") : String.valueOf(System.currentTimeMillis() / 1000)).c(map.get(AppIconSetting.DEFAULT_LARGE_ICON)).e(map.get("pn")).d(map.get("pv")).b(map.get("ti")).f(TextUtils.isEmpty(map.get("si")) ? "" : map.get("si")).g(String.valueOf(b.h(context, map.get("pn")))).b(), z);
    }

    private static boolean a(final Context context, final Intent intent, final boolean z, final Map<String, String> map, final long j) {
        if (intent == null) {
            DebugLogger.e("UxIPUtils", "startRemotePushTracker error intent is null");
            return false;
        } else if (j != 0) {
            new Handler(context.getMainLooper()).postDelayed(new Runnable() { // from class: com.meizu.cloud.pushsdk.util.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        context.startService(intent);
                        DebugLogger.i("UxIPUtils", "delayed " + j + " ms start tracker data in mz_tracker process " + f.a(intent, PushConstants.EXTRA_PUSH_TRACKER_JSON_DATA));
                    } catch (Exception e) {
                        e.printStackTrace();
                        DebugLogger.e("UxIPUtils", "delayed startRemotePushTracker error " + e.getMessage());
                        d.a(context, z, (String) map.get("en"), map);
                    }
                }
            }, j);
            return true;
        } else {
            try {
                context.startService(intent);
                DebugLogger.i("UxIPUtils", "immediately start tracker data in mz_tracker process " + f.a(intent, PushConstants.EXTRA_PUSH_TRACKER_JSON_DATA));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                DebugLogger.e("UxIPUtils", "startRemotePushTracker error " + e.getMessage());
                return false;
            }
        }
    }

    private static boolean a(Context context, Map<String, String> map, boolean z, long j) {
        return a(context, a(context, map), z, map, j);
    }

    public static void b(Context context, String str, String str2, String str3, String str4, String str5) {
        a(context, false, str, str2, str3, str4, "rpe", str5);
    }

    public static void b(Context context, String str, String str2, String str3, String str4, String str5, long j) {
        a(context, false, str, str2, str3, str4, "rpe", str5, j);
    }

    public static void c(Context context, String str, String str2, String str3, String str4, String str5) {
        a(context, true, str, str2, str3, str4, "rpe", str5);
    }

    public static com.meizu.cloud.pushsdk.handler.a.c.d a(String str) {
        String str2;
        String str3;
        com.meizu.cloud.pushsdk.handler.a.c.d dVar = new com.meizu.cloud.pushsdk.handler.a.c.d();
        if (TextUtils.isEmpty(str)) {
            str2 = "UxIPUtils";
            str3 = "the platformExtra is empty";
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.has(PushConstants.TASK_ID) ? jSONObject.getString(PushConstants.TASK_ID) : null;
                String string2 = jSONObject.has("seq_id") ? jSONObject.getString("seq_id") : null;
                String string3 = jSONObject.has("push_timestamp") ? jSONObject.getString("push_timestamp") : null;
                String string4 = jSONObject.has("device_id") ? jSONObject.getString("device_id") : null;
                d.a aVar = new d.a();
                aVar.a = string;
                aVar.d = string4;
                aVar.c = string3;
                aVar.b = string2;
                return aVar.a();
            } catch (Exception unused) {
                str2 = "UxIPUtils";
                str3 = "the platformExtra parse error";
            }
        }
        DebugLogger.e(str2, str3);
        return dVar;
    }
}

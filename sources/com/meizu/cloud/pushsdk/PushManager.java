package com.meizu.cloud.pushsdk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
/* loaded from: classes3.dex */
public class PushManager {
    private static final String KEY_PUSH_ID = "pushId";
    private static final String PUSH_ID_PREFERENCE_NAME = "com.meizu.flyme.push";
    private static final int PUSH_SUPPORT_CHECK_NOTIFICATION_MSG_VERSION_START = 6;
    public static final String TAG = "4.0.2-SNAPSHOT";

    public static void checkNotificationMessage(Context context) {
        String appVersionName = MzSystemUtils.getAppVersionName(context, PushConstants.PUSH_PACKAGE_NAME);
        DebugLogger.i(TAG, context.getPackageName() + " checkNotificationMessage cloudVersion_name " + appVersionName);
        if (TextUtils.isEmpty(appVersionName) || Integer.parseInt(appVersionName.substring(0, 1)) < 6) {
            return;
        }
        Intent intent = new Intent(PushConstants.MZ_PUSH_ON_GET_NOTIFICATION_MESSAGE);
        intent.putExtra(PushConstants.EXTRA_GET_NOTIFICATION_PACKAGE_NAME, context.getPackageName());
        intent.setClassName(PushConstants.PUSH_PACKAGE_NAME, PushConstants.MZ_PUSH_SERVICE_NAME);
        try {
            context.startService(intent);
        } catch (Exception e) {
            DebugLogger.e(TAG, "start check notification message service error " + e.getMessage());
        }
    }

    public static void clearNotification(Context context, int... iArr) {
        com.meizu.cloud.pushsdk.platform.a.b.a(context).a(context.getPackageName(), iArr);
    }

    public static String getPushId(Context context) {
        int b = com.meizu.cloud.pushsdk.util.b.b(context, context.getPackageName());
        if (b == 0 || System.currentTimeMillis() / 1000 <= b) {
            return com.meizu.cloud.pushsdk.util.b.a(context, context.getPackageName());
        }
        return null;
    }

    @Deprecated
    public static void register(Context context) {
        String packageName;
        DebugLogger.init(context);
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke register on meizu device Build-in FlymeOS");
            return;
        }
        String appVersionName = MzSystemUtils.getAppVersionName(context, PushConstants.PUSH_PACKAGE_NAME);
        DebugLogger.i(TAG, context.getPackageName() + " start register cloudVersion_name " + appVersionName);
        Intent intent = new Intent(PushConstants.MZ_PUSH_ON_START_PUSH_REGISTER);
        try {
            if (!PushConstants.PUSH_PACKAGE_NAME.equals(MzSystemUtils.getMzPushServicePackageName(context))) {
                if (!TextUtils.isEmpty(appVersionName) && MzSystemUtils.compareVersion(appVersionName, PushConstants.PUSH_FLYME_4_CHANGE_VERSION)) {
                    DebugLogger.e(TAG, "flyme 4.x start register cloud versionName " + appVersionName);
                } else if (TextUtils.isEmpty(appVersionName) || !appVersionName.startsWith("3")) {
                    DebugLogger.e(TAG, context.getPackageName() + " start register ");
                    packageName = context.getPackageName();
                } else {
                    DebugLogger.e(TAG, "flyme 3.x start register cloud versionName " + appVersionName);
                    intent.setAction(PushConstants.REQUEST_REGISTER_INTENT);
                }
                intent.setPackage(PushConstants.PUSH_PACKAGE_NAME);
                intent.putExtra("sender", context.getPackageName());
                context.startService(intent);
                return;
            }
            packageName = PushConstants.PUSH_PACKAGE_NAME;
            context.startService(intent);
            return;
        } catch (Exception e) {
            DebugLogger.e(TAG, "start register service error " + e.getMessage());
            return;
        }
        intent.setClassName(packageName, PushConstants.MZ_PUSH_SERVICE_NAME);
        intent.putExtra("sender", context.getPackageName());
    }

    @Deprecated
    public static void unRegister(Context context) {
        String packageName;
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke unRegister on meizu device Build-in FlymeOS");
            return;
        }
        String appVersionName = MzSystemUtils.getAppVersionName(context, PushConstants.PUSH_PACKAGE_NAME);
        DebugLogger.e(TAG, context.getPackageName() + " start unRegister cloud versionName " + appVersionName);
        Intent intent = new Intent(PushConstants.MZ_PUSH_ON_STOP_PUSH_REGISTER);
        try {
            if (!PushConstants.PUSH_PACKAGE_NAME.equals(MzSystemUtils.getMzPushServicePackageName(context))) {
                if (TextUtils.isEmpty(appVersionName) || !MzSystemUtils.compareVersion(appVersionName, PushConstants.PUSH_FLYME_4_CHANGE_VERSION)) {
                    if (TextUtils.isEmpty(appVersionName) || !appVersionName.startsWith("3")) {
                        DebugLogger.e(TAG, context.getPackageName() + " start unRegister ");
                        packageName = context.getPackageName();
                    } else {
                        intent.setAction(PushConstants.REQUEST_UNREGISTER_INTENT);
                    }
                }
                intent.setPackage(PushConstants.PUSH_PACKAGE_NAME);
                intent.putExtra("sender", context.getPackageName());
                context.startService(intent);
                return;
            }
            packageName = PushConstants.PUSH_PACKAGE_NAME;
            context.startService(intent);
            return;
        } catch (Exception e) {
            DebugLogger.e(TAG, "start unRegister service error " + e.getMessage());
            return;
        }
        intent.setClassName(packageName, PushConstants.MZ_PUSH_SERVICE_NAME);
        intent.putExtra("sender", context.getPackageName());
    }

    public static void checkPush(Context context, String str, String str2, String str3) {
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke checkPush on meizu device Build-in FlymeOS");
            return;
        }
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        a.e.a(str);
        a.e.b(str2);
        a.e.c(packageName);
        a.e.a = str3;
        a.e.b = 2;
        a.e.h();
    }

    public static void switchPush(Context context, String str, String str2, String str3, int i, boolean z) {
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke switchPush on meizu device Build-in FlymeOS");
            return;
        }
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        a.e.a(str);
        a.e.b(str2);
        a.e.c(packageName);
        a.e.a = str3;
        a.e.b = i;
        a.e.c = z;
        a.e.h();
    }

    public static void switchPush(Context context, String str, String str2, String str3, boolean z) {
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke switchPush on meizu device Build-in FlymeOS");
            return;
        }
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        a.e.a(str);
        a.e.b(str2);
        a.e.c(packageName);
        a.e.a = str3;
        a.e.b = 3;
        a.e.c = z;
        a.e.h();
    }

    public static void register(Context context, String str, String str2) {
        DebugLogger.init(context);
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke register on meizu device Build-in FlymeOS");
            return;
        }
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        a.c.a(str);
        a.c.b(str2);
        a.c.c(packageName);
        a.c.h();
    }

    public static void unRegister(Context context, String str, String str2) {
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke unRegister on meizu device Build-in FlymeOS");
            return;
        }
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        a.d.a(str);
        a.d.b(str2);
        a.d.c(packageName);
        a.d.h();
    }

    public static void subScribeTags(Context context, String str, String str2, String str3, String str4) {
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke subScribeTags on meizu device Build-in FlymeOS");
            return;
        }
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        a.f.a(str);
        a.f.b(str2);
        a.f.c(packageName);
        a.f.a = str3;
        a.f.b = 0;
        a.f.c = str4;
        a.f.h();
    }

    public static void unSubScribeTags(Context context, String str, String str2, String str3, String str4) {
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke unSubScribeTags on meizu device Build-in FlymeOS");
            return;
        }
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        a.f.a(str);
        a.f.b(str2);
        a.f.c(packageName);
        a.f.a = str3;
        a.f.b = 1;
        a.f.c = str4;
        a.f.h();
    }

    public static void unSubScribeAllTags(Context context, String str, String str2, String str3) {
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke unSubScribeAllTags on meizu device Build-in FlymeOS");
            return;
        }
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        a.f.a(str);
        a.f.b(str2);
        a.f.c(packageName);
        a.f.a = str3;
        a.f.b = 2;
        a.f.h();
    }

    public static void checkSubScribeTags(Context context, String str, String str2, String str3) {
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke checkSubScribeTags on meizu device Build-in FlymeOS");
            return;
        }
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        a.f.a(str);
        a.f.b(str2);
        a.f.c(packageName);
        a.f.a = str3;
        a.f.b = 3;
        a.f.h();
    }

    public static void subScribeAlias(Context context, String str, String str2, String str3, String str4) {
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke subScribeAlias on meizu device Build-in FlymeOS");
            return;
        }
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        a.g.a(str);
        a.g.b(str2);
        a.g.c(packageName);
        a.g.a = str3;
        a.g.b = 0;
        a.g.c = str4;
        a.g.h();
    }

    public static void unSubScribeAlias(Context context, String str, String str2, String str3, String str4) {
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke unSubScribeAlias on meizu device Build-in FlymeOS");
            return;
        }
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        a.g.a(str);
        a.g.b(str2);
        a.g.c(packageName);
        a.g.a = str3;
        a.g.b = 1;
        a.g.c = str4;
        a.g.h();
    }

    public static void checkSubScribeAlias(Context context, String str, String str2, String str3) {
        if (!MzSystemUtils.isBrandMeizu(context)) {
            DebugLogger.e(TAG, "please invoke checkSubScribeAlias on meizu device Build-in FlymeOS");
            return;
        }
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        a.g.a(str);
        a.g.b(str2);
        a.g.c(packageName);
        a.g.a = str3;
        a.g.b = 2;
        a.g.h();
    }

    public static void enableCacheRequest(Context context, boolean z) {
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        a.c.a(z);
        a.d.a(z);
        a.e.a(z);
        a.g.a(z);
        a.f.a(z);
    }

    public static void clearNotification(Context context) {
        com.meizu.cloud.pushsdk.platform.a.b a = com.meizu.cloud.pushsdk.platform.a.b.a(context);
        String packageName = context.getPackageName();
        com.meizu.cloud.pushsdk.platform.b.a aVar = new com.meizu.cloud.pushsdk.platform.b.a(a.b, a.a, a.h);
        aVar.b = 0;
        aVar.c(packageName);
        aVar.h();
    }
}

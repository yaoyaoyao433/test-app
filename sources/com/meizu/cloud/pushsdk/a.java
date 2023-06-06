package com.meizu.cloud.pushsdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import java.util.List;
/* loaded from: classes3.dex */
public final class a {
    public static void a(Context context) {
        String str;
        if (context.getPackageName().equalsIgnoreCase(MzSystemUtils.isWatch() ? PushConstants.WEARABLE_PUSH_PACKAGE_NAME : PushConstants.PUSH_PACKAGE_NAME)) {
            return;
        }
        String str2 = MzSystemUtils.isWatch() ? PushConstants.WEARABLE_PUSH_PACKAGE_NAME : PushConstants.PUSH_PACKAGE_NAME;
        String appVersionName = MzSystemUtils.getAppVersionName(context, str2);
        DebugLogger.i("PullUpPush", context.getPackageName() + " start register cloudVersion_name " + appVersionName);
        Intent intent = new Intent();
        if (str2.equals(MzSystemUtils.getMzPushServicePackageName(context))) {
            DebugLogger.e("PullUpPush", "cloud pushService start");
            intent.setAction(PushConstants.PUSH_SERVICE_ACTION);
            intent.setClassName(str2, PushConstants.MZ_PUSH_SERVICE_NAME);
        } else {
            if (!TextUtils.isEmpty(appVersionName) && MzSystemUtils.compareVersion(appVersionName, PushConstants.PUSH_FLYME_4_CHANGE_VERSION)) {
                DebugLogger.e("PullUpPush", "flyme 4.x start register cloud versionName " + appVersionName);
                intent.setPackage(str2);
                str = PushConstants.MZ_PUSH_ON_START_PUSH_REGISTER;
            } else if (TextUtils.isEmpty(appVersionName) || !appVersionName.startsWith("3")) {
                DebugLogger.e("PullUpPush", context.getPackageName() + " start register ");
                intent.setClassName(context.getPackageName(), PushConstants.MZ_PUSH_SERVICE_NAME);
                str = PushConstants.PUSH_SERVICE_ACTION;
            } else {
                DebugLogger.e("PullUpPush", "flyme 3.x start register cloud versionName " + appVersionName);
                intent.setAction(PushConstants.REQUEST_REGISTER_INTENT);
                intent.setPackage(str2);
            }
            intent.setAction(str);
        }
        try {
            context.startService(intent);
        } catch (Exception e) {
            DebugLogger.e("PullUpPush", "start service error " + e.getMessage());
        }
        if (Build.VERSION.SDK_INT <= 22) {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(PushConstants.MZ_PUSH_TRACKER_SERVICE_ACTION), 0);
            if (queryIntentServices == null || queryIntentServices.size() == 0) {
                com.meizu.cloud.pushsdk.d.a.a(context, false).a();
            }
        }
    }
}

package com.huawei.hms.framework.common;

import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ActivityUtil {
    private static final String TAG = "ActivityUtil";

    public static boolean isForeground(Context context) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> list;
        if (context == null || (activityManager = (ActivityManager) ContextCompat.getSystemService(context, PushConstants.INTENT_ACTIVITY_NAME)) == null) {
            return false;
        }
        try {
            list = activityManager.getRunningAppProcesses();
        } catch (RuntimeException e) {
            Logger.w(TAG, "activityManager getRunningAppProcesses occur exception: ", e);
            list = null;
        }
        if (list != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
                if (runningAppProcessInfo.processName != null && runningAppProcessInfo.processName.equals(context.getPackageName()) && runningAppProcessInfo.importance == 100) {
                    Logger.v(TAG, "isForeground true");
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static PendingIntent getActivities(Context context, int i, Intent[] intentArr, int i2) {
        if (context == null) {
            Logger.w(TAG, MonitorManager.CONTEXT_IS_NULL_MSG);
            return null;
        }
        try {
            return PendingIntent.getActivities(context, i, intentArr, i2);
        } catch (RuntimeException e) {
            Logger.e(TAG, "dealType rethrowFromSystemServer:", e);
            return null;
        }
    }
}

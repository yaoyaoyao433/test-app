package com.huawei.hms.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.support.log.HMSLog;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class UIUtil {
    public static Activity getActiveActivity(Activity activity, Context context) {
        if (isBackground(context)) {
            HMSLog.i("UIUtil", "isBackground" + isBackground(context));
            return null;
        } else if (activity == null) {
            HMSLog.i("UIUtil", "activity is " + activity);
            return ActivityMgr.INST.getCurrentActivity();
        } else if (activity.isFinishing()) {
            HMSLog.i("UIUtil", "activity isFinishing is " + activity.isFinishing());
            return ActivityMgr.INST.getCurrentActivity();
        } else {
            return activity;
        }
    }

    public static String getProcessName(Context context, int i) {
        ActivityManager activityManager;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (context == null || (activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)) == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == i) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }

    public static boolean isActivityFullscreen(Activity activity) {
        return (activity.getWindow().getAttributes().flags & 1024) == 1024;
    }

    public static boolean isBackground(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        boolean inKeyguardRestrictedInputMode;
        if (context == null) {
            return true;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (activityManager == null || keyguardManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return true;
        }
        String processName = getProcessName(context, Process.myPid());
        Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ActivityManager.RunningAppProcessInfo next = it.next();
            if (TextUtils.equals(next.processName, processName)) {
                HMSLog.i("UIUtil", "appProcess.importance is " + next.importance);
                boolean z = next.importance == 100;
                if (Build.VERSION.SDK_INT > 22) {
                    inKeyguardRestrictedInputMode = keyguardManager.isDeviceLocked();
                } else {
                    inKeyguardRestrictedInputMode = keyguardManager.inKeyguardRestrictedInputMode();
                }
                HMSLog.i("UIUtil", "isForground is " + z + "***  isLockedState is " + inKeyguardRestrictedInputMode);
                if (!z || inKeyguardRestrictedInputMode) {
                    break;
                }
                return false;
            }
        }
        return true;
    }
}

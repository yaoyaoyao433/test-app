package com.meituan.msc.modules.container.router;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.os.Build;
import android.support.annotation.Keep;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AppBrandRouterCenter {
    @Keep
    public static AppBrandRouterCenter INSTANCE = new AppBrandRouterCenter();
    public static ChangeQuickRedirect a;

    public static a a(Activity activity) {
        ComponentName component;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d8a44495547a57d845b23a3d0e1a0cd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d8a44495547a57d845b23a3d0e1a0cd2");
        }
        ActivityManager activityManager = (ActivityManager) MSCEnvHelper.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        if (Build.VERSION.SDK_INT >= 21) {
            for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                if (taskInfo.id == activity.getTaskId() && (component = taskInfo.baseIntent.getComponent()) != null) {
                    a a2 = a.a(component.getClassName());
                    return a2 != null ? a2 : a.OTHER;
                }
            }
        }
        g.b("AppBrandRouterCenter", null, "findTaskForActivity: task not found, for ", activity.getClass());
        return a.OTHER;
    }
}

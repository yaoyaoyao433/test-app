package com.sankuai.titans.base.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.titans.base.Titans;
import com.sankuai.titans.protocol.services.IStatisticsService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ProcessUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isBackground(Context context) {
        boolean z = true;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "45a3184453a8d9cc3a2bde2e56ec5ed5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "45a3184453a8d9cc3a2bde2e56ec5ed5")).booleanValue();
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (Build.VERSION.SDK_INT > 21) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.importance == 100) {
                        String[] strArr = runningAppProcessInfo.pkgList;
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (strArr[i].equals(context.getPackageName())) {
                                z = false;
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo2 = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo2);
            return runningAppProcessInfo2.importance != 100;
        } catch (Throwable th) {
            IStatisticsService statisticsService = Titans.serviceManager().getStatisticsService();
            if (statisticsService != null) {
                statisticsService.reportClassError("ProcessUtils", "isBackground", th);
            }
            return false;
        }
    }
}

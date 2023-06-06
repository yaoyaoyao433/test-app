package com.sankuai.titans.protocol.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class AppUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String getVersionName(Context context) {
        PackageInfo packageInfo;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e29437ebb3459adaa935ad8665896779", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e29437ebb3459adaa935ad8665896779");
        }
        if (context == null) {
            return "";
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        return packageInfo != null ? packageInfo.versionName : "";
    }

    public static String getPackageName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "580ea6c50cce36a1b5b6cf42a18c2589", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "580ea6c50cce36a1b5b6cf42a18c2589") : context == null ? "" : context.getPackageName();
    }

    public static boolean isActivityAlive(Activity activity) {
        boolean z = false;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a90a7e017d3d9f236c1af2be039565cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a90a7e017d3d9f236c1af2be039565cc")).booleanValue();
        }
        if (activity != null && !activity.isFinishing()) {
            z = true;
        }
        return (!z || Build.VERSION.SDK_INT < 17) ? z : !activity.isDestroyed();
    }
}

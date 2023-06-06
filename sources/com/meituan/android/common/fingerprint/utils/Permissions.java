package com.meituan.android.common.fingerprint.utils;

import android.content.Context;
import android.os.Build;
import android.support.v4.content.PermissionChecker;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.takeoutnew.util.aop.f;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Permissions {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isPermissionGranted(String str, Context context) {
        Object[] objArr = {str, context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ae5d003662b3d8b84d5aafaefffca76c", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ae5d003662b3d8b84d5aafaefffca76c")).booleanValue();
        }
        try {
            if (!LifecycleManager.isInForeground()) {
                StringUtils.setLogan("system permission notify not in foreground");
                return false;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 23) {
                    if (f.a(context, str) != 0) {
                        return false;
                    }
                } else if (PermissionChecker.checkSelfPermission(context, str) != 0) {
                    return false;
                }
            } else if (PermissionChecker.checkSelfPermission(context, str) != 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            StringUtils.setErrorLogan(e);
            return false;
        }
    }

    public static boolean isPermissionGrantedFromPrivacy(String str, Context context, String str2) {
        Object[] objArr = {str, context, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7be5f3985611913389c8eba4f0122e60", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7be5f3985611913389c8eba4f0122e60")).booleanValue();
        }
        try {
            if (!LifecycleManager.isInForeground()) {
                StringUtils.setLogan("bid permission notify not in foreground");
                return false;
            }
            long currentTimeMillis = System.currentTimeMillis();
            int a = Privacy.createPermissionGuard().a(context, str, str2);
            StringUtils.setLogan("permission id: " + str + ", bid: " + str2 + ", ret: " + a + ", cost: " + (System.currentTimeMillis() - currentTimeMillis));
            return a > 0;
        } catch (Throwable th) {
            StringUtils.setErrorLogan(th);
            return false;
        }
    }
}

package android.support.v4.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;
import android.support.v4.app.AppOpsManagerCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.f;
import com.sankuai.meituan.takeoutnew.util.aop.j;
import com.sankuai.waimai.manipulator.runtime.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class PermissionChecker {
    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_DENIED_APP_OP = -2;
    public static final int PERMISSION_GRANTED = 0;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public @interface PermissionResult {
    }

    private PermissionChecker() {
    }

    public static int checkSelfPermission(@NonNull Context context, @NonNull String str) {
        return checkPermission(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static int checkCallingPermission(@NonNull Context context, @NonNull String str, String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return checkPermission(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int checkCallingOrSelfPermission(@NonNull Context context, @NonNull String str) {
        return checkPermission(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int checkPermission(@NonNull Context context, @NonNull String str, int i, int i2, String str2) {
        a a;
        String str3;
        Object[] objArr = {context, str, Integer.valueOf(i), Integer.valueOf(i2), str2};
        ChangeQuickRedirect changeQuickRedirect = f.a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fea74834985dc60077986874220af77", RobustBitConfig.DEFAULT_VALUE)) {
            a = (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fea74834985dc60077986874220af77");
        } else if (!j.a(str)) {
            a = a.a();
        } else {
            a = a.a(-1);
        }
        if (a.b) {
            if (f.a(context, str, i, i2) == -1) {
                return -1;
            }
            String permissionToOp = AppOpsManagerCompat.permissionToOp(str);
            if (permissionToOp == null) {
                return 0;
            }
            if (str2 == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                str3 = packagesForUid[0];
            } else {
                str3 = str2;
            }
            return AppOpsManagerCompat.noteProxyOp(context, permissionToOp, str3) != 0 ? -2 : 0;
        }
        return ((Number) a.c).intValue();
    }
}

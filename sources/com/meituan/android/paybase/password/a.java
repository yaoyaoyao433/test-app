package com.meituan.android.paybase.password;

import android.app.Activity;
import android.support.constraint.R;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.dialog.e;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    @MTPaySuppressFBWarnings({"DB_DUPLICATE_SWITCH_CLAUSES"})
    public static void a(Activity activity, Exception exc) {
        Object[] objArr = {activity, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6c26d71592931758b8d653a6ed35dd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6c26d71592931758b8d653a6ed35dd6");
        } else if (exc == null) {
        } else {
            if (exc instanceof PayException) {
                PayException payException = (PayException) exc;
                switch (payException.getLevel()) {
                    case 1:
                        e.a(activity, payException.getMessage(), payException.getErrorCodeStr());
                        return;
                    case 2:
                    case 3:
                        new PayDialog.a(activity).c(exc.getMessage()).d(payException.getErrorCodeStr()).a().show();
                        return;
                    default:
                        e.a(activity, payException.getMessage(), payException.getErrorCodeStr());
                        return;
                }
            }
            e.a(activity, (Object) activity.getString(R.string.paybase__error_msg_load_later));
        }
    }

    public static boolean a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b970120359fb29c448cd24a382334292", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b970120359fb29c448cd24a382334292")).booleanValue() : (exc instanceof PayException) && ((PayException) exc).getLevel() == 5;
    }
}

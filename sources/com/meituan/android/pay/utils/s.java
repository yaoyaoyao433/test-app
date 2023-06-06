package com.meituan.android.pay.utils;

import android.app.Activity;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.activity.PayActivity;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class s {
    public static ChangeQuickRedirect a;

    @MTPaySuppressFBWarnings({"DB_DUPLICATE_SWITCH_CLAUSES"})
    public static void a(Activity activity, Exception exc, int i) {
        Object[] objArr = {activity, exc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b782b7871132c324318404f2a16f6d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b782b7871132c324318404f2a16f6d2");
        } else if (activity == null || exc == null) {
        } else {
            if (exc instanceof PayException) {
                PayException payException = (PayException) exc;
                int level = payException.getLevel();
                if (level != 6) {
                    switch (level) {
                        case 1:
                            com.meituan.android.paybase.dialog.e.a(activity, payException.getMessage(), payException.getErrorCodeStr());
                            return;
                        case 2:
                            a(activity, payException.getMessage(), payException.getErrorCodeStr(), payException, i);
                            return;
                        case 3:
                            new PayDialog.a(activity).c(exc.getMessage()).d(payException.getErrorCodeStr()).a().show();
                            return;
                        case 4:
                            new PayDialog.a(activity).c(exc.getMessage()).d(payException.getErrorCodeStr()).b("知道了", t.a(activity, payException)).a().show();
                            return;
                        default:
                            com.meituan.android.paybase.dialog.e.a(activity, payException.getMessage(), payException.getErrorCodeStr());
                            return;
                    }
                }
                new PayDialog.a(activity).c(exc.getMessage()).d(payException.getErrorCodeStr()).b("使用其他支付方式", u.a(activity, payException)).a().show();
                return;
            }
            com.meituan.android.paybase.dialog.e.a(activity, (Object) activity.getString(R.string.paycommon__error_msg_load_later));
            a.c cVar = new a.c();
            com.meituan.android.paybase.common.analyse.a.a("b_pay_mqk1w1xy_mv", cVar.a(KnbConstants.PARAMS_SCENE, activity.getLocalClassName() + "_handleException").a("message", exc.getMessage()).b);
        }
    }

    public static void a(Activity activity, String str, String str2, Exception exc, int i) {
        Object[] objArr = {activity, str, str2, exc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "664a15f2ade902dc3181c8a2ba20473d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "664a15f2ade902dc3181c8a2ba20473d");
        } else if (activity == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                if (exc instanceof PayException) {
                    a(activity, (PayException) exc, i);
                    return;
                } else {
                    a(activity, str, -9753, i);
                    return;
                }
            }
            new PayDialog.a(activity).c(str).d(str2).b("知道了", v.a(exc, activity, i, str)).a().show();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Activity activity, String str, int i, int i2) {
        Object[] objArr = {activity, str, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c65f860c66a0b41602511526e105989a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c65f860c66a0b41602511526e105989a");
        } else if (activity == null) {
        } else {
            if (i2 == 1) {
                PayActivity.a(activity);
            } else if (i2 == 3) {
                PayActivity.a(activity, str, i);
            } else if (i2 == 4) {
                PayActivity.c(activity, str, i);
            } else if (i2 == 5) {
                PayActivity.d(activity, str, i);
            }
        }
    }

    public static void a(Activity activity, PayException payException, int i) {
        Object[] objArr = {activity, payException, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c876af77a5f638b23d7bec936d5b956d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c876af77a5f638b23d7bec936d5b956d");
        } else if (com.meituan.android.pay.desk.component.data.a.b(activity) && (activity instanceof FragmentActivity)) {
            com.meituan.android.pay.process.g.a((FragmentActivity) activity, (Object) payException);
        } else if (i == 3 && !TextUtils.isEmpty(payException.getExtra())) {
            PayActivity.a(activity, payException);
        } else {
            a(activity, payException.getMessage(), payException.getCode(), i);
        }
    }

    @MTPaySuppressFBWarnings({"DB_DUPLICATE_SWITCH_CLAUSES"})
    public static void b(Activity activity, Exception exc, int i) {
        Object[] objArr = {activity, exc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c9193c7655489b39b398ef7ddcf5763", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c9193c7655489b39b398ef7ddcf5763");
        } else if (activity == null || exc == null) {
        } else {
            if (exc instanceof PayException) {
                PayException payException = (PayException) exc;
                int level = payException.getLevel();
                if (level != 6) {
                    switch (level) {
                        case 2:
                        case 3:
                            a(activity, payException.getMessage(), payException.getErrorCodeStr(), payException, i);
                            return;
                        case 4:
                            new PayDialog.a(activity).c(exc.getMessage()).d(payException.getErrorCodeStr()).b("知道了", y.a(activity, payException)).a().show();
                            return;
                        default:
                            com.meituan.android.paybase.dialog.e.a(activity, payException.getMessage(), payException.getErrorCodeStr());
                            PayActivity.a(activity, payException.getMessage(), payException.getCode());
                            return;
                    }
                }
                new PayDialog.a(activity).c(exc.getMessage()).d(payException.getErrorCodeStr()).b("使用其他支付方式", z.a(activity, payException)).a().show();
                return;
            }
            com.meituan.android.paybase.dialog.e.a(activity, (Object) activity.getString(R.string.paycommon__error_msg_load_later));
            PayActivity.a(activity, exc.getMessage(), -9753);
            a.c cVar = new a.c();
            com.meituan.android.paybase.common.analyse.a.a("b_pay_mqk1w1xy_mv", cVar.a(KnbConstants.PARAMS_SCENE, activity.getLocalClassName() + "_handleException").a("message", exc.getMessage()).b);
        }
    }
}

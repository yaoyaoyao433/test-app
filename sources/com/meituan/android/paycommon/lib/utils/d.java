package com.meituan.android.paycommon.lib.utils;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.common.dialog.PayDialog;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.android.paybase.utils.MTPaySuppressFBWarnings;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a;

    @MTPaySuppressFBWarnings({"DB_DUPLICATE_SWITCH_CLAUSES"})
    public static void a(Activity activity, Exception exc, @Nullable Class<?> cls) {
        Object[] objArr = {activity, exc, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dd09240086811870ad1ce5917badb47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dd09240086811870ad1ce5917badb47");
        } else if (activity == null || exc == null) {
        } else {
            if (exc instanceof PayException) {
                PayException payException = (PayException) exc;
                com.meituan.android.paybase.common.analyse.a.a("b_dfqxkh81", new a.c().a("code", Integer.valueOf(payException.getCode())).a("level", Integer.valueOf(payException.getLevel())).a("message", payException.getMessage()).b);
                switch (payException.getLevel()) {
                    case 1:
                        com.meituan.android.paybase.dialog.e.a(activity, payException.getMessage(), payException.getErrorCodeStr());
                        return;
                    case 2:
                        a(activity, exc.getMessage(), payException.getErrorCodeStr(), cls);
                        return;
                    case 3:
                        new PayDialog.a(activity).c(exc.getMessage()).d(payException.getErrorCodeStr()).a().show();
                        return;
                    default:
                        com.meituan.android.paybase.dialog.e.a(activity, payException.getMessage(), payException.getErrorCodeStr());
                        return;
                }
            }
            com.meituan.android.paybase.dialog.e.a(activity, (Object) activity.getString(R.string.paycommon__error_msg_load_later));
        }
    }

    @MTPaySuppressFBWarnings({"DB_DUPLICATE_SWITCH_CLAUSES"})
    public static void a(Activity activity, Exception exc, PayDialog.a aVar, @Nullable Class<?> cls) {
        Object[] objArr = {activity, exc, aVar, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84f4b992e07bfa5bd4423142b2291be6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84f4b992e07bfa5bd4423142b2291be6");
        } else if (activity == null || exc == null) {
        } else {
            if (exc instanceof PayException) {
                PayException payException = (PayException) exc;
                com.meituan.android.paybase.common.analyse.a.a("b_dfqxkh81", new a.c().a("code", Integer.valueOf(payException.getCode())).a("level", Integer.valueOf(payException.getLevel())).a("message", payException.getMessage()).b);
                switch (payException.getLevel()) {
                    case 1:
                        com.meituan.android.paybase.dialog.e.a(activity, payException.getMessage(), payException.getErrorCodeStr());
                        return;
                    case 2:
                        a(activity, exc.getMessage(), payException.getErrorCodeStr(), aVar, cls);
                        return;
                    case 3:
                        aVar.c(exc.getMessage()).b("提示").b("知道了", null).d(payException.getErrorCodeStr()).a().show();
                        return;
                    default:
                        com.meituan.android.paybase.dialog.e.a(activity, payException.getMessage(), payException.getErrorCodeStr());
                        return;
                }
            }
            com.meituan.android.paybase.dialog.e.a(activity, (Object) activity.getString(R.string.paycommon__error_msg_load_later));
        }
    }

    public static boolean a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a1c3fc8e5d1f648838661f9accc6b2d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a1c3fc8e5d1f648838661f9accc6b2d")).booleanValue() : (exc instanceof PayException) && ((PayException) exc).getLevel() == 5;
    }

    public static void a(Activity activity, String str, String str2, @Nullable Class<?> cls) {
        Object[] objArr = {activity, str, str2, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "189ca0a5a8ebb1cad5b0ea700cd470a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "189ca0a5a8ebb1cad5b0ea700cd470a2");
        } else if (activity == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                a(activity, cls);
            } else {
                new PayDialog.a(activity).c(str).d(str2).b("知道了", e.a(activity, cls)).a().show();
            }
        }
    }

    public static void a(Activity activity, String str, String str2, PayDialog.a aVar, @Nullable Class<?> cls) {
        Object[] objArr = {activity, str, str2, aVar, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b8529797c139369fafb6219dd24bfa3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b8529797c139369fafb6219dd24bfa3c");
        } else if (activity == null) {
        } else {
            if (TextUtils.isEmpty(str)) {
                a(activity, cls);
            } else if (aVar != null) {
                aVar.c(str).b("提示").d(str2).b("知道了", f.a(activity, cls)).a().show();
            }
        }
    }

    public static void a(Activity activity, @Nullable Class<?> cls) {
        Object[] objArr = {activity, cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e72f02e00011783dc7b8450321cd9d3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e72f02e00011783dc7b8450321cd9d3e");
        } else if (activity == null) {
        } else {
            if (cls == null) {
                activity.setResult(1111);
                activity.finish();
                return;
            }
            Intent intent = new Intent(activity, cls);
            intent.addFlags(603979776);
            intent.putExtra("finish", true);
            activity.startActivity(intent);
        }
    }
}

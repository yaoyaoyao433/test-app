package com.meituan.android.paybase.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.dialog.BasePayDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.PrintWriter;
import java.io.StringWriter;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class j {
    public static ChangeQuickRedirect a;

    public static void a(Context context, String str, boolean z) {
        Object[] objArr = {context, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87b2267db10626b6e4bda3dc9542b5f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87b2267db10626b6e4bda3dc9542b5f9");
        } else if (context == null || TextUtils.isEmpty(str)) {
        } else {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setPackage(context.getPackageName());
                if (!(context instanceof Activity)) {
                    intent.addFlags(com.tencent.mapsdk.internal.y.a);
                }
                context.startActivity(intent);
            } catch (Exception e) {
                a(context, str, e, z);
            }
        }
    }

    public static void a(Activity activity, String str, int i) {
        Object[] objArr = {activity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed19eea9346de07c902243da712fb542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed19eea9346de07c902243da712fb542");
        } else if (activity == null || TextUtils.isEmpty(str)) {
        } else {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setPackage(activity.getPackageName());
                activity.startActivityForResult(intent, i);
            } catch (Exception e) {
                a(activity, str, e, true);
            }
        }
    }

    public static void a(Fragment fragment, String str, int i) {
        Object[] objArr = {fragment, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2756b207731e2620cdc996912de43285", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2756b207731e2620cdc996912de43285");
        } else if (fragment == null || TextUtils.isEmpty(str)) {
        } else {
            try {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setPackage(fragment.getActivity().getPackageName());
                fragment.startActivityForResult(intent, i);
            } catch (Exception e) {
                a(fragment.getActivity(), str, e, true);
            }
        }
    }

    public static void a(Context context, String str, Exception exc, boolean z) {
        Object[] objArr = {context, str, exc, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd0451a61a08ab7de348d5cb17dd8c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd0451a61a08ab7de348d5cb17dd8c2c");
            return;
        }
        String string = context.getString(R.string.paybase__start_activity_exception_alert);
        if (z && (context instanceof Activity)) {
            new BasePayDialog.b((Activity) context).c(string).a().show();
        }
        String message = exc.getMessage();
        exc.printStackTrace(new PrintWriter(new StringWriter()));
        v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "CommonApi_catchStartException").a("message", exc.getMessage()).a("url", str).a("alertMsg", string).b);
        com.dianping.codelog.b.b(context.getClass(), "errorOpenPage", message);
    }
}

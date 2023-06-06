package com.meituan.passport.utils;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static void a(Context context, com.meituan.passport.login.c cVar) {
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ac843bb968bc806a5482576b741a6e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ac843bb968bc806a5482576b741a6e2");
            return;
        }
        b(context, cVar);
        String b = e.a().b();
        if (b.startsWith("http") || b.startsWith("https")) {
            b = com.meituan.passport.plugins.q.a().i().a() + "?url=" + b;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(b));
            intent.setPackage(context.getPackageName());
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
        }
    }

    private static void b(Context context, com.meituan.passport.login.c cVar) {
        Object[] objArr = {context, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "53e81ea9fe7f8ca942793849acc7aa39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "53e81ea9fe7f8ca942793849acc7aa39");
        } else if (cVar == null) {
            aj.a(context, "b_3lh98clr", "c_hvcwz3nv");
        } else {
            HashMap hashMap = new HashMap();
            switch (cVar) {
                case ChinaMobile:
                    if (com.meituan.passport.plugins.q.a().j != null) {
                        hashMap.put("operator_type", com.meituan.passport.plugins.q.a().j.a());
                    } else {
                        hashMap.put("operator_type", "");
                    }
                    aj.a(context, "b_3lh98clr", "c_lfb1eao8", hashMap);
                    return;
                case UnionLogin:
                    aj.a(context, "b_3lh98clr", "c_group_up164w3j");
                    return;
                default:
                    aj.a(context, "b_3lh98clr", "c_hvcwz3nv");
                    return;
            }
        }
    }
}

package com.meituan.android.paybase.net;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c extends com.meituan.android.paybase.retrofit.a {
    public static ChangeQuickRedirect a;
    private static volatile c c;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e74f84e75f95a6e9c56653563a1f8ae0", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e74f84e75f95a6e9c56653563a1f8ae0");
        }
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c();
                }
            }
        }
        return c;
    }

    @Override // com.meituan.android.paybase.retrofit.a
    public final ar b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4129d2fdf34a918872f432064bb40a2b", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4129d2fdf34a918872f432064bb40a2b") : a.a();
    }

    @Override // com.meituan.android.paybase.retrofit.a
    public final boolean a(@NonNull com.meituan.android.paybase.retrofit.b bVar, Exception exc) {
        boolean z;
        int i;
        Object[] objArr = {bVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af3ec2bbacf7a99dac004f7618ebaa8a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af3ec2bbacf7a99dac004f7618ebaa8a")).booleanValue();
        }
        if (exc instanceof PayException) {
            PayException payException = (PayException) exc;
            i = payException.getCode();
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cddd4ab72eefe1d34a700905127312c9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cddd4ab72eefe1d34a700905127312c9")).booleanValue() : i == 405 || i == 404 || i == 403 || i == 402 || i == 401) {
                Activity activity = null;
                if (bVar instanceof Activity) {
                    activity = (Activity) bVar;
                } else if (bVar instanceof Fragment) {
                    activity = ((Fragment) bVar).getActivity();
                }
                if (activity != null) {
                    com.meituan.android.paybase.config.a.e().a(activity, payException.getCode(), payException.getMessage());
                    z = true;
                }
            }
            z = false;
        } else {
            z = false;
            i = -1;
        }
        String simpleName = exc.getClass().getSimpleName();
        com.meituan.android.paybase.common.analyse.a.a(simpleName, "request exception", com.meituan.android.paybase.common.analyse.a.a("errorCode:" + i, "errorMessage:" + exc.getMessage()), "");
        if (!z) {
            String name = bVar.getClass().getName();
            com.meituan.android.paybase.common.analyse.a.a(name, "onRequestException", com.meituan.android.paybase.common.analyse.a.a("code:" + i, "message:" + exc.getMessage()), "");
            exc.printStackTrace();
        }
        return z;
    }
}

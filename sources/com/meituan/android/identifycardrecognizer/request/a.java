package com.meituan.android.identifycardrecognizer.request;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.meituan.android.paybase.downgrading.d;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.meituan.android.paybase.retrofit.a {
    public static ChangeQuickRedirect a;
    private static volatile a c;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8b63bac328eafaad8c3f56c0ff8b1a41", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8b63bac328eafaad8c3f56c0ff8b1a41");
        }
        if (c == null) {
            synchronized (a.class) {
                if (c == null) {
                    c = new a();
                }
            }
        }
        return c;
    }

    @Override // com.meituan.android.paybase.retrofit.a
    public final ar b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e30e0b59ba25f0143126041897ebe6", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e30e0b59ba25f0143126041897ebe6");
        }
        com.meituan.android.paybase.downgrading.c cVar = d.a().b;
        if (cVar != null && cVar.k) {
            return b.b();
        }
        return b.a();
    }

    @Override // com.meituan.android.paybase.retrofit.a
    public final boolean a(@NonNull com.meituan.android.paybase.retrofit.b bVar, Exception exc) {
        boolean z;
        int i;
        Object[] objArr = {bVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a98fe63d45161ba45e83a1d3b823c1f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a98fe63d45161ba45e83a1d3b823c1f6")).booleanValue();
        }
        if (exc instanceof PayException) {
            PayException payException = (PayException) exc;
            i = payException.getCode();
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc8c62d5d08884a2cb8655e3ee24de70", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc8c62d5d08884a2cb8655e3ee24de70")).booleanValue() : i == 405 || i == 404 || i == 403 || i == 402 || i == 401) {
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

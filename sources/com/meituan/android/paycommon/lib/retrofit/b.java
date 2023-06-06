package com.meituan.android.paycommon.lib.retrofit;

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
public class b extends com.meituan.android.paybase.retrofit.a {
    public static ChangeQuickRedirect a;
    private static volatile b c;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "29c0e9b15a72e49a0d3bd7c3569de64b", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "29c0e9b15a72e49a0d3bd7c3569de64b");
        }
        if (c == null) {
            synchronized (b.class) {
                if (c == null) {
                    c = new b();
                }
            }
        }
        return c;
    }

    @Override // com.meituan.android.paybase.retrofit.a
    public final ar b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a19b4f9884dd50795428313adc926632", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a19b4f9884dd50795428313adc926632") : c.a();
    }

    @Override // com.meituan.android.paybase.retrofit.a
    public final boolean a(@NonNull com.meituan.android.paybase.retrofit.b bVar, Exception exc) {
        boolean z;
        int i;
        Object[] objArr = {bVar, exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "202bcee44a87220377650e7fe99c67bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "202bcee44a87220377650e7fe99c67bd")).booleanValue();
        }
        if (exc instanceof PayException) {
            PayException payException = (PayException) exc;
            i = payException.getCode();
            Object[] objArr2 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f60fe566cd5e29d739c735f1dbc0f33a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f60fe566cd5e29d739c735f1dbc0f33a")).booleanValue() : i == 405 || i == 404 || i == 403 || i == 402 || i == 401) {
                Activity activity = null;
                if (bVar instanceof Activity) {
                    activity = (Activity) bVar;
                } else if (bVar instanceof Fragment) {
                    activity = ((Fragment) bVar).getActivity();
                }
                if (activity != null) {
                    com.meituan.android.paycommon.lib.config.a.b().a(activity, payException.getCode(), payException.getMessage());
                    z = true;
                }
            }
            z = false;
        } else {
            z = false;
            i = -1;
        }
        String simpleName = exc.getClass().getSimpleName();
        com.meituan.android.paybase.common.analyse.a.a(simpleName, "request exception", com.meituan.android.paybase.common.analyse.a.a("errorCode:" + String.valueOf(i), "errorMessage:" + exc.getMessage()), "");
        if (!z) {
            String name = bVar.getClass().getName();
            com.meituan.android.paybase.common.analyse.a.a(name, "onRequestException", com.meituan.android.paybase.common.analyse.a.a("code:" + String.valueOf(i), "message:" + exc.getMessage()), "");
            exc.printStackTrace();
        }
        return z;
    }
}

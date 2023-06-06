package com.meituan.android.mrn.utils;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.i;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class h {
    public static ChangeQuickRedirect a;
    private static i.a b;

    public static i.a a() {
        Gson c;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2d175c86351411ca2518707b2435fdf", RobustBitConfig.DEFAULT_VALUE)) {
            return (i.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2d175c86351411ca2518707b2435fdf");
        }
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "3982a9d5ac4cb2179cb17da532cb73c5", RobustBitConfig.DEFAULT_VALUE)) {
                        c = (Gson) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "3982a9d5ac4cb2179cb17da532cb73c5");
                    } else {
                        c = m.a().c();
                        if (c == null) {
                            m.a().b();
                            c = m.a().c();
                        }
                    }
                    b = com.sankuai.meituan.retrofit2.converter.gson.a.a(c);
                }
            }
        }
        return b;
    }
}

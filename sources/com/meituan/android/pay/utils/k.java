package com.meituan.android.pay.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a;
    private static k d;
    public com.meituan.android.pay.process.b b;
    public com.meituan.android.pay.process.a c;

    public static synchronized k a() {
        synchronized (k.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "929d3599655a0b7deb00dedfc1c18f58", RobustBitConfig.DEFAULT_VALUE)) {
                return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "929d3599655a0b7deb00dedfc1c18f58");
            }
            if (d == null) {
                d = new k();
            }
            return d;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b669ef5ddda980cb079b1b64eab5ca34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b669ef5ddda980cb079b1b64eab5ca34");
        } else {
            d = null;
        }
    }
}

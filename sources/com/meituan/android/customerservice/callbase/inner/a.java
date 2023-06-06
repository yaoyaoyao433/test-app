package com.meituan.android.customerservice.callbase.inner;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a e = new a();
    public String b;
    public byte c;
    public com.meituan.android.pike.a d;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e898364944d2a5c8a521a891a478fc8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e898364944d2a5c8a521a891a478fc8");
        } else {
            this.d = com.meituan.android.pike.a.ENV_PROD;
        }
    }

    public static a a() {
        return e;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d67c6f2269eaa558d736c003b78eb9f2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d67c6f2269eaa558d736c003b78eb9f2");
        }
        return "isAutoAnswerBusy=, timeout=, accountType=";
    }
}

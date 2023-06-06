package com.meituan.android.yoda.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public static ChangeQuickRedirect a;
    private final b b;
    private final String c;
    private final String d;
    private final com.meituan.android.yoda.interfaces.h e;

    private h(b bVar, String str, String str2, com.meituan.android.yoda.interfaces.h hVar) {
        this.b = bVar;
        this.c = str;
        this.d = str2;
        this.e = hVar;
    }

    public static Runnable a(b bVar, String str, String str2, com.meituan.android.yoda.interfaces.h hVar) {
        Object[] objArr = {bVar, str, str2, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2087f77f545181a775adc7283bae63c1", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2087f77f545181a775adc7283bae63c1") : new h(bVar, str, str2, hVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2414c63f67b98c3d93c9eb04aba6a187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2414c63f67b98c3d93c9eb04aba6a187");
        } else {
            b.a(this.b, this.c, this.d, this.e);
        }
    }
}

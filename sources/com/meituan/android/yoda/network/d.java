package com.meituan.android.yoda.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public static ChangeQuickRedirect a;
    private final b b;
    private final String c;
    private final com.meituan.android.yoda.interfaces.h d;

    private d(b bVar, String str, com.meituan.android.yoda.interfaces.h hVar) {
        this.b = bVar;
        this.c = str;
        this.d = hVar;
    }

    public static Runnable a(b bVar, String str, com.meituan.android.yoda.interfaces.h hVar) {
        Object[] objArr = {bVar, str, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da3908154fc4cbb8a93c40f70b53eca1", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da3908154fc4cbb8a93c40f70b53eca1") : new d(bVar, str, hVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb1cf8c3130ee424accdfe2719f54ab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb1cf8c3130ee424accdfe2719f54ab1");
        } else {
            b.a(this.b, this.c, this.d);
        }
    }
}

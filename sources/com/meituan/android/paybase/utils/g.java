package com.meituan.android.paybase.utils;

import com.meituan.android.paybase.utils.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Runnable {
    public static ChangeQuickRedirect a;
    private final f.InterfaceC0337f b;

    private g(f.InterfaceC0337f interfaceC0337f) {
        this.b = interfaceC0337f;
    }

    public static Runnable a(f.InterfaceC0337f interfaceC0337f) {
        Object[] objArr = {interfaceC0337f};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4ce5223037718bd5579ff6aaefaea70", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4ce5223037718bd5579ff6aaefaea70") : new g(interfaceC0337f);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9eefa274cf4c26f28d6cf62dd54923b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9eefa274cf4c26f28d6cf62dd54923b");
        } else {
            f.a(this.b);
        }
    }
}

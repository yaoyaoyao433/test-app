package com.meituan.mtwebkit.internal.mode;

import com.meituan.mtwebkit.internal.MTWebViewFromLocalStorageContext;
import com.meituan.mtwebkit.internal.k;
import com.meituan.mtwebkit.internal.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends e {
    public static ChangeQuickRedirect g;

    @Override // com.meituan.mtwebkit.internal.mode.e, com.meituan.mtwebkit.internal.m
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b517173664d275f114e5262103c9c75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b517173664d275f114e5262103c9c75");
            return;
        }
        final MTWebViewFromLocalStorageContext mTWebViewFromLocalStorageContext = new MTWebViewFromLocalStorageContext(l.b());
        this.e = mTWebViewFromLocalStorageContext;
        this.d = mTWebViewFromLocalStorageContext.b;
        k.a.a.a(new Runnable() { // from class: com.meituan.mtwebkit.internal.mode.c.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bf44c00b3cf6be11a49bc791e94eb33b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bf44c00b3cf6be11a49bc791e94eb33b");
                } else {
                    mTWebViewFromLocalStorageContext.b();
                }
            }
        });
        b = mTWebViewFromLocalStorageContext.a();
    }

    @Override // com.meituan.mtwebkit.internal.m
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7438f17a340004ebbe6e1160f05e1999", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7438f17a340004ebbe6e1160f05e1999");
            return;
        }
        synchronized (c) {
            MTWebViewFromLocalStorageContext mTWebViewFromLocalStorageContext = (MTWebViewFromLocalStorageContext) this.e;
            mTWebViewFromLocalStorageContext.c();
            b = mTWebViewFromLocalStorageContext.a();
        }
    }
}

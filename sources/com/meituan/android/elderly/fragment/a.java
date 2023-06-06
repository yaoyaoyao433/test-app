package com.meituan.android.elderly.fragment;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public static ChangeQuickRedirect a;
    private final MTElderlyCashierFragment b;

    private a(MTElderlyCashierFragment mTElderlyCashierFragment) {
        this.b = mTElderlyCashierFragment;
    }

    public static Runnable a(MTElderlyCashierFragment mTElderlyCashierFragment) {
        Object[] objArr = {mTElderlyCashierFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "629fa6b83103a02a0513718171259055", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "629fa6b83103a02a0513718171259055") : new a(mTElderlyCashierFragment);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "975910ad48fd670611eaa0680d7a6a83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "975910ad48fd670611eaa0680d7a6a83");
        } else {
            MTElderlyCashierFragment.b(this.b);
        }
    }
}

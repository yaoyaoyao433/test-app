package com.meituan.android.elderly.fragment;

import com.meituan.android.elderly.view.revision.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements i.a {
    public static ChangeQuickRedirect a;
    private final MTElderlyCashierFragment b;

    private b(MTElderlyCashierFragment mTElderlyCashierFragment) {
        this.b = mTElderlyCashierFragment;
    }

    public static i.a a(MTElderlyCashierFragment mTElderlyCashierFragment) {
        Object[] objArr = {mTElderlyCashierFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d792aaa177550e5ec300f88c77e5b2b8", RobustBitConfig.DEFAULT_VALUE) ? (i.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d792aaa177550e5ec300f88c77e5b2b8") : new b(mTElderlyCashierFragment);
    }

    @Override // com.meituan.android.elderly.view.revision.i.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c948ea7c31324e7cd7b728916845df00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c948ea7c31324e7cd7b728916845df00");
        } else {
            MTElderlyCashierFragment.a(this.b);
        }
    }
}

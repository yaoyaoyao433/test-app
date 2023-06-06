package com.meituan.android.pay.fragment;

import com.meituan.android.pay.adapter.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements a.c {
    public static ChangeQuickRedirect a;
    private final MTCBanksFragment b;

    public f(MTCBanksFragment mTCBanksFragment) {
        this.b = mTCBanksFragment;
    }

    @Override // com.meituan.android.pay.adapter.a.c
    public final void a(a.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c544d0d3cc512a31e902dafc94ad833", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c544d0d3cc512a31e902dafc94ad833");
        } else {
            MTCBanksFragment.a(this.b, dVar);
        }
    }
}

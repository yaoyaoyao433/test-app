package com.meituan.android.pay.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final MTCBanksFragment b;

    private h(MTCBanksFragment mTCBanksFragment) {
        this.b = mTCBanksFragment;
    }

    public static View.OnClickListener a(MTCBanksFragment mTCBanksFragment) {
        Object[] objArr = {mTCBanksFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e8a7de81fc2af346b128f16c94400fec", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e8a7de81fc2af346b128f16c94400fec") : new h(mTCBanksFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e54cf030edc605491f2417a39f5cafd", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e54cf030edc605491f2417a39f5cafd");
        } else {
            MTCBanksFragment.a(this.b, view);
        }
    }
}

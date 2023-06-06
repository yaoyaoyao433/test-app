package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BalanceInsufficientGuideFragment b;

    private a(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment) {
        this.b = balanceInsufficientGuideFragment;
    }

    public static View.OnClickListener a(BalanceInsufficientGuideFragment balanceInsufficientGuideFragment) {
        Object[] objArr = {balanceInsufficientGuideFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8aad92de593bb267b8a9b233a9002127", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8aad92de593bb267b8a9b233a9002127") : new a(balanceInsufficientGuideFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3dfeedd1ffd366b62e15a7b5192f79b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3dfeedd1ffd366b62e15a7b5192f79b");
        } else {
            BalanceInsufficientGuideFragment.a(this.b, view);
        }
    }
}

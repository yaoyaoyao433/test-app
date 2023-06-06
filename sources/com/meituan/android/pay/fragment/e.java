package com.meituan.android.pay.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final HelloPayVerifyFragment b;

    private e(HelloPayVerifyFragment helloPayVerifyFragment) {
        this.b = helloPayVerifyFragment;
    }

    public static View.OnClickListener a(HelloPayVerifyFragment helloPayVerifyFragment) {
        Object[] objArr = {helloPayVerifyFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9e31de1f48e24c6eb398a3b5c425983", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9e31de1f48e24c6eb398a3b5c425983") : new e(helloPayVerifyFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "919d26c4b97499263ec8d12e4fe016a5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "919d26c4b97499263ec8d12e4fe016a5");
        } else {
            HelloPayVerifyFragment.a(this.b, view);
        }
    }
}

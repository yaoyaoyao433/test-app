package com.meituan.android.pay.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final HelloPayVerifyFragment b;
    private final int c;

    private c(HelloPayVerifyFragment helloPayVerifyFragment, int i) {
        this.b = helloPayVerifyFragment;
        this.c = i;
    }

    public static View.OnClickListener a(HelloPayVerifyFragment helloPayVerifyFragment, int i) {
        Object[] objArr = {helloPayVerifyFragment, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "696816dca7657e8e98e2333b63fb2c36", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "696816dca7657e8e98e2333b63fb2c36") : new c(helloPayVerifyFragment, i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f29d5a3d1b7adc8ba6a16f0a923830c", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f29d5a3d1b7adc8ba6a16f0a923830c");
        } else {
            HelloPayVerifyFragment.b(this.b, this.c, view);
        }
    }
}

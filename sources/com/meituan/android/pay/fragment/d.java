package com.meituan.android.pay.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final HelloPayVerifyFragment b;
    private final int c;

    private d(HelloPayVerifyFragment helloPayVerifyFragment, int i) {
        this.b = helloPayVerifyFragment;
        this.c = i;
    }

    public static View.OnClickListener a(HelloPayVerifyFragment helloPayVerifyFragment, int i) {
        Object[] objArr = {helloPayVerifyFragment, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68d290a0ea47ff35848226f6dfa45265", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68d290a0ea47ff35848226f6dfa45265") : new d(helloPayVerifyFragment, i);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49d2710ec7d49909f088a7a0f53b6169", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49d2710ec7d49909f088a7a0f53b6169");
        } else {
            HelloPayVerifyFragment.a(this.b, this.c, view);
        }
    }
}

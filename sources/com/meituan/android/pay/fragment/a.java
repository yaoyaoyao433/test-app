package com.meituan.android.pay.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final AdditionVerifyFragment b;

    private a(AdditionVerifyFragment additionVerifyFragment) {
        this.b = additionVerifyFragment;
    }

    public static View.OnClickListener a(AdditionVerifyFragment additionVerifyFragment) {
        Object[] objArr = {additionVerifyFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e19044270a2def3e96ebb35337094723", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e19044270a2def3e96ebb35337094723") : new a(additionVerifyFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f0279672c61635e5d6bb85d242d085d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f0279672c61635e5d6bb85d242d085d");
        } else {
            AdditionVerifyFragment.a(this.b, view);
        }
    }
}

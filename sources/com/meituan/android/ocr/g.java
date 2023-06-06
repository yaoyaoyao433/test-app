package com.meituan.android.ocr;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PayBaseCameraFragment b;

    private g(PayBaseCameraFragment payBaseCameraFragment) {
        this.b = payBaseCameraFragment;
    }

    public static View.OnClickListener a(PayBaseCameraFragment payBaseCameraFragment) {
        Object[] objArr = {payBaseCameraFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aedf3d6c0cbb9ed444dfb466763929fe", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aedf3d6c0cbb9ed444dfb466763929fe") : new g(payBaseCameraFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ca76f88e677ec6ef31af7cd22e340ae", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ca76f88e677ec6ef31af7cd22e340ae");
        } else {
            this.b.b(view);
        }
    }
}

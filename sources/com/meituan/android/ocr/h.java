package com.meituan.android.ocr;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PayBaseCameraFragment b;

    private h(PayBaseCameraFragment payBaseCameraFragment) {
        this.b = payBaseCameraFragment;
    }

    public static View.OnClickListener a(PayBaseCameraFragment payBaseCameraFragment) {
        Object[] objArr = {payBaseCameraFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0edadfeb73fdc1916dd2eda42d93e1ed", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0edadfeb73fdc1916dd2eda42d93e1ed") : new h(payBaseCameraFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2276dfd02d35bbd6d8cc281eb177513e", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2276dfd02d35bbd6d8cc281eb177513e");
        } else {
            this.b.a(view);
        }
    }
}

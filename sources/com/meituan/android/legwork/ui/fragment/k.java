package com.meituan.android.legwork.ui.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PoiConfirmFragment b;

    private k(PoiConfirmFragment poiConfirmFragment) {
        this.b = poiConfirmFragment;
    }

    public static View.OnClickListener a(PoiConfirmFragment poiConfirmFragment) {
        Object[] objArr = {poiConfirmFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1b8ef490a4f04b0ae755d4ab76b8212b", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1b8ef490a4f04b0ae755d4ab76b8212b") : new k(poiConfirmFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d662bff99d55cf779c936c48be097b9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d662bff99d55cf779c936c48be097b9");
        } else {
            PoiConfirmFragment.a(this.b, view);
        }
    }
}

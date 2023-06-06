package com.meituan.android.legwork.ui.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PoiConfirmFragment b;

    private e(PoiConfirmFragment poiConfirmFragment) {
        this.b = poiConfirmFragment;
    }

    public static View.OnClickListener a(PoiConfirmFragment poiConfirmFragment) {
        Object[] objArr = {poiConfirmFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b9bd73fc0474afd14b61598285935153", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b9bd73fc0474afd14b61598285935153") : new e(poiConfirmFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6c301d32cbf5d5ad59734ae3808ac8d", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6c301d32cbf5d5ad59734ae3808ac8d");
        } else {
            PoiConfirmFragment.f(this.b, view);
        }
    }
}

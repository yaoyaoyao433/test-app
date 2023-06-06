package com.meituan.android.legwork.ui.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PoiConfirmFragment b;

    private f(PoiConfirmFragment poiConfirmFragment) {
        this.b = poiConfirmFragment;
    }

    public static View.OnClickListener a(PoiConfirmFragment poiConfirmFragment) {
        Object[] objArr = {poiConfirmFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0abbd28498ea7607dd4ebf6500d4c52f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0abbd28498ea7607dd4ebf6500d4c52f") : new f(poiConfirmFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe3ce059baf5706d3dd8602be79d2730", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe3ce059baf5706d3dd8602be79d2730");
        } else {
            PoiConfirmFragment.e(this.b, view);
        }
    }
}

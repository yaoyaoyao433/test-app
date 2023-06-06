package com.meituan.android.legwork.ui.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PoiConfirmFragment b;

    private h(PoiConfirmFragment poiConfirmFragment) {
        this.b = poiConfirmFragment;
    }

    public static View.OnClickListener a(PoiConfirmFragment poiConfirmFragment) {
        Object[] objArr = {poiConfirmFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5bc47ec73f5692dad167805a1f49d24", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5bc47ec73f5692dad167805a1f49d24") : new h(poiConfirmFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f63ef804c4806c628ce1c4940275133", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f63ef804c4806c628ce1c4940275133");
        } else {
            PoiConfirmFragment.c(this.b, view);
        }
    }
}

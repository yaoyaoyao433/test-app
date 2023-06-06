package com.meituan.android.legwork.ui.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class g implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PoiConfirmFragment b;

    private g(PoiConfirmFragment poiConfirmFragment) {
        this.b = poiConfirmFragment;
    }

    public static View.OnClickListener a(PoiConfirmFragment poiConfirmFragment) {
        Object[] objArr = {poiConfirmFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fa6834310cbb0d7ff37eacd826e34439", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fa6834310cbb0d7ff37eacd826e34439") : new g(poiConfirmFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d822e447f91e926e4db220fdd9f887b", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d822e447f91e926e4db220fdd9f887b");
        } else {
            PoiConfirmFragment.d(this.b, view);
        }
    }
}

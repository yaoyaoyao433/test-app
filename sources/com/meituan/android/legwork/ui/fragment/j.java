package com.meituan.android.legwork.ui.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PoiConfirmFragment b;
    private final String c;

    private j(PoiConfirmFragment poiConfirmFragment, String str) {
        this.b = poiConfirmFragment;
        this.c = str;
    }

    public static View.OnClickListener a(PoiConfirmFragment poiConfirmFragment, String str) {
        Object[] objArr = {poiConfirmFragment, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a15425f347a90e12087a07e8821ca7f6", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a15425f347a90e12087a07e8821ca7f6") : new j(poiConfirmFragment, str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a1c337a1967e46caff6569817e1c74", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a1c337a1967e46caff6569817e1c74");
        } else {
            PoiConfirmFragment.a(this.b, this.c, view);
        }
    }
}

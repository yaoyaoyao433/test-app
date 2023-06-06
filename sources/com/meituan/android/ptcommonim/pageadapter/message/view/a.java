package com.meituan.android.ptcommonim.pageadapter.message.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PTIMAbstractRefuseView b;

    private a(PTIMAbstractRefuseView pTIMAbstractRefuseView) {
        this.b = pTIMAbstractRefuseView;
    }

    public static View.OnClickListener a(PTIMAbstractRefuseView pTIMAbstractRefuseView) {
        Object[] objArr = {pTIMAbstractRefuseView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20e760e8301bd4b2d1696830a8f2a273", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20e760e8301bd4b2d1696830a8f2a273") : new a(pTIMAbstractRefuseView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b74a588c2d649c1be898a8e6a1e2f9c6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b74a588c2d649c1be898a8e6a1e2f9c6");
        } else {
            PTIMAbstractRefuseView.a(this.b, view);
        }
    }
}

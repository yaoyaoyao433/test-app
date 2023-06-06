package com.meituan.android.ptcommonim.pageadapter.message.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PTIMMachRootView b;

    private b(PTIMMachRootView pTIMMachRootView) {
        this.b = pTIMMachRootView;
    }

    public static View.OnClickListener a(PTIMMachRootView pTIMMachRootView) {
        Object[] objArr = {pTIMMachRootView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a0098ae941f122372fdaf128c1700a1", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a0098ae941f122372fdaf128c1700a1") : new b(pTIMMachRootView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "234447d310c345419f04abb6a124d7ed", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "234447d310c345419f04abb6a124d7ed");
        } else {
            PTIMMachRootView.a(this.b, view);
        }
    }
}

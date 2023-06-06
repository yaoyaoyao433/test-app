package com.meituan.android.paycommon.lib.widgets;

import android.view.View;
import com.meituan.android.paycommon.lib.widgets.CheckView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CheckView.b b;

    private c(CheckView.b bVar) {
        this.b = bVar;
    }

    public static View.OnClickListener a(CheckView.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c180aa185d46f7b8cd85df34bf94d2f3", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c180aa185d46f7b8cd85df34bf94d2f3") : new c(bVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9c517dbd5dc4ec272bae4435240f188", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9c517dbd5dc4ec272bae4435240f188");
        } else {
            CheckView.a(this.b, view);
        }
    }
}

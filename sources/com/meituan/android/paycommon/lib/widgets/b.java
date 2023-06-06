package com.meituan.android.paycommon.lib.widgets;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final CheckView b;

    private b(CheckView checkView) {
        this.b = checkView;
    }

    public static View.OnClickListener a(CheckView checkView) {
        Object[] objArr = {checkView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9369d1ab7c76a8d57136cc82a41407c5", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9369d1ab7c76a8d57136cc82a41407c5") : new b(checkView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10c14618b958797f3b5ad5c3c7fe402", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10c14618b958797f3b5ad5c3c7fe402");
        } else {
            CheckView.a(this.b, view);
        }
    }
}

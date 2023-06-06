package com.meituan.android.ptcommonim.video.play;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PTIMPreviewFragment b;

    private c(PTIMPreviewFragment pTIMPreviewFragment) {
        this.b = pTIMPreviewFragment;
    }

    public static View.OnClickListener a(PTIMPreviewFragment pTIMPreviewFragment) {
        Object[] objArr = {pTIMPreviewFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0049e1c1580e57c4df0243f012c7aac9", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0049e1c1580e57c4df0243f012c7aac9") : new c(pTIMPreviewFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62c07a65f0ee32c65b0ba15fbbf610e2", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62c07a65f0ee32c65b0ba15fbbf610e2");
        } else {
            PTIMPreviewFragment.a(this.b, view);
        }
    }
}

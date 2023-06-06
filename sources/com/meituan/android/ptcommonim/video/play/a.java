package com.meituan.android.ptcommonim.video.play;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PTIMPreviewFragment b;

    private a(PTIMPreviewFragment pTIMPreviewFragment) {
        this.b = pTIMPreviewFragment;
    }

    public static View.OnClickListener a(PTIMPreviewFragment pTIMPreviewFragment) {
        Object[] objArr = {pTIMPreviewFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8a75a3615af0b3da538b677392b7d11b", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8a75a3615af0b3da538b677392b7d11b") : new a(pTIMPreviewFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c01f6dac4f545a6418dbce46d7f4d78", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c01f6dac4f545a6418dbce46d7f4d78");
        } else {
            PTIMPreviewFragment.c(this.b, view);
        }
    }
}

package com.meituan.android.ptcommonim.video.play;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PTIMPreviewFragment b;

    private b(PTIMPreviewFragment pTIMPreviewFragment) {
        this.b = pTIMPreviewFragment;
    }

    public static View.OnClickListener a(PTIMPreviewFragment pTIMPreviewFragment) {
        Object[] objArr = {pTIMPreviewFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bafa9fb1a014e222ecd651331a57df3", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bafa9fb1a014e222ecd651331a57df3") : new b(pTIMPreviewFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc7861a292eb663edbaa22938cf79e1f", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc7861a292eb663edbaa22938cf79e1f");
        } else {
            PTIMPreviewFragment.b(this.b, view);
        }
    }
}

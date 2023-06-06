package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.android.pay.dialogfragment.NoPswGuideDialogFragment;
import com.meituan.android.pay.model.bean.NoPasswordGuide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final NoPswGuideDialogFragment.NoPswGuideDialog b;
    private final NoPasswordGuide c;

    private j(NoPswGuideDialogFragment.NoPswGuideDialog noPswGuideDialog, NoPasswordGuide noPasswordGuide) {
        this.b = noPswGuideDialog;
        this.c = noPasswordGuide;
    }

    public static View.OnClickListener a(NoPswGuideDialogFragment.NoPswGuideDialog noPswGuideDialog, NoPasswordGuide noPasswordGuide) {
        Object[] objArr = {noPswGuideDialog, noPasswordGuide};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1105316183d33235e5f82c9c0a5bf2d", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1105316183d33235e5f82c9c0a5bf2d") : new j(noPswGuideDialog, noPasswordGuide);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49af748d39f43d6e4815feb3463b412", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49af748d39f43d6e4815feb3463b412");
        } else {
            NoPswGuideDialogFragment.NoPswGuideDialog.a(this.b, this.c, view);
        }
    }
}

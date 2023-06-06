package com.meituan.android.pay.dialogfragment;

import android.view.View;
import com.meituan.android.pay.dialogfragment.NoPswGuideDialogFragment;
import com.meituan.android.pay.model.bean.NoPasswordGuide;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final NoPswGuideDialogFragment.NoPswGuideDialog b;
    private final NoPasswordGuide c;

    private i(NoPswGuideDialogFragment.NoPswGuideDialog noPswGuideDialog, NoPasswordGuide noPasswordGuide) {
        this.b = noPswGuideDialog;
        this.c = noPasswordGuide;
    }

    public static View.OnClickListener a(NoPswGuideDialogFragment.NoPswGuideDialog noPswGuideDialog, NoPasswordGuide noPasswordGuide) {
        Object[] objArr = {noPswGuideDialog, noPasswordGuide};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dcb9a1983ff44784f92ee98b2dfff8fd", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dcb9a1983ff44784f92ee98b2dfff8fd") : new i(noPswGuideDialog, noPasswordGuide);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6a50a1856ecc3c7f18ca8e1c3583fb", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6a50a1856ecc3c7f18ca8e1c3583fb");
        } else {
            NoPswGuideDialogFragment.NoPswGuideDialog.b(this.b, this.c, view);
        }
    }
}

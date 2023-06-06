package com.meituan.passport.dialogs;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final OuterOtherLoginDialogFragment b;

    public l(OuterOtherLoginDialogFragment outerOtherLoginDialogFragment) {
        this.b = outerOtherLoginDialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "397868b9bd9b789c22052cdd5fd630c0", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "397868b9bd9b789c22052cdd5fd630c0");
        } else {
            OuterOtherLoginDialogFragment.a(this.b, view);
        }
    }
}

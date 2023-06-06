package com.meituan.android.pay.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ResetPasswordGuideFragment b;

    private l(ResetPasswordGuideFragment resetPasswordGuideFragment) {
        this.b = resetPasswordGuideFragment;
    }

    public static View.OnClickListener a(ResetPasswordGuideFragment resetPasswordGuideFragment) {
        Object[] objArr = {resetPasswordGuideFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21992dd6311a5201d2328d85ddfe9f58", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21992dd6311a5201d2328d85ddfe9f58") : new l(resetPasswordGuideFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "586e7049d14aa4f174d30e47befd4aeb", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "586e7049d14aa4f174d30e47befd4aeb");
        } else {
            ResetPasswordGuideFragment.a(this.b, view);
        }
    }
}

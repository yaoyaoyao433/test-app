package com.meituan.android.pay.fragment;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final ResetPasswordGuideFragment b;

    private k(ResetPasswordGuideFragment resetPasswordGuideFragment) {
        this.b = resetPasswordGuideFragment;
    }

    public static View.OnClickListener a(ResetPasswordGuideFragment resetPasswordGuideFragment) {
        Object[] objArr = {resetPasswordGuideFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db71fecfe5356df1a55e0b110dbd7a03", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db71fecfe5356df1a55e0b110dbd7a03") : new k(resetPasswordGuideFragment);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b41864f055a059cdaf1abda0a75ec41", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b41864f055a059cdaf1abda0a75ec41");
        } else {
            ResetPasswordGuideFragment.b(this.b, view);
        }
    }
}

package com.meituan.passport.bindphone;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements com.meituan.passport.clickaction.a {
    public static ChangeQuickRedirect a;
    private final BindPhoneActivity b;

    private e(BindPhoneActivity bindPhoneActivity) {
        this.b = bindPhoneActivity;
    }

    public static com.meituan.passport.clickaction.a a(BindPhoneActivity bindPhoneActivity) {
        Object[] objArr = {bindPhoneActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "922cc30b94da00a088a9db5bde77eb92", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "922cc30b94da00a088a9db5bde77eb92") : new e(bindPhoneActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5eb3440ab4784196c3560196bce3c1f9", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5eb3440ab4784196c3560196bce3c1f9");
        } else {
            BindPhoneActivity.a(this.b, view);
        }
    }
}

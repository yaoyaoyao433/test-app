package com.meituan.passport.bindphone;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final BindPhoneActivity b;

    private b(BindPhoneActivity bindPhoneActivity) {
        this.b = bindPhoneActivity;
    }

    public static View.OnClickListener a(BindPhoneActivity bindPhoneActivity) {
        Object[] objArr = {bindPhoneActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aaa80adaa901d1e748920809db9a31b9", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aaa80adaa901d1e748920809db9a31b9") : new b(bindPhoneActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0648293595d5b2b80307937e44c79b45", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0648293595d5b2b80307937e44c79b45");
        } else {
            BindPhoneActivity.c(this.b, view);
        }
    }
}

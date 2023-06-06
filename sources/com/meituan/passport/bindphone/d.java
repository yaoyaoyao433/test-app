package com.meituan.passport.bindphone;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements com.meituan.passport.clickaction.a {
    public static ChangeQuickRedirect a;
    private final BindPhoneActivity b;

    private d(BindPhoneActivity bindPhoneActivity) {
        this.b = bindPhoneActivity;
    }

    public static com.meituan.passport.clickaction.a a(BindPhoneActivity bindPhoneActivity) {
        Object[] objArr = {bindPhoneActivity};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fdb66b78009bbde80e1d4760ef00a2ea", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fdb66b78009bbde80e1d4760ef00a2ea") : new d(bindPhoneActivity);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69510efcf3f922a34a124947fad3d000", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69510efcf3f922a34a124947fad3d000");
        } else {
            BindPhoneActivity.b(this.b, view);
        }
    }
}

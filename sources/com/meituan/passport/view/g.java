package com.meituan.passport.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements com.meituan.passport.clickaction.a {
    public static ChangeQuickRedirect a;
    private final PassportMobileInputView b;

    private g(PassportMobileInputView passportMobileInputView) {
        this.b = passportMobileInputView;
    }

    public static com.meituan.passport.clickaction.a a(PassportMobileInputView passportMobileInputView) {
        Object[] objArr = {passportMobileInputView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e22861c799cf3480d74faaa5b6c0c0bd", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e22861c799cf3480d74faaa5b6c0c0bd") : new g(passportMobileInputView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c48b6dea90ddde3ac6b6ba5369f72251", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c48b6dea90ddde3ac6b6ba5369f72251");
        } else {
            PassportMobileInputView.a(this.b, view);
        }
    }
}

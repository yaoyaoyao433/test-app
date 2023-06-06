package com.meituan.passport.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements com.meituan.passport.clickaction.a {
    public static ChangeQuickRedirect a;
    private final InputMobileView b;

    private b(InputMobileView inputMobileView) {
        this.b = inputMobileView;
    }

    public static com.meituan.passport.clickaction.a a(InputMobileView inputMobileView) {
        Object[] objArr = {inputMobileView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "60405d9a358f9a220738632dfc983935", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.passport.clickaction.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "60405d9a358f9a220738632dfc983935") : new b(inputMobileView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9f606e146c6a8a0b0546dc0fcb5906", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9f606e146c6a8a0b0546dc0fcb5906");
        } else {
            InputMobileView.a(this.b, view);
        }
    }
}

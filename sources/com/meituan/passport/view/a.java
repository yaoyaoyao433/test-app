package com.meituan.passport.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final InputMobileView b;

    private a(InputMobileView inputMobileView) {
        this.b = inputMobileView;
    }

    public static View.OnClickListener a(InputMobileView inputMobileView) {
        Object[] objArr = {inputMobileView};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e349630f6d11c32d75cce11823e0313d", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e349630f6d11c32d75cce11823e0313d") : new a(inputMobileView);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9b8d4990aadd6b60a47195a18ad24e3", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9b8d4990aadd6b60a47195a18ad24e3");
        } else {
            InputMobileView.b(this.b, view);
        }
    }
}

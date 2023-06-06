package com.meituan.passport.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PassportButton b;

    private e(PassportButton passportButton) {
        this.b = passportButton;
    }

    public static View.OnClickListener a(PassportButton passportButton) {
        Object[] objArr = {passportButton};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d84d605baa1156af0802f5621bf7fd70", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d84d605baa1156af0802f5621bf7fd70") : new e(passportButton);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff480521ec82265e1d396327edc00af5", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff480521ec82265e1d396327edc00af5");
        } else {
            PassportButton.a(this.b, view);
        }
    }
}

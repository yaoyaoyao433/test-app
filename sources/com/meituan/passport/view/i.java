package com.meituan.passport.view;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final PassportPasswordEye b;

    private i(PassportPasswordEye passportPasswordEye) {
        this.b = passportPasswordEye;
    }

    public static View.OnClickListener a(PassportPasswordEye passportPasswordEye) {
        Object[] objArr = {passportPasswordEye};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb7927fb049df63a6f15a5bc46616707", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb7927fb049df63a6f15a5bc46616707") : new i(passportPasswordEye);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "076b3c0266191f2c7bd4262935ceb1ab", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "076b3c0266191f2c7bd4262935ceb1ab");
        } else {
            PassportPasswordEye.a(this.b, view);
        }
    }
}

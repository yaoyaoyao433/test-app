package com.meituan.passport.view;

import android.text.Editable;
import com.meituan.passport.view.PassportEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class f implements PassportEditText.d {
    public static ChangeQuickRedirect a;
    private final PassportEditText b;

    private f(PassportEditText passportEditText) {
        this.b = passportEditText;
    }

    public static PassportEditText.d a(PassportEditText passportEditText) {
        Object[] objArr = {passportEditText};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a45fa30875764e8a9718f48ceb7b027", RobustBitConfig.DEFAULT_VALUE) ? (PassportEditText.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a45fa30875764e8a9718f48ceb7b027") : new f(passportEditText);
    }

    @Override // com.meituan.passport.view.PassportEditText.d
    public final void a(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "156d4bb77e8814769f6a40949d4c0a4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "156d4bb77e8814769f6a40949d4c0a4c");
        } else {
            PassportEditText.a(this.b, editable);
        }
    }
}

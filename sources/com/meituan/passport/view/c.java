package com.meituan.passport.view;

import android.text.Editable;
import com.meituan.passport.view.PassportEditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements PassportEditText.b {
    public static ChangeQuickRedirect a;
    private final InputMobileView b;

    public c(InputMobileView inputMobileView) {
        this.b = inputMobileView;
    }

    @Override // com.meituan.passport.view.PassportEditText.b
    public final boolean a(Editable editable) {
        Object[] objArr = {editable};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bc9b88098280a879fd20ab1a80da51c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bc9b88098280a879fd20ab1a80da51c")).booleanValue() : InputMobileView.a(this.b, editable);
    }
}

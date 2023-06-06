package com.meituan.passport.view;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements com.meituan.passport.module.b {
    public static ChangeQuickRedirect a;
    private final PassportButton b;

    public d(PassportButton passportButton) {
        this.b = passportButton;
    }

    @Override // com.meituan.passport.module.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c12915460b3f9ee14776ed39438b9013", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c12915460b3f9ee14776ed39438b9013");
        } else {
            this.b.setEnabled(z);
        }
    }
}

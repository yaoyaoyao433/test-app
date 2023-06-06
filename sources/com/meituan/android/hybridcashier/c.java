package com.meituan.android.hybridcashier;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements com.meituan.android.paybase.login.b {
    public static ChangeQuickRedirect a;
    private static final c b = new c();

    public static com.meituan.android.paybase.login.b a() {
        return b;
    }

    @Override // com.meituan.android.paybase.login.b
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f3892947c071bf7dda259c56b478154", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f3892947c071bf7dda259c56b478154");
            return;
        }
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f3a4890732b70962a70ff97de52c7768", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f3a4890732b70962a70ff97de52c7768");
        } else if (z) {
            com.meituan.android.hybridcashier.config.horn.a.a();
        }
    }
}

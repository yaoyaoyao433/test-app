package com.meituan.android.identifycardrecognizer.request;

import com.meituan.android.paybase.encrypt.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements b.InterfaceC0332b {
    public static ChangeQuickRedirect a;
    private static final c b = new c();

    public static b.InterfaceC0332b b() {
        return b;
    }

    @Override // com.meituan.android.paybase.encrypt.b.InterfaceC0332b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8dabd369619f68fa630f0cee59fee2ce", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8dabd369619f68fa630f0cee59fee2ce") : b.c();
    }
}

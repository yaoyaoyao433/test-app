package com.meituan.android.paybase.net;

import com.meituan.android.paybase.encrypt.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements b.InterfaceC0332b {
    public static ChangeQuickRedirect a;
    private static final b b = new b();

    public static b.InterfaceC0332b b() {
        return b;
    }

    @Override // com.meituan.android.paybase.encrypt.b.InterfaceC0332b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e65f360150fd216c40638f6bd5dc166", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e65f360150fd216c40638f6bd5dc166") : a.b();
    }
}

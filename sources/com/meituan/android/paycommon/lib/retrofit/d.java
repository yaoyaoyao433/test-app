package com.meituan.android.paycommon.lib.retrofit;

import com.meituan.android.paybase.encrypt.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements b.InterfaceC0332b {
    public static ChangeQuickRedirect a;
    private static final d b = new d();

    public static b.InterfaceC0332b b() {
        return b;
    }

    @Override // com.meituan.android.paybase.encrypt.b.InterfaceC0332b
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a4c1a194c8583f32afca8967f91107bf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a4c1a194c8583f32afca8967f91107bf") : c.b();
    }
}

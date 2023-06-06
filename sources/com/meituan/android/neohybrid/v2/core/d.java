package com.meituan.android.neohybrid.v2.core;

import com.meituan.android.neohybrid.v2.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements a.InterfaceC0311a {
    public static ChangeQuickRedirect a;
    private final a b;
    private final String c;

    private d(a aVar, String str) {
        this.b = aVar;
        this.c = str;
    }

    public static a.InterfaceC0311a a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e32ff4eb654e802d6c8e4af3e9446e2d", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0311a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e32ff4eb654e802d6c8e4af3e9446e2d") : new d(aVar, str);
    }

    @Override // com.meituan.android.neohybrid.v2.core.a.InterfaceC0311a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edb50d8367bf56b7fe5b402f509d4101", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edb50d8367bf56b7fe5b402f509d4101")).booleanValue() : a.a(this.b, this.c, aVar);
    }
}

package com.meituan.android.neohybrid.v2.core;

import com.meituan.android.neohybrid.v2.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements a.InterfaceC0311a {
    public static ChangeQuickRedirect a;
    private final String b;
    private final int c;
    private final String d;

    public k(String str, int i, String str2) {
        this.b = str;
        this.c = i;
        this.d = str2;
    }

    @Override // com.meituan.android.neohybrid.v2.core.a.InterfaceC0311a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ead77cf4b04389487500be9f0fc931b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ead77cf4b04389487500be9f0fc931b")).booleanValue() : a.a(this.b, this.c, this.d, aVar);
    }
}

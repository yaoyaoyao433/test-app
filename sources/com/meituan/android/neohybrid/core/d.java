package com.meituan.android.neohybrid.core;

import com.meituan.android.neohybrid.core.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final /* synthetic */ class d implements a.InterfaceC0302a {
    public static ChangeQuickRedirect a;
    private final a b;
    private final String c;

    private d(a aVar, String str) {
        this.b = aVar;
        this.c = str;
    }

    public static a.InterfaceC0302a a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d595ba1be191bd8217b00b8e0c1c0409", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0302a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d595ba1be191bd8217b00b8e0c1c0409") : new d(aVar, str);
    }

    @Override // com.meituan.android.neohybrid.core.a.InterfaceC0302a
    public final boolean a(com.meituan.android.neohybrid.core.listener.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "824934df25855142482cfc43d8bd5189", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "824934df25855142482cfc43d8bd5189")).booleanValue() : a.a(this.b, this.c, aVar);
    }
}

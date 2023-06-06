package com.sankuai.ehcore.horn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.ehcore.horn.b;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private static final d b = new d();

    public static a.InterfaceC0552a b() {
        return b;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dd795917c6e45d46e7d44c9565ba186", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dd795917c6e45d46e7d44c9565ba186");
        } else {
            b.AnonymousClass2.a();
        }
    }
}

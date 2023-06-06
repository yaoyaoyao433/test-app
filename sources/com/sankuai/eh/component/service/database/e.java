package com.sankuai.eh.component.service.database;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private static final e b = new e();

    public static a.InterfaceC0552a b() {
        return b;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5050fc6dce6f0ed6e8710f8e25c58614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5050fc6dce6f0ed6e8710f8e25c58614");
        } else {
            d.n();
        }
    }
}

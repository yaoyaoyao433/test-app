package com.sankuai.ehcore.horn;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final String b;
    private final String c;

    public c(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74e2d87a16d3ee02aa9dd735a7a7541a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74e2d87a16d3ee02aa9dd735a7a7541a");
        } else {
            b.a(this.b, this.c);
        }
    }
}

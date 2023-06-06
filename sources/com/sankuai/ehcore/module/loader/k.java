package com.sankuai.ehcore.module.loader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.ehcore.module.loader.g;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final g.a b;

    public k(g.a aVar) {
        this.b = aVar;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ca9c4f9b9ca934d32c51f19a2883a05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ca9c4f9b9ca934d32c51f19a2883a05");
            return;
        }
        g.a aVar = this.b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = g.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "73c1c7137759ab0014dfb8cd1d464bd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "73c1c7137759ab0014dfb8cd1d464bd5");
        } else {
            g.this.b.a();
        }
    }
}

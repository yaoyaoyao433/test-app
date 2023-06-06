package com.sankuai.ehcore.module.loader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.thread.a;
import com.sankuai.ehcore.module.loader.g;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements a.InterfaceC0552a {
    public static ChangeQuickRedirect a;
    private final g.a b;

    public l(g.a aVar) {
        this.b = aVar;
    }

    @Override // com.sankuai.eh.component.service.utils.thread.a.InterfaceC0552a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f5e4bc267f861cb9d7a347c61516d06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f5e4bc267f861cb9d7a347c61516d06");
            return;
        }
        g.a aVar = this.b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = g.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "40de76ad40dc659a2c42f4b21b803fc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "40de76ad40dc659a2c42f4b21b803fc9");
        } else {
            g.this.b.a(false);
        }
    }
}

package com.sankuai.waimai.store.drug.home.refactor.card.float_card.order;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.expose.v2.entity.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class e implements c.a {
    public static ChangeQuickRedirect a;
    private final a b;

    public e(a aVar) {
        this.b = aVar;
    }

    @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b94f05c23777a17b0b02a7bba3e1bfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b94f05c23777a17b0b02a7bba3e1bfd");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0d2b59e51784dd258aec0439bbb229ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0d2b59e51784dd258aec0439bbb229ef");
        } else if (aVar.c != null) {
            com.sankuai.waimai.store.manager.judas.b.b(aVar.b.G, aVar.d, "b_waimai_16w9r4js_mv").b(aVar.a()).a();
        }
    }
}

package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.expose.v2.entity.c;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class k implements c.a {
    public static ChangeQuickRedirect a;
    private final j b;

    private k(j jVar) {
        this.b = jVar;
    }

    public static c.a a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ed085a6f6394a40cb3b6f1e922d8cb70", RobustBitConfig.DEFAULT_VALUE) ? (c.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ed085a6f6394a40cb3b6f1e922d8cb70") : new k(jVar);
    }

    @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "206e20ea2a799bc923e6ddd0de993ec9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "206e20ea2a799bc923e6ddd0de993ec9");
            return;
        }
        j jVar = this.b;
        Object[] objArr2 = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "82e01adb53b7def1c7c5946fdcb75422", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "82e01adb53b7def1c7c5946fdcb75422");
            return;
        }
        Map<String, Object> c = jVar.c();
        if (c != null) {
            com.sankuai.waimai.store.manager.judas.b.b("c_crkfv64n", jVar.b.d(), "b_waimai_kr16apne_mv").b(c).a();
        }
    }
}

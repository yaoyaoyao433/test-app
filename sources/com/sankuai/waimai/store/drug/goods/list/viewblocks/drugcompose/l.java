package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.poi.subscribe.a;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class l implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final j b;

    private l(j jVar) {
        this.b = jVar;
    }

    public static View.OnClickListener a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d1957b70c8a8d8d2d1e4d34bdb9e978", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d1957b70c8a8d8d2d1e4d34bdb9e978") : new l(jVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "470cbad09f1626ec25057145c71e28d6", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "470cbad09f1626ec25057145c71e28d6");
            return;
        }
        final j jVar = this.b;
        Object[] objArr2 = {jVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = j.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a46c2dbf78db476dfe61a9fdfeb6cee6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a46c2dbf78db476dfe61a9fdfeb6cee6");
        } else {
            com.sankuai.waimai.store.poi.subscribe.a.a().a(jVar.b, (a.c) new com.sankuai.waimai.store.drug.goods.list.base.c(jVar.b, jVar.d, jVar.e, jVar.c) { // from class: com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.j.2
                public static ChangeQuickRedirect b;

                @Override // com.sankuai.waimai.store.poi.subscribe.a.c
                public final void a(int i) {
                    Object[] objArr3 = {Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8de6d2494d473cb2974684266a087ce2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8de6d2494d473cb2974684266a087ce2");
                        return;
                    }
                    jVar.c = i;
                    jVar.a();
                    Map<String, Object> c = jVar.c();
                    if (c != null) {
                        com.sankuai.waimai.store.manager.judas.b.a("c_crkfv64n", jVar.b.d(), "b_waimai_kr16apne_mc").b(c).a();
                    }
                }
            });
        }
    }
}

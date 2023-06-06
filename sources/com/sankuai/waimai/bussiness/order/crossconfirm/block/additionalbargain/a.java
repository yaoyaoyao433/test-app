package com.sankuai.waimai.bussiness.order.crossconfirm.block.additionalbargain;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.AdditionalBargain;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a626888c2ad0430f78c705cb61f7ab5e", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a626888c2ad0430f78c705cb61f7ab5e") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12a1e0af290639a6dbc9033a958604d1", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12a1e0af290639a6dbc9033a958604d1") : new b(m(), (f) F());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d7c4c6562ea31e6db4238690c9d000a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d7c4c6562ea31e6db4238690c9d000a");
        } else {
            ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).ah.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.additionalbargain.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r12) {
                    Object[] objArr2 = {r12};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e0fd0860c794ca89ad7bf40e69ea05a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e0fd0860c794ca89ad7bf40e69ea05a");
                        return;
                    }
                    b bVar = (b) a.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = b.d;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "10f09315bf11b4dba7261a34ff8b788e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "10f09315bf11b4dba7261a34ff8b788e");
                    } else if (bVar.g != null) {
                        List<AdditionalBargain.AdditionalBargainDetail> list = bVar.g.bargainList;
                        if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
                            for (AdditionalBargain.AdditionalBargainDetail additionalBargainDetail : list) {
                                additionalBargainDetail.selected = false;
                            }
                        }
                        if (bVar.e != null) {
                            bVar.e.a(list);
                        }
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2cffafbd723bee5f50c9eeef290c859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2cffafbd723bee5f50c9eeef290c859");
            return;
        }
        super.I();
        ((b) this.g).a(((d) this.n).p);
    }

    public final List<AdditionalBargain.AdditionalBargainDetail> M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd0a2f508f1887f742d7efe341f8103c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd0a2f508f1887f742d7efe341f8103c");
        }
        b bVar = (b) this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "04246d3062965717588632ac12b5a73c", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "04246d3062965717588632ac12b5a73c");
        }
        com.sankuai.waimai.bussiness.order.confirm.adapter.a aVar = bVar.e;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.confirm.adapter.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "8b53ab69eea04ac8de232a90e534ae36", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "8b53ab69eea04ac8de232a90e534ae36");
        }
        Iterator<AdditionalBargain.AdditionalBargainDetail> it = aVar.b.iterator();
        while (it.hasNext()) {
            AdditionalBargain.AdditionalBargainDetail next = it.next();
            if (next.count <= 0) {
                next.count = 1;
            }
        }
        return aVar.b;
    }
}

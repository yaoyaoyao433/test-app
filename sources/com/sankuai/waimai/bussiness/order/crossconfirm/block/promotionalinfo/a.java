package com.sankuai.waimai.bussiness.order.crossconfirm.block.promotionalinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.foundation.utils.h;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "030a4ed4dc219ef032fbe93911dd64db", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "030a4ed4dc219ef032fbe93911dd64db") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae90d3e4b81c948dde9d775d0be3988a", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae90d3e4b81c948dde9d775d0be3988a") : new b(m(), (f) F());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0da05829ea5352c1e46ad7262ffa8b4d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0da05829ea5352c1e46ad7262ffa8b4d");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa488fe1d3ad2f0d901d33b3c8d80252", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa488fe1d3ad2f0d901d33b3c8d80252");
            return;
        }
        super.I();
        b bVar = (b) this.g;
        c cVar = ((d) this.n).p;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "915e4fa16a7fbf150a2ce0a727f7cc85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "915e4fa16a7fbf150a2ce0a727f7cc85");
            return;
        }
        bVar.f = cVar;
        if (cVar.a) {
            double d = cVar.d;
            double d2 = cVar.c;
            Object[] objArr3 = {Double.valueOf(d), Double.valueOf(d2)};
            ChangeQuickRedirect changeQuickRedirect3 = b.d;
            if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "62c1a591f0e599e168c80be0b6e481a7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "62c1a591f0e599e168c80be0b6e481a7");
            } else {
                bVar.a(d);
                bVar.c(true);
                if (bVar.e != d2 && d2 >= 0.0d) {
                    bVar.a(d2, h.b(d2), true);
                    bVar.e = d2;
                }
            }
        } else {
            double d3 = cVar.b;
            double d4 = cVar.e;
            double d5 = cVar.e;
            Object[] objArr4 = {Double.valueOf(d3), Double.valueOf(d4), Double.valueOf(d5)};
            ChangeQuickRedirect changeQuickRedirect4 = b.d;
            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "269f2dc293eb3726be6cd04a377023a2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "269f2dc293eb3726be6cd04a377023a2");
            } else {
                bVar.a(d3 - d4);
                bVar.c(false);
                if (bVar.e != d5 && d5 >= 0.0d) {
                    bVar.a(d5, h.b(d5), true);
                    bVar.e = d5;
                }
            }
        }
        bVar.b(cVar.a);
        bVar.a(cVar.a);
    }
}

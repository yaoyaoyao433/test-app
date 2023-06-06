package com.sankuai.waimai.bussiness.order.crossconfirm.block.deliverycoupon;

import android.app.Activity;
import android.os.Bundle;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.OrderCouponRequestParams;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.deliverycoupon.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c65e0f1ec4271bf5ccdc7a7d725c0769", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c65e0f1ec4271bf5ccdc7a7d725c0769") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fee28679004bd066a88df79cd4ce856c", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fee28679004bd066a88df79cd4ce856c") : new b(m(), (f) F(), new b.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.deliverycoupon.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.deliverycoupon.b.a
            public final void a(String str, double d) {
                Object[] objArr2 = {str, Double.valueOf(d)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06ebcf13b005b22dde95a2883c4712bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06ebcf13b005b22dde95a2883c4712bb");
                } else if (((com.sankuai.waimai.bussiness.order.crossconfirm.a) a.this.F()).A.a().b == null || a.this.n == null) {
                } else {
                    OrderCouponRequestParams orderCouponRequestParams = new OrderCouponRequestParams();
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.a) a.this.F()).x.a((com.meituan.android.cube.pga.common.b<i.c<Long, OrderCouponRequestParams>>) i.a(Long.valueOf(((d) a.this.n).p.b), orderCouponRequestParams));
                    com.sankuai.waimai.bussiness.order.base.a.a((Activity) a.this.m(), 13, str, d, orderCouponRequestParams, true, ((d) a.this.n).p.f);
                }
            }
        });
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bcf1548050f5a89f29b7ecd78490011", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bcf1548050f5a89f29b7ecd78490011");
        } else {
            ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).o.a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.deliverycoupon.a.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
                @Override // com.meituan.android.cube.pga.action.b
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final /* synthetic */ void a(com.meituan.android.cube.pga.type.b.a r15) {
                    /*
                        Method dump skipped, instructions count: 225
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.crossconfirm.block.deliverycoupon.a.AnonymousClass1.a(java.lang.Object):void");
                }
            });
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8a42c857e566185a6cb1cd8a1ba2b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8a42c857e566185a6cb1cd8a1ba2b0");
            return;
        }
        super.I();
        b bVar = (b) this.g;
        c cVar = ((d) this.n).p;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "993df32bfb3baae25597ca450e1aea20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "993df32bfb3baae25597ca450e1aea20");
            return;
        }
        bVar.f = cVar;
        bVar.a(cVar);
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb23b11cdfc47b0e47427a80298b5dd5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb23b11cdfc47b0e47427a80298b5dd5");
            return;
        }
        super.b(bundle);
        b bVar = (b) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "dc38d0bc1e262cf18ced2e3885f2245b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "dc38d0bc1e262cf18ced2e3885f2245b");
        } else {
            bundle.putString("delivery_coupon_view_id", bVar.e);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60e8d0f347f964f04772f9a4998409f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60e8d0f347f964f04772f9a4998409f9");
            return;
        }
        super.c(bundle);
        b bVar = (b) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "80c1e1436e9b75f64b2f8cd851027efd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "80c1e1436e9b75f64b2f8cd851027efd");
        } else {
            bVar.e = bundle.getString("delivery_coupon_view_id");
        }
    }

    public final String M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "878eb5663be3ebabe8bec1763b0a85f6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "878eb5663be3ebabe8bec1763b0a85f6") : ((b) this.g).e;
    }
}

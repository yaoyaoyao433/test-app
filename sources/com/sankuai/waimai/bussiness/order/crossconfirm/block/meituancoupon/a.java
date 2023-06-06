package com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodParams;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.OrderCouponRequestParams;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewPoiResult;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.restaurant.membercoupon.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b591ca07f24a27c20b378f68c42792ec", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b591ca07f24a27c20b378f68c42792ec") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd971719ef3a911e05174e75a8d787ed", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd971719ef3a911e05174e75a8d787ed") : new b(m(), (f) F(), new b.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.b.a
            public final void a(String str, String str2) {
                Object[] objArr2 = {str, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0ee70c049d462fd0da92e955b13be2ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0ee70c049d462fd0da92e955b13be2ab");
                } else if (((com.sankuai.waimai.bussiness.order.crossconfirm.a) a.this.F()).A.a().b != null) {
                    OrderCouponRequestParams orderCouponRequestParams = new OrderCouponRequestParams();
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.a) a.this.F()).x.a((com.meituan.android.cube.pga.common.b<i.c<Long, OrderCouponRequestParams>>) i.a(Long.valueOf(((d) a.this.n).p.b), orderCouponRequestParams));
                    Activity activity = (Activity) a.this.m();
                    Object[] objArr3 = {activity, 6, str, orderCouponRequestParams, 1, str2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.base.a.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f58ad0d4d112ead7f55717d5ca9f2e5a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f58ad0d4d112ead7f55717d5ca9f2e5a");
                        return;
                    }
                    orderCouponRequestParams.isFromCrossOrder = true;
                    Bundle a2 = com.sankuai.waimai.bussiness.order.base.a.a(orderCouponRequestParams, str, 1, (Map<String, Object>) null);
                    a2.putBoolean("isMultiOrder", true);
                    a2.putString("otherPoiSelectedCouponViewIds", orderCouponRequestParams.otherPoiSelectedCouponViewIds);
                    if (TextUtils.isEmpty(str2)) {
                        com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.c.L, a2, 6);
                    } else if (g.a()) {
                        com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.bussiness.order.base.a.a(a2), a2, 6);
                    } else {
                        com.sankuai.waimai.foundation.router.a.a(activity, str2, a2, 6);
                    }
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.b.a
            public final void a(int i, double d, double d2, double d3) {
                Object[] objArr2 = {2, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5ba007a876cfb7692cb9e457165bd72", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5ba007a876cfb7692cb9e457165bd72");
                } else if (a.this.n != null) {
                    long j = ((d) a.this.n).p.b;
                    String str = ((d) a.this.n).p.c;
                    ArrayList arrayList = new ArrayList();
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.a) a.this.F()).al.a((com.meituan.android.cube.pga.common.b<i.c<Long, List<OrderedFood>>>) i.a(Long.valueOf(j), arrayList));
                    PoiOrderPreviewPoiResult poiOrderPreviewPoiResult = ((d) a.this.n).e().poiInfo;
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.a) a.this.F()).Y.a(new CollectOrderFoodParams(2, d, ((d) a.this.n).p.f, d2, d3, j, str, arrayList, null, 0.0d, poiOrderPreviewPoiResult == null ? 0L : poiOrderPreviewPoiResult.poiFirstCateId));
                }
            }
        });
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c6c50201519de6573c220221a1b1639", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c6c50201519de6573c220221a1b1639");
            return;
        }
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).ai.a(new com.meituan.android.cube.pga.action.b<i.c<Long, String>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(i.c<Long, String> cVar) {
                i.c<Long, String> cVar2 = cVar;
                Object[] objArr2 = {cVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9304e0061fd21a7109bbba30aa98be44", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9304e0061fd21a7109bbba30aa98be44");
                } else if (cVar2.c.longValue() == -1 || cVar2.c.longValue() == ((d) a.this.n).p.b) {
                    ((b) a.this.g).e = cVar2.d;
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).o.a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.a.2
            public static ChangeQuickRedirect a;

            /* JADX WARN: Code restructure failed: missing block: B:44:0x0119, code lost:
                if ("".equals(r1) == false) goto L24;
             */
            @Override // com.meituan.android.cube.pga.action.b
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ void a(com.meituan.android.cube.pga.type.b.a r20) {
                /*
                    Method dump skipped, instructions count: 288
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.a.AnonymousClass2.a(java.lang.Object):void");
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76368abc32899f3f388d779ecf4f1a34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76368abc32899f3f388d779ecf4f1a34");
            return;
        }
        super.I();
        ((d) this.n).p.d = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).v.a().b();
        b bVar = (b) this.g;
        c cVar = ((d) this.n).p;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "fc3c21fa1c46f94cf721fdd269a2449e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "fc3c21fa1c46f94cf721fdd269a2449e");
            return;
        }
        bVar.f = cVar;
        bVar.a(cVar);
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d07d243a2b496714a6d7c864e64016fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d07d243a2b496714a6d7c864e64016fe");
            return;
        }
        super.b(bundle);
        b bVar = (b) this.g;
        Bundle K = K();
        Object[] objArr2 = {K};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "26b0d3a46082859a5f50313878ac3fd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "26b0d3a46082859a5f50313878ac3fd1");
        } else {
            K.putString("coupon_view_id", bVar.e);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e4f9f5b567d201b4fb05eb94dbfa61b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e4f9f5b567d201b4fb05eb94dbfa61b");
            return;
        }
        super.c(bundle);
        b bVar = (b) this.g;
        Bundle K = K();
        Object[] objArr2 = {K};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "9bff0c1f6e694576edac6d0fc067ccf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "9bff0c1f6e694576edac6d0fc067ccf4");
        } else {
            bVar.e = K.getString("coupon_view_id");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f22a13e52e927fb9b58e9160f66575f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f22a13e52e927fb9b58e9160f66575f");
            return;
        }
        super.a(rect);
        if (((b) this.g).e()) {
            ((b) this.g).f();
            ((b) this.g).g();
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34aee44b33d802ec8b1a128371cd4e25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34aee44b33d802ec8b1a128371cd4e25");
            return;
        }
        super.y();
        if (((b) this.g).e()) {
            ((b) this.g).f();
            ((b) this.g).g();
        }
    }

    public final String M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "802dc8af3718d8e723b5ad997adf2246", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "802dc8af3718d8e723b5ad997adf2246") : ((b) this.g).e;
    }
}

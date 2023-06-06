package com.sankuai.waimai.bussiness.order.crossconfirm.block.root;

import android.support.constraint.R;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.block.a<e, f, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2e95e3d947b7cf383731288389d26d7", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2e95e3d947b7cf383731288389d26d7") : new f();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ e z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16ded6c2727682453e17197e38d1b232", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16ded6c2727682453e17197e38d1b232") : new e(m());
    }

    public c(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d1d7fb7eb92bc67850da92085f6fd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d1d7fb7eb92bc67850da92085f6fd0");
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [com.meituan.android.cube.pga.type.a] */
    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4ae4030784be70783c92de4acefaf0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4ae4030784be70783c92de4acefaf0c");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).P.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.root.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d36a43661ddb9a5b2d5b272f7c4a152f", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d36a43661ddb9a5b2d5b272f7c4a152f") : c.this.i();
            }
        };
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).v.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.root.c.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a586a4a12cf72162924160746cffc1a", RobustBitConfig.DEFAULT_VALUE)) {
                    return PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a586a4a12cf72162924160746cffc1a");
                }
                if (c.this.n != null) {
                    com.meituan.android.cube.pga.viewmodel.a unused = c.this.n;
                }
                return Boolean.FALSE;
            }
        };
        b((com.meituan.android.cube.pga.block.b) new a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()));
        a((com.meituan.android.cube.pga.block.a) new g((com.sankuai.waimai.bussiness.order.crossconfirm.a) F(), (ViewStub) i().findViewById(R.id.cross_order_scroll_viewstub)));
        a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.bussiness.order.crossconfirm.block.submitinfo.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F(), (ViewStub) i().findViewById(R.id.cross_order_submit_viewstub)));
        a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.bussiness.order.crossconfirm.block.floatpoisign.a(F(), (ViewStub) i().findViewById(R.id.cross_order_float_poi_sign_viewstub)));
        a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F(), (ViewStub) i().findViewById(R.id.layout_collect_food_viewstub)));
        a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.a((com.sankuai.waimai.bussiness.order.crossconfirm.a) F(), (ViewStub) i().findViewById(R.id.cross_order_actionbar_viewstub)));
    }
}

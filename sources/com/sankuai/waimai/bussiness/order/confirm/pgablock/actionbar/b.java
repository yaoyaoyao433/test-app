package com.sankuai.waimai.bussiness.order.confirm.pgablock.actionbar;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.block.a<c, a, com.sankuai.waimai.bussiness.order.confirm.a> {
    public static ChangeQuickRedirect r;
    private com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.c s;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c48ea98aaae29c7072150705d15daa8", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c48ea98aaae29c7072150705d15daa8") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82de8ac76f22354f0d21c6c7b63d5e79", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82de8ac76f22354f0d21c6c7b63d5e79") : new c(m(), "wm_order_confirm_action_bar", (com.sankuai.waimai.bussiness.order.confirm.a) F());
    }

    public b(com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2d8cf3563fa1690f9beb564bfccea8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2d8cf3563fa1690f9beb564bfccea8f");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "174b855057c6e377ee9974579727dfc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "174b855057c6e377ee9974579727dfc4");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aP.a(new com.meituan.android.cube.pga.action.b<Float>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.actionbar.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Float f) {
                Float f2 = f;
                Object[] objArr2 = {f2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a9261045209dc8ad52ee1a7dd6f8f71e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a9261045209dc8ad52ee1a7dd6f8f71e");
                } else {
                    ((c) b.this.g).a(f2.floatValue());
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e6ccd60173739a60448cac70a38e66a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e6ccd60173739a60448cac70a38e66a");
            return;
        }
        super.I();
        if (this.s == null) {
            this.s = new com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.c();
            this.s.b = "waimai-order-confirm-action_bar_style_2";
            this.s.c = "waimai-order-confirm-action_bar_style_2";
        }
        this.s.g = ((a) this.n).p;
        this.s.g.put("show_address", Boolean.valueOf(((c) this.g).e > 0.0f));
        ((c) this.g).a(this.s);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.meituan.android.cube.pga.viewmodel.a<Map<String, Object>> {
        public static ChangeQuickRedirect o;
        Map<String, Object> p;
        @NonNull
        private com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.d q;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9149b34331d3613d46c57915d60dbdd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9149b34331d3613d46c57915d60dbdd");
                return;
            }
            this.q = new com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.d();
            this.p = new HashMap();
        }

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12c32694d5b24d1e2aaede9763e83981", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12c32694d5b24d1e2aaede9763e83981");
                return;
            }
            super.d();
            if (this.c != 0) {
                this.q = com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.d.a((Map) this.c);
                this.p.putAll((Map) this.c);
            }
        }
    }
}

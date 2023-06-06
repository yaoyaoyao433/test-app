package com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer;

import android.graphics.Rect;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
@DynamicBinder(modelType = Map.class, nativeId = {"wm_order_status_common_lazyload_render"}, viewModel = a.class)
/* loaded from: classes4.dex */
public class c extends com.meituan.android.cube.pga.block.a<d, a, com.sankuai.waimai.bussiness.order.rocks.d> {
    public static ChangeQuickRedirect r;
    private e s;
    private String t;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends com.meituan.android.cube.pga.viewmodel.a<Map<String, Object>> {
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "418405c8f912eb0f6a687686171af59e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "418405c8f912eb0f6a687686171af59e") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ d z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "965d2aee3891789ca7b2673136f1cf43", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "965d2aee3891789ca7b2673136f1cf43") : new d(m(), "wm_order_status_common_lazyload_render");
    }

    public c(com.sankuai.waimai.bussiness.order.rocks.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55264c4203dfee4867bf25269b3fa05f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55264c4203dfee4867bf25269b3fa05f");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3233b8dff4cf75457816bbc987fb76fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3233b8dff4cf75457816bbc987fb76fa");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.rocks.d) F()).m.a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "22f7db216554848bc2e2d46b1ee082ef", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "22f7db216554848bc2e2d46b1ee082ef");
                } else {
                    ((d) c.this.g).f();
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a435ec1e34fe0f868e4ce4cac732cf1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a435ec1e34fe0f868e4ce4cac732cf1");
            return;
        }
        super.I();
        com.sankuai.waimai.bussiness.order.detailnew.util.g.a(((d) this.g).a());
        if (this.s == null) {
            this.s = new e();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = r;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c96b07d497fe2826cb28acff08b140b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c96b07d497fe2826cb28acff08b140b");
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = r;
                this.t = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "15e084323e5a39021f85033af3b27013", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "15e084323e5a39021f85033af3b27013") : String.valueOf(((a) this.n).e().get("module_id"));
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = r;
                String valueOf = PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a4a6c83b9585394652bfef075e747af4", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a4a6c83b9585394652bfef075e747af4") : String.valueOf(((a) this.n).e().get("template_id"));
                this.s.c = valueOf;
                this.s.d = valueOf;
                String str = this.t;
                Object[] objArr5 = {str};
                ChangeQuickRedirect changeQuickRedirect5 = r;
                Map<String, Object> map = PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "887f3a63b89f6c615b5ca9e993fc006b", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "887f3a63b89f6c615b5ca9e993fc006b") : ((com.sankuai.waimai.bussiness.order.rocks.d) F()).aQ.a(str).b;
                if (map != null && !map.isEmpty()) {
                    this.s.h = ((a) this.n).e();
                }
            }
            ((d) this.g).a(this.t);
            ((d) this.g).a(this.s);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void a(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "191c441c6eb48a0a02d5867e012e4ebd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "191c441c6eb48a0a02d5867e012e4ebd");
            return;
        }
        Iterator<com.meituan.android.cube.pga.block.a> it = q().iterator();
        while (it.hasNext()) {
            it.next().a(rect);
        }
        y();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76a40f5ff53dfc22d8f6b1486fbb308f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76a40f5ff53dfc22d8f6b1486fbb308f");
            return;
        }
        super.y();
        ((d) this.g).e();
    }
}

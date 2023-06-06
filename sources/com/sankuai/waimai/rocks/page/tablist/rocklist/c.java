package com.sankuai.waimai.rocks.page.tablist.rocklist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.rocks.page.tablist.rocklist.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.meituan.android.cube.pga.block.a<d, e, com.sankuai.waimai.rocks.page.a> {
    public static ChangeQuickRedirect r;
    private String s;
    private com.meituan.android.cube.pga.common.f t;

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ d z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8a2d29c2eb894c85172fb0546359b6e", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8a2d29c2eb894c85172fb0546359b6e") : new d(m());
    }

    public c(com.sankuai.waimai.rocks.page.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaac028c14958eded56e85c8552868fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaac028c14958eded56e85c8552868fb");
            return;
        }
        this.s = str;
        a((c) aVar);
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5e26f9b58438edf5686f8bdeceb7166", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5e26f9b58438edf5686f8bdeceb7166");
            return;
        }
        super.s();
        ((com.sankuai.waimai.rocks.page.a) F()).bA.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.rocks.page.tablist.rocklist.c.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a366f14a739881d6729dadc69067ef50", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a366f14a739881d6729dadc69067ef50");
                } else if (bool2.booleanValue() || ((d) c.this.g).e == null) {
                } else {
                    ((d) c.this.g).e.scrollToPosition(0);
                }
            }
        }).a(O());
        ((com.sankuai.waimai.rocks.page.a) F()).bH.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.rocks.page.tablist.rocklist.c.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Void r11) {
                Object[] objArr2 = {r11};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3cc2f35e2a8acaaa9db89be77aa67997", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3cc2f35e2a8acaaa9db89be77aa67997");
                } else if (((d) c.this.g).e != null) {
                    ((d) c.this.g).e.scrollToPosition(0);
                }
            }
        }).a(O());
        ((com.sankuai.waimai.rocks.page.a) F()).bI.a(new com.meituan.android.cube.pga.action.b<View>() { // from class: com.sankuai.waimai.rocks.page.tablist.rocklist.c.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(View view) {
                View view2 = view;
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f67e91c6d7bcfe03813ae95c7dda6807", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f67e91c6d7bcfe03813ae95c7dda6807");
                } else if (view2 != null) {
                    d dVar = (d) c.this.g;
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = d.d;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "35bd32977fbe472d0759ad9cdbab9304", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "35bd32977fbe472d0759ad9cdbab9304");
                    } else if (dVar.g == null || view2 == null) {
                    } else {
                        if (view2.getParent() != null) {
                            ((ViewGroup) view2.getParent()).removeView(view2);
                        }
                        dVar.g.removeView(view2);
                        dVar.g.addView(view2, new ViewGroup.LayoutParams(-1, -1));
                    }
                }
            }
        }).a(O());
        ((com.sankuai.waimai.rocks.page.a) F()).bG.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.rocks.page.tablist.rocklist.c.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "91dc1c9bd4f3be1c9a8ddb030aafe3f4", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "91dc1c9bd4f3be1c9a8ddb030aafe3f4") : ((d) c.this.g).e;
            }
        };
    }

    private com.meituan.android.cube.pga.common.f O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b480d37496c1cb4952ff0dce909e321c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.common.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b480d37496c1cb4952ff0dce909e321c");
        }
        if (this.t == null) {
            this.t = new com.meituan.android.cube.pga.common.f();
        }
        return this.t;
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e79ab6aae2a57ef7363911ed6da8953a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e79ab6aae2a57ef7363911ed6da8953a");
        }
        e eVar = ((com.sankuai.waimai.rocks.page.a) F()).by.a(this.s).b;
        if (eVar == null) {
            return super.a(viewGroup);
        }
        if (eVar.p() != null) {
            b a = eVar.p().a(m(), a.EnumC1131a.TAB_PAGE);
            d r2 = r();
            ViewGroup b = a.b();
            Object[] objArr2 = {b};
            ChangeQuickRedirect changeQuickRedirect2 = d.d;
            if (PatchProxy.isSupport(objArr2, r2, changeQuickRedirect2, false, "22389a8a8bc36128bebf969c1881d154", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, r2, changeQuickRedirect2, false, "22389a8a8bc36128bebf969c1881d154");
            } else if (b != null) {
                r2.f = b;
                r2.g.addView(b);
            }
        }
        this.n = eVar;
        eVar.a((com.sankuai.waimai.rocks.page.a) F(), r().e);
        eVar.a(false);
        viewGroup.addView(i());
        ((d) this.g).e.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.rocks.page.tablist.rocklist.c.5
            public static ChangeQuickRedirect a;

            @Override // android.support.v7.widget.RecyclerView.k
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                Object[] objArr3 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2aa50daf5515501df7b76cfe75248146", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2aa50daf5515501df7b76cfe75248146");
                    return;
                }
                super.onScrolled(recyclerView, i, i2);
                ((com.sankuai.waimai.rocks.page.a) c.this.F()).bB.a((com.meituan.android.cube.pga.common.b<RecyclerView>) recyclerView);
            }
        });
        ((com.sankuai.waimai.rocks.page.a) F()).bC.a((com.meituan.android.cube.pga.common.b<RecyclerView>) ((d) this.g).e);
        return super.a(viewGroup);
    }

    public final com.sankuai.waimai.rocks.view.a M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28908065881ad613076cccc06765ad9f", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28908065881ad613076cccc06765ad9f") : ((e) this.n).u();
    }

    public final RecyclerView N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46333eb4f23f276395f444a7f882b65a", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46333eb4f23f276395f444a7f882b65a") : ((d) this.g).e;
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2475d80d5619dc3f06d786ff3329c530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2475d80d5619dc3f06d786ff3329c530");
            return;
        }
        super.bE_();
        if (this.n != 0) {
            ((e) this.n).t();
        }
        if (this.t != null) {
            this.t.a();
        }
    }
}

package com.sankuai.waimai.restaurant.shopcart.ui;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.pga.a;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.platform.domain.core.comment.Comment;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l extends com.sankuai.waimai.business.restaurant.framework.g<com.meituan.android.cube.pga.view.a, com.meituan.android.cube.pga.viewmodel.a, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> {
    public static ChangeQuickRedirect r;
    private ab t;
    private com.sankuai.waimai.business.restaurant.poicontainer.helper.i u;
    private com.sankuai.waimai.business.restaurant.poicontainer.helper.j v;
    private com.sankuai.waimai.business.restaurant.base.manager.order.g w;

    public static /* synthetic */ void a(l lVar, final Activity activity, final String str, final GoodsSpu goodsSpu, final View view) {
        Object[] objArr = {activity, str, goodsSpu, view};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, lVar, changeQuickRedirect, false, "ef7b751b8c07b107f6f450a98fbcf9de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, lVar, changeQuickRedirect, false, "ef7b751b8c07b107f6f450a98fbcf9de");
        } else {
            com.sankuai.waimai.business.restaurant.base.manager.order.k.a().a(activity, str, goodsSpu, goodsSpu.getSkuList().get(0), goodsSpu.hasMultiSaleAttr ? goodsSpu.getAttrValuesArr() : null, new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.l.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "771cda52bbf361b3560972f02424f1e2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "771cda52bbf361b3560972f02424f1e2");
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67773035ce9690b3cf30d50b572828ac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67773035ce9690b3cf30d50b572828ac");
                        return;
                    }
                    if (com.sankuai.waimai.restaurant.shopcart.utils.d.a(str, goodsSpu) >= com.sankuai.waimai.restaurant.shopcart.utils.d.a(goodsSpu) && com.sankuai.waimai.restaurant.shopcart.utils.d.a(goodsSpu) != -1) {
                        com.sankuai.waimai.restaurant.shopcart.utils.d.a(com.sankuai.waimai.foundation.utils.activity.a.a().b());
                    }
                    if (l.this.g != null) {
                        l.this.t.a(view);
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b20d3b5baa3eaeb87337d079212eda27", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b20d3b5baa3eaeb87337d079212eda27");
                        return;
                    }
                    if (activity != null && !TextUtils.isEmpty(aVar.getMessage())) {
                        ae.a(activity, aVar.getMessage());
                    }
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.business.restaurant.base.log.d().a("add_food").c(aVar.getMessage()).b());
                }
            });
        }
    }

    public l(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4575016388cfaf2d4b20286edf190514", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4575016388cfaf2d4b20286edf190514");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc27199c7942024bc76a17f651d0e1e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc27199c7942024bc76a17f651d0e1e8");
        }
        return new com.meituan.android.cube.pga.view.a(m(), new FrameLayout(m()));
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f3e4171eb9e1f5635c2b7d34d812cf", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f3e4171eb9e1f5635c2b7d34d812cf") : new com.meituan.android.cube.pga.viewmodel.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [android.support.v4.app.FragmentActivity, android.arch.lifecycle.f] */
    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d01d47ff42107bc92df3815e59614881", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d01d47ff42107bc92df3815e59614881");
            return;
        }
        super.s();
        String w = ((BaseActivity) l()).w();
        ViewGroup viewGroup = (ViewGroup) this.g.a();
        this.w = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).u.a().b;
        this.t = new ab(l(), this.w, ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).F.a.a().b, w, (com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F());
        viewGroup.addView(this.t.a(LayoutInflater.from(m()), viewGroup));
        this.t.j();
        ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).I.j.a().b.a(l(), new com.sankuai.waimai.business.restaurant.framework.backpress.a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.l.1
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.business.restaurant.framework.backpress.a
            public final boolean b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "db2686298060a4f6c8c66cdcb1c35faf", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "db2686298060a4f6c8c66cdcb1c35faf")).booleanValue();
                }
                if (l.this.t.s()) {
                    return true;
                }
                if (l.this.u == null || !l.this.u.b()) {
                    if (l.this.v == null || !l.this.v.b()) {
                        return false;
                    }
                    l.this.v.a();
                    return true;
                }
                l.this.u.a();
                return true;
            }
        });
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9bbebad31cae1ad14eec76de94675c1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9bbebad31cae1ad14eec76de94675c1d");
        } else {
            String w2 = ((BaseActivity) l()).w();
            final com.sankuai.waimai.business.restaurant.base.manager.order.g gVar = ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).u.a().b;
            this.u = new com.sankuai.waimai.business.restaurant.poicontainer.helper.i(l(), w2, gVar, this.t, u());
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).G.a.a(new com.meituan.android.cube.pga.action.b<a.C0846a<GoodsSpu, String, String, Long, Integer>>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.l.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(a.C0846a<GoodsSpu, String, String, Long, Integer> c0846a) {
                    a.C0846a<GoodsSpu, String, String, Long, Integer> c0846a2 = c0846a;
                    Object[] objArr3 = {c0846a2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bc8671e3bf66e531eb3ced07aa18958d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bc8671e3bf66e531eb3ced07aa18958d");
                    } else {
                        l.this.u.a(gVar.f(), c0846a2.d, c0846a2.e, c0846a2.c, c0846a2.b.longValue(), c0846a2.a.intValue());
                    }
                }
            }).a(J());
            this.v = new com.sankuai.waimai.business.restaurant.poicontainer.helper.j(l(), w2, gVar, this.t, u(), new com.sankuai.waimai.business.restaurant.base.interfaces.a() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.l.4
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.interfaces.a
                public final void a(Context context, View view, String str, GoodsSpu goodsSpu) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
                    Object[] objArr3 = {context, view, str, goodsSpu};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5d5eea7893b9e26e3fc017a645986031", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5d5eea7893b9e26e3fc017a645986031");
                    } else {
                        l.a(l.this, l.this.l(), str, goodsSpu, view);
                    }
                }
            });
            this.v.l = new x() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.l.5
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.restaurant.shopcart.ui.x
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "553ee0a1eb42d83607b4178b5ec99024", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "553ee0a1eb42d83607b4178b5ec99024");
                    } else {
                        l.this.t.m = true;
                    }
                }

                @Override // com.sankuai.waimai.restaurant.shopcart.ui.x
                public final void b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2002fd2ab48cc535af96460b4523d8e6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2002fd2ab48cc535af96460b4523d8e6");
                        return;
                    }
                    l.this.t.m = false;
                    l.this.t.k();
                }
            };
            ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).G.b.a(new com.meituan.android.cube.pga.action.b<Comment>() { // from class: com.sankuai.waimai.restaurant.shopcart.ui.l.6
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Comment comment) {
                    Comment comment2 = comment;
                    Object[] objArr3 = {comment2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "614b867ade479ea8a61c4cdce0a9bbd0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "614b867ade479ea8a61c4cdce0a9bbd0");
                    } else if (l.this.v != null) {
                        l.this.v.a(com.sankuai.waimai.platform.domain.core.poi.b.a(gVar.f()), gVar.f(), comment2);
                    }
                }
            }).a(J());
        }
        this.t.c();
    }

    @Override // com.meituan.android.cube.core.f
    public final void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "178b9a5356e39ffe428066ecbda54b54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "178b9a5356e39ffe428066ecbda54b54");
            return;
        }
        super.aX_();
        if (this.t != null) {
            this.t.c();
        }
        if (this.u != null) {
            this.u.d();
        }
        if (this.v != null) {
            this.u.d();
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bc_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32fffa82e60efc2cad97bafc4b1d8828", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32fffa82e60efc2cad97bafc4b1d8828");
            return;
        }
        super.bc_();
        if (this.u != null) {
            this.u.c();
        }
        if (this.v != null) {
            this.v.c();
        }
        if (this.t != null) {
            this.t.a();
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bD_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78e3e03698c95d9a16c3df403015adcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78e3e03698c95d9a16c3df403015adcf");
            return;
        }
        super.bD_();
        if (this.t != null) {
            this.t.b();
        }
    }

    @Override // com.sankuai.waimai.business.restaurant.framework.g, com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b142a153c2dd182c1298e9fcab53478a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b142a153c2dd182c1298e9fcab53478a");
            return;
        }
        super.bE_();
        if (this.t != null) {
            this.t.d();
        }
        if (this.u != null) {
            this.u.e();
        }
        if (this.v != null) {
            this.v.f();
        }
    }
}

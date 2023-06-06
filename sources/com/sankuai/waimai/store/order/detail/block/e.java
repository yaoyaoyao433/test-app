package com.sankuai.waimai.store.order.detail.block;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.newwidgets.list.n;
import com.sankuai.waimai.store.order.detail.blockview.f;
import com.sankuai.waimai.store.order.detail.model.BizInfo;
import com.sankuai.waimai.store.order.detail.model.OrderDetailRecommendResponse;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.util.m;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
@DynamicBinder(modelType = BizInfo.class, nativeId = {"sc_order_detail_recommend_area"}, viewModel = a.class)
/* loaded from: classes5.dex */
public class e extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.store.order.detail.blockview.f, a, com.sankuai.waimai.business.order.api.detail.block.c> implements n {
    public static ChangeQuickRedirect r;
    private boolean s;
    private int t;
    private boolean u;
    private boolean v;
    private String w;

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void e() {
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f07ea0f35a36b1f6948ed88212f42157", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f07ea0f35a36b1f6948ed88212f42157") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.store.order.detail.blockview.f z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0771c4fe5cb239a5bfd9f8da6d91159d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.order.detail.blockview.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0771c4fe5cb239a5bfd9f8da6d91159d");
        }
        Boolean a2 = ((com.sankuai.waimai.business.order.api.detail.block.c) F()).o().a();
        if (a2 != null && a2.booleanValue()) {
            return new com.sankuai.waimai.store.order.detail.blockview.g(m());
        }
        return new com.sankuai.waimai.store.order.detail.blockview.f(m());
    }

    public static /* synthetic */ void l(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "d50a2c41e565d83782289f722b83f23e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "d50a2c41e565d83782289f722b83f23e");
            return;
        }
        int h = ((com.sankuai.waimai.store.order.detail.blockview.f) eVar.g).h();
        if (h > 0 && h <= 4) {
            ((com.sankuai.waimai.business.order.api.detail.block.c) eVar.F()).n().a((com.meituan.android.cube.pga.common.b<View>) null);
            ViewGroup.LayoutParams layoutParams = ((com.sankuai.waimai.store.order.detail.blockview.f) eVar.g).g().getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = -2;
                ((com.sankuai.waimai.store.order.detail.blockview.f) eVar.g).g().setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        ((com.sankuai.waimai.business.order.api.detail.block.c) eVar.F()).n().a((com.meituan.android.cube.pga.common.b<View>) eVar.i());
    }

    public static /* synthetic */ int n(e eVar) {
        int i = eVar.t;
        eVar.t = i + 1;
        return i;
    }

    public static /* synthetic */ void o(e eVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, eVar, changeQuickRedirect, false, "c5c17f5c823d5c99a70b340979a028ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, eVar, changeQuickRedirect, false, "c5c17f5c823d5c99a70b340979a028ea");
        } else {
            ((com.sankuai.waimai.business.order.api.detail.block.c) eVar.F()).m().a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.FALSE);
        }
    }

    public e(com.sankuai.waimai.business.order.api.detail.block.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e4787727a3331892f29e8787078aaec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e4787727a3331892f29e8787078aaec");
            return;
        }
        this.s = false;
        this.t = 0;
        this.u = false;
        this.v = false;
        this.w = "";
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3118bb854087b860af3784961c79a23c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3118bb854087b860af3784961c79a23c");
            return;
        }
        super.s();
        ((com.sankuai.waimai.store.order.detail.blockview.f) this.g).a(this);
        ((com.sankuai.waimai.business.order.api.detail.block.c) F()).f().a(new com.meituan.android.cube.pga.action.a() { // from class: com.sankuai.waimai.store.order.detail.block.e.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5bcfe7604853510a32e75525fc952fa2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5bcfe7604853510a32e75525fc952fa2");
                    return;
                }
                com.sankuai.waimai.store.base.net.c.a("sc_order_detail_recommend_area");
                com.sankuai.waimai.store.order.detail.blockview.f r2 = e.this.r();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.detail.blockview.f.d;
                if (PatchProxy.isSupport(objArr3, r2, changeQuickRedirect3, false, "5a1a88c6838370516c6960d8358dd550", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, r2, changeQuickRedirect3, false, "5a1a88c6838370516c6960d8358dd550");
                    return;
                }
                if (r2.h != null) {
                    r2.h.a();
                }
                com.sankuai.waimai.store.expose.v2.b.a().b(r2);
            }
        });
        ((com.sankuai.waimai.business.order.api.detail.block.c) F()).d().a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.store.order.detail.block.e.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "de22b0993cbc43e885e24f0216f50d8e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "de22b0993cbc43e885e24f0216f50d8e");
                } else if (bool2.booleanValue()) {
                    com.sankuai.waimai.store.order.detail.blockview.f fVar = (com.sankuai.waimai.store.order.detail.blockview.f) e.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.detail.blockview.f.d;
                    if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "244462689da5ed4c31b1a9830fbb11a5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "244462689da5ed4c31b1a9830fbb11a5");
                    } else {
                        com.sankuai.waimai.store.expose.v2.b.a().c(fVar);
                    }
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.detail.block.c) F()).c().a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.store.order.detail.block.e.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9419ef1de4be3688fd772dd00ee7452", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9419ef1de4be3688fd772dd00ee7452");
                } else if (bool2.booleanValue()) {
                    com.sankuai.waimai.store.order.detail.blockview.f fVar = (com.sankuai.waimai.store.order.detail.blockview.f) e.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.detail.blockview.f.d;
                    if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "75da28fa13416a11bbff0b3d55cf457c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "75da28fa13416a11bbff0b3d55cf457c");
                    } else {
                        com.sankuai.waimai.store.expose.v2.b.a().e(fVar);
                    }
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.detail.block.c) F()).e().a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.store.order.detail.block.e.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2456e8792949893c2bc7db774500973", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2456e8792949893c2bc7db774500973");
                } else if (bool2.booleanValue()) {
                    com.sankuai.waimai.store.order.detail.blockview.f fVar = (com.sankuai.waimai.store.order.detail.blockview.f) e.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.detail.blockview.f.d;
                    if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "708a768e07c3616da719213ebee997ff", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "708a768e07c3616da719213ebee997ff");
                    } else {
                        com.sankuai.waimai.store.expose.v2.b.a().f(fVar);
                    }
                }
            }
        });
        ((com.sankuai.waimai.business.order.api.detail.block.c) F()).p().b = new com.meituan.android.cube.pga.action.d<RecyclerView>() { // from class: com.sankuai.waimai.store.order.detail.block.e.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ RecyclerView a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e43f047ca520ef7323a183860d48a11", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e43f047ca520ef7323a183860d48a11") : ((com.sankuai.waimai.store.order.detail.blockview.f) e.this.g).g();
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "439377ca5c879580870ce86a9f130eb4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "439377ca5c879580870ce86a9f130eb4");
            return;
        }
        super.I();
        if (this.s) {
            return;
        }
        this.s = true;
        M();
    }

    private void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd33595044eefabe4a3d11a158d78d1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd33595044eefabe4a3d11a158d78d1d");
        } else if (this.v) {
        } else {
            this.v = true;
            com.sankuai.waimai.store.base.net.sg.a.a((Object) "sc_order_detail_recommend_area").a(t.b(((com.sankuai.waimai.business.order.api.detail.block.c) F()).i().a()), "order_detail_page", 50, this.t, this.w, new k<OrderDetailRecommendResponse>() { // from class: com.sankuai.waimai.store.order.detail.block.e.6
                public static ChangeQuickRedirect a;

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    final List<com.sankuai.waimai.store.repository.model.f> arrayList;
                    OrderDetailRecommendResponse orderDetailRecommendResponse = (OrderDetailRecommendResponse) obj;
                    Object[] objArr2 = {orderDetailRecommendResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cd249d20a3d1f950592830e90f3500a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cd249d20a3d1f950592830e90f3500a");
                        return;
                    }
                    super.a((AnonymousClass6) orderDetailRecommendResponse);
                    char c = e.this.t > 0 ? (char) 1 : (char) 0;
                    e.this.u = orderDetailRecommendResponse.hasNextPageCard;
                    if (!p.a(orderDetailRecommendResponse.extendInfo) && !TextUtils.isEmpty(orderDetailRecommendResponse.extendInfo.rankTraceId)) {
                        e.this.w = orderDetailRecommendResponse.extendInfo.rankTraceId;
                    }
                    if (orderDetailRecommendResponse.isValid()) {
                        if (c == 0) {
                            com.sankuai.waimai.store.order.detail.blockview.f fVar = (com.sankuai.waimai.store.order.detail.blockview.f) e.this.g;
                            String str = orderDetailRecommendResponse.titleText;
                            String str2 = orderDetailRecommendResponse.titleIcon;
                            Object[] objArr3 = {str, str2};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.detail.blockview.f.d;
                            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "18831a5e8a58bbc547746932a0ac8a8e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "18831a5e8a58bbc547746932a0ac8a8e");
                            } else {
                                if (!t.a(str)) {
                                    fVar.e.setText(str);
                                }
                                if (!t.a(str2)) {
                                    m.b(str2).a(fVar.f);
                                }
                            }
                        }
                        final com.sankuai.waimai.store.order.detail.blockview.f fVar2 = (com.sankuai.waimai.store.order.detail.blockview.f) e.this.g;
                        List<PoiCardInfo> list = orderDetailRecommendResponse.poiCardInfos;
                        boolean z = c ^ 1;
                        boolean z2 = e.this.u;
                        String str3 = e.this.w;
                        final f.a aVar = new f.a() { // from class: com.sankuai.waimai.store.order.detail.block.e.6.1
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.order.detail.blockview.f.a
                            public final void a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1bf39c1ad518deb6fa6cb382f3f12b1d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1bf39c1ad518deb6fa6cb382f3f12b1d");
                                    return;
                                }
                                if (((com.sankuai.waimai.store.order.detail.blockview.f) e.this.g).h() > 0) {
                                    ((com.sankuai.waimai.store.order.detail.blockview.f) e.this.g).a().setVisibility(0);
                                } else {
                                    ((com.sankuai.waimai.store.order.detail.blockview.f) e.this.g).a().setVisibility(8);
                                }
                                e.l(e.this);
                            }
                        };
                        Object[] objArr4 = {list, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), str3, aVar};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.order.detail.blockview.f.d;
                        if (PatchProxy.isSupport(objArr4, fVar2, changeQuickRedirect4, false, "a3bc17c12ff7e9ee2544eed7cdf6ac85", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, fVar2, changeQuickRedirect4, false, "a3bc17c12ff7e9ee2544eed7cdf6ac85");
                        } else {
                            fVar2.j.k = str3;
                            Object[] objArr5 = {list};
                            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.order.detail.blockview.f.d;
                            if (PatchProxy.isSupport(objArr5, fVar2, changeQuickRedirect5, false, "58928a5fb85119cb43e55fb029dfdd13", RobustBitConfig.DEFAULT_VALUE)) {
                                arrayList = (List) PatchProxy.accessDispatch(objArr5, fVar2, changeQuickRedirect5, false, "58928a5fb85119cb43e55fb029dfdd13");
                            } else {
                                arrayList = new ArrayList<>();
                                fVar2.a(list, arrayList);
                            }
                            if (z != 0) {
                                fVar2.h.a(new Runnable() { // from class: com.sankuai.waimai.store.order.detail.blockview.f.3
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a8db5feec954ea68105c13769852b81e", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a8db5feec954ea68105c13769852b81e");
                                        } else {
                                            f.a(fVar2, arrayList);
                                        }
                                    }
                                }, new Runnable() { // from class: com.sankuai.waimai.store.order.detail.blockview.f.4
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "6e82168e4e791691f48cb9a36eb84e0a", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "6e82168e4e791691f48cb9a36eb84e0a");
                                            return;
                                        }
                                        f.a(fVar2);
                                        f fVar3 = fVar2;
                                        List list2 = arrayList;
                                        Object[] objArr7 = {list2};
                                        ChangeQuickRedirect changeQuickRedirect7 = f.d;
                                        if (PatchProxy.isSupport(objArr7, fVar3, changeQuickRedirect7, false, "53c39e407d215a4d4026ad20d1ca2724", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr7, fVar3, changeQuickRedirect7, false, "53c39e407d215a4d4026ad20d1ca2724");
                                        } else {
                                            com.sankuai.waimai.store.order.detail.adapter.c cVar = fVar3.k;
                                            Object[] objArr8 = {list2};
                                            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.store.order.detail.adapter.c.a;
                                            if (PatchProxy.isSupport(objArr8, cVar, changeQuickRedirect8, false, "609a4104f3a793cb84b2257d1a07266f", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr8, cVar, changeQuickRedirect8, false, "609a4104f3a793cb84b2257d1a07266f");
                                            } else {
                                                cVar.b.clear();
                                                if (!com.sankuai.shangou.stone.util.a.b(list2)) {
                                                    cVar.b.addAll(list2);
                                                }
                                                cVar.m();
                                            }
                                            fVar3.i.a();
                                        }
                                        f.a(fVar2, aVar);
                                    }
                                });
                            } else {
                                fVar2.h.a(new Runnable() { // from class: com.sankuai.waimai.store.order.detail.blockview.f.5
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f4d7cac56acbd540bc7543428d0f839d", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f4d7cac56acbd540bc7543428d0f839d");
                                        } else {
                                            f.a(fVar2, arrayList);
                                        }
                                    }
                                }, new Runnable() { // from class: com.sankuai.waimai.store.order.detail.blockview.f.6
                                    public static ChangeQuickRedirect a;

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Object[] objArr6 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect6 = a;
                                        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "04298d5a8ab1a89333367f798ad04371", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "04298d5a8ab1a89333367f798ad04371");
                                            return;
                                        }
                                        com.sankuai.waimai.store.order.detail.adapter.c cVar = fVar2.k;
                                        List list2 = arrayList;
                                        Object[] objArr7 = {list2};
                                        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.order.detail.adapter.c.a;
                                        if (PatchProxy.isSupport(objArr7, cVar, changeQuickRedirect7, false, "2ef099e905412d048553357f613ffcdf", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr7, cVar, changeQuickRedirect7, false, "2ef099e905412d048553357f613ffcdf");
                                        } else if (list2 != null && cVar.b != null) {
                                            int size = cVar.b.size();
                                            cVar.b.addAll(list2);
                                            if (cVar.b.size() > size) {
                                                cVar.c(size, cVar.b.size() - size);
                                            }
                                            Object[] objArr8 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.store.order.detail.adapter.c.a;
                                            if (PatchProxy.isSupport(objArr8, cVar, changeQuickRedirect8, false, "3881e5543db3e5defe27150ef8a31959", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr8, cVar, changeQuickRedirect8, false, "3881e5543db3e5defe27150ef8a31959");
                                            } else if (cVar.b != null) {
                                                cVar.b(cVar.b.size(), cVar.i());
                                            }
                                        }
                                        f.a(fVar2, aVar);
                                    }
                                });
                            }
                            if (z2) {
                                fVar2.i.d();
                            } else {
                                fVar2.i.a();
                            }
                        }
                        e.n(e.this);
                        e.o(e.this);
                    }
                    e.this.v = false;
                    if (e.this.u) {
                        return;
                    }
                    ((com.sankuai.waimai.store.order.detail.blockview.f) e.this.g).e();
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25ddcac846ce14790d496cfe4cf81f4e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25ddcac846ce14790d496cfe4cf81f4e");
                        return;
                    }
                    super.a(bVar);
                    e.this.v = false;
                    com.sankuai.waimai.store.order.detail.blockview.f fVar = (com.sankuai.waimai.store.order.detail.blockview.f) e.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.detail.blockview.f.d;
                    if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "62f20c960e799274a5f4487c5357e0de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "62f20c960e799274a5f4487c5357e0de");
                    } else if (fVar.i != null) {
                        fVar.i.e();
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "afbe6aee4ee51609ab88de0da2a6f631", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "afbe6aee4ee51609ab88de0da2a6f631");
                        return;
                    }
                    super.b();
                    e.this.v = false;
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void bm_() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bd898e402e0027ef4ed6edfa69b2bcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bd898e402e0027ef4ed6edfa69b2bcd");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9689d199cf05e8cf533eb4e3f673bfd", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9689d199cf05e8cf533eb4e3f673bfd")).booleanValue();
        } else {
            z = r().h() <= 0;
        }
        if (z) {
            return;
        }
        if (this.u) {
            com.sankuai.waimai.store.order.detail.blockview.f r2 = r();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.order.detail.blockview.f.d;
            if (PatchProxy.isSupport(objArr3, r2, changeQuickRedirect3, false, "693bbeb3334745c3b12854a8e4d39afe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, r2, changeQuickRedirect3, false, "693bbeb3334745c3b12854a8e4d39afe");
            } else if (r2.i != null) {
                r2.i.d();
            }
            M();
            return;
        }
        r().e();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends com.meituan.android.cube.pga.viewmodel.a<BizInfo> {
        public static ChangeQuickRedirect o;

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final Boolean c() {
            boolean z = false;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "670b1b832661d196d0f29e80086fd2af", RobustBitConfig.DEFAULT_VALUE)) {
                return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "670b1b832661d196d0f29e80086fd2af");
            }
            if (this.c != 0 && ((BizInfo) this.c).isSgBiz()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }
}

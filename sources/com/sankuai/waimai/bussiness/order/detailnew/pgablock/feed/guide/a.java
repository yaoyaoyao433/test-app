package com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.widget.CustomDragExpandLayout;
import com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.BaseDragExpandLayout;
import com.sankuai.waimai.bussiness.order.rocks.n;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.utils.l;
import com.sankuai.waimai.rocks.model.RocksServerModel;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<e, C0916a, com.sankuai.waimai.bussiness.order.detailnew.a> implements c {
    public static ChangeQuickRedirect r;
    private d s;
    private int t;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0916a extends com.meituan.android.cube.pga.viewmodel.a {
    }

    public static /* synthetic */ d a(a aVar, n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "20efc24359137d4bd43e75d6f02348da", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "20efc24359137d4bd43e75d6f02348da");
        }
        if (nVar == null || nVar.moduleList == null || nVar.moduleList.isEmpty()) {
            return null;
        }
        for (RocksServerModel rocksServerModel : nVar.moduleList) {
            if (TextUtils.equals(rocksServerModel.moduleId, "wm_order_status_guide") && rocksServerModel.jsonData != null) {
                d dVar = new d();
                Object obj = rocksServerModel.jsonData.get("tips");
                dVar.a = com.sankuai.waimai.bussiness.order.detailnew.util.e.a(obj instanceof String ? String.valueOf(obj) : "", "#FFCC33");
                Object obj2 = rocksServerModel.jsonData.get("timer");
                dVar.b = obj2 instanceof Long ? com.sankuai.waimai.bussiness.order.detailnew.util.a.a((Long) obj2) : 0L;
                return dVar;
            }
        }
        return null;
    }

    public static /* synthetic */ int e(a aVar) {
        int i = aVar.t;
        aVar.t = i - 1;
        return i;
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f643e02950d78ba80b3e2641de35a66", RobustBitConfig.DEFAULT_VALUE) ? (C0916a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f643e02950d78ba80b3e2641de35a66") : new C0916a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ e z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca31d790ae1d3710d238054fb9baaaaf", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca31d790ae1d3710d238054fb9baaaaf") : new e(m(), this.h, this);
    }

    public a(com.sankuai.waimai.bussiness.order.detailnew.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e03b2c8eee01dc0122aacaa96c343f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e03b2c8eee01dc0122aacaa96c343f4");
            return;
        }
        this.s = new d();
        this.t = 0;
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f6c1d71d77792bf21929b250c8bc98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f6c1d71d77792bf21929b250c8bc98");
        } else {
            super.I();
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bbe4d18f88cccf8d5e5bb92ad2467c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bbe4d18f88cccf8d5e5bb92ad2467c0");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aC.a(new com.meituan.android.cube.pga.action.b<n>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(n nVar) {
                n nVar2 = nVar;
                Object[] objArr2 = {nVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b0b02e45c3b3c5b39b3951c8a47be7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b0b02e45c3b3c5b39b3951c8a47be7c");
                } else if (nVar2 != null) {
                    a.this.s = a.a(a.this, nVar2);
                    final e eVar = (e) a.this.g;
                    d dVar = a.this.s;
                    Object[] objArr3 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect3 = e.d;
                    if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "16f26bfefd6e37de26306ccb4a2bb325", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "16f26bfefd6e37de26306ccb4a2bb325");
                    } else if (dVar != null && dVar.a != null && dVar.b != 0) {
                        if (eVar.h != dVar.b) {
                            eVar.h = dVar.b;
                            l.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.e.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr4 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = a;
                                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7781aef7ec4129b21f4613e87ad480b8", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7781aef7ec4129b21f4613e87ad480b8");
                                    } else if (eVar.b != null) {
                                        eVar.b.setVisibility(8);
                                    }
                                }
                            }, ((int) eVar.h) * 1000, "hide_feed_guide");
                        }
                        eVar.f.setText(dVar.a);
                        eVar.e.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.e.2
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr4 = {view};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6be787f280a2a162eb20aaf09d531f27", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6be787f280a2a162eb20aaf09d531f27");
                                } else if (eVar.g != null) {
                                    eVar.g.b(2);
                                    eVar.g.M();
                                    eVar.e.setVisibility(8);
                                }
                            }
                        });
                        eVar.g.N();
                        l.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.e.3
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "096be02c8d6914bfaba765dc883bfe8d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "096be02c8d6914bfaba765dc883bfe8d");
                                } else {
                                    eVar.e.setVisibility(eVar.g.O() ? 8 : 0);
                                }
                            }
                        }, 200, "feed_guide_show");
                    } else {
                        eVar.e.setVisibility(8);
                    }
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aI.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                CustomDragExpandLayout customDragExpandLayout;
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f13a85924261d03f712015537ad21ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f13a85924261d03f712015537ad21ed");
                } else if (bool2 == null || (customDragExpandLayout = ((com.sankuai.waimai.bussiness.order.detailnew.a) a.this.F()).W.a().b) == null) {
                } else {
                    if ((com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) a.this.F()).ae.a().b) && !customDragExpandLayout.a()) || !bool2.booleanValue()) {
                        return;
                    }
                    e eVar = (e) a.this.g;
                    Object[] objArr3 = {8};
                    ChangeQuickRedirect changeQuickRedirect3 = e.d;
                    if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "9492549e5b3f3653f20226581fa2dbbd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "9492549e5b3f3653f20226581fa2dbbd");
                    } else if (eVar.e != null) {
                        eVar.e.setVisibility(8);
                    }
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aH.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.a.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                final CustomDragExpandLayout customDragExpandLayout;
                Object[] objArr2 = {bool};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ff013f86db4ce155053776db0411bcd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ff013f86db4ce155053776db0411bcd");
                } else if (a.this.t <= 0 || (customDragExpandLayout = ((com.sankuai.waimai.bussiness.order.detailnew.a) a.this.F()).W.a().b) == null) {
                } else {
                    if (customDragExpandLayout.a()) {
                        l.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.a.3.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b908f4cf895a520f050e7866558e2ee8", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b908f4cf895a520f050e7866558e2ee8");
                                } else {
                                    ((com.sankuai.waimai.bussiness.order.detailnew.a) a.this.F()).aG.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
                                }
                            }
                        }, 200, "scrollToFeedFlow");
                        a.e(a.this);
                        return;
                    }
                    Object[] objArr3 = {(byte) 1, "click_feed_guide"};
                    ChangeQuickRedirect changeQuickRedirect3 = BaseDragExpandLayout.b;
                    if (PatchProxy.isSupport(objArr3, customDragExpandLayout, changeQuickRedirect3, false, "e7bed805753419082f5bb6a59bd981c8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, customDragExpandLayout, changeQuickRedirect3, false, "e7bed805753419082f5bb6a59bd981c8");
                    } else if (customDragExpandLayout.c != null) {
                        final int top = customDragExpandLayout.c.getTop();
                        customDragExpandLayout.g = true;
                        customDragExpandLayout.clearAnimation();
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                        duration.addListener(new AnimatorListenerAdapter() { // from class: com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.BaseDragExpandLayout.1
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                Object[] objArr4 = {animator};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "bf527bcdca3e6839e6861fecc83fcca7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "bf527bcdca3e6839e6861fecc83fcca7");
                                    return;
                                }
                                super.onAnimationEnd(animator);
                                customDragExpandLayout.g = false;
                                customDragExpandLayout.b(r2, r3);
                            }
                        });
                        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.BaseDragExpandLayout.2
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Object[] objArr4 = {valueAnimator};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "447c1bf51195e070c6ed8d38a9ab4df5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "447c1bf51195e070c6ed8d38a9ab4df5");
                                } else if (r2) {
                                    customDragExpandLayout.a(customDragExpandLayout.c, top + ((int) ((customDragExpandLayout.e - top) * ((Float) valueAnimator.getAnimatedValue()).floatValue())));
                                } else {
                                    customDragExpandLayout.a(customDragExpandLayout.c, top + ((int) ((customDragExpandLayout.o - top) * ((Float) valueAnimator.getAnimatedValue()).floatValue())));
                                }
                            }
                        });
                        duration.start();
                    }
                }
            }
        });
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.c
    public final void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd426b1b9946f7540a5ca4aaaa4a4701", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd426b1b9946f7540a5ca4aaaa4a4701");
            return;
        }
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aH.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44bc9aa58dab0d7ad099ed88ce6bbcab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44bc9aa58dab0d7ad099ed88ce6bbcab");
            return;
        }
        com.sankuai.waimai.business.order.api.detail.model.a a = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).J.a();
        JudasManualManager.a("b_waimai_lpof9rl9_mc", "c_hgowsqb", AppUtil.generatePageInfoKey(m())).a("order_status", a != null ? a.e : -1).a("before_poi_id", com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) F()).D.a())).a("rank_list_id", ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).B.a()).a("text", this.s.a.toString()).a();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.c
    public final void b(int i) {
        this.t = 2;
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.c
    public final void N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31a60b5e2413923e2818867dbe080761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31a60b5e2413923e2818867dbe080761");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e4afde319b646a12ef367a04dca76c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e4afde319b646a12ef367a04dca76c3");
            return;
        }
        com.sankuai.waimai.business.order.api.detail.model.a a = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).J.a();
        JudasManualManager.b("b_waimai_lpof9rl9_mv", "c_hgowsqb", AppUtil.generatePageInfoKey(m())).a("order_status", a != null ? a.e : -1).a("before_poi_id", com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) F()).D.a())).a("rank_list_id", ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).B.a()).a("text", this.s.a.toString()).a();
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.c
    public final boolean O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6734ed13292da11a55bb3ed26b10287", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6734ed13292da11a55bb3ed26b10287")).booleanValue() : com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aI.a());
    }
}

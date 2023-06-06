package com.sankuai.waimai.store.v2.detail.component.root;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.android.cube.core.eventhandler.protocol.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.whiteboard.e;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.detail.components.root.b;
import com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.SGDetailNormalActionBarBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.SGDetailIndicatorBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.SGDetailMediaPagerBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.poiservice.SGPoiServiceDialogBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.quality.SGDetailQualityAssuranceDialog;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.m;
import com.sankuai.waimai.store.mach.clickhandler.a;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.methods.OnJsEventJump;
import com.sankuai.waimai.store.repository.model.DetailQualityAssurance;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.repository.model.h;
import com.sankuai.waimai.store.router.g;
import com.sankuai.waimai.store.shopping.cart.delegate.SCShopCartDelegate;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.u;
import com.sankuai.waimai.store.v2.detail.component.header.SGDetailB2CHeaderBlock;
import com.sankuai.waimai.store.v2.detail.component.header.SGDetailHeaderBlock;
import com.sankuai.waimai.store.v2.detail.component.mach.SGSyncRenderMachBlock;
import com.sankuai.waimai.store.v2.detail.component.pricebar.SGDetailPriceBarBlock;
import com.sankuai.waimai.store.v2.detail.component.pricebar.f;
import com.sankuai.waimai.store.v2.detail.component.root.b;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Cube(children = {SGDetailNormalActionBarBlock.class, SGDetailHeaderBlock.class, SGDetailPriceBarBlock.class, SGSyncRenderMachBlock.class}, interrupt = true)
/* loaded from: classes5.dex */
public class SGDetailRootBlock extends m implements d, com.sankuai.waimai.store.i.poi.a, com.sankuai.waimai.store.i.user.a, c.a, com.sankuai.waimai.store.observers.a, com.sankuai.waimai.store.shopping.cart.b, SGDetailRootBlockEventHelper, b.InterfaceC1337b {
    public static ChangeQuickRedirect g;
    private long A;
    private String B;
    private ViewGroup C;
    private GoodDetailResponse D;
    private long E;
    private boolean F;
    private final long G;
    private Runnable H;
    private SGPoiServiceDialogBlock I;
    private com.sankuai.waimai.store.recipe.a J;
    private e h;
    private com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b i;
    private SGDetailIndicatorBlock j;
    private RecyclerView k;
    private SCShopCartDelegate l;
    private ViewGroup m;
    private NetInfoLoadView n;
    private b.a o;
    private a p;
    private RelativeLayout q;
    private SGDetailHeaderBlock r;
    private SGDetailPriceBarBlock s;
    private SGDetailPriceBarBlock t;
    private List<com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a> u;
    private boolean v;
    private boolean w;
    private com.sankuai.waimai.store.consultation.a x;
    private boolean y;
    private String z;

    @Override // com.sankuai.waimai.store.i.poi.a
    public final void a(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
    }

    @Override // com.sankuai.waimai.store.shopping.cart.b
    public final String bg_() {
        return "order_business_channel";
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlockEventHelper
    public void onSGDetailPriceBarDecEventReceive(com.sankuai.waimai.store.v2.detail.component.pricebar.c cVar) {
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlockEventHelper
    public void onSGDetailPriceBarUpdateSubscribeEventReceive(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bef9b21623a0a57cc32e98d7e1edcaca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bef9b21623a0a57cc32e98d7e1edcaca");
        }
    }

    public SGDetailRootBlock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be1bc12cd06c66a168d9493b2835cd1e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be1bc12cd06c66a168d9493b2835cd1e");
            return;
        }
        this.h = new e();
        this.o = new c(this);
        this.v = false;
        this.w = true;
        this.F = false;
        this.G = 500L;
        this.H = new Runnable() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2f1b55871673be1346fc3bb0a67dc0f5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2f1b55871673be1346fc3bb0a67dc0f5");
                } else if (SGDetailRootBlock.a(SGDetailRootBlock.this)) {
                    SGDetailPriceBarBlock unused = SGDetailRootBlock.this.s;
                }
            }
        };
    }

    public static /* synthetic */ BaseModuleDesc a(SGDetailRootBlock sGDetailRootBlock, GoodDetailResponse goodDetailResponse, int i) {
        Object[] objArr = {goodDetailResponse, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, sGDetailRootBlock, changeQuickRedirect, false, "79627a4b97bc0409478b579014234f4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseModuleDesc) PatchProxy.accessDispatch(objArr, sGDetailRootBlock, changeQuickRedirect, false, "79627a4b97bc0409478b579014234f4c");
        }
        if (goodDetailResponse != null && com.sankuai.shangou.stone.util.a.c(goodDetailResponse.moduleList) > 0) {
            for (BaseModuleDesc baseModuleDesc : goodDetailResponse.moduleList) {
                if (baseModuleDesc != null && !t.a(baseModuleDesc.moduleId) && baseModuleDesc.moduleId.equals(String.valueOf(i)) && "mach".equals(baseModuleDesc.nativeId)) {
                    return baseModuleDesc;
                }
            }
            return null;
        }
        return null;
    }

    public static /* synthetic */ String a(SGDetailRootBlock sGDetailRootBlock, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, sGDetailRootBlock, changeQuickRedirect, false, "a52720bfc58bd51162383a3dd74deceb", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, sGDetailRootBlock, changeQuickRedirect, false, "a52720bfc58bd51162383a3dd74deceb");
        }
        if (goodsSpu == null || com.sankuai.shangou.stone.util.a.b(goodsSpu.getSkuList())) {
            return "-999";
        }
        ArrayList arrayList = new ArrayList();
        for (GoodsSku goodsSku : goodsSpu.getSkuList()) {
            if (goodsSku != null) {
                arrayList.add(String.valueOf(goodsSku.getSkuId()));
            }
        }
        return t.a(arrayList, CommonConstant.Symbol.COMMA);
    }

    public static /* synthetic */ void a(SGDetailRootBlock sGDetailRootBlock, int i, int i2) {
        View childAt;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, sGDetailRootBlock, changeQuickRedirect, false, "9c6b30ebeda1da14ed55161abbbbcec0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGDetailRootBlock, changeQuickRedirect, false, "9c6b30ebeda1da14ed55161abbbbcec0");
        } else if (!com.sankuai.shangou.stone.util.a.b(sGDetailRootBlock.u) && sGDetailRootBlock.i != null && sGDetailRootBlock.s != null) {
            int i3 = -1;
            for (com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a aVar : sGDetailRootBlock.u) {
                if (aVar.b < i) {
                    i3++;
                } else if (aVar.b >= i && aVar.b <= i2 && (childAt = sGDetailRootBlock.k.getChildAt(aVar.b - i)) != null) {
                    if (childAt.getTop() <= (aVar.b == 0 ? 0 : sGDetailRootBlock.i.b(sGDetailRootBlock.s.i().getHeight()))) {
                        i3++;
                    }
                }
            }
            if (sGDetailRootBlock.j != null) {
                sGDetailRootBlock.j.a(i3, !sGDetailRootBlock.k.canScrollVertically(1));
            }
        }
    }

    public static /* synthetic */ void a(SGDetailRootBlock sGDetailRootBlock, Context context, DetailQualityAssurance detailQualityAssurance, String str, String str2, String str3) {
        Object[] objArr = {context, detailQualityAssurance, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, sGDetailRootBlock, changeQuickRedirect, false, "d94cf4d428de123c79c0d61514c848b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGDetailRootBlock, changeQuickRedirect, false, "d94cf4d428de123c79c0d61514c848b6");
        } else if (context == null || detailQualityAssurance == null || com.sankuai.shangou.stone.util.a.b(detailQualityAssurance.dialogItemList)) {
        } else {
            SGDetailQualityAssuranceDialog sGDetailQualityAssuranceDialog = new SGDetailQualityAssuranceDialog(context);
            sGDetailQualityAssuranceDialog.a(detailQualityAssurance.dialogItemList, str, str2, str3);
            com.sankuai.waimai.store.util.d.b(sGDetailQualityAssuranceDialog);
        }
    }

    public static /* synthetic */ boolean a(SGDetailRootBlock sGDetailRootBlock) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, sGDetailRootBlock, changeQuickRedirect, false, "fd256663e6e4d446fbf0073527b6d7c6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, sGDetailRootBlock, changeQuickRedirect, false, "fd256663e6e4d446fbf0073527b6d7c6")).booleanValue();
        }
        if (sGDetailRootBlock.r == null) {
            sGDetailRootBlock.r = (SGDetailHeaderBlock) sGDetailRootBlock.b(SGDetailHeaderBlock.class);
        }
        if (sGDetailRootBlock.r != null) {
            if (sGDetailRootBlock.s == null) {
                sGDetailRootBlock.s = (SGDetailPriceBarBlock) sGDetailRootBlock.r.b(SGDetailPriceBarBlock.class);
            }
            if (sGDetailRootBlock.s != null) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean a(SGDetailRootBlock sGDetailRootBlock, boolean z) {
        sGDetailRootBlock.v = false;
        return false;
    }

    @Override // com.meituan.android.cube.core.f
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62285468ae00f0fb689814f40fdb0be2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62285468ae00f0fb689814f40fdb0be2");
            return;
        }
        super.a(bundle);
        this.E = SystemClock.elapsedRealtime();
        this.o.a(bundle);
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c874ec69035115fd56547b3e19d8430e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c874ec69035115fd56547b3e19d8430e") : layoutInflater.inflate(R.layout.wm_sc_goods_detail_cube_activity, viewGroup, false);
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46ea21c078856d930faad13eb71c8a8f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46ea21c078856d930faad13eb71c8a8f");
            return;
        }
        super.a_(view);
        this.m = (ViewGroup) view.findViewById(R.id.mrn_shopcart_layout);
        this.n = (NetInfoLoadView) view.findViewById(R.id.wm_st_good_detail_net);
        this.n.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.6
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c52d476ef4297237fa674b1d9750597", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c52d476ef4297237fa674b1d9750597");
                    return;
                }
                b.a unused = SGDetailRootBlock.this.o;
                SGDetailRootBlock.this.l().getIntent();
                SGDetailRootBlock.this.o();
            }
        });
        this.i = (com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b) a(R.id.rl_action_bar, (int) new SGDetailNormalActionBarBlock(10));
        this.q = (RelativeLayout) a(R.id.rl_detail_pinned_layout);
        this.C = (ViewGroup) view.findViewById(R.id.wm_st_good_detail_liveview);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ac07b86d383ccb9d3dfae28bfc1a3b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ac07b86d383ccb9d3dfae28bfc1a3b9");
        } else {
            this.k = (RecyclerView) a(R.id.rv_content_list);
            this.k.setLayoutManager(new ExtendedLinearLayoutManager(l()));
            this.k.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.7
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    Object[] objArr3 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fce1e1fcb9eb89f35121e474f2240054", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fce1e1fcb9eb89f35121e474f2240054");
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i != 0) {
                        if (i != 1 || SGDetailRootBlock.this.x == null) {
                            return;
                        }
                        SGDetailRootBlock.this.x.a();
                        return;
                    }
                    SGDetailRootBlock.a(SGDetailRootBlock.this, false);
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                    SGDetailRootBlock.a(SGDetailRootBlock.this, linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition());
                    if (SGDetailRootBlock.this.x != null) {
                        SGDetailRootBlock.this.x.b();
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    RelativeLayout relativeLayout;
                    int i3 = 0;
                    Object[] objArr3 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d997e267b1d37f8c3e695275fe3d127c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d997e267b1d37f8c3e695275fe3d127c");
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    if (SGDetailRootBlock.this.i == null || SGDetailRootBlock.this.t == null || SGDetailRootBlock.this.j == null) {
                        return;
                    }
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                    int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                    int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                    if (findFirstVisibleItemPosition != 0) {
                        SGDetailRootBlock.this.i.a(1.0f);
                    } else {
                        View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
                        SGDetailMediaPagerBlock sGDetailMediaPagerBlock = (SGDetailMediaPagerBlock) SGDetailRootBlock.this.b(SGDetailMediaPagerBlock.class);
                        SGDetailRootBlock.this.i.a(sGDetailMediaPagerBlock == null ? 0 : sGDetailMediaPagerBlock.i().getHeight(), -findViewByPosition.getTop());
                    }
                    if (SGDetailRootBlock.a(SGDetailRootBlock.this)) {
                        if (findFirstVisibleItemPosition > 0) {
                            relativeLayout = SGDetailRootBlock.this.q;
                        } else {
                            int top = SGDetailRootBlock.this.r.i().getTop();
                            int b = SGDetailRootBlock.this.i.b(SGDetailRootBlock.this.s.i().getHeight()) - SGDetailRootBlock.this.r.i().getHeight();
                            relativeLayout = SGDetailRootBlock.this.q;
                            if (top >= b) {
                                i3 = 8;
                            }
                        }
                        relativeLayout.setVisibility(i3);
                        if (SGDetailRootBlock.this.v) {
                            return;
                        }
                        SGDetailRootBlock.a(SGDetailRootBlock.this, findFirstVisibleItemPosition, findLastVisibleItemPosition);
                    }
                }
            });
        }
        l().getIntent();
        o();
        com.sankuai.waimai.store.order.a.e().a(this);
        com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this);
        com.meituan.android.bus.a.a().a(this);
        l().getIntent();
        com.sankuai.waimai.store.manager.poi.a.a().a((com.sankuai.waimai.store.i.poi.a) this);
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
        com.sankuai.waimai.store.shopping.cart.d.a().a(this);
    }

    @Override // com.meituan.android.cube.core.f
    public final void aR_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a65ccc44f211ffd4223172ed37b4c57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a65ccc44f211ffd4223172ed37b4c57");
            return;
        }
        super.aR_();
        this.o.e();
    }

    @Override // com.meituan.android.cube.core.f
    public final void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0cd1138495bbb73d8783252b3c60ce2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0cd1138495bbb73d8783252b3c60ce2");
            return;
        }
        super.aX_();
        if (this.w) {
            this.w = false;
        } else {
            this.o.a(o());
        }
        if (this.y) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b671fdb34cd7c3658e5199df6944408e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b671fdb34cd7c3658e5199df6944408e");
            } else {
                com.sankuai.waimai.store.manager.judas.b.b(m(), "b_waimai_sg_liehs5kj_mv").a("poi_id", Long.valueOf(this.A)).a("spu_id", this.B).a("stid", TextUtils.isEmpty(this.z) ? "" : this.z).a();
            }
        }
        if (this.F) {
            ba_();
            this.F = false;
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void bD_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "749d5b2d83a0eeba6b0daf226a784411", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "749d5b2d83a0eeba6b0daf226a784411");
            return;
        }
        super.bD_();
        this.o.f();
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "480714cfdcf49c0f96c25b364a7820d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "480714cfdcf49c0f96c25b364a7820d2");
            return;
        }
        super.bE_();
        com.meituan.android.bus.a.a().b(this);
        com.sankuai.waimai.store.order.a.e().b(this);
        com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
        com.sankuai.waimai.store.manager.poi.a.a().b((com.sankuai.waimai.store.i.poi.a) this);
        com.sankuai.waimai.store.shopping.cart.f.a().a(m().hashCode());
        com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b();
        com.sankuai.waimai.store.manager.coupon.c.a().b(this);
        this.o.a();
        this.k.removeCallbacks(this.H);
        com.sankuai.waimai.store.shopping.cart.d.a().b(this);
        if (this.l != null) {
            this.l.a();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7dfc2598dd7fa1eb11f34d6a9118545c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7dfc2598dd7fa1eb11f34d6a9118545c");
        } else if (this.I != null) {
            this.I.s();
            this.I = null;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = g;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b57ab88b95d721d7fb7e6023f2b5ecc8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b57ab88b95d721d7fb7e6023f2b5ecc8");
        } else if (this.J != null) {
            this.J.onDestroy();
        }
    }

    public static boolean a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5988d9af0ba82a50ab628c71d1dcdfdb", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5988d9af0ba82a50ab628c71d1dcdfdb")).booleanValue() : com.sankuai.waimai.store.order.a.e().d(j).e.b("cart_type") == 2;
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.InterfaceC1337b
    public final void a(GetMenuResponse getMenuResponse) {
        Object[] objArr = {getMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e7593aa0c88b035e2024cab982a98d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e7593aa0c88b035e2024cab982a98d4");
            return;
        }
        if (this.i != null) {
            this.i.a(getMenuResponse);
        }
        if (this.x != null) {
            this.x.a(getMenuResponse.drugImEntranceEntity, 40, this.o.b().f(), this.B);
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.InterfaceC1337b
    public final void b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166e6b62c61141eb35017d1618d95e41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166e6b62c61141eb35017d1618d95e41");
        } else if (this.r != null) {
            SGDetailHeaderBlock sGDetailHeaderBlock = this.r;
            Object[] objArr2 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = SGDetailHeaderBlock.g;
            if (PatchProxy.isSupport(objArr2, sGDetailHeaderBlock, changeQuickRedirect2, false, "bdb61c8a3585f0f36866afbd9c7c1dad", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, sGDetailHeaderBlock, changeQuickRedirect2, false, "bdb61c8a3585f0f36866afbd9c7c1dad");
                return;
            }
            if (sGDetailHeaderBlock.m != null && sGDetailHeaderBlock.m.i().getVisibility() == 0) {
                sGDetailHeaderBlock.m.a(j);
            }
            if (sGDetailHeaderBlock.n != null && sGDetailHeaderBlock.n.i().getVisibility() == 0) {
                sGDetailHeaderBlock.n.a(j);
            }
            if (!a(sGDetailHeaderBlock.h.f()) || sGDetailHeaderBlock.o == null) {
                return;
            }
            SGDetailB2CHeaderBlock sGDetailB2CHeaderBlock = sGDetailHeaderBlock.o;
            Object[] objArr3 = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect3 = SGDetailB2CHeaderBlock.g;
            if (PatchProxy.isSupport(objArr3, sGDetailB2CHeaderBlock, changeQuickRedirect3, false, "60400248bbb52cad36a3fa5b2082edb3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, sGDetailB2CHeaderBlock, changeQuickRedirect3, false, "60400248bbb52cad36a3fa5b2082edb3");
            } else if (sGDetailB2CHeaderBlock.h == null || sGDetailB2CHeaderBlock.h.i().getVisibility() != 0) {
            } else {
                sGDetailB2CHeaderBlock.h.a(j);
            }
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.b.InterfaceC1337b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfdc662c0e1b8bf4f19ceb08dd9bf347", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfdc662c0e1b8bf4f19ceb08dd9bf347");
        } else {
            o();
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a58ede7c38087a1755dd495f40d6869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a58ede7c38087a1755dd495f40d6869");
        } else if (enumC1205a == a.EnumC1205a.LOGIN) {
            o();
            if (this.l != null) {
                this.l.b();
            }
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c76e19238371f90a343f1f5f65b3e3ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c76e19238371f90a343f1f5f65b3e3ff");
        } else if (this.l != null) {
            this.l.c();
        }
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        com.sankuai.waimai.store.v2.detail.component.mach.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fd526d33b242a14a880cf3fe8bd3567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fd526d33b242a14a880cf3fe8bd3567");
        } else if (!l().x()) {
            this.F = true;
        } else {
            this.h.a("updateOrderGood", (Object) null);
            if (this.l != null) {
                this.l.h();
            }
            if (this.p == null || com.sankuai.shangou.stone.util.a.a((List) this.p.b) <= 0) {
                return;
            }
            for (com.sankuai.waimai.store.goods.detail.components.root.b bVar : this.p.b) {
                if ((bVar instanceof b.a) && (aVar = ((b.a) bVar).g) != null) {
                    aVar.a("goods_detail_update_shopcart_account", t());
                }
            }
        }
    }

    private Map<String, Object> t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c39d2a9b621d4441030fe00d0b978143", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c39d2a9b621d4441030fe00d0b978143");
        }
        List<OrderedFood> g2 = com.sankuai.waimai.store.order.a.e().g(this.A);
        if (com.sankuai.shangou.stone.util.a.a((List) g2) > 0) {
            ArrayList arrayList = new ArrayList();
            for (OrderedFood orderedFood : g2) {
                if (orderedFood != null) {
                    long j = orderedFood.spu == null ? 0L : orderedFood.spu.id;
                    int count = orderedFood.getCount();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("spu_id", j);
                        jSONObject.put("count", count);
                        arrayList.add(jSONObject);
                    } catch (Exception unused) {
                    }
                }
            }
            if (com.sankuai.shangou.stone.util.a.a((List) arrayList) > 0) {
                HashMap hashMap = new HashMap();
                hashMap.put("shopcart_item_list", arrayList);
                return hashMap;
            }
            return null;
        }
        return null;
    }

    @Subscribe
    public void onBindMemberCardSuccess(com.sankuai.waimai.store.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f25fd1c80eb6ac614c7a080347e50196", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f25fd1c80eb6ac614c7a080347e50196");
        } else {
            o();
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlockEventHelper
    public void onSGDetailActionBarBackEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74d55b6ae7d1c308bc3881a7aea44c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74d55b6ae7d1c308bc3881a7aea44c8");
        } else if (this.o.d()) {
            if (this.o.c() != null) {
                com.sankuai.waimai.store.manager.judas.b.a(l(), "b_Lqa4m").a("poi_id", Long.valueOf(this.o.b().f())).a("spu_id", Long.valueOf(this.o.c().getId())).a();
            }
            l().finish();
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlockEventHelper
    public void onSGDetailIndicatorClickEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e4af2703019cf30b4d4a05fa79ffae4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e4af2703019cf30b4d4a05fa79ffae4");
            return;
        }
        int i = bVar.a;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ce8548c3cd268ca48ee658e762cfa789", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ce8548c3cd268ca48ee658e762cfa789");
        } else if (this.i == null || this.s == null) {
        } else {
            this.v = true;
            ExtendedLinearLayoutManager extendedLinearLayoutManager = (ExtendedLinearLayoutManager) this.k.getLayoutManager();
            int b = i == 0 ? 0 : this.i.b(this.s.i().getHeight());
            Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(b)};
            ChangeQuickRedirect changeQuickRedirect3 = ExtendedLinearLayoutManager.a;
            if (PatchProxy.isSupport(objArr3, extendedLinearLayoutManager, changeQuickRedirect3, false, "7f79fb37326a1daf2efd2b1740e3e8b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, extendedLinearLayoutManager, changeQuickRedirect3, false, "7f79fb37326a1daf2efd2b1740e3e8b0");
            } else if (extendedLinearLayoutManager.b != null) {
                Context context = extendedLinearLayoutManager.b.getContext();
                Object[] objArr4 = {context, extendedLinearLayoutManager, Integer.valueOf(b)};
                ChangeQuickRedirect changeQuickRedirect4 = ExtendedLinearLayoutManager.a.a;
                ExtendedLinearLayoutManager.a aVar = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "0a3d3a79d8815d521f3b6c234a42fb94", RobustBitConfig.DEFAULT_VALUE) ? (ExtendedLinearLayoutManager.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "0a3d3a79d8815d521f3b6c234a42fb94") : new ExtendedLinearLayoutManager.a(context, extendedLinearLayoutManager, -1, b, false);
                aVar.setTargetPosition(i);
                extendedLinearLayoutManager.startSmoothScroll(aVar);
            }
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlockEventHelper
    public void onSGDetailPriceBarAddEventReceive(com.sankuai.waimai.store.shopping.cart.Event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "329eb5b4c7ae7b12a43b5a9681cc014b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "329eb5b4c7ae7b12a43b5a9681cc014b");
            return;
        }
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5ced2970ab61d94eef6f4403d884ce36", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5ced2970ab61d94eef6f4403d884ce36");
            return;
        }
        com.sankuai.waimai.store.shopping.cart.f.a().a(aVar.a, this.A);
        if (this.l != null) {
            this.l.a(aVar != null ? aVar.b : null);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMachAddEvent(a.C1218a c1218a) {
        Object[] objArr = {c1218a};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e10179b2dc78d7244810b2410fdc93a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e10179b2dc78d7244810b2410fdc93a");
        } else if (m() != c1218a.b || c1218a == null || c1218a.d != this.A || c1218a.f == null) {
        } else {
            final View view = c1218a.c;
            final GoodsSpu goodsSpu = c1218a.f;
            final long j = c1218a.d;
            int i = c1218a.h;
            if (c1218a.h > 0) {
                com.sankuai.waimai.store.order.a.e().a(j, goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.8
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13de9b3431af2399af2a7b970e6571da", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13de9b3431af2399af2a7b970e6571da");
                        }
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                        Object[] objArr2 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc14d3706fc9def7971b882d836789d6", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc14d3706fc9def7971b882d836789d6");
                            return;
                        }
                        if (view != null) {
                            com.sankuai.waimai.store.shopping.cart.f.a().a(view, SGDetailRootBlock.this.m().hashCode(), String.valueOf(j));
                        }
                        if (SGDetailRootBlock.this.l != null) {
                            SGDetailRootBlock.this.l.a(goodsSpu);
                        }
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e769188c9ce0fcd5aee33240997d2ca", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e769188c9ce0fcd5aee33240997d2ca");
                        } else if (TextUtils.isEmpty(aVar.getMessage())) {
                        } else {
                            am.a((Activity) SGDetailRootBlock.this.l(), aVar.getMessage());
                        }
                    }
                });
            } else if (i < 0) {
                com.sankuai.waimai.store.order.a.e().b(j, goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.9
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a747598775cef7ddd7ddda7e124a706", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a747598775cef7ddd7ddda7e124a706");
                        } else if (TextUtils.isEmpty(aVar.getMessage())) {
                        } else {
                            am.a((Activity) SGDetailRootBlock.this.l(), aVar.getMessage());
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlockEventHelper
    public void onSGDetailPriceBarMultiEventReceive(com.sankuai.waimai.store.v2.detail.component.pricebar.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "943f99e90e39f993777edb143f636c75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "943f99e90e39f993777edb143f636c75");
        } else {
            g.a(l(), this.o.c(), this.o.b().b, 2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlockEventHelper
    public void onSGDetailMachEventReceive(final com.sankuai.waimai.store.goods.detail.components.subroot.mach.b bVar) {
        char c;
        com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a aVar;
        Map<String, Object> t;
        Object obj;
        int i = 0;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1539031982b58d19dce917eb869cb46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1539031982b58d19dce917eb869cb46");
        } else if (bVar == null) {
        } else {
            String str = bVar.b;
            switch (str.hashCode()) {
                case -1293350888:
                    if (str.equals("foods_detail_click_foods_item")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -863343980:
                    if (str.equals("goods_detail_add_shopcart_event")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -159055313:
                    if (str.equals("open_quality_assurance_dialog")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3273774:
                    if (str.equals("jump")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 396221103:
                    if (str.equals("goods_detail_sku_dialog")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 872167253:
                    if (str.equals("goods_detail_anchor_event")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 1376356524:
                    if (str.equals("foods_detail_open_cook_book_float")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1444983831:
                    if (str.equals("poi_header_coupon_tab_dialog_click")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1491140376:
                    if (str.equals("goods_detail_load_shopcart_account")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1880582625:
                    if (str.equals("foods_detail_open_service_float")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    Map<String, Object> map = bVar.c;
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = g;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3453dab916a9a3f06ea5e5df53f6857", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3453dab916a9a3f06ea5e5df53f6857");
                        return;
                    }
                    int a = u.a(map, "type", -1);
                    int c2 = com.sankuai.shangou.stone.util.a.c(this.u);
                    while (true) {
                        if (i >= c2) {
                            aVar = null;
                        } else {
                            aVar = (com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a) com.sankuai.shangou.stone.util.a.a((List<Object>) this.u, i);
                            if (aVar == null || aVar.c != a) {
                                i++;
                            }
                        }
                    }
                    if (aVar != null) {
                        onSGDetailIndicatorClickEventReceive(new com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.b(aVar.b));
                        return;
                    }
                    return;
                case 1:
                    final Map<String, Object> map2 = bVar.c;
                    Object[] objArr3 = {map2};
                    ChangeQuickRedirect changeQuickRedirect3 = g;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "617e195676490d5128f270d89ce548ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "617e195676490d5128f270d89ce548ad");
                        return;
                    } else if (map2 != null) {
                        al.a(new al.b<DetailQualityAssurance>() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.5
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ DetailQualityAssurance a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "cf6c258b183e9b444ec6035e1e60bf53", RobustBitConfig.DEFAULT_VALUE) ? (DetailQualityAssurance) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "cf6c258b183e9b444ec6035e1e60bf53") : (DetailQualityAssurance) i.a(i.a(map2), DetailQualityAssurance.class);
                            }

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(DetailQualityAssurance detailQualityAssurance) {
                                DetailQualityAssurance detailQualityAssurance2 = detailQualityAssurance;
                                Object[] objArr4 = {detailQualityAssurance2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3eabd7f0c5f699c03e60c567251e67e3", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3eabd7f0c5f699c03e60c567251e67e3");
                                } else {
                                    SGDetailRootBlock.a(SGDetailRootBlock.this, SGDetailRootBlock.this.m(), detailQualityAssurance2, SGDetailRootBlock.this.z, String.valueOf(SGDetailRootBlock.this.o.b().f()), String.valueOf(SGDetailRootBlock.this.o.c().getId()));
                                }
                            }
                        }, o());
                        return;
                    } else {
                        return;
                    }
                case 2:
                    final Map<String, Object> map3 = bVar.c;
                    Object[] objArr4 = {map3};
                    ChangeQuickRedirect changeQuickRedirect4 = g;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "1dde1d2d5308da0643d0b04608c91c1e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "1dde1d2d5308da0643d0b04608c91c1e");
                        return;
                    } else if (map3 == null || map3.get("spu") == null) {
                        return;
                    } else {
                        al.a(new al.b<GoodsSpu>() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ GoodsSpu a() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "c688991f47d98ea5995737eb58780156", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSpu) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "c688991f47d98ea5995737eb58780156") : (GoodsSpu) i.a(i.a(map3.get("spu")), GoodsSpu.class);
                            }

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                                GoodsSpu goodsSpu2 = goodsSpu;
                                Object[] objArr5 = {goodsSpu2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "51c8650272ac67bc336d287623610ce0", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "51c8650272ac67bc336d287623610ce0");
                                } else if (goodsSpu2 != null) {
                                    com.sankuai.waimai.store.order.a.e().a(SGDetailRootBlock.this.A, goodsSpu2, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu2.skus, 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.3.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                        public final void a() {
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "02a4d58d6406141b1eb7aabf06ba6006", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "02a4d58d6406141b1eb7aabf06ba6006");
                                            }
                                        }

                                        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                        public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                                        }

                                        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                        public final void a(com.sankuai.waimai.store.exceptions.a aVar2) {
                                            Object[] objArr6 = {aVar2};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a36a99bd88518d94dbe7c5995a08b134", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a36a99bd88518d94dbe7c5995a08b134");
                                            } else if (TextUtils.isEmpty(aVar2.getMessage())) {
                                            } else {
                                                am.a((Activity) SGDetailRootBlock.this.l(), aVar2.getMessage());
                                                SGDetailRootBlock.this.ba_();
                                            }
                                        }
                                    });
                                }
                            }
                        }, o());
                        return;
                    }
                case 3:
                    final Map<String, Object> map4 = bVar.c;
                    Object[] objArr5 = {map4};
                    ChangeQuickRedirect changeQuickRedirect5 = g;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "6734f9568b2f13f003c41fb41931f549", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "6734f9568b2f13f003c41fb41931f549");
                        return;
                    } else if (map4 == null || map4.get("spu") == null) {
                        return;
                    } else {
                        al.a(new al.b<GoodsSpu>() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.4
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ GoodsSpu a() {
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                return PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e3b5857749fb62393c7d0b3b493a42d7", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSpu) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e3b5857749fb62393c7d0b3b493a42d7") : (GoodsSpu) i.a(i.a(map4.get("spu")), GoodsSpu.class);
                            }

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                                GoodsSpu goodsSpu2 = goodsSpu;
                                Object[] objArr6 = {goodsSpu2};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "cde425ea07b5e529159c2c1e73b3becc", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "cde425ea07b5e529159c2c1e73b3becc");
                                } else if (goodsSpu2 != null) {
                                    g.a(SGDetailRootBlock.this.l(), goodsSpu2, SGDetailRootBlock.this.o.b().b, 2);
                                }
                            }
                        }, o());
                        return;
                    }
                case 4:
                    Object[] objArr6 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect6 = g;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e3ae1712beab2e2b3551aaebff52cc8a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e3ae1712beab2e2b3551aaebff52cc8a");
                        return;
                    } else if (bVar == null || (t = t()) == null) {
                        return;
                    } else {
                        bVar.a.b("goods_detail_update_shopcart_account", t);
                        return;
                    }
                case 5:
                    if (bVar.c != null) {
                        Map<String, Object> map5 = bVar.c;
                        Object[] objArr7 = {map5};
                        ChangeQuickRedirect changeQuickRedirect7 = g;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "af64454563d427a83bede1cc846b8446", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "af64454563d427a83bede1cc846b8446");
                            return;
                        } else {
                            new OnJsEventJump().a(new com.sankuai.waimai.store.mach.event.a() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.10
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.mach.event.a
                                public final void b(@NonNull String str2, @Nullable Map<String, Object> map6) {
                                }

                                @Override // com.sankuai.waimai.store.mach.event.a
                                public final Activity a() {
                                    Object[] objArr8 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect8 = a;
                                    return PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "4bd080e7f5a806f82117e61261d80b3a", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "4bd080e7f5a806f82117e61261d80b3a") : SGDetailRootBlock.this.l();
                                }
                            }, null, map5);
                            return;
                        }
                    }
                    return;
                case 6:
                    Object[] objArr8 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect8 = g;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "eb0b31025e8dfec4759e94fd897d9644", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "eb0b31025e8dfec4759e94fd897d9644");
                        return;
                    } else if (bVar == null || this.D == null) {
                        return;
                    } else {
                        final boolean a2 = a(bVar.c);
                        al.a(new al.b<h>() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.11
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(h hVar) {
                                h hVar2 = hVar;
                                Object[] objArr9 = {hVar2};
                                ChangeQuickRedirect changeQuickRedirect9 = a;
                                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "d1eb03b4ae5039158e0b405a5f28f5a5", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "d1eb03b4ae5039158e0b405a5f28f5a5");
                                } else if (hVar2 == null) {
                                } else {
                                    com.sankuai.waimai.store.coupons.a a3 = com.sankuai.waimai.store.coupons.a.a();
                                    SCBaseActivity q = SGDetailRootBlock.this.l();
                                    com.sankuai.waimai.store.platform.domain.manager.poi.a b = SGDetailRootBlock.this.o.b();
                                    Object[] objArr10 = {q, b, hVar2};
                                    ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.store.coupons.a.a;
                                    if (PatchProxy.isSupport(objArr10, a3, changeQuickRedirect10, false, "007d33dec3a89537c8f7657a254ffffe", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr10, a3, changeQuickRedirect10, false, "007d33dec3a89537c8f7657a254ffffe");
                                        return;
                                    }
                                    a3.c = hVar2;
                                    a3.a(q, b, hVar2.e, hVar2.d, 1);
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            @Override // com.sankuai.waimai.store.util.al.b
                            @Nullable
                            /* renamed from: b */
                            public h a() {
                                Object[] objArr9 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect9 = a;
                                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "909aa1a019334a68e38f2cceea3017b7", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (h) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "909aa1a019334a68e38f2cceea3017b7");
                                }
                                if (!a2) {
                                    BaseModuleDesc a3 = SGDetailRootBlock.a(SGDetailRootBlock.this, SGDetailRootBlock.this.D, 10003);
                                    if (a3 == null) {
                                        return null;
                                    }
                                    String a4 = i.a(a3.jsonData.get("product_coupon_Info"));
                                    h hVar = new h();
                                    try {
                                        hVar.a(new JSONObject(a4));
                                    } catch (JSONException e) {
                                        com.sankuai.shangou.stone.util.log.a.a(e);
                                    }
                                    return hVar;
                                }
                                return SGDetailRootBlock.this.D.mProductCouponInfo;
                            }
                        }, o());
                        return;
                    }
                case 7:
                    Object[] objArr9 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect9 = g;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "3f2e621a7b1848bda5ea4e231c17702d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "3f2e621a7b1848bda5ea4e231c17702d");
                        return;
                    } else if (bVar == null || this.D == null) {
                        return;
                    } else {
                        final boolean a3 = a(bVar.c);
                        al.a(new al.b<List<Poi.PoiImpressLabel>>() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.12
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            @Nullable
                            public final /* synthetic */ List<Poi.PoiImpressLabel> a() {
                                Object[] objArr10 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "1151e0da219a5bc22e481e3edab4bbf2", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (List) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "1151e0da219a5bc22e481e3edab4bbf2");
                                }
                                if (!a3) {
                                    BaseModuleDesc a4 = SGDetailRootBlock.a(SGDetailRootBlock.this, SGDetailRootBlock.this.D, 10006);
                                    if (a4 == null) {
                                        return null;
                                    }
                                    return (List) i.a(i.a(a4.jsonData.get("poi_label_info")), new TypeToken<ArrayList<Poi.PoiImpressLabel>>() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.12.1
                                    }.getType());
                                }
                                return SGDetailRootBlock.this.D.poiServiceList;
                            }

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(List<Poi.PoiImpressLabel> list) {
                                List<Poi.PoiImpressLabel> list2 = list;
                                Object[] objArr10 = {list2};
                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "c90a05b94b70cbec668e630b95fb6fd6", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "c90a05b94b70cbec668e630b95fb6fd6");
                                } else if (list2 == null) {
                                } else {
                                    if (SGDetailRootBlock.this.I == null) {
                                        SGDetailRootBlock.this.I = new SGPoiServiceDialogBlock(SGDetailRootBlock.this.m());
                                    }
                                    SGDetailRootBlock.this.I.a(list2, (List<Poi.PoiImpressLabel>) null, new SGPoiServiceDialogBlock.a() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.12.2
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.store.goods.detail.components.subroot.poiservice.SGPoiServiceDialogBlock.a
                                        public final void a() {
                                            Object[] objArr11 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect11 = a;
                                            if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "024baa7c798cca021482bcc919253c58", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "024baa7c798cca021482bcc919253c58");
                                            } else {
                                                com.sankuai.waimai.store.manager.judas.b.b(SGDetailRootBlock.this.l(), "b_waimai_n9a7txz7_mv").a("poi_id", Long.valueOf(SGDetailRootBlock.this.A)).a("spu_id", Long.valueOf(SGDetailRootBlock.this.D.mFoodSpu == null ? -999L : SGDetailRootBlock.this.D.mFoodSpu.getId())).a("sku_id", SGDetailRootBlock.a(SGDetailRootBlock.this, SGDetailRootBlock.this.D.mFoodSpu)).a();
                                            }
                                        }
                                    });
                                }
                            }
                        }, o());
                        return;
                    }
                case '\b':
                    Object[] objArr10 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect10 = g;
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "2d01d1a91eb981fbe26f9c11b4585579", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "2d01d1a91eb981fbe26f9c11b4585579");
                        return;
                    } else if (bVar == null || bVar.c == null || bVar.c.get("currrentCookBookIndex") == null || (obj = bVar.c.get("currrentCookBookIndex")) == null) {
                        return;
                    } else {
                        if (this.J == null) {
                            this.J = new com.sankuai.waimai.store.recipe.a(m(), this.o.b(), o());
                            this.J.bindView(null);
                        }
                        this.J.a(String.valueOf(obj), this.o.c());
                        return;
                    }
                case '\t':
                    Object[] objArr11 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect11 = g;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "a322a3de4f08fb5c4f5f518eb35b1247", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "a322a3de4f08fb5c4f5f518eb35b1247");
                        return;
                    } else if (bVar == null || bVar.c == null || bVar.c.get("good_spu") == null) {
                        return;
                    } else {
                        al.a(new al.b<GoodsSpu>() { // from class: com.sankuai.waimai.store.v2.detail.component.root.SGDetailRootBlock.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                                GoodsSpu goodsSpu2 = goodsSpu;
                                Object[] objArr12 = {goodsSpu2};
                                ChangeQuickRedirect changeQuickRedirect12 = a;
                                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "3b0fc52ab736f99b9c02cd80f11f8926", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "3b0fc52ab736f99b9c02cd80f11f8926");
                                } else if (goodsSpu2 == null || SGDetailRootBlock.this.l() == null) {
                                } else {
                                    g.a(SGDetailRootBlock.this.l(), goodsSpu2, SGDetailRootBlock.this.o.b().b);
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            @Override // com.sankuai.waimai.store.util.al.b
                            /* renamed from: b */
                            public GoodsSpu a() {
                                Object[] objArr12 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect12 = a;
                                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "30f72d89de4a67fc83ca9605329073fa", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (GoodsSpu) PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "30f72d89de4a67fc83ca9605329073fa");
                                }
                                String a4 = i.a(bVar.c.get("good_spu"));
                                GoodsSpu goodsSpu = new GoodsSpu();
                                try {
                                    goodsSpu.parseJson(new JSONObject(a4));
                                } catch (JSONException e) {
                                    com.sankuai.shangou.stone.util.log.a.a(e);
                                }
                                return goodsSpu;
                            }
                        }, o());
                        return;
                    }
                default:
                    return;
            }
        }
    }

    private boolean a(Map<String, Object> map) {
        Object obj;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22f5eb4afc40383e0aa98ed0363df07b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22f5eb4afc40383e0aa98ed0363df07b")).booleanValue();
        }
        if (map == null || (obj = map.get("use_native_data")) == null) {
            return false;
        }
        return "true".equals(String.valueOf(obj));
    }

    @Override // com.meituan.android.cube.core.eventhandler.protocol.d
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85b8e8fb04bf7bd8e28196862662fa6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85b8e8fb04bf7bd8e28196862662fa6b");
        } else {
            this.o.b(bundle);
        }
    }

    @Override // com.sankuai.waimai.store.i.poi.a
    public final void c_(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7bc41d1f23ab56ce6cdde23f6621d4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7bc41d1f23ab56ce6cdde23f6621d4c");
        } else if (com.sankuai.waimai.store.order.a.e().b(str, this.o.b().d())) {
            o();
        }
    }

    @Override // com.sankuai.waimai.store.m
    public final boolean r() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f380be93cc39ad1f6289cc13d3d385f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f380be93cc39ad1f6289cc13d3d385f0")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba6f7ebc6a397b144586b06c54964bce", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba6f7ebc6a397b144586b06c54964bce")).booleanValue();
        } else if (this.J == null || !this.J.isVisible()) {
            z = true;
        } else {
            this.J.hide();
            z = false;
        }
        return z && this.o.d();
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fadde310e97c5c578842e4de7323c8e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fadde310e97c5c578842e4de7323c8e3");
        } else {
            o();
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.b
    public final void a(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5e2e97eb6f73e7d1892adc31ae367ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5e2e97eb6f73e7d1892adc31ae367ff");
        } else if (t.a(this.o.g())) {
        } else {
            jSONObject.put("business_channel", this.o.g());
        }
    }
}

package com.sankuai.waimai.store.goods.detail.components.root;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.bus.annotation.Subscribe;
import com.meituan.android.bus.annotation.ThreadMode;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.goods.detail.components.root.c;
import com.sankuai.waimai.store.goods.detail.components.root.e;
import com.sankuai.waimai.store.goods.detail.components.root.h;
import com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.SGDetailNormalActionBarBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.SGDetailIndicatorBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.header.SGDetailHeaderTileBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.imagepager.SGDetailMediaPagerBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.mach.SGSyncRenderMachTileBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.mach.d;
import com.sankuai.waimai.store.goods.detail.components.subroot.poiservice.SGPoiServiceDialogBlock;
import com.sankuai.waimai.store.goods.detail.components.subroot.quality.SGDetailQualityAssuranceDialog;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.m;
import com.sankuai.waimai.store.mach.clickhandler.a;
import com.sankuai.waimai.store.manager.coupon.c;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.n;
import com.sankuai.waimai.store.platform.domain.core.comment.Picture;
import com.sankuai.waimai.store.platform.domain.core.comment.Video;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.newp.methods.OnJsEventJump;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.DetailQualityAssurance;
import com.sankuai.waimai.store.repository.model.GoodDetailPoiInformation;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
import com.sankuai.waimai.store.repository.model.GoodsDetailResponse;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
import com.sankuai.waimai.store.shopping.cart.delegate.SCShopCartDelegate;
import com.sankuai.waimai.store.ui.common.CustomDialog;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.u;
import com.sankuai.waimai.store.util.v;
import com.sankuai.waimai.store.widgets.layoutmanager.FixedStaggeredGridLayoutManager;
import com.sankuai.waimai.store.widgets.recycler.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Cube(children = {SGDetailNormalActionBarBlock.class, SGDetailHeaderTileBlock.class, SGSyncRenderMachTileBlock.class}, interrupt = true)
/* loaded from: classes5.dex */
public class SGDetailRootTileBlock extends m implements com.meituan.android.cube.core.eventhandler.protocol.d, SGDetailRootTileBlockEventHelper, h.b, com.sankuai.waimai.store.i.poi.a, com.sankuai.waimai.store.i.user.a, c.a, com.sankuai.waimai.store.observers.a, com.sankuai.waimai.store.shopping.cart.b {
    public static ChangeQuickRedirect g;
    private long A;
    private String B;
    private GoodsDetailResponse C;
    private long D;
    private Map<String, Object> E;
    private int F;
    private GoodsSpu G;
    private GoodsSku H;
    private volatile boolean I;
    private boolean J;
    private final Runnable K;
    private e L;
    private SGPoiServiceDialogBlock M;
    private com.sankuai.waimai.store.recipe.a N;
    public int h;
    public int i;
    public int j;
    private com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b k;
    private SGDetailIndicatorBlock l;
    private SCRecyclerView m;
    private SCShopCartDelegate n;
    private NetInfoLoadView o;
    private final h.a p;
    private g q;
    private RelativeLayout r;
    private SGSyncRenderMachTileBlock s;
    private int t;
    private SGSyncRenderMachTileBlock u;
    private List<com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a> v;
    private boolean w;
    private boolean x;
    private boolean y;
    private String z;

    @Override // com.sankuai.waimai.store.i.poi.a
    public final void a(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
    }

    @Override // com.sankuai.waimai.store.shopping.cart.b
    public final String bg_() {
        return "order_business_channel";
    }

    public SGDetailRootTileBlock() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6f06b0a7b0a2b5849be5286c3f88ea8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6f06b0a7b0a2b5849be5286c3f88ea8");
            return;
        }
        this.p = new i(this);
        this.w = false;
        this.x = true;
        this.G = null;
        this.H = null;
        this.J = false;
        this.K = new Runnable() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3d28000c527918ad24fe32e1073025d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3d28000c527918ad24fe32e1073025d9");
                } else if (SGDetailRootTileBlock.this.y()) {
                    SGDetailRootTileBlock.this.onMachAddEvent(new a.C1218a(SGDetailRootTileBlock.this.l(), null, SGDetailRootTileBlock.this.p.c().f(), SGDetailRootTileBlock.this.p.c().h(), SGDetailRootTileBlock.this.C.mGoodsSpu, null, 1));
                }
            }
        };
        this.h = 0;
        this.i = 0;
        this.j = 0;
    }

    public static /* synthetic */ BaseModuleDesc a(SGDetailRootTileBlock sGDetailRootTileBlock, GoodsDetailResponse goodsDetailResponse, String str) {
        Object[] objArr = {goodsDetailResponse, str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, sGDetailRootTileBlock, changeQuickRedirect, false, "074d32ca37d5d8e8ecf685dfa6d5833d", RobustBitConfig.DEFAULT_VALUE)) {
            return (BaseModuleDesc) PatchProxy.accessDispatch(objArr, sGDetailRootTileBlock, changeQuickRedirect, false, "074d32ca37d5d8e8ecf685dfa6d5833d");
        }
        if (goodsDetailResponse != null && com.sankuai.shangou.stone.util.a.c(goodsDetailResponse.bannerBlock) > 0) {
            Iterator<BaseTile<BaseModuleDesc, HashMap<String, Object>>> it = goodsDetailResponse.bannerBlock.iterator();
            while (it.hasNext()) {
                BaseTile<BaseModuleDesc, HashMap<String, Object>> next = it.next();
                if (next != null && next.data != null && next.data.jsonData != null && str.equals(next.sType)) {
                    return next.data;
                }
            }
            return null;
        }
        return null;
    }

    public static /* synthetic */ void a(SGDetailRootTileBlock sGDetailRootTileBlock, int i, int i2) {
        View childAt;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, sGDetailRootTileBlock, changeQuickRedirect, false, "147e833edfade7eb4387f5b8c60b3617", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGDetailRootTileBlock, changeQuickRedirect, false, "147e833edfade7eb4387f5b8c60b3617");
        } else if (!com.sankuai.shangou.stone.util.a.b(sGDetailRootTileBlock.v) && sGDetailRootTileBlock.k != null) {
            int i3 = -1;
            for (com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a aVar : sGDetailRootTileBlock.v) {
                if (aVar.b < i) {
                    i3++;
                } else if (aVar.b <= i2 && (childAt = sGDetailRootTileBlock.m.getChildAt(aVar.b - i)) != null) {
                    if (childAt.getTop() <= (aVar.b == 0 ? 0 : sGDetailRootTileBlock.k.b(sGDetailRootTileBlock.u == null ? 0 : sGDetailRootTileBlock.u.i().getHeight()))) {
                        i3++;
                    }
                }
            }
            if (sGDetailRootTileBlock.l != null) {
                sGDetailRootTileBlock.l.a(i3, !sGDetailRootTileBlock.m.canScrollVertically(1));
            }
        }
    }

    public static /* synthetic */ void a(SGDetailRootTileBlock sGDetailRootTileBlock, Context context, DetailQualityAssurance detailQualityAssurance, String str, String str2, String str3) {
        Object[] objArr = {context, detailQualityAssurance, str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, sGDetailRootTileBlock, changeQuickRedirect, false, "de0d4b68fe490d9c3c8f4faa53bcbea2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGDetailRootTileBlock, changeQuickRedirect, false, "de0d4b68fe490d9c3c8f4faa53bcbea2");
        } else if (context == null || detailQualityAssurance == null || com.sankuai.shangou.stone.util.a.b(detailQualityAssurance.dialogItemList)) {
        } else {
            SGDetailQualityAssuranceDialog sGDetailQualityAssuranceDialog = new SGDetailQualityAssuranceDialog(context);
            sGDetailQualityAssuranceDialog.a(detailQualityAssurance.dialogItemList, str, str2, str3);
            com.sankuai.waimai.store.util.d.b(sGDetailQualityAssuranceDialog);
        }
    }

    public static /* synthetic */ void a(SGDetailRootTileBlock sGDetailRootTileBlock, FixedStaggeredGridLayoutManager fixedStaggeredGridLayoutManager) {
        int i;
        Mach l;
        Object[] objArr = {fixedStaggeredGridLayoutManager};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, sGDetailRootTileBlock, changeQuickRedirect, false, "a388d06aa610be809211ca7a31ce2a0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, sGDetailRootTileBlock, changeQuickRedirect, false, "a388d06aa610be809211ca7a31ce2a0d");
        } else if (sGDetailRootTileBlock.u == null || sGDetailRootTileBlock.s == null) {
            sGDetailRootTileBlock.r.setVisibility(8);
        } else if (fixedStaggeredGridLayoutManager != null) {
            try {
                SGSyncRenderMachTileBlock sGSyncRenderMachTileBlock = sGDetailRootTileBlock.u;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = SGSyncRenderMachTileBlock.h;
                if (PatchProxy.isSupport(objArr2, sGSyncRenderMachTileBlock, changeQuickRedirect2, false, "eb9090193b99c423f4da27d4ed6358e4", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr2, sGSyncRenderMachTileBlock, changeQuickRedirect2, false, "eb9090193b99c423f4da27d4ed6358e4")).intValue();
                } else {
                    if (sGSyncRenderMachTileBlock.j == 0 && sGSyncRenderMachTileBlock.i != null && sGSyncRenderMachTileBlock.i.a() != null && sGSyncRenderMachTileBlock.i.a().l() != null && (l = sGSyncRenderMachTileBlock.i.a().l()) != null && l.getRootNode() != null) {
                        sGSyncRenderMachTileBlock.j = l.getRootNode().t();
                    }
                    i = sGSyncRenderMachTileBlock.j;
                }
                if (sGDetailRootTileBlock.h != 0 && i != 0) {
                    if (sGDetailRootTileBlock.j > sGDetailRootTileBlock.i - (sGDetailRootTileBlock.k.b(0) - (sGDetailRootTileBlock.h - i))) {
                        sGDetailRootTileBlock.r.setVisibility(0);
                        return;
                    } else {
                        sGDetailRootTileBlock.r.setVisibility(8);
                        return;
                    }
                }
                sGDetailRootTileBlock.r.setVisibility(8);
            } catch (Exception unused) {
                sGDetailRootTileBlock.r.setVisibility(8);
            }
        }
    }

    public static /* synthetic */ boolean a(SGDetailRootTileBlock sGDetailRootTileBlock, boolean z) {
        sGDetailRootTileBlock.w = false;
        return false;
    }

    public static /* synthetic */ HashMap b(SGDetailRootTileBlock sGDetailRootTileBlock, GoodsDetailResponse goodsDetailResponse, String str) {
        Object[] objArr = {goodsDetailResponse, str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, sGDetailRootTileBlock, changeQuickRedirect, false, "593a6b76717870143375ab01dfb1a5fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, sGDetailRootTileBlock, changeQuickRedirect, false, "593a6b76717870143375ab01dfb1a5fd");
        }
        if (goodsDetailResponse != null && com.sankuai.shangou.stone.util.a.c(goodsDetailResponse.bannerBlock) > 0) {
            Iterator<BaseTile<BaseModuleDesc, HashMap<String, Object>>> it = goodsDetailResponse.bannerBlock.iterator();
            while (it.hasNext()) {
                BaseTile<BaseModuleDesc, HashMap<String, Object>> next = it.next();
                if (next != null && next.data != null && next.data.jsonData != null && str.equals(next.sType)) {
                    return next.propsData;
                }
            }
            return null;
        }
        return null;
    }

    @Override // com.meituan.android.cube.core.f
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dce35db3a40d00f4a6ce9cacff47d484", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dce35db3a40d00f4a6ce9cacff47d484");
            return;
        }
        super.a(bundle);
        this.D = SystemClock.elapsedRealtime();
        this.p.a(bundle);
        this.G = null;
        this.H = null;
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "954f67f427f56f69ac9b33f9253cae4f", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "954f67f427f56f69ac9b33f9253cae4f") : layoutInflater.inflate(R.layout.wm_sc_goods_detail_cube_activity, viewGroup, false);
    }

    @Override // com.meituan.android.cube.core.f
    public final void a_(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06e490b5442f38c0b07b9d0341bd94a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06e490b5442f38c0b07b9d0341bd94a9");
            return;
        }
        super.a_(view);
        this.o = (NetInfoLoadView) view.findViewById(R.id.wm_st_good_detail_net);
        this.o.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.9
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b32246000234aa2606eb6b3860c4c55", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b32246000234aa2606eb6b3860c4c55");
                } else {
                    SGDetailRootTileBlock.this.p.a(SGDetailRootTileBlock.this.l().getIntent(), SGDetailRootTileBlock.this.o());
                }
            }
        });
        this.k = (com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.b) a(R.id.rl_action_bar, (int) new SGDetailNormalActionBarBlock(9));
        this.r = (RelativeLayout) a(R.id.rl_detail_pinned_layout);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4e5ad864404f65b5650867751159640c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4e5ad864404f65b5650867751159640c");
        } else {
            this.m = (SCRecyclerView) a(R.id.rv_content_list);
            this.m.setOnScrollToBottomOrTopListener(new n() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.newwidgets.list.n
                public final void e() {
                }

                @Override // com.sankuai.waimai.store.newwidgets.list.n
                public final void bm_() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "06eb704318bd50a8af60da4ebec8664c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "06eb704318bd50a8af60da4ebec8664c");
                    } else if (SGDetailRootTileBlock.this.I) {
                        SGDetailRootTileBlock.this.p.a(false);
                    }
                }
            });
            final int dimensionPixelSize = l().getResources().getDimensionPixelSize(R.dimen.wm_sc_common_dimen_3);
            this.m.addItemDecoration(new RecyclerView.f() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.11
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.f
                public final void getItemOffsets(Rect rect, View view2, RecyclerView recyclerView, RecyclerView.State state) {
                    Object[] objArr3 = {rect, view2, recyclerView, state};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3d713dec7b969270d0ba1c9c1fee7661", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3d713dec7b969270d0ba1c9c1fee7661");
                        return;
                    }
                    super.getItemOffsets(rect, view2, recyclerView, state);
                    if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) view2.getLayoutParams();
                        if (!bVar.b) {
                            if (bVar.b() % 2 == 0) {
                                rect.left = dimensionPixelSize * 4;
                                rect.right = dimensionPixelSize;
                            } else {
                                rect.left = dimensionPixelSize;
                                rect.right = dimensionPixelSize * 4;
                            }
                            rect.top = 0;
                            rect.bottom = dimensionPixelSize * 2;
                            return;
                        }
                        rect.right = 0;
                        rect.left = 0;
                        rect.bottom = 0;
                        rect.top = 0;
                    }
                }
            });
            this.m.setLayoutManager(new FixedStaggeredGridLayoutManager(2, 1));
            this.m.addOnScrollListener(new RecyclerView.k() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.12
                public static ChangeQuickRedirect a;

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    Object[] objArr3 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f7b23796accb297e2f6f3978dac4235e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f7b23796accb297e2f6f3978dac4235e");
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if (i == 0) {
                        SGDetailRootTileBlock.a(SGDetailRootTileBlock.this, false);
                        FixedStaggeredGridLayoutManager fixedStaggeredGridLayoutManager = (FixedStaggeredGridLayoutManager) recyclerView.getLayoutManager();
                        SGDetailRootTileBlock.a(SGDetailRootTileBlock.this, fixedStaggeredGridLayoutManager.findFirstVisibleItemPositions(null)[0], fixedStaggeredGridLayoutManager.findLastVisibleItemPositions(null)[0]);
                        if (recyclerView.canScrollVertically(-1) || SGDetailRootTileBlock.this.s == null) {
                            return;
                        }
                        SGDetailRootTileBlock.this.i = fixedStaggeredGridLayoutManager.a(SGDetailRootTileBlock.this.t);
                    }
                }

                @Override // android.support.v7.widget.RecyclerView.k
                public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    Object[] objArr3 = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8b16fab7c0db8aeef4fbcca1ba687ccd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8b16fab7c0db8aeef4fbcca1ba687ccd");
                        return;
                    }
                    super.onScrolled(recyclerView, i, i2);
                    if (SGDetailRootTileBlock.this.k == null || SGDetailRootTileBlock.this.l == null) {
                        return;
                    }
                    FixedStaggeredGridLayoutManager fixedStaggeredGridLayoutManager = (FixedStaggeredGridLayoutManager) recyclerView.getLayoutManager();
                    int i3 = fixedStaggeredGridLayoutManager.findFirstVisibleItemPositions(null)[0];
                    int i4 = fixedStaggeredGridLayoutManager.findLastVisibleItemPositions(null)[0];
                    if (i3 != 0) {
                        SGDetailRootTileBlock.this.k.a(1.0f);
                    } else {
                        View findViewByPosition = fixedStaggeredGridLayoutManager.findViewByPosition(i3);
                        SGDetailMediaPagerBlock sGDetailMediaPagerBlock = (SGDetailMediaPagerBlock) SGDetailRootTileBlock.this.b(SGDetailMediaPagerBlock.class);
                        SGDetailRootTileBlock.this.k.a(sGDetailMediaPagerBlock != null ? sGDetailMediaPagerBlock.i().getHeight() : 0, -findViewByPosition.getTop());
                    }
                    if (!SGDetailRootTileBlock.this.w) {
                        SGDetailRootTileBlock.a(SGDetailRootTileBlock.this, i3, i4);
                    }
                    if (SGDetailRootTileBlock.this.y()) {
                        if (i3 == 0 && SGDetailRootTileBlock.this.s != null) {
                            SGDetailRootTileBlock.this.i = fixedStaggeredGridLayoutManager.a(SGDetailRootTileBlock.this.t);
                        }
                        SGDetailRootTileBlock.a(SGDetailRootTileBlock.this, fixedStaggeredGridLayoutManager);
                        SGDetailRootTileBlock.this.j += i2;
                    }
                }
            });
        }
        this.p.a(l().getIntent(), o());
        com.sankuai.waimai.store.order.a.e().a(this);
        com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this);
        com.meituan.android.bus.a.a().a(this);
        this.p.a(l().getIntent());
        com.sankuai.waimai.store.manager.poi.a.a().a((com.sankuai.waimai.store.i.poi.a) this);
        com.sankuai.waimai.store.manager.coupon.c.a().a(this);
        com.sankuai.waimai.store.shopping.cart.d.a().a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        View childAt;
        int height;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "407886e19e14439c160d7e2f8829c145", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "407886e19e14439c160d7e2f8829c145")).booleanValue();
        }
        if (this.s == null) {
            List c = c(SGSyncRenderMachTileBlock.class);
            if (c == null) {
                return false;
            }
            for (int i = 0; i < com.sankuai.shangou.stone.util.a.c(c); i++) {
                SGSyncRenderMachTileBlock sGSyncRenderMachTileBlock = (SGSyncRenderMachTileBlock) c.get(i);
                if (sGSyncRenderMachTileBlock != null && sGSyncRenderMachTileBlock.i != null) {
                    if ("sm_type_goods_detail_price".equals(sGSyncRenderMachTileBlock.i.b)) {
                        this.s = sGSyncRenderMachTileBlock;
                    } else if ("sm_type_goods_detail_commodity_upgrade".equals(sGSyncRenderMachTileBlock.i.b)) {
                        this.s = sGSyncRenderMachTileBlock;
                    }
                }
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = g;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8959183177c12fa610df48d9e8e511fa", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8959183177c12fa610df48d9e8e511fa");
            } else {
                try {
                    if (this.m != null && (this.m.getLayoutManager() instanceof FixedStaggeredGridLayoutManager)) {
                        FixedStaggeredGridLayoutManager fixedStaggeredGridLayoutManager = (FixedStaggeredGridLayoutManager) this.m.getLayoutManager();
                        int i2 = this.t;
                        Object[] objArr3 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect3 = FixedStaggeredGridLayoutManager.a;
                        if (PatchProxy.isSupport(objArr3, fixedStaggeredGridLayoutManager, changeQuickRedirect3, false, "c4fe56cff11bd94da62d8744cb128702", RobustBitConfig.DEFAULT_VALUE)) {
                            height = ((Integer) PatchProxy.accessDispatch(objArr3, fixedStaggeredGridLayoutManager, changeQuickRedirect3, false, "c4fe56cff11bd94da62d8744cb128702")).intValue();
                        } else {
                            if (i2 <= fixedStaggeredGridLayoutManager.getChildCount() && (childAt = fixedStaggeredGridLayoutManager.getChildAt(i2)) != null) {
                                height = childAt.getHeight();
                            }
                            height = 0;
                        }
                        this.h = height;
                        this.i = fixedStaggeredGridLayoutManager.a(this.t);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return this.s != null;
    }

    @Override // com.meituan.android.cube.core.f
    public final void aR_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "092195b801d901c98facc13df7cb24d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "092195b801d901c98facc13df7cb24d0");
            return;
        }
        super.aR_();
        this.p.f();
    }

    @Override // com.meituan.android.cube.core.f
    public final void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88e25194062d35b5cc20ca84fa615635", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88e25194062d35b5cc20ca84fa615635");
            return;
        }
        super.aX_();
        if (this.x) {
            this.x = false;
        } else {
            this.p.c(o());
        }
        if (this.y) {
            z();
        }
        if (this.J) {
            ba_();
            this.J = false;
        }
        this.p.a();
    }

    @Override // com.meituan.android.cube.core.f
    public final void bD_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57339caa6518c329210e6b91f173a790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57339caa6518c329210e6b91f173a790");
            return;
        }
        super.bD_();
        this.p.g();
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28685f2c8a99c38a6ea6a0d35cbdfeb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28685f2c8a99c38a6ea6a0d35cbdfeb0");
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
        this.p.b();
        this.m.removeCallbacks(this.K);
        com.sankuai.waimai.store.shopping.cart.d.a().b(this);
        if (this.n != null) {
            this.n.a();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2180d71e8d1740c2b8001f0a9343c82d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2180d71e8d1740c2b8001f0a9343c82d");
        } else if (this.M != null) {
            this.M.s();
            this.M = null;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = g;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cdc956162f41e64113e25e07561f1770", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cdc956162f41e64113e25e07561f1770");
        } else if (this.N != null) {
            this.N.onDestroy();
        }
        this.G = null;
        this.H = null;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void a(String str, long j, String str2) {
        Object[] objArr = {str, new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ed95ea7aa31f2edc5ac46eac8755af4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ed95ea7aa31f2edc5ac46eac8755af4");
            return;
        }
        this.y = true;
        this.z = str;
        this.A = j;
        this.B = str2;
        z();
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void a(GoodsDetailResponse goodsDetailResponse) {
        Object[] objArr = {goodsDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f07f7e7f4f6f3b93a620abd7b5c5f136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f07f7e7f4f6f3b93a620abd7b5c5f136");
        } else {
            a("stid", goodsDetailResponse.getStids());
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void s() {
        com.sankuai.waimai.store.goods.detail.components.subroot.mach.d dVar;
        Mach l;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65106570baea93769fbb6d8302fac739", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65106570baea93769fbb6d8302fac739");
        } else if (l().x()) {
            if (this.q != null && com.sankuai.shangou.stone.util.a.a((List) this.q.b) > 0) {
                Map<String, Object> x = x();
                for (c cVar : this.q.b) {
                    if (cVar instanceof c.a) {
                        com.sankuai.waimai.store.goods.detail.components.subroot.mach.d dVar2 = ((c.a) cVar).g;
                        if (dVar2 != null) {
                            dVar2.a("goods_detail_update_shopcart_account", x);
                        }
                    } else if (cVar instanceof c.b) {
                        c.b bVar = (c.b) cVar;
                        if (bVar.g != null && bVar.g.recycleMachDataWrapper != null && bVar.g.recycleMachDataWrapper.b != null && (l = bVar.g.recycleMachDataWrapper.b.l()) != null) {
                            l.sendJsEvent("goods_detail_update_shopcart_account", x);
                        }
                    }
                }
            }
            if (this.u == null || (dVar = this.u.i) == null) {
                return;
            }
            dVar.a("goods_detail_update_shopcart_account", x());
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void b(GoodsDetailResponse goodsDetailResponse) {
        BaseTile<BaseModuleDesc, HashMap<String, Object>> baseTile;
        com.sankuai.waimai.store.goods.detail.components.subroot.mach.d dVar;
        Object[] objArr = {goodsDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04b4f86299d1fec3fd1a7a014b59f830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04b4f86299d1fec3fd1a7a014b59f830");
            return;
        }
        if (this.C != null && goodsDetailResponse != null && com.sankuai.shangou.stone.util.a.a((List) goodsDetailResponse.bannerBlock) > 0 && (baseTile = goodsDetailResponse.bannerBlock.get(0)) != null) {
            String str = baseTile.sType;
            if (com.sankuai.shangou.stone.util.a.c(this.C.bannerBlock) > 0) {
                Iterator<BaseTile<BaseModuleDesc, HashMap<String, Object>>> it = this.C.bannerBlock.iterator();
                while (it.hasNext()) {
                    BaseTile<BaseModuleDesc, HashMap<String, Object>> next = it.next();
                    if (next != null && next.data != null && next.data.jsonData != null && str.equals(next.sType)) {
                        next.data = baseTile.data;
                    }
                }
            }
            Map<String, Object> a = new f().a(this.p.c(), goodsDetailResponse, baseTile);
            if (!t.a(str) && a != null) {
                Object[] objArr2 = {a, str};
                ChangeQuickRedirect changeQuickRedirect2 = g;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8371f3ac572343ebf89b6d0351557a10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8371f3ac572343ebf89b6d0351557a10");
                } else if (a != null && this.q != null && com.sankuai.shangou.stone.util.a.a((List) this.q.b) > 0) {
                    for (c cVar : this.q.b) {
                        if ((cVar instanceof c.a) && (dVar = ((c.a) cVar).g) != null && str.equals(dVar.b)) {
                            Object[] objArr3 = {a};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.detail.components.subroot.mach.d.a;
                            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "5010db85c600cc8a7ab445b069b66cdb", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "5010db85c600cc8a7ab445b069b66cdb");
                            } else if (dVar.d != null && dVar.d.d() != null && a != null) {
                                dVar.d.d().render(a);
                            }
                        }
                    }
                }
            }
        }
        com.sankuai.waimai.store.order.a.e().b(this.p.c().f());
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void a(List<? extends c> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07aed2fdc522291450e2feb9c6188fac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07aed2fdc522291450e2feb9c6188fac");
            return;
        }
        g gVar = this.q;
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "94ff0355585c627799532ac4a82a3dcd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "94ff0355585c627799532ac4a82a3dcd");
            return;
        }
        int a = com.sankuai.shangou.stone.util.a.a((List) gVar.b);
        if (gVar.b != null) {
            gVar.b.addAll(list);
        }
        try {
            gVar.e(a, 1);
        } catch (Exception e) {
            gVar.m();
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void u() {
        this.I = true;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void v() {
        this.I = false;
    }

    private void z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d0bb3428e4991f71aad3e1c13067730", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d0bb3428e4991f71aad3e1c13067730");
        } else {
            com.sankuai.waimai.store.manager.judas.b.b(m(), "b_waimai_sg_liehs5kj_mv").a("poi_id", Long.valueOf(this.A)).a("spu_id", this.B).a("stid", TextUtils.isEmpty(this.z) ? "" : this.z).a();
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6ffb9fdc480bd4080758ba3a7154091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6ffb9fdc480bd4080758ba3a7154091");
            return;
        }
        SCBaseActivity q = l();
        if (com.sankuai.waimai.store.util.b.a(q)) {
            return;
        }
        q.b_(str);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d060cccb981f601fb32d33f184481acb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d060cccb981f601fb32d33f184481acb");
        } else {
            this.o.a(i, str);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void a(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "596aa01c81bff49d8ea710bc33cf5d07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "596aa01c81bff49d8ea710bc33cf5d07");
            return;
        }
        if (this.q == null) {
            this.q = new g(aVar, this);
            View view = new View(l());
            view.setMinimumHeight(com.sankuai.shangou.stone.util.h.a(l(), 100.0f));
            this.q.d(view);
            this.m.setAdapter(new l(this.q));
            this.q.d = this.p.j();
            this.q.e = x();
        }
        this.p.b(l().getIntent());
        this.p.a(o());
        this.p.b(o());
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void a(long j, @NonNull GoodsSpu goodsSpu, String str, List<com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a> list) {
        Object[] objArr = {new Long(j), goodsSpu, str, list};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "784a9b52c515e174e26192807c6db6c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "784a9b52c515e174e26192807c6db6c0");
        } else if (this.k == null) {
        } else {
            this.v = list;
            this.k.a(this.p.c(), goodsSpu, str, "", "");
            this.k.b(this.z);
            this.l = (SGDetailIndicatorBlock) this.k.b(SGDetailIndicatorBlock.class);
            if (this.l != null) {
                this.l.a(j, goodsSpu.getId(), this.z, list, false, true);
            }
            this.p.c(o());
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void b(int i) {
        this.t = i;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void a(@NonNull GoodsDetailResponse goodsDetailResponse, @NonNull GoodsSpu goodsSpu, @Nullable GoodsSku goodsSku) {
        c cVar;
        boolean z = false;
        Object[] objArr = {goodsDetailResponse, goodsSpu, goodsSku};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e45ae8e84053b545648e063fe0ca7da5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e45ae8e84053b545648e063fe0ca7da5");
            return;
        }
        if (this.q != null) {
            Iterator<c> it = this.q.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                c next = it.next();
                if ((next instanceof c.a) && "sm_type_goods_detail_price".equals(next.c)) {
                    z = true;
                    break;
                }
            }
        }
        c cVar2 = null;
        if (z && com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsDetailResponse.bannerBlock)) {
            Iterator<BaseTile<BaseModuleDesc, HashMap<String, Object>>> it2 = goodsDetailResponse.bannerBlock.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    cVar = null;
                    break;
                }
                BaseTile<BaseModuleDesc, HashMap<String, Object>> next2 = it2.next();
                if (next2 != null && "sm_type_goods_detail_price".equals(next2.sType)) {
                    cVar = new f().a(this.p.c(), next2.sType, goodsDetailResponse, next2, goodsSku, this.p.i());
                    break;
                }
            }
            if (cVar instanceof c.a) {
                a((c.a) cVar);
            }
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) goodsDetailResponse.floatBlock)) {
            Iterator<BaseTile<BaseModuleDesc, HashMap<String, Object>>> it3 = goodsDetailResponse.floatBlock.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                BaseTile<BaseModuleDesc, HashMap<String, Object>> next3 = it3.next();
                if (next3 != null && "sm_type_goods_detail_priceFloat".equals(next3.sType)) {
                    cVar2 = new f().a(this.p.c(), next3.sType, goodsDetailResponse, next3, goodsSku, this.p.i());
                    break;
                }
            }
            if (cVar2 instanceof c.a) {
                a((c.a) cVar2);
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock$13  reason: invalid class name */
    /* loaded from: classes5.dex */
    public class AnonymousClass13 extends al.a {
        public static ChangeQuickRedirect a;
        public final /* synthetic */ c.a b;

        public AnonymousClass13(c.a aVar) {
            this.b = aVar;
        }

        @Override // com.sankuai.waimai.store.util.al.a
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7701a89bcd5faf9ab15a5aa75668b152", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7701a89bcd5faf9ab15a5aa75668b152");
                return;
            }
            try {
                this.b.g.a(SGDetailRootTileBlock.this.l(), SGDetailRootTileBlock.this.l().w(), new d.a() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.13.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.mach.d.a
                    public final void b() {
                    }

                    @Override // com.sankuai.waimai.store.goods.detail.components.subroot.mach.d.a
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18458614e50ce3d7c9dd26289f0ed7c4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18458614e50ce3d7c9dd26289f0ed7c4");
                        } else {
                            al.a(new Runnable() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.13.1.1
                                public static ChangeQuickRedirect a;

                                @Override // java.lang.Runnable
                                public final void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3453143b432edb433bbda7d12188d20b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3453143b432edb433bbda7d12188d20b");
                                        return;
                                    }
                                    if (SGDetailRootTileBlock.this.u == null) {
                                        SGSyncRenderMachTileBlock sGSyncRenderMachTileBlock = new SGSyncRenderMachTileBlock(SGDetailRootTileBlock.this.p.c());
                                        SGDetailRootTileBlock.this.u = (SGSyncRenderMachTileBlock) SGDetailRootTileBlock.this.a(R.id.ll_detail_pinned_price_bar, (int) sGSyncRenderMachTileBlock);
                                    }
                                    SGDetailRootTileBlock.this.u.a(AnonymousClass13.this.b.g);
                                    SGDetailRootTileBlock.this.u.a(AnonymousClass13.this.b.f);
                                    SGDetailRootTileBlock.this.u.r();
                                    AnonymousClass13.this.b.g.a("goods_detail_update_shopcart_account", SGDetailRootTileBlock.this.x());
                                }
                            }, SGDetailRootTileBlock.this.l().w());
                        }
                    }
                });
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
    }

    private void a(c.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e878a2587ea1980cc7ed7c65f960df6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e878a2587ea1980cc7ed7c65f960df6");
        } else {
            al.a(new AnonymousClass13(aVar), l().w());
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void a(List<c> list, @NonNull GoodsDetailResponse goodsDetailResponse) {
        Object[] objArr = {list, goodsDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a8060f0d1d2954b156f1334ee26888f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a8060f0d1d2954b156f1334ee26888f");
            return;
        }
        this.C = goodsDetailResponse;
        g gVar = this.q;
        GoodsDetailResponse goodsDetailResponse2 = this.C;
        Object[] objArr2 = {list, goodsDetailResponse2};
        ChangeQuickRedirect changeQuickRedirect2 = g.a;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "7a0f8cb5ef6134e088cf809670402ab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "7a0f8cb5ef6134e088cf809670402ab7");
        } else {
            gVar.b = list;
            gVar.c = goodsDetailResponse2;
            gVar.m();
        }
        if (this.D != -1) {
            com.sankuai.waimai.store.manager.judas.b.b(l(), "b_waimai_sg_472ca63s_mv").a("duration", Long.valueOf(SystemClock.elapsedRealtime() - this.D)).a();
            this.D = -1L;
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void a(GetMenuResponse getMenuResponse) {
        Object[] objArr = {getMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6c10b9886119dd9d44d8e8d5ad2b83f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6c10b9886119dd9d44d8e8d5ad2b83f");
        } else if (this.k != null) {
            this.k.a(getMenuResponse);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull GoodsDetailResponse goodsDetailResponse) {
        Object[] objArr = {aVar, goodsDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c831bf1d031f92fae8d9b2526d7116c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c831bf1d031f92fae8d9b2526d7116c");
            return;
        }
        View findViewById = i().findViewById(R.id.layout_bottom);
        if (this.n == null) {
            GoodDetailResponse goodDetailResponse = new GoodDetailResponse();
            goodDetailResponse.poiInformation = new GoodDetailPoiInformation();
            goodDetailResponse.poiInformation.mBuzType = goodsDetailResponse.mGoodsSpu.mBuzType;
            goodDetailResponse.poiInformation.mPurchasedType = goodsDetailResponse.mGoodsSpu.mPurchasedType;
            goodDetailResponse.mFoodSpu.orderParam = goodsDetailResponse.mGoodsSpu.orderParam;
            this.n = SCShopCartDelegate.a(l(), aVar, R.id.mrn_shopcart_layout, findViewById, SCPageConfig.a(2, 33, "c_u4fk4kw", this.p.d().id), "c_u4fk4kw", o(), null, goodDetailResponse);
            this.n.f();
        }
        this.n.b(!goodsDetailResponse.hideShoppingCar);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e01a031f769fccb29b329dd0db9b4a3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e01a031f769fccb29b329dd0db9b4a3c");
        } else {
            this.m.postDelayed(this.K, 500L);
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ed84c57512e8147c1fbad0a815f2a41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ed84c57512e8147c1fbad0a815f2a41");
        } else if (enumC1205a != a.EnumC1205a.LOGIN || this.n == null) {
        } else {
            this.n.b();
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "537bc348e4f4a69ca270a02ab25fafe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "537bc348e4f4a69ca270a02ab25fafe1");
        } else if (this.n != null) {
            this.n.c();
        }
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df16b168b94b9a71baa0a2e9bc51d326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df16b168b94b9a71baa0a2e9bc51d326");
        } else if (!l().x()) {
            this.J = true;
        } else {
            if (this.n != null) {
                this.n.h();
            }
            if (this.q != null) {
                this.q.e = x();
            }
            s();
        }
    }

    public final Map<String, Object> x() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e3542163636fc229859b3856892f86e", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e3542163636fc229859b3856892f86e") : this.p.k();
    }

    @Subscribe
    public void onBindMemberCardSuccess(com.sankuai.waimai.store.event.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57fb5189d961e084e2a43f3f1732e2eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57fb5189d961e084e2a43f3f1732e2eb");
        } else {
            this.p.a(o());
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlockEventHelper
    public void onSGDetailActionBarBackEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aee87a5d9db5bae09c2099a46953293", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aee87a5d9db5bae09c2099a46953293");
        } else if (this.p.e()) {
            if (this.p.d() != null) {
                com.sankuai.waimai.store.manager.judas.b.a(l(), "b_Lqa4m").a("poi_id", Long.valueOf(this.p.c().f())).a("spu_id", Long.valueOf(this.p.d().getId())).a();
            }
            l().finish();
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlockEventHelper
    public void onSGDetailIndicatorClickEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca2336860d8dd361eceef6305e3997c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca2336860d8dd361eceef6305e3997c");
            return;
        }
        int i = bVar.a;
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e633da6740f1fdca1add3fdb6375265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e633da6740f1fdca1add3fdb6375265");
        } else if (this.k != null) {
            this.w = true;
            if (this.m.getLayoutManager() instanceof FixedStaggeredGridLayoutManager) {
                FixedStaggeredGridLayoutManager fixedStaggeredGridLayoutManager = (FixedStaggeredGridLayoutManager) this.m.getLayoutManager();
                int b = i == 0 ? 0 : this.k.b(this.u == null ? 0 : this.u.i().getHeight());
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(b)};
                ChangeQuickRedirect changeQuickRedirect3 = FixedStaggeredGridLayoutManager.a;
                if (PatchProxy.isSupport(objArr3, fixedStaggeredGridLayoutManager, changeQuickRedirect3, false, "33a0400a79b766717083f257443dfd79", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, fixedStaggeredGridLayoutManager, changeQuickRedirect3, false, "33a0400a79b766717083f257443dfd79");
                } else if (fixedStaggeredGridLayoutManager.b != null) {
                    Context context = fixedStaggeredGridLayoutManager.b.getContext();
                    Object[] objArr4 = {context, fixedStaggeredGridLayoutManager, Integer.valueOf(b)};
                    ChangeQuickRedirect changeQuickRedirect4 = FixedStaggeredGridLayoutManager.a.a;
                    FixedStaggeredGridLayoutManager.a aVar = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "25ee76ec85d8d3eb1564820311a8870e", RobustBitConfig.DEFAULT_VALUE) ? (FixedStaggeredGridLayoutManager.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "25ee76ec85d8d3eb1564820311a8870e") : new FixedStaggeredGridLayoutManager.a(context, fixedStaggeredGridLayoutManager, -1, b, false);
                    aVar.setTargetPosition(i);
                    fixedStaggeredGridLayoutManager.startSmoothScroll(aVar);
                }
            }
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMachAddEvent(a.C1218a c1218a) {
        Object[] objArr = {c1218a};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd7c0235e7425fe343aa8b934864ade1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd7c0235e7425fe343aa8b934864ade1");
        } else if (m() != c1218a.b || c1218a == null || c1218a.d != this.A || c1218a.f == null) {
        } else {
            final View view = c1218a.c;
            final GoodsSpu goodsSpu = c1218a.f;
            final long j = c1218a.d;
            int i = c1218a.h;
            this.F = c1218a.h;
            this.G = goodsSpu;
            if (goodsSpu.skus != null) {
                this.H = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0);
            }
            if (c1218a.h > 0) {
                com.sankuai.waimai.store.order.a.e().a(j, goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.14
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54376dcc00fbfa7c7e6e02beb92648cd", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54376dcc00fbfa7c7e6e02beb92648cd");
                        }
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                        Object[] objArr2 = {bVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d4e4054eb58a17a53e47d47192c39f8", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d4e4054eb58a17a53e47d47192c39f8");
                            return;
                        }
                        if (view != null) {
                            com.sankuai.waimai.store.shopping.cart.f.a().a(view, SGDetailRootTileBlock.this.m().hashCode(), String.valueOf(j));
                        }
                        if (SGDetailRootTileBlock.this.n != null) {
                            SGDetailRootTileBlock.this.n.a(goodsSpu);
                        }
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4f04952b20be96d6771a060a47e7d03b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4f04952b20be96d6771a060a47e7d03b");
                        } else if (TextUtils.isEmpty(aVar.getMessage())) {
                        } else {
                            am.a((Activity) SGDetailRootTileBlock.this.l(), aVar.getMessage());
                        }
                    }
                });
            } else if (i < 0) {
                com.sankuai.waimai.store.order.a.e().b(j, goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.skus, 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.15
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    }

                    @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                    public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                        Object[] objArr2 = {aVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8416236fdfa1b2105c4ff2532494ae01", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8416236fdfa1b2105c4ff2532494ae01");
                        } else if (TextUtils.isEmpty(aVar.getMessage())) {
                        } else {
                            am.a((Activity) SGDetailRootTileBlock.this.l(), aVar.getMessage());
                        }
                    }
                });
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlockEventHelper
    public void onSGDetailMachSyncEventReceive(com.sankuai.waimai.store.goods.detail.components.subroot.mach.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08db00fa1db732e33e10e9872c47a8ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08db00fa1db732e33e10e9872c47a8ac");
            return;
        }
        s();
        if (this.E != null) {
            a(this.E);
        }
    }

    @Subscribe
    public void onSGDetailSkuSubscribeEvent(j jVar) {
        com.sankuai.waimai.store.goods.detail.components.subroot.mach.d dVar;
        com.sankuai.waimai.store.goods.detail.components.subroot.mach.d dVar2;
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f606ecb080d603f2506b86c0c5cc07ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f606ecb080d603f2506b86c0c5cc07ca");
            return;
        }
        Object[] objArr2 = {jVar};
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eaccf3076a1608e96ec84caca6b63d33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eaccf3076a1608e96ec84caca6b63d33");
        } else if (jVar != null && jVar.a > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("skuID", Long.valueOf(jVar.a));
            if (this.q != null && com.sankuai.shangou.stone.util.a.a((List) this.q.b) > 0) {
                for (c cVar : this.q.b) {
                    if ((cVar instanceof c.a) && (dVar2 = ((c.a) cVar).g) != null) {
                        dVar2.a("goods_detail_update_product_sku_subscribe_status", hashMap);
                    }
                }
            }
            if (this.u == null || (dVar = this.u.i) == null) {
                return;
            }
            dVar.a("goods_detail_update_product_sku_subscribe_status", hashMap);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlockEventHelper
    public void onSGDetailMachEventReceive(final com.sankuai.waimai.store.goods.detail.components.subroot.mach.b bVar) {
        char c;
        Map<String, Object> x;
        Object obj;
        int i = 0;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fce3ebdd47d62eafef0c54996bc054f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fce3ebdd47d62eafef0c54996bc054f");
        } else if (bVar == null) {
        } else {
            String str = bVar.b;
            char c2 = 65535;
            switch (str.hashCode()) {
                case -2090223572:
                    if (str.equals("poi_header_hand_price_coupon_received_event")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -1857556234:
                    if (str.equals("goods_detail_refresh")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1293350888:
                    if (str.equals("foods_detail_click_foods_item")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -916590773:
                    if (str.equals("foods_detail_description_open_explanation")) {
                        c = 15;
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
                case -763243246:
                    if (str.equals("goods_detail_cycleBuy_product_dialog")) {
                        c = 11;
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
                case 793329237:
                    if (str.equals("goods_detail_product_subscribe")) {
                        c = 14;
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
                case 1135696597:
                    if (str.equals("goods_detail_share_event")) {
                        c = '\f';
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
                case 1964795506:
                    if (str.equals("goods_detail_preSale_product_dialog")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a aVar = null;
            switch (c) {
                case 0:
                    Map<String, Object> map = bVar.c;
                    Object[] objArr2 = {map};
                    ChangeQuickRedirect changeQuickRedirect2 = g;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a0308ae709200bcc4f49c5b970801c0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a0308ae709200bcc4f49c5b970801c0");
                        return;
                    }
                    int a = u.a(map, "type", -1);
                    int c3 = com.sankuai.shangou.stone.util.a.c(this.v);
                    while (true) {
                        if (i < c3) {
                            com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a aVar2 = (com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a) com.sankuai.shangou.stone.util.a.a((List<Object>) this.v, i);
                            if (aVar2 == null || aVar2.c != a) {
                                i++;
                            } else {
                                aVar = aVar2;
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
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "6a28ac2d5e0f3f66c413f18914fd66d5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "6a28ac2d5e0f3f66c413f18914fd66d5");
                        return;
                    } else if (map2 != null) {
                        al.a(new al.b<DetailQualityAssurance>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.8
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ DetailQualityAssurance a() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3c0564aabec371f63ca716b5bff9be20", RobustBitConfig.DEFAULT_VALUE) ? (DetailQualityAssurance) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3c0564aabec371f63ca716b5bff9be20") : (DetailQualityAssurance) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(map2), DetailQualityAssurance.class);
                            }

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(DetailQualityAssurance detailQualityAssurance) {
                                DetailQualityAssurance detailQualityAssurance2 = detailQualityAssurance;
                                Object[] objArr4 = {detailQualityAssurance2};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d33f26c53b8b5f87c24eacbfe8cacd3f", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d33f26c53b8b5f87c24eacbfe8cacd3f");
                                } else {
                                    SGDetailRootTileBlock.a(SGDetailRootTileBlock.this, SGDetailRootTileBlock.this.m(), detailQualityAssurance2, SGDetailRootTileBlock.this.z, String.valueOf(SGDetailRootTileBlock.this.p.c().f()), String.valueOf(SGDetailRootTileBlock.this.p.d().getId()));
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
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "56d4b6b289069fdd186c49eefa5899ac", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "56d4b6b289069fdd186c49eefa5899ac");
                        return;
                    } else if (map3 == null || map3.get("spu") == null) {
                        return;
                    } else {
                        al.a(new al.b<GoodsSpu>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.6
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ GoodsSpu a() {
                                Object[] objArr5 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "4355cf455f4bfbc164dee4361b889aac", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSpu) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "4355cf455f4bfbc164dee4361b889aac") : (GoodsSpu) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(map3.get("spu")), GoodsSpu.class);
                            }

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                                GoodsSpu goodsSpu2 = goodsSpu;
                                Object[] objArr5 = {goodsSpu2};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "da116242f52bb7a98318f59c37f63eca", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "da116242f52bb7a98318f59c37f63eca");
                                } else if (goodsSpu2 != null) {
                                    com.sankuai.waimai.store.order.a.e().a(SGDetailRootTileBlock.this.A, goodsSpu2, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu2.skus, 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.6.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                        public final void a() {
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "0640b36d1edea9a5b3735e5f173dd99f", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "0640b36d1edea9a5b3735e5f173dd99f");
                                            }
                                        }

                                        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                        public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar2) {
                                        }

                                        @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                                        public final void a(com.sankuai.waimai.store.exceptions.a aVar3) {
                                            Object[] objArr6 = {aVar3};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "eb800134c0176c35c70cbbc42e1c7137", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "eb800134c0176c35c70cbbc42e1c7137");
                                            } else if (TextUtils.isEmpty(aVar3.getMessage())) {
                                            } else {
                                                am.a((Activity) SGDetailRootTileBlock.this.l(), aVar3.getMessage());
                                                SGDetailRootTileBlock.this.ba_();
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
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "82e08cabe5494dbd5d84ab04e7e635c7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "82e08cabe5494dbd5d84ab04e7e635c7");
                        return;
                    } else if (map4 == null || map4.get("spu") == null) {
                        return;
                    } else {
                        al.a(new al.b<GoodsSpu>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.7
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ GoodsSpu a() {
                                Object[] objArr6 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "8bdfbad7634ea509848d6deec79e52c7", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (GoodsSpu) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "8bdfbad7634ea509848d6deec79e52c7");
                                }
                                GoodsSpu goodsSpu = (GoodsSpu) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(map4.get("spu")), GoodsSpu.class);
                                if (goodsSpu != null) {
                                    goodsSpu.stid = (String) SGDetailRootTileBlock.this.b("stid", "");
                                    goodsSpu.iconTypes = (String) map4.get("product_icon_type_list");
                                }
                                return goodsSpu;
                            }

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                                GoodsSpu goodsSpu2 = goodsSpu;
                                Object[] objArr6 = {goodsSpu2};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "9db26bc7659406e762edf599e5d26770", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "9db26bc7659406e762edf599e5d26770");
                                } else if (goodsSpu2 != null) {
                                    com.sankuai.waimai.store.router.g.a(SGDetailRootTileBlock.this.l(), goodsSpu2, SGDetailRootTileBlock.this.p.c().b, 2);
                                }
                            }
                        }, o());
                        return;
                    }
                case 4:
                    Object[] objArr6 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect6 = g;
                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "66fcc6799c05f49e3cd0672da7a7c759", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "66fcc6799c05f49e3cd0672da7a7c759");
                        return;
                    } else if (bVar == null || (x = x()) == null) {
                        return;
                    } else {
                        bVar.a.b("goods_detail_update_shopcart_account", x);
                        return;
                    }
                case 5:
                    if (bVar.c != null) {
                        Map<String, Object> map5 = bVar.c;
                        Object[] objArr7 = {map5};
                        ChangeQuickRedirect changeQuickRedirect7 = g;
                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "2854a6b906f9444ebcb947a05af835cb", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "2854a6b906f9444ebcb947a05af835cb");
                            return;
                        } else {
                            new OnJsEventJump().a(new com.sankuai.waimai.store.mach.event.a() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.2
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.store.mach.event.a
                                public final void b(@NonNull String str2, @Nullable Map<String, Object> map6) {
                                }

                                @Override // com.sankuai.waimai.store.mach.event.a
                                public final Activity a() {
                                    Object[] objArr8 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect8 = a;
                                    return PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "ea75e33b080c08d624aa39addc4229a9", RobustBitConfig.DEFAULT_VALUE) ? (Activity) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "ea75e33b080c08d624aa39addc4229a9") : SGDetailRootTileBlock.this.l();
                                }
                            }, null, map5);
                            return;
                        }
                    }
                    return;
                case 6:
                    Object[] objArr8 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect8 = g;
                    if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "8c5cc68fe6ad4a2c48d215c8c25587d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "8c5cc68fe6ad4a2c48d215c8c25587d8");
                        return;
                    } else if (bVar == null || this.C == null) {
                        return;
                    } else {
                        al.a(new al.b<com.sankuai.waimai.store.repository.model.h>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.3
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(com.sankuai.waimai.store.repository.model.h hVar) {
                                com.sankuai.waimai.store.repository.model.h hVar2 = hVar;
                                Object[] objArr9 = {hVar2};
                                ChangeQuickRedirect changeQuickRedirect9 = a;
                                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "bebe468785ddca8d34b5e3cf73f17465", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "bebe468785ddca8d34b5e3cf73f17465");
                                } else if (hVar2 == null) {
                                } else {
                                    com.sankuai.waimai.store.coupons.a a2 = com.sankuai.waimai.store.coupons.a.a();
                                    SCBaseActivity q = SGDetailRootTileBlock.this.l();
                                    com.sankuai.waimai.store.platform.domain.manager.poi.a c4 = SGDetailRootTileBlock.this.p.c();
                                    GoodsSpu d = SGDetailRootTileBlock.this.p.d();
                                    Object[] objArr10 = {q, c4, hVar2, d};
                                    ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.store.coupons.a.a;
                                    if (PatchProxy.isSupport(objArr10, a2, changeQuickRedirect10, false, "0be669aa67007b9169a6900be227a645", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr10, a2, changeQuickRedirect10, false, "0be669aa67007b9169a6900be227a645");
                                        return;
                                    }
                                    a2.c = hVar2;
                                    a2.a(q, c4, hVar2.e, 0L, hVar2.d, null, 1, d);
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            @Override // com.sankuai.waimai.store.util.al.b
                            @Nullable
                            /* renamed from: b */
                            public com.sankuai.waimai.store.repository.model.h a() {
                                Object[] objArr9 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect9 = a;
                                if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "70fe17dea5af313226a8653d318980d8", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (com.sankuai.waimai.store.repository.model.h) PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "70fe17dea5af313226a8653d318980d8");
                                }
                                String str2 = "sm_type_goods_detail_poi_service";
                                if (bVar.c != null && bVar.c.get("moduleTypeName") != null) {
                                    str2 = String.valueOf(bVar.c.get("moduleTypeName"));
                                }
                                BaseModuleDesc a2 = SGDetailRootTileBlock.a(SGDetailRootTileBlock.this, SGDetailRootTileBlock.this.C, str2);
                                HashMap b = SGDetailRootTileBlock.b(SGDetailRootTileBlock.this, SGDetailRootTileBlock.this.C, str2);
                                if (a2 == null) {
                                    return null;
                                }
                                String a3 = com.sankuai.waimai.store.util.i.a(a2.jsonData.get("product_coupon_info"));
                                com.sankuai.waimai.store.repository.model.h hVar = new com.sankuai.waimai.store.repository.model.h();
                                if (a3 != null) {
                                    try {
                                        hVar.a(new JSONObject(a3));
                                        if (b.get("is_need_request") != null && (b.get("is_need_request") instanceof Boolean)) {
                                            hVar.h = ((Boolean) b.get("is_need_request")).booleanValue();
                                        }
                                    } catch (JSONException e) {
                                        com.sankuai.waimai.store.base.log.a.a(e);
                                    }
                                }
                                hVar.i = a2.jsonData.get("product_tags");
                                return hVar;
                            }
                        }, o());
                        return;
                    }
                case 7:
                    Object[] objArr9 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect9 = g;
                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "7a868b7e103a2afe60f8d61e381b6cf7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "7a868b7e103a2afe60f8d61e381b6cf7");
                        return;
                    } else if (bVar == null || this.C == null) {
                        return;
                    } else {
                        al.a(new al.b<List<Poi.PoiImpressLabel>>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.4
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            @Nullable
                            public final /* synthetic */ List<Poi.PoiImpressLabel> a() {
                                Object[] objArr10 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "9a091cddd8db6ed528667ffe41f62495", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (List) PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "9a091cddd8db6ed528667ffe41f62495");
                                }
                                BaseModuleDesc a2 = SGDetailRootTileBlock.a(SGDetailRootTileBlock.this, SGDetailRootTileBlock.this.C, "sm_type_goods_detail_poi_service");
                                if (a2 == null) {
                                    return null;
                                }
                                return (List) com.sankuai.waimai.store.util.i.a(com.sankuai.waimai.store.util.i.a(a2.jsonData.get("poi_label_info")), new TypeToken<ArrayList<Poi.PoiImpressLabel>>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.4.1
                                }.getType());
                            }

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(List<Poi.PoiImpressLabel> list) {
                                List<Poi.PoiImpressLabel> list2 = list;
                                Object[] objArr10 = {list2};
                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "d034f3ad03335d5a3fb302c83477c8ef", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "d034f3ad03335d5a3fb302c83477c8ef");
                                } else if (list2 == null) {
                                } else {
                                    if (SGDetailRootTileBlock.this.M == null) {
                                        SGDetailRootTileBlock.this.M = new SGPoiServiceDialogBlock(SGDetailRootTileBlock.this.m());
                                    }
                                    SGDetailRootTileBlock.this.M.a(list2, (List<Poi.PoiImpressLabel>) null, new SGPoiServiceDialogBlock.a() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.4.2
                                        @Override // com.sankuai.waimai.store.goods.detail.components.subroot.poiservice.SGPoiServiceDialogBlock.a
                                        public final void a() {
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
                    if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "84f5a8051577ee6c71cdca3b3161a3bf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "84f5a8051577ee6c71cdca3b3161a3bf");
                        return;
                    } else if (bVar == null || bVar.c == null || bVar.c.get("currrentCookBookIndex") == null || (obj = bVar.c.get("currrentCookBookIndex")) == null) {
                        return;
                    } else {
                        if (this.N == null) {
                            this.N = new com.sankuai.waimai.store.recipe.a(m(), this.p.c(), o());
                            this.N.bindView(null);
                        }
                        this.N.a(String.valueOf(obj), this.p.d());
                        return;
                    }
                case '\t':
                    Object[] objArr11 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect11 = g;
                    if (PatchProxy.isSupport(objArr11, this, changeQuickRedirect11, false, "d4040dfa37d25568d1d6dc4c9d8e1655", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr11, this, changeQuickRedirect11, false, "d4040dfa37d25568d1d6dc4c9d8e1655");
                        return;
                    } else if (bVar == null || bVar.c == null || bVar.c.get("good_spu") == null) {
                        return;
                    } else {
                        al.a(new al.b<GoodsSpu>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.5
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.store.util.al.b
                            public final /* synthetic */ void a(GoodsSpu goodsSpu) {
                                GoodsSpu goodsSpu2 = goodsSpu;
                                Object[] objArr12 = {goodsSpu2};
                                ChangeQuickRedirect changeQuickRedirect12 = a;
                                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "d7baed0c89d1335882f0eff717fbbd18", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "d7baed0c89d1335882f0eff717fbbd18");
                                } else if (goodsSpu2 == null || SGDetailRootTileBlock.this.l() == null) {
                                } else {
                                    com.sankuai.waimai.store.router.g.a(SGDetailRootTileBlock.this.l(), goodsSpu2, SGDetailRootTileBlock.this.p.c().b);
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            @Override // com.sankuai.waimai.store.util.al.b
                            /* renamed from: b */
                            public GoodsSpu a() {
                                Object[] objArr12 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect12 = a;
                                if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "6fa7cd608458d124f300e2d8ef8bc9bc", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (GoodsSpu) PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "6fa7cd608458d124f300e2d8ef8bc9bc");
                                }
                                String a2 = com.sankuai.waimai.store.util.i.a(bVar.c.get("good_spu"));
                                GoodsSpu goodsSpu = new GoodsSpu();
                                try {
                                    goodsSpu.parseJson(new JSONObject(a2));
                                } catch (JSONException e) {
                                    com.sankuai.shangou.stone.util.log.a.a(e);
                                }
                                return goodsSpu;
                            }
                        }, o());
                        return;
                    }
                case '\n':
                    Object[] objArr12 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect12 = g;
                    if (PatchProxy.isSupport(objArr12, this, changeQuickRedirect12, false, "73f72333d0d0d556dda69316cfd032fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr12, this, changeQuickRedirect12, false, "73f72333d0d0d556dda69316cfd032fb");
                        return;
                    } else {
                        com.sankuai.waimai.store.router.g.a(l(), this.p.c().f(), this.p.c().h(), this.C.mGoodsSpu);
                        return;
                    }
                case 11:
                    Object[] objArr13 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect13 = g;
                    if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "d173fe855f9d75735bfdc86715c162b8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "d173fe855f9d75735bfdc86715c162b8");
                        return;
                    }
                    com.sankuai.waimai.store.platform.domain.manager.poi.a c4 = this.p.c();
                    com.sankuai.waimai.store.router.g.a((SCBaseActivity) m(), c4.f(), c4.h(), this.C.mGoodsSpu, c4.b == null ? "" : c4.b.previewOrderCallbackInfo);
                    return;
                case '\f':
                    Object[] objArr14 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect14 = g;
                    if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "db25c9bab210134e0b92b1769c53d3d8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "db25c9bab210134e0b92b1769c53d3d8");
                        return;
                    } else if (this.k != null) {
                        this.k.r();
                        return;
                    } else {
                        return;
                    }
                case '\r':
                    Object[] objArr15 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect15 = g;
                    if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "8e76fd6723448fb8b6b3aa08eb7078cc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "8e76fd6723448fb8b6b3aa08eb7078cc");
                        return;
                    } else {
                        this.p.a(o());
                        return;
                    }
                case 14:
                    this.E = bVar.c;
                    a(bVar.c);
                    return;
                case 15:
                    Object[] objArr16 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect16 = g;
                    if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "831e815726b766040219c6a9b9604f6c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "831e815726b766040219c6a9b9604f6c");
                        return;
                    } else if (bVar == null || bVar.c == null || bVar.c.get("explanation") == null) {
                        return;
                    } else {
                        String valueOf = String.valueOf(bVar.c.get("explanation"));
                        if (t.a(valueOf)) {
                            return;
                        }
                        View inflate = LayoutInflater.from(m()).inflate(R.layout.wm_sc_dialog_goods_detail_ext, (ViewGroup) null);
                        final CustomDialog customDialog = new CustomDialog(m(), (int) R.style.WmGoodInfoExtraDialogTheme);
                        customDialog.setContentView(inflate);
                        Button button = (Button) customDialog.findViewById(R.id.dialog_confirm);
                        ((TextView) customDialog.findViewById(R.id.dialog_plaintext)).setText(valueOf);
                        button.setBackground(new e.a().a(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{com.sankuai.waimai.store.util.b.b(m(), R.color.wm_sc_nox_search_color_FFE14D), com.sankuai.waimai.store.util.b.b(m(), R.color.wm_sc_nox_search_color_FFC34D)}).a(com.sankuai.shangou.stone.util.h.a(m(), 4.0f)).a());
                        button.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.detail.components.root.SGDetailRootTileBlock.16
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr17 = {view};
                                ChangeQuickRedirect changeQuickRedirect17 = a;
                                if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "b1f7aa0ccabff59d0821e1e220540745", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "b1f7aa0ccabff59d0821e1e220540745");
                                } else {
                                    customDialog.dismiss();
                                }
                            }
                        });
                        customDialog.setCancelable(false);
                        customDialog.setCanceledOnTouchOutside(false);
                        customDialog.show();
                        return;
                    }
                case 16:
                    Object[] objArr17 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect17 = g;
                    if (PatchProxy.isSupport(objArr17, this, changeQuickRedirect17, false, "bd381f03facbe251ada899f9c651d019", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr17, this, changeQuickRedirect17, false, "bd381f03facbe251ada899f9c651d019");
                        return;
                    } else if (bVar == null || bVar.c == null || bVar.c.get("unique_s_types") == null) {
                        return;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        JSONArray optJSONArray = new JSONObject(bVar.c).optJSONArray("unique_s_types");
                        while (optJSONArray != null && i < optJSONArray.length()) {
                            String optString = optJSONArray.optString(i);
                            if (i != optJSONArray.length() - 1) {
                                optString = optString + CommonConstant.Symbol.COMMA;
                            }
                            sb.append(optString);
                            i++;
                        }
                        this.p.a(o(), sb.toString());
                        return;
                    }
                default:
                    if (this.L == null) {
                        this.L = new e(l(), o(), this.A, this.B);
                    }
                    final e eVar = this.L;
                    Object[] objArr18 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect18 = e.a;
                    if (PatchProxy.isSupport(objArr18, eVar, changeQuickRedirect18, false, "ecd3a03efaf916f6aaaa4a6175d5f787", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr18, eVar, changeQuickRedirect18, false, "ecd3a03efaf916f6aaaa4a6175d5f787");
                        return;
                    } else if (bVar != null) {
                        String str2 = bVar.b;
                        int hashCode = str2.hashCode();
                        if (hashCode != -1908813325) {
                            if (hashCode != -849182933) {
                                if (hashCode == -129924593 && str2.equals("food_detail_comment_enter_user_page")) {
                                    c2 = 2;
                                }
                            } else if (str2.equals("food_detail_comment_more_comment_click")) {
                                c2 = 1;
                            }
                        } else if (str2.equals("food_detail_comment_picture_view")) {
                            c2 = 0;
                        }
                        switch (c2) {
                            case 0:
                                Object[] objArr19 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect19 = e.a;
                                if (PatchProxy.isSupport(objArr19, eVar, changeQuickRedirect19, false, "e76dea7ccba5eea4194ff86796ce51af", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr19, eVar, changeQuickRedirect19, false, "e76dea7ccba5eea4194ff86796ce51af");
                                    return;
                                } else if (bVar == null || bVar.c == null) {
                                    return;
                                } else {
                                    al.a(new al.b<e.a>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.e.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.store.util.al.b
                                        public final /* synthetic */ void a(a aVar3) {
                                            a aVar4 = aVar3;
                                            Object[] objArr20 = {aVar4};
                                            ChangeQuickRedirect changeQuickRedirect20 = a;
                                            if (PatchProxy.isSupport(objArr20, this, changeQuickRedirect20, false, "7ee06ae5010da979cbf13e7920eab63c", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr20, this, changeQuickRedirect20, false, "7ee06ae5010da979cbf13e7920eab63c");
                                            } else if (aVar4 == null || com.sankuai.shangou.stone.util.a.c(aVar4.b) <= 0) {
                                            } else {
                                                Activity activity = eVar.b;
                                                ArrayList<com.sankuai.waimai.platform.domain.core.goods.e> arrayList = aVar4.b;
                                                int i2 = aVar4.a;
                                                long j = eVar.e;
                                                Object[] objArr21 = {activity, arrayList, Integer.valueOf(i2), new Long(j)};
                                                ChangeQuickRedirect changeQuickRedirect21 = com.sankuai.waimai.store.router.g.a;
                                                if (PatchProxy.isSupport(objArr21, null, changeQuickRedirect21, true, "ae9c892f674ef50591920a89af5fdce5", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr21, null, changeQuickRedirect21, true, "ae9c892f674ef50591920a89af5fdce5");
                                                } else {
                                                    com.sankuai.waimai.store.router.g.a(activity, arrayList, i2, String.valueOf(j));
                                                }
                                            }
                                        }

                                        @Override // com.sankuai.waimai.store.util.al.b
                                        @Nullable
                                        /* renamed from: b */
                                        public a a() {
                                            Object[] objArr20 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect20 = a;
                                            if (PatchProxy.isSupport(objArr20, this, changeQuickRedirect20, false, "6c5a608ba4f89847028ee6648410328f", RobustBitConfig.DEFAULT_VALUE)) {
                                                return (a) PatchProxy.accessDispatch(objArr20, this, changeQuickRedirect20, false, "6c5a608ba4f89847028ee6648410328f");
                                            }
                                            a aVar3 = new a();
                                            try {
                                                Object obj2 = bVar.c.get("type");
                                                Object obj3 = bVar.c.get("videos");
                                                Object obj4 = bVar.c.get("pictures");
                                                Object obj5 = bVar.c.get("index");
                                                if (obj2 == null) {
                                                    return null;
                                                }
                                                JSONArray jSONArray = new JSONArray(com.sankuai.waimai.store.util.i.a(obj3));
                                                JSONArray jSONArray2 = new JSONArray(com.sankuai.waimai.store.util.i.a(obj4));
                                                eVar.f.clear();
                                                eVar.g.clear();
                                                int a2 = com.sankuai.shangou.stone.util.h.a(com.sankuai.waimai.store.util.b.a());
                                                if (jSONArray2.length() > 0) {
                                                    if (((Boolean) obj2).booleanValue()) {
                                                        ArrayList<Picture> formJsonArray = Picture.formJsonArray(jSONArray2, 2);
                                                        if (com.sankuai.shangou.stone.util.a.c(formJsonArray) > 0) {
                                                            eVar.f.addAll(formJsonArray);
                                                        }
                                                    } else {
                                                        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                                                            String valueOf2 = String.valueOf(jSONArray2.optString(i2));
                                                            Picture picture = new Picture();
                                                            picture.setWmUrlWithQuality(ImageQualityUtil.a(com.sankuai.waimai.store.util.b.a(), valueOf2, 0, a2));
                                                            picture.setWmThumbUrlWithQuality(ImageQualityUtil.a(com.sankuai.waimai.store.util.b.a(), valueOf2, 0, com.sankuai.shangou.stone.util.h.a(com.sankuai.waimai.store.util.b.a(), 80.0f)));
                                                            eVar.f.add(picture);
                                                        }
                                                    }
                                                }
                                                if (jSONArray.length() > 0) {
                                                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                                                        JSONObject optJSONObject = jSONArray.optJSONObject(i3);
                                                        if (optJSONObject != null) {
                                                            Video video = new Video();
                                                            video.parseVideoInfo(optJSONObject);
                                                            eVar.g.add(video);
                                                        }
                                                    }
                                                }
                                                if (com.sankuai.shangou.stone.util.a.b(eVar.f) && com.sankuai.shangou.stone.util.a.b(eVar.g)) {
                                                    return null;
                                                }
                                                ArrayList<com.sankuai.waimai.platform.domain.core.goods.e> arrayList = new ArrayList<>();
                                                if (!com.sankuai.shangou.stone.util.a.b(eVar.g)) {
                                                    arrayList.addAll(Video.toMediaInfos(eVar.g));
                                                }
                                                if (!com.sankuai.shangou.stone.util.a.b(eVar.f)) {
                                                    arrayList.addAll(Picture.toMediaInfos(eVar.f, eVar.b));
                                                }
                                                if (com.sankuai.shangou.stone.util.a.b(arrayList)) {
                                                    return null;
                                                }
                                                if (obj5 != null) {
                                                    aVar3.a = Integer.parseInt(String.valueOf(obj5));
                                                }
                                                aVar3.b = arrayList;
                                                return aVar3;
                                            } catch (Exception e) {
                                                com.sankuai.waimai.store.base.log.a.a(e);
                                                return null;
                                            }
                                        }
                                    }, eVar.c);
                                    return;
                                }
                            case 1:
                                Object[] objArr20 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect20 = e.a;
                                if (PatchProxy.isSupport(objArr20, eVar, changeQuickRedirect20, false, "69c94b78848690d11651c2897029aca7", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr20, eVar, changeQuickRedirect20, false, "69c94b78848690d11651c2897029aca7");
                                    return;
                                } else if (bVar == null || bVar.c == null) {
                                    return;
                                } else {
                                    Object obj2 = bVar.c.get("filterType");
                                    Object obj3 = bVar.c.get("wmCount");
                                    Object obj4 = bVar.c.get("dpCount");
                                    if (obj2 == null || obj3 == null || obj4 == null) {
                                        return;
                                    }
                                    Object obj5 = bVar.c.get("stid");
                                    String valueOf2 = (obj5 == null || t.a(String.valueOf(obj5))) ? "" : String.valueOf(obj5);
                                    Object obj6 = bVar.c.get("skuId");
                                    String valueOf3 = (obj6 == null || t.a(String.valueOf(obj6))) ? "0" : String.valueOf(obj6);
                                    try {
                                        Activity activity = eVar.b;
                                        long j = eVar.e;
                                        long parseLong = Long.parseLong(eVar.d);
                                        int parseInt = Integer.parseInt(String.valueOf(obj2));
                                        int parseInt2 = Integer.parseInt(String.valueOf(obj3));
                                        int parseInt3 = Integer.parseInt(String.valueOf(obj4));
                                        Object[] objArr21 = {activity, new Long(j), new Long(parseLong), Integer.valueOf(parseInt), Integer.valueOf(parseInt2), Integer.valueOf(parseInt3), valueOf2, valueOf3};
                                        ChangeQuickRedirect changeQuickRedirect21 = com.sankuai.waimai.store.router.g.a;
                                        if (PatchProxy.isSupport(objArr21, null, changeQuickRedirect21, true, "3f7424b237f2964bbe91072aa789d2d6", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr21, null, changeQuickRedirect21, true, "3f7424b237f2964bbe91072aa789d2d6");
                                            return;
                                        }
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("poiId", j);
                                        bundle.putLong("spuId", parseLong);
                                        bundle.putString("skuId", valueOf3);
                                        bundle.putString("stid", valueOf2);
                                        bundle.putInt("filterType", parseInt);
                                        bundle.putInt("wmCommentNum", parseInt2);
                                        bundle.putInt("dpCommentNum", parseInt3);
                                        StringBuilder sb2 = new StringBuilder(com.sankuai.waimai.store.router.h.e);
                                        sb2.append("?poiID=" + j);
                                        sb2.append("&spuID=" + parseLong);
                                        sb2.append("&filterType=" + parseInt);
                                        sb2.append("&stid=" + valueOf2);
                                        sb2.append("&skuId=" + valueOf3);
                                        sb2.append("&wmCount=" + parseInt2);
                                        sb2.append("&dpCount=" + parseInt3);
                                        com.sankuai.waimai.store.router.d.a(activity, sb2.toString(), bundle);
                                        return;
                                    } catch (Exception e) {
                                        com.sankuai.waimai.store.base.log.a.a(e);
                                        return;
                                    }
                                }
                            case 2:
                                Object[] objArr22 = {bVar};
                                ChangeQuickRedirect changeQuickRedirect22 = e.a;
                                if (PatchProxy.isSupport(objArr22, eVar, changeQuickRedirect22, false, "398024c71f4b318191d713569c49eacc", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr22, eVar, changeQuickRedirect22, false, "398024c71f4b318191d713569c49eacc");
                                    return;
                                } else if (bVar == null || bVar.c == null) {
                                    return;
                                } else {
                                    Object obj7 = bVar.c.get("userIDStr");
                                    Object obj8 = bVar.c.get("commentIDStr");
                                    Object obj9 = bVar.c.get("isMineReview");
                                    if (obj7 == null || obj8 == null || obj9 == null) {
                                        return;
                                    }
                                    try {
                                        if (v.c) {
                                            Long.parseLong(String.valueOf(obj7));
                                            Long.parseLong(String.valueOf(obj8));
                                            return;
                                        } else if (((Boolean) obj9).booleanValue()) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("comment_id", Long.parseLong(String.valueOf(obj8)));
                                            bundle2.putLong("user_id", Long.parseLong(String.valueOf(obj7)));
                                            com.sankuai.waimai.store.router.d.a(eVar.b, com.sankuai.waimai.store.router.c.f, bundle2);
                                            return;
                                        } else {
                                            Bundle bundle3 = new Bundle();
                                            bundle3.putLong("comment_id", Long.parseLong(String.valueOf(obj8)));
                                            bundle3.putLong("user_id", Long.parseLong(String.valueOf(obj7)));
                                            com.sankuai.waimai.store.router.d.a(eVar.b, com.sankuai.waimai.store.router.c.g, bundle3);
                                            return;
                                        }
                                    } catch (Exception e2) {
                                        com.sankuai.waimai.store.base.log.a.a(e2);
                                        return;
                                    }
                                }
                            default:
                                return;
                        }
                    } else {
                        return;
                    }
            }
        }
    }

    private void a(Map<String, Object> map) {
        com.sankuai.waimai.store.goods.detail.components.subroot.mach.d dVar;
        com.sankuai.waimai.store.goods.detail.components.subroot.mach.d dVar2;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b861f96a6054fe0b4136a94fbfabc86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b861f96a6054fe0b4136a94fbfabc86");
        } else if (map != null) {
            if (this.q != null && com.sankuai.shangou.stone.util.a.a((List) this.q.b) > 0) {
                for (c cVar : this.q.b) {
                    if ((cVar instanceof c.a) && (dVar2 = ((c.a) cVar).g) != null && ("sm_type_goods_detail_price".equals(dVar2.b) || "sm_type_goods_detail_commodity_upgrade".equals(dVar2.b))) {
                        dVar2.a("goods_detail_update_product_subscribe_status", map);
                    }
                }
            }
            if (this.u == null || (dVar = this.u.i) == null) {
                return;
            }
            dVar.a("goods_detail_update_product_subscribe_status", map);
        }
    }

    @Override // com.meituan.android.cube.core.eventhandler.protocol.d
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b4a3736edf4ca81887f9e0a6d820b4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b4a3736edf4ca81887f9e0a6d820b4f");
        } else {
            this.p.b(bundle);
        }
    }

    @Override // com.sankuai.waimai.store.i.poi.a
    public final void c_(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f5ca0396fde932c0079133abdf339db3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f5ca0396fde932c0079133abdf339db3");
        } else if (com.sankuai.waimai.store.order.a.e().b(str, this.p.c().d())) {
            this.p.a(o());
        }
    }

    @Override // com.sankuai.waimai.store.m
    public final boolean r() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6e5ce3c0f18764be85798d745f9d8d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6e5ce3c0f18764be85798d745f9d8d6")).booleanValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = g;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2cc9fa9a27f7cd9e62f20fe6669cd22c", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2cc9fa9a27f7cd9e62f20fe6669cd22c")).booleanValue();
        } else if (this.N == null || !this.N.isVisible()) {
            z = true;
        } else {
            this.N.hide();
            z = false;
        }
        return z && this.p.e();
    }

    @Override // com.sankuai.waimai.store.manager.coupon.c.a
    public final void a(Poi.PoiCouponItem poiCouponItem) {
        Object[] objArr = {poiCouponItem};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ffe18eb6a7c79347b8e55dc570e0e82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ffe18eb6a7c79347b8e55dc570e0e82");
        } else {
            this.p.a(o());
        }
    }

    @Override // com.sankuai.waimai.store.shopping.cart.b
    public final void a(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6443504703af57731212228f1068ac5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6443504703af57731212228f1068ac5d");
        } else if (t.a(this.p.h())) {
        } else {
            jSONObject.put("business_channel", this.p.h());
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.b
    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d3f737cdc60e4d90ad8bd94875b9d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d3f737cdc60e4d90ad8bd94875b9d0");
        } else {
            this.I = false;
        }
    }

    @Subscribe
    public void onAddOrDecFood(com.sankuai.waimai.store.order.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "862ececcfd3747d920051511361cb02b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "862ececcfd3747d920051511361cb02b");
        } else if (cVar != null) {
            this.G = cVar.b;
            this.H = cVar.c;
            this.F = cVar.d;
        }
    }
}

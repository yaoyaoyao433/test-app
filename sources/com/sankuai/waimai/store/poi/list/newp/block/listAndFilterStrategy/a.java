package com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy;

import android.arch.lifecycle.q;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.gson.reflect.TypeToken;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.store.assembler.component.PageEventHandler;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.newwidgets.list.LoadingFooterView;
import com.sankuai.waimai.store.newwidgets.list.SCRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.n;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.platform.shop.model.BaseTileConfigModule;
import com.sankuai.waimai.store.poi.list.newp.filterbar.d;
import com.sankuai.waimai.store.poi.list.refactor.PoiPageViewModel;
import com.sankuai.waimai.store.poi.list.refactor.bean.PoiResult;
import com.sankuai.waimai.store.poi.list.refactor.card.feed_flow.d;
import com.sankuai.waimai.store.repository.model.PoiChannelBackgroundConfig;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.f;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.SGParseSuccess;
import com.sankuai.waimai.store.widgets.filterbar.home.controller.SGSortFilterBarController;
import com.sankuai.waimai.store.widgets.recycler.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements n, com.sankuai.waimai.store.widgets.filterbar.home.controller.d {
    public static ChangeQuickRedirect a;
    protected com.sankuai.waimai.store.widgets.filterbar.home.controller.c b;
    protected com.sankuai.waimai.store.param.a c;
    protected SCRecyclerView d;
    protected com.sankuai.waimai.store.poi.list.newp.filterbar.d e;
    protected NetInfoLoadView f;
    protected RecyclerView g;
    protected LoadingFooterView h;
    protected long i;
    protected String j;
    protected String k;
    protected String l;
    protected com.sankuai.waimai.store.poi.list.newp.filterbar.a m;
    PageEventHandler n;
    protected final com.sankuai.waimai.store.widgets.filterbar.home.controller.a o;
    protected int p;
    protected String q;
    protected d.a r;
    private Map<String, Boolean> s;

    public void a(PoiChannelBackgroundConfig poiChannelBackgroundConfig, PoiVerticalityDataResponse.Promotion promotion) {
    }

    public void a(boolean z) {
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9af7139b0055a6f31c1b658c9766f0bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9af7139b0055a6f31c1b658c9766f0bb");
        }
    }

    public a(com.sankuai.waimai.store.widgets.filterbar.home.controller.c cVar, com.sankuai.waimai.store.param.a aVar, int i) {
        Object[] objArr = {cVar, aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df2e87eca63f3323047c3fc1b3f69dc3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df2e87eca63f3323047c3fc1b3f69dc3");
            return;
        }
        this.s = new HashMap();
        this.b = cVar;
        this.c = aVar;
        this.o = new com.sankuai.waimai.store.widgets.filterbar.home.controller.a(i);
        this.n = (PageEventHandler) q.a((FragmentActivity) this.b.h()).a(PageEventHandler.class);
        this.p = a();
    }

    public int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0503b5ee374c7e36a237b5eefcecfd3b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0503b5ee374c7e36a237b5eefcecfd3b")).intValue() : (h.a((Context) this.b.h()) - h.a(this.b.h(), 32.0f)) / 2;
    }

    public void a(@NonNull View view) {
        RecyclerView.k dVar;
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e283bfb9758f9101c1a6afef3507c67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e283bfb9758f9101c1a6afef3507c67");
            return;
        }
        this.d = (SCRecyclerView) view.findViewById(R.id.wm_st_poi_channel_list);
        SCRecyclerView sCRecyclerView = this.d;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o.a;
        sCRecyclerView.setFlingFactor(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f49a183f1c8daa2c100731607e58ed9b", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f49a183f1c8daa2c100731607e58ed9b")).floatValue() : j.h().a("optimize/user_fling_rate", 1.0f));
        this.f = (NetInfoLoadView) view.findViewById(R.id.layout_net_info_sub);
        this.g = (RecyclerView) view.findViewById(R.id.rv_wm_sc_skeleton);
        this.h = new LoadingFooterView(this.b.h());
        this.h.setNoMoreViewHeight(R.dimen.wm_sc_common_dimen_60);
        this.h.a();
        if (o.e()) {
            dVar = new m(this, o.a(), this.c);
        } else {
            dVar = new com.sankuai.waimai.store.widgets.recycler.d(this, o.a(), this.c);
        }
        this.d.addOnScrollListener(dVar);
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5703663d7d9ebc6e496f7ff6b00d4e33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5703663d7d9ebc6e496f7ff6b00d4e33");
            return;
        }
        this.e = new com.sankuai.waimai.store.poi.list.newp.filterbar.d(this.b, this.b.getView(), this.c, this.o);
        com.sankuai.waimai.store.poi.list.newp.filterbar.d dVar2 = this.e;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = a;
        dVar2.d = PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "b375de085c6e50df87c97aae034c69ac", RobustBitConfig.DEFAULT_VALUE) ? (d.a) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "b375de085c6e50df87c97aae034c69ac") : new d.a() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.poi.list.newp.filterbar.d.a
            public final void a(int i) {
                Object[] objArr5 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "714672795967705a17bde031bea7b952", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "714672795967705a17bde031bea7b952");
                    return;
                }
                a.this.o();
                a.this.n.a((PageEventHandler) new com.sankuai.waimai.store.poi.list.newp.block.rxevent.j());
            }

            @Override // com.sankuai.waimai.store.poi.list.newp.filterbar.d.a
            public final void a(long j, boolean z, String str, String str2) {
                Object[] objArr5 = {new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), str, str2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "2fa317e5ffac84a7e52a807357f9b184", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "2fa317e5ffac84a7e52a807357f9b184");
                    return;
                }
                a.this.i = j;
                a.this.j = str;
                a.this.k = str2;
                a.this.a(false);
                a.this.b.j();
            }

            @Override // com.sankuai.waimai.store.poi.list.newp.filterbar.d.a
            public final void a(String str) {
                Object[] objArr5 = {str};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "7de99a6536dcdb1057b15fc74120d6ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "7de99a6536dcdb1057b15fc74120d6ed");
                    return;
                }
                a.this.l = str;
                a.this.b.j();
            }

            @Override // com.sankuai.waimai.store.poi.list.newp.filterbar.d.a
            public final void a() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "88d58fa1bd8cf0028e65381fdb35ee5a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "88d58fa1bd8cf0028e65381fdb35ee5a");
                } else {
                    a.this.b.a(new com.sankuai.waimai.store.poi.list.newp.block.rxevent.b(true));
                }
            }

            @Override // com.sankuai.waimai.store.poi.list.newp.filterbar.d.a
            public final void b() {
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "324893a58a3b412ad6ce766be1e573a2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "324893a58a3b412ad6ce766be1e573a2");
                } else {
                    a.this.b.a(new com.sankuai.waimai.store.poi.list.newp.block.rxevent.b(false));
                }
            }
        };
        this.m = new com.sankuai.waimai.store.poi.list.newp.filterbar.a(this.d, this.e);
        this.e.b(true);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "999ab2ba26234ea7df1a3bcc7953d9cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "999ab2ba26234ea7df1a3bcc7953d9cf");
        } else if (this.e != null) {
            this.e.d();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "548c348f3482802284be27adc9221c14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "548c348f3482802284be27adc9221c14");
        } else if (this.e != null) {
            com.sankuai.waimai.store.poi.list.newp.filterbar.d dVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.newp.filterbar.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "e79c215e1e799dc522a8f001f8745882", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "e79c215e1e799dc522a8f001f8745882");
            } else {
                SGSortFilterBarController sGSortFilterBarController = dVar.e;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = SGSortFilterBarController.a;
                if (PatchProxy.isSupport(objArr3, sGSortFilterBarController, changeQuickRedirect3, false, "a5c1f05253e2d4ce5e2fc20cde4731c6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, sGSortFilterBarController, changeQuickRedirect3, false, "a5c1f05253e2d4ce5e2fc20cde4731c6");
                } else {
                    sGSortFilterBarController.d.g();
                }
            }
            com.sankuai.waimai.store.poi.list.newp.filterbar.d dVar2 = this.e;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.poi.list.newp.filterbar.d.a;
            if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "dccbd1719cc0d7c1bb151d2ec2e38973", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "dccbd1719cc0d7c1bb151d2ec2e38973");
            } else {
                SGSortFilterBarController sGSortFilterBarController2 = dVar2.e;
                Object[] objArr5 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect5 = SGSortFilterBarController.a;
                if (PatchProxy.isSupport(objArr5, sGSortFilterBarController2, changeQuickRedirect5, false, "ef3b8232cd736dbeb6f729065fdd4617", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, sGSortFilterBarController2, changeQuickRedirect5, false, "ef3b8232cd736dbeb6f729065fdd4617");
                } else {
                    sGSortFilterBarController2.d.a(0L);
                    sGSortFilterBarController2.e();
                }
            }
            com.sankuai.waimai.store.poi.list.newp.filterbar.d dVar3 = this.e;
            Object[] objArr6 = {(byte) 0};
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.poi.list.newp.filterbar.d.a;
            if (PatchProxy.isSupport(objArr6, dVar3, changeQuickRedirect6, false, "97fc862a3e54ce59f026aef6a438d8f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, dVar3, changeQuickRedirect6, false, "97fc862a3e54ce59f026aef6a438d8f8");
            } else {
                dVar3.e.e(false);
            }
            this.i = 0L;
            this.j = null;
            this.k = null;
            this.q = null;
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42362a3ed84d46aacd71c264ee89c10d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42362a3ed84d46aacd71c264ee89c10d");
        } else if (z) {
            this.c.g = this.i;
            this.c.i = this.j;
            this.c.h = this.q;
            this.c.j = this.k;
            com.sankuai.waimai.store.poi.list.model.c m = this.b.m();
            if (m != null) {
                this.c.K = m.d;
                this.c.f = m.b;
                this.c.b = this.c.p();
                String r = this.c.r();
                com.sankuai.waimai.store.param.a aVar = this.c;
                if (t.a(r)) {
                    r = "";
                }
                aVar.k = r;
            }
        }
    }

    public final void g() {
        PoiChannelBackgroundConfig poiChannelBackgroundConfig;
        PoiVerticalityDataResponse.Promotion promotion;
        PoiResult a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c8d0233432f44b021225e9e5511b058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c8d0233432f44b021225e9e5511b058");
        } else if (com.sankuai.waimai.store.util.b.a(this.b.h())) {
        } else {
            PoiChannelBackgroundConfig poiChannelBackgroundConfig2 = null;
            try {
                a2 = ((PoiPageViewModel) q.a((FragmentActivity) this.b.h()).a(PoiPageViewModel.class)).b.a();
            } catch (Exception unused) {
                poiChannelBackgroundConfig = null;
            }
            if (a2 != null && a2.response != null) {
                poiChannelBackgroundConfig = a2.response.getBackgroundConfig();
                try {
                    promotion = a2.response.getBackgroundPromotion();
                } catch (Exception unused2) {
                    promotion = null;
                    poiChannelBackgroundConfig2 = poiChannelBackgroundConfig;
                    a(poiChannelBackgroundConfig2, promotion);
                }
                poiChannelBackgroundConfig2 = poiChannelBackgroundConfig;
                a(poiChannelBackgroundConfig2, promotion);
            }
            promotion = null;
            a(poiChannelBackgroundConfig2, promotion);
        }
    }

    public final Object a(PoiVerticalityDataResponse poiVerticalityDataResponse, String str) {
        Object[] objArr = {poiVerticalityDataResponse, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fef891bbfed7d68c2d92fbf5a5a9472", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fef891bbfed7d68c2d92fbf5a5a9472");
        }
        if (poiVerticalityDataResponse == null || poiVerticalityDataResponse.tileCardData == null) {
            return null;
        }
        Map<String, BaseTileConfigModule> map = poiVerticalityDataResponse.tileCardData;
        if (map.get(str) != null) {
            return i.a(i.a(((BaseTileConfigModule) Objects.requireNonNull(map.get(str))).tileConfig), Object.class);
        }
        return null;
    }

    public final com.sankuai.waimai.store.platform.shop.model.a a(PoiVerticalityDataResponse poiVerticalityDataResponse) {
        Object[] objArr = {poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c22cbd25df71d0f4cba8ca85b57c2720", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.platform.shop.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c22cbd25df71d0f4cba8ca85b57c2720");
        }
        com.sankuai.waimai.store.platform.shop.model.a aVar = new com.sankuai.waimai.store.platform.shop.model.a();
        if (poiVerticalityDataResponse == null || poiVerticalityDataResponse.apiListExtra == null) {
            return aVar;
        }
        try {
            return (com.sankuai.waimai.store.platform.shop.model.a) i.a(i.a(Objects.requireNonNull(poiVerticalityDataResponse.apiListExtra)), com.sankuai.waimai.store.platform.shop.model.a.class);
        } catch (Exception e) {
            e.printStackTrace();
            return aVar;
        }
    }

    public final boolean a(com.sankuai.waimai.store.platform.shop.model.a aVar, BaseModuleDesc baseModuleDesc, int i) {
        Object[] objArr = {aVar, baseModuleDesc, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40840718bfe501e77c69e23e1e7260f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40840718bfe501e77c69e23e1e7260f0")).booleanValue();
        }
        if (baseModuleDesc == null || baseModuleDesc.moduleType != 1 || baseModuleDesc.jsonData == null) {
            return true;
        }
        return (baseModuleDesc.jsonData.get("ad_type") != null && baseModuleDesc.jsonData.get("ad_type").equals(Double.valueOf(Double.parseDouble("2")))) || !aVar.a || t.a(this.c.aH) || this.c.b != 0 || i >= aVar.b || !this.c.aH.equals(baseModuleDesc.jsonData.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
    }

    public final void a(PoiVerticalityDataResponse poiVerticalityDataResponse, boolean z) {
        Object[] objArr = {poiVerticalityDataResponse, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "54fa2bf354d2aadc0a3a5c3d79158405", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "54fa2bf354d2aadc0a3a5c3d79158405");
        } else if (poiVerticalityDataResponse == null) {
        } else {
            if (o.e()) {
                if (com.sankuai.waimai.foundation.utils.b.c(poiVerticalityDataResponse.poiCardInfos) > o.n() || this.c.p() > 1) {
                    return;
                }
                w();
            } else if (z && this.c.K == 4 && com.sankuai.waimai.foundation.utils.b.c(poiVerticalityDataResponse.poiCardInfos) < 5) {
                w();
            }
        }
    }

    private void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29cc8f341dadcee7e6b4ce57177db080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29cc8f341dadcee7e6b4ce57177db080");
        } else if (this.b == null) {
        } else {
            if (this.b.l()) {
                this.b.k();
            } else {
                this.h.b();
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void a(d.a aVar) {
        this.r = aVar;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final long h() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final String i() {
        return this.j;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final String j() {
        return this.k;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final String k() {
        return this.q;
    }

    public final void a(String str) {
        this.q = str;
        this.c.h = str;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.n
    public final void bm_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0739b2baa2045834d244e0c0014c3ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0739b2baa2045834d244e0c0014c3ca");
        } else if (s()) {
        } else {
            if (this.b.l()) {
                this.h.d();
                this.b.k();
                return;
            }
            this.h.b();
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "180df036c394e6246c0167ed846833a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "180df036c394e6246c0167ed846833a9");
        } else {
            this.h.a();
        }
    }

    public void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adb5f98dd98fd7733289c2844165f653", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adb5f98dd98fd7733289c2844165f653");
        } else if (this.e != null) {
            com.sankuai.waimai.store.poi.list.newp.filterbar.d dVar = this.e;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.poi.list.newp.filterbar.d.a;
            if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "c5a8d0424cae1fe3a2d839cdd4d0fd5f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "c5a8d0424cae1fe3a2d839cdd4d0fd5f");
            } else if (dVar.e != null) {
                SGSortFilterBarController sGSortFilterBarController = dVar.e;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = SGSortFilterBarController.a;
                if (PatchProxy.isSupport(objArr3, sGSortFilterBarController, changeQuickRedirect3, false, "fe1fb44791b7ece58c7db649273dedcf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, sGSortFilterBarController, changeQuickRedirect3, false, "fe1fb44791b7ece58c7db649273dedcf");
                    return;
                }
                com.meituan.android.bus.a.a().b(sGSortFilterBarController);
                if (sGSortFilterBarController.b != null) {
                    sGSortFilterBarController.b.onDestroy();
                }
                if (sGSortFilterBarController.c != null) {
                    sGSortFilterBarController.c.onDestroy();
                }
                if (sGSortFilterBarController.h != null) {
                    sGSortFilterBarController.h.b();
                }
            }
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.home.controller.d
    public final int n() {
        return this.o.a;
    }

    public final String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bedc8c7115bf7f85fd379dbca981469a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bedc8c7115bf7f85fd379dbca981469a");
        }
        if (o.l()) {
            try {
                ErrorCode errorCode = new ErrorCode(ErrorCode.ERROR_TYPE_B, i == 1 ? "301" : "302", "41SD");
                String replace = com.sankuai.waimai.store.diting.a.a(errorCode, this.b.h().getApplicationContext()).b("28616").b.buildErrorCodeStr().replace('(', Constants.SPACE).replace(')', Constants.SPACE);
                com.sankuai.waimai.store.diting.a.a(errorCode);
                return replace;
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
        return "";
    }

    public final void a(com.sankuai.waimai.store.widgets.recycler.b bVar, PoiVerticalityDataResponse poiVerticalityDataResponse) {
        PoiVerticalityDataResponse.SubNaviInfo subNaviInfo;
        Object[] objArr = {bVar, poiVerticalityDataResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a0d51925280b7c070f8537a7402cd0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a0d51925280b7c070f8537a7402cd0a");
        } else if (poiVerticalityDataResponse == null || (subNaviInfo = poiVerticalityDataResponse.subNaviInfo) == null || subNaviInfo.subNavStyle != 6 || this.s.containsKey(this.c.f)) {
        } else {
            this.s.put(this.c.f, Boolean.TRUE);
            if (poiVerticalityDataResponse.spuQuickFilter != null) {
                this.c.bf = poiVerticalityDataResponse.spuQuickFilter.hasValuedFilterData();
            } else {
                this.c.bf = false;
            }
            if (this.c.R == 6 && !this.c.bf && this.c.O) {
                View view = new View(this.b.h());
                view.setMinimumHeight(this.c.bm ? 0 : h.a(this.b.h(), 6.0f));
                bVar.c(view);
            }
        }
    }

    public final void a(List<f> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "845850dd23fba415580b6f73828f3d8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "845850dd23fba415580b6f73828f3d8d");
        } else if (o.j() && !com.sankuai.waimai.foundation.utils.b.b(list) && this.c != null) {
            ArrayList arrayList = (ArrayList) j.h().a(SCConfigPath.EXPOSE_TARGET_MODULE, new TypeToken<List<Map<String, String>>>() { // from class: com.sankuai.waimai.store.poi.list.newp.block.listAndFilterStrategy.a.2
            }.getType(), new ArrayList());
            if (com.sankuai.waimai.foundation.utils.b.b(arrayList)) {
                return;
            }
            for (int i = 0; i < com.sankuai.waimai.foundation.utils.b.c(list); i++) {
                f fVar = (f) com.sankuai.waimai.foundation.utils.b.a(list, i);
                if (fVar != null && fVar.i != null && fVar.i.moduleDesc != null && fVar.i.moduleDesc.templateId != null) {
                    String str = fVar.i.moduleDesc.templateId;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        Map map = (Map) com.sankuai.waimai.foundation.utils.b.a(arrayList, i2);
                        if (map.get("templateID") != null && ((String) map.get("templateID")).equals(str)) {
                            com.sankuai.waimai.store.util.monitor.b.a().a(SGParseSuccess.SGParseSuccess).a("appVersion", com.sankuai.waimai.foundation.core.common.a.a().e()).a("cate_code", String.valueOf(this.c.c)).a("module_name", str).a("interface_name", "v9/poi/supermarket/channelpage").a();
                        }
                    }
                }
            }
        }
    }
}

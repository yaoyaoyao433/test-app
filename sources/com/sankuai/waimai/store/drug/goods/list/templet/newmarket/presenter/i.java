package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter;

import android.arch.lifecycle.q;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.drug.goods.list.controller.DrugShopStatusViewModel;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.platform.shop.model.IMarketResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends i.a {
    public static ChangeQuickRedirect c;
    @NonNull
    final com.sankuai.waimai.store.platform.domain.manager.poi.a d;
    boolean e;
    SCBaseActivity f;
    @Nullable
    private i.a g;
    private final b h;

    public i(i.b bVar, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, SCBaseActivity sCBaseActivity) {
        super(bVar);
        Object[] objArr = {bVar, aVar, sCBaseActivity};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5234815704fc1aceb29b1daed9c4e447", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5234815704fc1aceb29b1daed9c4e447");
            return;
        }
        this.e = false;
        this.d = aVar;
        this.f = sCBaseActivity;
        if (bVar.d() == 1) {
            this.h = new c();
        } else {
            this.h = new d();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(IMarketResponse iMarketResponse) {
        Object[] objArr = {iMarketResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b431dbf32b569784b109b6a755db330", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b431dbf32b569784b109b6a755db330");
            return;
        }
        this.g = new com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.smooth.a(this.b, this.d);
        this.g.a(iMarketResponse);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final int a(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa905229870c28a7b88d59daf33dbc40", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa905229870c28a7b88d59daf33dbc40")).intValue();
        }
        if (this.g == null) {
            return 0;
        }
        return this.g.a(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95934ca6fb916141830e9f26c99beffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95934ca6fb916141830e9f26c99beffa");
        } else if (this.g == null) {
        } else {
            this.g.a(goodsPoiCategory, goodsPoiCategory2);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5f0e447f79d47db26a68cb0b3b2e5a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5f0e447f79d47db26a68cb0b3b2e5a7");
        } else if (this.g == null) {
        } else {
            this.g.a(str);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void b(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55b92defae40690fbc3c67343a15c28b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55b92defae40690fbc3c67343a15c28b");
        } else if (this.g == null) {
        } else {
            this.g.b(goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final GoodsPoiCategory a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc9219264dc5bb9d635862c5467c0808", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc9219264dc5bb9d635862c5467c0808");
        }
        if (this.g == null) {
            return null;
        }
        return this.g.a();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final GoodsPoiCategory b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f045babc706cbef395a824f64505165", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f045babc706cbef395a824f64505165");
        }
        if (this.g == null) {
            return null;
        }
        return this.g.b();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final long c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92cb00baef3402da5c06bbb269912dae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92cb00baef3402da5c06bbb269912dae")).longValue();
        }
        if (this.g == null) {
            return 0L;
        }
        return this.g.c();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ad3a9f8a033c3a3a7d978900b7e4d65", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ad3a9f8a033c3a3a7d978900b7e4d65")).booleanValue() : this.g != null && this.g.a(goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(int i, GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu, int i2, List<Long> list) {
        Object[] objArr = {Integer.valueOf(i), goodsPoiCategory, goodsSpu, Integer.valueOf(i2), list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45c2da390f4b1e47aa6433d23d708e70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45c2da390f4b1e47aa6433d23d708e70");
        } else if (this.g == null) {
        } else {
            this.g.a(i, goodsPoiCategory, goodsSpu, i2, list);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bdf672d50b8ce9a1ab6b9e262ee56e00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bdf672d50b8ce9a1ab6b9e262ee56e00");
        } else if (this.g == null) {
        } else {
            this.g.d();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4bc02efda04b9b29e6c2a4ce34b917e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4bc02efda04b9b29e6c2a4ce34b917e")).intValue();
        }
        if (this.g == null) {
            return 0;
        }
        return this.g.e();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b4bbdb8cc8f569a86dc9f36097986c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b4bbdb8cc8f569a86dc9f36097986c1")).intValue();
        }
        if (this.g == null) {
            return 0;
        }
        return this.g.f();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed35200209c706ed47f730127b7614cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed35200209c706ed47f730127b7614cb");
        } else if (this.g == null) {
        } else {
            this.g.a(j);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd383f8f8ace0256402a55f4ccc3f6c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd383f8f8ace0256402a55f4ccc3f6c8");
        } else if (this.g == null) {
        } else {
            this.g.b(str);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c723ec0e838eb16cc9ab9516995c6bf3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c723ec0e838eb16cc9ab9516995c6bf3")).booleanValue() : this.g != null && this.g.g();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final GoodsPoiCategory h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fd9b9dae7743418c0fffbcf90730421", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsPoiCategory) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fd9b9dae7743418c0fffbcf90730421");
        }
        if (this.g == null) {
            return null;
        }
        return this.g.h();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean c(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1889e3b6f5f864b252ff708bdd35cc14", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1889e3b6f5f864b252ff708bdd35cc14")).booleanValue() : this.g != null && this.g.c(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean d(GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23e5b32132c971a418800c86ebe1dbc6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23e5b32132c971a418800c86ebe1dbc6")).booleanValue() : this.g != null && this.g.d(goodsPoiCategory);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final int a(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "166d7c897405184ee2e7bd8da84a9bb4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "166d7c897405184ee2e7bd8da84a9bb4")).intValue();
        }
        if (this.g == null) {
            return 0;
        }
        return this.g.a(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d02860a6c6f83d08e2434b0a289e83ec", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d02860a6c6f83d08e2434b0a289e83ec")).booleanValue() : this.g != null && this.g.b(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean c(GoodsPoiCategory goodsPoiCategory, GoodsSpu goodsSpu) {
        Object[] objArr = {goodsPoiCategory, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6099d520705f624d1afbc4c9c026c524", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6099d520705f624d1afbc4c9c026c524")).booleanValue() : this.g != null && this.g.c(goodsPoiCategory, goodsSpu);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(long j, long j2, int i) {
        Object[] objArr = {new Long(j), new Long(j2), Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46616b36d2920af357551c21532f4848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46616b36d2920af357551c21532f4848");
        } else if (this.g != null) {
            this.g.a(j, j2, i);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dbc88c02b206cf3dc369ace40505fd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dbc88c02b206cf3dc369ace40505fd2");
        } else if (this.g != null) {
            this.g.a(goodsSpu, goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final boolean b(GoodsPoiCategory goodsPoiCategory, GoodsPoiCategory goodsPoiCategory2) {
        Object[] objArr = {goodsPoiCategory, goodsPoiCategory2};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e6f8fd9323abec64b66b15c49e6c0cc", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e6f8fd9323abec64b66b15c49e6c0cc")).booleanValue() : this.g != null && this.g.b(goodsPoiCategory, goodsPoiCategory2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    class a extends k<RestMenuResponse> {
        public static ChangeQuickRedirect a;

        private a() {
            Object[] objArr = {i.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73904efd63779bc3f454cf5926c2a12f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73904efd63779bc3f454cf5926c2a12f");
            }
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final /* synthetic */ void a(Object obj) {
            RestMenuResponse restMenuResponse = (RestMenuResponse) obj;
            Object[] objArr = {restMenuResponse};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672d176a5bbb73c69c315c4e1ba1e8c7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672d176a5bbb73c69c315c4e1ba1e8c7");
                return;
            }
            restMenuResponse.setChosenSpu(i.this.b.k(), i.this.b.l());
            if (!com.sankuai.waimai.store.util.b.a(i.this.f)) {
                DrugShopStatusViewModel drugShopStatusViewModel = (DrugShopStatusViewModel) q.a((FragmentActivity) i.this.f).a(DrugShopStatusViewModel.class);
                if (!TextUtils.isEmpty(restMenuResponse.homePageScheme)) {
                    drugShopStatusViewModel.g = restMenuResponse.homePageScheme;
                }
                if (restMenuResponse.getPoi() != null) {
                    Poi poi = restMenuResponse.getPoi();
                    if (i.this.d != null) {
                        i.this.d.k = poi.needHideAddButton();
                    }
                    if (!poi.isOffline) {
                        drugShopStatusViewModel.b.b((android.arch.lifecycle.k<com.sankuai.waimai.store.drug.goods.list.model.a>) new com.sankuai.waimai.store.drug.goods.list.model.a(poi.currentRemainingTime, poi.currentRemainingText, poi.nextSellTimeText, poi.nextDeliveryTimeText, poi.nextDeliveryTimeType, poi.state, poi.subscribe, poi.id, poi.poiIdStr));
                    }
                    drugShopStatusViewModel.e.b((android.arch.lifecycle.k<Boolean>) Boolean.valueOf(poi.isShowShopRestBottomTip()));
                    drugShopStatusViewModel.f.b((android.arch.lifecycle.k<com.sankuai.waimai.store.drug.goods.list.model.c>) new com.sankuai.waimai.store.drug.goods.list.model.c(poi.isOffline, poi.name, poi.headPicUrl));
                }
            }
            if (DrugShopStatusViewModel.a(restMenuResponse)) {
                i.this.b.j();
                return;
            }
            i.this.a(restMenuResponse);
            i.this.b.i();
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed054fe71d93ebc0270ccbdff39adfe7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed054fe71d93ebc0270ccbdff39adfe7");
                return;
            }
            i.this.e = true;
            i.this.b.h();
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1687fcf52a405ca30c2132d7e54ea363", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1687fcf52a405ca30c2132d7e54ea363");
            } else {
                i.this.b.a(bVar.b);
            }
        }

        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9209bedffc21e5ced78c326a3734b473", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9209bedffc21e5ced78c326a3734b473");
            } else {
                i.this.e = false;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static abstract class b {
        public static ChangeQuickRedirect a;
        protected String b;

        public abstract void a(long j, String str, long j2, String str2, k<RestMenuResponse> kVar);

        void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87f9e5c46b00714365fc1703755ca8a5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87f9e5c46b00714365fc1703755ca8a5");
            } else if (TextUtils.isEmpty(this.b)) {
                this.b = str;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class c extends b {
        public static ChangeQuickRedirect c;

        public c() {
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.i.b
        public final void a(long j, String str, long j2, String str2, k<RestMenuResponse> kVar) {
            Object[] objArr = {new Long(j), str, new Long(j2), str2, kVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb6562fa45566350e940d2fedf7c9e29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb6562fa45566350e940d2fedf7c9e29");
            } else {
                com.sankuai.waimai.store.drug.base.net.b.a(this.b).a(j, str, -1L, j2, str2, "2", kVar);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class d extends b {
        public static ChangeQuickRedirect c;

        public d() {
        }

        @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.presenter.i.b
        public final void a(long j, String str, long j2, String str2, k<RestMenuResponse> kVar) {
            Object[] objArr = {new Long(j), str, new Long(j2), str2, kVar};
            ChangeQuickRedirect changeQuickRedirect = c;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f788ce2c1b1dbc498cba6a08e35069dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f788ce2c1b1dbc498cba6a08e35069dc");
            } else {
                com.sankuai.waimai.store.drug.base.net.c.a(this.b).a(j, str, j2, str2, kVar);
            }
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.templet.newmarket.i.a
    public final void a(String str, long j) {
        boolean z = false;
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25c45d292bb971646b10b68ab42f3956", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25c45d292bb971646b10b68ab42f3956");
            return;
        }
        if (this.g == null && !this.e) {
            this.h.a(this.b.A());
            this.h.a(this.d.g(), this.d.h(), j, str, new a());
            return;
        }
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c792e06a22f8e35bf7f731114ac76758", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c792e06a22f8e35bf7f731114ac76758")).booleanValue();
        } else if (-1000 == j || 0 == j) {
            z = true;
        }
        if (z) {
            d();
        } else {
            a(String.valueOf(j));
        }
    }
}

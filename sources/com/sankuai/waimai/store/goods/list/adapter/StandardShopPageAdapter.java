package com.sankuai.waimai.store.goods.list.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentManager;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.SGCommonRNFragment;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.config.k;
import com.sankuai.waimai.store.goods.list.templet.newmarket.h;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMRNFragment;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.tabs.PoiTabMscFragment;
import com.sankuai.waimai.store.goods.list.viewblocks.n;
import com.sankuai.waimai.store.goods.list.viewblocks.o;
import com.sankuai.waimai.store.goods.list.viewblocks.pagenotfound.PageNotFoundManager;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.StrollAroundContainerBlock;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.router.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class StandardShopPageAdapter extends GoodsListCachePagerAdapter {
    public static ChangeQuickRedirect b;
    public final List<RestMenuResponse.b> c;
    public final SparseArray<com.sankuai.waimai.store.base.b> d;
    private Context e;
    private com.sankuai.waimai.store.goods.list.delegate.e f;
    private RestMenuResponse g;
    private FragmentManager h;
    private final a i;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b {
        PoiTabMscFragment a();

        String b();
    }

    public StandardShopPageAdapter(Context context, com.sankuai.waimai.store.goods.list.delegate.e eVar, FragmentManager fragmentManager) {
        Object[] objArr = {context, eVar, fragmentManager};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33c2de626e57c24084a0ccb684df5783", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33c2de626e57c24084a0ccb684df5783");
            return;
        }
        this.c = new ArrayList();
        this.i = new a();
        this.d = new SparseArray<>();
        this.e = context;
        this.f = eVar;
        this.h = fragmentManager;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e076f9bad64477c7c3ff9741cbd2a853", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e076f9bad64477c7c3ff9741cbd2a853");
            return;
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            com.sankuai.waimai.store.base.b valueAt = this.d.valueAt(i);
            if (valueAt != null) {
                valueAt.onDestroy();
            }
        }
    }

    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c99e941248cba747e44e4090e4d9ee33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c99e941248cba747e44e4090e4d9ee33");
            return;
        }
        this.g = restMenuResponse;
        this.c.clear();
        a();
        this.d.clear();
        if (restMenuResponse != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) restMenuResponse.navigationBars)) {
            this.c.addAll(restMenuResponse.navigationBars);
        }
        notifyDataSetChanged();
    }

    @Override // com.sankuai.waimai.store.goods.list.adapter.GoodsListCachePagerAdapter
    public final com.sankuai.waimai.store.base.b a(ViewGroup viewGroup, int i) {
        n nVar;
        com.sankuai.waimai.store.base.b a2;
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2a361cce3b0ae120c4560993815961d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2a361cce3b0ae120c4560993815961d");
        }
        RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
        int i2 = bVar == null ? -1 : bVar.c;
        if (i2 == 3) {
            Object[] objArr2 = {bVar};
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bfb88cd884e74cf7d6896acf6db02259", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bfb88cd884e74cf7d6896acf6db02259");
            } else {
                Poi poi = this.f.d().b;
                if (poi != null && poi.isMscPoiVip() && k.d()) {
                    HashMap hashMap = new HashMap();
                    String str = "imeituan://www.meituan.com/msc?isWidget=true&appId=7122f6e193de47c1&targetPath=%2Fpages%2Fsgc_poi_memeber%2Findex";
                    if (bVar.f != null && !t.a(bVar.f.scheme)) {
                        str = bVar.f.scheme;
                    }
                    a2 = a(bVar, str, hashMap);
                } else {
                    PoiTabMRNFragment a3 = PoiTabMRNFragment.a("supermarket", "flashbuy-membercard-detail", "flashbuy-poi-membercard-detail");
                    a3.a(this.f);
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("poi_id", String.valueOf(this.f.d().f()));
                    hashMap2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.f.d().h());
                    hashMap2.put("extra", b());
                    ((SGCommonRNFragment) a3).j = hashMap2;
                    a3.a(this.f);
                    nVar = new n(this.e, a3, this.h, this.i.a());
                    a2 = nVar;
                }
            }
        } else if (i2 == 11) {
            a2 = new StrollAroundContainerBlock(this.e, this.f, this.g, bVar);
        } else {
            switch (i2) {
                case 6:
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = b;
                    if (!PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f8b8920c293810bf4bc09b8152da19dc", RobustBitConfig.DEFAULT_VALUE)) {
                        Poi poi2 = this.f.d().b;
                        if (poi2.isMscPoiCommentTab() && k.d()) {
                            String a4 = i.h().a("msc_schemes/poi/comment_tab", "imeituan://www.meituan.com/msc?appId=7122f6e193de47c1&reload=true&targetPath=%2Fpages%2Fcomment-tab%2Findex");
                            if (bVar.f != null && !t.a(bVar.f.scheme)) {
                                a4 = bVar.f.scheme;
                            }
                            a2 = a(bVar, a4, new HashMap());
                            break;
                        } else {
                            String str2 = "supermarket";
                            String str3 = "flashbuy-store-info";
                            if (poi2 != null && !this.f.d().t() && poi2.addition != null && "A".equals(poi2.addition.level2FoodPageJump)) {
                                str2 = "sgc";
                                str3 = "flashbuy-restaurant-info";
                            }
                            PoiTabMRNFragment a5 = PoiTabMRNFragment.a(str2, str3, "flashbuy-store-comments");
                            HashMap hashMap3 = new HashMap();
                            hashMap3.put("poi_id", String.valueOf(this.f.d().f()));
                            hashMap3.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.f.d().h());
                            hashMap3.put("comment_from_type", "3");
                            hashMap3.put("cid", this.f.b());
                            ((SGCommonRNFragment) a5).j = hashMap3;
                            a5.a(this.f);
                            nVar = new n(this.e, a5, this.h, this.i.a());
                            a2 = nVar;
                            break;
                        }
                    } else {
                        a2 = (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f8b8920c293810bf4bc09b8152da19dc");
                        break;
                    }
                    break;
                case 7:
                    Object[] objArr4 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect4 = b;
                    if (!PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d8f2bfa1ca143c334b804280099e2b8d", RobustBitConfig.DEFAULT_VALUE)) {
                        Poi poi3 = this.f.d().b;
                        if (poi3.isMscPoiDetail() && k.d()) {
                            HashMap hashMap4 = new HashMap();
                            hashMap4.put("cid", "c_waimai_q3wk35v1");
                            String str4 = "imeituan://www.meituan.com/msc?appId=7122f6e193de47c1&targetPath=%2Fpages%2Fstore-info%2Findex%3Freload=false";
                            if (bVar.f != null && !t.a(bVar.f.scheme)) {
                                str4 = bVar.f.scheme;
                            }
                            a2 = a(bVar, str4, hashMap4);
                            break;
                        } else {
                            String str5 = "flashbuy-store-info";
                            String str6 = "supermarket";
                            if (poi3 != null && !this.f.d().t() && poi3.addition != null && "A".equals(poi3.addition.level2FoodPageJump)) {
                                str6 = "sgc";
                                str5 = "flashbuy-restaurant-info";
                            }
                            PoiTabMRNFragment a6 = PoiTabMRNFragment.a(str6, str5, "flashbuy-store-info-only");
                            HashMap hashMap5 = new HashMap();
                            hashMap5.put("poiId", String.valueOf(this.f.d().f()));
                            hashMap5.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.f.d().h());
                            hashMap5.put("mrn_min_version", "7.56.0");
                            ((SGCommonRNFragment) a6).j = hashMap5;
                            a6.a(this.f);
                            nVar = new n(this.e, a6, this.h, this.i.a());
                            a2 = nVar;
                            break;
                        }
                    } else {
                        a2 = (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d8f2bfa1ca143c334b804280099e2b8d");
                        break;
                    }
                    break;
                default:
                    a2 = new h(this.e, this.f, this.g);
                    break;
            }
        }
        this.d.put(i, a2);
        return a2;
    }

    private com.sankuai.waimai.store.base.b a(@NonNull RestMenuResponse.b bVar, @NonNull String str, @Nullable Map<String, String> map) {
        Object[] objArr = {bVar, str, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6ec9ecb315f843d55c90bef42c31371", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6ec9ecb315f843d55c90bef42c31371");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("cid", this.f.b());
        hashMap.put("poi_id", String.valueOf(this.f.d().f()));
        hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.f.d().h());
        hashMap.put("extra", b());
        if (!map.isEmpty()) {
            hashMap.putAll(map);
        }
        final String a2 = g.a(str, hashMap);
        PoiTabMscFragment a3 = PoiTabMscFragment.a(Uri.parse(a2), new HashMap());
        a3.a(this.f);
        o oVar = new o(this.e, a3, this.h, this.i.a());
        oVar.a(new b() { // from class: com.sankuai.waimai.store.goods.list.adapter.StandardShopPageAdapter.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.goods.list.adapter.StandardShopPageAdapter.b
            public final PoiTabMscFragment a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0722edc20b52636a6e6b35dea4d7fe3", RobustBitConfig.DEFAULT_VALUE)) {
                    return (PoiTabMscFragment) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0722edc20b52636a6e6b35dea4d7fe3");
                }
                PoiTabMscFragment a4 = PoiTabMscFragment.a(Uri.parse(a2), new HashMap());
                a4.a(StandardShopPageAdapter.this.f);
                return a4;
            }

            @Override // com.sankuai.waimai.store.goods.list.adapter.StandardShopPageAdapter.b
            public final String b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3b7c69e2f1cb42bd5440818e0b98346", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3b7c69e2f1cb42bd5440818e0b98346") : PageNotFoundManager.b(a2);
            }
        });
        return oVar;
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad1b70a268bbdbf0807c27ff9d222599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad1b70a268bbdbf0807c27ff9d222599");
            return;
        }
        RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
        com.sankuai.waimai.store.base.b c = c(bVar == null ? -1 : bVar.c);
        if (c instanceof h) {
            h hVar = (h) c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect2, false, "78fea40ff73bd0a8e112289a4013ea1f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect2, false, "78fea40ff73bd0a8e112289a4013ea1f");
            } else {
                hVar.b.R();
            }
        } else if (c instanceof StrollAroundContainerBlock) {
            StrollAroundContainerBlock strollAroundContainerBlock = (StrollAroundContainerBlock) c;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = StrollAroundContainerBlock.a;
            if (PatchProxy.isSupport(objArr3, strollAroundContainerBlock, changeQuickRedirect3, false, "92c65fc2558f6fc847121a4d5a4064ea", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, strollAroundContainerBlock, changeQuickRedirect3, false, "92c65fc2558f6fc847121a4d5a4064ea");
            } else if (strollAroundContainerBlock.b != null) {
                strollAroundContainerBlock.b.a();
            }
        } else if (c instanceof n) {
            n nVar = (n) c;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = n.a;
            if (PatchProxy.isSupport(objArr4, nVar, changeQuickRedirect4, false, "ae21fc1bfa1b68446d8dde426c3c4fe4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, nVar, changeQuickRedirect4, false, "ae21fc1bfa1b68446d8dde426c3c4fe4");
            } else if (nVar.b != null) {
                nVar.b.fullScroll(33);
                nVar.b.scrollTo(0, 0);
                nVar.b.smoothScrollTo(0, 0);
            }
        } else if (c instanceof o) {
            o oVar = (o) c;
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = o.a;
            if (PatchProxy.isSupport(objArr5, oVar, changeQuickRedirect5, false, "e7b306945f21df081c010ddc633f7213", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, oVar, changeQuickRedirect5, false, "e7b306945f21df081c010ddc633f7213");
            }
        }
    }

    public final com.sankuai.waimai.store.base.b c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cefb3b612d64de9c1f6026554beae83c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.base.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cefb3b612d64de9c1f6026554beae83c");
        }
        int d = d(i);
        if (d < 0 || d >= this.d.size()) {
            return null;
        }
        return this.d.get(d);
    }

    private String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e967172c17011ebe72fe2d1814659983", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e967172c17011ebe72fe2d1814659983") : com.sankuai.waimai.store.goods.list.utils.d.a(this.f.k().getIntent(), "extra", "extra", "");
    }

    @Override // com.sankuai.waimai.store.goods.list.adapter.GoodsListCachePagerAdapter
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "399b65b7a6bb1b465089647a4d0a3dee", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "399b65b7a6bb1b465089647a4d0a3dee")).intValue();
        }
        RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i);
        if (bVar == null) {
            return -1;
        }
        return bVar.c;
    }

    public final int d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70e06cc0c1cb8beae5313a0b0130c6b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70e06cc0c1cb8beae5313a0b0130c6b7")).intValue();
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) this.c);
        for (int i2 = 0; i2 < a2; i2++) {
            RestMenuResponse.b bVar = (RestMenuResponse.b) com.sankuai.shangou.stone.util.a.a((List<Object>) this.c, i2);
            if (bVar != null && bVar.c == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.support.v4.view.PagerAdapter
    public final int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15e2017280b5ea1f8c9b8e2335a6ffe", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15e2017280b5ea1f8c9b8e2335a6ffe")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.c);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public final int[] b;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a0ed15a67ac01ba56e309e2e6199b1f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a0ed15a67ac01ba56e309e2e6199b1f");
            } else {
                this.b = new int[]{R.id.wm_sc_shop_content_container_id_1, R.id.wm_sc_shop_content_container_id_2, R.id.wm_sc_shop_content_container_id_3, R.id.wm_sc_shop_content_container_id_4, R.id.wm_sc_shop_content_container_id_5, R.id.wm_sc_shop_content_container_id_6, R.id.wm_sc_shop_content_container_id_7, R.id.wm_sc_shop_content_container_id_8, R.id.wm_sc_shop_content_container_id_9};
            }
        }

        public final int a() {
            int i = 0;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4bbf160467d7a1ff835c16d23da94d2f", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4bbf160467d7a1ff835c16d23da94d2f")).intValue();
            }
            int i2 = -1;
            while (true) {
                if (i >= this.b.length) {
                    break;
                }
                i2 = this.b[i];
                if (i2 != -1) {
                    this.b[i] = -1;
                    break;
                }
                i++;
            }
            return i2 == -1 ? View.generateViewId() : i2;
        }
    }
}

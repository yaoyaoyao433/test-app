package com.sankuai.waimai.store.goods.detail.components.root;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.goods.detail.components.root.a;
import com.sankuai.waimai.store.goods.detail.components.root.c;
import com.sankuai.waimai.store.goods.detail.components.root.h;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.PoiCommonMachListItem;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.WaterFallMachResponse;
import com.sankuai.waimai.store.pagingload.a;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiNotification;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4;
import com.sankuai.waimai.store.repository.model.BaseTile;
import com.sankuai.waimai.store.repository.model.GoodsDetailResponse;
import com.sankuai.waimai.store.util.monitor.monitor.DrugSchemeMonitor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends h.a {
    public static ChangeQuickRedirect c;
    final com.sankuai.waimai.store.platform.domain.manager.poi.a d;
    GoodsSku e;
    boolean f;
    boolean g;
    WaterFallMachResponse h;
    private GoodsSpu i;
    private Float j;
    private final com.sankuai.waimai.store.notification.a k;
    private long l;
    private long m;
    private boolean n;
    private String o;
    private boolean p;
    private String q;
    private com.sankuai.waimai.store.manager.marketing.a r;
    private com.sankuai.waimai.mach.recycler.b s;
    private boolean t;
    private int u;
    private int v;
    private com.sankuai.waimai.store.pagingload.c<c.b, c.b> w;
    private com.sankuai.waimai.store.goods.detail.mach.a x;
    private List<BaseModuleDesc> y;
    private final Set z;

    public static /* synthetic */ void a(i iVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "0ed92d3b5e40d2a60af285fee2e91fe5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "0ed92d3b5e40d2a60af285fee2e91fe5");
        } else if (iVar.p) {
            iVar.p = false;
            iVar.b.w();
        }
    }

    public static /* synthetic */ void a(i iVar, final GoodsDetailResponse goodsDetailResponse) {
        GoodsSku a;
        boolean z;
        GoodsSku goodsSku;
        Object[] objArr = {goodsDetailResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "09a2f4387377067dd96cb2452abcccfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "09a2f4387377067dd96cb2452abcccfd");
            return;
        }
        iVar.b.a(goodsDetailResponse);
        if (iVar.i != null) {
            goodsDetailResponse.mGoodsSpu.id = iVar.i.getId();
            goodsDetailResponse.mGoodsSpu.setActivityTag(iVar.i.getActivityTag());
            goodsDetailResponse.mGoodsSpu.setTag(iVar.i.getTag());
        }
        iVar.i = goodsDetailResponse.mGoodsSpu;
        iVar.k.a((Activity) iVar.b.q(), false, (List<PoiNotification>) goodsDetailResponse.mGoodsSpu.getPoiNotifications());
        iVar.b.a(iVar.d, goodsDetailResponse);
        com.sankuai.waimai.store.order.a.e().b(iVar.d.f(), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
        if (iVar.r != null) {
            iVar.r.f();
            iVar.r.a(true);
        }
        iVar.b.a(goodsDetailResponse.getStids(), iVar.d.f(), String.valueOf(iVar.i.getId()));
        Object[] objArr2 = {goodsDetailResponse};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "4da9150024d9479648bb4724e4c613aa", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "4da9150024d9479648bb4724e4c613aa")).booleanValue();
        } else {
            final GoodsSpu goodsSpu = goodsDetailResponse.mGoodsSpu;
            if (goodsSpu == null) {
                z = false;
            } else {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, iVar, changeQuickRedirect3, false, "fae698321e4198acc7e052ead7623520", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, iVar, changeQuickRedirect3, false, "fae698321e4198acc7e052ead7623520");
                } else if (iVar.i != null) {
                    long f = iVar.d.f();
                    GoodsSpu goodsSpu2 = iVar.i;
                    Object[] objArr4 = {new Long(f), goodsSpu2};
                    ChangeQuickRedirect changeQuickRedirect4 = d.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "d9c96ac2600f28666836f10964d9f05a", RobustBitConfig.DEFAULT_VALUE)) {
                        a = (GoodsSku) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "d9c96ac2600f28666836f10964d9f05a");
                    } else {
                        if (goodsSpu2 != null) {
                            List<OrderedFood> b = com.sankuai.waimai.store.order.a.e().b(f, goodsSpu2.getId());
                            List<GoodsSku> skuList = goodsSpu2.getSkuList();
                            OrderedFood a2 = d.a(b, skuList, goodsSpu2.getAttrList());
                            if (!com.sankuai.shangou.stone.util.a.b(skuList)) {
                                if (a2 == null) {
                                    GoodsSku a3 = d.a(skuList);
                                    if (a3 != null) {
                                        a = d.a(skuList, a3.getSkuId());
                                    } else {
                                        a = d.a(skuList, 0L);
                                    }
                                } else {
                                    a = d.a(skuList, a2.getSkuId());
                                }
                            }
                        }
                        a = null;
                    }
                    if (a != null) {
                        iVar.e = a;
                    }
                }
                iVar.j = Float.valueOf(iVar.j == null ? -1.0f : iVar.j.floatValue());
                new f(iVar.b.q(), iVar.n, iVar.j, iVar.s).a(iVar.d, goodsDetailResponse, iVar.e, new a.InterfaceC1173a() { // from class: com.sankuai.waimai.store.goods.detail.components.root.i.7
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.goods.detail.components.root.a.InterfaceC1173a
                    public final void a(List<c> list) {
                        boolean z2 = true;
                        Object[] objArr5 = {list};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "5e97068e780242c74dec0a8c98914bb2", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "5e97068e780242c74dec0a8c98914bb2");
                        } else if (com.sankuai.waimai.store.util.b.a(i.this.b.q())) {
                        } else {
                            i.this.b.a(3, "");
                            ArrayList arrayList = new ArrayList();
                            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                                arrayList.addAll(list);
                            }
                            i.a(i.this, arrayList);
                            i.a(i.this, arrayList, goodsSpu);
                            i.this.b.a(arrayList, goodsDetailResponse);
                            if (goodsDetailResponse.extra != null) {
                                i iVar2 = i.this;
                                if (!TextUtils.equals(goodsDetailResponse.extra.templateId, GoodsDetailResponse.PRODUCT_PAGE_776) && !TextUtils.equals(goodsDetailResponse.extra.templateId, GoodsDetailResponse.PRODUCT_PAGE_781_I) && !TextUtils.equals(goodsDetailResponse.extra.templateId, GoodsDetailResponse.PRODUCT_PAGE_781_J)) {
                                    z2 = false;
                                }
                                iVar2.g = z2;
                                i.this.a(i.this.h);
                            }
                            i.this.b.a(goodsDetailResponse, goodsSpu, i.this.e);
                            i.a(i.this);
                            i.this.b.s();
                            String a4 = com.sankuai.waimai.store.router.d.a(i.this.b.q().getIntent(), "key_pre_request_cache", "key_pre_request_cache", "");
                            com.sankuai.meituan.takeoutnew.util.aop.h.a(i.this.b.q().s().recordStep("activity_data_ready"));
                            com.sankuai.waimai.store.base.preload.e.a(a4, "activity_data_ready");
                            com.sankuai.waimai.store.base.preload.e.b(a4);
                        }
                    }
                }, iVar.b.q(), iVar.b.q().w());
                z = true;
            }
        }
        if (!z) {
            iVar.b.a(2, "");
        }
        Object[] objArr5 = {goodsDetailResponse};
        ChangeQuickRedirect changeQuickRedirect5 = c;
        if (PatchProxy.isSupport(objArr5, iVar, changeQuickRedirect5, false, "5152dc440dea5e2454f8f012291b72bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, iVar, changeQuickRedirect5, false, "5152dc440dea5e2454f8f012291b72bc");
        } else if (goodsDetailResponse != null) {
            try {
                HashMap hashMap = new HashMap();
                if (goodsDetailResponse.mGoodsSpu != null) {
                    hashMap.put("skuName", String.valueOf(goodsDetailResponse.mGoodsSpu.name));
                    if (com.sankuai.shangou.stone.util.a.c(goodsDetailResponse.mGoodsSpu.skus) > 0 && (goodsSku = (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsDetailResponse.mGoodsSpu.skus, 0)) != null) {
                        hashMap.put("skuId", String.valueOf(goodsSku.id));
                    }
                }
                if (iVar.d != null) {
                    hashMap.put("poiID", String.valueOf(iVar.d.f()));
                    hashMap.put("poiName", iVar.d.j());
                }
                PoiNewTemplate4.a(iVar.b.q(), hashMap);
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ void a(i iVar, List list) {
        BaseTile.LayoutInfo layoutInfo;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "00d1f8932ca19cbdd3ffc781b1cccf98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "00d1f8932ca19cbdd3ffc781b1cccf98");
            return;
        }
        Iterator it = list.iterator();
        c cVar = null;
        c cVar2 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            c cVar3 = (c) it.next();
            if (cVar3 != null) {
                if (TextUtils.equals(cVar3.c, "sm_type_goods_detail_commodity_upgrade")) {
                    cVar2 = cVar3;
                } else if (TextUtils.equals(cVar3.c, "sm_type_goods_detail_kangaroo_gift_v1")) {
                    cVar = cVar3;
                    break;
                }
            }
        }
        if (cVar == null || cVar2 == null || (layoutInfo = cVar2.f) == null) {
            return;
        }
        layoutInfo.bottom = 0;
        layoutInfo.borderBottomLeftRadius = 0;
        layoutInfo.borderBottomRightRadius = 0;
    }

    public static /* synthetic */ void a(i iVar, List list, GoodsSpu goodsSpu) {
        Object[] objArr = {list, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, iVar, changeQuickRedirect, false, "d08a92d48e667ec020ea4643345f1fa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, iVar, changeQuickRedirect, false, "d08a92d48e667ec020ea4643345f1fa5");
        } else if (list != null && goodsSpu != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a(iVar.b.q().getString(R.string.wm_sc_common_goods), 0, 1));
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            c.C1175c c1175c = null;
            int i = -1;
            int i2 = -1;
            for (int i3 = 0; i3 < list.size(); i3++) {
                c cVar = (c) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i3);
                if (cVar != null) {
                    if (cVar instanceof c.C1175c) {
                        c1175c = (c.C1175c) cVar;
                    }
                    c.C1175c c1175c2 = c1175c;
                    if ("sm_type_goods_detail_price".equals(cVar.c) || "sm_type_goods_detail_commodity_upgrade".equals(cVar.c)) {
                        i2 = i3;
                    }
                    if ("sm_type_goods_detail_comment".equals(cVar.c) || "sm_type_goods_detail_comment_mach".equals(cVar.c)) {
                        com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a a = iVar.a(arrayList, sparseBooleanArray, i3, 2, R.string.wm_sc_goods_detail_tab_comment);
                        if (a != null) {
                            i = a.b;
                        }
                    } else if ("sm_type_goods_detail_cook_book".equals(cVar.c)) {
                        iVar.a(arrayList, sparseBooleanArray, i3, 6, R.string.wm_sc_goods_detail_recipe);
                    } else if (cVar.b == 7 || cVar.b == 8 || "sm_type_goods_detail_describe".equals(cVar.c) || "sm_type_goods_detail_describe_mach".equals(cVar.c) || "sm_type_goods_detail_describe_upgrade".equals(cVar.c)) {
                        iVar.a(arrayList, sparseBooleanArray, i3, 3, R.string.wm_sc_common_detail);
                    } else if ("sm_type_goods_detail_recommend_product".equals(cVar.c)) {
                        iVar.a(arrayList, sparseBooleanArray, i3, 4, R.string.wm_sc_goods_detail_tab_recommend);
                    } else if ("sm_type_goods_detail_match_product".equals(cVar.c) || "sm_type_goods_detail_match_product_781".equals(cVar.c)) {
                        iVar.a(arrayList, sparseBooleanArray, i3, 8, R.string.wm_sc_goods_detail_tab_recommend_match);
                    }
                    c1175c = c1175c2;
                }
            }
            if (c1175c != null) {
                c1175c.j = i;
            }
            String str = "";
            if (goodsSpu.shareTip != null && !TextUtils.isEmpty(goodsSpu.shareTip.shareLabelImg)) {
                str = goodsSpu.shareTip.shareLabelImg;
            }
            iVar.b.a(iVar.d.f(), goodsSpu, str, arrayList);
            iVar.b.b(i2);
        }
    }

    public i(h.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "564cd329a06765fff9d8cf693fccf222", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "564cd329a06765fff9d8cf693fccf222");
            return;
        }
        this.d = new com.sankuai.waimai.store.platform.domain.manager.poi.a();
        this.k = new com.sankuai.waimai.store.notification.a(this.d);
        this.l = -1L;
        this.m = -1L;
        this.n = false;
        this.p = false;
        this.s = new com.sankuai.waimai.mach.recycler.b("supermarket");
        this.t = true;
        this.u = 0;
        this.v = 20;
        this.w = new com.sankuai.waimai.store.pagingload.c<>();
        this.g = false;
        this.z = new HashSet();
        this.z.clear();
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void a(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30a4dedfb3288e5a1f276ddf3a16b014", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30a4dedfb3288e5a1f276ddf3a16b014");
        } else if (bundle != null) {
            this.l = bundle.getLong("key_detail_save_poi_id", -1L);
            this.m = bundle.getLong("key_detail_save_spu_id", -1L);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "706a640cb90a177361e8800c8dd1d33f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "706a640cb90a177361e8800c8dd1d33f");
        } else if (bundle == null) {
        } else {
            bundle.putLong("key_detail_save_poi_id", this.d.f());
            if (this.i != null) {
                bundle.putLong("key_detail_save_spu_id", this.i.getId());
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    @NonNull
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a c() {
        return this.d;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final GoodsSpu d() {
        return this.i;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void a(@NonNull Intent intent) {
        long f;
        Uri.Builder builder;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a04938a42dae2a6c4a4dc01f37348e5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a04938a42dae2a6c4a4dc01f37348e5f");
            return;
        }
        Uri data = intent.getData();
        long j = -1;
        if (com.sankuai.waimai.store.router.d.a(data)) {
            long a = com.sankuai.waimai.store.router.d.a(intent, "spuid", -1L);
            long a2 = com.sankuai.waimai.store.router.d.a(intent, FoodDetailNetWorkPreLoader.URI_POI, -1L);
            this.o = com.sankuai.waimai.store.router.d.a(intent, "extra", "");
            j = a;
            f = a2;
        } else {
            f = this.d.f();
            GoodsSpu goodsSpu = (GoodsSpu) this.b.q().b("foodspu");
            if (goodsSpu != null) {
                j = goodsSpu.getId();
            }
        }
        if (data != null) {
            builder = data.buildUpon();
        } else {
            builder = new Uri.Builder();
        }
        this.q = com.sankuai.waimai.store.router.d.a(intent, "business_channel", "");
        builder.appendQueryParameter("poi_id", String.valueOf(f));
        builder.appendQueryParameter("spu_id", String.valueOf(j));
        builder.appendQueryParameter("business_channel", this.q);
        intent.setData(builder.build());
        this.p = com.sankuai.waimai.store.router.d.a(intent, "need_add", 0) == 1;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void a(@NonNull Intent intent, String str) {
        long j;
        Object[] objArr = {intent, str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c06b00ccef804b9995e96664c8679195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c06b00ccef804b9995e96664c8679195");
            return;
        }
        Poi poi = (Poi) this.b.q().b(FoodDetailNetWorkPreLoader.INTENT_POI);
        if (poi != null) {
            this.d.a(poi, 1);
            com.sankuai.waimai.store.order.a.e().a(this.d.f(), this.d.b);
            this.b.a(this.d);
            return;
        }
        if (com.sankuai.waimai.store.router.d.a(intent)) {
            this.n = com.sankuai.waimai.store.router.d.a(intent, "from", -1) != 2;
            j = com.sankuai.waimai.store.router.d.a(intent, FoodDetailNetWorkPreLoader.URI_POI, -1L);
        } else {
            j = this.l;
        }
        final long j2 = j;
        Object[] objArr2 = {new Long(j2), str};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8e38df5352a1a2837b080077d23cf52e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8e38df5352a1a2837b080077d23cf52e");
        } else if (j2 > 0) {
            k<PoiShoppingCartAndPoi> kVar = new k<PoiShoppingCartAndPoi>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.i.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    PoiShoppingCartAndPoi poiShoppingCartAndPoi = (PoiShoppingCartAndPoi) obj;
                    Object[] objArr3 = {poiShoppingCartAndPoi};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e249f8e7cbe528ca99d0d4455f72b1bc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e249f8e7cbe528ca99d0d4455f72b1bc");
                        return;
                    }
                    i.this.d.a(poiShoppingCartAndPoi.poi, 1);
                    com.sankuai.waimai.store.order.a.e().a(i.this.d.f(), i.this.d.b);
                    com.sankuai.waimai.store.shopping.cart.cache.b.a(poiShoppingCartAndPoi);
                    i.this.b.a(i.this.d);
                    if (poiShoppingCartAndPoi.poi != null) {
                        com.sankuai.waimai.store.order.a.e().a(j2, poiShoppingCartAndPoi.poi.id);
                        SCBaseActivity q = i.this.b.q();
                        Poi poi2 = poiShoppingCartAndPoi.poi;
                        Object[] objArr4 = {q, poi2};
                        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.base.report.a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e31f6fa02b06e04edb1978bf934aa733", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "e31f6fa02b06e04edb1978bf934aa733");
                            return;
                        }
                        boolean a2 = com.sankuai.waimai.store.router.d.a(q.getIntent(), "is_drug_scheme", false);
                        String a3 = com.sankuai.waimai.store.router.d.a(q.getIntent(), "source_class_name", "");
                        int buzType = poi2.getBuzType();
                        if (buzType != 9 || a2) {
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("buz_type", buzType);
                            jSONObject.put("source_vc", a3);
                            jSONObject.put("error_type", "SchemeUnMatchError");
                            com.sankuai.waimai.store.util.monitor.c.a(DrugSchemeMonitor.MEDDetailTransferError, jSONObject.toString(), "商品详情页路由监控");
                        } catch (Exception e) {
                            com.sankuai.shangou.stone.util.log.a.a(e);
                        }
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "db7b320a07a7c69fc6b72c02734bac9e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "db7b320a07a7c69fc6b72c02734bac9e");
                    } else {
                        i.this.b.a(0, "");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr3 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8fdc705188da5a77fdff1e01616d7b06", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8fdc705188da5a77fdff1e01616d7b06");
                    } else {
                        i.this.b.a(1, bVar.getMessage());
                    }
                }
            };
            String str2 = this.o;
            Object[] objArr3 = {str, new Long(j2), str2, kVar, 40};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.downgrade.b.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "87671f18f42fd90505de672f40c82f47", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "87671f18f42fd90505de672f40c82f47");
            } else {
                com.sankuai.waimai.store.downgrade.b.a(str, j2, "", str2, kVar, 40);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9ef78b71bf150b0776a21167ddf74f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9ef78b71bf150b0776a21167ddf74f0");
            return;
        }
        if (z) {
            this.u = 0;
            this.g = false;
            this.h = null;
            this.y = null;
            this.t = true;
        } else if (!this.g) {
            return;
        }
        if (this.f || !this.t) {
            return;
        }
        this.f = true;
        long j = 0;
        if (this.i != null && com.sankuai.shangou.stone.util.a.a((List<Object>) this.i.skus, 0) != null) {
            j = ((GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) this.i.skus, 0)).id;
        }
        com.sankuai.waimai.store.base.net.sg.a.a((Object) this.b.q().w()).a(this.u, this.v, this.d.f(), 13, this.i.id, j, new com.sankuai.waimai.store.base.net.j<WaterFallMachResponse>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.i.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bac2e637dfe0a05b7e80e67814f181df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bac2e637dfe0a05b7e80e67814f181df");
                }
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(WaterFallMachResponse waterFallMachResponse) {
                WaterFallMachResponse waterFallMachResponse2 = waterFallMachResponse;
                Object[] objArr2 = {waterFallMachResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "339942c9a5e2e8ff62ed268094929189", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "339942c9a5e2e8ff62ed268094929189");
                    return;
                }
                i.this.h = waterFallMachResponse2;
                i.this.a(waterFallMachResponse2);
            }

            @Override // com.sankuai.waimai.store.base.net.j
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6aa1be6f4075134505de12f2330bec9f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6aa1be6f4075134505de12f2330bec9f");
                } else {
                    i.this.f = false;
                }
            }
        });
    }

    public final void a(WaterFallMachResponse waterFallMachResponse) {
        Object[] objArr = {waterFallMachResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "784cc3cfb9a6961faf4e50f9d5560ec4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "784cc3cfb9a6961faf4e50f9d5560ec4");
        } else if (!this.g || waterFallMachResponse == null || com.sankuai.shangou.stone.util.a.b(waterFallMachResponse.moduleList)) {
            this.b.t();
            this.t = false;
        } else {
            Object[] objArr2 = {waterFallMachResponse};
            ChangeQuickRedirect changeQuickRedirect2 = c;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "947f994d793429cef1bb5744460ae9dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "947f994d793429cef1bb5744460ae9dc");
            } else {
                if (this.y == null) {
                    this.y = new ArrayList();
                }
                this.y.addAll(waterFallMachResponse.moduleList);
                this.u++;
                this.t = waterFallMachResponse.hasNextPage;
                if (this.t) {
                    this.b.u();
                } else {
                    this.b.v();
                }
            }
            List<c.b> a = a(waterFallMachResponse, com.sankuai.shangou.stone.util.a.a((List) this.y) - com.sankuai.shangou.stone.util.a.a((List) waterFallMachResponse.moduleList));
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) a)) {
                Object[] objArr3 = {a};
                ChangeQuickRedirect changeQuickRedirect3 = c;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7b14f3362fb771835ed6e4472e451f94", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7b14f3362fb771835ed6e4472e451f94");
                    return;
                }
                com.sankuai.waimai.store.pagingload.c<c.b, c.b> cVar = this.w;
                cVar.g = new a.InterfaceC1262a<c.b, c.b>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.i.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.pagingload.a.InterfaceC1262a
                    public final /* synthetic */ c.b a(@NonNull c.b bVar) {
                        c.b bVar2 = bVar;
                        Object[] objArr4 = {bVar2};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "24f1080e3cf3517492c0f5eacf25c189", RobustBitConfig.DEFAULT_VALUE)) {
                            return (c.b) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "24f1080e3cf3517492c0f5eacf25c189");
                        }
                        if (bVar2.h || bVar2.g == null) {
                            return bVar2;
                        }
                        bVar2.g.recycleMachDataWrapper = i.this.j().a(bVar2.g.mBaseModuleDesc, bVar2.g.index);
                        return new c.b(bVar2.g);
                    }
                };
                cVar.h = new a.b<c.b, c.b>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.i.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.store.pagingload.a.b
                    public final void a(List<c.b> list, int i) {
                        Object[] objArr4 = {list, Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "7bdf455ee0a8d20c562cab430ed288df", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "7bdf455ee0a8d20c562cab430ed288df");
                            return;
                        }
                        super.a(list, i);
                        i.this.b.a(list);
                    }

                    @Override // com.sankuai.waimai.store.pagingload.a.b
                    public final void a(int i, @Nullable Throwable th, List<c.b> list) {
                        Object[] objArr4 = {Integer.valueOf(i), th, list};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "58a9a59a1b2c8b0ff36f06d64f11ed95", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "58a9a59a1b2c8b0ff36f06d64f11ed95");
                        } else {
                            super.a(i, th, list);
                        }
                    }
                };
                cVar.a(a);
            }
        }
    }

    private List<c.b> a(WaterFallMachResponse waterFallMachResponse, int i) {
        Object[] objArr = {waterFallMachResponse, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90b2e3271ab017ceb82148dbb950069a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90b2e3271ab017ceb82148dbb950069a");
        }
        ArrayList arrayList = new ArrayList();
        if (waterFallMachResponse == null || com.sankuai.shangou.stone.util.a.b(waterFallMachResponse.moduleList)) {
            return null;
        }
        if (i == 0) {
            PoiCommonMachListItem poiCommonMachListItem = new PoiCommonMachListItem();
            poiCommonMachListItem.title = t.a(waterFallMachResponse.name) ? "" : waterFallMachResponse.name;
            arrayList.add(new c.b(poiCommonMachListItem, true));
        }
        for (BaseModuleDesc baseModuleDesc : waterFallMachResponse.moduleList) {
            if (baseModuleDesc != null) {
                PoiCommonMachListItem poiCommonMachListItem2 = new PoiCommonMachListItem();
                poiCommonMachListItem2.mBaseModuleDesc = baseModuleDesc;
                poiCommonMachListItem2.index = i;
                arrayList.add(new c.b(poiCommonMachListItem2));
                i++;
            }
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    /* renamed from: l */
    public final com.sankuai.waimai.store.goods.detail.mach.a j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b24327a42c8027c4ee6c86ffa4f00e8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.goods.detail.mach.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b24327a42c8027c4ee6c86ffa4f00e8d");
        }
        if (this.x == null) {
            this.x = new com.sankuai.waimai.store.goods.detail.mach.a(this.b.q(), new com.sankuai.waimai.store.poilist.mach.g(this.b.q(), this.b.q().b(), this.z), "supermarket", this.s, this.d);
        }
        return this.x;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void b(@NonNull Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06704dc05dc98104b56d289b989dc1ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06704dc05dc98104b56d289b989dc1ae");
            return;
        }
        this.b.a(0, "");
        if (com.sankuai.waimai.store.router.d.a(intent)) {
            long a = com.sankuai.waimai.store.router.d.a(intent, "spuid", -1L);
            long a2 = com.sankuai.waimai.store.router.d.a(intent, FoodDetailNetWorkPreLoader.URI_SKU, -1L);
            String a3 = com.sankuai.waimai.store.router.d.a(intent, "activityUuid", "");
            String a4 = com.sankuai.waimai.store.router.d.a(intent, "activitytag", "");
            String a5 = com.sankuai.waimai.store.router.d.a(intent, "sputag", "");
            int a6 = com.sankuai.waimai.store.router.d.a(intent, "sale_type", 0);
            this.i = new GoodsSpu();
            this.i.id = a;
            if (this.i.getSkuList() == null) {
                ArrayList arrayList = new ArrayList();
                GoodsSku goodsSku = new GoodsSku();
                goodsSku.id = a2;
                arrayList.add(goodsSku);
                this.i.setSkuList(arrayList);
            }
            if (!TextUtils.isEmpty(a4)) {
                this.i.setActivityTag(a4);
            }
            if (!TextUtils.isEmpty(a5)) {
                this.i.setTag(a5);
            }
            if (!TextUtils.isEmpty(a3)) {
                this.i.setShareActivityId(a3);
            }
            this.i.mSaleType = a6;
            return;
        }
        GoodsSpu goodsSpu = (GoodsSpu) this.b.q().b("foodspu");
        this.j = (Float) this.b.q().b("good_detail_image_ratio");
        if (goodsSpu == null) {
            return;
        }
        this.i = goodsSpu.m21clone();
        this.i.subscribe = 0;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b6c6478f518093a49c70dd486503ee9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b6c6478f518093a49c70dd486503ee9");
            return;
        }
        if (this.i == null) {
            this.i = new GoodsSpu();
            this.i.id = this.m;
        }
        if (this.i.getId() <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.i.shareActivityUuid != null) {
            hashMap.put("share_activity_uuid", this.i.shareActivityUuid);
        }
        if (!t.a(this.d.b.extraForProductInfo)) {
            hashMap.put("extraV2", this.d.b.extraForProductInfo);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("wm_poi_id", String.valueOf(this.d.f()));
        hashMap2.put("spu_id", String.valueOf(this.i.getId()));
        hashMap2.put("sku_id", String.valueOf(this.e != null ? this.e.id : 0L));
        if (this.i.getActivityTag() != null) {
            hashMap2.put("activity_tag", this.i.getActivityTag());
        }
        if (!t.a(this.o)) {
            hashMap2.put("extra", this.o);
        }
        hashMap2.put("sale_type", String.valueOf(this.i.mSaleType));
        if (this.i.getActivityTag() != null) {
            hashMap2.put("spu_tag", this.i.getActivityTag());
        }
        hashMap.put("params", Objects.requireNonNull(com.sankuai.waimai.store.util.i.a(hashMap2)));
        String a = com.sankuai.waimai.store.router.d.a(this.b.q().getIntent(), "key_pre_request_cache", "key_pre_request_cache", "");
        k<GoodsDetailResponse> kVar = new k<GoodsDetailResponse>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.i.5
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                GoodsDetailResponse goodsDetailResponse = (GoodsDetailResponse) obj;
                Object[] objArr2 = {goodsDetailResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "74c17687e17ecea8f20e96205231804f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "74c17687e17ecea8f20e96205231804f");
                } else {
                    i.a(i.this, goodsDetailResponse);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a3b1d9dc741615685b6f0955e6d730c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a3b1d9dc741615685b6f0955e6d730c");
                    return;
                }
                i.this.b.a(1, bVar.getMessage());
                i.this.b.b(bVar.b);
            }
        };
        com.sankuai.shangou.stone.util.log.a.b("GoodDetailPreRequestLink", "DetailRootPresenter start request", new Object[0]);
        com.sankuai.waimai.store.base.preload.e.a(a, "model_get_data");
        com.sankuai.waimai.store.base.net.sg.a.a((Object) str).b(a, hashMap, kVar);
        a(true);
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79bd0e486b6b0acef4c4e4d8c23c819a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79bd0e486b6b0acef4c4e4d8c23c819a");
            return;
        }
        if (this.i == null) {
            this.i = new GoodsSpu();
            this.i.id = this.m;
        }
        if (this.i.getId() <= 0) {
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.i.shareActivityUuid != null) {
            hashMap.put("share_activity_uuid", this.i.shareActivityUuid);
        }
        if (!t.a(this.o)) {
            hashMap.put("extra", this.o);
        }
        if (!t.a(this.d.b.extraForProductInfo)) {
            hashMap.put("extraV2", this.d.b.extraForProductInfo);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("wm_poi_id", String.valueOf(this.d.f()));
        hashMap2.put("spu_id", String.valueOf(this.i.getId()));
        hashMap2.put("sku_id", String.valueOf(this.e != null ? this.e.id : 0L));
        hashMap2.put("unique_s_type", str2);
        if (this.i.getActivityTag() != null) {
            hashMap2.put("activity_tag", this.i.getActivityTag());
        }
        hashMap2.put("sale_type", String.valueOf(this.i.mSaleType));
        if (this.i.getActivityTag() != null) {
            hashMap2.put("spu_tag", this.i.getActivityTag());
        }
        hashMap.put("params", Objects.requireNonNull(com.sankuai.waimai.store.util.i.a(hashMap2)));
        com.sankuai.waimai.store.base.net.sg.a.a((Object) str).b(hashMap, new k<GoodsDetailResponse>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.i.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                GoodsDetailResponse goodsDetailResponse = (GoodsDetailResponse) obj;
                Object[] objArr2 = {goodsDetailResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a20e99d6794849ec6581ef3408b985f1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a20e99d6794849ec6581ef3408b985f1");
                } else {
                    i.this.b.b(goodsDetailResponse);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9366f28bee301e6ef08e4927fbee03a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9366f28bee301e6ef08e4927fbee03a1");
                } else {
                    i.this.b.b(bVar.b);
                }
            }
        });
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void b(String str) {
        long j;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c86847fa6511519328dd50055ad37eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c86847fa6511519328dd50055ad37eb");
            return;
        }
        if (this.i == null) {
            j = this.m;
        } else {
            j = this.i.id;
        }
        if (j > 0 && com.sankuai.waimai.store.config.j.h().a(SCConfigPath.PAGE_GOODS_DETAIL_MARKETING_REQUEST, false)) {
            if (this.r == null) {
                this.r = new com.sankuai.waimai.store.manager.marketing.a(this.b.q(), this.b.q().findViewById(16908290), 5);
            }
            HashMap hashMap = new HashMap();
            hashMap.put("page_type", "5");
            hashMap.put("wm_poi_id", String.valueOf(this.d.f()));
            hashMap.put(FoodDetailNetWorkPreLoader.URI_POI_STR, this.d.h());
            hashMap.put("spu_id", String.valueOf(j));
            this.r.a(hashMap, str);
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aab989e70f2dbc6da3f982105c3ffe7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aab989e70f2dbc6da3f982105c3ffe7")).booleanValue() : this.r == null || this.r.g();
    }

    private com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a a(List<com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a> list, SparseBooleanArray sparseBooleanArray, int i, int i2, int i3) {
        Object[] objArr = {list, sparseBooleanArray, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82d6d57677e9bd969bb65f942ffe20e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82d6d57677e9bd969bb65f942ffe20e4");
        }
        if (sparseBooleanArray.indexOfKey(i2) < 0) {
            sparseBooleanArray.put(i2, true);
            com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a aVar = new com.sankuai.waimai.store.goods.detail.components.subroot.actionbar.indicator.a(this.b.q().getString(i3), i, i2);
            list.add(aVar);
            return aVar;
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fab37c7aa4e6a3e5efc16e904208a89", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fab37c7aa4e6a3e5efc16e904208a89");
        } else if (this.d.f() <= 0) {
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) str).a(this.d.f(), this.d.h(), 2, new k<GetMenuResponse>() { // from class: com.sankuai.waimai.store.goods.detail.components.root.i.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    GetMenuResponse getMenuResponse = (GetMenuResponse) obj;
                    Object[] objArr2 = {getMenuResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba73bbad0bd72dbc568b75cdb6ed5bdb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba73bbad0bd72dbc568b75cdb6ed5bdb");
                    } else {
                        i.this.b.a(getMenuResponse);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2128106b8d83e0561dfbfd081caf6eeb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2128106b8d83e0561dfbfd081caf6eeb");
            return;
        }
        this.k.a();
        if (this.r != null) {
            this.r.h();
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b8e905c1362bfb4899956cad740f509", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b8e905c1362bfb4899956cad740f509");
            return;
        }
        this.k.b();
        if (this.r != null) {
            this.r.i();
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e165d443f7392a453e4e7b6126daad4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e165d443f7392a453e4e7b6126daad4");
        } else {
            this.z.clear();
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc65f6086e84735cf44a278a1e41c3f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc65f6086e84735cf44a278a1e41c3f9");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a96c6eed76221ea549812b9e40d9a6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a96c6eed76221ea549812b9e40d9a6b");
        } else {
            String a = com.sankuai.waimai.store.router.d.a(this.b.q().getIntent(), "key_pre_request_cache", "key_pre_request_cache", "");
            com.sankuai.waimai.store.base.preload.e.a().a(a);
            if (!TextUtils.isEmpty(a)) {
                com.sankuai.waimai.store.base.net.c.a(a);
            }
            com.sankuai.waimai.store.base.preload.f.a(a);
        }
        this.z.clear();
        if (this.r != null) {
            this.r.j();
        }
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final Map<String, Object> k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e8c1d63c0b1ad0b059e2cad0f6a44ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e8c1d63c0b1ad0b059e2cad0f6a44ed");
        }
        List<OrderedFood> g = com.sankuai.waimai.store.order.a.e().g(this.d.f());
        if (com.sankuai.shangou.stone.util.a.a((List) g) > 0) {
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            for (OrderedFood orderedFood : g) {
                if (orderedFood != null) {
                    long j = orderedFood.spu == null ? 0L : orderedFood.spu.id;
                    int count = orderedFood.getCount();
                    if (hashMap.containsKey(Long.valueOf(j))) {
                        hashMap.put(Long.valueOf(j), Integer.valueOf(count + ((Integer) hashMap.get(Long.valueOf(j))).intValue()));
                    } else {
                        hashMap.put(Long.valueOf(j), Integer.valueOf(count));
                    }
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("spu_id", entry.getKey());
                    jSONObject.put("count", entry.getValue());
                    arrayList.add(jSONObject);
                } catch (Exception unused) {
                }
            }
            if (com.sankuai.shangou.stone.util.a.a((List) arrayList) > 0) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("shopcart_item_list", arrayList);
                return hashMap2;
            }
            return null;
        }
        return null;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final String h() {
        return this.q;
    }

    @Override // com.sankuai.waimai.store.goods.detail.components.root.h.a
    public final com.sankuai.waimai.mach.recycler.b i() {
        return this.s;
    }
}

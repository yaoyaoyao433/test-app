package com.sankuai.waimai.store.drug.base.net;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.waimai.store.base.net.d;
import com.sankuai.waimai.store.base.net.i;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.drug.alita.model.AlitaMarketingBean;
import com.sankuai.waimai.store.drug.coupon.model.DrugMemberCouponStatusResponse;
import com.sankuai.waimai.store.drug.coupon.model.DrugMemberResponse;
import com.sankuai.waimai.store.drug.home.new_home.realtime.ShoppingGuideRealtimeData;
import com.sankuai.waimai.store.drug.home.refactor.card.float_card.order.OrderMessageEntity;
import com.sankuai.waimai.store.drug.order.OrderRXInquiryResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.RecommendPair;
import com.sankuai.waimai.store.platform.domain.core.goods.SpuProductsResponse;
import com.sankuai.waimai.store.platform.domain.core.im.DrugImEntranceEntity;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
import com.sankuai.waimai.store.poi.subscribe.PoiSubscribeResponse;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.repository.model.a;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class b extends d<DrugApiService> {
    public static ChangeQuickRedirect a;

    public static b a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "494983b4d8bb6a928a117425c0345ecd", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "494983b4d8bb6a928a117425c0345ecd");
        }
        b bVar = (b) com.sankuai.waimai.store.base.net.c.a(obj, b.class);
        if (bVar == null) {
            b bVar2 = new b();
            com.sankuai.waimai.store.base.net.c.a(obj, bVar2);
            return bVar2;
        }
        return bVar;
    }

    @Override // com.sankuai.waimai.store.base.net.d
    public final <T> j<T> a(j<T> jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bae1c42ea00260cffdef1e0006a4d6fc", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bae1c42ea00260cffdef1e0006a4d6fc") : new a(jVar);
    }

    public static b c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7e62b160772b9d6e1b1b8c24d5fc8df", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7e62b160772b9d6e1b1b8c24d5fc8df") : new b();
    }

    @Override // com.sankuai.waimai.store.base.net.d
    @NonNull
    public final i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04309ea7d9bfbffb3d374dfec33c1e88", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04309ea7d9bfbffb3d374dfec33c1e88") : new com.sankuai.waimai.store.base.net.drug.d();
    }

    public final void a(long j, String str, int i, long j2, j<DrugImEntranceEntity> jVar) {
        Object[] objArr = {new Long(j), str, 30, -1L, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c919a37d88cec1ca51876dcaa414ae0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c919a37d88cec1ca51876dcaa414ae0");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        a(jVar, ((DrugApiService) this.d).getDrugEntranceData(sb.toString(), str, new StringBuilder("30").toString(), "-1"));
    }

    public final void a(long j, String str, j<DrugMemberCouponStatusResponse> jVar) {
        Object[] objArr = {new Long(j), str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1a7519b6cd3d2c81fd9a90f1e08bf02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1a7519b6cd3d2c81fd9a90f1e08bf02");
        } else {
            a(jVar, ((DrugApiService) this.d).getMemberCouponStatus(j, str));
        }
    }

    public final void b(j<Poi.MemberToken> jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b5122c7e33f0c503323cc7623fdfeb6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b5122c7e33f0c503323cc7623fdfeb6");
        } else {
            a(jVar, ((DrugApiService) this.d).exchangeToken());
        }
    }

    public final void a(String str, String str2, int i, long j, String str3, j<Poi.PoiCouponItem> jVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), new Long(j), str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58edec9a9badfad91adbafa06b79e1f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58edec9a9badfad91adbafa06b79e1f2");
        } else {
            a(jVar, ((DrugApiService) this.d).scoreDrugExchangeCoupons(str, str2, i, 1, j, str3));
        }
    }

    public final void a(long j, String str, long j2, long j3, long j4, int i, String str2, j<Poi.PoiCouponItem> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), new Long(j4), Integer.valueOf(i), str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76299631d97647468fb709d2af6c06a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76299631d97647468fb709d2af6c06a0");
        } else {
            a(jVar, ((DrugApiService) this.d).receiveCoupon(j, str, j2, j3, i, j4, str2));
        }
    }

    public final void a(long j, String str, int i, j<PoiSubscribeResponse> jVar) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73ac13464af41c94e065ca187f13ce04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73ac13464af41c94e065ca187f13ce04");
        } else {
            a(jVar, ((DrugApiService) this.d).subscribePoi(j, str, i));
        }
    }

    public final void a(String str, String str2, String str3, j<OrderRXInquiryResponse> jVar) {
        Object[] objArr = {str, str2, str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd3c400ba045d09e39438e1f2f8219e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd3c400ba045d09e39438e1f2f8219e2");
        } else {
            a(jVar, ((DrugApiService) this.d).checkRXInquiryRequest(str, str2, str3));
        }
    }

    public final void a(long j, int i, long j2, String str, String str2, String str3, String str4, long j3, String str5, String str6, String str7, int i2, int i3, int i4, int i5, String str8, j<PoiVerticalityDataResponse> jVar) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), new Long(j2), str, str2, str3, str4, new Long(j3), str5, str6, str7, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str8, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfbe5c4fe18391213a90cf5a9d9f7f0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfbe5c4fe18391213a90cf5a9d9f7f0a");
        } else {
            a(jVar, ((DrugApiService) this.d).getDrugHomeFirstVision(j2, str, j, i, j2, j3, str2, str3, str4, 0, str5, str6, str7, i2, i3, i4, i5, str8, true));
        }
    }

    public final void a(String str, long j, int i, long j2, String str2, String str3, String str4, String str5, long j3, String str6, String str7, String str8, int i2, int i3, int i4, int i5, String str9, j<PoiVerticalityDataResponse> jVar) {
        Object[] objArr = {str, new Long(j), 20, new Long(j2), str2, str3, str4, str5, new Long(j3), str6, str7, str8, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), str9, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e58943f0f472c8c76c4dcf3716eef9ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e58943f0f472c8c76c4dcf3716eef9ea");
        } else if (TextUtils.isEmpty(str)) {
            a(j, 20, j2, str2, str3, str4, str5, j3, str6, str7, str8, i2, i3, i4, i5, str9, jVar);
        } else if (new com.sankuai.waimai.store.base.preload.a().a(str, new a(jVar))) {
        } else {
            a(j, 20, j2, str2, str3, str4, str5, j3, str6, str7, str8, i2, i3, i4, i5, str9, jVar);
        }
    }

    public final void a(j<PoiVerticalityDataResponse> jVar, int i, boolean z, long j, int i2, String str, int i3, String str2, String str3, String str4, int i4, int i5, String str5, String str6, boolean z2) {
        Object[] objArr = {jVar, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), Integer.valueOf(i2), str, 0, str2, str3, str4, Integer.valueOf(i4), Integer.valueOf(i5), str5, str6, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cf78fc9e820fb4e13a7d35405767e7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cf78fc9e820fb4e13a7d35405767e7c");
        } else {
            a(jVar, ((DrugApiService) this.d).getNewDrugHomeFeedList(i, z, j, i2, str, 0, str2, str3, str4, i4, i5, str5, str6, z2));
        }
    }

    public final void c(j<ShoppingGuideRealtimeData> jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b700c913ad88843bfd18c03737378ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b700c913ad88843bfd18c03737378ee");
        } else {
            a(jVar, ((DrugApiService) this.d).getImTileRealtimeData());
        }
    }

    public final void d(j<OrderMessageEntity> jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c93fe827e79598e3bf1b27b9b35a0a59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c93fe827e79598e3bf1b27b9b35a0a59");
        } else {
            a(jVar, ((DrugApiService) this.d).getOrderMessageData());
        }
    }

    public final void a(@Url String str, @FieldMap Map<String, String> map, j<Object> jVar) {
        Object[] objArr = {str, map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaa8ef96c7995f0306a55d48632f9ecb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaa8ef96c7995f0306a55d48632f9ecb");
        } else {
            a(jVar, ((DrugApiService) this.d).machRequest(str, map));
        }
    }

    public final void a(Map<String, Object> map, k<AlitaMarketingBean> kVar) {
        Object[] objArr = {map, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae6889ff04d6e60af02c6cd9420757db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae6889ff04d6e60af02c6cd9420757db");
        } else {
            a(kVar, ((DrugApiService) this.d).getAlitaMarketingDataV2(map));
        }
    }

    public final void a(long j, String str, long j2, long j3, String str2, j<RestMenuResponse> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ed819fa7bfb05b824eb6e801d87f717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ed819fa7bfb05b824eb6e801d87f717");
        } else {
            a(jVar, ((DrugApiService) this.d).getShopMenu(j, str, j2 == -1 ? null : Long.valueOf(j2), 0, Long.valueOf(j3), str2));
        }
    }

    public final void a(long j, String str, long j2, long j3, String str2, String str3, j<RestMenuResponse> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), str2, str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d3ffde38660458fb5d2c926c00c1d31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d3ffde38660458fb5d2c926c00c1d31");
        } else {
            a(jVar, ((DrugApiService) this.d).getShopMenuV8(j, str, j2 == -1 ? null : Long.valueOf(j2), 0, Long.valueOf(j3), str2, str3));
        }
    }

    public final void b(long j, String str, long j2, long j3, String str2, j<RestMenuResponse> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "722257c1e5f3a15d8b12c4a422a71a12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "722257c1e5f3a15d8b12c4a422a71a12");
        } else {
            a(j, str, j2, j3, str2, "0", jVar);
        }
    }

    public final void a(long j, String str, long j2, String str2, String str3, j<DrugMemberResponse> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), str2, str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8283e84233a96e966f02e40a1b2a3f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8283e84233a96e966f02e40a1b2a3f0");
        } else {
            a(jVar, ((DrugApiService) this.d).joinDrugMember(str2, j, str, j2, 0, str3));
        }
    }

    public final void a(final a.C1295a c1295a, final j<SpuProductsResponse> jVar) {
        Object[] objArr = {c1295a, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e63ef46a218d31630dfa4df087c5c27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e63ef46a218d31630dfa4df087c5c27");
            return;
        }
        a(new k<SpuProductsResponse>() { // from class: com.sankuai.waimai.store.drug.base.net.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                SpuProductsResponse spuProductsResponse = (SpuProductsResponse) obj;
                Object[] objArr2 = {spuProductsResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "68dc83de7470eff757b2d4b89c0ac4c5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "68dc83de7470eff757b2d4b89c0ac4c5");
                    return;
                }
                super.a((AnonymousClass1) spuProductsResponse);
                if (jVar == null || spuProductsResponse == null) {
                    return;
                }
                if (c1295a.f != null) {
                    for (GoodsSpu goodsSpu : spuProductsResponse.productSpuList) {
                        goodsSpu.setTag(c1295a.f.tag);
                    }
                }
                jVar.a((j) spuProductsResponse);
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b99802b5011416d3ed8dc6c557869fbe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b99802b5011416d3ed8dc6c557869fbe");
                    return;
                }
                super.a();
                if (jVar != null) {
                    jVar.a();
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd91369e488dcf83bc557175648ac725", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd91369e488dcf83bc557175648ac725");
                    return;
                }
                super.a(bVar);
                if (jVar != null) {
                    jVar.a(bVar);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5b35e07c3350704c269ef6e9c158e7f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5b35e07c3350704c269ef6e9c158e7f");
                    return;
                }
                super.b();
                if (jVar != null) {
                    jVar.b();
                }
            }
        }, ((DrugApiService) this.d).getProducts(c1295a.c, c1295a.e, c1295a.a, c1295a.b, c1295a.g, c1295a.h, c1295a.l ? 1 : 0, c1295a.i, com.sankuai.waimai.store.util.i.a(c1295a.o), c1295a.m, c1295a.n));
    }

    public final void a(long j, String str, String str2, int i, List<Long> list, String str3, j<SpuProductsResponse> jVar) {
        Object[] objArr = {new Long(j), str, str2, Integer.valueOf(i), list, str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0cf67fab4e26fa08bf7ccebab8555af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0cf67fab4e26fa08bf7ccebab8555af");
        } else {
            a(jVar, ((DrugApiService) this.d).getProductsByIds(j, str, str2, i, com.sankuai.waimai.store.util.i.a(list), "3", str3));
        }
    }

    public final void a(String str, String str2, List<Long> list, j<SpuProductsResponse> jVar) {
        Object[] objArr = {str, str2, list, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e007f008e3d69eb09d306a4aa5123d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e007f008e3d69eb09d306a4aa5123d5");
        } else {
            a(jVar, ((DrugApiService) this.d).getAddProductsByIds(str, str2, com.sankuai.waimai.store.util.i.a(list)));
        }
    }

    public final void a(String str, String str2, String str3, j<PoiShoppingCartAndPoi> jVar, int i) {
        Object[] objArr = {str, str2, str3, jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4c258df530036af695c83fad7f91e8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4c258df530036af695c83fad7f91e8b");
        } else {
            a(jVar, ((DrugApiService) this.d).getPoiAndShopcartInfo(str, str2, str3, i));
        }
    }

    public final void a(long j, String str, long j2, j<RecommendPair> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9848c3cdfb48b3a281c558e1d813d628", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9848c3cdfb48b3a281c558e1d813d628");
        } else {
            a(jVar, ((DrugApiService) this.d).requestRecommendPair(j, str, j2));
        }
    }

    public final void a(String str, j<NetPriceCalculatorResult> jVar) {
        Object[] objArr = {str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebfcf4921ba08a148db32148b9d3f5ce", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebfcf4921ba08a148db32148b9d3f5ce");
        } else {
            a(jVar, ((DrugApiService) this.d).getNetPriceCalculatorResult(str));
        }
    }

    public final void a(long j, String str, double d, int i, double d2, double d3, String str2, String str3, double d4, j<com.sankuai.waimai.drug.model.d> jVar) {
        Object[] objArr = {new Long(j), str, Double.valueOf(d), Integer.valueOf(i), Double.valueOf(d2), Double.valueOf(d3), str2, str3, Double.valueOf(d4), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d6bc43d2153e69b1a474526d2a777ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d6bc43d2153e69b1a474526d2a777ae");
        } else {
            a(jVar, ((DrugApiService) this.d).getNewShopCartPatchWork(j, str, d, i, d2, d3, str2, str3, d4));
        }
    }
}

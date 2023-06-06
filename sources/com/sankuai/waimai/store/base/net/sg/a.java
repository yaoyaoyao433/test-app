package com.sankuai.waimai.store.base.net.sg;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.base.net.i;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.convenient.model.SGConvenientLandingResponse;
import com.sankuai.waimai.store.goods.list.SCPoiFoodContainerResponse;
import com.sankuai.waimai.store.goods.list.model.SCRangeEntity;
import com.sankuai.waimai.store.goods.list.model.SGNewUserOptModel;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.StrollAroundFloorResponse;
import com.sankuai.waimai.store.goods.list.viewblocks.strollaround.WaterFallMachResponse;
import com.sankuai.waimai.store.goods.subscribe.SpuSubscribeResponse;
import com.sankuai.waimai.store.mach.page.MachTileResponse;
import com.sankuai.waimai.store.newwidgets.list.o;
import com.sankuai.waimai.store.order.detail.model.OrderDetailRecommendResponse;
import com.sankuai.waimai.store.platform.domain.core.activities.MutliPoiCouponItem;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.RecommendPair;
import com.sankuai.waimai.store.platform.domain.core.goods.SGNewUserLandPoisResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.SGNewUserLandResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.ScanProductResponse;
import com.sankuai.waimai.store.platform.domain.core.goods.SpuProductsResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.poi.list.newp.home.model.SGHomeTileResponse;
import com.sankuai.waimai.store.poi.subscribe.PoiSubscribeResponse;
import com.sankuai.waimai.store.recipe.model.Recipe;
import com.sankuai.waimai.store.recipe.model.RecipeLikeResponse;
import com.sankuai.waimai.store.recipe.model.RecipeResponse;
import com.sankuai.waimai.store.repository.model.FeedbackData;
import com.sankuai.waimai.store.repository.model.GoodsDetailResponse;
import com.sankuai.waimai.store.repository.model.MarketGuessResponse;
import com.sankuai.waimai.store.repository.model.MarketGuessTagResponse;
import com.sankuai.waimai.store.repository.model.MemberCouponStatusResponse;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.repository.model.a;
import com.sankuai.waimai.store.util.ae;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rx.functions.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a extends com.sankuai.waimai.store.base.net.d<SCApiService> {
    public static ChangeQuickRedirect a;

    public static a a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c25c4487bf7be38acb507441690e174", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c25c4487bf7be38acb507441690e174");
        }
        a aVar = (a) com.sankuai.waimai.store.base.net.c.a(obj, a.class);
        if (aVar == null) {
            a aVar2 = new a();
            com.sankuai.waimai.store.base.net.c.a(obj, aVar2);
            return aVar2;
        }
        return aVar;
    }

    public static a c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a514a8feb4b6f5eaab7ecdf9d8308a19", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a514a8feb4b6f5eaab7ecdf9d8308a19") : new a();
    }

    @Override // com.sankuai.waimai.store.base.net.d
    @NonNull
    public final i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38bdc5a73de6eda0090057f8d90ef258", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38bdc5a73de6eda0090057f8d90ef258") : new e();
    }

    public final void a(String str, String str2, String str3, int i, List<Long> list, String str4, String str5, j<SpuProductsResponse> jVar) {
        Object[] objArr = {str, str2, str3, Integer.valueOf(i), list, str4, str5, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1493701b5c89bcce669ba02d27d89c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1493701b5c89bcce669ba02d27d89c3");
        } else {
            a(jVar, ((SCApiService) this.d).getProductsByIds(str, str2, str3, i, com.sankuai.waimai.store.util.i.a(list), "3", str4, str5));
        }
    }

    public final void a(String str, String str2, List<Long> list, j<SpuProductsResponse> jVar) {
        Object[] objArr = {str, str2, list, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d3f927cc38dff5a912f236e18b68d5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d3f927cc38dff5a912f236e18b68d5e");
        } else {
            a(jVar, ((SCApiService) this.d).getAddProductsByIds(str, str2, com.sankuai.waimai.store.util.i.a(list)));
        }
    }

    public final void a(String str, String str2, j<ScanProductResponse> jVar) {
        Object[] objArr = {str, str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41340a7b843e46952f7c251989870927", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41340a7b843e46952f7c251989870927");
        } else {
            a(jVar, ((SCApiService) this.d).getProductWithUpc(str, str2));
        }
    }

    public final void a(final a.C1295a c1295a, final j<SpuProductsResponse> jVar) {
        Object[] objArr = {c1295a, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ad69bad2f1fd0f9bf14e9fecc6100aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ad69bad2f1fd0f9bf14e9fecc6100aa");
            return;
        }
        a(new k<SpuProductsResponse>() { // from class: com.sankuai.waimai.store.base.net.sg.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                SpuProductsResponse spuProductsResponse = (SpuProductsResponse) obj;
                Object[] objArr2 = {spuProductsResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3bb0779a5af5704f8511f4d01293e53d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3bb0779a5af5704f8511f4d01293e53d");
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4098a441958e9696a4fcd67dd99c1e17", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4098a441958e9696a4fcd67dd99c1e17");
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb4ffdb29f92c1a2b4814beb702d9a2b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb4ffdb29f92c1a2b4814beb702d9a2b");
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
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "17c0e739080616294a5a3e608c7102a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "17c0e739080616294a5a3e608c7102a1");
                    return;
                }
                super.b();
                if (jVar != null) {
                    jVar.b();
                }
            }
        }, ((SCApiService) this.d).getProducts(c1295a.c, c1295a.e, c1295a.a, c1295a.b, c1295a.g, c1295a.h, c1295a.l ? 1 : 0, c1295a.i, com.sankuai.waimai.store.util.i.a(c1295a.o), c1295a.m, c1295a.n, c1295a.p));
    }

    public final void a(long j, String str, long j2, long j3, String str2, j<RestMenuResponse> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68c4c4d812c25ad25beee524dd71d7b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68c4c4d812c25ad25beee524dd71d7b0");
        } else {
            a(jVar, ((SCApiService) this.d).getShopMenu(j, str, j2 == -1 ? null : Long.valueOf(j2), 0, Long.valueOf(j3), str2, com.sankuai.waimai.store.base.abtest.a.d() ? 1 : 0));
        }
    }

    public final void a(long j, String str, long j2, long j3, String str2, int i, j<RestMenuResponse> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), str2, 1, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff09fb0b57e76fcbbc6c410d915bd836", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff09fb0b57e76fcbbc6c410d915bd836");
        } else {
            a(jVar, ((SCApiService) this.d).getShopMenu(j, str, j2 == -1 ? null : Long.valueOf(j2), 0, Long.valueOf(j3), 1, str2));
        }
    }

    public final void b(long j, String str, long j2, long j3, String str2, j<RestMenuResponse> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "888c9f9a8293a735f3f815e6b961f8db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "888c9f9a8293a735f3f815e6b961f8db");
        } else {
            a(jVar, rx.d.b(((SCApiService) this.d).getAggregationMenu(j, str, j2 == -1 ? null : Long.valueOf(j2), 0, Long.valueOf(j3), 1, str2), ((SCApiService) this.d).getPoiAndShopcartInfo(String.valueOf(j), str, str2, 990), new h<BaseResponse<RestMenuResponse>, BaseResponse<PoiShoppingCartAndPoi>, BaseResponse<RestMenuResponse>>() { // from class: com.sankuai.waimai.store.base.net.sg.a.2
                public static ChangeQuickRedirect a;

                @Override // rx.functions.h
                public final /* synthetic */ BaseResponse<RestMenuResponse> a(BaseResponse<RestMenuResponse> baseResponse, BaseResponse<PoiShoppingCartAndPoi> baseResponse2) {
                    BaseResponse<RestMenuResponse> baseResponse3 = baseResponse;
                    BaseResponse<PoiShoppingCartAndPoi> baseResponse4 = baseResponse2;
                    Object[] objArr2 = {baseResponse3, baseResponse4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "75e16e990a558af0ae40e04ca08dde8d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (BaseResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "75e16e990a558af0ae40e04ca08dde8d");
                    }
                    if (baseResponse3 != null && baseResponse3.data != null && baseResponse4 != null && baseResponse4.data != null) {
                        baseResponse3.data.mPoiShoppingCart = baseResponse4.data.poiShoppingCart;
                        baseResponse3.data.shoppingCartString = baseResponse4.data.shoppingCartString;
                        baseResponse3.data.poiString = baseResponse4.data.poiString;
                        baseResponse3.data.mCartPoi = baseResponse4.data.poi;
                        if (baseResponse3.data.poiString == null) {
                            ae.a(ae.b, "getAggregationMenu restMenu.data.poiString = null;");
                        }
                    }
                    return baseResponse3;
                }
            }));
        }
    }

    public final void b(long j, String str, long j2, long j3, String str2, int i, j<SpuSubscribeResponse> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), str2, Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8259bdc7942d8f29e58606b115985a4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8259bdc7942d8f29e58606b115985a4a");
        } else {
            a(jVar, ((SCApiService) this.d).subscribeWarmUp(j, j2, j3, str2, i));
        }
    }

    public final void a(long j, String str, long j2, long j3, int i, String str2, String str3, j<RecommendPair> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), 1, str2, str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ded75e34159009cc368ff122bd66652", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ded75e34159009cc368ff122bd66652");
        } else {
            a(jVar, ((SCApiService) this.d).requestRecommendPair(j, str, j2, j3, 1, str2, str3));
        }
    }

    public final void a(long j, long j2, long j3, String str, String str2, j<RestMenuResponse> jVar) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3), str, str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f1fe96688b1900e8cf1904bb58a76a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f1fe96688b1900e8cf1904bb58a76a2");
        } else {
            a(jVar, ((SCApiService) this.d).getShopMenuV8(j, j2 == -1 ? null : Long.valueOf(j2), 0, Long.valueOf(j3), str, str2));
        }
    }

    public final void a(long j, long j2, long j3, String str, j<RestMenuResponse> jVar) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3), str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c0b6f213d5d7b45aef267fcad8ca7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c0b6f213d5d7b45aef267fcad8ca7b");
        } else {
            a(j, j2, j3, str, "0", jVar);
        }
    }

    public final void a(int i, int i2, long j, String str, int i3, j<MarketGuessResponse> jVar) {
        Object[] objArr = {Integer.valueOf(i), 20, new Long(j), str, Integer.valueOf(i3), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9d4afdc5f336065f6274d4201f990b8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9d4afdc5f336065f6274d4201f990b8");
        } else {
            a(jVar, ((SCApiService) this.d).getGuessData(i3, i, 20, j, str));
        }
    }

    public final void a(String str, String str2, int i, long j, String str3, int i2, j<MarketGuessTagResponse> jVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), new Long(j), str3, Integer.valueOf(i2), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60f7ca64708dd1da0c3089358d5dd7fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60f7ca64708dd1da0c3089358d5dd7fb");
        } else {
            a(jVar, ((SCApiService) this.d).getGuessTagData(i2, str, str2, i, j, str3));
        }
    }

    @Deprecated
    public final void a(long j, String str, long j2, long j3, long j4, int i, String str2, j<Poi.PoiCouponItem> jVar) {
        Object[] objArr = {new Long(j), str, -1L, new Long(j3), new Long(j4), -1, null, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4590cb9ce279a66b7c17b587b6bf874", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4590cb9ce279a66b7c17b587b6bf874");
        } else {
            a(j, str, -1L, j3, j4, -1, null, "", "", jVar);
        }
    }

    public final void a(long j, String str, long j2, long j3, long j4, int i, String str2, String str3, String str4, j<Poi.PoiCouponItem> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), new Long(j3), new Long(j4), Integer.valueOf(i), str2, str3, str4, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d116571f0d55dc5095b0e9bf0a30cf84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d116571f0d55dc5095b0e9bf0a30cf84");
        } else {
            a(jVar, ((SCApiService) this.d).receiveCoupon(j, str, j2, j3, i, j4, str3, str4, str2));
        }
    }

    public final void a(long j, String str, String str2, String str3, String str4, j<Map<String, MutliPoiCouponItem>> jVar) {
        Object[] objArr = {new Long(j), str, str2, str3, str4, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eff19a26f4d8c492f1694b08a6661c09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eff19a26f4d8c492f1694b08a6661c09");
        } else {
            a(jVar, ((SCApiService) this.d).batchReceiveCoupon(j, str, str2, str3, str4));
        }
    }

    public final void b(j<Poi.MemberToken> jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8361c05b7739827936c951e6a44865e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8361c05b7739827936c951e6a44865e7");
        } else {
            a(jVar, ((SCApiService) this.d).exchangeToken());
        }
    }

    public final void a(String str, String str2, int i, long j, j<Poi.PoiCouponItem> jVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), new Long(j), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "984f436239f9b03fc20dcf4588d8f888", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "984f436239f9b03fc20dcf4588d8f888");
        } else {
            a(jVar, ((SCApiService) this.d).scoreExchangeCoupons(str, str2, i, 1, j));
        }
    }

    public final void a(long j, j<Map<String, Object>> jVar) {
        Object[] objArr = {new Long(j), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f47b157ec17b1718bb6acb4b44c371d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f47b157ec17b1718bb6acb4b44c371d");
        } else {
            a(jVar, ((SCApiService) this.d).refreshNewUser(j));
        }
    }

    public final void a(String str, Map<String, String> map, j<PoiVerticalityDataResponse> jVar) {
        Object[] objArr = {str, map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5f3bc90555390a8c7fdd7c6028ae59d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5f3bc90555390a8c7fdd7c6028ae59d");
        } else {
            a(jVar, ((SCApiService) this.d).fetchModuleRefresh(str, com.sankuai.waimai.store.util.i.a(map)));
        }
    }

    public final void a(long j, String str, int i, j<GetMenuResponse> jVar) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f189c26d2fecb2104793b90995b0f3db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f189c26d2fecb2104793b90995b0f3db");
        } else {
            a(j, str, i, "", jVar);
        }
    }

    public final void a(long j, String str, int i, String str2, j<GetMenuResponse> jVar) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5815bd4fcc342b141153860996902601", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5815bd4fcc342b141153860996902601");
        } else {
            a(jVar, ((SCApiService) this.d).getPopupMenu(j, str, i, str2));
        }
    }

    public final void a(Map<String, String> map, j<GoodsDetailResponse> jVar) {
        Object[] objArr = {map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4441327f256446eb517544b32c17251e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4441327f256446eb517544b32c17251e");
        } else {
            a(jVar, ((SCApiService) this.d).getGoodsDetail(map));
        }
    }

    public final void b(Map<String, String> map, j<GoodsDetailResponse> jVar) {
        Object[] objArr = {map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e47b6223fc189d0e332635bba2b806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e47b6223fc189d0e332635bba2b806");
        } else {
            a(jVar, ((SCApiService) this.d).getGoodsDetailModule(map));
        }
    }

    public final void b(String str, Map<String, String> map, j<GoodsDetailResponse> jVar) {
        Object[] objArr = {str, map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52678cd9947121a552a6025654520646", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52678cd9947121a552a6025654520646");
        } else if (TextUtils.isEmpty(str)) {
            com.sankuai.shangou.stone.util.log.a.b("GoodDetailPreRequestLink", "api manager key empty, start timely request", new Object[0]);
            a(map, jVar);
        } else if (new com.sankuai.waimai.store.base.preload.a().a(str, jVar)) {
        } else {
            a(map, jVar);
        }
    }

    public final void a(long j, int i, long j2, String str, String str2, String str3, String str4, long j3, boolean z, String str5, String str6, String str7, int i2, int i3, int i4, String str8, String str9, String str10, String str11, String str12, String str13, j<PoiVerticalityDataResponse> jVar) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), new Long(j2), str, str2, str3, str4, new Long(j3), Byte.valueOf(z ? (byte) 1 : (byte) 0), str5, str6, str7, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str8, str9, str10, str11, str12, str13, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "487c13cbcc39ffc86cea7ef2f06350c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "487c13cbcc39ffc86cea7ef2f06350c7");
        } else {
            a(jVar, ((SCApiService) this.d).getPoiVerticalitylistV9(j2, str, j, i, j2, j3, str2, str3, str4, 0, str5, str6, str7, i2, i3, i4, str8, str9, str10, str11, str12, str13));
        }
    }

    public final void a(String str, long j, String str2, String str3, k<PoiVerticalityDataResponse> kVar) {
        Object[] objArr = {str, new Long(j), str2, str3, kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8160a7a51b0b6643c440c39dacd367ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8160a7a51b0b6643c440c39dacd367ec");
        } else {
            a(kVar, ((SCApiService) this.d).getDrugCommodityModeSpulist(str, j, str2, str3));
        }
    }

    public final void a(long j, String str, j<MemberCouponStatusResponse> jVar) {
        Object[] objArr = {new Long(j), str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acc43fd553e7671922de61df9c744ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acc43fd553e7671922de61df9c744ddf");
        } else {
            a(jVar, ((SCApiService) this.d).getMemberCouponStatus(j, str));
        }
    }

    public final void a(long j, double d, int i, j<com.sankuai.waimai.store.shopping.patchwork.model.b> jVar) {
        Object[] objArr = {new Long(j), Double.valueOf(d), Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4b94326aad498cfd5d813ac83e428ac0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4b94326aad498cfd5d813ac83e428ac0");
        } else {
            a(jVar, ((SCApiService) this.d).getShopCartPatchwork(j, d, i));
        }
    }

    public final void a(com.sankuai.waimai.store.param.a aVar, long j, int i, long j2, String str, String str2, String str3, String str4, long j3, boolean z, String str5, String str6, String str7, int i2, int i3, int i4, String str8, String str9, String str10, String str11, String str12, j<PoiVerticalityDataResponse> jVar) {
        Object[] objArr = {aVar, new Long(j), 20, new Long(j2), str, str2, str3, str4, new Long(j3), Byte.valueOf(z ? (byte) 1 : (byte) 0), str5, str6, str7, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str8, str9, null, null, str12, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e626f8b96412cd2e4801a85372710c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e626f8b96412cd2e4801a85372710c7");
        } else if (TextUtils.isEmpty(aVar.af)) {
            a(j, 20, j2, str, str2, str3, str4, j3, z, str5, str6, str7, i2, i3, i4, str8, str9, (String) null, (String) null, str12, (String) null, jVar);
        } else if (new com.sankuai.waimai.store.base.preload.a().a(aVar.af, jVar)) {
        } else {
            a(j, 20, j2, str, str2, str3, str4, j3, z, str5, str6, str7, i2, i3, i4, str8, str9, (String) null, (String) null, (String) null, str12, jVar);
        }
    }

    public final void a(com.sankuai.waimai.store.param.a aVar, String str, String str2, long j, String str3, String str4, String str5, String str6, long j2, String str7, j<PoiVerticalityDataResponse> jVar) {
        Object[] objArr = {aVar, str, str2, new Long(j), str3, str4, str5, str6, new Long(j2), str7, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3909984b968b04ada54bff864676b35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3909984b968b04ada54bff864676b35");
        } else if (TextUtils.isEmpty(aVar.ae)) {
            a(str, str2, j, str3, str4, str5, str6, j2, str7, aVar, jVar);
        } else if (new com.sankuai.waimai.store.base.preload.a().a(aVar.ae, jVar)) {
        } else {
            a(str, str2, j, str3, str4, str5, str6, j2, str7, aVar, jVar);
        }
    }

    public final void a(String str, String str2, long j, String str3, String str4, String str5, String str6, long j2, String str7, com.sankuai.waimai.store.param.a aVar, j<PoiVerticalityDataResponse> jVar) {
        rx.d<BaseResponse<PoiVerticalityDataResponse>> homeTileBlocks;
        Object[] objArr = {str, str2, new Long(j), str3, str4, str5, str6, new Long(j2), str7, aVar, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f8a6d684fd144e47f508df25cf21f46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f8a6d684fd144e47f508df25cf21f46");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("category_type", str);
        hashMap.put("second_category_type", str2);
        hashMap.put("sort_type", String.valueOf(j));
        hashMap.put("session_id", str3);
        hashMap.put(Constants.Environment.KEY_UNION_ID, str4);
        hashMap.put("activity_filter_codes", str5);
        hashMap.put("g_source", str6);
        hashMap.put("search_category_type", String.valueOf(j2));
        hashMap.put("page_type", str7);
        hashMap.put("extra", aVar.aj);
        if (aVar.y) {
            if (o.c()) {
                homeTileBlocks = ((SCApiService) this.d).getHomeV2TileBlocks(com.sankuai.waimai.store.util.i.a(hashMap));
            } else {
                hashMap.put("page_id", "sc-native-home2");
                homeTileBlocks = ((SCApiService) this.d).getHomeTileBlocks(com.sankuai.waimai.store.util.i.a(hashMap));
            }
        } else if (o.c()) {
            homeTileBlocks = ((SCApiService) this.d).getChannelTileBlocks(com.sankuai.waimai.store.util.i.a(hashMap));
        } else {
            hashMap.put("page_id", "sc-native-channel");
            homeTileBlocks = ((SCApiService) this.d).getHomeTileBlocks(com.sankuai.waimai.store.util.i.a(hashMap));
        }
        a(jVar, homeTileBlocks);
    }

    public final void a(long j, String str, int i, int i2, int i3, j<FilterConditionResponse> jVar) {
        Object[] objArr = {new Long(j), str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bfdebf7fccab6c72835a2ad77ed2d89e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bfdebf7fccab6c72835a2ad77ed2d89e");
        } else {
            a(jVar, ((SCApiService) this.d).getFilterConditionByType(j, str, i, i2, i3));
        }
    }

    public final void a(long j, String str, long j2, String str2, j<RestMenuResponse> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9035a7c9b3bffe5babec877ad4fe1e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9035a7c9b3bffe5babec877ad4fe1e9");
        } else {
            a(jVar, ((SCApiService) this.d).getShopAllSpus(j, str, j2, str2));
        }
    }

    public final void a(String str, String str2, String str3, j<SCRangeEntity> jVar) {
        Object[] objArr = {str, str2, str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0cdfc1ec3d775c6d1f6d8f9b5ce936d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0cdfc1ec3d775c6d1f6d8f9b5ce936d2");
        } else {
            a(jVar, ((SCApiService) this.d).getTakeoutRange(String.valueOf(str), str2, str3));
        }
    }

    public final void a(long j, int i, j<PoiSubscribeResponse> jVar) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a6befb67170658b904d310c59b496e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a6befb67170658b904d310c59b496e5");
        } else {
            a(jVar, ((SCApiService) this.d).subscribePoi(j, i));
        }
    }

    public final void a(int i, long j, j<RecipeLikeResponse> jVar) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6e38ef02be3a10834865c13457d0ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6e38ef02be3a10834865c13457d0ad");
        } else {
            a(jVar, ((SCApiService) this.d).recipePraise(i, j));
        }
    }

    public final void a(long j, long j2, List<Long> list, String str, j<RecipeResponse> jVar) {
        Object[] objArr = {new Long(j), new Long(j2), list, str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5749131acc3ba155330357d6fb26a8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5749131acc3ba155330357d6fb26a8e");
        } else {
            a(jVar, ((SCApiService) this.d).loadRecipeFloating(j, j2, list, str));
        }
    }

    public final void b(long j, long j2, List<Long> list, String str, j<Recipe> jVar) {
        Object[] objArr = {new Long(j), new Long(j2), list, str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8f962ff16704e0ef747db311dbbef4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8f962ff16704e0ef747db311dbbef4b");
        } else {
            a(jVar, ((SCApiService) this.d).loadRecipeFloatingTab(j, j2, list, str));
        }
    }

    public final void a(String str, String str2, int i, int i2, String str3, j<OrderDetailRecommendResponse> jVar) {
        Object[] objArr = {str, str2, 50, Integer.valueOf(i2), str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9718817a9c939fe6d903dcdd8288c0b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9718817a9c939fe6d903dcdd8288c0b2");
        } else {
            a(jVar, ((SCApiService) this.d).getOrderDetailRecommendCardList(str, str2, 50, i2, str3));
        }
    }

    public final void c(String str, Map<String, Object> map, j<MachTileResponse> jVar) {
        Object[] objArr = {str, map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d1a35e81976b7f77ed8d1d7223b6c79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d1a35e81976b7f77ed8d1d7223b6c79");
        } else {
            a(jVar, ((SCApiService) this.d).getTileBlocks(str, com.sankuai.waimai.store.util.i.a(map)));
        }
    }

    public final void d(String str, Map<String, Object> map, j<MachTileResponse> jVar) {
        Object[] objArr = {str, map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "494dc45d93fe1f27044cd80e7b2ea802", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "494dc45d93fe1f27044cd80e7b2ea802");
        } else {
            a(jVar, ((SCApiService) this.d).getTilePageList(str, com.sankuai.waimai.store.util.i.a(map)));
        }
    }

    public final void b(String str, String str2, String str3, j<FeedbackData> jVar) {
        Object[] objArr = {str, str2, str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50973d190b4951135d0ad042feb581d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50973d190b4951135d0ad042feb581d4");
        } else {
            a(jVar, ((SCApiService) this.d).getFeedbackData(str, str2, str3));
        }
    }

    public final void a(String str, int i, long j, String str2, String str3, long j2, long j3, String str4, String str5, int i2, String str6, int i3, String str7, int i4, j<SGConvenientLandingResponse> jVar) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j), str2, str3, new Long(j2), new Long(j3), str4, str5, Integer.valueOf(i2), str6, Integer.valueOf(i3), str7, Integer.valueOf(i4), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fcd71d972cfb0fea36a97728a4cabeff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fcd71d972cfb0fea36a97728a4cabeff");
        } else if (TextUtils.isEmpty(str)) {
            a(i, j, str2, str3, j2, j3, str4, str5, i2, str6, i3, str7, i4, jVar);
        } else if (new com.sankuai.waimai.store.base.preload.a().a(str, jVar)) {
        } else {
            a(i, j, str2, str3, j2, j3, str4, str5, i2, str6, i3, str7, i4, jVar);
        }
    }

    public final void a(int i, long j, String str, String str2, long j2, long j3, String str3, String str4, int i2, String str5, int i3, String str6, int i4, j<SGConvenientLandingResponse> jVar) {
        Object[] objArr = {Integer.valueOf(i), new Long(j), str, str2, new Long(j2), new Long(j3), str3, str4, Integer.valueOf(i2), str5, Integer.valueOf(i3), str6, Integer.valueOf(i4), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6fd904b9b7cedcd544426c083ddcad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6fd904b9b7cedcd544426c083ddcad9");
        } else {
            a(jVar, ((SCApiService) this.d).getConvenientLandingListV1(i, j, str, str2, j2, j3, str3, str4, i2, str5, i3, str6, i4));
        }
    }

    public final void a(int i, int i2, long j, String str, String str2, int i3, j<StrollAroundFloorResponse> jVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j), str, str2, 12, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38739e996df744c79ad2d598deffec1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38739e996df744c79ad2d598deffec1e");
        } else {
            a(jVar, rx.d.b(((SCApiService) this.d).getGuessDataWithModuleList(i, i2, j, str, 12), ((SCApiService) this.d).getStrollAround(j, str, str2), new h<BaseResponse<WaterFallMachResponse>, BaseResponse<StrollAroundFloorResponse>, BaseResponse<StrollAroundFloorResponse>>() { // from class: com.sankuai.waimai.store.base.net.sg.a.3
                public static ChangeQuickRedirect a;

                /* JADX WARN: Type inference failed for: r0v4, types: [D, com.sankuai.waimai.store.goods.list.viewblocks.strollaround.StrollAroundFloorResponse] */
                @Override // rx.functions.h
                public final /* synthetic */ BaseResponse<StrollAroundFloorResponse> a(BaseResponse<WaterFallMachResponse> baseResponse, BaseResponse<StrollAroundFloorResponse> baseResponse2) {
                    BaseResponse<WaterFallMachResponse> baseResponse3 = baseResponse;
                    BaseResponse<StrollAroundFloorResponse> baseResponse4 = baseResponse2;
                    Object[] objArr2 = {baseResponse3, baseResponse4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a29c5447a1d9958d72380c4d6abb5e3", RobustBitConfig.DEFAULT_VALUE)) {
                        return (BaseResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a29c5447a1d9958d72380c4d6abb5e3");
                    }
                    if (baseResponse4 == null) {
                        baseResponse4 = new BaseResponse<>();
                        baseResponse4.data = new StrollAroundFloorResponse();
                    }
                    if (baseResponse3 != null) {
                        baseResponse4.data.mAroundAllFoodResponse = baseResponse3.data;
                    }
                    return baseResponse4;
                }
            }));
        }
    }

    public final void b(int i, int i2, long j, String str, int i3, j<WaterFallMachResponse> jVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j), str, 12, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d44063ed673d7f6a62b788efc563af97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d44063ed673d7f6a62b788efc563af97");
        } else {
            a(jVar, ((SCApiService) this.d).getGuessDataWithModuleList(i, i2, j, str, 12));
        }
    }

    public final void a(int i, int i2, long j, int i3, long j2, long j3, j<WaterFallMachResponse> jVar) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), new Long(j), 13, new Long(j2), new Long(j3), jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28cdcd9e20156636082f32f13e61d42a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28cdcd9e20156636082f32f13e61d42a");
        } else {
            a(jVar, ((SCApiService) this.d).getSGDetailGuessData(i, i2, j, j3, j2, 13));
        }
    }

    public final void a(HashMap<String, Object> hashMap, j<SGHomeTileResponse> jVar) {
        Object[] objArr = {hashMap, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "056136fb2bd72ee2baf2d9ffa7f0bbd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "056136fb2bd72ee2baf2d9ffa7f0bbd9");
        } else {
            a(jVar, ((SCApiService) this.d).getConvenientLandingTile(com.sankuai.waimai.store.util.i.a(hashMap)));
        }
    }

    public final boolean a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SGNewUserOptModel sGNewUserOptModel, j<SGNewUserLandResponse> jVar) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, str9, sGNewUserOptModel, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58da51c84fcfa1d7ce5082761235d888", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58da51c84fcfa1d7ce5082761235d888")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            a(str2, str3, str4, str5, str6, str7, str8, str9, sGNewUserOptModel.upc, sGNewUserOptModel.hangDownProductsInfo, sGNewUserOptModel.reqSource, sGNewUserOptModel.thirdCategoryCode, jVar);
            return false;
        } else if (new com.sankuai.waimai.store.base.preload.a().a(str, jVar)) {
            return true;
        } else {
            a(str2, str3, str4, str5, str6, str7, str8, str9, sGNewUserOptModel.upc, sGNewUserOptModel.hangDownProductsInfo, sGNewUserOptModel.reqSource, sGNewUserOptModel.thirdCategoryCode, jVar);
            return false;
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, j<SGNewUserLandResponse> jVar) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34b144a9e70c657ae22adcead91b4909", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34b144a9e70c657ae22adcead91b4909");
        } else {
            a(jVar, ((SCApiService) this.d).getNewUserLandData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12));
        }
    }

    public final void b(String str, String str2, j<SGNewUserLandResponse.ProductList> jVar) {
        Object[] objArr = {str, str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "536dd2227e0fb6c32afa72a866a7eb65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "536dd2227e0fb6c32afa72a866a7eb65");
        } else {
            a(jVar, ((SCApiService) this.d).getNewUserRender(str, str2));
        }
    }

    public final void a(int i, String str, int i2, String str2, j<SGNewUserLandResponse.ProductList> jVar) {
        Object[] objArr = {Integer.valueOf(i), str, Integer.valueOf(i2), str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0685861ca9bd008078878a9039acf17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0685861ca9bd008078878a9039acf17");
        } else {
            a(jVar, ((SCApiService) this.d).getHotProductRender(i, str, i2, str2));
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, j<SGNewUserLandPoisResponse> jVar) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, str8, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e2fac5a9c00050f5c05921558d0018", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e2fac5a9c00050f5c05921558d0018");
        } else {
            a(jVar, ((SCApiService) this.d).getNewUserPois(str, str2, str3, str4, str5, str6, str7, str8));
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff7d647c6f0be4e57ad317961fc99636", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff7d647c6f0be4e57ad317961fc99636");
        } else {
            a((j) null, ((SCApiService) this.d).getNewUserPrize(str));
        }
    }

    public final void c(String str, String str2, j<SCPoiFoodContainerResponse> jVar) {
        Object[] objArr = {str, str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a04aa802049a31b8df6d3527511056f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a04aa802049a31b8df6d3527511056f7");
        } else {
            a(jVar, ((SCApiService) this.d).getPoiFoodContainer(str, str2));
        }
    }
}

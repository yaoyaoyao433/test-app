package com.sankuai.waimai.store.drug.base.net;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.BaseResponse;
import com.sankuai.waimai.store.base.net.d;
import com.sankuai.waimai.store.base.net.i;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.base.net.l;
import com.sankuai.waimai.store.base.net.sg.e;
import com.sankuai.waimai.store.drug.coupon.model.DrugMemberCouponStatusResponse;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiShoppingCartAndPoi;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.util.ae;
import rx.functions.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends d<SCApiService> {
    public static ChangeQuickRedirect a;

    public static c a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "80793ed1a36b16fa9a0542970958c999", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "80793ed1a36b16fa9a0542970958c999");
        }
        c cVar = (c) com.sankuai.waimai.store.base.net.c.a(obj, c.class);
        if (cVar == null) {
            c cVar2 = new c();
            com.sankuai.waimai.store.base.net.c.a(obj, cVar2);
            return cVar2;
        }
        return cVar;
    }

    @Override // com.sankuai.waimai.store.base.net.d
    @NonNull
    public final i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9053d0859dad72d3e95657a3ce91d5e9", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9053d0859dad72d3e95657a3ce91d5e9") : new e();
    }

    public final void a(long j, long j2, long j3, String str, j<RestMenuResponse> jVar) {
        Object[] objArr = {new Long(j), new Long(j2), new Long(j3), str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5902b8c4c951cb9c465552884373e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5902b8c4c951cb9c465552884373e5a");
        } else {
            a(jVar, rx.d.b(((SCApiService) this.d).getAggregationMenu(j, j2 == -1 ? null : Long.valueOf(j2), 0, Long.valueOf(j3), str), ((SCApiService) this.d).getPoiAndShopcartInfo(String.valueOf(j), str, 990), new h<BaseResponse<RestMenuResponse>, BaseResponse<PoiShoppingCartAndPoi>, BaseResponse<RestMenuResponse>>() { // from class: com.sankuai.waimai.store.drug.base.net.c.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.h
                public final /* synthetic */ BaseResponse<RestMenuResponse> a(BaseResponse<RestMenuResponse> baseResponse, BaseResponse<PoiShoppingCartAndPoi> baseResponse2) {
                    BaseResponse<RestMenuResponse> baseResponse3 = baseResponse;
                    BaseResponse<PoiShoppingCartAndPoi> baseResponse4 = baseResponse2;
                    Object[] objArr2 = {baseResponse3, baseResponse4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c2c84e4dc591f30d2620995af62a640", RobustBitConfig.DEFAULT_VALUE)) {
                        return (BaseResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c2c84e4dc591f30d2620995af62a640");
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

    public final void a(long j, String str, long j2, String str2, j<RestMenuResponse> jVar) {
        Object[] objArr = {new Long(j), str, new Long(j2), str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87617f3165002a474f98de4176b210b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87617f3165002a474f98de4176b210b6");
        } else {
            a(jVar, ((SCApiService) this.d).getShopAllSpus(j, str, j2, str2));
        }
    }

    public final void b(j<Poi.MemberToken> jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3089e4bc6efa4f6e42c181f63ecbf0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3089e4bc6efa4f6e42c181f63ecbf0b");
        } else {
            a(jVar, ((SCApiService) this.d).exchangeToken());
        }
    }

    public final void a(String str, String str2, int i, long j, String str3, j<Poi.PoiCouponItem> jVar) {
        Object[] objArr = {str, str2, Integer.valueOf(i), new Long(j), str3, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e5bdd2e50808e8e4b78446fe33c50b1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e5bdd2e50808e8e4b78446fe33c50b1f");
        } else {
            a(jVar, ((SCApiService) this.d).scoreExchangeCoupons(str, str2, i, 1, j, str3));
        }
    }

    public final void a(long j, String str, int i, String str2, j<GetMenuResponse> jVar) {
        Object[] objArr = {new Long(j), str, 1, str2, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e2f2f0b41ccc5ffefefaac0cd8b963c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e2f2f0b41ccc5ffefefaac0cd8b963c");
        } else {
            a(jVar, ((SCApiService) this.d).getPopupMenu(j, str, 1, str2));
        }
    }

    public final void a(long j, String str, j<DrugMemberCouponStatusResponse> jVar) {
        Object[] objArr = {new Long(j), str, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dbb72fa19b46e8f0e135e32963af175", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dbb72fa19b46e8f0e135e32963af175");
        } else {
            a(jVar, ((SCApiService) this.d).getMemberCouponStatus(j, str));
        }
    }

    @Override // com.sankuai.waimai.store.base.net.d
    public final <T> j<T> a(j<T> jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02efdc0e48003fd24465fb134d9a385d", RobustBitConfig.DEFAULT_VALUE) ? (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02efdc0e48003fd24465fb134d9a385d") : new l<T>(jVar) { // from class: com.sankuai.waimai.store.drug.base.net.c.2
            public static ChangeQuickRedirect b;

            @Override // com.sankuai.waimai.store.base.net.l, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = b;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8b86bbee9b52ffd8bba324a3f6111e7d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8b86bbee9b52ffd8bba324a3f6111e7d");
                    return;
                }
                super.a(bVar);
                com.sankuai.waimai.store.drug.util.a.b(bVar);
            }
        };
    }
}

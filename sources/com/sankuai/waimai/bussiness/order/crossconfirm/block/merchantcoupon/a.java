package com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.android.cube.pga.common.i;
import com.meituan.android.cube.pga.type.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.base.utils.g;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodParams;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.OrderCouponRequestParams;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.b;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderCouponParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiOrderParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CallbackInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewPoiResult;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dfc155ae510e73c8c24ba47ee4b8e54c", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dfc155ae510e73c8c24ba47ee4b8e54c") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43623a88762b778c56a5bbbe41ffaea2", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43623a88762b778c56a5bbbe41ffaea2") : new b(m(), (f) F(), new b.a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.b.a
            public final void a(String str, String str2, String str3) {
                String str4;
                Object[] objArr2 = {str, str2, str3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "844a905fa540f7ad418aef1f718d81e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "844a905fa540f7ad418aef1f718d81e1");
                    return;
                }
                String str5 = "";
                if (((com.sankuai.waimai.bussiness.order.crossconfirm.a) a.this.F()).A.a().b == null || a.this.n == null) {
                    return;
                }
                OrderCouponRequestParams orderCouponRequestParams = new OrderCouponRequestParams();
                ((com.sankuai.waimai.bussiness.order.crossconfirm.a) a.this.F()).x.a((com.meituan.android.cube.pga.common.b<i.c<Long, OrderCouponRequestParams>>) i.a(Long.valueOf(((d) a.this.n).p.b), orderCouponRequestParams));
                int i = ((d) a.this.n).p.h;
                if (com.sankuai.waimai.foundation.utils.b.a(((d) a.this.n).p.e)) {
                    String str6 = "";
                    for (int i2 = 0; i2 < ((d) a.this.n).p.e.size(); i2++) {
                        CouponInfo couponInfo = (CouponInfo) com.sankuai.waimai.foundation.utils.b.a(((d) a.this.n).p.e, i2);
                        if (couponInfo != null && couponInfo.type == 1 && com.sankuai.waimai.foundation.utils.b.a(couponInfo.selectedCoupons)) {
                            orderCouponRequestParams.selectedCoupons.addAll(couponInfo.selectedCoupons);
                        }
                        if (couponInfo != null && couponInfo.type == 1 && !aa.a(couponInfo.linkSchema)) {
                            str6 = couponInfo.linkSchema;
                        }
                    }
                    str5 = str6;
                }
                orderCouponRequestParams.extendsInfo = ((d) a.this.n).p.i;
                Activity activity = (Activity) a.this.m();
                boolean b = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) a.this.F()).H.a().b();
                Object[] objArr3 = {activity, 7, str, str2, str3, orderCouponRequestParams, 2, Byte.valueOf(b ? (byte) 1 : (byte) 0), Integer.valueOf(i), str5};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.base.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "3e229d50b1cb0470b9d2801f2a6ca99b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "3e229d50b1cb0470b9d2801f2a6ca99b");
                    return;
                }
                Bundle bundle = new Bundle();
                orderCouponRequestParams.isFromCrossOrder = true;
                bundle.putInt("type", 2);
                bundle.putString("poicoupon_view_id", str);
                bundle.putString("goods_coupon_view_id", str2);
                bundle.putString("sg_item_coupon_view_id", str3);
                bundle.putString("orderCouponRequestParams", k.a().toJson(orderCouponRequestParams));
                bundle.putString("poiID", orderCouponRequestParams.poiId);
                bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, orderCouponRequestParams.poiIdStr);
                bundle.putString("pickedPoiCouponViewID", str);
                bundle.putString("pickedGoodsCouponViewID", str2);
                bundle.putString("pickedSgGoodsCouponViewID", str3);
                bundle.putString("phone", orderCouponRequestParams.phone);
                bundle.putString("payType", orderCouponRequestParams.payType);
                bundle.putString("token", orderCouponRequestParams.orderToken);
                bundle.putString("total", orderCouponRequestParams.total);
                bundle.putString("originalPrice", orderCouponRequestParams.originalPrice);
                bundle.putString("canUseCouponPrice", orderCouponRequestParams.canUseCouponPrice);
                bundle.putInt("businessType", orderCouponRequestParams.businessType);
                bundle.putString("activityInfoForCoupon", orderCouponRequestParams.activityInfoCoupon);
                String json = k.a().toJson(orderCouponRequestParams.productList);
                String arrays = Arrays.toString(orderCouponRequestParams.skuIdArray);
                bundle.putString("productArray", json);
                bundle.putString("skuIDArray", arrays);
                bundle.putInt("addr_latitude", orderCouponRequestParams.addrLatitude);
                bundle.putInt("addr_longitude", orderCouponRequestParams.addrLongitude);
                JSONObject jSONObject = g.a().b;
                if (jSONObject != null) {
                    bundle.putString("orderJsonString", jSONObject.toString());
                }
                bundle.putBoolean("isMultiOrder", orderCouponRequestParams.isFromCrossOrder);
                bundle.putString("other_poi_selected_coupon_view_ids", orderCouponRequestParams.otherPoiSelectedCouponViewIds);
                bundle.putInt("biz_type", i);
                bundle.putString("callback_info", k.a().toJson(orderCouponRequestParams.extendsInfo));
                bundle.putString("selected_coupons", k.a().toJson(orderCouponRequestParams.selectedCoupons));
                JsonObject jsonObject = new JsonObject();
                jsonObject.add(GearsLocator.ADDRESS, new Gson().toJsonTree(orderCouponRequestParams.poiAddressParam));
                Gson gson = new Gson();
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.base.a.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "241140b0fcd1d476e505f6455d201756", RobustBitConfig.DEFAULT_VALUE)) {
                    str4 = (String) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "241140b0fcd1d476e505f6455d201756");
                } else {
                    str4 = com.dianping.mainboard.a.b().h;
                    if (TextUtils.isEmpty(str4)) {
                        str4 = "";
                    }
                }
                jsonObject.add("push_token", gson.toJsonTree(str4));
                jsonObject.add("login_token", new Gson().toJsonTree(com.sankuai.waimai.platform.domain.manager.user.a.i().e()));
                jsonObject.add("check_shipping_area", new Gson().toJsonTree(Boolean.valueOf(b)));
                if (orderCouponRequestParams.poiOrderParams != null && orderCouponRequestParams.poiOrderParams.size() > 0) {
                    if (orderCouponRequestParams.poiId != null) {
                        Iterator<PoiOrderParam> it = orderCouponRequestParams.poiOrderParams.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            PoiOrderParam next = it.next();
                            if (orderCouponRequestParams.poiId.equals(String.valueOf(next.poiId))) {
                                PoiOrderCouponParam poiOrderCouponParam = new PoiOrderCouponParam();
                                poiOrderCouponParam.poiCouponViewId = com.sankuai.waimai.bussiness.order.base.a.a(str) ? str : "-1";
                                poiOrderCouponParam.sgItemCouponViewId = com.sankuai.waimai.bussiness.order.base.a.a(str3) ? str3 : "-1";
                                poiOrderCouponParam.goodsCouponViewId = com.sankuai.waimai.bussiness.order.base.a.a(str2) ? str2 : "-1";
                                next.coupon = poiOrderCouponParam;
                            }
                        }
                    }
                    jsonObject.add("poi_orders", new Gson().toJsonTree(orderCouponRequestParams.poiOrderParams));
                }
                bundle.putString("previewData", jsonObject.toString());
                if (!aa.a(str5)) {
                    com.sankuai.waimai.foundation.router.a.a(activity, str5, bundle, 7);
                } else if (com.sankuai.waimai.foundation.core.a.d()) {
                    com.sankuai.waimai.foundation.router.a.a(activity, com.sankuai.waimai.foundation.router.interfaces.b.c + "/selectcoupon", bundle, 7);
                } else if (com.sankuai.waimai.foundation.core.a.e()) {
                    com.sankuai.waimai.foundation.router.a.a(activity, "imeituan://www.meituan.com/takeout/selectcoupon", bundle, 7);
                } else if (com.sankuai.waimai.foundation.core.a.f()) {
                    com.sankuai.waimai.foundation.router.a.a(activity, "dianping://waimai.dianping.com/takeout/selectcoupon", bundle, 7);
                }
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.b.a
            public final void a(int i, double d, double d2, double d3, String str) {
                Object[] objArr2 = {3, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "410f768eea872470f569b99d7234b2d1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "410f768eea872470f569b99d7234b2d1");
                } else if (a.this.n != null) {
                    long j = ((d) a.this.n).p.b;
                    String str2 = ((d) a.this.n).p.c;
                    ArrayList arrayList = new ArrayList();
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.a) a.this.F()).al.a((com.meituan.android.cube.pga.common.b<i.c<Long, List<OrderedFood>>>) i.a(Long.valueOf(j), arrayList));
                    PoiOrderPreviewPoiResult poiOrderPreviewPoiResult = ((d) a.this.n).e().poiInfo;
                    CollectOrderFoodParams collectOrderFoodParams = new CollectOrderFoodParams(3, d, ((d) a.this.n).p.d, d2, d3, j, str2, arrayList, null, 0.0d, poiOrderPreviewPoiResult == null ? 0L : poiOrderPreviewPoiResult.poiFirstCateId);
                    collectOrderFoodParams.q = str;
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.a) a.this.F()).Y.a(collectOrderFoodParams);
                }
            }
        });
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5de4031c0c9d06260c9c982ee575d06a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5de4031c0c9d06260c9c982ee575d06a");
        } else {
            ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).o.a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(b.a aVar2) {
                    com.sankuai.waimai.bussiness.order.confirm.coupon.model.a aVar3;
                    b.a aVar4 = aVar2;
                    Object[] objArr2 = {aVar4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0666f38b2ebe13ca547312619f96c022", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0666f38b2ebe13ca547312619f96c022");
                        return;
                    }
                    b bVar = (b) a.this.g;
                    int i = aVar4.a;
                    int i2 = aVar4.b;
                    Intent intent = aVar4.c;
                    Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), intent};
                    ChangeQuickRedirect changeQuickRedirect3 = b.d;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "e7ca4a2bb8c5adb44a2a2ab563016885", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "e7ca4a2bb8c5adb44a2a2ab563016885");
                    } else if (i == 7 && i2 == -1) {
                        String a2 = com.sankuai.waimai.platform.utils.f.a(intent, "resultData", "");
                        if (TextUtils.isEmpty(a2)) {
                            return;
                        }
                        try {
                            aVar3 = (com.sankuai.waimai.bussiness.order.confirm.coupon.model.a) new Gson().fromJson(a2, (Class<Object>) com.sankuai.waimai.bussiness.order.confirm.coupon.model.a.class);
                        } catch (Exception e) {
                            com.sankuai.waimai.foundation.utils.log.a.e("MerchantCouponBlock", e.toString(), new Object[0]);
                            aVar3 = null;
                        }
                        if (aVar3 != null) {
                            String str = aVar3.a;
                            if (!bVar.j.a || (str != null && str.equals(String.valueOf(bVar.j.b)))) {
                                String str2 = aVar3.c;
                                str2 = (str2 == null || "".equals(str2)) ? "-1" : "-1";
                                String str3 = aVar3.d;
                                str3 = (str3 == null || "".equals(str3)) ? "-1" : "-1";
                                String str4 = aVar3.e;
                                str4 = (str4 == null || "".equals(str4)) ? "-1" : "-1";
                                if (aVar3.f != null && aVar3.f.size() > 0) {
                                    List<Map<String, Object>> list = aVar3.f;
                                    Object[] objArr4 = {list};
                                    ChangeQuickRedirect changeQuickRedirect4 = b.d;
                                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "c11728e38c7dadb572d1cfcc5a2494f6", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "c11728e38c7dadb572d1cfcc5a2494f6");
                                    } else {
                                        com.sankuai.waimai.bussiness.order.confirm.helper.g.a().a(list);
                                    }
                                }
                                List<com.sankuai.waimai.bussiness.order.confirm.coupon.model.f> list2 = aVar3.g;
                                Object[] objArr5 = {list2};
                                ChangeQuickRedirect changeQuickRedirect5 = b.d;
                                if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "2f34c57e468088b7bdd869578d6e5277", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "2f34c57e468088b7bdd869578d6e5277");
                                } else if (com.sankuai.waimai.foundation.utils.b.a(list2)) {
                                    bVar.h.clear();
                                    bVar.h.addAll(list2);
                                }
                                bVar.i = aVar3.h;
                                bVar.e = str2;
                                bVar.f = str3;
                                bVar.g = str4;
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c8be96ea84a4ae976e78e8c6e8f18fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c8be96ea84a4ae976e78e8c6e8f18fb");
            return;
        }
        super.I();
        b bVar = (b) this.g;
        c cVar = ((d) this.n).p;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "5bb401f608e65295583af3417f232d9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "5bb401f608e65295583af3417f232d9e");
            return;
        }
        bVar.j = cVar;
        bVar.a(cVar);
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5dff519c84f0e26acc4b0fa0e0904ab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5dff519c84f0e26acc4b0fa0e0904ab7");
            return;
        }
        super.b(bundle);
        b bVar = (b) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "97d38651ef5ee2de3f95a24dcd8b3289", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "97d38651ef5ee2de3f95a24dcd8b3289");
            return;
        }
        bundle.putString("poi_coupon_view_id", bVar.e);
        bundle.putString("goods_coupon_view_id", bVar.f);
        bundle.putString("sg_item_coupon_view_id", bVar.g);
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b326e6286cfaa4fe4247a8eaf945f4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b326e6286cfaa4fe4247a8eaf945f4e");
            return;
        }
        super.c(bundle);
        b bVar = (b) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "ed268ec01fc42f8846710411f28797ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "ed268ec01fc42f8846710411f28797ba");
            return;
        }
        bVar.e = bundle.getString("poi_coupon_view_id");
        bVar.f = bundle.getString("goods_coupon_view_id");
        bVar.g = bundle.getString("sg_item_coupon_view_id");
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea11150ba88586fa6950852f2e81b55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea11150ba88586fa6950852f2e81b55");
            return;
        }
        super.y();
        if (((b) this.g).a().getVisibility() == 8 || !((b) this.g).f()) {
            return;
        }
        ((b) this.g).e();
        ((b) this.g).g();
    }

    public final String M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aceceea86e2c03aa1665ebaf7d182c0f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aceceea86e2c03aa1665ebaf7d182c0f") : ((b) this.g).f;
    }

    public final String N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3de149e29b66d38d3205d3d16c40f4df", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3de149e29b66d38d3205d3d16c40f4df") : ((b) this.g).e;
    }

    public final String O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1dda084cd6c6818e0278b8e06183d76", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1dda084cd6c6818e0278b8e06183d76") : ((b) this.g).g;
    }

    public final List<com.sankuai.waimai.bussiness.order.confirm.coupon.model.f> P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a8af8e1d25239053faa9b9058350d9b", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a8af8e1d25239053faa9b9058350d9b") : ((b) this.g).h;
    }

    public final CallbackInfo Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49551ecdd43f16a67be8c338c1ddbb89", RobustBitConfig.DEFAULT_VALUE) ? (CallbackInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49551ecdd43f16a67be8c338c1ddbb89") : ((b) this.g).i;
    }
}

package com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.IOrderBusinessService;
import com.sankuai.waimai.business.order.api.submit.model.CollectOrder;
import com.sankuai.waimai.business.order.api.submit.model.DiscountItem;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodParams;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.OrderCouponRequestParams;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.FoodInfoModel;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.root.CallbackInfo;
import com.sankuai.waimai.bussiness.order.confirm.widget.AllowanceDetailDialog;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.PoiAddressParam;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.detailnew.util.d;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public c b;
    public a c;
    public Context d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public boolean j;
    private com.sankuai.waimai.bussiness.order.confirm.a k;

    public b(com.sankuai.waimai.bussiness.order.confirm.a aVar, Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f5d9d0039f8b07c116c0db134eb9415", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f5d9d0039f8b07c116c0db134eb9415");
            return;
        }
        this.e = "0";
        this.f = "0";
        this.g = "0";
        this.h = "0";
        this.i = "-1";
        this.j = true;
        this.k = aVar;
        this.d = context;
        this.c = new a(aVar, context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
        List list;
        double d;
        CollectOrderFoodParams collectOrderFoodParams;
        CollectOrderFoodParams collectOrderFoodParams2;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b99bc3891a71d4a9b5824ecb2b25a30b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b99bc3891a71d4a9b5824ecb2b25a30b");
        } else if (str.equals("init_id_event")) {
            a aVar = this.c;
            Object[] objArr2 = {map};
            ChangeQuickRedirect changeQuickRedirect2 = a.a;
            if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "d69281cfa645250159880b1d9a700ac9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "d69281cfa645250159880b1d9a700ac9");
                return;
            }
            try {
                aVar.e = Boolean.valueOf(String.valueOf(map.get("hasShowDetail"))).booleanValue();
                aVar.f = Boolean.valueOf(String.valueOf(map.get("hasActivityModel"))).booleanValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if (str.equals("show_collect_food_event")) {
            a aVar2 = this.c;
            Object[] objArr3 = {1, Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), null, Double.valueOf(0.0d), map};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "9f5d5f3ebb9398edc213ee7abc6c3242", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "9f5d5f3ebb9398edc213ee7abc6c3242");
                return;
            }
            double a2 = r.a(String.valueOf(map.get("can_use_coupon_price")), 0.0d);
            long a3 = r.a(String.valueOf(map.get("poi_id")), 0L);
            String valueOf = String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
            long a4 = r.a(String.valueOf(map.get("poi_first_cate_id")), 0L);
            if (map != null) {
                aVar2.c.aD.a(new CollectOrderFoodParams(1, 0.0d, a2, 0.0d, 0.0d, a3, valueOf, aVar2.b(map), null, 0.0d, a4));
            }
        } else if (str.equals("add_food_event")) {
            this.c.a(map);
        } else if (str.equals("deliver_collect_event")) {
            a aVar3 = this.c;
            Object[] objArr4 = {map};
            ChangeQuickRedirect changeQuickRedirect4 = a.a;
            if (PatchProxy.isSupport(objArr4, aVar3, changeQuickRedirect4, false, "c52cd321d86085856bb207eb2170d340", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar3, changeQuickRedirect4, false, "c52cd321d86085856bb207eb2170d340");
            } else if (map != null) {
                long a5 = r.a(String.valueOf(map.get("poi_id")), 0L);
                String b = i.b(String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR)));
                long a6 = r.a(String.valueOf(map.get("poi_first_cate_id")), 0L);
                FoodInfoModel.b bVar = (FoodInfoModel.b) d.a().fromJson(d.a().toJson(map.get("shipping_fee_info")), (Class<Object>) FoodInfoModel.b.class);
                aVar3.c.aD.a(new CollectOrderFoodParams(6, a5, b, aVar3.b(map), a6, bVar.c, bVar.d));
            }
        } else if (str.equals("allowance_detail_event")) {
            a aVar4 = this.c;
            Object[] objArr5 = {map};
            ChangeQuickRedirect changeQuickRedirect5 = a.a;
            if (PatchProxy.isSupport(objArr5, aVar4, changeQuickRedirect5, false, "615593b730849856c9aa070c014b22d2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, aVar4, changeQuickRedirect5, false, "615593b730849856c9aa070c014b22d2");
                return;
            }
            try {
                String valueOf2 = String.valueOf(map.get("discount_detail_info"));
                long a7 = r.a(String.valueOf(map.get("poi_id")), 0L);
                String valueOf3 = String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
                DiscountItem.d a8 = DiscountItem.d.a(new JSONObject(valueOf2));
                Object[] objArr6 = {a8, new Long(a7), valueOf3};
                ChangeQuickRedirect changeQuickRedirect6 = a.a;
                if (PatchProxy.isSupport(objArr6, aVar4, changeQuickRedirect6, false, "319157a183a696f59ce420fe83fc441f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, aVar4, changeQuickRedirect6, false, "319157a183a696f59ce420fe83fc441f");
                } else {
                    JudasManualManager.b("b_waimai_ibvccbb5_mc", "c_ykhs39e", aVar4.d).a("price_per_usr", a8.c).a("poi_id", i.a(a7, valueOf3)).a("sku_id", aVar4.a(a8)).a("allowance_amt", a8.d.a).a(aVar4.d).a();
                }
                AllowanceDetailDialog allowanceDetailDialog = new AllowanceDetailDialog(aVar4.d, a8, a7, valueOf3);
                View decorView = allowanceDetailDialog.getWindow().getDecorView();
                decorView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = decorView.getMeasuredHeight();
                int a9 = g.a(aVar4.d, 488.0f);
                int a10 = g.a(aVar4.d, 332.0f);
                if (measuredHeight > a9) {
                    allowanceDetailDialog.getWindow().setLayout(-1, a9);
                } else if (measuredHeight < a10) {
                    allowanceDetailDialog.getWindow().setLayout(-1, a10);
                }
                allowanceDetailDialog.show();
                Object[] objArr7 = {a8, new Long(a7), valueOf3};
                ChangeQuickRedirect changeQuickRedirect7 = a.a;
                if (PatchProxy.isSupport(objArr7, aVar4, changeQuickRedirect7, false, "f328b1af86c9ee8f5ca9d336e240cf68", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, aVar4, changeQuickRedirect7, false, "f328b1af86c9ee8f5ca9d336e240cf68");
                } else {
                    JudasManualManager.c("b_waimai_5fp5qxbp_mv", "c_ykhs39e", aVar4.c).a("price_per_usr", a8.c).a("poi_id", i.a(a7, valueOf3)).a("sku_id", aVar4.a(a8)).a("allowance_amt", a8.d.a).a(aVar4.c).a();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else if (str.equals("discount_collect_event")) {
            a aVar5 = this.c;
            Object[] objArr8 = {4, Double.valueOf(0.0d), Double.valueOf(0.0d), map};
            ChangeQuickRedirect changeQuickRedirect8 = a.a;
            if (PatchProxy.isSupport(objArr8, aVar5, changeQuickRedirect8, false, "f13392d0a665da1ca11b4ceca7d821c5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, aVar5, changeQuickRedirect8, false, "f13392d0a665da1ca11b4ceca7d821c5");
            } else if (map != null) {
                try {
                    double a11 = r.a(String.valueOf(map.get("discount_money")), 0.0d);
                    List arrayList = new ArrayList();
                    if (map.get("stage_price_list") != null) {
                        List fromJsonArray = CollectOrder.DiscountStageInfo.fromJsonArray(new JSONObject(d.a().toJson(map)).optJSONArray("stage_price_list"));
                        list = fromJsonArray;
                        d = ((CollectOrder.DiscountStageInfo) fromJsonArray.get(0)).spreadPrice;
                    } else {
                        list = arrayList;
                        d = 0.0d;
                    }
                    long a12 = r.a(String.valueOf(map.get("poi_id")), 0L);
                    String valueOf4 = String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
                    long a13 = r.a(String.valueOf(map.get("poi_first_cate_id")), 0L);
                    DiscountItem.b bVar2 = map.get("add_on_item_info_preview") != null ? (DiscountItem.b) d.a().fromJson(d.a().toJson(map.get("add_on_item_info_preview")), (Class<Object>) DiscountItem.b.class) : null;
                    if (bVar2 != null) {
                        List<OrderedFood> b2 = aVar5.b(map);
                        Object[] objArr9 = {bVar2, Double.valueOf(0.0d), new Long(a12), valueOf4, b2, new Long(a13)};
                        ChangeQuickRedirect changeQuickRedirect9 = CollectOrderFoodParams.a;
                        if (PatchProxy.isSupport(objArr9, null, changeQuickRedirect9, true, "184bb9fd044dfa23d7400ce33494df88", RobustBitConfig.DEFAULT_VALUE)) {
                            collectOrderFoodParams2 = (CollectOrderFoodParams) PatchProxy.accessDispatch(objArr9, null, changeQuickRedirect9, true, "184bb9fd044dfa23d7400ce33494df88");
                        } else if (bVar2 == null) {
                            collectOrderFoodParams2 = null;
                        } else {
                            CollectOrderFoodParams collectOrderFoodParams3 = new CollectOrderFoodParams();
                            collectOrderFoodParams3.b = 5;
                            collectOrderFoodParams3.o = bVar2.b;
                            collectOrderFoodParams3.c = 0.0d;
                            collectOrderFoodParams3.d = 0.0d;
                            collectOrderFoodParams3.e = 0.0d;
                            collectOrderFoodParams3.f = 0.0d;
                            collectOrderFoodParams3.g = 0.0d;
                            collectOrderFoodParams3.h = a12;
                            collectOrderFoodParams3.i = valueOf4;
                            collectOrderFoodParams3.j = a13;
                            collectOrderFoodParams3.k.clear();
                            if (!com.sankuai.waimai.foundation.utils.b.b(b2)) {
                                collectOrderFoodParams3.k.addAll(b2);
                            }
                            Object[] objArr10 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect10 = DiscountItem.b.a;
                            collectOrderFoodParams3.m = PatchProxy.isSupport(objArr10, bVar2, changeQuickRedirect10, false, "2ea5a22e24ec6580d7735eed9fb43b24", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr10, bVar2, changeQuickRedirect10, false, "2ea5a22e24ec6580d7735eed9fb43b24")).intValue() : Double.valueOf(bVar2.e).intValue();
                            collectOrderFoodParams3.n.clear();
                            if (!com.sankuai.waimai.foundation.utils.b.b(bVar2.d)) {
                                collectOrderFoodParams3.n.addAll(bVar2.d);
                            }
                            collectOrderFoodParams2 = collectOrderFoodParams3;
                        }
                        collectOrderFoodParams = collectOrderFoodParams2;
                    } else {
                        collectOrderFoodParams = list.size() > 0 ? new CollectOrderFoodParams(4, 0.0d, 0.0d, 0.0d, d, a12, valueOf4, aVar5.b(map), list, a11, a13) : null;
                    }
                    if (collectOrderFoodParams == null) {
                        return;
                    }
                    aVar5.c.aD.a(collectOrderFoodParams);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        } else if (str.equals("coupon_collect_event")) {
            a aVar6 = this.c;
            Object[] objArr11 = {2, map};
            ChangeQuickRedirect changeQuickRedirect11 = a.a;
            if (PatchProxy.isSupport(objArr11, aVar6, changeQuickRedirect11, false, "b31e63c5e3305a069455c753770a8644", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr11, aVar6, changeQuickRedirect11, false, "b31e63c5e3305a069455c753770a8644");
                return;
            }
            aVar6.c.aD.a(new CollectOrderFoodParams(2, r.a(String.valueOf(map.get("coupon_price")), 0.0d), r.a(String.valueOf(map.get("can_use_coupon_price")), 0.0d), r.a(String.valueOf(map.get("coupon_discount_price")), 0.0d), r.a(String.valueOf(map.get("spread_money")), 0.0d), r.a(String.valueOf(map.get("poi_id")), 0L), String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR)), aVar6.b(map), null, 0.0d, r.a(String.valueOf(map.get("poi_first_cate_id")), 0L)));
        } else if (str.equals("merchant_collect_event")) {
            a aVar7 = this.c;
            Object[] objArr12 = {3, map};
            ChangeQuickRedirect changeQuickRedirect12 = a.a;
            if (PatchProxy.isSupport(objArr12, aVar7, changeQuickRedirect12, false, "7a979641d41486b3e4b6f58f55e6e41f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, aVar7, changeQuickRedirect12, false, "7a979641d41486b3e4b6f58f55e6e41f");
                return;
            }
            String valueOf5 = String.valueOf(map.get("recommend_coupon_view_id"));
            CollectOrderFoodParams collectOrderFoodParams4 = new CollectOrderFoodParams(3, r.a(String.valueOf(map.get("coupon_price")), 0.0d), r.a(String.valueOf(map.get("can_use_coupon_price")), 0.0d), r.a(String.valueOf(map.get("coupon_discount_price")), 0.0d), r.a(String.valueOf(map.get("spread_money")), 0.0d), r.a(String.valueOf(map.get("poi_id")), 0L), String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR)), aVar7.b(map), null, 0.0d, r.a(String.valueOf(map.get("poi_first_cate_id")), 0L));
            collectOrderFoodParams4.q = valueOf5;
            if (r.a(String.valueOf(map.get("biz_type")), 0) == 2) {
                IOrderBusinessService iOrderBusinessService = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS);
                if (iOrderBusinessService != null) {
                    iOrderBusinessService.showMrnDialog(aVar7.d, collectOrderFoodParams4.q, collectOrderFoodParams4.c, collectOrderFoodParams4.d, collectOrderFoodParams4.e, collectOrderFoodParams4.f, collectOrderFoodParams4.h, collectOrderFoodParams4.i, 6, collectOrderFoodParams4.o, collectOrderFoodParams4.j);
                    return;
                }
                return;
            }
            aVar7.c.aD.a(collectOrderFoodParams4);
        } else if (str.equals("jump_coupon_page_event")) {
            Object[] objArr13 = {map};
            ChangeQuickRedirect changeQuickRedirect13 = a;
            if (PatchProxy.isSupport(objArr13, this, changeQuickRedirect13, false, "4bc99ba88a9974af36c858fc1abd24d6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr13, this, changeQuickRedirect13, false, "4bc99ba88a9974af36c858fc1abd24d6");
                return;
            }
            String valueOf6 = map.get("link_schema") == null ? null : String.valueOf(map.get("link_schema"));
            Object obj = map.get("extra_map");
            Map map2 = (obj == null || !(obj instanceof Map)) ? null : (Map) obj;
            AddressItem addressItem = (AddressItem) d.a().fromJson(d.a().toJson(map.get("address_info")), (Class<Object>) AddressItem.class);
            if (addressItem != null) {
                com.sankuai.waimai.bussiness.order.base.a.a((Activity) this.d, 6, this.e, a(addressItem, map), 1, valueOf6, map2);
            }
        } else if (str.equals("jump_merchant_page_event")) {
            a(map);
        } else if (str.equals("jump_deliver_page_event")) {
            Object[] objArr14 = {map};
            ChangeQuickRedirect changeQuickRedirect14 = a;
            if (PatchProxy.isSupport(objArr14, this, changeQuickRedirect14, false, "11f77f949fbe8c997d9345940aebd5ee", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr14, this, changeQuickRedirect14, false, "11f77f949fbe8c997d9345940aebd5ee");
                return;
            }
            AddressItem addressItem2 = (AddressItem) d.a().fromJson(d.a().toJson(map.get("address_info")), (Class<Object>) AddressItem.class);
            String valueOf7 = map.get("selected_shipping_coupon_view_id") == null ? null : String.valueOf(map.get("selected_shipping_coupon_view_id"));
            Double valueOf8 = Double.valueOf(r.a(String.valueOf(map.get("real_shipping_fee")), 0.0d));
            if (addressItem2 == null || map == null) {
                return;
            }
            com.sankuai.waimai.bussiness.order.base.a.a((Activity) this.d, 13, valueOf7, valueOf8.doubleValue(), c(addressItem2, map), false, this.k.I.a());
        } else if (str.equals("jump_sg_deliver_page_event")) {
            Object[] objArr15 = {map};
            ChangeQuickRedirect changeQuickRedirect15 = a;
            if (PatchProxy.isSupport(objArr15, this, changeQuickRedirect15, false, "054272c82e4543ecc710b396d1f8d6c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr15, this, changeQuickRedirect15, false, "054272c82e4543ecc710b396d1f8d6c1");
            } else if (map != null) {
                String json = d.a().toJson(map.get("address_info"));
                String valueOf9 = map.get("delivery_activity") == null ? "" : String.valueOf(map.get("delivery_activity"));
                AddressItem addressItem3 = (AddressItem) d.a().fromJson(json, (Class<Object>) AddressItem.class);
                String valueOf10 = map.get("selected_shipping_coupon_view_id") == null ? null : String.valueOf(map.get("selected_shipping_coupon_view_id"));
                Double valueOf11 = Double.valueOf(r.a(String.valueOf(map.get("real_shipping_fee")), 0.0d));
                IOrderBusinessService iOrderBusinessService2 = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS);
                if (addressItem3 == null || map == null || iOrderBusinessService2 == null) {
                    return;
                }
                com.sankuai.waimai.bussiness.order.base.a.a((Activity) this.d, 13, valueOf10, valueOf11.doubleValue(), c(addressItem3, map), false, this.k.I.a(), valueOf9, iOrderBusinessService2);
            }
        }
    }

    public final float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee78dd359554093f4a23d349b1d88986", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee78dd359554093f4a23d349b1d88986")).floatValue();
        }
        a aVar = this.c;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "288c524522b4384555f67178f57e96a7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "288c524522b4384555f67178f57e96a7")).floatValue();
        }
        float f = 0.0f;
        for (CouponInfo couponInfo : aVar.b.t.couponInfoList) {
            if (couponInfo == null || couponInfo.type != 0) {
                if (couponInfo != null && couponInfo.type == 1) {
                    f += 35.0f;
                    if (aVar.a(couponInfo)) {
                        f += 35.0f;
                    } else if (!TextUtils.isEmpty(couponInfo.poiCouponUseTip)) {
                        f += 35.0f;
                    }
                    if (aVar.e) {
                        f += 35.0f;
                    }
                } else if (couponInfo != null && couponInfo.type == 2) {
                    f += 35.0f;
                    if (couponInfo != null && !TextUtils.isEmpty(couponInfo.poiCouponUseTip)) {
                        f += 35.0f;
                    }
                }
            } else if (aVar.a(couponInfo)) {
                f += 35.0f;
            } else if (!TextUtils.isEmpty(couponInfo.activityInfo)) {
                f += 35.0f;
            }
        }
        if (aVar.f) {
            f += 60.0f;
        }
        return (aVar.b.t == null || aVar.b.t.remindInfos == null || aVar.b.t.remindInfos.size() <= 0 || aVar.b.t.remindInfos.get(0).behaviorType != 2 || TextUtils.isEmpty(aVar.b.t.remindInfos.get(0).content)) ? f + 100.0f : f + 140.0f;
    }

    public OrderCouponRequestParams a(AddressItem addressItem, Map<String, Object> map) {
        Object[] objArr = {addressItem, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c754b34d0b4c386ee96ffda526b96611", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderCouponRequestParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c754b34d0b4c386ee96ffda526b96611");
        }
        OrderCouponRequestParams orderCouponRequestParams = new OrderCouponRequestParams();
        orderCouponRequestParams.canUseCouponPrice = map == null ? String.valueOf(this.b.t.canUseCouponPrice) : String.valueOf(map.get("can_use_coupon_price"));
        orderCouponRequestParams.phone = addressItem.phone;
        StringBuilder sb = new StringBuilder();
        sb.append(this.k.bl.a().c());
        orderCouponRequestParams.payType = sb.toString();
        orderCouponRequestParams.poiId = map == null ? String.valueOf(this.k.aH_()) : String.valueOf(map.get("poi_id"));
        String aI_ = map == null ? this.k.aI_() : String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
        if (aa.a(aI_)) {
            aI_ = "";
        }
        orderCouponRequestParams.poiIdStr = aI_;
        orderCouponRequestParams.total = map == null ? String.valueOf(this.b.t.total) : String.valueOf(map.get("total"));
        orderCouponRequestParams.originalPrice = map == null ? String.valueOf(this.b.t.originalPrice) : String.valueOf(map.get("original_price"));
        orderCouponRequestParams.orderToken = SubmitOrderManager.getInstance().getToken();
        orderCouponRequestParams.businessType = this.k.aL_();
        orderCouponRequestParams.addrLatitude = addressItem.lat;
        orderCouponRequestParams.addrLongitude = addressItem.lng;
        orderCouponRequestParams.couponPackageSelected = b();
        orderCouponRequestParams.bizLine = map == null ? this.k.I.a() : String.valueOf(map.get("biz_line"));
        List<OrderFoodOutput> list = this.b.t.foodList;
        orderCouponRequestParams.boxTotalPrice = map == null ? String.valueOf(this.b.t.boxTotalPrice) : String.valueOf(map.get("box_total_price"));
        orderCouponRequestParams.cardFoodList = list == null ? "" : d.a().toJson(list);
        List<OrderedFood> b = map == null ? this.b.q.g : this.c.b(map);
        orderCouponRequestParams.productList = com.sankuai.waimai.bussiness.order.crossconfirm.utils.a.b(b);
        orderCouponRequestParams.skuIdArray = com.sankuai.waimai.bussiness.order.crossconfirm.utils.a.a(b);
        orderCouponRequestParams.activityInfoCoupon = map == null ? this.b.p.g : String.valueOf(map.get("activity_info_for_coupon"));
        orderCouponRequestParams.foodList = d.a().toJson(this.b.t.foodList);
        List<Map<String, Object>> n = this.b.n();
        if (!com.sankuai.waimai.foundation.utils.b.b(n)) {
            Iterator<Map<String, Object>> it = n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map<String, Object> next = it.next();
                if ((next.get(DMKeys.KEY_SELECTED) instanceof Boolean) && ((Boolean) next.get(DMKeys.KEY_SELECTED)).booleanValue()) {
                    if (next.get("ap_outer_code") instanceof String) {
                        orderCouponRequestParams.apOuterCode = (String) next.get("ap_outer_code");
                    }
                    if (next.get("ap_card_type") instanceof Long) {
                        orderCouponRequestParams.apCardType = ((Long) next.get("ap_card_type")).longValue();
                    }
                    if (next.get("product_id") instanceof String) {
                        orderCouponRequestParams.apProductId = (String) next.get("product_id");
                    }
                }
            }
            orderCouponRequestParams.apParams = d.a().toJson(n);
        }
        orderCouponRequestParams.allowanceAllianceScenes = this.k.aX.a();
        orderCouponRequestParams.adActivityFlag = this.k.aY.a();
        AddressItem addressItem2 = (AddressItem) d.a().fromJson(d.a().toJson(com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("submit_address")), (Class<Object>) AddressItem.class);
        if (addressItem2 != null) {
            orderCouponRequestParams.poiAddressParam = new PoiAddressParam(addressItem2);
        }
        if (map != null) {
            CallbackInfo callbackInfo = (CallbackInfo) d.a().fromJson(d.a().toJson(map.get("callback_info")), (Class<Object>) CallbackInfo.class);
            orderCouponRequestParams.previewOrderCallbackInfo = callbackInfo == null ? "" : callbackInfo.previewOrderCallbackInfo;
        } else {
            orderCouponRequestParams.previewOrderCallbackInfo = this.k.y.a().b == null ? "" : this.k.y.a().b.previewOrderCallbackInfo;
        }
        return orderCouponRequestParams;
    }

    private boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d01af37f0c6727e593bc505db9308263", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d01af37f0c6727e593bc505db9308263")).booleanValue();
        }
        List<Map> arrayList = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("product_select_list") != null ? (List) com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d.c.get("product_select_list") : new ArrayList();
        if (arrayList == null) {
            return false;
        }
        for (Map map : arrayList) {
            if ((map.get(DMKeys.KEY_SELECTED) instanceof Boolean) && ((Boolean) map.get(DMKeys.KEY_SELECTED)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    private List<Map<String, Object>> c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d118069bd9e092a7429aabf08f38199", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d118069bd9e092a7429aabf08f38199") : com.sankuai.waimai.bussiness.order.confirm.helper.g.a().b();
    }

    private OrderCouponRequestParams b(AddressItem addressItem, Map<String, Object> map) {
        Object[] objArr = {addressItem, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "575693560a550e39fc79cec657a83610", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderCouponRequestParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "575693560a550e39fc79cec657a83610");
        }
        OrderCouponRequestParams orderCouponRequestParams = new OrderCouponRequestParams();
        orderCouponRequestParams.canUseCouponPrice = String.valueOf(map.get("can_use_coupon_price"));
        orderCouponRequestParams.phone = addressItem.phone;
        StringBuilder sb = new StringBuilder();
        sb.append(this.k.bl.a().c());
        orderCouponRequestParams.payType = sb.toString();
        orderCouponRequestParams.poiId = String.valueOf(map.get("poi_id"));
        String valueOf = String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
        if (aa.a(valueOf)) {
            valueOf = this.k.aI_();
        }
        orderCouponRequestParams.poiIdStr = valueOf;
        orderCouponRequestParams.total = String.valueOf(map.get("total"));
        orderCouponRequestParams.originalPrice = String.valueOf(map.get("original_price"));
        orderCouponRequestParams.orderToken = SubmitOrderManager.getInstance().getToken();
        orderCouponRequestParams.businessType = this.k.aL_();
        orderCouponRequestParams.addrLatitude = addressItem.lat;
        orderCouponRequestParams.addrLongitude = addressItem.lng;
        List<OrderedFood> b = this.c.b(map);
        orderCouponRequestParams.productList = com.sankuai.waimai.bussiness.order.crossconfirm.utils.a.b(b);
        orderCouponRequestParams.productsWithTag = com.sankuai.waimai.bussiness.order.crossconfirm.utils.a.c(b);
        orderCouponRequestParams.skuIdArray = com.sankuai.waimai.bussiness.order.crossconfirm.utils.a.a(b);
        orderCouponRequestParams.activityInfoCoupon = String.valueOf(map.get("activity_info_for_coupon"));
        if (c() != null) {
            orderCouponRequestParams.apParams = d.a().toJson(c());
        }
        if (addressItem != null) {
            orderCouponRequestParams.poiAddressParam = new PoiAddressParam(addressItem);
        }
        CallbackInfo callbackInfo = (CallbackInfo) d.a().fromJson(d.a().toJson(map.get("callback_info")), (Class<Object>) CallbackInfo.class);
        orderCouponRequestParams.previewOrderCallbackInfo = callbackInfo == null ? "" : callbackInfo.previewOrderCallbackInfo;
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = new JSONObject(d.a().toJson(orderCouponRequestParams)).optJSONArray("coupon_info_list");
            for (int i = 0; i < optJSONArray.length(); i++) {
                CouponInfo couponInfo = (CouponInfo) d.a().fromJson(optJSONArray.optJSONObject(i).toString(), (Class<Object>) CouponInfo.class);
                if (addressItem != null) {
                    arrayList.add(couponInfo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (com.sankuai.waimai.foundation.utils.b.a(arrayList)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                CouponInfo couponInfo2 = (CouponInfo) com.sankuai.waimai.foundation.utils.b.a(arrayList, i2);
                if (couponInfo2 != null && couponInfo2.type == 1 && com.sankuai.waimai.foundation.utils.b.a(couponInfo2.selectedCoupons)) {
                    orderCouponRequestParams.selectedCoupons.addAll(couponInfo2.selectedCoupons);
                }
            }
        }
        orderCouponRequestParams.extendsInfo = this.b.r.i;
        return orderCouponRequestParams;
    }

    private void a(@Nullable Map<String, Object> map) {
        String recommendCouponInfo;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c10b9dd88db769f9325992b19a4f808", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c10b9dd88db769f9325992b19a4f808");
            return;
        }
        String json = d.a().toJson(map.get("address_info"));
        Object obj = map.get("extra_map");
        Map map2 = (obj == null || !(obj instanceof Map)) ? null : (Map) obj;
        AddressItem addressItem = (AddressItem) d.a().fromJson(json, (Class<Object>) AddressItem.class);
        String str = "";
        if (addressItem == null || map == null) {
            return;
        }
        OrderCouponRequestParams b = b(addressItem, map);
        int a2 = r.a(String.valueOf(map.get("biz_type")), 0);
        int a3 = r.a(String.valueOf(map.get("show_style")), 0);
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray optJSONArray = new JSONObject(d.a().toJson(map)).optJSONArray("coupon_info_list");
            for (int i = 0; i < optJSONArray.length(); i++) {
                CouponInfo couponInfo = (CouponInfo) d.a().fromJson(optJSONArray.optJSONObject(i).toString(), (Class<Object>) CouponInfo.class);
                if (addressItem != null) {
                    arrayList.add(couponInfo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (com.sankuai.waimai.foundation.utils.b.a(arrayList)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                CouponInfo couponInfo2 = (CouponInfo) com.sankuai.waimai.foundation.utils.b.a(arrayList, i2);
                if (couponInfo2 != null && couponInfo2.type == 1 && com.sankuai.waimai.foundation.utils.b.a(couponInfo2.selectedCoupons)) {
                    b.selectedCoupons.addAll(couponInfo2.selectedCoupons);
                }
                if (couponInfo2 != null && couponInfo2.type == 1 && !aa.a(couponInfo2.linkSchema)) {
                    str = couponInfo2.linkSchema;
                }
            }
        }
        String str2 = str;
        b.extendsInfo = this.b.r.i;
        String str3 = b.poiId;
        Object[] objArr2 = {str3};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "727685379f284e05966cc6c8a2c8b541", RobustBitConfig.DEFAULT_VALUE)) {
            recommendCouponInfo = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "727685379f284e05966cc6c8a2c8b541");
        } else {
            IOrderBusinessService iOrderBusinessService = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS);
            recommendCouponInfo = (iOrderBusinessService == null || aa.a(str3)) ? null : iOrderBusinessService.getRecommendCouponInfo(str3);
        }
        Activity activity = (Activity) this.d;
        String str4 = this.f;
        String str5 = this.g;
        String str6 = this.h;
        Object[] objArr3 = {activity, 7, str4, str5, str6, b, 2, Integer.valueOf(a2), str2, recommendCouponInfo, Integer.valueOf(a3), map2};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.base.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "a61ea4172546c8ddda3ac838a1fc98f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "a61ea4172546c8ddda3ac838a1fc98f6");
            return;
        }
        Bundle bundle = new Bundle();
        try {
            bundle.putInt("type", 2);
            bundle.putString("poicoupon_view_id", str4);
            bundle.putString("goods_coupon_view_id", str5);
            bundle.putString("sg_item_coupon_view_id", str6);
            bundle.putString("orderCouponRequestParams", k.a().toJson(b));
            bundle.putString("poiID", b.poiId);
            bundle.putString(FoodDetailNetWorkPreLoader.URI_POI_STR, b.poiIdStr);
            bundle.putString("pickedPoiCouponViewID", str4);
            bundle.putString("pickedGoodsCouponViewID", str5);
            bundle.putString("pickedSgGoodsCouponViewID", str6);
            bundle.putString("phone", b.phone);
            bundle.putString("payType", b.payType);
            bundle.putString("token", b.orderToken);
            bundle.putString("total", b.total);
            bundle.putString("originalPrice", b.originalPrice);
            bundle.putString("canUseCouponPrice", b.canUseCouponPrice);
            bundle.putInt("businessType", b.businessType);
            bundle.putString("activityInfoForCoupon", b.activityInfoCoupon);
            String json2 = k.a().toJson(b.productList);
            String arrays = Arrays.toString(b.skuIdArray);
            bundle.putString("productArray", json2);
            bundle.putString("skuIDArray", arrays);
            bundle.putString("productsWithTag", k.a().toJson(b.productsWithTag));
            bundle.putInt("addr_latitude", b.addrLatitude);
            bundle.putInt("addr_longitude", b.addrLongitude);
            bundle.putInt("biz_type", a2);
            bundle.putString("callback_info", k.a().toJson(b.extendsInfo));
            bundle.putString("selected_coupons", k.a().toJson(b.selectedCoupons));
            bundle.putString("recommend_coupon_info", recommendCouponInfo);
            bundle.putInt("V784_placeorderpage", a3);
            bundle.putString("recipient_name", b.poiAddressParam.recipientName);
            bundle.putString("recipient_address", b.poiAddressParam.recipientAddress);
            if (!TextUtils.isEmpty(b.apParams)) {
                bundle.putString("ap_params", b.apParams);
            }
            JSONObject jSONObject = com.sankuai.waimai.bussiness.order.base.utils.g.a().b;
            if (jSONObject != null) {
                if (!TextUtils.isEmpty(b.apParams)) {
                    jSONObject.put("ap_params", b.apParams);
                }
                if (!TextUtils.isEmpty(b.payType)) {
                    jSONObject.put("payment_type", b.payType);
                }
                if (!TextUtils.isEmpty(b.poiAddressParam.recipientPhone)) {
                    jSONObject.put("recipient_phone", b.poiAddressParam.recipientPhone);
                }
                bundle.putString("orderJsonString", jSONObject.toString());
            }
            bundle.putString("preview_order_callback_info", b.previewOrderCallbackInfo == null ? "" : b.previewOrderCallbackInfo);
            if (map2 != null && !map2.isEmpty()) {
                com.sankuai.waimai.bussiness.order.base.a.a(map2, bundle);
            }
        } catch (Exception e2) {
            com.sankuai.waimai.foundation.utils.log.a.e("ConfirmOrderHelper", e2.toString(), new Object[0]);
        }
        if (!aa.a(str2)) {
            com.sankuai.waimai.foundation.router.a.a(activity, str2, bundle, 7);
        } else if (com.sankuai.waimai.foundation.core.a.d()) {
            com.sankuai.waimai.foundation.router.a.a(activity, "wm_router://page/mrn?mrn_biz=waimai&mrn_entry=coupon-select&mrn_component=coupon-select", bundle, 7);
        } else if (com.sankuai.waimai.foundation.core.a.e()) {
            com.sankuai.waimai.foundation.router.a.a(activity, "imeituan://www.meituan.com/takeout/selectcoupon", bundle, 7);
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            com.sankuai.waimai.foundation.router.a.a(activity, "dianping://waimai.dianping.com/takeout/selectcoupon", bundle, 7);
        }
    }

    private OrderCouponRequestParams c(AddressItem addressItem, Map<String, Object> map) {
        Object[] objArr = {addressItem, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7d722d192774c4a3705ef34496b94b2", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderCouponRequestParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7d722d192774c4a3705ef34496b94b2");
        }
        OrderCouponRequestParams orderCouponRequestParams = new OrderCouponRequestParams();
        orderCouponRequestParams.canUseCouponPrice = String.valueOf(map.get("can_use_coupon_price"));
        orderCouponRequestParams.phone = addressItem.phone;
        StringBuilder sb = new StringBuilder();
        sb.append(this.k.bl.a().c());
        orderCouponRequestParams.payType = sb.toString();
        orderCouponRequestParams.poiId = String.valueOf(map.get("poi_id"));
        String valueOf = String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
        if (aa.a(valueOf)) {
            valueOf = this.k.aI_();
        }
        orderCouponRequestParams.poiIdStr = valueOf;
        orderCouponRequestParams.total = String.valueOf(map.get("total"));
        orderCouponRequestParams.originalPrice = String.valueOf(map.get("original_price"));
        orderCouponRequestParams.orderToken = SubmitOrderManager.getInstance().getToken();
        orderCouponRequestParams.businessType = this.k.aL_();
        orderCouponRequestParams.addrLatitude = addressItem.lat;
        orderCouponRequestParams.addrLongitude = addressItem.lng;
        List<OrderedFood> b = this.c.b(map);
        orderCouponRequestParams.productList = com.sankuai.waimai.bussiness.order.crossconfirm.utils.a.b(b);
        orderCouponRequestParams.skuIdArray = com.sankuai.waimai.bussiness.order.crossconfirm.utils.a.a(b);
        orderCouponRequestParams.activityInfoCoupon = String.valueOf(map.get("activity_info_for_coupon"));
        return orderCouponRequestParams;
    }
}

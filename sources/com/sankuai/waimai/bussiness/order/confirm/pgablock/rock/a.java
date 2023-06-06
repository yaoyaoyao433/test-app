package com.sankuai.waimai.bussiness.order.confirm.pgablock.rock;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.waimai.business.order.api.submit.model.ExpInfo;
import com.sankuai.waimai.business.order.submit.model.CautionInfo;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.business.order.submit.model.FieldInfo;
import com.sankuai.waimai.business.order.submit.model.OrderDeliveryTipArea;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.base.params.a;
import com.sankuai.waimai.bussiness.order.base.utils.h;
import com.sankuai.waimai.bussiness.order.confirm.model.PhoneInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.DeliveryInfo;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.ExtendInfoModel;
import com.sankuai.waimai.bussiness.order.confirm.remark.RemarkInfoResponse;
import com.sankuai.waimai.bussiness.order.confirm.service.OrderRemarkService;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.param.OrderFoodInput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.CallbackInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.domain.core.location.PhoneCodeOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.bussiness.order.base.mach.c {
    public static ChangeQuickRedirect c;
    protected com.sankuai.waimai.bussiness.order.confirm.helper.f d;
    Context e;
    com.sankuai.waimai.bussiness.order.confirm.a f;
    @NonNull
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.c g;
    @NonNull
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.f h;
    @NonNull
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.e i;
    @NonNull
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.b j;
    @NonNull
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.quickpayment.rock.b k;
    @NonNull
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.b l;
    @NonNull
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.timeinsurance.rock.a m;
    @NonNull
    public com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a n;
    private m o;

    public a(Context context, com.sankuai.waimai.bussiness.order.confirm.a aVar, com.sankuai.waimai.bussiness.order.confirm.helper.f fVar) {
        super(context);
        Object[] objArr = {context, aVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f91afdaf0d7e29457ab6983b83730ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f91afdaf0d7e29457ab6983b83730ee");
            return;
        }
        this.e = context;
        this.f = aVar;
        this.d = fVar;
        this.g = new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.c(this.e, this.f, new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.b() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.b
            public final void a(int i, boolean z, boolean z2) {
                Object[] objArr2 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e539ef5da0e179ba4df4a165d17ac7cd", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e539ef5da0e179ba4df4a165d17ac7cd");
                } else {
                    a.this.f.X.a((com.meituan.android.cube.pga.common.b<com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c>) new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c(i, z, z2));
                }
            }
        });
        this.h = new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.f(this.e, this.f, new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.b() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.b
            public final void a(int i, boolean z, boolean z2) {
                Object[] objArr2 = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "51b89a9c99a52d2f244a5d0b1f226a6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "51b89a9c99a52d2f244a5d0b1f226a6c");
                } else {
                    a.this.f.X.a((com.meituan.android.cube.pga.common.b<com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c>) new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.c(i, z, z2));
                }
            }
        });
        this.i = new com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock.e();
        this.j = new com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.b(this.e, aVar);
        this.k = new com.sankuai.waimai.bussiness.order.confirm.pgablock.quickpayment.rock.b(this.e, this.d, new com.sankuai.waimai.bussiness.order.confirm.pgablock.quickpayment.rock.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.quickpayment.rock.a
            public final void a(boolean z) {
                Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cc800ae0960d39cd34a01f64cf674995", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cc800ae0960d39cd34a01f64cf674995");
                } else if (z) {
                    a.this.f.aK.a((com.meituan.android.cube.pga.common.b<String>) a.this.e.getString(R.string.quick_payment_string));
                } else {
                    a.this.f.aJ.a();
                }
            }
        });
        this.l = new com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.b(this.f, this.e);
        this.m = new com.sankuai.waimai.bussiness.order.confirm.pgablock.timeinsurance.rock.a();
        this.n = new com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a(this.e, this.f, new com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.c() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "41a7e4611eb17764fdeef777d69b9b45", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "41a7e4611eb17764fdeef777d69b9b45");
                } else {
                    a.this.f.aa.a();
                }
            }
        });
    }

    public final void a(m mVar) {
        boolean z;
        boolean z2;
        int i;
        String str;
        com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.f fVar;
        PhoneCodeOption phoneCodeOption;
        PhoneInfo phoneInfo;
        Map map;
        int i2;
        String str2;
        Object[] objArr = {mVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67ac6c917ff86e90a975c2f9f02d0806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67ac6c917ff86e90a975c2f9f02d0806");
            return;
        }
        this.o = mVar;
        Map<String, Object> map2 = this.o.b;
        long a = r.a(String.valueOf(map2.get("wm_poi_id")), 0L);
        String valueOf = String.valueOf(map2.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
        if (aa.a(valueOf)) {
            valueOf = "";
        }
        String str3 = valueOf;
        com.sankuai.waimai.platform.domain.core.poi.b.a(a, str3);
        com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.c cVar = new com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.c();
        cVar.b(this.o.a("wm_confirm_order_food_list_info_mach"));
        try {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.b bVar = this.l;
            Object[] objArr2 = {cVar};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "fcf7c5b5fe7519aa073d192e471e9e0f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "fcf7c5b5fe7519aa073d192e471e9e0f");
            } else {
                bVar.b = cVar;
                bVar.c.b = bVar.b;
                d.c("is_delivery_text", TextUtils.isEmpty(bVar.b.s.g) ? "0" : "1");
                d.c("shipping_fee_adjust_type", bVar.b.s.h != null ? String.valueOf(bVar.b.s.h.c) : "-1");
                d.c("is_prescription", Integer.toString(bVar.b.q.e));
                d.c("original_delivery_charges", Double.valueOf(bVar.b.t.shippingFee));
                if (bVar.b.t.shippingActivityPreferential != null) {
                    d.c("delivery_charges", Double.valueOf(bVar.b.t.shippingActivityPreferential.b));
                } else {
                    d.c("delivery_charges", Double.valueOf(bVar.b.t.realShippingFee));
                }
                d.c("original_packing_fee", Double.valueOf(bVar.b.t.boxTotalPrice));
                if (bVar.b.t.boxActivityPreferential != null) {
                    d.c("packing_fee", Double.valueOf(bVar.b.t.boxActivityPreferential.b));
                } else {
                    d.c("packing_fee", Double.valueOf(bVar.b.t.boxTotalPrice));
                }
                d.c("total_discount", Double.valueOf(bVar.b.t.totalDiscountPrice));
                d.c("total_amount", Double.valueOf(bVar.b.t.actualPayTotal));
                d.c("delivery_type", Integer.valueOf(bVar.b.t.deliveryType));
                d.d("is_delivery_text", TextUtils.isEmpty(bVar.b.s.g) ? "0" : "1");
                d.d("shipping_fee_adjust_type", bVar.b.s.h != null ? String.valueOf(bVar.b.s.h.c) : "-1");
                List<OrderFoodOutput> list = bVar.b.t.foodList;
                Object[] objArr3 = {list};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "028f7431fa52ba459e76331e28a2b8a0", RobustBitConfig.DEFAULT_VALUE)) {
                    i2 = ((Integer) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "028f7431fa52ba459e76331e28a2b8a0")).intValue();
                } else {
                    if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
                        for (OrderFoodOutput orderFoodOutput : list) {
                            if (orderFoodOutput != null && orderFoodOutput.getSeckill() == 1) {
                                i2 = 1;
                                break;
                            }
                        }
                    }
                    i2 = 0;
                }
                d.d("seckill_act", Integer.valueOf(i2));
                d.a("shipping_fee", Double.valueOf(bVar.b.s.e));
                com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.c cVar2 = bVar.b;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.c.o;
                if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "09e5ab460404fd6410035e0b002ac527", RobustBitConfig.DEFAULT_VALUE)) {
                    str2 = (String) PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "09e5ab460404fd6410035e0b002ac527");
                } else {
                    if (cVar2.p.e != null) {
                        for (CouponInfo couponInfo : cVar2.p.e) {
                            if (couponInfo.type == 0) {
                                str2 = couponInfo.statusTip;
                                break;
                            }
                        }
                    }
                    str2 = null;
                }
                d.b("intelligent_doc", str2);
                d.a("food_list", bVar.b.q.g);
                d.a("food_output_list", bVar.b.t.foodList);
                List arrayList = bVar.b.p.e != null ? bVar.b.p.e : new ArrayList();
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    CouponInfo couponInfo2 = (CouponInfo) arrayList.get(i3);
                    if (couponInfo2 != null && couponInfo2.type == 0) {
                        bVar.e = couponInfo2.selectedCouponViewId;
                        com.sankuai.waimai.bussiness.order.confirm.cache.b.a().a(couponInfo2.selectedCouponViewId);
                    } else if (couponInfo2 != null && couponInfo2.type == 1) {
                        bVar.f = couponInfo2.selectedCouponViewId;
                        bVar.g = couponInfo2.selectedGoodsCouponViewId;
                        bVar.h = couponInfo2.selectedSgGoodsCouponViewId;
                        d.b(false, false, "selected_coupons", couponInfo2.selectedCoupons);
                    } else if (couponInfo2 != null && couponInfo2.type == 2) {
                        bVar.i = couponInfo2.selectedDeliveryCouponViewId;
                    } else if (couponInfo2 != null && couponInfo2.type == 3) {
                        bVar.e = couponInfo2.selectedCouponViewId;
                        bVar.f = couponInfo2.selectedPoiCouponViewId;
                        bVar.g = couponInfo2.selectedGoodsCouponViewId;
                    }
                }
                if (bVar.b != null && bVar.b.r != null && bVar.b.r.i != null) {
                    d.b(false, false, "callback_info", bVar.b.r.i);
                }
                if (bVar.b.t.shippingFeeInfo != null && !TextUtils.isEmpty(bVar.b.t.shippingFeeInfo.e)) {
                    bVar.i = bVar.b.t.shippingFeeInfo.e;
                }
                d.b(false, false, "coupon_view_id", bVar.e);
                d.b(false, false, "goods_coupon_view_id", bVar.g);
                d.b(false, false, "shipping_coupon_view_id", bVar.i);
                d.b(false, false, "poicoupon_view_id", bVar.f);
                d.b(false, false, "sg_item_coupon_view_id", bVar.h);
                d.b(false, false, "original_price", Double.valueOf(bVar.b.t.originalPrice));
                ArrayList arrayList2 = new ArrayList();
                for (OrderFoodOutput orderFoodOutput2 : bVar.b.t.foodList) {
                    if (orderFoodOutput2 != null) {
                        arrayList2.add(new OrderFoodInput(orderFoodOutput2));
                    }
                }
                d.b(false, false, "foodlist", arrayList2);
                d.b(false, false, "original_price", Double.valueOf(bVar.b.t.originalPrice));
                d.b(false, false, "poi_first_cate_id", Long.valueOf(bVar.b.t.poiFirstCateId));
                if (com.sankuai.waimai.bussiness.order.confirm.helper.g.a().b() != null && com.sankuai.waimai.bussiness.order.confirm.helper.g.a().b().size() > 0 && bVar.j) {
                    bVar.j = false;
                    d.b(false, false, "ap_params", com.sankuai.waimai.bussiness.order.confirm.helper.g.a().b());
                }
            }
        } catch (Exception unused) {
        }
        boolean z3 = !this.o.b("wm_confirm_order_self_delivery").isEmpty();
        DeliveryInfo deliveryInfo = z3 ? (DeliveryInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.o.a("wm_confirm_order_self_delivery")), (Class<Object>) DeliveryInfo.class) : this.o.b("wm_order_status_confirm_deliverytime").isEmpty() ^ true ? (DeliveryInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.o.a("wm_order_status_confirm_deliverytime")), (Class<Object>) DeliveryInfo.class) : (DeliveryInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.o.a("wm_confirm_order_mt_delivery")), (Class<Object>) DeliveryInfo.class);
        a(deliveryInfo, map2);
        d.c("city_location_id", map2.get("poi_city_location_id"));
        if (z3) {
            this.h.a(deliveryInfo);
        } else {
            try {
                this.g.a(deliveryInfo);
            } catch (Exception unused2) {
            }
        }
        if (deliveryInfo.stageShippingInfo != null && deliveryInfo.stageShippingInfo.c != null && deliveryInfo.stageShippingInfo.c.size() > 0) {
            this.i.a(deliveryInfo);
        }
        if (!this.o.b("wm_confirm_order_food_flower_cake").isEmpty()) {
            final com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.b bVar2 = this.j;
            Map<String, Object> b = this.o.b("wm_confirm_order_food_flower_cake");
            Object[] objArr5 = {b};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.f.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "3473142f7edc5cab8715df8938415581", RobustBitConfig.DEFAULT_VALUE)) {
                fVar = (com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.f) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "3473142f7edc5cab8715df8938415581");
            } else {
                com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.f fVar2 = new com.sankuai.waimai.bussiness.order.crossconfirm.block.purchaserinfo.f();
                fVar2.c = NumberUtils.parseLong(String.valueOf(b.get("wm_poi_id")), 0L);
                fVar2.g = (FieldInfo) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(b.get("flower_cake_field")), (Class<Object>) FieldInfo.class);
                fVar2.f = (FieldInfo) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(b.get("phone_field")), (Class<Object>) FieldInfo.class);
                fVar2.e = NumberUtils.parseInt(String.valueOf(b.get("template_type")), 0);
                fVar = fVar2;
            }
            Object[] objArr6 = {fVar};
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.b.a;
            if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect6, false, "2f1a227337df106e38cffc0f4fc9fcbe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect6, false, "2f1a227337df106e38cffc0f4fc9fcbe");
            } else if (fVar != null) {
                if (fVar.f != null) {
                    fVar.f.initValues();
                    bVar2.c = fVar.f.mPhoneCodeOptions;
                    String[] strArr = fVar.f.defaultValues;
                    if (strArr != null && strArr.length != 0 && bVar2.b && !TextUtils.isEmpty(strArr[0])) {
                        if (fVar.e == 1) {
                            Object[] objArr7 = {0, fVar};
                            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.b.a;
                            String str4 = PatchProxy.isSupport(objArr7, bVar2, changeQuickRedirect7, false, "b6bc7bef444146205d09527cf329ef18", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr7, bVar2, changeQuickRedirect7, false, "b6bc7bef444146205d09527cf329ef18") : (fVar.f.defaultValues == null || fVar.f.defaultValues.length <= 0 || fVar.f.defaultValues.length <= 0) ? "" : fVar.f.defaultValues[0];
                            Object[] objArr8 = {str4};
                            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.b.a;
                            final String str5 = PatchProxy.isSupport(objArr8, bVar2, changeQuickRedirect8, false, "c6340ff66ee4c68a03c59add0be9b10c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr8, bVar2, changeQuickRedirect8, false, "c6340ff66ee4c68a03c59add0be9b10c") : (TextUtils.isEmpty(str4) || !str4.contains(CommonConstant.Symbol.UNDERLINE)) ? "86" : str4.split(CommonConstant.Symbol.UNDERLINE)[0];
                            Object[] objArr9 = {str5};
                            ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.b.a;
                            if (PatchProxy.isSupport(objArr9, bVar2, changeQuickRedirect9, false, "3eba1c965f8ef5a4ec3b3c5a53e9bff5", RobustBitConfig.DEFAULT_VALUE)) {
                                phoneCodeOption = (PhoneCodeOption) PatchProxy.accessDispatch(objArr9, bVar2, changeQuickRedirect9, false, "3eba1c965f8ef5a4ec3b3c5a53e9bff5");
                            } else {
                                PhoneCodeOption phoneCodeOption2 = new PhoneCodeOption() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.b.1
                                    {
                                        this.code = TextUtils.isEmpty(str5) ? "86" : str5;
                                        this.ValidDigit = 11;
                                    }
                                };
                                phoneCodeOption = (bVar2.c == null || bVar2.c.size() == 0 || !bVar2.c.contains(phoneCodeOption2)) ? phoneCodeOption2 : bVar2.c.get(bVar2.c.indexOf(phoneCodeOption2));
                            }
                            bVar2.e = phoneCodeOption;
                            String str6 = strArr[0];
                            Object[] objArr10 = {str6};
                            ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.b.a;
                            if (PatchProxy.isSupport(objArr10, bVar2, changeQuickRedirect10, false, "6ff601b3ef4f2716aa59701bbf57275a", RobustBitConfig.DEFAULT_VALUE)) {
                                str6 = (String) PatchProxy.accessDispatch(objArr10, bVar2, changeQuickRedirect10, false, "6ff601b3ef4f2716aa59701bbf57275a");
                            } else if (!TextUtils.isEmpty(str6) && str6.contains(CommonConstant.Symbol.UNDERLINE)) {
                                str6 = str6.split(CommonConstant.Symbol.UNDERLINE)[1];
                            }
                            bVar2.f = str6;
                            PhoneCodeOption phoneCodeOption3 = bVar2.e;
                            String str7 = bVar2.f;
                            Object[] objArr11 = {phoneCodeOption3, str7};
                            ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.b.a;
                            if (PatchProxy.isSupport(objArr11, bVar2, changeQuickRedirect11, false, "10bf2e3e9f10cd73038bdaf068c3f249", RobustBitConfig.DEFAULT_VALUE)) {
                                phoneInfo = (PhoneInfo) PatchProxy.accessDispatch(objArr11, bVar2, changeQuickRedirect11, false, "10bf2e3e9f10cd73038bdaf068c3f249");
                            } else {
                                PhoneInfo phoneInfo2 = new PhoneInfo();
                                phoneInfo2.code = phoneCodeOption3 == null ? "86" : phoneCodeOption3.code;
                                phoneInfo2.phone = str7;
                                phoneInfo2.valid_digit = phoneCodeOption3 == null ? 11 : phoneCodeOption3.ValidDigit;
                                phoneInfo = phoneInfo2;
                            }
                            d.b(false, false, "booking_phone", phoneInfo.toString());
                            PhoneCodeOption phoneCodeOption4 = bVar2.e;
                            String str8 = bVar2.f;
                            Object[] objArr12 = {phoneCodeOption4, str8};
                            ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.bussiness.order.confirm.pgablock.purchaseinfo.rock.b.a;
                            if (PatchProxy.isSupport(objArr12, bVar2, changeQuickRedirect12, false, "b3563fe1b2912c4cec8b73c2d4ad1aea", RobustBitConfig.DEFAULT_VALUE)) {
                                map = (Map) PatchProxy.accessDispatch(objArr12, bVar2, changeQuickRedirect12, false, "b3563fe1b2912c4cec8b73c2d4ad1aea");
                            } else {
                                HashMap hashMap = new HashMap();
                                hashMap.put("code", phoneCodeOption4 == null ? "86" : phoneCodeOption4.code);
                                hashMap.put("phone", str8);
                                hashMap.put("valid_digit", Integer.valueOf(phoneCodeOption4 != null ? phoneCodeOption4.ValidDigit : 11));
                                map = hashMap;
                            }
                            d.a("booking_phone", map);
                        } else {
                            d.b(false, false, "booking_phone", "");
                        }
                    }
                }
                bVar2.b = false;
            }
        }
        this.k.a((com.sankuai.waimai.bussiness.order.confirm.pgablock.quickpayment.a) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(this.o.a("wm_confirm_order_quick_payment")), (Class<Object>) com.sankuai.waimai.bussiness.order.confirm.pgablock.quickpayment.a.class), a, str3);
        ArrayList arrayList3 = new ArrayList();
        if (map2.get("exp_infos") != null) {
            List list2 = (List) map2.get("exp_infos");
            for (int i4 = 0; i4 < list2.size(); i4++) {
                arrayList3.add((ExpInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(list2.get(i4)), (Class<Object>) ExpInfo.class));
            }
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.timeinsurance.rock.b bVar3 = new com.sankuai.waimai.bussiness.order.confirm.pgablock.timeinsurance.rock.b(this.o.b("wm_confirm_order_time_insurance"));
        com.sankuai.waimai.bussiness.order.confirm.pgablock.timeinsurance.rock.a aVar = this.m;
        Object[] objArr13 = {bVar3, arrayList3};
        ChangeQuickRedirect changeQuickRedirect13 = com.sankuai.waimai.bussiness.order.confirm.pgablock.timeinsurance.rock.a.a;
        if (PatchProxy.isSupport(objArr13, aVar, changeQuickRedirect13, false, "e02ed38383f01dfa32ec39921738d625", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr13, aVar, changeQuickRedirect13, false, "e02ed38383f01dfa32ec39921738d625");
        } else {
            if (bVar3.a == null || bVar3.a.products == null) {
                d.d("giftType", -1);
                d.d("choose_zhunshibao", 0);
            } else {
                d.a(false, false, "gift_insurance", Integer.valueOf(bVar3.a.products[0].b.b), true);
                d.a(false, false, "insurance_selected", Boolean.valueOf(bVar3.a.products[0].a), true);
                d.d("giftType", Integer.valueOf(bVar3.a.products[0].b.b));
                d.d("free_insurance_type", Integer.valueOf(bVar3.a.products[0].b.a));
                d.d("choose_zhunshibao", Boolean.valueOf(bVar3.a.products[0].a));
            }
            OrderDeliveryTipArea orderDeliveryTipArea = (OrderDeliveryTipArea) com.sankuai.waimai.foundation.location.v2.d.a().fromJson(com.sankuai.waimai.foundation.location.v2.d.a().toJson(d.c.get("delivery_tip_area")), (Class<Object>) OrderDeliveryTipArea.class);
            int i5 = orderDeliveryTipArea != null ? orderDeliveryTipArea.orderDeliveryType : 0;
            int i6 = (bVar3.a == null || bVar3.a.products == null) ? 0 : bVar3.a.products[0].b.a;
            Map<Integer, String> convertToMap = ExpInfo.convertToMap(arrayList3);
            if (convertToMap == null || !convertToMap.containsKey(1)) {
                z = false;
            } else {
                if (i5 == 0) {
                    i5 = 1;
                }
                z = true;
            }
            if (convertToMap == null || !convertToMap.containsKey(2)) {
                z2 = false;
            } else {
                if (i6 == 0) {
                    i6 = 2;
                }
                z2 = true;
            }
            boolean z4 = convertToMap != null && convertToMap.containsKey(3);
            boolean z5 = convertToMap != null && convertToMap.containsKey(4);
            d.b("abnormal_hints", Integer.valueOf(i5));
            d.d("abnormal_hints", Integer.valueOf(i5));
            d.b("free_insurance_type", Integer.valueOf(i6));
            d.d("free_insurance_type", Integer.valueOf(i6));
            if (z) {
                d.b(ExpInfo.JUDAS_KEY_WEATHER, convertToMap.get(1));
                d.d(ExpInfo.JUDAS_KEY_WEATHER, convertToMap.get(1));
            }
            if (z2) {
                d.b(ExpInfo.JUDAS_KEY_INSURANCE, 2);
                d.d(ExpInfo.JUDAS_KEY_INSURANCE, 2);
            }
            if (z4) {
                i = 3;
                str = convertToMap.get(3);
            } else {
                i = 3;
                str = "";
            }
            d.b(ExpInfo.JUDAS_KEY_DELIVERY, str);
            d.d(ExpInfo.JUDAS_KEY_DELIVERY, z4 ? convertToMap.get(Integer.valueOf(i)) : "");
            d.b(ExpInfo.JUDAS_KEY_INSURANCE, 2);
            d.d(ExpInfo.JUDAS_KEY_INSURANCE, 2);
            d.b(ExpInfo.JUDAS_KEY_VOUCHER, z5 ? convertToMap.get(4) : "");
            d.d(ExpInfo.JUDAS_KEY_VOUCHER, z5 ? convertToMap.get(4) : "");
        }
        if (this.o.b("wm_confirm_order_extend_information_mach").isEmpty()) {
            return;
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.a aVar2 = new com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.a();
        aVar2.b(this.o.a("wm_confirm_order_extend_information_mach"));
        this.n.a(a, str3, r.a(String.valueOf(map2.get("delivery_type")), 0), r.a(String.valueOf(map2.get("total")), 0.0d), (CallbackInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(map2.get("callback_info")), (Class<Object>) CallbackInfo.class), aVar2, String.valueOf(map2.get("biz_line")));
    }

    private void a(DeliveryInfo deliveryInfo, Map<String, Object> map) {
        Object[] objArr = {deliveryInfo, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed0c8ab9ecbd1a7a62486b7c39355efa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed0c8ab9ecbd1a7a62486b7c39355efa");
            return;
        }
        com.sankuai.waimai.bussiness.order.confirm.pgablock.root.CallbackInfo callbackInfo = (com.sankuai.waimai.bussiness.order.confirm.pgablock.root.CallbackInfo) com.sankuai.waimai.mach.utils.b.a().fromJson(com.sankuai.waimai.mach.utils.b.a().toJson(map.get("callback_info")), (Class<Object>) com.sankuai.waimai.bussiness.order.confirm.pgablock.root.CallbackInfo.class);
        deliveryInfo.extendsInfo = callbackInfo;
        List<OrderFoodOutput> arrayList = d.c.get("food_output_list") != null ? (List) d.c.get("food_output_list") : new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (com.sankuai.waimai.foundation.utils.b.a(arrayList)) {
            for (OrderFoodOutput orderFoodOutput : arrayList) {
                if (orderFoodOutput != null) {
                    arrayList2.add(new OrderFoodInput(orderFoodOutput));
                }
            }
        }
        deliveryInfo.foodList = arrayList2;
        deliveryInfo.cyclePurchaseInfo = map.get("cycle_purchase_info") != null ? com.sankuai.waimai.mach.utils.b.a().toJson(map.get("cycle_purchase_info")) : "";
        deliveryInfo.previewOrderCallbackInfo = callbackInfo != null ? callbackInfo.previewOrderCallbackInfo : "";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v41, types: [java.util.Map] */
    @Override // com.sankuai.waimai.bussiness.order.base.mach.c
    public final void a(String str, Map<String, Object> map) {
        char c2;
        String valueOf;
        int i = 1;
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c832872cfa244b8472cb03ffb0aee5b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c832872cfa244b8472cb03ffb0aee5b9");
            return;
        }
        super.a(str, map);
        switch (str.hashCode()) {
            case -2039902238:
                if (str.equals("extend_information_event")) {
                    c2 = '#';
                    break;
                }
                c2 = 65535;
                break;
            case -1933964018:
                if (str.equals("merchant_collect_event")) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case -1858101646:
                if (str.equals("get_product_reminds_code_event")) {
                    c2 = '$';
                    break;
                }
                c2 = 65535;
                break;
            case -1854135760:
                if (str.equals("show_collect_food_event")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case -1722896185:
                if (str.equals("discount_collect_event")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case -1654495757:
                if (str.equals("allowance_detail_event")) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case -1521331687:
                if (str.equals("data_update_event")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1508022189:
                if (str.equals("show_time_dialog_event")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1152156437:
                if (str.equals("send_mach_event")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -757923959:
                if (str.equals("close_hint_event")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case -714260709:
                if (str.equals("save_category_event")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -675684155:
                if (str.equals("init_id_event")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case -625238292:
                if (str.equals("coupon_collect_event")) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case -593210244:
                if (str.equals("phone_change_event")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case -500455338:
                if (str.equals("choose_payment_type_event")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case -462659141:
                if (str.equals("data_common_event")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -437014542:
                if (str.equals("cake_change_event")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case -435489543:
                if (str.equals("update_is_from_address_event")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -303369538:
                if (str.equals("jump_sg_deliver_page_event")) {
                    c2 = '\"';
                    break;
                }
                c2 = 65535;
                break;
            case -157708752:
                if (str.equals("jump_merchant_page_event")) {
                    c2 = Constants.SPACE;
                    break;
                }
                c2 = 65535;
                break;
            case -146640267:
                if (str.equals("set_last_address_list")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -39324786:
                if (str.equals("data_check_event")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -35749417:
                if (str.equals("add_food_event")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case -23099450:
                if (str.equals("judas_event")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 25122858:
                if (str.equals("update_address_info_event")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 513850357:
                if (str.equals("jump_deliver_page_event")) {
                    c2 = '!';
                    break;
                }
                c2 = 65535;
                break;
            case 610037757:
                if (str.equals("show_self_delivery_map_event")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case 661070873:
                if (str.equals("judas_data_event")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 683001417:
                if (str.equals("phone_show_event")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 984320606:
                if (str.equals("content_show_event")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 1048660178:
                if (str.equals("jump_coupon_page_event")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            case 1175642793:
                if (str.equals("code_select_event")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 1472448525:
                if (str.equals("jump_to_edit_address_event")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 1688293876:
                if (str.equals("sync_local_state_event")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1906288043:
                if (str.equals("deliver_collect_event")) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 1924040528:
                if (str.equals("show_address_dialog_event")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1950943676:
                if (str.equals("pay_data_event")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                Object[] objArr2 = {map};
                ChangeQuickRedirect changeQuickRedirect2 = c;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "039879b98275d1e45773418c7f088676", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "039879b98275d1e45773418c7f088676");
                    return;
                } else if (map == null || !map.containsKey("bid")) {
                    return;
                } else {
                    String valueOf2 = String.valueOf(map.get("bid"));
                    String valueOf3 = String.valueOf(map.get("cid"));
                    if (TextUtils.isEmpty(valueOf3)) {
                        valueOf3 = "c_ykhs39e";
                    }
                    int a = r.a(String.valueOf(map.get("judasType")), -1);
                    Map<String, Object> hashMap = new HashMap<>();
                    if (map.containsKey("valLab") && (map.get("valLab") instanceof Map)) {
                        hashMap = (Map) map.get("valLab");
                    }
                    if (a == 1) {
                        JudasManualManager.b(valueOf2).a(valueOf3).a(hashMap).a(this.e).a();
                        return;
                    } else if (a == 2) {
                        JudasManualManager.a(valueOf2).a(valueOf3).a(hashMap).a(this.e).a();
                        return;
                    } else {
                        return;
                    }
                }
            case 1:
                if (map == null) {
                    return;
                }
                Object obj = map.get("data");
                int a2 = r.a(map.get("checkType").toString(), 0);
                if (obj == null || !(obj instanceof Map)) {
                    return;
                }
                Map map2 = (Map) obj;
                for (String str2 : map2.keySet()) {
                    String str3 = (String) map2.get(str2);
                    Object[] objArr3 = {str2, str3, Integer.valueOf(a2)};
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "9d0effd4066453f94c7bd4a7ae08ffa1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "9d0effd4066453f94c7bd4a7ae08ffa1");
                    } else if (d.k.containsKey(str2) && a2 == 0) {
                        d.k.remove(str2);
                    } else if (a2 == 1) {
                        d.k.put(str2, str3);
                    }
                }
                return;
            case 2:
                if (map == null) {
                    return;
                }
                this.f.ad.b(map);
                return;
            case 3:
                if (map == null) {
                    return;
                }
                int a3 = r.a(map.get("payType").toString(), 0);
                String valueOf4 = String.valueOf(map.get("cashierType"));
                Map<String, Object> a4 = com.sankuai.waimai.mach.utils.b.a(map.get("extraData").toString());
                Object[] objArr4 = {Integer.valueOf(a3), valueOf4, a4};
                ChangeQuickRedirect changeQuickRedirect4 = d.a;
                if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "8ad933e99ebdc50fac954ee095286170", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "8ad933e99ebdc50fac954ee095286170");
                    break;
                } else if (a3 != 5 && a3 != 3) {
                    if (!d.n.containsValue(valueOf4)) {
                        d.n.clear();
                        d.n.put("cashierType", valueOf4);
                    }
                    if (!a4.isEmpty()) {
                        d.n.put("extraData", a4);
                        break;
                    }
                }
                break;
            case 4:
                break;
            case 5:
                if (this.d != null) {
                    this.d.a(map);
                    return;
                }
                return;
            case 6:
                int a5 = r.a(map.get("judas_type").toString(), 0);
                Map<? extends String, ? extends Object> map3 = (Map) map.get("data");
                if (a5 == 0) {
                    d.h.putAll(map3);
                    return;
                } else if (a5 == 1) {
                    d.j.putAll(map3);
                    return;
                } else {
                    return;
                }
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
                this.g.a(str, map);
                return;
            case 15:
                this.h.a(str, map);
                return;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                this.j.a(str, map);
                return;
            case 22:
                this.k.a(str, map);
                return;
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case ' ':
            case '!':
            case '\"':
                this.l.a(str, map);
                return;
            case '#':
            case '$':
                final com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a aVar = this.n;
                Object[] objArr5 = {str, map};
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "8d7c940627452174c61881b5302213e8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "8d7c940627452174c61881b5302213e8");
                    return;
                } else if ("extend_information_event".equals(str)) {
                    switch (map.containsKey("code") ? r.a(String.valueOf(map.get("code")), -1) : -1) {
                        case 0:
                            Object[] objArr6 = {map};
                            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.a;
                            if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "f7a7e974f074701d496a2e9c51d57a1f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "f7a7e974f074701d496a2e9c51d57a1f");
                                return;
                            } else if (map.containsKey("data")) {
                                FieldInfo fieldInfo = (FieldInfo) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(String.valueOf(map.get("data")), (Class<Object>) FieldInfo.class);
                                aVar.e = new com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.c();
                                aVar.e.a = false;
                                aVar.e.b = aVar.f;
                                aVar.e.c = aVar.g;
                                aVar.e.e = aVar.k;
                                aVar.e.d = String.valueOf(map.get("orderToken"));
                                if (fieldInfo != null) {
                                    aVar.e.f = fieldInfo;
                                } else {
                                    aVar.e.f = new FieldInfo();
                                }
                                if (aVar.e != null) {
                                    JudasManualManager.a("b_e64riq44").a("business_type", aVar.h).a("c_ykhs39e").a(aVar.b).a();
                                    final com.sankuai.waimai.bussiness.order.crossconfirm.block.remarkinfo.c cVar = aVar.e;
                                    Object[] objArr7 = {cVar};
                                    ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.a;
                                    if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "1a2f7a5a698efc0b3c4132bf34f6f1de", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "1a2f7a5a698efc0b3c4132bf34f6f1de");
                                        return;
                                    } else if (cVar != null) {
                                        final a.C0886a c0886a = new a.C0886a();
                                        aVar.d = d.c.get("remark_tags") != null ? (ArrayList) d.c.get("remark_tags") : new ArrayList<>();
                                        c0886a.b = (Activity) aVar.b;
                                        c0886a.e = com.sankuai.waimai.bussiness.order.base.utils.h.b(cVar.f);
                                        c0886a.j = com.sankuai.waimai.bussiness.order.base.utils.h.a(cVar.f);
                                        Object[] objArr8 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.a;
                                        if (PatchProxy.isSupport(objArr8, aVar, changeQuickRedirect8, false, "f2b2154a36276079bcb729745e08f57e", RobustBitConfig.DEFAULT_VALUE)) {
                                            valueOf = (String) PatchProxy.accessDispatch(objArr8, aVar, changeQuickRedirect8, false, "f2b2154a36276079bcb729745e08f57e");
                                        } else {
                                            valueOf = d.c.get("remark") != null ? String.valueOf(d.c.get("remark")) : "";
                                        }
                                        c0886a.f = valueOf;
                                        c0886a.j = cVar.f.detailHint;
                                        a.C0886a a6 = c0886a.a(cVar.b);
                                        a6.d = cVar.c;
                                        a6.h = 1;
                                        a6.g = 11;
                                        a6.o = cVar.d;
                                        a6.p = aVar.r;
                                        Object[] objArr9 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.a;
                                        if (PatchProxy.isSupport(objArr9, aVar, changeQuickRedirect9, false, "d66c96af200685a3d4e608ba9b4c4b9c", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr9, aVar, changeQuickRedirect9, false, "d66c96af200685a3d4e608ba9b4c4b9c");
                                        } else if (aVar.b != null && (aVar.b instanceof BaseActivity)) {
                                            ((BaseActivity) aVar.b).u();
                                        }
                                        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderRemarkService) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderRemarkService.class)).requestRemarksInfo(cVar.e, com.sankuai.waimai.foundation.location.v2.h.t(), aVar.r), new b.AbstractC1042b<BaseResponse<RemarkInfoResponse>>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.rock.a.1
                                            public static ChangeQuickRedirect a;

                                            @Override // rx.e
                                            public final /* synthetic */ void onNext(Object obj2) {
                                                BaseResponse baseResponse = (BaseResponse) obj2;
                                                Object[] objArr10 = {baseResponse};
                                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "60da18e10f7cfb29aa4a7bbc2f57685f", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "60da18e10f7cfb29aa4a7bbc2f57685f");
                                                    return;
                                                }
                                                a.a(aVar);
                                                if (baseResponse != null && baseResponse.data != 0 && baseResponse.code == 0) {
                                                    c0886a.c = h.a(aVar.d, ((RemarkInfoResponse) baseResponse.data).defaultValues, ((RemarkInfoResponse) baseResponse.data).cautionValues);
                                                    c0886a.l = com.sankuai.waimai.foundation.utils.b.b(((RemarkInfoResponse) baseResponse.data).customerValues) ? null : ((RemarkInfoResponse) baseResponse.data).customerValues;
                                                    c0886a.m = com.sankuai.waimai.foundation.utils.b.b(((RemarkInfoResponse) baseResponse.data).cautionValues) ? null : ((RemarkInfoResponse) baseResponse.data).cautionValues;
                                                    c0886a.k = com.sankuai.waimai.foundation.utils.b.b(((RemarkInfoResponse) baseResponse.data).defaultValues) ? null : ((RemarkInfoResponse) baseResponse.data).defaultValues;
                                                    c0886a.n = com.sankuai.waimai.foundation.utils.b.b(((RemarkInfoResponse) baseResponse.data).specialValues) ? null : ((RemarkInfoResponse) baseResponse.data).specialValues;
                                                    c0886a.i = ((RemarkInfoResponse) baseResponse.data).remindInfo;
                                                } else {
                                                    c0886a.c = h.a(aVar.d, cVar.f, (List<CautionInfo>) null);
                                                }
                                                com.sankuai.waimai.bussiness.order.base.a.a(c0886a.a(), true);
                                            }

                                            @Override // rx.e
                                            public final void onError(Throwable th) {
                                                Object[] objArr10 = {th};
                                                ChangeQuickRedirect changeQuickRedirect10 = a;
                                                if (PatchProxy.isSupport(objArr10, this, changeQuickRedirect10, false, "17456e3c0b08ee4464f9c179668469bd", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr10, this, changeQuickRedirect10, false, "17456e3c0b08ee4464f9c179668469bd");
                                                    return;
                                                }
                                                a.a(aVar);
                                                ae.a(aVar.b, aVar.b.getResources().getString(R.string.wm_order_confirm_remark_request_error_info));
                                            }
                                        }, null);
                                        return;
                                    } else {
                                        return;
                                    }
                                }
                                return;
                            } else {
                                return;
                            }
                        case 1:
                            aVar.a(map);
                            return;
                        case 2:
                            aVar.p.a(false, map, (ExtendInfoModel) null);
                            return;
                        case 3:
                            com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.b bVar = aVar.o;
                            Object[] objArr10 = {map};
                            ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.b.a;
                            if (PatchProxy.isSupport(objArr10, bVar, changeQuickRedirect10, false, "816e97b26bf5c5a13e6808d7cedd475e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr10, bVar, changeQuickRedirect10, false, "816e97b26bf5c5a13e6808d7cedd475e");
                                return;
                            }
                            r5 = map.containsKey("data") ? (HashMap) com.sankuai.waimai.bussiness.order.detailnew.util.d.a().fromJson(String.valueOf(map.get("data")), (Class<Object>) HashMap.class) : null;
                            if (r5 != null) {
                                bVar.h.g = r.a(String.valueOf(r5.get("has_invoice")), 0);
                                bVar.h.o = String.valueOf(r5.get("invoice_link"));
                                bVar.h.e = Boolean.parseBoolean(String.valueOf(r5.get("invoice_show")));
                                bVar.h.h = r.a(String.valueOf(r5.get("invoice_support")), 0);
                                bVar.h.f = String.valueOf(r5.get("invoice_text"));
                                bVar.h.n = String.valueOf(r5.get("invoice_title"));
                                bVar.h.l = r.a(String.valueOf(r5.get("invoice_type")), 0);
                                bVar.h.j = r.a(String.valueOf(r5.get("min_invoice_price")), 0.0d);
                                bVar.h.m = String.valueOf(r5.get("taxpayer_id_number"));
                            }
                            if (TextUtils.isEmpty(bVar.h.o)) {
                                return;
                            }
                            Object[] objArr11 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.bussiness.order.confirm.pgablock.extendInfo.b.a;
                            if (PatchProxy.isSupport(objArr11, bVar, changeQuickRedirect11, false, "7e45ea28694af32c4895c8356d8f401a", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr11, bVar, changeQuickRedirect11, false, "7e45ea28694af32c4895c8356d8f401a");
                                return;
                            }
                            com.sankuai.waimai.platform.capacity.persistent.sp.a.a((Context) bVar.b, "ceres_invoice_mt_invoice", 1);
                            Bundle bundle = new Bundle();
                            bundle.putInt("intent_source", 1);
                            com.sankuai.waimai.foundation.router.a.a(bVar.b, bVar.h.o, bundle, 14);
                            return;
                        default:
                            return;
                    }
                } else if ("get_product_reminds_code_event".equals(str)) {
                    aVar.a(String.valueOf(map.get("desc")), r.a(String.valueOf(map.get("code")), -1));
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
        a(map);
        String valueOf5 = String.valueOf(map.get("action"));
        if (TextUtils.equals(valueOf5, "savePaymentTypeStateAction")) {
            com.sankuai.waimai.bussiness.order.confirm.pgablock.quickpayment.rock.b bVar2 = this.k;
            Object[] objArr12 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.bussiness.order.confirm.pgablock.quickpayment.rock.b.a;
            if (PatchProxy.isSupport(objArr12, bVar2, changeQuickRedirect12, false, "aec28a3c11a70394fdf74c9e0e25d851", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr12, bVar2, changeQuickRedirect12, false, "aec28a3c11a70394fdf74c9e0e25d851");
            } else {
                try {
                    if (b != null && b.containsKey("stateKey") && "paymentTypeState".equals(String.valueOf(b.get("stateKey")))) {
                        r5 = (Map) b.get("stateValue");
                    }
                } catch (Exception unused) {
                }
                if (r5 != null) {
                    bVar2.c = Boolean.parseBoolean(String.valueOf(r5.get("paymentTypeHasSwitched")));
                    bVar2.d = Boolean.parseBoolean(String.valueOf(r5.get("isPayTypeSwitchClicked")));
                    bVar2.e = Boolean.parseBoolean(String.valueOf(r5.get("paymentTypeSwitchIsVisible")));
                    d.a("quick_pay_click", Integer.valueOf((bVar2.e && bVar2.d) ? 0 : 1));
                    d.a("quick_pay_select", Integer.valueOf((bVar2.e && bVar2.c) ? 0 : 0));
                    bVar2.b = r.a(String.valueOf(r5.get("paymentType")), bVar2.b);
                    bVar2.a(bVar2.b);
                    if (bVar2.d && bVar2.g != null) {
                        bVar2.g.a(bVar2.c);
                    }
                }
            }
        }
        if (TextUtils.equals(valueOf5, "membershipClickAction") || TextUtils.equals(valueOf5, "memberUpgradeClickAction")) {
            this.f.ay.a();
        }
    }

    public final void a(@Nullable Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3699c67454fc14a936513134c6a4d043", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3699c67454fc14a936513134c6a4d043");
            return;
        }
        String valueOf = String.valueOf(map.get("action"));
        if (TextUtils.equals("clickAddressBubbleTipsAction", valueOf) || TextUtils.equals("clickCloseCabinetPopAction", valueOf)) {
            this.g.a(map);
            return;
        }
        if (TextUtils.equals("chooseAddressItemAction", valueOf)) {
            this.g.t = true;
        }
        if (TextUtils.equals("inputPhoneAction", valueOf)) {
            this.h.a(map);
            return;
        }
        if (TextUtils.equals("clickPhoneCodeOptionsAction", valueOf)) {
            this.h.a(map);
        }
        if (map.containsKey("state")) {
            if (b == null) {
                b = new HashMap();
            }
            int a = r.a(String.valueOf(map.get("cacheType")), 0);
            Object obj = map.get("state");
            switch (a) {
                case 0:
                    a(obj);
                    break;
                case 1:
                    b(obj);
                    break;
                case 2:
                    d(obj);
                    break;
                case 3:
                    c(obj);
                    break;
            }
        }
        if (map.containsKey("data") || map.containsKey("submitData")) {
            int a2 = r.a(String.valueOf(map.get("isUpdate")), 0);
            int a3 = r.a(String.valueOf(map.get("isFrom")), 0);
            int a4 = r.a(String.valueOf(map.get("isStash")), 0);
            if (a3 == 6) {
                Object obj2 = map.get("data");
                if (obj2 instanceof Map) {
                    d.a("foodlist", ((Map) obj2).get("foodlist"));
                }
            }
            b(map.get("submitData"), a4);
            if (a3 != 5) {
                a(map.get("data"), a4);
                if (a2 != 1) {
                    if (a2 == 2) {
                        this.f.aa.a();
                    }
                } else if (TextUtils.equals(valueOf, "clickDeliveryTabAction")) {
                    b(map);
                } else {
                    a(a3);
                }
            } else if (map.get("data") instanceof Map) {
                c((Map) map.get("data"));
            }
        }
    }

    private void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "635c4bdd5677f94ed38bc4f0f58e0d38", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "635c4bdd5677f94ed38bc4f0f58e0d38");
        } else if (map.containsKey("state")) {
            Object obj = map.get("state");
            Map map2 = obj instanceof Map ? (Map) obj : null;
            if (map2 == null) {
                return;
            }
            this.d.a(r.a(String.valueOf(map2.get("business_type")), 0), Boolean.parseBoolean(String.valueOf(map2.get("postPhoneAddr"))));
        }
    }

    private void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0e02d7a77a30e4511f93f41914d7a93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0e02d7a77a30e4511f93f41914d7a93");
        } else {
            this.d.a(i);
        }
    }

    private void c(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fd11706c5e04335855e5607e6e9680e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fd11706c5e04335855e5607e6e9680e");
        } else {
            this.d.b(map);
        }
    }

    private void a(Object obj, int i) {
        Object[] objArr = {obj, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a60c4ecba62423ed1b6c9b9b5d3c06e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a60c4ecba62423ed1b6c9b9b5d3c06e");
            return;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        if (map.containsKey("submitAPISpecial")) {
            map.remove("submitAPISpecial");
        }
        b(map, i);
        for (String str : map.keySet()) {
            if (TextUtils.equals(str, "model_input_map")) {
                Map map2 = (Map) map.get("model_input_map");
                Map map3 = d.d.get("model_input_map") != null ? (Map) d.d.get("model_input_map") : null;
                if (map3 == null) {
                    map3 = new HashMap();
                }
                map3.putAll(map2);
                d.b(false, true, "model_input_map", map3);
            } else if (TextUtils.equals(str, "ap_params")) {
                List arrayList = new ArrayList();
                if (map.get("ap_params") instanceof Map) {
                    arrayList.add(com.sankuai.waimai.mach.utils.b.a(map.get("ap_params").toString()));
                } else if (map.get("ap_params") instanceof List) {
                    arrayList = (List) map.get("ap_params");
                }
                d.a((List<Map<String, Object>>) arrayList, d.d.get("ap_params"), true, false);
            } else if (i == 1) {
                d.a(false, true, str, map.get(str));
            } else {
                d.b(false, true, str, map.get(str));
            }
        }
    }

    private void b(Object obj, int i) {
        Object[] objArr = {obj, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e2e8ebafc23a80491e119446603b745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e2e8ebafc23a80491e119446603b745");
            return;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (String str : map.keySet()) {
            if (TextUtils.equals(str, "model_input_map")) {
                Map map2 = (Map) map.get("model_input_map");
                Map map3 = d.d.get("model_input_map") != null ? (Map) d.d.get("model_input_map") : null;
                if (map3 == null) {
                    map3 = new HashMap();
                }
                map3.putAll(map2);
                d.b(true, false, "model_input_map", map3);
            } else if (TextUtils.equals(str, "ap_params")) {
                List arrayList = new ArrayList();
                if (map.get("ap_params") instanceof Map) {
                    arrayList.add((Map) map.get("ap_params"));
                } else if (map.get("ap_params") instanceof List) {
                    arrayList = (List) map.get("ap_params");
                }
                try {
                    d.a((List<Map<String, Object>>) arrayList, d.g.get("ap_params"), false, true);
                } catch (Exception unused) {
                }
            } else if (i == 1) {
                d.a(true, false, str, map.get(str));
            } else {
                d.b(true, false, str, map.get(str));
            }
        }
    }

    private void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d19dec2e8c728875cde68e2569380edc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d19dec2e8c728875cde68e2569380edc");
            return;
        }
        Map<? extends String, ? extends Object> map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        b.putAll(map);
    }

    private void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e63c380efdced4a5830470fca32a190b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e63c380efdced4a5830470fca32a190b");
            return;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            com.sankuai.waimai.bussiness.order.confirm.cache.b.a().a(this.d.aH_(), (String) entry.getKey(), entry.getValue());
        }
    }

    private void c(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2aa473a23d0e76893be3ce7b628cd15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2aa473a23d0e76893be3ce7b628cd15");
            return;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            com.sankuai.waimai.bussiness.order.confirm.cache.b.a().b(this.d.aH_(), (String) entry.getKey());
        }
    }

    private void d(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2933119eb74af5abb3c595e673c7cfbf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2933119eb74af5abb3c595e673c7cfbf");
            return;
        }
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null || "".equals(value)) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.e, str, (String) null);
            } else if (value instanceof Boolean) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.e, str, ((Boolean) value).booleanValue());
            } else if (value instanceof String) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.e, str, (String) value);
            } else if (value instanceof Integer) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.e, str, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(this.e, str, ((Long) value).longValue());
            }
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.base.mach.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c3cfc5f4e29cbd8efa8059aacb756d3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c3cfc5f4e29cbd8efa8059aacb756d3");
        } else {
            super.a();
        }
    }
}

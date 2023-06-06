package com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.LongSparseArray;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.DiscountItem;
import com.sankuai.waimai.bussiness.order.confirm.helper.g;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.d;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.ComboProduct;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.viewmodel.a<Map<String, Object>> {
    public static ChangeQuickRedirect o;
    @NonNull
    public com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.c p;
    @NonNull
    public com.sankuai.waimai.bussiness.order.crossconfirm.block.goodslist.c q;
    @NonNull
    public com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.c r;
    @NonNull
    public com.sankuai.waimai.bussiness.order.crossconfirm.block.packingdeliverycost.c s;
    public FoodInfoModel t;
    @NonNull
    private final LongSparseArray<Integer> u;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c3a834873e1e3fd48e4f1ae3239f25b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c3a834873e1e3fd48e4f1ae3239f25b");
            return;
        }
        this.p = new com.sankuai.waimai.bussiness.order.crossconfirm.block.meituancoupon.c();
        this.q = new com.sankuai.waimai.bussiness.order.crossconfirm.block.goodslist.c();
        this.r = new com.sankuai.waimai.bussiness.order.crossconfirm.block.merchantcoupon.c();
        this.s = new com.sankuai.waimai.bussiness.order.crossconfirm.block.packingdeliverycost.c();
        this.t = new FoodInfoModel();
        this.u = new LongSparseArray<>();
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final Boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf48fd8f132b2a0cf75553561ea16abf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf48fd8f132b2a0cf75553561ea16abf");
        }
        return Boolean.valueOf(this.c != 0);
    }

    public final void b(Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79caae5f9e188c04480a06f6aa4fa392", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79caae5f9e188c04480a06f6aa4fa392");
            return;
        }
        this.c = map;
        if (this.c != 0) {
            try {
                this.t = (FoodInfoModel) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(this.c), (Class<Object>) FoodInfoModel.class);
            } catch (Exception unused) {
            }
            g.a().a(com.sankuai.waimai.bussiness.order.confirm.model.ap.a.a(this.t.machRockTemplateData));
            o();
            this.s.g = this.t.shippingFeeUpdateReason;
            this.s.h = this.t.shippingFeeInfo;
            this.s.e = this.t.shippingFee;
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "28f04234904c53a7628e083381496ba2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "28f04234904c53a7628e083381496ba2");
            return;
        }
        super.d();
        this.t = (FoodInfoModel) com.sankuai.waimai.bussiness.order.base.utils.b.a().fromJson(com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(this.c), (Class<Object>) FoodInfoModel.class);
        g.a().a(com.sankuai.waimai.bussiness.order.confirm.model.ap.a.a(this.t.machTemplateData));
        o();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = o;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "663adb82be05af1d6414656d8a5526e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "663adb82be05af1d6414656d8a5526e9");
            return;
        }
        this.u.clear();
        if (this.t == null || com.sankuai.waimai.foundation.utils.b.b(this.t.discountList)) {
            return;
        }
        for (DiscountItem discountItem : this.t.discountList) {
            if (discountItem != null && discountItem.redioInfo != null) {
                this.u.put(discountItem.id, Integer.valueOf(discountItem.redioInfo.c));
            }
        }
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b0b0d5a8cbc168c8de01bfc565ba39a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b0b0d5a8cbc168c8de01bfc565ba39a");
            return;
        }
        this.r.a = true;
        this.p.a = false;
        this.r.i = this.t.extendsInfo;
        if (this.t.extendsInfo != null) {
            this.r.i.activityInfo = this.t.extendsInfo.activityInfoForCoupon;
        }
        if (this.c != 0) {
            this.p.b = -1L;
            this.p.e = this.t.couponInfoList;
            this.p.f = this.t.canUseCouponPrice;
            this.p.g = (this.t.extendsInfo == null || aa.a(this.t.extendsInfo.activityInfoForCoupon)) ? "" : this.t.extendsInfo.activityInfoForCoupon;
            this.p.h = null;
            this.q.e = b(this.t.foodList);
            this.q.g = a(this.t.foodList);
            return;
        }
        this.p.b = -1L;
        this.p.e = null;
        this.p.f = 0.0d;
        this.p.g = "";
        this.p.h = null;
    }

    private int b(List<OrderFoodOutput> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac126e3dacb8885859d22654770a1825", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac126e3dacb8885859d22654770a1825")).intValue();
        }
        if (com.sankuai.waimai.foundation.utils.b.a(list)) {
            for (OrderFoodOutput orderFoodOutput : list) {
                if (orderFoodOutput != null && orderFoodOutput.isRxFlag) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public final List<OrderedFood> a(@Nullable List<OrderFoodOutput> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed5003ff45aad5eebcaaba86d505feda", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed5003ff45aad5eebcaaba86d505feda");
        }
        if (list == null || list.size() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (OrderFoodOutput orderFoodOutput : list) {
            OrderedFood a = a(orderFoodOutput);
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    @Nullable
    private OrderedFood a(@Nullable final OrderFoodOutput orderFoodOutput) {
        int i;
        Object[] objArr = {orderFoodOutput};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1656d51d61d8ea045f2b729c207f829d", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1656d51d61d8ea045f2b729c207f829d");
        }
        if (orderFoodOutput == null) {
            return null;
        }
        OrderedFood orderedFood = new OrderedFood();
        orderedFood.spu.id = orderFoodOutput.spuId;
        orderedFood.sku.id = orderFoodOutput.id;
        orderedFood.spu.setName(orderFoodOutput.name);
        orderedFood.sku.setPrice(orderFoodOutput.price);
        orderedFood.spu.setUnit(orderFoodOutput.unit);
        orderedFood.count = orderFoodOutput.count;
        orderedFood.sku.setOriginPrice(orderFoodOutput.originalPrice);
        orderedFood.setSubTotalPrice(orderFoodOutput.subTotalPrice);
        orderedFood.subBoxTotalPrice = orderFoodOutput.subBoxTotalPrice;
        orderedFood.subBoxTotalPriceDesc = orderFoodOutput.subBoxTotalPriceDesc;
        orderedFood.originalBoxNum = orderFoodOutput.originalBoxNum;
        orderedFood.originalBoxPrice = orderFoodOutput.originalBoxPrice;
        orderedFood.productLabelList = orderFoodOutput.productLabelList;
        orderedFood.setFoodLabelUrl(orderFoodOutput.foodLabelUrl);
        orderedFood.setVipLabelUrl(orderFoodOutput.vipLabelUrl);
        orderedFood.setCartId(orderFoodOutput.cartId);
        orderedFood.sku.setSpec(orderFoodOutput.spec);
        orderedFood.spu.setActivityTag(orderFoodOutput.activityTag);
        orderedFood.spu.setPicture(orderFoodOutput.picture);
        if (orderFoodOutput.mComboProduct != null && orderFoodOutput.mComboProduct.size() > 0) {
            orderedFood.setComboItemList(new ArrayList<OrderedFood>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo.c.1
                {
                    for (ComboProduct comboProduct : orderFoodOutput.mComboProduct) {
                        add(ComboProduct.a(comboProduct));
                    }
                }
            });
        }
        int size = (orderFoodOutput.addPriceAttrs != null ? orderFoodOutput.addPriceAttrs.size() : 0) + (orderFoodOutput.attrs != null ? orderFoodOutput.attrs.size() : 0);
        if (size != 0) {
            GoodsAttr[] goodsAttrArr = new GoodsAttr[size];
            if (orderFoodOutput.attrs != null) {
                i = orderFoodOutput.attrs.size();
                for (int i2 = 0; i2 < orderFoodOutput.attrs.size(); i2++) {
                    GoodsAttr goodsAttr = new GoodsAttr();
                    goodsAttr.id = orderFoodOutput.attrs.get(i2).id;
                    goodsAttr.setValue(orderFoodOutput.attrs.get(i2).value);
                    goodsAttrArr[i2] = goodsAttr;
                }
            } else {
                i = 0;
            }
            if (orderFoodOutput.addPriceAttrs != null) {
                for (int i3 = i; i3 < size; i3++) {
                    goodsAttrArr[i3] = orderFoodOutput.addPriceAttrs.get(i3 - i);
                    goodsAttrArr[i3].mode = 999;
                }
            }
            orderedFood.setAttrIds(goodsAttrArr);
        }
        if (orderFoodOutput.actInfoList != null && orderFoodOutput.actInfoList.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (int i4 = 0; i4 < orderFoodOutput.actInfoList.size(); i4++) {
                if (orderFoodOutput.actInfoList.get(i4) != null && orderFoodOutput.actInfoList.get(i4).actTip != null) {
                    OrderedFood.a aVar = new OrderedFood.a();
                    aVar.b = orderFoodOutput.actInfoList.get(i4).actTip;
                    arrayList.add(aVar);
                }
            }
            orderedFood.setActInfoList(arrayList);
        }
        orderedFood.setActivityList(orderFoodOutput.activityExtra);
        orderedFood.updateAllowance(orderFoodOutput.itemAddtionalTips, orderFoodOutput.maidian);
        if (orderFoodOutput.productSpotPrice != null) {
            orderedFood.spotPrice = orderFoodOutput.productSpotPrice.a;
            orderedFood.spotPriceLabel = orderFoodOutput.productSpotPrice.b;
        }
        orderedFood.desc = orderFoodOutput.desc;
        return orderedFood;
    }

    public final List<Map<String, Object>> n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "488c2c461aad881500406b72a64b392b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "488c2c461aad881500406b72a64b392b");
        }
        ArrayList arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        if (d.c.get("drug_select_list") != null) {
            arrayList2 = (List) d.c.get("drug_select_list");
        }
        if (!(d.c.containsKey("selected_drug_member") ? ((Boolean) d.c.get("selected_drug_member")).booleanValue() : false)) {
            ArrayList arrayList3 = new ArrayList();
            if (d.c.get("product_select_list") != null) {
                List list = (List) d.c.get("product_select_list");
                if (list.size() > 0) {
                    for (int i = 0; i < list.size(); i++) {
                        Map map = (Map) list.get(i);
                        if (d.c.containsKey("user_drop_activity") && ((Boolean) d.c.get("user_drop_activity")).booleanValue()) {
                            map.put("user_drop_activity", Boolean.TRUE);
                        }
                        arrayList3.add(map);
                    }
                }
            }
            arrayList.addAll(arrayList3);
        } else if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        return arrayList;
    }
}

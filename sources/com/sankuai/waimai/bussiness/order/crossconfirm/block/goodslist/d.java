package com.sankuai.waimai.bussiness.order.crossconfirm.block.goodslist;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewResult;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.ComboProduct;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.viewmodel.a<PoiOrderPreviewResult> {
    public static ChangeQuickRedirect o;
    @NonNull
    c p;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "235377bfe6213169792d8fbddf0c635c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "235377bfe6213169792d8fbddf0c635c");
        } else {
            this.p = new c();
        }
    }

    @Override // com.meituan.android.cube.pga.viewmodel.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0eaac3d0ce2aabacc0a91c87f7ae951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0eaac3d0ce2aabacc0a91c87f7ae951");
            return;
        }
        super.d();
        this.p.a = true;
        List<OrderedFood> list = null;
        if (this.c != 0) {
            this.p.b = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiId : -1L;
            this.p.c = ((PoiOrderPreviewResult) this.c).poiInfo != null ? ((PoiOrderPreviewResult) this.c).poiInfo.poiIdStr : "";
            this.p.d = ((PoiOrderPreviewResult) this.c).isAddStapleFoodClickable;
            this.p.f = ((PoiOrderPreviewResult) this.c).productRemindTip;
            c cVar = this.p;
            List<OrderFoodOutput> list2 = ((PoiOrderPreviewResult) this.c).foodList;
            Object[] objArr2 = {list2};
            ChangeQuickRedirect changeQuickRedirect2 = o;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1edfbafd1fc320fcc35459002f49446e", RobustBitConfig.DEFAULT_VALUE)) {
                list = (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1edfbafd1fc320fcc35459002f49446e");
            } else if (list2 != null && list2.size() > 0) {
                list = new ArrayList<>();
                for (OrderFoodOutput orderFoodOutput : list2) {
                    OrderedFood a = a(orderFoodOutput);
                    if (a != null) {
                        list.add(a);
                    }
                }
            }
            cVar.g = list;
            this.p.h = ((PoiOrderPreviewResult) this.c).unAvailableFoodList;
            return;
        }
        this.p.b = -1L;
        this.p.c = "";
        this.p.d = false;
        this.p.f = null;
        this.p.g = null;
        this.p.h = null;
    }

    @Nullable
    private OrderedFood a(@Nullable final OrderFoodOutput orderFoodOutput) {
        int i;
        Object[] objArr = {orderFoodOutput};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d879e7f1f9f4b2b8c94a748143734abd", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d879e7f1f9f4b2b8c94a748143734abd");
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
        int size = (orderFoodOutput.addPriceAttrs != null ? orderFoodOutput.addPriceAttrs.size() : 0) + (orderFoodOutput.attrs != null ? orderFoodOutput.attrs.size() : 0);
        GoodsAttr[] goodsAttrArr = new GoodsAttr[size];
        if (orderFoodOutput.attrs == null || orderFoodOutput.attrs.size() <= 0) {
            i = 0;
        } else {
            i = orderFoodOutput.attrs.size();
            for (int i2 = 0; i2 < i; i2++) {
                GoodsAttr goodsAttr = new GoodsAttr();
                goodsAttr.id = orderFoodOutput.attrs.get(i2).id;
                goodsAttr.setValue(orderFoodOutput.attrs.get(i2).value);
                goodsAttrArr[i2] = goodsAttr;
            }
        }
        orderedFood.setComboItemList(new ArrayList<OrderedFood>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.goodslist.d.1
            {
                for (ComboProduct comboProduct : orderFoodOutput.mComboProduct) {
                    add(ComboProduct.a(comboProduct));
                }
            }
        });
        if (orderFoodOutput.addPriceAttrs != null && orderFoodOutput.addPriceAttrs.size() > 0) {
            for (int i3 = i; i3 < size; i3++) {
                goodsAttrArr[i3] = orderFoodOutput.addPriceAttrs.get(i3 - i);
                goodsAttrArr[i3].mode = 999;
            }
        }
        orderedFood.setAttrIds(goodsAttrArr);
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
        return orderedFood;
    }

    public final double n() {
        if (this.c != 0) {
            return ((PoiOrderPreviewResult) this.c).canUseCouponPrice;
        }
        return 0.0d;
    }
}

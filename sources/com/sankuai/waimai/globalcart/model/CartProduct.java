package com.sankuai.waimai.globalcart.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.ComboProduct;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CartProduct implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_tag")
    public String activityTag;
    public List<com.sankuai.waimai.platform.domain.core.shop.a> activityTagList;
    @SerializedName("attrs")
    public List<Long> attrs;
    @SerializedName("cart_id")
    public long cartId;
    @SerializedName("checkStatus")
    public int checkStatus;
    @SerializedName("count")
    public int count;
    public String groupChatShare;
    @SerializedName("is_check_status_change")
    public boolean isCheckStatusChange;
    @SerializedName("is_delete")
    public boolean isDelete;
    @SerializedName("list_type")
    public int listType;
    @SerializedName("add_price_attrs")
    public List<GoodsAttr> mAddPriceAttributes;
    @SerializedName("package_combo_item_list")
    public List<ComboProduct> mComboProducts;
    public int seckill;
    @SerializedName("sku_id")
    public long skuId;
    @SerializedName("spu_id")
    public long spuId;
    public String tag;

    public CartProduct() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21564a99882da00260fe473f578208f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21564a99882da00260fe473f578208f1");
            return;
        }
        this.activityTagList = new ArrayList();
        this.mAddPriceAttributes = new ArrayList();
        this.mComboProducts = new ArrayList();
    }

    public JSONObject toJsonObj(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb061790dcc3c5af28a26634bfba4cab", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb061790dcc3c5af28a26634bfba4cab");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("spu_id", this.spuId);
            jSONObject.put("sku_id", this.skuId);
            jSONObject.put("count", this.count);
            jSONObject.put("cart_id", this.cartId);
            jSONObject.put("activity_tag", this.activityTag);
            if (this.attrs != null && this.attrs.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < this.attrs.size(); i++) {
                    jSONArray.put(this.attrs.get(i));
                }
                jSONObject.put("attrs", jSONArray);
            }
            if (this.mAddPriceAttributes != null && this.mAddPriceAttributes.size() > 0) {
                JSONArray jSONArray2 = new JSONArray();
                for (int i2 = 0; i2 < this.mAddPriceAttributes.size(); i2++) {
                    jSONArray2.put(this.mAddPriceAttributes.get(i2).toAddPriceJson());
                }
                jSONObject.put("addPriceAttrs", jSONArray2);
            }
            if (this.mComboProducts != null && this.mComboProducts.size() > 0) {
                jSONObject.put("package_combo_item_list", new JSONArray(ComboProduct.b(this.mComboProducts)));
            }
            if (z) {
                jSONObject.put("is_delete", this.isDelete);
            }
            jSONObject.put("check_status", this.checkStatus);
            jSONObject.put("is_check_status_change", this.isCheckStatusChange);
            jSONObject.put("list_type", this.listType);
            JSONObject jSONObject2 = new JSONObject();
            JSONArray jSONArray3 = new JSONArray();
            for (com.sankuai.waimai.platform.domain.core.shop.a aVar : this.activityTagList) {
                if (aVar != null) {
                    jSONArray3.put(aVar.a());
                }
            }
            jSONObject2.put(PushConstants.INTENT_ACTIVITY_NAME, jSONArray3);
            jSONObject2.put("groupChatShare", this.groupChatShare);
            jSONObject2.put("seckill", this.seckill);
            jSONObject.put("activity_extra", jSONObject2.toString());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91d565e4be24f6a71a9fff08407dfa1d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91d565e4be24f6a71a9fff08407dfa1d")).booleanValue();
        }
        if (obj == null || !(obj instanceof CartProduct)) {
            return false;
        }
        CartProduct cartProduct = (CartProduct) obj;
        boolean z = this.spuId == cartProduct.spuId && this.skuId == cartProduct.skuId && isSameAttrs(cartProduct.attrs) && isSameAddPriceAttrs(cartProduct.mAddPriceAttributes);
        return (this.mComboProducts == null || this.mComboProducts.size() <= 0 || cartProduct.mComboProducts == null || cartProduct.mComboProducts.size() <= 0) ? z : z && this.mComboProducts.equals(cartProduct.mComboProducts);
    }

    public boolean isSameAttrs(List<Long> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "badbd54b65f24bd8cc13f68d6250e3d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "badbd54b65f24bd8cc13f68d6250e3d6")).booleanValue();
        }
        if (this.attrs == null && list == null) {
            return true;
        }
        return this.attrs != null && this.attrs.equals(list);
    }

    public boolean isSameAddPriceAttrs(List<GoodsAttr> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "570041c9c25110d247d56f6cc36571b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "570041c9c25110d247d56f6cc36571b9")).booleanValue();
        }
        if (this.mAddPriceAttributes == null && list == null) {
            return true;
        }
        return this.mAddPriceAttributes != null && this.mAddPriceAttributes.equals(list);
    }

    public static CartProduct revertProduct(GlobalCart.g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2557f6cde1ecd721eac8ce59d231d1e0", RobustBitConfig.DEFAULT_VALUE)) {
            return (CartProduct) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2557f6cde1ecd721eac8ce59d231d1e0");
        }
        CartProduct cartProduct = new CartProduct();
        cartProduct.spuId = gVar.c;
        cartProduct.skuId = gVar.d;
        cartProduct.listType = gVar.F;
        cartProduct.count = gVar.g;
        cartProduct.tag = gVar.s;
        cartProduct.cartId = 0L;
        cartProduct.activityTag = gVar.u;
        cartProduct.activityTagList = com.sankuai.waimai.platform.domain.core.shop.a.b(gVar.E);
        if (gVar.l != null && !gVar.l.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (GoodsAttr goodsAttr : gVar.l) {
                arrayList.add(Long.valueOf(goodsAttr.id));
            }
            cartProduct.attrs = arrayList;
        }
        return cartProduct;
    }

    public CartProduct fromWmOrderedFood(WmOrderedFood wmOrderedFood) {
        Object[] objArr = {wmOrderedFood};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e7e2527a1a7842f31d273a0c5e6e4d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (CartProduct) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e7e2527a1a7842f31d273a0c5e6e4d2");
        }
        this.skuId = wmOrderedFood.getSkuId();
        this.spuId = wmOrderedFood.getSpuId();
        this.count = wmOrderedFood.getCount();
        this.mComboProducts = wmOrderedFood.comboProducts;
        GoodsAttr[] attrIds = wmOrderedFood.getAttrIds();
        ArrayList arrayList = new ArrayList();
        if (attrIds != null && attrIds.length > 0) {
            for (GoodsAttr goodsAttr : attrIds) {
                arrayList.add(Long.valueOf(goodsAttr.id));
            }
        }
        this.attrs = arrayList;
        return this;
    }

    public CartProduct fromOrderedFood(OrderedFood orderedFood, int i) {
        Object[] objArr = {orderedFood, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21f11df20b0a06a08ffe58c2aca6ffc3", RobustBitConfig.DEFAULT_VALUE)) {
            return (CartProduct) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21f11df20b0a06a08ffe58c2aca6ffc3");
        }
        this.skuId = orderedFood.getSkuId();
        this.spuId = orderedFood.getSpuId();
        this.count = orderedFood.getCount();
        this.checkStatus = orderedFood.sku.checkStatus;
        this.cartId = i;
        this.activityTag = orderedFood.getActivityTag();
        GoodsAttr[] attrIds = orderedFood.getAttrIds();
        ArrayList arrayList = new ArrayList();
        if (attrIds != null && attrIds.length > 0) {
            for (int i2 = 0; i2 < attrIds.length; i2++) {
                if (attrIds[i2] != null) {
                    if (attrIds[i2].mode == 999) {
                        this.mAddPriceAttributes.add(attrIds[i2]);
                    } else {
                        arrayList.add(Long.valueOf(attrIds[i2].id));
                    }
                }
            }
        }
        this.attrs = arrayList;
        this.groupChatShare = orderedFood.sku.getGroupChatShare();
        this.seckill = orderedFood.sku.getSeckill();
        this.mComboProducts = ComboProduct.a(orderedFood.getComboItems());
        return this;
    }

    public OrderedFood toOrderedFood() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8005d542fc6bc2dfee3fd3b519e50d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8005d542fc6bc2dfee3fd3b519e50d3");
        }
        OrderedFood orderedFood = new OrderedFood();
        orderedFood.setSpuId(this.spuId);
        orderedFood.setSkuId(this.skuId);
        orderedFood.setPhysicalTag(this.tag);
        orderedFood.setCount(this.count);
        if (this.mComboProducts != null && this.mComboProducts.size() > 0) {
            orderedFood.setComboItemList(new ArrayList<OrderedFood>() { // from class: com.sankuai.waimai.globalcart.model.CartProduct.1
                {
                    for (ComboProduct comboProduct : CartProduct.this.mComboProducts) {
                        add(ComboProduct.a(comboProduct));
                    }
                }
            });
        }
        int size = (this.attrs != null ? this.attrs.size() : 0) + (this.mAddPriceAttributes != null ? this.mAddPriceAttributes.size() : 0);
        if (size != 0) {
            GoodsAttr[] goodsAttrArr = new GoodsAttr[size];
            if (this.attrs != null && this.attrs.size() > 0) {
                int size2 = this.attrs.size();
                while (i < this.attrs.size()) {
                    GoodsAttr goodsAttr = new GoodsAttr();
                    goodsAttr.id = this.attrs.get(i).longValue();
                    goodsAttrArr[i] = goodsAttr;
                    i++;
                }
                i = size2;
            }
            if (this.mAddPriceAttributes != null && this.mAddPriceAttributes.size() > 0) {
                for (int i2 = i; i2 < size; i2++) {
                    GoodsAttr goodsAttr2 = this.mAddPriceAttributes.get(i2 - i);
                    if (goodsAttr2 != null) {
                        goodsAttrArr[i2] = goodsAttr2;
                        goodsAttrArr[i2].mode = 999;
                    }
                }
            }
            orderedFood.setAttrIds(goodsAttrArr);
        }
        return orderedFood;
    }
}

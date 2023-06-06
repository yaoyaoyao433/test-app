package com.sankuai.waimai.business.restaurant.base.shopcart;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CrossOrderedFood {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("attrs")
    @Expose
    public GoodsAttr[] attrs;
    @SerializedName("count")
    @Expose
    public int count;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("min_order_count")
    @Expose
    public int minOrderCount;
    @SerializedName("name")
    @Expose
    public String name;
    @SerializedName("origin_price")
    @Expose
    public double originPrice;
    @SerializedName("picture")
    @Expose
    public String picture;
    @SerializedName("price")
    @Expose
    public double price;
    @SerializedName("sku_id")
    @Expose
    public long skuId;
    @SerializedName("spec")
    @Expose
    public String spec;
    @SerializedName("spu_id")
    @Expose
    public long spuId;
    @SerializedName("tag_id")
    @Expose
    public String tagId;

    public CrossOrderedFood() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0d4ef946489241cd41738131bd44506", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0d4ef946489241cd41738131bd44506");
        } else {
            this.spuId = -1L;
        }
    }

    public static CrossOrderedFood convert(@NonNull ShopCartItem shopCartItem) {
        Object[] objArr = {shopCartItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "118235cea91b88019136e7f03bb9ba8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (CrossOrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "118235cea91b88019136e7f03bb9ba8f");
        }
        CrossOrderedFood crossOrderedFood = new CrossOrderedFood();
        OrderedFood orderedFood = shopCartItem.food;
        crossOrderedFood.spuId = orderedFood.getSpuId();
        crossOrderedFood.tagId = orderedFood.getPhysicalTag();
        crossOrderedFood.count = orderedFood.getCount();
        crossOrderedFood.name = orderedFood.getName();
        crossOrderedFood.price = orderedFood.getPrice();
        crossOrderedFood.originPrice = orderedFood.getOriginPrice();
        crossOrderedFood.picture = orderedFood.getPicture();
        crossOrderedFood.minOrderCount = orderedFood.getMinCount();
        crossOrderedFood.skuId = orderedFood.getSkuId();
        crossOrderedFood.spec = orderedFood.getSpec();
        crossOrderedFood.description = orderedFood.sku.getDescription();
        crossOrderedFood.attrs = orderedFood.getAttrIds();
        return crossOrderedFood;
    }
}

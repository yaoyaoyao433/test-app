package com.sankuai.waimai.sa.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.activities.ActivityPolicy;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttrList;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class Product implements Serializable {
    public static final int STATUS_NON_TIME = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_policy")
    public ActivityPolicy activityPolicy;
    @SerializedName("activity_tag")
    public String activityTag;
    @SerializedName("activity_tag_id")
    public String activityTagId;
    @SerializedName("activity_type")
    public int activityType;
    @SerializedName("description")
    public String description;
    @SerializedName("food_category")
    public SAFoodCategory foodCategory;
    @SerializedName("name")
    public String name;
    @SerializedName("picture")
    public String picture;
    @SerializedName("min_price")
    public double price;
    @SerializedName("sku")
    public Sku sku;
    @SerializedName("id")
    public long spuId;
    @SerializedName("status")
    public int status;
    @SerializedName("tag")
    public String tag;

    public GoodsSpu convert2GoodsSpu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad87cb64790cae956fb896e03a50c431", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSpu) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad87cb64790cae956fb896e03a50c431");
        }
        GoodsSpu goodsSpu = new GoodsSpu();
        goodsSpu.id = this.spuId;
        ArrayList arrayList = new ArrayList();
        GoodsSku goodsSku = new GoodsSku();
        if (this.sku != null) {
            goodsSku.id = this.sku.id;
        }
        arrayList.add(goodsSku);
        goodsSpu.setSkuList(arrayList);
        goodsSpu.setActivityTag(this.activityTag);
        return goodsSpu;
    }

    public OrderedFood convert2OrderFood() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c8893a81924e3934a1e7b39f53130943", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c8893a81924e3934a1e7b39f53130943");
        }
        OrderedFood orderedFood = new OrderedFood();
        orderedFood.setFoodLabelUrl(this.picture);
        if (this.sku != null && !com.sankuai.waimai.foundation.utils.d.a(this.sku.spuAttrs)) {
            ArrayList arrayList = new ArrayList();
            for (GoodsAttrList goodsAttrList : this.sku.spuAttrs) {
                if (goodsAttrList != null && !com.sankuai.waimai.foundation.utils.d.a(goodsAttrList.values)) {
                    Iterator<GoodsAttr> it = goodsAttrList.values.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        GoodsAttr next = it.next();
                        if (next != null && !TextUtils.isEmpty(next.getValue())) {
                            arrayList.add(next);
                            break;
                        }
                    }
                }
            }
            if (!com.sankuai.waimai.foundation.utils.d.a(arrayList)) {
                orderedFood.setAttrIds((GoodsAttr[]) arrayList.toArray(new GoodsAttr[arrayList.size()]));
            }
        }
        orderedFood.spu.setActivityTag(this.activityTag);
        orderedFood.spu.setActivityType(this.activityType);
        orderedFood.spu.setPhysicalTag(this.tag);
        orderedFood.spu.id = this.spuId;
        orderedFood.spu.setName(this.name);
        orderedFood.spu.setActivityPolicy(this.activityPolicy);
        if (this.sku != null) {
            orderedFood.setCount(this.sku.count);
            orderedFood.sku.id = this.sku.id;
            orderedFood.sku.spec = this.sku.spec;
            orderedFood.sku.price = this.sku.price;
            orderedFood.sku.originPrice = this.sku.originPrice;
            orderedFood.sku.boxNum = this.sku.boxNum;
            orderedFood.sku.boxPrice = this.sku.boxPrice;
            orderedFood.sku.minOrderCount = this.sku.minOrderCount;
            orderedFood.sku.realStock = this.sku.realStock;
            orderedFood.sku.restrict = this.sku.restrict;
            orderedFood.sku.activityStock = this.sku.activityStock;
            orderedFood.sku.status = 0;
        }
        return orderedFood;
    }
}

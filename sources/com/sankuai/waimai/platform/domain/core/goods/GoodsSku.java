package com.sankuai.waimai.platform.domain.core.goods;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.foundation.utils.w;
import com.sankuai.waimai.platform.domain.core.activities.ActivityPolicy;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodsSku implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_policy")
    @Expose
    public ActivityPolicy activityPolicy;
    @SerializedName("activity_stock")
    @Expose
    public int activityStock;
    @SerializedName("activity_tag")
    @Expose
    public String activityTag;
    @SerializedName("activity_tag_id")
    @Expose
    public String activityTagId;
    @SerializedName("activity_type")
    @Expose
    public int activityType;
    @SerializedName("full_discount_tag")
    @Expose
    public List<com.sankuai.waimai.platform.widget.tag.api.d> aiFullDiscountTags;
    @SerializedName("promotion_tag")
    @Expose
    public List<com.sankuai.waimai.platform.widget.tag.api.d> aiPromotionTags;
    @SerializedName("box_num")
    @Expose
    public double boxNum;
    @SerializedName("box_price")
    @Expose
    public double boxPrice;
    public int checkStatus;
    @SerializedName("count")
    @Expose
    public int count;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("full_discount_price")
    @Expose
    public double fullDiscountPrice;
    @SerializedName("goods_coupon_view_id")
    @Expose
    public String goodsCouponViewId;
    public String groupChatShare;
    @SerializedName("id")
    @Expose
    public long id;
    @SerializedName("min_order_count")
    @Expose
    public int minOrderCount;
    @SerializedName("origin_price")
    @Expose
    public double originPrice;
    @SerializedName("picture")
    @Expose
    public String picture;
    @SerializedName("price")
    @Expose
    public double price;
    @SerializedName("price_desc")
    @Expose
    public String priceDesc;
    @SerializedName(ICashierJSHandler.KEY_PROMOTION)
    @Expose
    public GoodsPromotion promotion;
    @SerializedName("promotion_info")
    @Expose
    public String promotionInfo;
    @SerializedName("promotion_tip")
    public String promotionTip;
    @SerializedName("real_stock")
    @Expose
    public int realStock;
    @SerializedName("remainder")
    @Expose
    public int remainder;
    @SerializedName("restrict")
    @Expose
    public int restrict;
    public int seckill;
    @SerializedName("sku_ladder_box_info")
    @Expose
    public SkuLadderBoxInfo skuLadderBoxInfo;
    @SerializedName("spec")
    @Expose
    public String spec;
    @SerializedName("spec_desc")
    @Expose
    public String specDesc;
    @SerializedName("spec_info")
    @Expose
    public String specInfo;
    @SerializedName("status")
    @Expose
    public int status;

    public GoodsSku() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1bb1f938784f60e022e5b5d331c2e60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1bb1f938784f60e022e5b5d331c2e60");
            return;
        }
        this.status = 1;
        this.checkStatus = 0;
        this.remainder = -1;
        this.fullDiscountPrice = -1.0d;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d867c0ccd3ec841f9c44791128153b60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d867c0ccd3ec841f9c44791128153b60");
            return;
        }
        try {
            this.id = jSONObject.optLong("id");
            this.spec = jSONObject.optString("spec");
            this.specInfo = jSONObject.optString("spec_info");
            this.description = jSONObject.optString("description");
            this.picture = jSONObject.optString("picture");
            this.price = jSONObject.optDouble("price");
            this.originPrice = jSONObject.optDouble("origin_price");
            this.boxNum = jSONObject.optDouble("box_num");
            this.boxPrice = jSONObject.optDouble("box_price");
            this.minOrderCount = jSONObject.optInt("min_order_count");
            this.realStock = jSONObject.optInt("real_stock");
            this.status = jSONObject.optInt("status");
            this.restrict = jSONObject.optInt("restrict");
            this.activityStock = jSONObject.optInt("activity_stock");
            this.remainder = jSONObject.optInt("remainder");
            this.count = jSONObject.optInt("count");
            this.promotionInfo = jSONObject.optString("promotion_info");
            this.promotionTip = jSONObject.optString("promotion_tip");
            this.promotion = new GoodsPromotion();
            this.promotion.fromJson(jSONObject.optJSONObject(ICashierJSHandler.KEY_PROMOTION));
            this.priceDesc = jSONObject.optString("price_desc");
            this.specDesc = jSONObject.optString("spec_desc");
            this.activityType = jSONObject.optInt("activity_type");
            this.activityTag = jSONObject.optString("activity_tag");
            if ("group_zhuanxiang_discount".equals(this.activityTag)) {
                this.groupChatShare = "POI_IM";
            } else if ("seckill_zhuanxiang_discount".equals(this.activityTag)) {
                this.seckill = 1;
            }
            this.activityTagId = jSONObject.optString("activity_tag_id");
            this.fullDiscountPrice = jSONObject.optDouble("full_discount_price", -1.0d);
            this.goodsCouponViewId = jSONObject.optString("goods_coupon_view_id");
            JSONObject optJSONObject = jSONObject.optJSONObject("activity_policy");
            this.activityPolicy = new ActivityPolicy();
            this.activityPolicy.parseJson(optJSONObject);
            String optString = jSONObject.optString("promotion_tag");
            if (!TextUtils.isEmpty(optString)) {
                this.aiPromotionTags = (List) k.a().fromJson(optString, new TypeToken<List<com.sankuai.waimai.platform.widget.tag.api.d>>() { // from class: com.sankuai.waimai.platform.domain.core.goods.GoodsSku.1
                }.getType());
            }
            String optString2 = jSONObject.optString("full_discount_tag");
            if (TextUtils.isEmpty(optString2)) {
                return;
            }
            this.aiFullDiscountTags = (List) k.a().fromJson(optString2, new TypeToken<List<com.sankuai.waimai.platform.widget.tag.api.d>>() { // from class: com.sankuai.waimai.platform.domain.core.goods.GoodsSku.2
            }.getType());
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }

    /* renamed from: clone */
    public GoodsSku m17clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "478689bc4acc5dc0d4eacdfe4aaa4bd8", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "478689bc4acc5dc0d4eacdfe4aaa4bd8") : (GoodsSku) w.a(this);
    }

    public boolean hasFullDiscountPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "795bba2062fa71b246bf9cd6537da36b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "795bba2062fa71b246bf9cd6537da36b")).booleanValue() : h.e(Double.valueOf(this.fullDiscountPrice), Double.valueOf(0.0d));
    }

    public boolean shouldShowOriginalPrice() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1e8ba3e0c2ab7890fe4c1ef3e180f36", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1e8ba3e0c2ab7890fe4c1ef3e180f36")).booleanValue() : this.originPrice > 0.0d && h.a(Double.valueOf(this.originPrice), Double.valueOf(this.price));
    }

    public boolean isSoldOut() {
        return this.status != 0;
    }

    public boolean isMinOrderCountEnough() {
        return this.realStock < 0 || this.minOrderCount <= this.realStock;
    }

    public int getDiscountLimit() {
        if (this.activityStock >= 0 && this.restrict > 0) {
            return this.activityStock > this.restrict ? this.restrict : this.activityStock;
        } else if (this.activityStock == -1 && this.restrict == 0) {
            return -1;
        } else {
            return this.activityStock >= 0 ? this.activityStock : this.restrict;
        }
    }

    public boolean isSoldable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3a6e747a15d4623982279c042848fae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3a6e747a15d4623982279c042848fae")).booleanValue();
        }
        if (getStatus() == 0) {
            return (getStock() >= getMinOrderCount() && getStock() > 0) || getStock() < 0;
        }
        return false;
    }

    public long getSkuId() {
        return this.id;
    }

    public String getSpec() {
        return this.spec;
    }

    public String getSpecInfo() {
        return this.specInfo;
    }

    public String getSkuDescription() {
        return this.description;
    }

    public String getSkuPicture() {
        return this.picture;
    }

    public double getSkuPrice() {
        return this.price;
    }

    public double getOriginPrice() {
        return this.originPrice;
    }

    public double getBoxNum() {
        return this.boxNum;
    }

    public double getBoxPrice() {
        return this.boxPrice;
    }

    public int getMinOrderCount() {
        return this.minOrderCount;
    }

    public int getStock() {
        return this.realStock;
    }

    public int getStatus() {
        return this.status;
    }

    public int getRestrictNum() {
        return this.restrict;
    }

    public double getPrice() {
        return this.price;
    }

    public int getActivityStock() {
        return this.activityStock;
    }

    public int getRemainder() {
        return this.remainder;
    }

    public int getRestrict() {
        return this.restrict;
    }

    public String getDescription() {
        return this.description;
    }

    public String getPicture() {
        return this.picture;
    }

    public int getCount() {
        return this.count;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public String getPromotionInfo() {
        return this.promotionInfo;
    }

    public GoodsPromotion getPromotion() {
        return this.promotion;
    }

    public void setStock(int i) {
        this.realStock = i;
    }

    public void setPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ffd419a60ecc2bac55dfdeadf2670ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ffd419a60ecc2bac55dfdeadf2670ee");
        } else {
            this.price = d;
        }
    }

    public void setOriginPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c85ffc166e5628c408e847be2446b70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c85ffc166e5628c408e847be2446b70");
        } else {
            this.originPrice = d;
        }
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setActivityStock(int i) {
        this.activityStock = i;
    }

    public void setSpec(String str) {
        this.spec = str;
    }

    public void setSpecInfo(String str) {
        this.specInfo = str;
    }

    public void setMinOrderCount(int i) {
        this.minOrderCount = i;
    }

    public void setBoxPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0017d88e6421f45db6a49363942d8ec3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0017d88e6421f45db6a49363942d8ec3");
        } else {
            this.boxPrice = d;
        }
    }

    public void setBoxNum(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2778029bbbf406848617f5649e04707b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2778029bbbf406848617f5649e04707b");
        } else {
            this.boxNum = d;
        }
    }

    public void setRestrict(int i) {
        this.restrict = i;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getPriceDesc() {
        return this.priceDesc;
    }

    public void setPriceDesc(String str) {
        this.priceDesc = str;
    }

    public String getSpecDesc() {
        return this.specDesc;
    }

    public void setSpecDesc(String str) {
        this.specDesc = str;
    }

    public int getActivityType() {
        return this.activityType;
    }

    public void setActivityType(int i) {
        this.activityType = i;
    }

    public ActivityPolicy getActivityPolicy() {
        return this.activityPolicy;
    }

    public void setActivityPolicy(ActivityPolicy activityPolicy) {
        this.activityPolicy = activityPolicy;
    }

    public String getActivityTag() {
        return this.activityTag;
    }

    public void setActivityTag(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2ef106fde9d4df9a100ba33170984d9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2ef106fde9d4df9a100ba33170984d9c");
            return;
        }
        this.activityTag = str;
        if ("group_zhuanxiang_discount".equals(str)) {
            this.groupChatShare = "POI_IM";
        } else if ("seckill_zhuanxiang_discount".equals(str)) {
            this.seckill = 1;
        }
    }

    public String getGroupChatShare() {
        return this.groupChatShare;
    }

    public int getSeckill() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1fbd450541ae53cc2e29cd4ec494fad1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1fbd450541ae53cc2e29cd4ec494fad1")).intValue();
        }
        if ("seckill_zhuanxiang_discount".equals(this.activityTag)) {
            this.seckill = 1;
        }
        return this.seckill;
    }

    public String getActivityTagId() {
        return this.activityTagId;
    }

    public void setActivityTagId(String str) {
        this.activityTagId = str;
    }

    public String getGoodsCouponViewId() {
        return this.goodsCouponViewId;
    }

    public void setGoodsCouponViewId(String str) {
        this.goodsCouponViewId = str;
    }

    public SkuLadderBoxInfo getSkuLadderBoxInfo() {
        return this.skuLadderBoxInfo;
    }

    public void setSkuLadderBoxInfo(SkuLadderBoxInfo skuLadderBoxInfo) {
        this.skuLadderBoxInfo = skuLadderBoxInfo;
    }

    public void convertActivityExtra2GroupChatShare(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "578af28a88773c20ab328d927e5039ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "578af28a88773c20ab328d927e5039ad");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.groupChatShare = jSONObject.optString("groupChatShare");
                this.seckill = jSONObject.optInt("seckill");
            } catch (Exception unused) {
            }
        }
    }
}

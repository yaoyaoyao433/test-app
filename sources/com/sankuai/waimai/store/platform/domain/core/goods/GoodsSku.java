package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.s;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.platform.widget.tag.api.d;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.view.price.bean.UnifyPrice;
import java.io.Serializable;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodsSku implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_stock")
    public int activityStock;
    @SerializedName("activity_tag")
    public String activityTag;
    public List<SGGoodAttrValue> attrs;
    @SerializedName("box_num")
    public double boxNum;
    @SerializedName("box_price")
    public double boxPrice;
    @SerializedName("brand_nearby_info")
    public BrandNearbyInfo brandNearbyInfo;
    public int checkStatus;
    @SerializedName("count")
    public int count;
    @SerializedName("default_selected")
    public boolean defaultSelected;
    @SerializedName("description")
    public String description;
    @SerializedName("dynamic_act_labels")
    public List<d> dynamicActLabels;
    @SerializedName("exchange_price")
    public double exchangePrice;
    @SerializedName("exchange_price_str")
    public String exchangePriceStr;
    @SerializedName("hand_price_info")
    public HandPriceInfo handPriceInfo;
    @SerializedName("id")
    public long id;
    @SerializedName("user_select_term")
    public Installment installment;
    @SerializedName("main_skus")
    public List<Long> mainSkus;
    @SerializedName("member_icon")
    public String memberIcon;
    @SerializedName("member_price")
    public double memberPrice;
    @SerializedName("min_order_count")
    public int minOrderCount;
    @SerializedName("multi_sku_stock_desc")
    public String multiSkuStockDesc;
    @SerializedName("origin_price")
    public double originPrice;
    @SerializedName("picture")
    public String picture;
    @SerializedName("price")
    public double price;
    @SerializedName(ICashierJSHandler.KEY_PROMOTION)
    public GoodsPromotion promotion;
    @SerializedName("promotion_info")
    public String promotionInfo;
    @SerializedName("promotion_tip")
    public String promotionTip;
    @SerializedName("real_stock")
    public int realStock;
    @SerializedName("remainder")
    public int remainder;
    @SerializedName("restrict")
    public int restrict;
    @SerializedName("spec")
    public String spec;
    @SerializedName("single_standard_price")
    public String standardPrice;
    @SerializedName("status")
    public int status;
    @SerializedName("stock_label")
    public String stockLabel;
    @SerializedName("subscribe")
    public int subscribe;
    @SerializedName("total_stock_label")
    public String totalStockLabel;
    @SerializedName("underline_price")
    public String underlinePrice;
    @SerializedName("unify_price")
    public UnifyPrice unifyPrice;
    @SerializedName("upccode")
    public String upcCode;

    public GoodsSku() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0e78355644b037f918548eecaa5f508", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0e78355644b037f918548eecaa5f508");
            return;
        }
        this.memberPrice = -1.0d;
        this.checkStatus = 0;
        this.status = 1;
        this.remainder = -1;
    }

    public boolean isDisplaySubscribe() {
        return this.subscribe > 0;
    }

    public boolean canSubscribe() {
        return this.subscribe == 1;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "80502281ec333eb1461f38ebbe44ef3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "80502281ec333eb1461f38ebbe44ef3b");
            return;
        }
        try {
            this.id = jSONObject.optLong("id");
            this.spec = jSONObject.optString("spec");
            this.description = jSONObject.optString("description");
            this.picture = jSONObject.optString("picture");
            this.price = jSONObject.optDouble("price");
            this.originPrice = jSONObject.optDouble("origin_price");
            this.memberPrice = jSONObject.optDouble("member_price", -1.0d);
            this.standardPrice = jSONObject.optString("single_standard_price", "");
            this.underlinePrice = jSONObject.optString("underline_price", "");
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
            this.stockLabel = jSONObject.optString("stock_label");
            this.multiSkuStockDesc = jSONObject.optString("multi_sku_stock_desc");
            this.subscribe = jSONObject.optInt("subscribe");
            this.defaultSelected = jSONObject.optBoolean("default_selected");
            this.memberIcon = jSONObject.optString("member_icon");
            String optString = jSONObject.optString("hand_price_info");
            if (!t.a(optString)) {
                this.handPriceInfo = (HandPriceInfo) i.a().fromJson(optString, new TypeToken<HandPriceInfo>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku.1
                }.getType());
            }
            this.dynamicActLabels = (List) i.a(jSONObject.optString("dynamic_act_labels"), new TypeToken<List<d>>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku.2
            }.getType());
            this.totalStockLabel = jSONObject.optString("total_stock_label");
            this.installment = (Installment) i.a(jSONObject.optString("user_select_term"), new TypeToken<Installment>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku.3
            }.getType());
            this.unifyPrice = (UnifyPrice) i.a(jSONObject.optString("unify_price"), UnifyPrice.class);
            if (jSONObject.has("brand_nearby_info")) {
                this.brandNearbyInfo = (BrandNearbyInfo) i.a(jSONObject.optString("brand_nearby_info"), new TypeToken<BrandNearbyInfo>() { // from class: com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku.4
                }.getType());
            }
            this.upcCode = jSONObject.getString("upccode");
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }

    /* renamed from: clone */
    public GoodsSku m20clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e1101f1777a6c7636f30d2fcbdab57d8", RobustBitConfig.DEFAULT_VALUE) ? (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e1101f1777a6c7636f30d2fcbdab57d8") : (GoodsSku) s.a(this);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7a9a1b828a63ffd625176e31ab3b738b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7a9a1b828a63ffd625176e31ab3b738b")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6c8447b6042848e880b1f6d9a89e32f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6c8447b6042848e880b1f6d9a89e32f");
        } else {
            this.price = d;
        }
    }

    public void setOriginPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a68cf4239472ab03e26aba9eb8727d52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a68cf4239472ab03e26aba9eb8727d52");
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

    public void setMinOrderCount(int i) {
        this.minOrderCount = i;
    }

    public void setBoxPrice(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c3036ca77d8b04e6e438388240d6ffd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c3036ca77d8b04e6e438388240d6ffd0");
        } else {
            this.boxPrice = d;
        }
    }

    public void setBoxNum(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ebac69ff70a5106ce66cd236a872e9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ebac69ff70a5106ce66cd236a872e9c");
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

    public void setStockLabel(String str) {
        this.stockLabel = str;
    }

    public String getStockLabel() {
        return this.stockLabel;
    }

    public void clearInstallment() {
        this.installment = null;
    }
}

package com.sankuai.waimai.business.order.api.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CollectOrder implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("collect_order_tip")
    public String collectOrderTip;
    @SerializedName("coupon_discount_price")
    public double couponDiscountPrice;
    @SerializedName("coupon_price")
    public double couponPrice;
    @SerializedName("discount_money")
    public double discountMoney;
    @SerializedName("stage_price_list")
    public List<DiscountStageInfo> discountStageInfo;
    @SerializedName("coupon_collect_stid")
    public String mCouponCollectStid;
    @SerializedName("recommend_coupon_view_id")
    public String recommendCouponViewId;
    @SerializedName("spread_money")
    public double spreadMoney;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class DiscountStageInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("discount_price")
        public double discountPrice;
        @SerializedName("price")
        public double price;
        @SerializedName("spread_price")
        public double spreadPrice;

        public static DiscountStageInfo fromJson(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dd5199728b95cbaa27da46e6bcee5142", RobustBitConfig.DEFAULT_VALUE)) {
                return (DiscountStageInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dd5199728b95cbaa27da46e6bcee5142");
            }
            if (jSONObject == null) {
                return null;
            }
            DiscountStageInfo discountStageInfo = new DiscountStageInfo();
            discountStageInfo.discountPrice = jSONObject.optDouble("discount_price", -1.0d);
            discountStageInfo.price = jSONObject.optDouble("price", -1.0d);
            discountStageInfo.spreadPrice = jSONObject.optDouble("spread_price", -1.0d);
            return discountStageInfo;
        }

        public static List<DiscountStageInfo> fromJsonArray(JSONArray jSONArray) {
            Object[] objArr = {jSONArray};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9b5d46959e8051698aac67b6dc433525", RobustBitConfig.DEFAULT_VALUE)) {
                return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9b5d46959e8051698aac67b6dc433525");
            }
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                DiscountStageInfo fromJson = fromJson(jSONArray.optJSONObject(i));
                if (fromJson != null) {
                    arrayList.add(fromJson);
                }
            }
            return arrayList;
        }
    }

    public static CollectOrder fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "028aeb0b92833883b76bfb762b4859b6", RobustBitConfig.DEFAULT_VALUE)) {
            return (CollectOrder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "028aeb0b92833883b76bfb762b4859b6");
        }
        if (jSONObject == null) {
            return null;
        }
        CollectOrder collectOrder = new CollectOrder();
        collectOrder.spreadMoney = jSONObject.optDouble("spread_money", -1.0d);
        collectOrder.couponPrice = jSONObject.optDouble("coupon_price", -1.0d);
        collectOrder.couponDiscountPrice = jSONObject.optDouble("coupon_discount_price", -1.0d);
        collectOrder.collectOrderTip = jSONObject.optString("collect_order_tip");
        collectOrder.recommendCouponViewId = jSONObject.optString("recommend_coupon_view_id");
        collectOrder.mCouponCollectStid = jSONObject.optString("coupon_collect_stid");
        collectOrder.discountMoney = jSONObject.optDouble("discount_money", 0.0d);
        collectOrder.discountStageInfo = DiscountStageInfo.fromJsonArray(jSONObject.optJSONArray("stage_price_list"));
        return collectOrder;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class OrderCollectEvent implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = -3812928941301977300L;
        private List<GoodsSpu> mGoodsSpus;
        private String poiId;
        private String poiIdStr;

        @Deprecated
        public OrderCollectEvent(String str, List<GoodsSpu> list) {
            Object[] objArr = {str, list};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc344e392106287e89f1db98d617b9f2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc344e392106287e89f1db98d617b9f2");
                return;
            }
            this.poiId = str;
            this.mGoodsSpus = list;
        }

        public OrderCollectEvent(String str, String str2, List<GoodsSpu> list) {
            Object[] objArr = {str, str2, list};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0219f470f264aae72b73dca02d667704", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0219f470f264aae72b73dca02d667704");
                return;
            }
            this.poiId = str;
            this.poiIdStr = str2;
            this.mGoodsSpus = list;
        }

        public String getPoiId() {
            return this.poiId;
        }

        public String getPoiIdStr() {
            return this.poiIdStr;
        }

        public List<GoodsSpu> getGoodsSpus() {
            return this.mGoodsSpus;
        }
    }
}

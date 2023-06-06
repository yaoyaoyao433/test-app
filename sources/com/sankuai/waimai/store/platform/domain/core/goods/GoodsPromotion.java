package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodsPromotion implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("act_recent_end_time")
    public long activityDeadline;
    @SerializedName("activity_id")
    public String activityId;
    @SerializedName("activity_type")
    public String activityType;
    @SerializedName("activity_type_text")
    public String activityTypeText;
    @SerializedName("button_text")
    public String buttonText;
    @SerializedName("count_down_background_color")
    public String countDownBgColor;
    @SerializedName("count_down_display_day")
    public int countDownDisplayDay;
    @SerializedName("count_down_text_margin_right")
    public int countDownMarginRight;
    @SerializedName("count_down_text_color")
    public String countDownTextColor;
    @SerializedName("coupon")
    public Poi.PoiCouponItem coupon;
    @SerializedName("coupon_type")
    public int couponType;
    @SerializedName("sever_current_time")
    public long currentTime;
    @SerializedName("flash_sale_label")
    public String flashSaleLabel;
    @SerializedName("flash_sale")
    public int flashSaleOrPromotion;
    @SerializedName("height")
    public int height;
    @SerializedName("label_pic")
    public String labelPic;
    @SerializedName("label_type")
    public int labelType;
    @SerializedName("promotion_bg_height")
    public int promotionBgHeight;
    @SerializedName("promotion_style_type")
    public int promotionBgStyleType;
    @SerializedName("promotion_bg_url")
    public String promotionBgUrl;
    @SerializedName("promotion_text_color")
    public String promotionTextColor;
    @SerializedName("promotion_text")
    public String promotionTxt;
    @SerializedName("receive_status")
    public int receiveStatus;
    @SerializedName("scheme_url")
    public String schemeUrl;
    @SerializedName("sku_info_color")
    public String skuInfoColor;
    @SerializedName("width")
    public int width;

    public GoodsPromotion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eaa1d572a39f66bea54711b19b1200a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eaa1d572a39f66bea54711b19b1200a4");
            return;
        }
        this.couponType = -999;
        this.receiveStatus = -999;
        this.promotionBgHeight = 44;
    }

    public void fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5308198986bba2c4567d30d9842bbd22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5308198986bba2c4567d30d9842bbd22");
        } else if (jSONObject == null) {
        } else {
            this.labelPic = jSONObject.optString("label_pic");
            this.promotionTxt = jSONObject.optString("promotion_text");
            this.skuInfoColor = jSONObject.optString("sku_info_color");
            this.width = jSONObject.optInt("width");
            this.height = jSONObject.optInt("height");
            this.labelType = jSONObject.optInt("label_type");
            this.currentTime = jSONObject.optLong("sever_current_time", System.currentTimeMillis());
            this.activityDeadline = jSONObject.optLong("act_recent_end_time");
            this.activityTypeText = jSONObject.optString("activity_type_text");
            this.flashSaleOrPromotion = jSONObject.optInt("flash_sale");
            this.flashSaleLabel = jSONObject.optString("flash_sale_label");
            this.activityType = jSONObject.optString("activity_type");
            this.schemeUrl = jSONObject.optString("scheme_url");
            this.couponType = jSONObject.optInt("coupon_type", -999);
            this.receiveStatus = jSONObject.optInt("receive_status", -999);
            this.promotionTextColor = jSONObject.optString("promotion_text_color");
            this.countDownBgColor = jSONObject.optString("count_down_background_color");
            this.countDownTextColor = jSONObject.optString("count_down_text_color");
            this.countDownMarginRight = jSONObject.optInt("count_down_text_margin_right");
            this.countDownDisplayDay = jSONObject.optInt("count_down_display_day");
            this.promotionBgUrl = jSONObject.optString("promotion_bg_url");
            this.promotionBgHeight = jSONObject.optInt("promotion_bg_height");
            this.promotionBgStyleType = jSONObject.optInt("promotion_style_type");
            this.activityId = jSONObject.optString("activity_id");
            try {
                this.coupon = (Poi.PoiCouponItem) i.a(jSONObject.optString("coupon"), Poi.PoiCouponItem.class);
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.a(e);
            }
            this.buttonText = jSONObject.optString("button_text");
        }
    }
}

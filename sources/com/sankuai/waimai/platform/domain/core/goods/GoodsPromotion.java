package com.sankuai.waimai.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodsPromotion implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_text")
    @Expose
    public String activityText;
    @SerializedName("addition_text")
    @Expose
    public String additionText;
    @SerializedName("height")
    @Expose
    public int height;
    @SerializedName("label_pic")
    @Expose
    public String labelPic;
    @SerializedName("promotion_text")
    @Expose
    public String promotionTxt;
    @SerializedName("restrict_text")
    @Expose
    public String restrictText;
    @SerializedName("sku_info_color")
    @Expose
    public String skuInfoColor;
    @SerializedName("width")
    @Expose
    public int width;

    public void fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe5802314a5d08edd77fe97537650f8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe5802314a5d08edd77fe97537650f8b");
        } else if (jSONObject == null) {
        } else {
            this.labelPic = jSONObject.optString("label_pic");
            this.promotionTxt = jSONObject.optString("promotion_text");
            this.skuInfoColor = jSONObject.optString("sku_info_color");
            this.width = jSONObject.optInt("width");
            this.height = jSONObject.optInt("height");
            this.activityText = jSONObject.optString("activity_text");
            this.additionText = jSONObject.optString("addition_text");
            this.restrictText = jSONObject.optString("restrict_text");
        }
    }
}

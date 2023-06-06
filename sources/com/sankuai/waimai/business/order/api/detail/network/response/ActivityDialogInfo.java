package com.sankuai.waimai.business.order.api.detail.network.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ActivityDialogInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_type")
    public int activityType;
    @SerializedName("auto_popup")
    public int autoPopup;
    @SerializedName("button_name")
    public String buttonName;
    @SerializedName("click_url")
    public String clickUrl;
    @SerializedName("coupon_collection_tip")
    public Map<String, Object> couponCollectionTip;
    @SerializedName("share_popup_icon")
    public String sharePopIcon;
    @SerializedName("share_popup_text")
    public String sharePopText;
    @SerializedName("share_tip_icon")
    public String shareTipIcon;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ecc41bd7fd3bf134a6594b48843fc9f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ecc41bd7fd3bf134a6594b48843fc9f0");
            return;
        }
        this.buttonName = jSONObject.optString("button_name");
        this.clickUrl = jSONObject.optString("click_url");
        this.autoPopup = jSONObject.optInt("auto_popup");
        this.sharePopIcon = jSONObject.optString("share_popup_icon");
        this.sharePopText = jSONObject.optString("share_popup_text");
        this.shareTipIcon = jSONObject.optString("share_tip_icon");
        this.activityType = jSONObject.optInt("activity_type");
    }
}

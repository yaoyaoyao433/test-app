package com.sankuai.waimai.business.order.api.submit.model;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class BusinessType implements Serializable {
    public static final int NEW_CUSTOMER = 3;
    public static final int NONE = -1;
    public static final int NORMAL = 0;
    public static final int PICK_UP_DELIVERY = 2;
    public static final int SELF_DELIVERY = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bubble")
    public String bubble;
    @SerializedName(DMKeys.KEY_SELECTED)
    @Expose
    public int selected;
    @SerializedName("self_delivery_agree_no_sign_tip")
    public String selfDeliveryAgreeNoSignTip;
    @SerializedName("self_delivery_agree_text")
    public String selfDeliveryAgreeText;
    @SerializedName("self_delivery_agree_url")
    public String selfDeliveryAgreeUrl;
    @SerializedName("self_delivery_agree_selected")
    public int selfDeliveryAgressSelected;
    @SerializedName("tag")
    public String tabTagInfo;
    @SerializedName("tab_title")
    public String tabTitle;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("type")
    @Expose
    public int type;

    public void fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f28102ccf87db3b7d0276adb25a419a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f28102ccf87db3b7d0276adb25a419a3");
            return;
        }
        this.title = jSONObject.optString("title");
        this.type = jSONObject.optInt("type");
        this.selected = jSONObject.optInt(DMKeys.KEY_SELECTED);
        this.selfDeliveryAgressSelected = jSONObject.optInt("self_delivery_agree_selected");
        this.selfDeliveryAgreeUrl = jSONObject.optString("self_delivery_agree_url");
        this.tabTagInfo = jSONObject.optString("tag");
        this.tabTitle = jSONObject.optString("tab_title");
        this.bubble = jSONObject.optString("bubble");
        this.selfDeliveryAgreeText = jSONObject.optString("self_delivery_agree_text");
        this.selfDeliveryAgreeNoSignTip = jSONObject.optString("self_delivery_agree_no_sign_tip");
    }
}

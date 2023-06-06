package com.sankuai.waimai.business.order.submit.model;

import android.support.annotation.Keep;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CouponPackage implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(PushConstants.INTENT_ACTIVITY_NAME)
    public String activity;
    @SerializedName("agreement_url")
    public String agreementUrl;
    @SerializedName("description_title")
    public String descriptionTitle;
    @SerializedName("floating_layer_text")
    public String floatingLayerText;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("original_price")
    public double originalPrice;
    @SerializedName("price")
    public double price;
    @SerializedName("product_description")
    public String productDescription;
    @SerializedName("product_id")
    public String productId;
    @SerializedName("protocol_link")
    public String protocolLink;
    @SerializedName("protocol_text")
    public String protocolText;
    @SerializedName(DMKeys.KEY_SELECTED)
    public boolean selected;
    @SerializedName("show")
    public boolean show;
    @SerializedName("type")
    public int type;
    @SerializedName("user_buy_status")
    public int userBuyStatus;
}

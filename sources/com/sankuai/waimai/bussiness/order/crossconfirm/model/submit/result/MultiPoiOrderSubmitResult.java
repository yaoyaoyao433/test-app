package com.sankuai.waimai.bussiness.order.crossconfirm.model.submit.result;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MultiPoiOrderSubmitResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("wm_order_pay_type")
    public int orderPayType;
    @SerializedName("order_view_ids")
    public String orderViewIDs;
    @SerializedName("pay_tip")
    public String payTip;
    @SerializedName("pay_token")
    public String payToken;
    @SerializedName("support_paytypes")
    public int supportPaytypes;
    @SerializedName("tradeno")
    public String tradeno;
}

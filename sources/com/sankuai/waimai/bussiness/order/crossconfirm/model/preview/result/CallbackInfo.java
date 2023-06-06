package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CallbackInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_callback_info")
    public String activityInfo;
    @SerializedName("activity_info_for_coupon")
    public String activityInfoForCoupon;
    @SerializedName("preview_order_callback_info")
    public String previewOrderCallbackInfo;
    @SerializedName("remark_tag_callback_info")
    public String remarkTagCallbackInfo;
}

package com.sankuai.waimai.business.restaurant.poicontainer.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class FullReduceAnim {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("is_show_tips")
    public boolean isShowTips;
    @SerializedName("product_picture")
    public String productPicUrl;
    @SerializedName("tips_text")
    public String tipsText;
    @SerializedName("trace_id")
    public String traceId;
}

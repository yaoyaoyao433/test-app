package com.sankuai.waimai.bussiness.order.detailnew.network.response;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderStatusTipsArea implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("click_url")
    public String clickUrl;
    @SerializedName("tip_desc")
    public String tipDesc;
    @SerializedName("tip_icon")
    public String tipIcon;
}

package com.sankuai.waimai.business.order.api.detail.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.api.model.OrderDeliverPackInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class LogisticsInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("desc")
    public String desc;
    @SerializedName("packInfos")
    public List<OrderDeliverPackInfo> packInfos;
    @SerializedName("schema_url")
    public String schemaUrl;
}

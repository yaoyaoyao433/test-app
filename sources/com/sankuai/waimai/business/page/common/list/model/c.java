package com.sankuai.waimai.business.page.common.list.model;

import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class c implements Serializable {
    @SerializedName("need_show")
    public boolean a;
    @SerializedName("title")
    public String b;
    @SerializedName("sub_title")
    public String c;
    @SerializedName("guide_icon")
    public String d;
    @SerializedName("entrance_icon")
    public String e;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String f;
}

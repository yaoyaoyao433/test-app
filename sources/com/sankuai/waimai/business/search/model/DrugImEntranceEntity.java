package com.sankuai.waimai.business.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class DrugImEntranceEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bubble_pic_url")
    public String bubbleText;
    @SerializedName("main_pic_url")
    public String picUrl;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
}

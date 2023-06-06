package com.sankuai.waimai.store.order.prescription.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class InquiryTemplateModel implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("image_height")
    public int imageHeight;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("scheme_name")
    public String schemeName;
    @SerializedName("status")
    public int status;
    @SerializedName("sub_title")
    public String subTitle;
    @SerializedName("title")
    public String title;
    @SerializedName("title_image")
    public String titleImage;
}

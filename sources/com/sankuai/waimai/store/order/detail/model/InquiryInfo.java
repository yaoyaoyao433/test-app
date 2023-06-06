package com.sankuai.waimai.store.order.detail.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class InquiryInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("doctor")
    public String doctor;
    @SerializedName("inquiry_history_info")
    public String inquiryHistoryInfo;
    @SerializedName("inquiry_history_url")
    public String inquiryHistoryUrl;
    @SerializedName("rp_pic_invalid_info")
    public String invalidInfo;
    @SerializedName("rp_pic_page_subtitle")
    public String pageSubTitle;
    @SerializedName("rp_pic_page_title")
    public String pageTitle;
    @SerializedName("pharmacist")
    public String pharmacist;
    @SerializedName("rp_pic_info")
    public String rpPicInfo;
    @SerializedName("rp_pic_urls")
    public List<String> urls;
}

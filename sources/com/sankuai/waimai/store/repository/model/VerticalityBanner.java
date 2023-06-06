package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class VerticalityBanner implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activityId")
    public long activityId;
    @SerializedName("ad_extra")
    public SGAdExtra adExtra;
    @SerializedName("banner_act_id")
    public long adId;
    @SerializedName("banner_ad_type")
    public int bannerType;
    @SerializedName("h5_url")
    public String h5Url;
    @SerializedName("banner_pic_url")
    public String picUrl;
    @SerializedName("position")
    public int position;
    @SerializedName("target_type")
    public int targetType;
    @SerializedName("type")
    public int type;

    public boolean isAdBanner() {
        return this.bannerType == 1 || this.bannerType == 2;
    }

    public boolean needReportToShanghai() {
        return this.bannerType == 2 && this.adExtra != null;
    }
}

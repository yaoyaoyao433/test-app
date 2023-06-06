package com.sankuai.waimai.store.drug.coupon.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugMemberCouponStatusResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("member_card_info")
    public MemberCouponCardInfo cardInfo;
    @SerializedName("mobile")
    public String mobile;
    @SerializedName("new_medicine_tenant")
    public boolean newMedicineTenant;
    @SerializedName("protocol_url")
    public String protocolUrl;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("sub_title")
    public String subTitle;
    @SerializedName("title")
    public String title;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class MemberCouponCardInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("brand_id")
        public int brandId;
        @SerializedName("brand_name")
        public String brandName;
        @SerializedName("logo_url")
        public String logoUrl;
    }
}

package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MemberCouponStatusResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("member_card_info")
    public MemberCouponCardInfo cardInfo;
    @SerializedName(NetLogConstants.Details.SCHEME)
    public String scheme;
    @SerializedName("sub_title")
    public String subTitle;
    @SerializedName("title")
    public String title;
}

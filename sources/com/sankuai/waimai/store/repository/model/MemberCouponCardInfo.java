package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MemberCouponCardInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("brand_name")
    public String brandName;
    @SerializedName("logo_url")
    public String logoUrl;
}

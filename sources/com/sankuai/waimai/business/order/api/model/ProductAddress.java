package com.sankuai.waimai.business.order.api.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class ProductAddress implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_detail")
    public String addressDetail;
    @SerializedName("name")
    public String name;
    @SerializedName("phone")
    public String phone;
}

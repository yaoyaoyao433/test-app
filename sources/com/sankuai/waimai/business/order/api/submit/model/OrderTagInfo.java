package com.sankuai.waimai.business.order.api.submit.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class OrderTagInfo implements Serializable {
    public static final int PATIENT_INFO_TYPE = 2;
    public static final int RX_INFO_TYPE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("order_tag_mode")
    public int orderTagMode;
    @SerializedName("order_tag_type")
    public int orderTagType;
}

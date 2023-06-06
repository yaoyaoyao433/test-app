package com.sankuai.waimai.platform.domain.core.poi;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MtDeliveryInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("mt_delivery_tags")
    public List<String> mtDeliveryTags;
    @SerializedName("mt_delivery_tip")
    public String mtDeliveryTip;
}

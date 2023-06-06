package com.sankuai.waimai.store.search.model.drugdynamictags;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class DrugSearchDeliveryExtraInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("promt_dot_text")
    public String deliveryTips;
    @SerializedName("is_spu_express_delivery")
    public boolean isDelivery;
    @SerializedName("poi_delivery_tap_space")
    public int poiDeliveryTapSpace;
}

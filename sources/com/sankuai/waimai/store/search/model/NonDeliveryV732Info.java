package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class NonDeliveryV732Info implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isExposed = false;
    @SerializedName("poi_nondelivery_context")
    public String poiNonContent;
    @SerializedName("show_address")
    public boolean showAddress;
}

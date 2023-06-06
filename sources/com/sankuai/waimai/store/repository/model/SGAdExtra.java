package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGAdExtra implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_charge_info")
    public String adChargeInfo;
    @SerializedName("ad_type")
    public int adType;
    @SerializedName("wm_poi_id")
    public String wmPoiId;
}

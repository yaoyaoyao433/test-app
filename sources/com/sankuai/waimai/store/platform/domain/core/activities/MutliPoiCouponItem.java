package com.sankuai.waimai.store.platform.domain.core.activities;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MutliPoiCouponItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6197989506491892756L;
    @SerializedName("code")
    public int code;
    @SerializedName("data")
    public Poi.PoiCouponItem data;
    @SerializedName("msg")
    public String msg;
}

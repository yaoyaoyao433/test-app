package com.sankuai.waimai.business.address.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class RefreshLocationResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_name")
    public String addressName;
    @SerializedName("city_name")
    public String cityName;
    @SerializedName(Constants.PRIVACY.KEY_LATITUDE)
    public String latitude;
    @SerializedName(Constants.PRIVACY.KEY_LONGITUDE)
    public String longitude;
}

package com.sankuai.waimai.foundation.location.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.locate.locator.GearsLocator;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CityResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("addr_info")
    public List<AdminInfo> addInfo;
    @SerializedName("formatted_address")
    public String address;
    @SerializedName("city")
    public String city;
    @SerializedName("cityPinyin")
    public String cityPinyin;
    @SerializedName(GearsLocator.DISTRICT)
    public String district;
    @SerializedName("id")
    public long id;
    @SerializedName("isOpen")
    public boolean isOpen;
    @SerializedName("mt_back_city_info")
    public List<MtBackCityInfo> mtBackCityInfo;
    @SerializedName("province")
    public String province;
    @SerializedName("regeo_info")
    public c regeoInfo;
}

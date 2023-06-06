package com.sankuai.waimai.foundation.location.v2;

import android.support.annotation.Keep;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.model.CityResponse;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class City {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String cityCode;
    private String cityName;
    private long createTime;

    public City(CityResponse cityResponse) {
        Object[] objArr = {cityResponse};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "396561d3a44c25a7161c02e236cfbef5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "396561d3a44c25a7161c02e236cfbef5");
        } else if (cityResponse != null) {
            this.cityCode = String.valueOf(cityResponse.id);
            this.cityName = cityResponse.city;
        }
    }

    public static City parse(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7357bed5166d8a3f9882ea7690d2c7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (City) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7357bed5166d8a3f9882ea7690d2c7a");
        }
        try {
            return (City) d.a().fromJson(str, (Class<Object>) City.class);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    public City() {
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(String str) {
        this.cityCode = str;
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String str) {
        this.cityName = str;
    }

    public long getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00c19d36776edac84afb3d059644481e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00c19d36776edac84afb3d059644481e");
        } else {
            this.createTime = j;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb695a4415d6e2378518f87f7debc07a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb695a4415d6e2378518f87f7debc07a") : d.a().toJson(this);
    }
}

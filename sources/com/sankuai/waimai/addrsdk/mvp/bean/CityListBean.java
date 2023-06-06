package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CityListBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("idx_city_list")
    private List<PinYinIndexCity> cityNav;
    @SerializedName("hot_city_list")
    private List<City> mHostCities;
    @SerializedName("idx_list")
    private String[] pinyins;

    public String[] getPinyins() {
        return this.pinyins;
    }

    public void setPinyins(String[] strArr) {
        this.pinyins = strArr;
    }

    public List<City> getHostCities() {
        return this.mHostCities;
    }

    public void setHostCities(List<City> list) {
        this.mHostCities = list;
    }

    public List<PinYinIndexCity> getCityNav() {
        return this.cityNav;
    }

    public void setCityNav(List<PinYinIndexCity> list) {
        this.cityNav = list;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class City implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("city_name")
        private String cityName;
        @SerializedName("city_pinyin")
        private String cityPinyin;

        public String getCityName() {
            return this.cityName;
        }

        public void setCityName(String str) {
            this.cityName = str;
        }

        public String getCityPinyin() {
            return this.cityPinyin;
        }

        public void setCityPinyin(String str) {
            this.cityPinyin = str;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class PinYinIndexCity {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("city_list")
        private List<City> cities;
        @SerializedName("idx")
        private String idx;

        public List<City> getCities() {
            return this.cities;
        }

        public void setCities(List<City> list) {
            this.cities = list;
        }

        public String getIdx() {
            return this.idx;
        }

        public void setIdx(String str) {
            this.idx = str;
        }
    }
}

package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class CitySearchListBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("city_list")
    private List<City> cities;
    @SerializedName("no_result_tips")
    private String noResultTips;

    public String getNoResultTips() {
        return this.noResultTips;
    }

    public void setNoResultTips(String str) {
        this.noResultTips = str;
    }

    public List<City> getCities() {
        return this.cities;
    }

    public void setCities(List<City> list) {
        this.cities = list;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class City {
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
}

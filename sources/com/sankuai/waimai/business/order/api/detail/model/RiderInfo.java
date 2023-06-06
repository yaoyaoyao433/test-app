package com.sankuai.waimai.business.order.api.detail.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RiderInfo implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName("show_rider_icon")
    public int b;
    @SerializedName("rider_name")
    public String c;
    @SerializedName("rider_icon")
    public String d;
    @SerializedName("rider_page_url")
    public String e;
    @SerializedName("rider_latitude")
    public long f;
    @SerializedName("rider_longitude")
    public long g;
    @SerializedName("rider_icon_frame")
    public String h;
    @SerializedName("contact_way")
    public List<b> i;
    @SerializedName("rider_car_icon")
    public String j;
    @SerializedName("self_logistics_platform")
    public c k;
    @SerializedName("show_rider_azimuth")
    public int l;
    @SerializedName("rider_azimuth")
    public double m;
    @SerializedName("rider_condition_tips")
    public RiderConditionTips n;
    @SerializedName("rider_type")
    public int o;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class RiderConditionTips implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("box_disinfection_desc")
        public String boxDisinfectionDesc;
        @SerializedName("carousel_data_list")
        public a[] carouselDataList;
        @SerializedName("rider_overhead_desc")
        public RiderConditionTipsCarouseData riderOverheadDesc;
        @SerializedName("rider_temperature_desc")
        public String riderTemperatureDesc;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class RiderConditionTipsCarouseData implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("bg_color")
        public String bgColor;
        @SerializedName("data")
        public String data;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("text_color")
        public String textColor;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("data")
        public String a;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName("type")
        public int a;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String b;
        @SerializedName("phone")
        public String c;
        @SerializedName("rider_app_id")
        public int d;
        @SerializedName("rider_dx_id")
        public long e;
        @SerializedName("type_text")
        public String f;
        @SerializedName("bubble_text")
        public String g;
        @SerializedName("rider_im_entrance_status")
        public int h;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements Serializable {
        @SerializedName("name")
        public String a;
        @SerializedName("number")
        public String b;
        @SerializedName("express_type")
        public int c;
        @SerializedName("number_valid")
        public int d;
    }

    public final LatLng a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c568d8169ceb7dd6237df6730154b033", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c568d8169ceb7dd6237df6730154b033");
        }
        if (this.f == 0 || this.g == 0) {
            return null;
        }
        return new LatLng((this.f * 1.0d) / 1000000.0d, (this.g * 1.0d) / 1000000.0d);
    }
}

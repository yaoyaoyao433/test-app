package com.sankuai.waimai.business.order.api.detail.model;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b implements Serializable {
    public static ChangeQuickRedirect a;
    @SerializedName(DataConstants.CITY_ID)
    public int b;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String c;
    @SerializedName("poi_icon")
    public String d;
    @SerializedName("poi_latitude")
    public long e;
    @SerializedName("poi_longitude")
    public long f;
    @SerializedName("poi_address")
    public String g;
    @SerializedName("contact_way")
    public List<a> h;
    @SerializedName("calling_rider_strength")
    public int i;
    @SerializedName("poi_prepare_gif")
    public String j;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("type")
        public int a;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String b;
        @SerializedName("big_icon")
        public String c;
        @SerializedName("poi_phone_list")
        public List<c> d;
        @SerializedName("poi_im")
        public C0752b e;
        @SerializedName("type_text")
        public String f;
        @SerializedName("bubble_text")
        public String g;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.order.api.detail.model.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0752b implements Serializable {
        @SerializedName("poi_im_entrance_status")
        public int a;
        @SerializedName("poi_dx_id")
        public long b;
        @SerializedName("b_app_id")
        public int c;
        @SerializedName("remind_msg")
        public String d;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c implements Serializable {
        @SerializedName("type")
        public int a;
        @SerializedName("title")
        public String b;
        @SerializedName("phone")
        public String c;
    }

    public final LatLng a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3ffdca507de9cb8ed2db24c62117ae3", RobustBitConfig.DEFAULT_VALUE)) {
            return (LatLng) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3ffdca507de9cb8ed2db24c62117ae3");
        }
        if (this.e == 0 || this.f == 0) {
            return null;
        }
        return new LatLng((this.e * 1.0d) / 1000000.0d, (this.f * 1.0d) / 1000000.0d);
    }
}

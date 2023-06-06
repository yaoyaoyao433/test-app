package com.sankuai.waimai.business.im.group.model;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.business.im.model.RiderImInfo;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements Serializable {
    @SerializedName("poi_info")
    public b a;
    @SerializedName("rider_info")
    public C0743c b;
    @SerializedName("user_info")
    public d c;
    @SerializedName("basic_info")
    public a d;
    @SerializedName("wm_common_data")
    public String e;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a implements Serializable {
        @SerializedName("group_id")
        public long a;
        @SerializedName("tip_msg")
        public String b;
        @SerializedName("session_status")
        public int c;
        @SerializedName("remind_seconds")
        public int d;
        @SerializedName("remind_msg")
        public String e;
        @SerializedName("input_field_msg")
        public String f;
        @SerializedName("default_msg")
        public String[] g;
        @SerializedName("input_field_status")
        public int h;
        @SerializedName("add_im_msg_hint")
        public String i;
        @SerializedName("max_common_msg_number")
        public int j;
        @SerializedName("intro_title")
        public String k;
        @SerializedName("intro_content")
        public String l;
        @SerializedName("group_create_time")
        public long m;
        @SerializedName("order_time")
        public long n;
        @SerializedName("rider_changed_msg")
        public String o;
        @SerializedName("custom_msg_list")
        public com.sankuai.waimai.business.im.common.model.f[] p;
        @SerializedName("send_location_url")
        public String q;
        @SerializedName("send_location_toast")
        public String r;
        @SerializedName("orient")
        public com.sankuai.waimai.business.im.model.i s;
        @SerializedName("show_emotion")
        public int t;
        @SerializedName("modify_address")
        public int u;
        @SerializedName("lockdown_aoi")
        public int v;
        @SerializedName("button_list")
        public List<RiderImInfo.a> w;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements Serializable {
        @SerializedName(AgainManager.EXTRA_POI_NAME)
        public String a;
        @SerializedName("poi_picture_url")
        public String b;
        @SerializedName("poi_phone")
        public String c;
        @SerializedName("poi_dx_id")
        public long d;
        @SerializedName("b_app_id")
        public int e;
        @SerializedName("poi_id")
        public long f;
        @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
        public String g;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.im.group.model.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0743c implements Serializable {
        @SerializedName("rider_phone")
        public String a;
        @SerializedName("rider_name")
        public String b;
        @SerializedName("rider_avatar")
        public String c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d implements Serializable {
        @SerializedName("recipient_phone")
        public String a;
        @SerializedName("use_privacy")
        public int b;
        @SerializedName("recipient_name")
        public String c;
        @SerializedName("recipient_address")
        public String d;
        @SerializedName("address_longitude")
        public long e;
        @SerializedName("address_latitude")
        public long f;
    }
}

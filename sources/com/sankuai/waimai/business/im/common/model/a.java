package com.sankuai.waimai.business.im.common.model;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements Serializable {
    @SerializedName("poi_info")
    public b a;
    @SerializedName("basic_info")
    public C0733a b;
    @SerializedName("wm_common_data")
    public String c;

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
    /* renamed from: com.sankuai.waimai.business.im.common.model.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0733a implements Serializable {
        @SerializedName("group_id")
        public long a;
        @SerializedName("group_type")
        public int b;
        @SerializedName("group_state")
        public int c;
        @SerializedName("tip_msg")
        public String d;
        @SerializedName("tip_icon")
        public String e;
        @SerializedName("intro_content")
        public String f;
        @SerializedName("im_background_img")
        public String g;
        @SerializedName("im_msg")
        public String h;
        @SerializedName("close_reminder")
        public String i;
        @SerializedName("input_field_status")
        public int j;
        @SerializedName("input_field_msg")
        public String k;
        @SerializedName("group_create_time")
        public long l;
        @SerializedName("show_emotion")
        public int m;
        @SerializedName("order_scheme")
        public String n;

        public final boolean a() {
            return this.c == 2;
        }
    }
}

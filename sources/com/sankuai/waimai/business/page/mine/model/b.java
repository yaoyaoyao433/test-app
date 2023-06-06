package com.sankuai.waimai.business.page.mine.model;

import com.google.gson.annotations.SerializedName;
import com.sankuai.meituan.model.dao.region.RegionLinkDao;
import com.sankuai.waimai.business.im.api.msgcenter.model.UnReadMsgEntity;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    @SerializedName("user_info")
    public d a;
    @SerializedName("vip_info")
    public e b;
    @SerializedName("settings_info")
    public c c;
    @SerializedName("message_info")
    public UnReadMsgEntity d;
    @SerializedName("other_info")
    public C0814b e;
    @SerializedName("category_list")
    public ArrayList<FunctionCategory> f;
    @SerializedName("premium_campaign")
    public a g;
    @SerializedName("wm_card")
    public f h;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        @SerializedName("show")
        public boolean a;
        @SerializedName("icon_url")
        public String b;
        @SerializedName("bg_url")
        public String c;
        @SerializedName("buy_status")
        public int d;
        @SerializedName("text")
        public String e;
        @SerializedName(RegionLinkDao.TABLENAME)
        public String f;
        @SerializedName("bubble")
        public C0813a g;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.business.page.mine.model.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0813a {
            @SerializedName("type")
            public int a;
            @SerializedName("description")
            public String b;
            @SerializedName("version")
            public int c;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.mine.model.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0814b {
        @SerializedName("draw_poi_coupon_h5_url")
        public String a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c {
        @SerializedName("show_clean_cache")
        public boolean a;
        @SerializedName("show_auto_download")
        public boolean b;
        @SerializedName("mt_protocol_and_illustrate")
        public String c;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d {
        @SerializedName("click_desc")
        public String a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class e {
        @SerializedName("user_type")
        public int a;
        @SerializedName("show_vip_entrance")
        public boolean b;
        @SerializedName("entrance_desc")
        public String c;
        @SerializedName("highlight")
        public boolean d;
        @SerializedName("h5_url")
        public String e;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class f {
        @SerializedName("title")
        public String a;
        @SerializedName("description")
        public String b;
        @SerializedName(RegionLinkDao.TABLENAME)
        public String c;
        @SerializedName("link_text")
        public String d;
        @SerializedName("link_show_type")
        public int e;
        @SerializedName("show")
        public boolean f;
        @SerializedName("link_sub_text")
        public String g;
        @SerializedName("wmcard_status")
        public int h;
        @SerializedName("background_url")
        public String i;
        @SerializedName("title_icon")
        public String j;
        @SerializedName("bubble")
        public String k;
        @SerializedName("link_text_type")
        public int l;
        @SerializedName("extra_map")
        public a m;

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static class a {
            @SerializedName("pageVersion")
            public String a;
            @SerializedName("memberStatus")
            public String b;
            @SerializedName("mypage_v736_bottom_activity_desc_text")
            public String c;
            @SerializedName("mypage_v736_bottom_activity_icon_text")
            public String d;
        }
    }
}

package com.sankuai.waimai.business.page.home.homecache;

import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a {
    @SerializedName("home_page")
    public C0776a a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.business.page.home.homecache.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0776a {
        @SerializedName("valid_time")
        public int a;
        @SerializedName("sections")
        public List<C0777a> b;

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.business.page.home.homecache.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static class C0777a {
            @SerializedName(SocialConstants.TYPE_REQUEST)
            public String a;
            @SerializedName("response")
            public C0778a b;
            @SerializedName("valid_time")
            public int c;

            /* compiled from: ProGuard */
            /* renamed from: com.sankuai.waimai.business.page.home.homecache.a$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static class C0778a {
                @SerializedName("module_list")
                public List<c> a;
                @SerializedName("home_rcmd_style")
                public b b;
                @SerializedName("ab_info")
                public C0779a c;
                @SerializedName("card_count")
                public int d;

                /* compiled from: ProGuard */
                /* renamed from: com.sankuai.waimai.business.page.home.homecache.a$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static class C0779a {
                    @SerializedName("valid_time")
                    public int a;
                }

                /* compiled from: ProGuard */
                /* renamed from: com.sankuai.waimai.business.page.home.homecache.a$a$a$a$b */
                /* loaded from: classes4.dex */
                public static class b {
                    @SerializedName("valid_param")
                    public List<String> a;
                    @SerializedName("valid_time")
                    public int b;
                }

                /* compiled from: ProGuard */
                /* renamed from: com.sankuai.waimai.business.page.home.homecache.a$a$a$a$c */
                /* loaded from: classes4.dex */
                public static class c {
                    @SerializedName("module_id")
                    public String a;
                    @SerializedName("valid_time")
                    public int b;
                }
            }
        }
    }
}

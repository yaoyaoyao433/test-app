package com.sankuai.waimai.platform.net;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.platform.net.util.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static c p;
    protected final HashMap<String, String> j;
    @NonNull
    public final b m;
    private C1066c q;
    public static String b = f.c;
    public static String c = f.b;
    public static String d = f.c;
    public static String e = "scapi.waimai.meituan.com";
    public static String f = "hcapi.waimai.meituan.com";
    public static String g = f.d;
    public static String h = f.a + "v3/account/connect";
    public static String i = f.a + "v3/account/login";
    private static String n = f.a + "v6";
    private static String o = f.a + "v7";
    public static final String[] k = {"线上", "Test", "Stage", "Release", "Beta", "测试"};
    public static final String[] l = {b, "http://api.c.waimai.test.sankuai.com", g, "http://releaseapi.waimai.st.sankuai.com", "http://api.c.waimai.beta.sankuai.com", "http://api.c.waimai.dev.sankuai.com"};

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class a {

        /* compiled from: ProGuard */
        /* renamed from: com.sankuai.waimai.platform.net.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C1065a {
            public static String a = "run_environment";
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static final class b {
        public static ChangeQuickRedirect a;
        @SerializedName("api_host")
        private String b;
        @SerializedName("passport_test")
        private boolean c;
        @SerializedName("login_host")
        private String d;
        @SerializedName("account_host")
        private String e;
        @SerializedName("pay_host")
        private String f;
        @SerializedName("captcha")
        private String g;
        @SerializedName("log_type")
        private String h;
        @SerializedName("mt_pay_host")
        private String i;
        @SerializedName("open_host")
        private String j;
        @SerializedName("dx_sdk_host")
        private int k;
        @SerializedName("push_is_beta")
        private boolean l;
        @SerializedName("web")
        private String m;
        @SerializedName("against_cheating")
        private String n;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b3c8bd5267a38a9c3d978a7a4176da6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b3c8bd5267a38a9c3d978a7a4176da6");
                return;
            }
            this.b = c.b;
            this.c = false;
            this.d = "https://passport.meituan.com";
            this.e = "https://open.meituan.com";
            this.f = "https://pay.meituan.com";
            this.g = "http://www.meituan.com/account/appcaptcha";
            this.h = "http://wmlog.meituan.com";
            this.i = "https://mpay.meituan.com";
            this.j = "http://open.meituan.com";
            this.k = 0;
            this.l = false;
            this.m = "http://i.waimai.meituan.com";
            this.n = "https://access-credit.meituan.com";
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.net.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1066c extends com.sankuai.waimai.platform.utils.cache.b<b> {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.waimai.platform.utils.cache.b
        @NonNull
        public final /* synthetic */ b a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5acbcfcaba2b396b78c5c5c181d7e828", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5acbcfcaba2b396b78c5c5c181d7e828") : new b();
        }

        public C1066c() {
            super(b.class, a.C1065a.a);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b022b5ad9cbf1d823c339369a5d391e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b022b5ad9cbf1d823c339369a5d391e");
            }
        }
    }

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffb05b3a7b78aaecd549eeb2de6e7bd6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffb05b3a7b78aaecd549eeb2de6e7bd6");
            return;
        }
        this.j = new HashMap<>();
        if (com.sankuai.waimai.foundation.core.a.b()) {
            if (this.q == null) {
                this.q = new C1066c();
            }
            this.m = this.q.c();
            return;
        }
        this.m = new b();
    }

    public static c a() {
        c cVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2c2892c891b4d138af62665ade00b2e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2c2892c891b4d138af62665ade00b2e3");
        }
        synchronized ("net") {
            if (p == null) {
                p = new c();
            }
            cVar = p;
        }
        return cVar;
    }

    private static String a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87d4ddef75d56a8ee3337930f9818469", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87d4ddef75d56a8ee3337930f9818469");
        }
        StringBuilder sb = new StringBuilder();
        try {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                sb.append(Uri.encode(next));
                sb.append("=");
                sb.append(Uri.encode(map.get(next)));
                if (it.hasNext()) {
                    sb.append("&");
                }
            }
        } catch (Exception e2) {
            com.sankuai.waimai.foundation.utils.log.a.a(e2);
        }
        return sb.toString();
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2698ab21aef664fb389041e7f51018c1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2698ab21aef664fb389041e7f51018c1")).booleanValue() : a(this.m.b, b);
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7a7313cc29b216bc44cfcb83b0b62b6", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7a7313cc29b216bc44cfcb83b0b62b6")).booleanValue() : a(this.m.b, "http://api.c.waimai.test.sankuai.com") || a(this.m.b, "http://api.c.waimai.beta.sankuai.com");
    }

    public final boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c02836af3c277280b99ac80b95981a8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c02836af3c277280b99ac80b95981a8")).booleanValue() : this.m.c;
    }

    public final String e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0de29c87c7e64a0ef2d823a222322c72", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0de29c87c7e64a0ef2d823a222322c72") : this.m.b;
    }

    public final String f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7efa19c400be5f74ff254e1024a555c5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7efa19c400be5f74ff254e1024a555c5") : a(g());
    }

    public final Map<String, String> g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e2f791b40b60c7335be4fc4cdd82b9e", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e2f791b40b60c7335be4fc4cdd82b9e") : a(true);
    }

    public final Map<String, String> a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e310078b6cbf881d06cbad65a2722f0", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e310078b6cbf881d06cbad65a2722f0");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("utm_medium", com.sankuai.waimai.platform.b.A().o());
        hashMap.put("utm_source", com.sankuai.waimai.platform.b.A().d());
        hashMap.put("utm_term", String.valueOf(com.sankuai.waimai.platform.b.A().j()));
        hashMap.put("utm_content", z ? com.sankuai.waimai.platform.b.A().b() : "");
        com.sankuai.waimai.platform.b.A();
        hashMap.put("utm_campaign", com.sankuai.waimai.platform.b.H());
        hashMap.put("ci", String.valueOf(g.a()));
        hashMap.put("uuid", com.sankuai.waimai.platform.b.A().c());
        return hashMap;
    }

    public final boolean a(@Nullable String str, @Nullable String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aae9a9307545ab9179d7e6d090d2e714", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aae9a9307545ab9179d7e6d090d2e714")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return TextUtils.equals(str, str2);
        }
        return TextUtils.equals(Uri.parse(str).getHost(), Uri.parse(str2).getHost());
    }
}

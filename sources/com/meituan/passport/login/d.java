package com.meituan.passport.login;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.passport.PassportUIConfig;
import com.meituan.passport.UserCenter;
import com.meituan.passport.plugins.l;
import com.meituan.passport.sso.SSOInfo;
import com.meituan.passport.utils.aa;
import com.meituan.passport.utils.ag;
import com.meituan.passport.utils.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class d {
    public static ChangeQuickRedirect a;
    private static d c;
    private q b;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum b {
        ACCOUNT(UserCenter.OAUTH_TYPE_ACCOUNT),
        DYNAMIC(UserCenter.OAUTH_TYPE_DYNAMIC),
        CHINA_MOBILE("china_mobile"),
        FACE("face"),
        UNIQUE_SSO("union");
        
        public static ChangeQuickRedirect a;
        public String g;

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0aa4a408cc9f9a0f161a7cb27e958f33", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0aa4a408cc9f9a0f161a7cb27e958f33") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f39f67bab1b1f7e37e7649d5516d8989", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f39f67bab1b1f7e37e7649d5516d8989") : (b[]) values().clone();
        }

        b(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fabf9887082e88688e868f69eaeee3a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fabf9887082e88688e868f69eaeee3a0");
            } else {
                this.g = str;
            }
        }

        public static final b a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0fd3e2f405f68495bcb157ee366a640b", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0fd3e2f405f68495bcb157ee366a640b");
            }
            if (o.a().e && TextUtils.equals(str, UserCenter.OAUTH_TYPE_ACCOUNT)) {
                return ACCOUNT;
            }
            if (TextUtils.equals(str, "china_mobile")) {
                return CHINA_MOBILE;
            }
            if (TextUtils.equals(str, "union")) {
                return UNIQUE_SSO;
            }
            return DYNAMIC;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        ELDER_ACCOUNT("elder_account"),
        ELDER_DYNAMIC("elder_dynamic"),
        ELDER_CHINA_MOBILE("elder_china_mobile"),
        ELDER_UNIQUE_SSO("elder_union");
        
        public static ChangeQuickRedirect a;
        public String f;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "968c8a572640e90ae796d813bf961962", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "968c8a572640e90ae796d813bf961962") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "17979ce3fec783f9be5ad89a4f61a87a", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "17979ce3fec783f9be5ad89a4f61a87a") : (a[]) values().clone();
        }

        a(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "467a1e962e9bdeb1a979a33738729f1d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "467a1e962e9bdeb1a979a33738729f1d");
            } else {
                this.f = str;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum c {
        OUTER_CHINA_MOBILE("outer_china_mobile"),
        OUTER_DYNAMIC("outer_dynamic");
        
        public static ChangeQuickRedirect a;
        public String d;

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9691b5601182a21f1bc64084c82ce2c", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9691b5601182a21f1bc64084c82ce2c") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1dc6f7ff4efb8b2647a2a3374d8be366", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1dc6f7ff4efb8b2647a2a3374d8be366") : (c[]) values().clone();
        }

        c(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c90f447eda23c71b8c97fdaf54e59f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c90f447eda23c71b8c97fdaf54e59f7");
            } else {
                this.d = str;
            }
        }
    }

    private d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a161b8c28cf787f89f74e8be15c66538", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a161b8c28cf787f89f74e8be15c66538");
            return;
        }
        this.b = q.a(context, "homepage_passport_login");
        aa.a(context, "homepage_passport_login", "passport_login");
    }

    public static d a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65da21c0573b0de88e2419765d003a5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65da21c0573b0de88e2419765d003a5b");
        }
        if (c == null) {
            synchronized (d.class) {
                if (c == null) {
                    c = new d(context);
                }
            }
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1.equals("china_mobile") != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.meituan.passport.login.d.c a() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.passport.login.d.a
            java.lang.String r10 = "2d035f08aa6d6e988315dcacc65ff608"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            com.meituan.passport.login.d$c r0 = (com.meituan.passport.login.d.c) r0
            return r0
        L1b:
            java.lang.String r1 = r11.b()
            if (r1 == 0) goto L4f
            r2 = -1
            int r3 = r1.hashCode()
            r4 = 472856714(0x1c2f388a, float:5.797572E-22)
            if (r3 == r4) goto L3b
            r0 = 2124767295(0x7ea5603f, float:1.0991118E38)
            if (r3 == r0) goto L31
            goto L44
        L31:
            java.lang.String r0 = "dynamic"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L44
            r0 = 1
            goto L45
        L3b:
            java.lang.String r3 = "china_mobile"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L44
            goto L45
        L44:
            r0 = -1
        L45:
            switch(r0) {
                case 0: goto L4c;
                case 1: goto L49;
                default: goto L48;
            }
        L48:
            goto L4f
        L49:
            com.meituan.passport.login.d$c r0 = com.meituan.passport.login.d.c.OUTER_DYNAMIC
            return r0
        L4c:
            com.meituan.passport.login.d$c r0 = com.meituan.passport.login.d.c.OUTER_CHINA_MOBILE
            return r0
        L4f:
            boolean r0 = com.meituan.passport.utils.ag.a()
            if (r0 == 0) goto L58
            com.meituan.passport.login.d$c r0 = com.meituan.passport.login.d.c.OUTER_CHINA_MOBILE
            return r0
        L58:
            com.meituan.passport.login.d$c r0 = com.meituan.passport.login.d.c.OUTER_DYNAMIC
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.login.d.a():com.meituan.passport.login.d$c");
    }

    public final b a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af1ebe2464c9217eaf92be350767b1e4", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af1ebe2464c9217eaf92be350767b1e4");
        }
        if (PassportUIConfig.H() == 1 && o.a().e) {
            return b.ACCOUNT;
        }
        if (PassportUIConfig.H() == 2) {
            return b.DYNAMIC;
        }
        if (ag.d()) {
            return b.FACE;
        }
        if (l.a().c != null && l.a().c.size() != 0) {
            return b.UNIQUE_SSO;
        }
        if (!z && ag.a()) {
            return b.CHINA_MOBILE;
        }
        if (f() && e() != b.CHINA_MOBILE) {
            return e();
        }
        com.meituan.passport.plugins.q.a().h();
        return b.DYNAMIC;
    }

    public String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "498a780a5704dd7b4871f9541cf1738e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "498a780a5704dd7b4871f9541cf1738e");
        }
        if (UserCenter.getInstance(com.meituan.android.singleton.b.a()).isLogin()) {
            String str = UserCenter.getInstance(com.meituan.android.singleton.b.a()).getUser().mobile;
            List<SSOInfo> list = l.a().c;
            if (list != null && list.size() != 0) {
                SSOInfo sSOInfo = list.get(0);
                if (!TextUtils.equals(str, sSOInfo != null ? sSOInfo.mobile : null)) {
                    return "union";
                }
            }
            return (!ag.a() || TextUtils.equals(str, ag.b())) ? UserCenter.OAUTH_TYPE_DYNAMIC : "china_mobile";
        }
        return null;
    }

    public final void a(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72c19a9813efd676ba062bfbbe16c5b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72c19a9813efd676ba062bfbbe16c5b1");
        } else {
            this.b.a("key_login_type", bVar.g);
        }
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d301572eb6404ac75444b10873a6c3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d301572eb6404ac75444b10873a6c3d");
            return;
        }
        this.b.a("key_login_country_code", str);
        q qVar = this.b;
        Object[] objArr2 = {str2};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.passport.sso.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "11f387b58797bfb58a0089efb4fa04bf", RobustBitConfig.DEFAULT_VALUE)) {
            str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "11f387b58797bfb58a0089efb4fa04bf");
        } else {
            com.meituan.passport.plugins.c cVar = new com.meituan.passport.plugins.c();
            if (!TextUtils.isEmpty(str2) && !cVar.c(str2)) {
                str2 = cVar.a(str2);
            }
        }
        qVar.a("key_login_number", str2);
    }

    public final String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b78ac74ef3975619cb168ffda20a202", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b78ac74ef3975619cb168ffda20a202") : UserCenter.getInstance(com.meituan.android.singleton.b.a()).isLogin() ? "" : com.meituan.passport.sso.a.a(this.b.b("key_login_number", (String) null));
    }

    public final String d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eea7426ab59a71a5323fe80591f47708", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eea7426ab59a71a5323fe80591f47708") : UserCenter.getInstance(com.meituan.android.singleton.b.a()).isLogin() ? "" : this.b.b("key_login_country_code", (String) null);
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8250816211be98a49b39544ecec9028", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8250816211be98a49b39544ecec9028")).booleanValue() : !TextUtils.isEmpty(this.b.b("key_login_type", (String) null));
    }

    public final b e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be2f3a5565e1c8033eaee9f6c3375bb6", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be2f3a5565e1c8033eaee9f6c3375bb6");
        }
        if (f()) {
            return b.a(this.b.b("key_login_type", (String) null));
        }
        return b.DYNAMIC;
    }
}

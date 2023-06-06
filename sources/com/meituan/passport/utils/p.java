package com.meituan.passport.utils;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class p {
    public static ChangeQuickRedirect a;
    private static p b;

    private static String b(int i) {
        switch (i) {
            case 1:
                return "收不到验证码";
            case 2:
                return "接听语音验证码";
            default:
                return "重新获取验证码";
        }
    }

    public static p a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "82d4fdcfa625e2059eac7435e3332e9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (p) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "82d4fdcfa625e2059eac7435e3332e9a");
        }
        if (b == null) {
            synchronized (p.class) {
                if (b == null) {
                    b = new p();
                }
            }
        }
        return b;
    }

    public final void a(FragmentActivity fragmentActivity, int i, int i2) {
        Object[] objArr = {fragmentActivity, Integer.valueOf(i), -999};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07216960d14878e63fb7cbce9383e23c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07216960d14878e63fb7cbce9383e23c");
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("pageinfo", Integer.valueOf(i));
        hashMap2.put("operator_type", -999);
        hashMap2.put("sort_type", Integer.valueOf(b()));
        hashMap2.put("loginStatus", Integer.valueOf(a(fragmentActivity)));
        hashMap.put("custom", hashMap2);
        aj.a(fragmentActivity, "c_edycunb", hashMap);
    }

    public final void a(FragmentActivity fragmentActivity, String str, String str2, int i) {
        Object[] objArr = {fragmentActivity, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d47347ecfb7ccbf2db7f4ee0cffcb265", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d47347ecfb7ccbf2db7f4ee0cffcb265");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("status", a(str));
        hashMap.put("type", b(str2));
        hashMap.put("sort_type", Integer.valueOf(b()));
        aj.b(fragmentActivity, "b_group_bjxfkjcs_mv", "c_edycunb", hashMap);
    }

    public final void a(FragmentActivity fragmentActivity, String str, int i, String str2) {
        Object[] objArr = {fragmentActivity, str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aafbc4ff415409d29fc15cbb6dd28399", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aafbc4ff415409d29fc15cbb6dd28399");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("status", a(str));
        hashMap.put("type", b(str2));
        hashMap.put("sort_type", Integer.valueOf(b()));
        aj.b(fragmentActivity, "b_group_hjxn5ex7_mv", "c_edycunb", hashMap);
    }

    public final void a(FragmentActivity fragmentActivity, String str, int i) {
        Object[] objArr = {fragmentActivity, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4fa5ec1bb1bd8ab8fbe96100a1e26c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4fa5ec1bb1bd8ab8fbe96100a1e26c1");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("status", a(str));
        hashMap.put("type", "登录");
        hashMap.put("sort_type", Integer.valueOf(b()));
        aj.b(fragmentActivity, "b_group_fowhpekm_mv", "c_edycunb", hashMap);
    }

    public final void b(FragmentActivity fragmentActivity, String str, String str2, int i) {
        Object[] objArr = {fragmentActivity, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6417c3461cc0d306430d9ae1d2b8e71b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6417c3461cc0d306430d9ae1d2b8e71b");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("status", a(str));
        hashMap.put("type", b(str2));
        hashMap.put("sort_type", Integer.valueOf(b()));
        aj.b(fragmentActivity, "b_group_b1c4sa45_mv", "c_edycunb", hashMap);
    }

    public final void c(FragmentActivity fragmentActivity, String str, String str2, int i) {
        Object[] objArr = {fragmentActivity, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e63ab82d7e6fe75120805c717218165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e63ab82d7e6fe75120805c717218165");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("status", a(str));
        hashMap.put("type", b(str2));
        hashMap.put("sort_type", Integer.valueOf(b()));
        aj.b(fragmentActivity, "b_group_j6stej7s_mv", "c_edycunb", hashMap);
    }

    public final void a(Activity activity, boolean z, String str) {
        Object[] objArr = {activity, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14835219c1fa5139af1dc2eceed45a54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14835219c1fa5139af1dc2eceed45a54");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("is_select", Integer.valueOf(z ? 1 : 0));
        hashMap.put("status", str);
        hashMap.put("sort_type", Integer.valueOf(b()));
        aj.a(activity, "b_group_cr9rhgsf_mc", "c_edycunb", hashMap);
    }

    public final void a(Activity activity, int i, String str, String str2) {
        Object[] objArr = {activity, Integer.valueOf(i), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22d999e4a569bf5efb70ae9dc0c059ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22d999e4a569bf5efb70ae9dc0c059ff");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("status", a(str));
        hashMap.put("type", b(str2));
        hashMap.put("sort_type", Integer.valueOf(b()));
        aj.b(activity, "b_group_r6aokmf2_mv", "c_edycunb", hashMap);
    }

    public final void a(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c0c478dccb5173b40469eba9b095968", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c0c478dccb5173b40469eba9b095968");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("status", a(str));
        hashMap.put("type", b(str2));
        hashMap.put("sort_type", Integer.valueOf(b()));
        aj.b(activity, "b_group_z73z3gu9_mv", "c_edycunb", hashMap);
    }

    public final void a(Activity activity, int i, String str) {
        Object[] objArr = {activity, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b76eed24adbc4b798c365fc6be7a850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b76eed24adbc4b798c365fc6be7a850");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", Integer.valueOf(i));
        hashMap.put("status", str);
        hashMap.put("sort_type", Integer.valueOf(b()));
        aj.b(activity, "b_group_zumd2exb_mv", "c_edycunb", hashMap);
    }

    public final void b(Activity activity, int i, String str) {
        Object[] objArr = {activity, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50d2ab8d5241e294f9e76f98c85024bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50d2ab8d5241e294f9e76f98c85024bf");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("pageinfo", Integer.valueOf(i));
        hashMap.put("operator_type", str);
        hashMap.put("sort_type", Integer.valueOf(b()));
        aj.a(activity, "b_group_cwc3bjfj_mc", "c_edycunb", hashMap);
    }

    public final void b(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e805c0af5a46b2c245c2051efb8f4c50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e805c0af5a46b2c245c2051efb8f4c50");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("status", a(str2));
        hashMap.put("sort_type", Integer.valueOf(b()));
        aj.a(activity, "b_group_dbxq4czf_mc", "c_edycunb", hashMap);
    }

    public final void c(Activity activity, String str, String str2) {
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a8512aa10e4491acfab0153c889a4ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a8512aa10e4491acfab0153c889a4ea");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", str);
        hashMap.put("status", a(str2));
        hashMap.put("sort_type", Integer.valueOf(b()));
        aj.a(activity, "b_group_mt51kj0a_mc", "c_edycunb", hashMap);
    }

    public final void a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2725a97b56aa189b3ce9ec569c74ec58", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2725a97b56aa189b3ce9ec569c74ec58");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", str);
        aj.b(context, "b_group_tls154zz_mv", "c_edycunb", hashMap);
    }

    public final void a(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c20eeb53efd38596914710d6b2a15fea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c20eeb53efd38596914710d6b2a15fea");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("result", str);
        hashMap.put("url", str2);
        aj.b(context, "b_group_1w4lqujn_mv", "c_edycunb", hashMap);
    }

    public final void a(Context context, String str, int i) {
        Object[] objArr = {context, str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f24bb698c2f565c89b0ef45569ddec3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f24bb698c2f565c89b0ef45569ddec3f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("button_name", str);
        hashMap.put("result", Integer.valueOf(i));
        aj.a(context, "b_group_inkl3zu2_mc", "c_group_brsi2nos", hashMap);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "052d50f08892de2718143a296aaf9c8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "052d50f08892de2718143a296aaf9c8d");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", b(i));
        aj.a(this, "b_l9duh3yn", "c_ph4yzc83", hashMap);
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efe57534f7e308d589b66ac304c13c1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efe57534f7e308d589b66ac304c13c1e");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("type", str);
        hashMap.put("status", a(str2));
        aj.a(this, "b_group_fbhzp400_mc", "c_group_clin2kzw", hashMap);
    }

    public final void a(Context context, boolean z) {
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de43177feab3ffb713455bdfb7682cc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de43177feab3ffb713455bdfb7682cc5");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("item_type", Integer.valueOf(!z ? 1 : 0));
        hashMap.put("loginStatus", Integer.valueOf(a(context)));
        aj.b(context, "b_group_qoxgaol2_mv", "c_edycunb", hashMap);
    }

    public final void a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e8068a96cdc3d20a341d75372b38d41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e8068a96cdc3d20a341d75372b38d41");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("item_type", Integer.valueOf(i));
        hashMap.put("loginStatus", Integer.valueOf(a(context)));
        hashMap.put("operator_type", Integer.valueOf(c()));
        aj.b(context, "b_group_5jswwnjq_mv", "c_edycunb", hashMap);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (r13.equals(com.meituan.passport.UserCenter.OAUTH_TYPE_WEIXIN) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.utils.p.a(java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r13.equals("login") == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String b(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.passport.utils.p.a
            java.lang.String r11 = "41f81afebdb966ce88058745f0c4438d"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.String r13 = (java.lang.String) r13
            return r13
        L1e:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 == 0) goto L27
            java.lang.String r13 = "-999"
            return r13
        L27:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -902467304(0xffffffffca357118, float:-2972742.0)
            if (r2 == r3) goto L41
            r3 = 103149417(0x625ef69, float:3.1208942E-35)
            if (r2 == r3) goto L37
            goto L4c
        L37:
            java.lang.String r2 = "login"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L4c
            goto L4d
        L41:
            java.lang.String r0 = "signup"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L4c
            r0 = 0
            goto L4d
        L4c:
            r0 = -1
        L4d:
            switch(r0) {
                case 0: goto L57;
                case 1: goto L53;
                default: goto L50;
            }
        L50:
            java.lang.String r13 = "-999"
            return r13
        L53:
            java.lang.String r13 = "登录"
            return r13
        L57:
            java.lang.String r13 = "注册"
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.passport.utils.p.b(java.lang.String):java.lang.String");
    }

    public int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00f6066e613030907fbf888731aa8011", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00f6066e613030907fbf888731aa8011")).intValue();
        }
        switch (ab.a()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                return 0;
        }
    }

    private int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0cde003f9ad11ae852625a13488ea60", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0cde003f9ad11ae852625a13488ea60")).intValue() : UserCenter.getInstance(context).isLogin() ? 1 : 0;
    }

    private int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a05cdeb9a5539ed6b384ea48362fb8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a05cdeb9a5539ed6b384ea48362fb8e")).intValue();
        }
        if (com.meituan.passport.plugins.q.a().j != null) {
            try {
                return Integer.parseInt(com.meituan.passport.plugins.q.a().j.a());
            } catch (Exception e) {
                f.a(e);
                return -999;
            }
        }
        return -999;
    }
}

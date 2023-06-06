package com.sankuai.waimai.business.im.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static String a = "c_waimai_wgiu7lrd";
    public static String b = "b_waimai_8ueat4m8_mc";
    public static String c = "b_waimai_m3wl69qu_mc";
    public static String d = "b_waimai_1xn1tlhq_mc";
    public static String e = "b_waimai_c8uexmt6_mc";
    public static String f = "b_waimai_goi51qlc_mc";
    public static String g = "b_waimai_cyvi7auu_mc";
    public static String h = "b_waimai_a0qur69z_mc";
    public static String i = "b_waimai_2901m5y9_mv";
    public static String j = "b_waimai_4wmj91y8_mc";
    public static String k = "b_waimai_i244r9qn_mc";
    public static String l = "b_waimai_1j1fm9e1_mc";
    public static String m = "b_waimai_5up2q0nq_mc";
    public static String n = "b_waimai_5up2q0nq_mv";
    public static String o = "b_waimai_vt20bygv_mc";
    public static String p = "b_waimai_1vwr96it_mc";
    public static String q = "b_waimai_zojc3pez_mc";
    public static String r = "b_waimai_pkhmqqqu_mc";
    public static String s = "b_waimai_2711q51a_mc";
    public static String t = "b_2fewqhua";
    public static String u = "b_cvqfb6g1";
    public static String v = "b_JXKMl";
    public static String w = "b_waimai_rtukw3nm_mv";
    public static String x = "b_waimai_rtukw3nm_mc";

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        private Map<String, Object> b;
        private Map<String, Object> c;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "453daa52783e158de5a605c4018c58bb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "453daa52783e158de5a605c4018c58bb");
                return;
            }
            this.b = new HashMap();
            this.c = new HashMap();
        }

        public final a a(String str, Object obj) {
            Object[] objArr = {str, obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89cfd3c905c627efdcfbf5acb17da5b4", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89cfd3c905c627efdcfbf5acb17da5b4");
            }
            this.c.put(str, obj);
            return this;
        }

        public final Map<String, Object> a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a652bc25157fb710f7e77cf7f48f2e8", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a652bc25157fb710f7e77cf7f48f2e8");
            }
            this.b.put("custom", this.c);
            return this.b;
        }
    }
}

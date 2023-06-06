package com.sankuai.waimai.drug.patch.burried;

import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.aidata.raptoruploader.RaptorConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.shopping.cart.SCPageConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a = null;
    private static String b = "b_waimai_i96m9o9b_mv";
    private static String c = "b_waimai_s2h1by9x_mv";
    private static String d = "b_waimai_mqhi15n3_mv";
    private static String e = "b_waimai_ullpyi12_mc";
    private static String f = "b_waimai_b7k3ktza_mc";
    private static String g = "b_waimai_su0mygey_mv";
    private static String h = "b_waimai_9zxe37pj_mc";
    private static String i = "b_waimai_n7u43ron_mc";

    public static void a(SCPageConfig sCPageConfig, String str, int i2, int i3, String str2, String str3) {
        Object[] objArr = {sCPageConfig, str, Integer.valueOf(i2), Integer.valueOf(i3), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11991505b8aef25085e1f76f5d372681", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11991505b8aef25085e1f76f5d372681");
        } else {
            b.b(sCPageConfig.d, b).a("poi_id", str).a("type", Integer.valueOf(i2)).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i3)).a("trace_id", str2).a("stid", str3).a();
        }
    }

    public static void a(SCPageConfig sCPageConfig, String str, int i2, int i3, String str2, int i4, String str3, String str4) {
        Object[] objArr = {sCPageConfig, str, Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4), str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec86256ad034b82a816693277114a328", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec86256ad034b82a816693277114a328");
        } else {
            b.b(sCPageConfig.d, c).a("poi_id", str).a("set_id", str2).a(RaptorConstants.JS_BATCH_NUM, Integer.valueOf(i4)).a("type", Integer.valueOf(i2)).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i3)).a("trace_id", str3).a("stid", str4).a();
        }
    }

    public static void a(SCPageConfig sCPageConfig, String str, int i2, int i3, String str2, String str3, int i4, String str4, String str5) {
        Object[] objArr = {sCPageConfig, str, Integer.valueOf(i2), Integer.valueOf(i3), str2, str3, Integer.valueOf(i4), str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c2a179158010d2770a98309461bc198", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c2a179158010d2770a98309461bc198");
        } else {
            b.b(sCPageConfig.d, d).a("poi_id", str).a("set_id", str2).a("spu_id_list", str3).a("set_pos", Integer.valueOf(i4)).a("type", Integer.valueOf(i2)).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i3)).a("trace_id", str4).a("stid", str5).a();
        }
    }

    public static void b(SCPageConfig sCPageConfig, String str, int i2, int i3, String str2, String str3, int i4, String str4, String str5) {
        Object[] objArr = {sCPageConfig, str, Integer.valueOf(i2), Integer.valueOf(i3), str2, str3, Integer.valueOf(i4), str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e6520e117fecdb21e9840168810446c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e6520e117fecdb21e9840168810446c");
        } else {
            b.a(sCPageConfig.d, e).a("poi_id", str).a("set_id", str2).a("spu_id_list", str3).a("set_pos", Integer.valueOf(i4)).a("type", Integer.valueOf(i2)).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i3)).a("trace_id", str4).a("stid", str5).a();
        }
    }

    public static void a(SCPageConfig sCPageConfig, String str, int i2, int i3, String str2, long j, int i4, String str3, String str4) {
        Object[] objArr = {sCPageConfig, str, Integer.valueOf(i2), Integer.valueOf(i3), str2, new Long(j), Integer.valueOf(i4), str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da09271d9825636526a5f5ea97b00b66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da09271d9825636526a5f5ea97b00b66");
        } else {
            b.a(sCPageConfig.d, f).a("poi_id", str).a("set_id", str2).a("spu_id", Long.valueOf(j)).a("set_pos", Integer.valueOf(i4)).a("product_index", Integer.valueOf(i4)).a("type", Integer.valueOf(i2)).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i3)).a("trace_id", str3).a("stid", str4).a();
        }
    }

    public static void a(SCPageConfig sCPageConfig, String str, int i2, int i3, long j, String str2, String str3, String str4) {
        Object[] objArr = {sCPageConfig, str, Integer.valueOf(i2), Integer.valueOf(i3), new Long(j), str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9b9a832027bebc6088625b3f643bd32b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9b9a832027bebc6088625b3f643bd32b");
        } else {
            b.b(sCPageConfig.d, g).a("poi_id", str).a("spu_id", Long.valueOf(j)).a("type", Integer.valueOf(i2)).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i3)).a("tab_name", str2).a("trace_id", str3).a("stid", str4).a();
        }
    }

    public static void a(SCPageConfig sCPageConfig, String str, int i2, int i3, long j, int i4, String str2, String str3, String str4) {
        Object[] objArr = {sCPageConfig, str, Integer.valueOf(i2), Integer.valueOf(i3), new Long(j), Integer.valueOf(i4), str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ea95fabf0437f88b27842442bb2e4a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ea95fabf0437f88b27842442bb2e4a4");
        } else {
            b.a(sCPageConfig.d, h).a("poi_id", str).a("spu_id", Long.valueOf(j)).a("set_pos", Integer.valueOf(i4)).a("type", Integer.valueOf(i2)).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i3)).a("tab_name", str2).a("trace_id", str3).a("stid", str4).a();
        }
    }

    public static void b(SCPageConfig sCPageConfig, String str, int i2, int i3, long j, int i4, String str2, String str3, String str4) {
        Object[] objArr = {sCPageConfig, str, Integer.valueOf(i2), Integer.valueOf(i3), new Long(j), Integer.valueOf(i4), str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7fb18dcf2e97fd89ecf683bdce38f2e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7fb18dcf2e97fd89ecf683bdce38f2e9");
        } else {
            b.a(sCPageConfig.d, i).a("poi_id", str).a("spu_id", Long.valueOf(j)).a("set_pos", Integer.valueOf(i4)).a("type", Integer.valueOf(i2)).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i3)).a("tab_name", str2).a("trace_id", str3).a("stid", str4).a();
        }
    }

    public static void a(SCPageConfig sCPageConfig, String str, int i2, int i3, int i4, String str2, String str3) {
        Object[] objArr = {sCPageConfig, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "14c4e59df580e9dd310bbae7f3d7b169", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "14c4e59df580e9dd310bbae7f3d7b169");
        } else {
            b.b(sCPageConfig.d, "b_waimai_2w8kbbwl_mv").a("poi_id", str).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i3)).a("type", Integer.valueOf(i2)).a("tab_number", Integer.valueOf(i4)).a("trace_id", str2).a("stid", str3).a();
        }
    }

    public static void a(SCPageConfig sCPageConfig, String str, String str2, int i2, int i3, int i4, String str3, int i5, String str4) {
        Object[] objArr = {sCPageConfig, str, str2, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str3, Integer.valueOf(i5), str4};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bc02c786351319008ece3ae34d96b4dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bc02c786351319008ece3ae34d96b4dc");
        } else {
            b.a(sCPageConfig.d, "b_waimai_nkd49skh_mc").a("poi_id", str).a("tab_index", Integer.valueOf(i5)).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i3)).a("type", Integer.valueOf(i2)).a("tab_number", Integer.valueOf(i4)).a("trace_id", str3).a("tab_name", str2).a("stid", str4).a();
        }
    }

    public static void b(SCPageConfig sCPageConfig, String str, int i2, int i3, String str2, String str3) {
        Object[] objArr = {sCPageConfig, str, Integer.valueOf(i2), Integer.valueOf(i3), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2b4b9969150d613613a97b39260b75f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2b4b9969150d613613a97b39260b75f4");
        } else {
            b.b(sCPageConfig.d, "b_waimai_1w0hllkb_mv").a("poi_id", str).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i2)).a("type", Integer.valueOf(i3)).a("trace_id", str2).a("stid", str3).a();
        }
    }

    public static void c(SCPageConfig sCPageConfig, String str, int i2, int i3, String str2, String str3) {
        Object[] objArr = {sCPageConfig, str, Integer.valueOf(i2), Integer.valueOf(i3), str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f1e8859cc8b49018bc5894a3767e2736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f1e8859cc8b49018bc5894a3767e2736");
        } else {
            b.a(sCPageConfig.d, "b_waimai_1w0hllkb_mc").a("poi_id", str).a("type", Integer.valueOf(i2)).a(JsBridgeResult.ARG_KEY_LOCATION_MODE, Integer.valueOf(i3)).a("trace_id", str2).a("stid", str3).a();
        }
    }
}

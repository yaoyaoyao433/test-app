package com.sankuai.waimai.business.restaurant.base.log;

import android.os.SystemClock;
import com.meituan.mmp.lib.engine.LaunchMode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.v;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"WM_REST_LOG"};
    private static v c = new v();

    public static void a(int i, String str, boolean z) {
        Object[] objArr = {Integer.valueOf(i), str, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32e256da239d3d78f2674f4a9aefb190", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32e256da239d3d78f2674f4a9aefb190");
            return;
        }
        a(1003);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", LaunchMode.LAUNCH_MODE_PRELOAD);
            jSONObject.put("api_code", i);
            jSONObject.put("api_msg", str);
            b.b(new d().a("rest_main_page").b("poi_food_api_fail").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65ce4ff1922b596bdaaed36ca633fbaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65ce4ff1922b596bdaaed36ca633fbaa");
            return;
        }
        a(1002);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", LaunchMode.LAUNCH_MODE_PRELOAD);
            jSONObject.put("api_code", -1);
            jSONObject.put("api_msg", str);
            b.b(new d().a("rest_main_page").b("poi_food_api_fail").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "62d4800466d709b02acdd3511fcee22e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62d4800466d709b02acdd3511fcee22e");
        } else {
            a("rest_main_page", i);
        }
    }

    private static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b74e1dea8eb8e407506274dd10d43fb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b74e1dea8eb8e407506274dd10d43fb0");
        } else {
            com.sankuai.waimai.platform.capacity.log.c.a().a(i, str, SystemClock.elapsedRealtime());
        }
    }

    public static void a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d447218856cb0adc83ab105b1554362d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d447218856cb0adc83ab105b1554362d");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", LaunchMode.LAUNCH_MODE_PRELOAD);
            b.a(new d().a("rest_main_page").b("poi_food_api_success").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ec1eb8cb40bf031c781969efbfaaa5f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ec1eb8cb40bf031c781969efbfaaa5f0");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", str);
            b.a(new d().a("calculate_price").b("calculate_price_type").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    public static void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a876cf420a62352257ea91306bc67efb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a876cf420a62352257ea91306bc67efb");
            return;
        }
        a.d().a();
        com.sankuai.waimai.platform.capacity.log.c.a().a(741100, "restaurant/calculate/price", SystemClock.elapsedRealtime());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("msg", str);
            b.b(new d().a("calculate_price").b("pre_calculate_error").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "575261b99c613778628156eae5358172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "575261b99c613778628156eae5358172");
            return;
        }
        b.a(new d().a("rest_screen_shot").b("rest_screen_shot").b());
        com.sankuai.waimai.platform.capacity.log.c.a().a(84001, "restaurant/screenshot/listener", SystemClock.elapsedRealtime());
    }

    public static void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e516414dc20570145703e002b8542c60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e516414dc20570145703e002b8542c60");
            return;
        }
        a.d().a();
        com.sankuai.waimai.platform.capacity.log.c.a().a(741010, "restaurant/calculate/price", SystemClock.elapsedRealtime());
        b.b(new d().a("calculate_price").b("server_calculate_net_error").b());
    }

    public static void a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "28d0277b809fb8992b5023496f511c1e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "28d0277b809fb8992b5023496f511c1e");
            return;
        }
        a d = a.d();
        Object[] objArr2 = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, d, changeQuickRedirect2, false, "490182f5e5a1a0f4aa0635d1e46cb2e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, d, changeQuickRedirect2, false, "490182f5e5a1a0f4aa0635d1e46cb2e0");
        } else {
            d.c += j;
            d.d++;
            d.a(j);
        }
        com.sankuai.waimai.platform.capacity.log.c.a().a(741020, "restaurant/calculate/price", SystemClock.elapsedRealtime());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", j);
            b.a(new d().a("calculate_price").b("server_calculate_success").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    public static void a(long j, int i, String str) {
        Object[] objArr = {new Long(j), Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "76c08fca8682b0257d99760b75219100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "76c08fca8682b0257d99760b75219100");
            return;
        }
        a.d().a();
        com.sankuai.waimai.platform.capacity.log.c.a().a(741030, "restaurant/calculate/price", SystemClock.elapsedRealtime());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time", j);
            jSONObject.put("code", i);
            jSONObject.put("msg", str);
            b.b(new d().a("calculate_price").b("server_calculate_fail").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    public static void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffc83d1dc77e4c6f1a3f1104bfc269b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffc83d1dc77e4c6f1a3f1104bfc269b3");
            return;
        }
        com.sankuai.waimai.platform.capacity.log.c.a().a(741002, "restaurant/calculate/price", SystemClock.elapsedRealtime());
        b.a(new d().a("calculate_price").b("native_calculate_success").b());
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d6dfb80320bcd9636f9c1fea92ac4db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d6dfb80320bcd9636f9c1fea92ac4db");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", str);
            jSONObject.put("msg", str2);
            b.a(new d().a("rest_pre_order").b("require_tag_handle").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    public static void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a6b8df9fe8aec052b13264775627f8e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a6b8df9fe8aec052b13264775627f8e5");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isRestrict", z);
            b.a(new d().a("rest_pre_order").b("submit_pre_restrict").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    public static void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebcdb160c0a42b041cc3c51189eb86a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebcdb160c0a42b041cc3c51189eb86a2");
        } else {
            b.a(new d().a("rest_pre_order").b("cart_modify_success").b());
        }
    }

    public static void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9a070e698d966eeb73e0b9d2330bc39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9a070e698d966eeb73e0b9d2330bc39");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put("msg", str);
            b.b(new d().a("rest_pre_order").b("cart_modify_fail").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    public static void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3127d9db9bb49b2c33720721c99c0c47", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3127d9db9bb49b2c33720721c99c0c47");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("account_enable", z);
            b.a(new d().a("rest_pre_order").b("order_account_check").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    public static void d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6a9ce21a8dbd765401e78cb6d6c819a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6a9ce21a8dbd765401e78cb6d6c819a4");
        } else {
            b.a(new d().a("rest_pre_order").b("order_submit_params").d(str).b());
        }
    }

    public static void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a2e623d506bd09d273f3df4067c0b731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a2e623d506bd09d273f3df4067c0b731");
        } else {
            com.sankuai.waimai.platform.capacity.log.c.a().a(85001, "restaurant/dynamic/foodimage", SystemClock.elapsedRealtime());
        }
    }

    public static void b(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0432ffe0a32a7b26a3b81f30edf651c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0432ffe0a32a7b26a3b81f30edf651c2");
            return;
        }
        com.sankuai.waimai.platform.capacity.log.c.a().a(85002, "restaurant/dynamic/foodimage", SystemClock.elapsedRealtime());
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            jSONObject.put("msg", str);
            b.b(new d().a("dynamic_food_image").b("dynamic_food_image_load_fail").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }

    public static void a(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "06b1778582bc99380a888177e849696c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "06b1778582bc99380a888177e849696c");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("WM_REST_LOG", str, objArr);
        c(str, objArr);
    }

    public static void b(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "48b4959c6d4b1eb03d9fa75c59c98181", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "48b4959c6d4b1eb03d9fa75c59c98181");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.d("WM_REST_LOG", str, objArr);
        c(str, objArr);
    }

    private static void c(final String str, final Object[] objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect, true, "b4ad396c86b3c7d62d3ad3a02d284726", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect, true, "b4ad396c86b3c7d62d3ad3a02d284726");
        } else {
            c.execute(new Runnable() { // from class: com.sankuai.waimai.business.restaurant.base.log.c.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "a43c8475b5451897acd20c64efe1ad32", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "a43c8475b5451897acd20c64efe1ad32");
                    } else {
                        com.dianping.networklog.c.a(String.format(str, objArr), 3, c.b);
                    }
                }
            });
        }
    }
}

package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.log;

import android.os.SystemClock;
import com.meituan.android.common.sniffer.util.GsonUtil;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.c;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(boolean z, List<com.sankuai.waimai.business.restaurant.poicontainer.dynamic.model.b> list) {
        Object[] objArr = {(byte) 1, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "95d137788878dc8a03e2dbd02295cc41", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "95d137788878dc8a03e2dbd02295cc41");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("use_dynamic_style", true);
            if (!com.sankuai.waimai.restaurant.shopcart.utils.b.a(list)) {
                jSONObject.put("food_card_style_info", GsonUtil.getGson().toJson(list));
            }
            com.sankuai.waimai.platform.capacity.log.b.a(new a("restaurant_dynamic_card", "loadinfo_use_dynamic_style").d(jSONObject.toString()).b());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4, str5, str6};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e43d047e71d1aff1dc756858c5779ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e43d047e71d1aff1dc756858c5779ec");
            return;
        }
        c.a().a(i, "restaurant_dynamic_template_download", SystemClock.elapsedRealtime());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("templateId", str);
            jSONObject.put("url", str2);
            jSONObject.put("md5", str3);
            jSONObject.put("fileMd5", str4);
            jSONObject.put("page_scene", str6);
            com.sankuai.waimai.platform.capacity.log.b.b(new a("restaurant_dynamic_template_download", String.valueOf(i)).d(jSONObject.toString()).c(str5).b());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70f3b2a3c36147f2dc546c0b5c3a6d3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70f3b2a3c36147f2dc546c0b5c3a6d3e");
            return;
        }
        c.a().a(UserCenter.TYPE_LOGOUT_NEGATIVE, "restaurant_dynamic_template_render", SystemClock.elapsedRealtime());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", UserCenter.TYPE_LOGOUT_NEGATIVE);
            jSONObject.put("templateId", str);
            com.sankuai.waimai.platform.capacity.log.b.a(new a("restaurant_dynamic_template_render", "20000").d(jSONObject.toString()).b());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1994c373abac46cb840acbc0744e029d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1994c373abac46cb840acbc0744e029d");
            return;
        }
        c.a().a(i, "restaurant_dynamic_template_render", SystemClock.elapsedRealtime());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("templateId", str);
            com.sankuai.waimai.platform.capacity.log.b.b(new a("restaurant_dynamic_template_render", String.valueOf(i)).d(jSONObject.toString()).c(str2).b());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.sankuai.waimai.store.goods.list.utils;

import android.content.Context;
import android.content.Intent;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import com.meituan.android.common.horn.Horn;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.i;
import com.sankuai.waimai.store.goods.list.model.SGNewUserOptModel;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.monitor.b;
import com.sankuai.waimai.store.util.monitor.monitor.IMonitor;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(IMonitor iMonitor, Map map, boolean z, String str) {
        Object[] objArr = {iMonitor, map, Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99bd6187861040034675824361a80059", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99bd6187861040034675824361a80059");
            return;
        }
        b.a a2 = com.sankuai.waimai.store.util.monitor.b.a();
        a2.a(iMonitor);
        a2.a(z);
        if (map != null && map.size() > 0) {
            a2.a(map);
        }
        if (!aa.a(str)) {
            a2.a(str);
        }
        a2.a();
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2d371a325e221f05db242cc5ed34831c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2d371a325e221f05db242cc5ed34831c")).booleanValue() : i.h().a(SCConfigPath.NEW_USE_LAND_ANCHOR, false);
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c29b33b8bea19de66b77bd90724667dd", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c29b33b8bea19de66b77bd90724667dd")).booleanValue() : i.h().a(SCConfigPath.NEW_USE_LAND_PROMOTION, true);
    }

    public static Map<String, Object> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8317a6ac56b0a9628d000e74ece797a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8317a6ac56b0a9628d000e74ece797a8");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("funnelName", str);
        return hashMap;
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d1c3b47de1025eb5b1833cd25b0e54d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d1c3b47de1025eb5b1833cd25b0e54d6");
        }
        String accessCache = Horn.accessCache("sm_newuser_outlink_config");
        if (aa.a(accessCache)) {
            return "0";
        }
        try {
            JSONObject optJSONObject = new JSONObject(accessCache).optJSONObject("sg_out_link_switch");
            return optJSONObject == null ? "0" : optJSONObject.optString(str, "0");
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
    }

    public static SGNewUserOptModel a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4251b1852c13f449462aa6975883100c", RobustBitConfig.DEFAULT_VALUE)) {
            return (SGNewUserOptModel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4251b1852c13f449462aa6975883100c");
        }
        SGNewUserOptModel sGNewUserOptModel = new SGNewUserOptModel();
        sGNewUserOptModel.upc = com.sankuai.waimai.store.router.d.a(intent, "upc", "upc", "");
        sGNewUserOptModel.hangDownProductsInfo = com.sankuai.waimai.store.router.d.a(intent, "hangDownProductsInfo", "hangDownProductsInfo", "");
        sGNewUserOptModel.reqSource = com.sankuai.waimai.store.router.d.a(intent, "reqSource", "reqSource", "-999");
        sGNewUserOptModel.thirdCategoryCode = com.sankuai.waimai.store.router.d.a(intent, "third_categroy_code", "third_categroy_code", "");
        sGNewUserOptModel.originUpc = sGNewUserOptModel.upc;
        sGNewUserOptModel.originThirdCategoryCode = sGNewUserOptModel.thirdCategoryCode;
        return sGNewUserOptModel;
    }

    public static void a(SGNewUserOptModel sGNewUserOptModel) {
        Object[] objArr = {sGNewUserOptModel};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "113c82a56d297dad90407424c713d79d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "113c82a56d297dad90407424c713d79d");
        } else if (sGNewUserOptModel != null) {
            sGNewUserOptModel.reqSource = "-999";
            sGNewUserOptModel.hangDownProductsInfo = "";
            sGNewUserOptModel.upc = "";
            sGNewUserOptModel.thirdCategoryCode = "";
            sGNewUserOptModel.spuId = "-999";
            sGNewUserOptModel.skuId = "-999";
        }
    }

    public static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3c4ddd6f7f06bc39fda83696a75f00b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3c4ddd6f7f06bc39fda83696a75f00b") : (aa.a(str) || TextUtils.equals("-999", str)) ? "" : str;
    }

    public static void a(View view, Context context, boolean z) {
        Object[] objArr = {view, context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e7b3a0d1233af02ff5888d6450ca9488", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e7b3a0d1233af02ff5888d6450ca9488");
        } else if (view != null) {
            if (!z) {
                u.c(view);
                return;
            }
            view.setBackground(new e.a().a(h.a(context, 6.0f)).c(ContextCompat.getColor(context, R.color.wm_sg_color_FFF5E4)).a());
            view.setAlpha(0.08f);
            u.a(view);
        }
    }
}

package com.meituan.android.paycommon.lib.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.neohybrid.core.config.DowngradeConfig;
import com.meituan.android.neohybrid.core.config.LoadingConfig;
import com.meituan.android.neohybrid.core.config.NeoConfig;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.android.paybase.moduleinterface.picasso.coupondialog.DynamicLayout;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paycommon.lib.coupon.model.Promotion;
import com.meituan.android.paycommon.lib.fragment.HalfPageMarketingDialogFragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static String b;
    private static long c;

    public static void a(int i, Intent intent) {
    }

    public static void a(String str) {
        b = str;
    }

    public static String a() {
        return b;
    }

    public static long b() {
        return c;
    }

    public static void a(Activity activity, Promotion promotion, String str, String str2, int i) {
        Intent intent;
        Object[] objArr = {activity, promotion, str, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4f188df5039d121f1ead1940c2a0ecf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4f188df5039d121f1ead1940c2a0ecf");
            return;
        }
        c = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put("trans_id", !TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.b.b) ? com.meituan.android.paybase.common.analyse.b.b : "-999");
        a("b_pay_around_marketing_halfpage_dialog_start_sc", (HashMap<String, Object>) hashMap);
        a("pay_around_marketing_halfpage_dialog_start", (Map<String, Object>) null);
        com.meituan.android.neohybrid.container.a.a("marketing_halfpage_dialog", HalfPageMarketingDialogFragment.class);
        String str3 = b;
        Object[] objArr2 = {activity, promotion, str3, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9bbbd668b4039015f4c4689a486d6a49", RobustBitConfig.DEFAULT_VALUE)) {
            intent = (Intent) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9bbbd668b4039015f4c4689a486d6a49");
        } else {
            intent = new Intent("android.intent.action.VIEW");
            com.meituan.android.neohybrid.a.a(intent, "marketing_halfpage_dialog_render_data", a(promotion, str3, str));
            Uri.Builder buildUpon = Uri.parse("meituanpayment://hybrid_cashier/launch").buildUpon();
            buildUpon.appendQueryParameter(NeoConfig.NEO_SCENE, "marketing_halfpage_dialog");
            StringBuilder sb = new StringBuilder();
            sb.append((int) (promotion.getHybridLoadingTime() * 1000.0d));
            buildUpon.appendQueryParameter(LoadingConfig.LOADING_DURATION, sb.toString());
            buildUpon.appendQueryParameter(LoadingConfig.LOADING_ENABLED, "1");
            buildUpon.appendQueryParameter(DowngradeConfig.LOADING_CANCEL_DOWNGRADE, "1");
            buildUpon.appendQueryParameter(DowngradeConfig.LOADING_TIMEOUT_DOWNGRADE, "1");
            buildUpon.appendQueryParameter("member_id", com.meituan.android.paybase.set.a.a());
            buildUpon.appendQueryParameter("zone_user_id", com.meituan.android.paybase.config.a.d().s().a());
            if (TextUtils.isEmpty(str2)) {
                buildUpon.appendQueryParameter(UIConfig.BACKGROUND_COLOR, "#99000000");
            } else {
                buildUpon.appendQueryParameter(UIConfig.BACKGROUND_COLOR, str2);
            }
            buildUpon.appendQueryParameter(UIConfig.MODAL, "1");
            buildUpon.appendQueryParameter("url", promotion.getHalfPageUrl());
            intent.setData(buildUpon.build());
            intent.setPackage(activity.getPackageName());
        }
        activity.startActivityForResult(intent, i);
        b = "";
    }

    public static void a(Activity activity, Promotion promotion, String str, int i) {
        Object[] objArr = {activity, promotion, str, 100};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d15abb123825c60ebdc692162dea020", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d15abb123825c60ebdc692162dea020");
        } else {
            a(activity, promotion, str, "", 100);
        }
    }

    public static boolean a(Promotion promotion) {
        DynamicLayout dynamicLayout;
        Object[] objArr = {promotion};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbbdc36332356034a6dd0d13d8a0385b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbbdc36332356034a6dd0d13d8a0385b")).booleanValue();
        }
        if (promotion == null || (dynamicLayout = promotion.getDynamicLayout()) == null || TextUtils.isEmpty(promotion.getHalfPageUrl())) {
            return false;
        }
        try {
            return TextUtils.equals(new JSONObject(com.meituan.android.paybase.utils.n.a().toJson(dynamicLayout.getJsData())).optJSONObject("others").optString("exposeStrategy"), "halfPage");
        } catch (Exception unused) {
            com.meituan.android.paybase.common.analyse.cat.a.a("HalfPageMarketingUtils", "showHalfPageDialog");
            return false;
        }
    }

    private static String a(Promotion promotion, String str, String str2) {
        Object[] objArr = {promotion, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae297d1b4d7218c0178b6a32a526b136", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae297d1b4d7218c0178b6a32a526b136");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("dynamicLayout", new JSONObject(com.meituan.android.paybase.utils.n.a().toJson(promotion.getDynamicLayout())));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("tradeNo", str);
            jSONObject2.put("stat_time", System.currentTimeMillis());
            if (!TextUtils.isEmpty(str2)) {
                jSONObject2.put("trans_id", str2);
            }
            jSONObject.put("extraInfo", jSONObject2);
        } catch (Exception unused) {
            com.meituan.android.paybase.common.analyse.cat.a.a("HalfPageMarketingUtils", "createH5JsonParams");
        }
        return jSONObject.toString();
    }

    public static void a(String str, HashMap<String, Object> hashMap) {
        Object[] objArr = {str, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6d23ef1c5c2a09d12ea7736968f588c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6d23ef1c5c2a09d12ea7736968f588c4");
        } else {
            ae.a(null, str, hashMap, "c_pay_dmfidr05", "", true);
        }
    }

    public static void a(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "85ed654cb4f27ea19e225db3a193a053", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "85ed654cb4f27ea19e225db3a193a053");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, map, null, "");
        }
    }
}

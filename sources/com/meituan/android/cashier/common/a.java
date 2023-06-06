package com.meituan.android.cashier.common;

import android.net.Uri;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.cashier.bean.CashierParamRuleBean;
import com.meituan.android.cashier.bean.CashierParamRuleDetailBean;
import com.meituan.android.cashier.bean.CashierParamRuleDetailItemBean;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.monitor.report.db.TraceBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static void a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45728ef7cf83c16e7d22d94bd97b1474", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45728ef7cf83c16e7d22d94bd97b1474");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("key", str);
        hashMap.put("value", str2);
        if (TextUtils.isEmpty(str2)) {
            hashMap.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, 0);
        } else {
            hashMap.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, Integer.valueOf(str2.getBytes().length));
        }
        com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
        if (cVar == null) {
            hashMap.put(TraceBean.RULE, StringUtil.NULL);
        } else {
            hashMap.put(TraceBean.RULE, cVar.c);
        }
        q.b("b_pay_bun1n0k5_sc", hashMap, str3);
        q.a("paybiz_business_params_size_illegal", new a.c().a("param", str).b, (List<Float>) null, str3);
    }

    private static void b(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21efa303049df71bbdfefa1d5a5ef74f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21efa303049df71bbdfefa1d5a5ef74f");
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("key", str);
        hashMap.put("value", str2);
        com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
        if (cVar == null) {
            hashMap.put(TraceBean.RULE, StringUtil.NULL);
        } else {
            hashMap.put(TraceBean.RULE, cVar.c);
        }
        q.b("b_pay_vdoqreb8_sc", hashMap, str3);
        q.a("paybiz_business_params_type_illegal", new a.c().a("param", str).b, (List<Float>) null, str3);
    }

    public static String a(String str, String str2, CashierParamRuleDetailBean cashierParamRuleDetailBean, String str3) {
        JSONObject jSONObject;
        Object[] objArr = {str, str2, cashierParamRuleDetailBean, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2db1f342b7ddb90ae1662c9013ed39dc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2db1f342b7ddb90ae1662c9013ed39dc");
        }
        if (cashierParamRuleDetailBean == null) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return "";
        }
        if (str2.getBytes().length > cashierParamRuleDetailBean.getMaxSize()) {
            a(str, str2, str3);
            return cashierParamRuleDetailBean.isAbandon() ? "" : str2;
        }
        try {
            jSONObject = new JSONObject(str2);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCashierActivity_filterRouterParam", (Map<String, Object>) null);
            jSONObject = null;
        }
        if (jSONObject == null) {
            b(str, str2, str3);
            return cashierParamRuleDetailBean.isAbandon() ? "" : str2;
        }
        a(jSONObject, cashierParamRuleDetailBean.getParamsRuleMap(), str3);
        return jSONObject.toString();
    }

    private static void a(JSONObject jSONObject, HashMap<String, CashierParamRuleDetailItemBean> hashMap, String str) {
        Iterator<String> keys;
        Object[] objArr = {jSONObject, hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "59b5c2c5bf715b19e969c8efbb328158", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "59b5c2c5bf715b19e969c8efbb328158");
        } else if (com.meituan.android.paybase.utils.i.a(hashMap) || (keys = jSONObject.keys()) == null) {
        } else {
            while (keys.hasNext()) {
                String next = keys.next();
                String optString = jSONObject.optString(next);
                if (!TextUtils.isEmpty(optString)) {
                    CashierParamRuleDetailItemBean cashierParamRuleDetailItemBean = hashMap.get(next);
                    if (cashierParamRuleDetailItemBean == null) {
                        Object[] objArr2 = {next, optString, str};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "2c4f86e0660e8d3c71e9e9da90d6a41e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "2c4f86e0660e8d3c71e9e9da90d6a41e");
                        } else {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("key", next);
                            hashMap2.put("value", optString);
                            if (TextUtils.isEmpty(optString)) {
                                hashMap2.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, 0);
                            } else {
                                hashMap2.put(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE, Integer.valueOf(optString.getBytes().length));
                            }
                            com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
                            if (cVar == null) {
                                hashMap2.put(TraceBean.RULE, StringUtil.NULL);
                            } else {
                                hashMap2.put(TraceBean.RULE, cVar.c);
                            }
                            q.b("b_pay_j8u02h8s_sc", hashMap2, str);
                            q.a("paybiz_business_params_no_rule", new a.c().a("param", next).b, (List<Float>) null, str);
                        }
                    } else {
                        if (optString.getBytes().length > cashierParamRuleDetailItemBean.getMaxSize()) {
                            a(next, optString, str);
                            if (cashierParamRuleDetailItemBean.isAbandon()) {
                                keys.remove();
                            }
                        }
                        if (TextUtils.equals(cashierParamRuleDetailItemBean.getType(), CashierParamRuleDetailItemBean.TYPE_JSON_STRING)) {
                            try {
                                new JSONObject(optString);
                            } catch (Exception e) {
                                b(next, optString, str);
                                com.meituan.android.paybase.common.analyse.a.a(e, "MTCashierActivity_filterParam", (Map<String, Object>) null);
                                if (cashierParamRuleDetailItemBean.isAbandon()) {
                                    keys.remove();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static CashierParamRuleBean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8c159424b31812987e0dce8b5448c7a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (CashierParamRuleBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8c159424b31812987e0dce8b5448c7a8");
        }
        com.meituan.android.paybase.downgrading.c cVar = com.meituan.android.paybase.downgrading.d.a().b;
        if (cVar == null || TextUtils.isEmpty(cVar.c)) {
            return null;
        }
        try {
            return (CashierParamRuleBean) com.meituan.android.paybase.utils.n.a().fromJson(cVar.c, (Class<Object>) CashierParamRuleBean.class);
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "MTCashierActivity_getCashierParamRuleBean", (Map<String, Object>) null);
            return null;
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6c17d7f2be959a714da180f056d8905", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6c17d7f2be959a714da180f056d8905")).booleanValue();
        }
        try {
            new JSONObject(str);
            return true;
        } catch (Exception unused) {
            com.meituan.android.paybase.common.analyse.a.d("data is not json " + str, "BusinessParamsFilter_isJSON", null);
            return false;
        }
    }

    public static String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "255d3432e9a08412536f009c9dda27f4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "255d3432e9a08412536f009c9dda27f4");
        }
        try {
            return new JSONObject((String) com.meituan.android.paybase.utils.n.a().fromJson(str, (Class<Object>) String.class)).toString();
        } catch (Exception unused) {
            com.meituan.android.paybase.common.analyse.a.d("data is not gson string " + str, "BusinessParamsFilter_parseGSON", null);
            return str;
        }
    }

    public static Uri a(Uri uri, String str, String str2) {
        Set<String> queryParameterNames;
        Object[] objArr = {uri, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d5e6eb412aaaa83d3f2299946197c81a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d5e6eb412aaaa83d3f2299946197c81a");
        }
        if (uri == null) {
            return null;
        }
        if (TextUtils.isEmpty(str) || (queryParameterNames = uri.getQueryParameterNames()) == null) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str3 : queryParameterNames) {
            clearQuery.appendQueryParameter(str3, str3.equals(str) ? str2 : uri.getQueryParameter(str3));
        }
        return clearQuery.build();
    }
}

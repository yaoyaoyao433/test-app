package com.meituan.android.pay.utils;

import android.content.Context;
import android.text.TextUtils;
import com.google.gson.JsonParser;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.pay.common.payment.bean.HybridInfo;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.retrofit.PayException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static int b = -999;
    private static int c = 1180200;

    public static int a() {
        return b;
    }

    public static void a(int i) {
        c = i;
    }

    public static int b() {
        return c;
    }

    public static void c() {
        b = -999;
        c = 1180200;
    }

    public static boolean a(HybridInfo hybridInfo) {
        Object[] objArr = {hybridInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "66a197650c8bfbad15184864c372d91a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "66a197650c8bfbad15184864c372d91a")).booleanValue() : (hybridInfo == null || TextUtils.isEmpty(hybridInfo.getHybridUrl()) || hybridInfo.getLoadingTime() <= 0) ? false : true;
    }

    public static void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6fc08c4a6fec434532cd000593ae6858", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6fc08c4a6fec434532cd000593ae6858");
            return;
        }
        Context a2 = com.meituan.android.paybase.config.a.d().a();
        if (a2 != null) {
            com.dianping.monitor.impl.m mVar = new com.dianping.monitor.impl.m(26, a2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(Float.valueOf(1.0f));
            mVar.a(str, arrayList);
            mVar.a("app_name", com.meituan.android.paybase.config.a.d().k());
            mVar.a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.meituan.android.paybase.config.a.d().l());
            mVar.a("nb_platform", "android");
            mVar.a("os_version", com.meituan.android.paybase.config.a.d().e());
            mVar.a("nb_version", com.meituan.android.paybase.config.a.d().q());
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            mVar.a("code", sb.toString());
            mVar.a();
        }
    }

    public static String a(PayException payException, String str, String str2) {
        Object[] objArr = {payException, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4326d1c96afd468cc9d582d11773555", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4326d1c96afd468cc9d582d11773555");
        }
        try {
            return new JsonParser().parse(payException.getExtra()).getAsJsonObject().get(str).getAsString();
        } catch (Exception e) {
            com.meituan.android.pay.common.analyse.b.b("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "VerifyBankInfoFragment_getExceptionFactor").a("message", e.getMessage()).b, str2);
            return null;
        }
    }

    public static void a(Exception exc) {
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0d2706141aee6475d3f251745fcbc50b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0d2706141aee6475d3f251745fcbc50b");
        } else if (exc instanceof PayException) {
            PayException payException = (PayException) exc;
            com.meituan.android.paybase.common.analyse.a.a("b_wihq521z", new a.c().a("code", Integer.valueOf(payException.getCode())).a("message", payException.getErrorCodeStr()).a("level", Integer.valueOf(payException.getLevel())).b);
        }
    }

    public static void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e1a1db52578f64a9b182825e16dcb4eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e1a1db52578f64a9b182825e16dcb4eb");
        } else if (z) {
        } else {
            com.meituan.android.paybase.common.analyse.a.a(str, "nextStep", "cardbin no response", "");
        }
    }

    public static void a(int i, String str, HybridInfo hybridInfo) {
        Object[] objArr = {Integer.valueOf(i), str, hybridInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "822c78fc5918d4b8af7df586e858f798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "822c78fc5918d4b8af7df586e858f798");
            return;
        }
        String str2 = "native";
        String str3 = "paybiz_hybrid_contract_pay_entry_native";
        b = i;
        if (a(hybridInfo)) {
            str2 = "hybrid";
            str3 = "paybiz_hybrid_contract_pay_entry_hybrid";
        }
        HashMap<String, Object> hashMap = new a.c().a("mtpay_scene", str).a("from", Integer.valueOf(i)).a("page_type", str2).b;
        Object[] objArr2 = {"b_pay_thyfohxa_mc", hashMap, "c_8l4w761d"};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.paybase.common.analyse.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "341687439b0aaa1800ebd5d2679b8e7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "341687439b0aaa1800ebd5d2679b8e7c");
        } else {
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            hashMap.put("technology_log_version", com.meituan.android.paybase.config.a.d().q());
            hashMap.put("priority", a.d.NORMAL.toString());
            if (!TextUtils.isEmpty(com.meituan.android.paybase.common.analyse.a.b) && !hashMap.containsKey("tradeNo")) {
                hashMap.put("tradeNo", com.meituan.android.paybase.common.analyse.a.b);
            }
            com.meituan.android.paybase.common.analyse.a.a().writeSystemCheck(null, "b_pay_thyfohxa_mc", hashMap, "c_8l4w761d");
        }
        a("paybiz_hybrid_contract_pay_cardbin", i);
        a(str3, i);
    }
}

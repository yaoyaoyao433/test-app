package com.meituan.android.cashier.util;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.cashier.bean.CashierParams;
import com.meituan.android.cashier.common.CashierTypeConstant;
import com.meituan.android.cashier.common.ICashier;
import com.meituan.android.cashier.common.ProductTypeConstant;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.android.neohybrid.util.p;
import com.meituan.android.paybase.utils.ae;
import com.meituan.android.paybase.utils.i;
import com.meituan.android.paybase.utils.x;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.util.DeviceUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static long b;

    public static void a(HashMap<String, Object> hashMap, String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "681b9c51f105fb6437226d4f086fdceb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "681b9c51f105fb6437226d4f086fdceb");
        } else if (i.a(hashMap)) {
        } else {
            x.c("com.meituan.android.cashier.util.CashierRouterStatics", hashMap);
            x.c(c(str), hashMap);
        }
    }

    private static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "44a04f693c1007417332f420525a1e1d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "44a04f693c1007417332f420525a1e1d");
        }
        if (TextUtils.isEmpty(str)) {
            return "com.meituan.android.cashier.util.CashierRouterStatics";
        }
        return "com.meituan.android.cashier.util.CashierRouterStatics_" + str;
    }

    public static void b(HashMap<String, Object> hashMap, String str) {
        Object[] objArr = {hashMap, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "acfe92d775ad29ca5bdbcbc00f07602b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "acfe92d775ad29ca5bdbcbc00f07602b");
            return;
        }
        a(str);
        ae.a("com.meituan.android.cashier.util.CashierRouterStatics", hashMap);
        ae.a(c(str), hashMap);
    }

    public static void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c457a1e00bf585bc0145490281591ca9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c457a1e00bf585bc0145490281591ca9");
            return;
        }
        ae.a("com.meituan.android.cashier.util.CashierRouterStatics");
        ae.a(c(str));
    }

    private static void a(String str, Map<String, Object> map, String str2) {
        Object[] objArr = {str, map, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "71b85e3de4c83e74e39968f309fcfde3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "71b85e3de4c83e74e39968f309fcfde3");
        } else {
            ae.a(null, str, map, "c_pay_dmfidr05", c(str2), true);
        }
    }

    private static void a(String str, Map<String, Object> map, List<Float> list, String str2) {
        Object[] objArr = {str, map, null, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7838f0c345775bdcc67a1dfd9edc3f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7838f0c345775bdcc67a1dfd9edc3f7");
        } else {
            com.meituan.android.paybase.common.analyse.cat.a.a(str, map, null, c(str2));
        }
    }

    public static void a(CashierParams cashierParams, String str) {
        Object[] objArr = {cashierParams, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8af2c448177b7e1c0ae0e86f0a5f65a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8af2c448177b7e1c0ae0e86f0a5f65a");
            return;
        }
        b = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put(KnbConstants.PARAMS_SCENE, "enter");
        hashMap.put("last_resumed_features", com.meituan.android.hybridcashier.hook.b.b());
        if (cashierParams.getUri() != null) {
            hashMap.put(Constants.TRAFFIC_URI, cashierParams.getUri().toString());
        }
        hashMap.put("device_level", String.valueOf(DeviceUtil.getDeviceLevel(com.meituan.android.neohybrid.init.a.d())));
        hashMap.put("chrome_version", p.b(com.meituan.android.neohybrid.init.a.d()));
        hashMap.put("chrome_version_core", p.a(com.meituan.android.neohybrid.init.a.d()));
        hashMap.put("channel", com.meituan.android.paybase.config.a.d().c());
        hashMap.put(DeviceInfo.DEVICE_MODEL, Build.MODEL);
        MtLocation f = com.meituan.android.paybase.config.a.d().f();
        if (f != null) {
            hashMap.put("location", f.getLatitude() + CommonConstant.Symbol.UNDERLINE + f.getLongitude());
        }
        hashMap.put("osVersion", com.meituan.android.paybase.config.a.d().e());
        hashMap.put("config_debug", String.valueOf(com.meituan.android.paycommon.lib.settings.d.a()));
        hashMap.put("debug", com.meituan.android.neohybrid.init.a.h() ? "1" : "0");
        hashMap.put("device_level", String.valueOf(DeviceUtil.getDeviceLevel(com.meituan.android.neohybrid.init.a.d())));
        hashMap.put("device_type", Build.MODEL);
        hashMap.put("packageName", com.meituan.android.paybase.config.a.d().a().getPackageName());
        a("b_pay_cashier_route_start_sc", hashMap, str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("last_resumed_features", com.meituan.android.hybridcashier.hook.b.b());
        a("cashier_route_enter_start", hashMap2, (List<Float>) null, str);
    }

    private static void c(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb4406841ac534fde9b1fb23390aadc2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb4406841ac534fde9b1fb23390aadc2");
            return;
        }
        com.meituan.android.paybase.common.analyse.cat.a.a(str, "trade_no=" + str2 + ";extraMessage=" + str3);
    }

    public static void a(ICashier iCashier, CashierParams cashierParams, String str, boolean z) {
        Object[] objArr = {iCashier, cashierParams, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ae745bba4883fbf001fd20517325fd0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ae745bba4883fbf001fd20517325fd0e");
            return;
        }
        String i = iCashier == null ? "empty" : iCashier.i();
        String productType = iCashier == null ? "empty" : cashierParams.getProductType();
        HashMap hashMap = new HashMap();
        hashMap.put(KnbConstants.PARAMS_SCENE, "enter");
        hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - b));
        hashMap.put("dest_cashier", i);
        hashMap.put("dest_product_type", productType);
        hashMap.put("cif", z ? "1" : "0");
        a("b_pay_cashier_route_result_sc", hashMap, str);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("dest_cashier", i);
        hashMap2.put("dest_product_type", productType);
        hashMap2.put("cif", z ? "1" : "0");
        a("cashier_route_enter_result", hashMap2, (List<Float>) null, str);
        if (!d(i) || cashierParams == null || cashierParams.getUri() == null) {
            return;
        }
        c("cashier_route_enter_result", cashierParams.getTradeNo(), cashierParams.getUri().toString());
    }

    private static boolean d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "22ccf30ca85744c9e733ab15bc0b3184", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "22ccf30ca85744c9e733ab15bc0b3184")).booleanValue() : TextUtils.equals(str, "hybrid_standard_cashier") || TextUtils.equals(str, "native_standard_cashier") || TextUtils.equals(str, "hybrid_elderly_cashier") || TextUtils.equals(str, "native_elderly_cashier") || TextUtils.equals(str, "hybrid_preposed_mtcashier") || TextUtils.equals(str, "web_cashier");
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46a8f81ed6ffcc22feebf69070dd2e87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46a8f81ed6ffcc22feebf69070dd2e87");
            return;
        }
        b = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put(KnbConstants.PARAMS_SCENE, "predispatcher");
        a("b_pay_cashier_route_start_sc", hashMap, str);
        a("cashier_route_predispatcher_start", (Map<String, Object>) null, (List<Float>) null, str);
    }

    public static void a(boolean z, ICashier iCashier, @ProductTypeConstant.ProductType String str, CashierParams cashierParams, String str2) {
        boolean z2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), iCashier, str, cashierParams, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "da7e8748f0d7b88503ec5ff59fbd6f85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "da7e8748f0d7b88503ec5ff59fbd6f85");
            return;
        }
        String i = iCashier == null ? "empty" : iCashier.i();
        String str3 = iCashier == null ? "empty" : str;
        HashMap hashMap = new HashMap();
        hashMap.put(KnbConstants.PARAMS_SCENE, z ? "predispatcher_success" : "predispatcher_failed");
        hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - b));
        hashMap.put("dest_cashier", i);
        hashMap.put("dest_product_type", str3);
        a("b_pay_cashier_route_result_sc", hashMap, str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("dest_cashier", i);
        hashMap2.put("dest_product_type", str3);
        a(z ? "cashier_route_predispatcher_success_result" : "cashier_route_predispatcher_failed_result", hashMap2, (List<Float>) null, str2);
        Object[] objArr2 = {i};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a58e3b693c81d068a907486e2dc47956", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a58e3b693c81d068a907486e2dc47956")).booleanValue();
        } else {
            z2 = !d(i);
        }
        if (!z2 || cashierParams == null) {
            return;
        }
        String str4 = z ? "cashier_route_predispatcher_success_result" : "cashier_route_predispatcher_failed_result";
        String tradeNo = cashierParams.getTradeNo();
        c(str4, tradeNo, "dest_cashier is " + i);
    }

    public static void a(@CashierTypeConstant.CashierType String str, @ProductTypeConstant.ProductType String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c659d509c2cae0a1eaa6d89e231a1f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c659d509c2cae0a1eaa6d89e231a1f5");
            return;
        }
        b = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put(KnbConstants.PARAMS_SCENE, "tech_degrade");
        hashMap.put("from_cashier", str);
        hashMap.put("from_product_type", str2);
        a("b_pay_cashier_route_start_sc", hashMap, str3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("from_cashier", str);
        hashMap2.put("from_product_type", str2);
        a("cashier_route_tech_degrade_start", hashMap2, (List<Float>) null, str3);
    }

    public static void a(ICashier iCashier, @ProductTypeConstant.ProductType String str, CashierParams cashierParams, String str2) {
        Object[] objArr = {iCashier, str, cashierParams, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1e8e3799fc9992f2792f6aba011d451b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1e8e3799fc9992f2792f6aba011d451b");
            return;
        }
        String i = iCashier == null ? "empty" : iCashier.i();
        if (iCashier == null) {
            str = "empty";
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KnbConstants.PARAMS_SCENE, "tech_degrade");
        hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - b));
        hashMap.put("dest_cashier", i);
        hashMap.put("dest_product_type", str);
        a("b_pay_cashier_route_result_sc", hashMap, str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("dest_cashier", i);
        hashMap2.put("dest_product_type", str);
        a("cashier_route_tech_degrade_result", hashMap2, (List<Float>) null, str2);
        if (!e(i) || cashierParams == null) {
            return;
        }
        String tradeNo = cashierParams.getTradeNo();
        c("cashier_route_tech_degrade_result", tradeNo, "dest_cashier is " + i);
    }

    private static boolean e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7b644d90dc3503bec2faf36ef58cc4a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7b644d90dc3503bec2faf36ef58cc4a")).booleanValue() : TextUtils.equals("empty", str);
    }

    public static void b(@CashierTypeConstant.CashierType String str, @ProductTypeConstant.ProductType String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e5048f45568df9663768e296e2962a97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e5048f45568df9663768e296e2962a97");
            return;
        }
        b = System.currentTimeMillis();
        HashMap hashMap = new HashMap();
        hashMap.put(KnbConstants.PARAMS_SCENE, "business_degrade");
        hashMap.put("from_cashier", str);
        hashMap.put("from_product_type", str2);
        a("b_pay_cashier_route_start_sc", hashMap, str3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("from_cashier", str);
        hashMap2.put("from_product_type", str2);
        a("cashier_route_business_degrade_start", hashMap2, (List<Float>) null, str3);
    }

    public static void b(ICashier iCashier, @ProductTypeConstant.ProductType String str, CashierParams cashierParams, String str2) {
        Object[] objArr = {iCashier, str, cashierParams, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2eda41b5db88fac2b97959c8c56b93e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2eda41b5db88fac2b97959c8c56b93e0");
            return;
        }
        String i = iCashier == null ? "empty" : iCashier.i();
        if (iCashier == null) {
            str = "empty";
        }
        HashMap hashMap = new HashMap();
        hashMap.put(KnbConstants.PARAMS_SCENE, "business_degrade");
        hashMap.put("duration", Long.valueOf(System.currentTimeMillis() - b));
        hashMap.put("dest_cashier", i);
        hashMap.put("dest_product_type", str);
        a("b_pay_cashier_route_result_sc", hashMap, str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("dest_cashier", i);
        hashMap2.put("dest_product_type", str);
        a("cashier_route_business_degrade_result", hashMap2, (List<Float>) null, str2);
        if (!e(i) || cashierParams == null) {
            return;
        }
        String tradeNo = cashierParams.getTradeNo();
        c("cashier_route_business_degrade_result", tradeNo, "dest_cashier is " + i);
    }
}

package com.meituan.android.paybase.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.vivo.push.PushClientConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "42d7e19241b0d433aa101570fd6ec57d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "42d7e19241b0d433aa101570fd6ec57d")).booleanValue();
        }
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            context.getPackageManager().getPackageInfo(str, 256);
            return true;
        } catch (Exception e) {
            Log.e("CheckAppInstalled", str + CommonConstant.Symbol.UNDERLINE + e.getMessage());
            if ("com.unionpay".equals(e.getMessage()) || "com.eg.android.AlipayGphone".equals(e.getMessage())) {
                return false;
            }
            com.meituan.android.paybase.common.analyse.a.a(e, "AppInfoUtils_isAppInstalled " + str, (Map<String, Object>) null);
            HashMap hashMap = new HashMap();
            hashMap.put(PushClientConstants.TAG_PKG_NAME, str);
            ae.a("cashier_appinfoutils_isappinstalled", hashMap, (List<Float>) null);
            return false;
        }
    }
}

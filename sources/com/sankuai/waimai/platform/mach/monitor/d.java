package com.sankuai.waimai.platform.mach.monitor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static final Executor b = com.sankuai.android.jarvis.c.b();

    public static void a(int i, int i2, String str, String str2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6e52a8849face40c853f50e1c5818b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6e52a8849face40c853f50e1c5818b0");
        } else if (i <= 0 || i2 <= 0 || TextUtils.isEmpty(str)) {
        } else {
            new HashMap().put("NewlyMintedBizTraceAdProductCount", Integer.valueOf(i));
            Map<String, String> a2 = a();
            a2.put("ad_type", String.valueOf(i2));
            a2.put("api_path", str2);
            a2.put("category", str);
        }
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "255a1fe9d6ca52089835068550c30a03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "255a1fe9d6ca52089835068550c30a03");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            new HashMap().put("NewlyMintedBizTraceRequestAPI", 1);
            Map<String, String> a2 = a();
            a2.put("api_path", str);
            a2.put("category", str2);
        }
    }

    private static Map<String, String> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcc0700a5b88c2187f05dc74347055c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcc0700a5b88c2187f05dc74347055c7");
        }
        HashMap hashMap = new HashMap();
        if (com.sankuai.waimai.foundation.core.a.d()) {
            hashMap.put("client_type", "android");
        } else if (com.sankuai.waimai.foundation.core.a.e()) {
            hashMap.put("client_type", "mtandroid");
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            hashMap.put("client_type", "dp_android");
        }
        if (com.sankuai.waimai.foundation.core.a.a()) {
            hashMap.put("env", "debug");
        } else if (com.sankuai.waimai.foundation.core.a.b()) {
            hashMap.put("env", "test");
        } else if (com.sankuai.waimai.foundation.core.a.c()) {
            hashMap.put("env", "prod");
        }
        hashMap.put("version", com.sankuai.waimai.platform.b.A().i());
        return hashMap;
    }
}

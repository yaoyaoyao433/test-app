package com.sankuai.waimai.business.page.common.list.popuplayer;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7bb4343f1759958c458526b58fef4a5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7bb4343f1759958c458526b58fef4a5c");
        }
        if (i == 0) {
            return "b_waimai_v9lltiqw_mc";
        }
        if (i == 1) {
            return "b_waimai_5adx573i_mc";
        }
        return null;
    }

    private static String b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "06edfad0ccd6e4d32a29180d5a1e145b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "06edfad0ccd6e4d32a29180d5a1e145b");
        }
        if (i == 0) {
            return "c_m84bv26";
        }
        if (i == 1) {
            return "c_i5kxn8l";
        }
        return null;
    }

    public static void a(int i, String str, String str2, HashMap<String, Object> hashMap) {
        Object[] objArr = {Integer.valueOf(i), str, str2, hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "975c709c8d4f5fcd6b9767d177583a23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "975c709c8d4f5fcd6b9767d177583a23");
            return;
        }
        hashMap.put("uuid", com.sankuai.waimai.platform.b.A().c());
        JudasManualManager.a(str, b(i), str2).a((Map<String, Object>) hashMap).a();
    }
}

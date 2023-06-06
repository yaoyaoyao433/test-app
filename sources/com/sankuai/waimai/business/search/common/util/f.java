package com.sankuai.waimai.business.search.common.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public static void a(boolean z, String str, boolean z2, int i, boolean z3, String str2, String str3, int i2, String str4, String str5) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Integer.valueOf(i), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), str2, str3, Integer.valueOf(i2), str4, str5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1758064dfa31c762aa680e7c4f17a99e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1758064dfa31c762aa680e7c4f17a99e");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isFilterSearch", z);
            jSONObject.put("keyword", str);
            jSONObject.put("isLoadMore", z2);
            jSONObject.put("queryType", i);
            jSONObject.put("isFixKeyword", z3);
            jSONObject.put("recommendSearchGlobalId", str2);
            jSONObject.put("filterMapping", str3);
            jSONObject.put("productMode", i2);
            jSONObject.put("categoryCodeList", str4);
            jSONObject.put("businessFilterCodes", str5);
            com.sankuai.waimai.platform.capacity.log.b.a(new m().a("main_search_process").b("main_process_begin_search").d(jSONObject.toString()).b());
        } catch (JSONException unused) {
        }
    }
}

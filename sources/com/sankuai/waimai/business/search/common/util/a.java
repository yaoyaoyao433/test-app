package com.sankuai.waimai.business.search.common.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7238d4dd7ace7900092107c163c9ed24", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7238d4dd7ace7900092107c163c9ed24");
        }
        com.sankuai.waimai.alita.core.feature.b a2 = com.sankuai.waimai.alita.core.feature.c.a().a("waimai");
        if (a2 != null) {
            ArrayList arrayList = new ArrayList();
            com.sankuai.waimai.alita.core.feature.d dVar = new com.sankuai.waimai.alita.core.feature.d();
            dVar.b = "waimai";
            dVar.c = "lx_ad_search";
            dVar.d = "*";
            arrayList.add(dVar);
            JSONObject optJSONObject = a2.a(arrayList).optJSONObject("lx_ad_search");
            return optJSONObject != null ? optJSONObject.toString() : "";
        }
        return "";
    }
}

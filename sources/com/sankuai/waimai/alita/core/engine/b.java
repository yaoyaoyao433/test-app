package com.sankuai.waimai.alita.core.engine;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.config.AlitaBizConfigUtil;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class b {
    public static ChangeQuickRedirect a;
    private static b b;

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cb2e6feab3f3fb3202e267f11056e359", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cb2e6feab3f3fb3202e267f11056e359");
        }
        if (b == null) {
            synchronized (b.class) {
                if (b == null) {
                    b = new b();
                }
            }
        }
        return b;
    }

    public final void a(String str, List<JSONObject> list, h hVar) {
        boolean z;
        Object[] objArr = {str, list, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4fea206fcedabb50165d40bea64c2ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4fea206fcedabb50165d40bea64c2ba");
            return;
        }
        try {
            z = AlitaBizConfigUtil.a(2, d.a().a(str).d.b);
        } catch (Exception unused) {
            z = false;
        }
        if (!z) {
            a a2 = d.a().a(str);
            if (a2 != null) {
                a2.a(list, hVar);
                return;
            } else {
                com.sankuai.waimai.alita.core.base.util.c.a(hVar, new Exception("getJSEngine() = null"));
                return;
            }
        }
        com.sankuai.waimai.alita.core.base.util.c.a(hVar, new Exception("js calculate is closed"));
    }

    public final void a(com.sankuai.waimai.alita.bundle.model.a aVar, h hVar) {
        Object[] objArr = {aVar, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4445f25ac252dfba6f7e264ece8c2db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4445f25ac252dfba6f7e264ece8c2db");
        } else if (!AlitaBizConfigUtil.a(2, aVar.c)) {
            a a2 = d.a().a(aVar);
            if (a2 != null) {
                a2.a(aVar.b, hVar);
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2fff7f26134052b926cdac105ba303ac", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2fff7f26134052b926cdac105ba303ac");
                    return;
                }
                String str = "";
                String str2 = "";
                if (aVar != null) {
                    str = aVar.c;
                    if (aVar.e != null) {
                        str2 = aVar.e.c;
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("bundle_id", str);
                hashMap.put("version", str2);
                com.sankuai.waimai.alita.core.utils.c.a("alita_js", (String) null, "load", (HashMap<String, Object>) hashMap);
                return;
            }
            com.sankuai.waimai.alita.core.base.util.c.a(hVar, new Exception("getJSEngine() = null"));
        } else {
            com.sankuai.waimai.alita.core.base.util.c.a(hVar, new Exception("js calculate is closed"));
        }
    }
}

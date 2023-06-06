package com.sankuai.eh.component.service.network;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static ar b;

    public static EHNetService a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1a057337f3b81939cb4888d0f085e143", RobustBitConfig.DEFAULT_VALUE) ? (EHNetService) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1a057337f3b81939cb4888d0f085e143") : (EHNetService) a().a(EHNetService.class);
    }

    public static ar a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "eb98952057e0835f82a10f5585a9ab46", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "eb98952057e0835f82a10f5585a9ab46");
        }
        if (b == null) {
            b = new ar.a().a("https://portal-portm.meituan.com/eh/").a(com.sankuai.eh.component.service.a.c().e).a();
        }
        return b;
    }

    public static HashMap<String, String> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "81e089b5e9a9d241b97f6dab21b15fa6", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "81e089b5e9a9d241b97f6dab21b15fa6");
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("ehVersion", "3.12.0");
        hashMap.put("appVersion", com.sankuai.eh.component.service.a.c().i());
        hashMap.put("packageName", com.sankuai.eh.component.service.a.c().h());
        return hashMap;
    }
}

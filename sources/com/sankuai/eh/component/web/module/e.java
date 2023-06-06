package com.sankuai.eh.component.web.module;

import android.net.Uri;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.GetAppInfoJsHandler;
import com.dianping.titansadapter.TitansWebManager;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.web.plugins.k;
import com.sankuai.eh.component.web.plugins.l;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public static void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbaae246ea81d2b1536fc9ea0b9b01c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbaae246ea81d2b1536fc9ea0b9b01c7");
            return;
        }
        com.sankuai.eh.component.web.plugins.core.b.a(new com.sankuai.eh.component.web.plugins.core.c(), cVar);
        com.sankuai.eh.component.web.plugins.core.b.a(new com.sankuai.eh.component.web.plugins.c(), cVar);
        com.sankuai.eh.component.web.plugins.core.b.a(new com.sankuai.eh.component.web.plugins.g(), cVar);
        if (com.sankuai.eh.component.web.chain.f.a()) {
            com.sankuai.eh.component.web.plugins.core.b.a(new com.sankuai.eh.component.web.chain.b(), cVar);
        }
        if (((Boolean) cVar.c("ehdebug", Boolean.FALSE)).booleanValue()) {
            com.sankuai.eh.component.web.plugins.core.b.a(new k(), cVar);
        }
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2eed94ecba4e96c8156d12aa030718ba", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2eed94ecba4e96c8156d12aa030718ba");
        }
        return com.sankuai.eh.component.service.env.a.b + StringUtil.SPACE + TitansWebManager.ua() + " MeituanGroup/" + com.sankuai.eh.component.service.a.c().i();
    }

    public static void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f769684c1b23959ef5bd792c8c762a07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f769684c1b23959ef5bd792c8c762a07");
        } else if (hVar.e != null) {
            Object[] objArr2 = {hVar};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "c16bc7bd28c8df7b195a029e0faf0df1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "c16bc7bd28c8df7b195a029e0faf0df1");
                return;
            }
            com.sankuai.eh.component.web.plugins.core.b.a(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.a(hVar.e, "data", "use")), hVar.d);
            JsonElement a2 = com.sankuai.eh.component.service.utils.b.a(hVar.e, "data", "ux", "useEHTrans");
            if (a2 == null || !com.sankuai.eh.component.service.utils.b.a(a2, false).booleanValue()) {
                return;
            }
            com.sankuai.eh.component.web.plugins.core.b.a(new l(), hVar.d);
        }
    }

    public static String a(String str, JsonElement jsonElement) {
        Object[] objArr = {str, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "09277d4d82893e6ebc2242a30df8e325", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "09277d4d82893e6ebc2242a30df8e325") : com.sankuai.eh.component.service.utils.f.a(str, com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "key"), "unknown"), com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.a(jsonElement, "data", "key"), "unknown"));
    }

    public static void b(String str, JsonElement jsonElement) {
        Object[] objArr = {str, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b4772abf0ba6e046bd3cc30bb94833c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b4772abf0ba6e046bd3cc30bb94833c0");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            String a2 = a("special", jsonElement);
            try {
                Uri.decode(str);
            } catch (IllegalArgumentException unused) {
                new d.c().a(a2).a("type", d.EnumC0550d.LINK_ERROR_ENCODE.a()).a().b();
            }
            if (AbsApiFactory.PASSPORT_ONLINE_URL.equals(com.sankuai.eh.component.service.a.c().j().get(GetAppInfoJsHandler.EXTRA_FLAVOR)) && (str.contains("st.meituan.com") || str.contains("test.sankuai.com"))) {
                new d.c().a(a2).a("type", d.EnumC0550d.LINK_ERROR_HOST.a()).a().b();
            }
            if (str.length() > 2048) {
                new d.c().a(a2).a("type", d.EnumC0550d.LINK_ERROR_SIZE.a()).a().b();
            }
        }
    }

    public static void b(h hVar) {
        Object obj;
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "08ee24785fd718e22d10725919acb06c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "08ee24785fd718e22d10725919acb06c");
            return;
        }
        String str = hVar.b;
        JsonElement c = com.sankuai.eh.component.service.utils.b.c(hVar.e, "data");
        Object[] objArr2 = {str, c};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.component.service.utils.e.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "f502005f07fc740693ac59cd75ddb97f", RobustBitConfig.DEFAULT_VALUE)) {
            obj = (Map) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "f502005f07fc740693ac59cd75ddb97f");
        } else {
            d.b bVar = new d.b();
            bVar.a("utm_source", com.sankuai.eh.component.service.utils.e.b(str, "utm_source"));
            JsonArray b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(c, "searchParams"));
            for (int i = 0; b != null && i < b.size(); i++) {
                String b2 = com.sankuai.eh.component.service.utils.b.b(b.get(i), null);
                String b3 = com.sankuai.eh.component.service.utils.e.b(str, b2);
                if (!TextUtils.isEmpty(b2)) {
                    bVar.a(b2, b3);
                }
            }
            obj = bVar.b;
        }
        hVar.a("searchParams", obj);
        hVar.a("pattern", com.sankuai.eh.component.service.utils.b.a(hVar.e, "pattern"));
        hVar.c("autoshow", com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(hVar.e, "data", "autoshow"), false));
        hVar.c("notitlebar", com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(hVar.e, "data", "notitlebar"), false));
        hVar.c("scopeKey", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(hVar.e, "key"), "unknown"));
        hVar.c("pageKey", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.a(hVar.e, "data", "key"), "unknown"));
        if ("1".equals(com.sankuai.eh.component.service.utils.e.b(hVar.b, "ehdebug"))) {
            hVar.c("ehdebug", Boolean.TRUE);
        }
    }
}

package com.sankuai.eh.component.web.chain;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.component.service.utils.thread.a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class f {
    public static ChangeQuickRedirect a;
    private static Map<String, JsonObject> b = new ConcurrentHashMap();

    public static void a(String str, String str2, String str3, JsonElement jsonElement) {
        Object[] objArr = {str, str2, str3, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "89c4b630cb9105dbb15a613825ae1345", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "89c4b630cb9105dbb15a613825ae1345");
            return;
        }
        b(str);
        JsonObject jsonObject = b.get(str);
        if (!jsonObject.has(str2)) {
            jsonObject.add(str2, new JsonObject());
        }
        jsonObject.getAsJsonObject(str2).add(str3, jsonElement);
        a(str, jsonObject);
    }

    public static void a(String str, String str2, JsonElement jsonElement) {
        Object[] objArr = {str, str2, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f89ace7d325d3b90de6cc974f9b1c39f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f89ace7d325d3b90de6cc974f9b1c39f");
            return;
        }
        b(str);
        JsonObject jsonObject = b.get(str);
        jsonObject.add(str2, jsonElement);
        a(str, jsonObject);
    }

    public static void b(String str, String str2, JsonElement jsonElement) {
        Object[] objArr = {str, str2, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "84bd88cdfa42b93504f403bf8df219de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "84bd88cdfa42b93504f403bf8df219de");
            return;
        }
        b(str);
        JsonObject jsonObject = b.get(str);
        if (!jsonObject.has(a.CUSTOM_PING.i)) {
            jsonObject.add(a.CUSTOM_PING.i, new JsonObject());
        }
        jsonObject.getAsJsonObject(a.CUSTOM_PING.i).add(str2, jsonElement);
        a(str, jsonObject);
    }

    public static void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5fd8f148aac9d11a8da9e788fd8cb156", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5fd8f148aac9d11a8da9e788fd8cb156");
            return;
        }
        b(str);
        JsonObject jsonObject = b.get(str);
        if (jsonObject == null || jsonObject.has(a.CONDITION.i)) {
            return;
        }
        jsonObject.add(a.CONDITION.i, new JsonObject());
        String a2 = com.sankuai.eh.component.service.utils.e.a(com.sankuai.eh.component.service.utils.e.g(str2), "host");
        Object[] objArr2 = {str, a2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8263fa20ae778ba05ce7db2470253bee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8263fa20ae778ba05ce7db2470253bee");
            return;
        }
        com.sankuai.eh.component.service.utils.thread.b a3 = com.sankuai.eh.component.service.utils.thread.b.a();
        Object[] objArr3 = {a2, str};
        ChangeQuickRedirect changeQuickRedirect3 = h.a;
        a3.c(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fc499df7f849a9de8a03dcebd9104641", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0552a) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fc499df7f849a9de8a03dcebd9104641") : new h(a2, str));
    }

    private static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf1c943bba649f90614308e9ee88d9a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf1c943bba649f90614308e9ee88d9a5");
        } else if (b.containsKey(str)) {
        } else {
            b.put(str, new JsonObject());
            com.sankuai.eh.component.service.utils.thread.b.a().c(g.a(str));
        }
    }

    public static /* synthetic */ void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3218224a66301194cd4d8ca4454afe04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3218224a66301194cd4d8ca4454afe04");
            return;
        }
        try {
            Thread.sleep(10000L);
            JsonObject jsonObject = b.get(str);
            if (jsonObject != null && jsonObject.has(a.CONDITION.i)) {
                b(str, jsonObject);
            } else {
                b.remove(str);
            }
        } catch (InterruptedException e) {
            com.sankuai.eh.component.service.tools.d.a(e);
        }
    }

    private static void a(String str, JsonObject jsonObject) {
        Object[] objArr = {str, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a4694c50ef81a0543e03cd2ca725d980", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a4694c50ef81a0543e03cd2ca725d980");
            return;
        }
        if (((jsonObject != null ? jsonObject.size() : 0) + (jsonObject.get(a.CUSTOM_PING.i) != null ? jsonObject.getAsJsonObject(a.CUSTOM_PING.i).size() : 0)) - 1 == a.valuesCustom().length) {
            b(str, jsonObject);
        }
    }

    private static void b(String str, JsonObject jsonObject) {
        Object[] objArr = {str, jsonObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e016daa364da98972ff478b20966029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e016daa364da98972ff478b20966029");
            return;
        }
        jsonObject.remove(a.VAL_LAB.i);
        jsonObject.remove(a.CONDITION.i);
        com.sankuai.eh.component.service.tools.d.b("recorder", new d.b().a("data", jsonObject.toString()).a((Map) com.sankuai.eh.component.service.utils.b.a(jsonObject.get(a.VAL_LAB.i), Map.class)).b, null);
        new d.c().a("monitor.recorder").b();
        b.remove(str);
    }

    public static /* synthetic */ void b(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e3f7d9a3866c43df5f2d8d71863c267", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e3f7d9a3866c43df5f2d8d71863c267");
            return;
        }
        boolean a2 = com.sankuai.eh.component.service.utils.d.a(str);
        b(str2, a.CUSTOM_PING.j, new b.a().a("ping_self", a2).a("ping_other", com.sankuai.eh.component.service.utils.d.a("portal-portm.meituan.com")).a("ping_outer", com.sankuai.eh.component.service.utils.d.a("www.baidu.com")).b);
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b1799126415e259ec9c711f46239023c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b1799126415e259ec9c711f46239023c")).booleanValue() : com.sankuai.eh.component.service.utils.f.b(com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.database.d.c(), "global", "recorder"));
    }

    public static int a(com.sankuai.eh.component.web.module.h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de2b5ea5e9b1afa28e21cc9652009041", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de2b5ea5e9b1afa28e21cc9652009041")).intValue();
        }
        com.sankuai.eh.component.web.plugins.e a2 = hVar.a("monitor");
        if (a2 instanceof com.sankuai.eh.component.web.plugins.g) {
            com.sankuai.eh.component.web.plugins.g gVar = (com.sankuai.eh.component.web.plugins.g) a2;
            Object[] objArr2 = {"recorder"};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.component.web.plugins.g.a;
            return com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect2, false, "89f91bcff13188542d5c5f523bdfd4cf", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect2, false, "89f91bcff13188542d5c5f523bdfd4cf") : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.database.d.b("monitor", gVar.b), "recorder"), "type"), 0);
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum a {
        CONDITION("condition"),
        ENV("env"),
        VAL_LAB("val_lab"),
        LIFECYCLE("lifecycle"),
        REFERENCE("reference"),
        CUSTOM_WHITE("custom", "whiteScreen"),
        CUSTOM_PING("custom", "pingtest");
        
        public static ChangeQuickRedirect a;
        public final String i;
        public final String j;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d9bf5c601ce9748a357b38554ba980e7", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d9bf5c601ce9748a357b38554ba980e7") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3df2a304ddca9d4564a4f32f70351195", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3df2a304ddca9d4564a4f32f70351195") : (a[]) values().clone();
        }

        a(String str) {
            Object[] objArr = {r10, Integer.valueOf(r11), str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9eecbd25abd658d25ac0855eeaa2232", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9eecbd25abd658d25ac0855eeaa2232");
                return;
            }
            this.i = str;
            this.j = str;
        }

        a(String str, String str2) {
            Object[] objArr = {r10, Integer.valueOf(r11), str, str2};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b2e9cc700bcfea748aa63d77b02cec1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b2e9cc700bcfea748aa63d77b02cec1");
                return;
            }
            this.i = str;
            this.j = str2;
        }
    }
}

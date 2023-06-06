package com.sankuai.eh.component.web.chain;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.web.chain.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    private static LinkedHashMap<String, a<e>> b = new LinkedHashMap<>();
    private static Queue<d.a> c = new LinkedList();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a<T> extends LinkedList {
        boolean a;

        public a() {
        }
    }

    public static void a(String str, e eVar) {
        boolean z = false;
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "597103d624ac408b6774f34bf561d2cf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "597103d624ac408b6774f34bf561d2cf");
        } else if (b.get(str) == null) {
            if (b.size() >= 6) {
                Iterator<String> it = b.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    if (b.get(next).a) {
                        b.remove(next);
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    LinkedHashMap<String, a<e>> linkedHashMap = b;
                    linkedHashMap.remove(linkedHashMap.keySet().iterator().next());
                }
            }
            a<e> aVar = new a<>();
            aVar.add(eVar);
            b.put(str, aVar);
        } else {
            a<e> aVar2 = b.get(str);
            if (aVar2.size() >= 6) {
                aVar2.remove();
            }
            aVar2.add(eVar);
        }
    }

    public static JsonArray a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "97925a175e24bdef96151a0e31872db0", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "97925a175e24bdef96151a0e31872db0");
        }
        JsonArray jsonArray = new JsonArray();
        for (String str2 : b.keySet()) {
            if (!str.equals(str2)) {
                jsonArray.add(com.sankuai.eh.component.service.utils.b.a(((e) b.get(str2).peek()).toString()));
            }
        }
        return jsonArray;
    }

    public static void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "147fa814dd445b47f7ed09648efa8e75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "147fa814dd445b47f7ed09648efa8e75");
            return;
        }
        for (String str2 : b.keySet()) {
            if (str2.equals(str)) {
                b.get(str2).a = true;
            }
        }
    }

    public static JsonArray c(String str) {
        String jsonElement;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4cd97e6a84c978c3a6f6fe9a1c3a31b5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonArray) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4cd97e6a84c978c3a6f6fe9a1c3a31b5");
        }
        JsonArray jsonArray = new JsonArray();
        a<e> aVar = b.get(str);
        if (aVar != null) {
            for (e eVar : aVar) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = e.a;
                if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "e541639ecac65462d988d7f45e07758a", RobustBitConfig.DEFAULT_VALUE)) {
                    jsonElement = (String) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "e541639ecac65462d988d7f45e07758a");
                } else {
                    JsonElement a2 = com.sankuai.eh.component.service.utils.b.a(eVar.toString());
                    if (a2 instanceof JsonObject) {
                        JsonObject jsonObject = (JsonObject) a2;
                        jsonObject.remove("url");
                        jsonObject.remove("pattern");
                    }
                    jsonElement = a2.toString();
                }
                jsonArray.add(com.sankuai.eh.component.service.utils.b.a(jsonElement));
            }
        }
        return jsonArray;
    }

    public static void a(d.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4ce43361dfbf1577271b44fe95e51eb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4ce43361dfbf1577271b44fe95e51eb1");
            return;
        }
        if (c.size() >= 6) {
            c.remove();
        }
        c.add(aVar);
    }

    public static String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "77a8618c751a1633090a23abc0e0d9ba", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "77a8618c751a1633090a23abc0e0d9ba") : com.sankuai.eh.component.service.utils.b.a(c);
    }
}

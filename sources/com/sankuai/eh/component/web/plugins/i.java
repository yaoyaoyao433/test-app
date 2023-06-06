package com.sankuai.eh.component.web.plugins;

import android.text.TextUtils;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class i extends b {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement Y_() {
        return null;
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "01";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return "bridge";
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement d() {
        return null;
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5bbde7a3df6f0a6ed91bb2f5165ee205", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5bbde7a3df6f0a6ed91bb2f5165ee205") : new String[]{"onModuleStart", "onKNBJSCall", "onModuleClose"};
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        char c;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1932b9cbfa43c6e0e74712eaa1ea6eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1932b9cbfa43c6e0e74712eaa1ea6eb");
            return;
        }
        String a2 = aVar.a();
        int hashCode = a2.hashCode();
        if (hashCode == -1011630009) {
            if (a2.equals("onKNBJSCall")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -741805171) {
            if (hashCode == -726803977 && a2.equals("onModuleStart")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (a2.equals("onModuleClose")) {
                c = 2;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                h();
                return;
            case 1:
                if ("getRiskInfo".equals(aVar.b()) && a(aVar.c().optString("url"))) {
                    try {
                        int i = this.d.r;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("windowStatus", a(i) ? "1" : "0");
                        jSONObject.put("audioStatus", "0");
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("data", jSONObject);
                        ((com.sankuai.eh.component.web.bridge.c) aVar.d()).a(jSONObject2);
                        com.sankuai.eh.component.service.tools.d.b("getRiskInfo.callback.success", new d.b().a("plugin", "bridge").a("methodName", "getRiskInfo").a("callbackMessage", "success").a(this.d.a()).b);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 2:
                a(true);
                return;
            default:
                return;
        }
    }

    public static boolean a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4ab73d9e1d67c1bf78758ba403e6743", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4ab73d9e1d67c1bf78758ba403e6743")).booleanValue();
        }
        try {
            JsonArray b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.a(jsonElement, "data", "use"));
            for (int i = 0; i < b.size(); i++) {
                if (TextUtils.equals(((JsonObject) b.get(i)).get("name").getAsString(), "bridge")) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b5e834b98b28c5f4e93d22dc6587a250", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b5e834b98b28c5f4e93d22dc6587a250")).booleanValue();
        }
        try {
            JsonArray b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.database.d.b("bridge", com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.database.d.a(str), "data")), Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST));
            for (int i = 0; i < b.size(); i++) {
                JsonElement jsonElement = b.get(i);
                JsonElement jsonElement2 = ((JsonObject) jsonElement).get("name");
                JsonElement jsonElement3 = ((JsonObject) jsonElement).get("enabled");
                if (TextUtils.equals(jsonElement2.getAsString(), "eh.getRiskInfo") && jsonElement3.getAsBoolean()) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean a(int i) {
        boolean z = false;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94af05f2a5214ada8de109a7f8735638", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94af05f2a5214ada8de109a7f8735638")).booleanValue();
        }
        if (i == 0 || i == 2) {
            return i == 2;
        }
        try {
            Set<String> hashSet = new HashSet<>();
            if (hashSet.isEmpty()) {
                hashSet = com.sankuai.eh.component.service.database.a.a().b("motionEventFlagsSet", hashSet);
            }
            for (String str : hashSet) {
                if (i - Integer.parseInt(str) == 2) {
                    z = true;
                }
            }
            String valueOf = String.valueOf(i);
            if (hashSet.contains(valueOf)) {
                return z;
            }
            hashSet.add(valueOf);
            com.sankuai.eh.component.service.database.a.a().a("motionEventFlagsSet", hashSet);
            return z;
        } catch (Exception unused) {
            return z;
        }
    }
}

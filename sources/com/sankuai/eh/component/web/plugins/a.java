package com.sankuai.eh.component.web.plugins;

import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.plugins.apiPrefetch.a;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a extends b {
    public static ChangeQuickRedirect a;
    private com.sankuai.eh.plugins.apiPrefetch.a b;
    private com.sankuai.eh.component.web.bridge.c f;
    private int g;
    private int h;

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "00";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return "api_fetch";
    }

    public static /* synthetic */ int a(a aVar) {
        int i = aVar.h;
        aVar.h = i + 1;
        return i;
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbec1c945776124c39ddcf70616b4cc7", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbec1c945776124c39ddcf70616b4cc7") : new String[]{"onModuleStart", "onPageStart", "onKNBJSCall", "onPageClose", "onComponentClose"};
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        char c;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f69d295423fb81308cbd5228dad4e6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f69d295423fb81308cbd5228dad4e6b");
        } else if (this.e.c || com.sankuai.eh.component.service.database.d.e()) {
            String a2 = aVar.a();
            int hashCode = a2.hashCode();
            if (hashCode == -1011630009) {
                if (a2.equals("onKNBJSCall")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode == -726803977) {
                if (a2.equals("onModuleStart")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != 827001226) {
                if (hashCode == 842002420 && a2.equals("onPageStart")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (a2.equals("onPageClose")) {
                    c = 3;
                }
                c = 65535;
            }
            switch (c) {
                case 0:
                case 1:
                    if (this.b != null || d() == null) {
                        return;
                    }
                    com.sankuai.eh.plugins.apiPrefetch.a.a("plugin_create");
                    this.b = new com.sankuai.eh.plugins.apiPrefetch.a(i(), new C0555a());
                    if (this.b.a()) {
                        com.sankuai.eh.plugins.apiPrefetch.a.a("plugin_work");
                        this.e.a("apiPrefetchEnabled", Boolean.TRUE);
                        h();
                        return;
                    }
                    return;
                case 2:
                    if ("api_fetch".equals(aVar.b())) {
                        com.sankuai.eh.plugins.apiPrefetch.a.a("plugin_js_call");
                        JSONObject c2 = aVar.c();
                        this.f = (com.sankuai.eh.component.web.bridge.c) aVar.d();
                        if (this.b != null) {
                            this.b.a(c2.optString("url"), new a.d() { // from class: com.sankuai.eh.component.web.plugins.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.eh.plugins.apiPrefetch.a.d
                                public final void a(JSONObject jSONObject) {
                                    Object[] objArr2 = {jSONObject};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a53ee1ec4623f8fc61630ba62fc23153", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a53ee1ec4623f8fc61630ba62fc23153");
                                        return;
                                    }
                                    a.a(a.this);
                                    a.this.f.a(jSONObject);
                                }

                                @Override // com.sankuai.eh.plugins.apiPrefetch.a.d
                                public final void a(String str) {
                                    Object[] objArr2 = {str};
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d6cded727709dd5a144f21dedf9835b", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d6cded727709dd5a144f21dedf9835b");
                                        return;
                                    }
                                    a.a(a.this);
                                    a.this.f.a(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID, str);
                                }
                            });
                            return;
                        } else {
                            this.f.a(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_GET_REQUEST_ID, "apiFetch not init");
                            return;
                        }
                    }
                    return;
                case 3:
                    if (this.g == this.h) {
                        a(true);
                    } else {
                        a(false);
                    }
                    if (this.b != null) {
                        com.sankuai.eh.plugins.apiPrefetch.a.a("plugin_api_cancel");
                        this.b.b();
                        this.b = null;
                        this.g = 0;
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dff5937f71ad70a6e0b9e2ba7277c1c", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dff5937f71ad70a6e0b9e2ba7277c1c") : com.sankuai.eh.component.service.database.d.b("api_fetch", com.sankuai.eh.component.service.utils.b.c(this.e.e, "data"));
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement Y_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a01a6d1a6a8846dd02e732f97d20179", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a01a6d1a6a8846dd02e732f97d20179") : com.sankuai.eh.component.service.database.d.c();
    }

    private JsonElement i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9017e410bcefa67c600e00ecc8a6c28", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9017e410bcefa67c600e00ecc8a6c28");
        }
        JsonArray b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(d(), "resources"));
        JsonArray jsonArray = new JsonArray();
        Iterator<JsonElement> it = b.iterator();
        while (it.hasNext()) {
            jsonArray.add(com.sankuai.eh.component.service.database.d.c("api_fetch", com.sankuai.eh.component.service.utils.b.c(it.next(), "id")));
        }
        return new b.a().a("url", new JsonPrimitive(this.e.b)).a("pattern", new JsonPrimitive((String) this.e.b("pattern", ""))).a("data", new b.a().a(JsBridgeResult.ARG_KEY_LOCATION_MODE, new JsonPrimitive((Number) Integer.valueOf(b.size() > 1 ? 2 : 0))).a(Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST, jsonArray).b).a("ua", new JsonPrimitive(com.sankuai.eh.component.web.module.e.a())).a("api_sign", new JsonPrimitive("ehc")).b;
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.component.web.plugins.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0555a implements com.sankuai.eh.plugins.a {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.eh.plugins.a
        public final void b(Object obj) {
        }

        @Override // com.sankuai.eh.plugins.a
        public final void c(Object obj) {
        }

        public C0555a() {
        }

        @Override // com.sankuai.eh.plugins.a
        public final void a(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64b623eeb1a5cde210b513c4b1aae3ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64b623eeb1a5cde210b513c4b1aae3ed");
            } else if (obj instanceof Integer) {
                a.this.g = ((Integer) obj).intValue();
            }
        }
    }
}

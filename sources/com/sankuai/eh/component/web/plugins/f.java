package com.sankuai.eh.component.web.plugins;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.plugins.runtime.a;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class f extends b {
    public static ChangeQuickRedirect a;
    public com.sankuai.eh.plugins.runtime.a b;
    public int f;
    private String g;
    private int h;
    private SparseArray i;

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement Y_() {
        return null;
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "00";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return "js_module";
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5ae76473701a302e5312869aae939a0", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5ae76473701a302e5312869aae939a0") : com.sankuai.eh.component.service.database.d.b("js_module", com.sankuai.eh.component.service.utils.b.c(this.e.e, "data"));
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1699b4733ed3358d248f3e431b0db3b6", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1699b4733ed3358d248f3e431b0db3b6") : new String[]{"onActivityCreated", "onKNBJSCall", "onPageLoad", "onPageClose", "onModuleClose"};
    }

    @Override // com.sankuai.eh.component.web.plugins.b, com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.module.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "043638bc8b9abc53df5aa863008eca21", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "043638bc8b9abc53df5aa863008eca21");
            return;
        }
        super.a(cVar);
        this.g = com.sankuai.eh.component.service.utils.d.a((Object) cVar.i);
        this.i = new SparseArray();
        this.i.put(0, "onPageLoad");
        this.i.put(1, "onPageClose");
        this.i.put(3, "onKNBJSCall");
        this.h = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(d(), "resources")).size();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        char c;
        Iterator<JsonElement> it;
        JsonElement jsonElement;
        String str;
        int i = 1;
        int i2 = 0;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0271089dafae95a61b50893791505c65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0271089dafae95a61b50893791505c65");
            return;
        }
        String a2 = aVar.a();
        switch (a2.hashCode()) {
            case -1011630009:
                if (a2.equals("onKNBJSCall")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -665788652:
                if (a2.equals("onPageLoad")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 126661882:
                if (a2.equals("onActivityCreated")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 827001226:
                if (a2.equals("onPageClose")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 842002420:
                if (a2.equals("onPageStart")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
                if (this.b == null) {
                    if (this.d.m == null) {
                        if (this.d.k != null) {
                            h();
                            this.b = new com.sankuai.eh.plugins.runtime.a(new a(new com.sankuai.eh.component.web.module.d(this.d.k)));
                            return;
                        }
                        return;
                    }
                    h();
                    this.b = new com.sankuai.eh.plugins.runtime.a(new a(new com.sankuai.eh.component.web.module.d(this.d.m)));
                    return;
                }
                return;
            case 2:
                if (!"ehshow".equals(aVar.b())) {
                    return;
                }
                break;
            case 3:
            case 4:
                break;
            default:
                return;
        }
        if (this.b == null) {
            return;
        }
        JsonArray b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(d(), "resources"));
        if (b.size() <= 0) {
            return;
        }
        Iterator<JsonElement> it2 = b.iterator();
        while (it2.hasNext()) {
            JsonElement next = it2.next();
            int a3 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(next, "timing"), i2);
            if (com.sankuai.eh.component.service.utils.f.b(next)) {
                if (aVar.a().equals(this.i.get(a3))) {
                    com.sankuai.eh.plugins.runtime.a aVar2 = this.b;
                    Object[] objArr2 = new Object[i];
                    objArr2[i2] = next;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1024e88d3e8a2d6084767160eb05c18", RobustBitConfig.DEFAULT_VALUE)) {
                        jsonElement = (JsonElement) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, i2, "a1024e88d3e8a2d6084767160eb05c18");
                        it = it2;
                    } else {
                        JsonElement c2 = com.sankuai.eh.component.service.database.d.c("js_module", com.sankuai.eh.component.service.utils.b.c(next, "id"));
                        b.a a4 = new b.a(next).a("pattern", new JsonPrimitive((String) this.e.b("pattern", "")));
                        Object[] objArr3 = new Object[i2];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        it = it2;
                        jsonElement = a4.a("catKey", new JsonPrimitive(PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b1f22eeb7fb02326352338300bbcd98f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b1f22eeb7fb02326352338300bbcd98f") : com.sankuai.eh.component.service.utils.f.a("js_module", (String) this.e.d("scopeKey", "unknown"), (String) this.e.d("pageKey", "unknown")))).a("primaryKey", com.sankuai.eh.component.service.utils.b.c(c2, "primaryKey")).a("script", com.sankuai.eh.component.service.utils.b.c(c2, "content")).a("scriptKey", com.sankuai.eh.component.service.utils.b.c(c2, "key")).b;
                    }
                    Object[] objArr4 = {jsonElement};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.eh.plugins.runtime.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "a1cf0f20d845b2281a73e1795bf76c03", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "a1cf0f20d845b2281a73e1795bf76c03");
                    } else {
                        String b2 = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "action"), "");
                        Object[] objArr5 = {b2};
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.eh.plugins.runtime.a.a;
                        if (PatchProxy.isSupport(objArr5, aVar2, changeQuickRedirect5, false, "4e0ad3680bca425c6d9c3dcf697114ab", RobustBitConfig.DEFAULT_VALUE)) {
                            str = (String) PatchProxy.accessDispatch(objArr5, aVar2, changeQuickRedirect5, false, "4e0ad3680bca425c6d9c3dcf697114ab");
                        } else {
                            str = b2 + CommonConstant.Symbol.UNDERLINE + com.sankuai.eh.component.service.utils.d.a(8);
                        }
                        aVar2.b.put(str, jsonElement);
                        int a5 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "delay"), 0);
                        if (a5 == 0) {
                            aVar2.a(jsonElement, str);
                        } else {
                            new Handler(Looper.getMainLooper()).postDelayed(com.sankuai.eh.plugins.runtime.b.a(aVar2, jsonElement, str), a5);
                        }
                    }
                } else {
                    it = it2;
                }
                if (com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(next, "onetime"), false).booleanValue()) {
                    it.remove();
                }
                it2 = it;
                i = 1;
                i2 = 0;
            }
        }
        if ("onPageClose".equals(aVar.a())) {
            if (this.h == this.f) {
                a(true);
            } else {
                a(false);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public class a implements a.InterfaceC0564a {
        public static ChangeQuickRedirect a;
        private com.sankuai.eh.component.web.module.d c;

        public a(com.sankuai.eh.component.web.module.d dVar) {
            Object[] objArr = {f.this, dVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf9abf8407d59077b06694a515d4f8c3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf9abf8407d59077b06694a515d4f8c3");
            } else {
                this.c = dVar;
            }
        }

        @Override // com.sankuai.eh.plugins.runtime.a.InterfaceC0564a
        public final void a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e0e6e7e65938099920ae1167502d1e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e0e6e7e65938099920ae1167502d1e3");
            } else if (this.c != null) {
                this.c.a(str, null);
            }
        }
    }
}

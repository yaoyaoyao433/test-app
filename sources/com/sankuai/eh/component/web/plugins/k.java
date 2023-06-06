package com.sankuai.eh.component.web.plugins;

import android.net.Uri;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.network.EHNetService;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.plugins.skeleton.vg.a;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class k extends b {
    public static ChangeQuickRedirect a;
    public com.sankuai.eh.plugins.skeleton.vg.a b;
    private boolean f;

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String a() {
        return "00";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String b() {
        return "skeleton";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bff262a2c5072f329c4656d39e297d3", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bff262a2c5072f329c4656d39e297d3") : new String[]{"onViewCrated", "onPageStart", "onPageLoad", "onKNBJSCall", "onCustomMessage", "onModuleClose"};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        char c;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa4b45c43d75b82205448e3dc08a8b9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa4b45c43d75b82205448e3dc08a8b9c");
        } else if (this.e.c || com.sankuai.eh.component.service.database.d.e()) {
            String a2 = aVar.a();
            switch (a2.hashCode()) {
                case -1466015817:
                    if (a2.equals("onCustomMessage")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1011630009:
                    if (a2.equals("onKNBJSCall")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -665788652:
                    if (a2.equals("onPageLoad")) {
                        c = 2;
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
                case 1018055493:
                    if (a2.equals("onViewCrated")) {
                        c = 1;
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
                    if (this.b == null) {
                        this.f = true;
                        break;
                    } else {
                        return;
                    }
                case 1:
                    break;
                case 2:
                    if (((Boolean) this.e.d("autoshow", Boolean.FALSE)).booleanValue()) {
                        b(aVar);
                        return;
                    }
                    return;
                case 3:
                    if ("ehshow".equals(aVar.b())) {
                        b(aVar);
                    }
                    if ("showSkeleton".equals(aVar.b())) {
                        a(a(com.sankuai.eh.component.service.database.d.b("skeleton", com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.database.d.a(aVar.c().optString("url")), "data"))), true);
                        return;
                    }
                    return;
                case 4:
                    if (!"force".equals(aVar.b()) || this.b == null) {
                        return;
                    }
                    b(aVar);
                    return;
                default:
                    return;
            }
            h();
            if ("1".equals(com.sankuai.eh.component.service.utils.e.b(this.e.b, "ehdebug"))) {
                i();
                return;
            }
            JsonElement a3 = a(d());
            if (a3 == null) {
                this.e.a("skeleton", Boolean.FALSE);
                a(false);
                return;
            }
            this.e.a("skeleton", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(a3, "key"), "true"));
            if (com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(a3, "autoshow"), false).booleanValue()) {
                this.e.c("autoshow", Boolean.TRUE);
            }
            if (((Boolean) this.e.d("ehdebug", Boolean.FALSE)).booleanValue()) {
                i();
            } else {
                a(a3, this.f);
            }
        }
    }

    @Override // com.sankuai.eh.component.web.plugins.b, com.sankuai.eh.component.web.plugins.e
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d7dabf3b23990bc1d6b10c452ad63a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d7dabf3b23990bc1d6b10c452ad63a8");
            return;
        }
        super.f();
        com.sankuai.eh.plugins.skeleton.a.a(this.b, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JsonElement jsonElement, boolean z) {
        Object[] objArr = {jsonElement, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c97ba32ffc8e55cbe0d7d9cf294ed058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c97ba32ffc8e55cbe0d7d9cf294ed058");
            return;
        }
        com.sankuai.eh.plugins.skeleton.a.a(this.b, null);
        a.C0566a a2 = com.sankuai.eh.plugins.skeleton.a.a(this.d.p).a(new com.sankuai.eh.plugins.skeleton.util.b(this.d.i, new b.a().a("data", jsonElement).a("isFadeIn", z).a("notitlebar", new JsonPrimitive((Boolean) this.e.d("notitlebar", Boolean.FALSE))).b));
        a2.c = true;
        a2.b = true;
        this.b = a2.a();
        a(true);
    }

    private void b(com.sankuai.eh.component.web.plugins.api.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b58446e3e213dd4616e15c3063cc4c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b58446e3e213dd4616e15c3063cc4c2c");
            return;
        }
        com.sankuai.eh.plugins.skeleton.a.a(this.b, null);
        this.b = null;
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18272c3c98e94cd433068aa6bf66129f", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18272c3c98e94cd433068aa6bf66129f") : com.sankuai.eh.component.service.database.d.b("skeleton", com.sankuai.eh.component.service.utils.b.c(this.e.e, "data"));
    }

    @Override // com.sankuai.eh.component.web.plugins.b
    public final JsonElement Y_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e9fef808d5ee65c9b4b439a3edb81b9", RobustBitConfig.DEFAULT_VALUE) ? (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e9fef808d5ee65c9b4b439a3edb81b9") : com.sankuai.eh.component.service.database.d.c();
    }

    private JsonElement a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5afecda077ccab57b537cd4717bdfce2", RobustBitConfig.DEFAULT_VALUE)) {
            return (JsonElement) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5afecda077ccab57b537cd4717bdfce2");
        }
        Iterator<JsonElement> it = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "resources")).iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            if (com.sankuai.eh.component.service.utils.f.a(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(next, "ab")))) {
                return com.sankuai.eh.component.service.database.d.c("skeleton", com.sankuai.eh.component.service.utils.b.c(next, "id"));
            }
        }
        return null;
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e09eecca44bb5e16df096014ce88728d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e09eecca44bb5e16df096014ce88728d");
            return;
        }
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("key", com.sankuai.eh.component.service.utils.c.b(this.e.b));
            hashMap.put("ehdebug", "1");
            for (String str : Uri.parse(this.e.b).getQueryParameterNames()) {
                hashMap.put(str, Uri.parse(this.e.b).getQueryParameter(str));
            }
            hashMap.put("os", "android");
            hashMap.putAll(com.sankuai.eh.component.service.network.a.b());
            Uri.Builder buildUpon = Uri.parse(this.e.b).buildUpon();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            ((EHNetService) com.sankuai.eh.component.service.network.a.a().a(EHNetService.class)).callPlayGround(hashMap).a(new com.sankuai.meituan.retrofit2.f<ap>() { // from class: com.sankuai.eh.component.web.plugins.k.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<ap> call, Response<ap> response) {
                    Object[] objArr2 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2439616fe6c3e83ca4a4a0844f4cc5e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2439616fe6c3e83ca4a4a0844f4cc5e5");
                        return;
                    }
                    try {
                        com.sankuai.eh.component.service.tools.d.a("主动请求链接", call.e().b());
                        String string = response.e().string();
                        com.sankuai.eh.component.service.tools.d.a("主动请求下载完成", string);
                        k.this.a(com.sankuai.eh.component.service.utils.b.a(string), true);
                    } catch (Exception unused) {
                        com.sankuai.eh.component.service.tools.d.a("主动请求响应数据有误", response.e().string());
                    }
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<ap> call, Throwable th) {
                    Object[] objArr2 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04f41996c16764dafa6dd4f5cd99f4ad", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04f41996c16764dafa6dd4f5cd99f4ad");
                        return;
                    }
                    com.sankuai.eh.component.service.tools.d.a("主动请求链接", call.e().b());
                    com.sankuai.eh.component.service.tools.d.a("哎呀！主动请求下载失败了，快看看原因", th.getMessage());
                }
            });
        } catch (Exception unused) {
        }
    }
}

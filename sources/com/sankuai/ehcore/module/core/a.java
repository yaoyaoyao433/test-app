package com.sankuai.ehcore.module.core;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.plugins.skeleton.vg.a;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import com.sankuai.meituan.retrofit2.ap;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a implements Handler.Callback {
    public static ChangeQuickRedirect a;
    public boolean b;
    public boolean c;
    int d;
    public WebView e;
    public Activity f;
    public com.sankuai.ehcore.detector.a g;
    public com.sankuai.ehcore.tools.b h;
    public g i;
    public com.sankuai.eh.plugins.apiPrefetch.a j;
    public com.sankuai.ehcore.module.loader.g k;
    public long l;
    private boolean m;
    private boolean n;
    private int o;
    private long p;
    private com.sankuai.eh.plugins.skeleton.vg.a q;
    private com.sankuai.eh.component.service.tools.e<a> r;

    public a(Context context, View view, WebView webView, com.sankuai.ehcore.tools.b bVar, int i) {
        Object[] objArr = {context, view, webView, bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d719c47d2ed59400f4c0c61c0a7cd479", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d719c47d2ed59400f4c0c61c0a7cd479");
            return;
        }
        this.m = false;
        this.b = true;
        this.n = true;
        this.c = false;
        this.r = new com.sankuai.eh.component.service.tools.e<>(this);
        this.l = 0L;
        if (context instanceof Activity) {
            this.f = (Activity) context;
        }
        this.e = webView;
        this.d = i;
        this.h = bVar;
        this.i = new g(context, view, this);
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b2f02af43b0aa95aff43615611950ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b2f02af43b0aa95aff43615611950ef");
            return;
        }
        this.p = System.currentTimeMillis();
        this.o = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(this.h.a().get("timeout")).get("time"), 5000);
        this.r.sendEmptyMessageDelayed(102, this.o);
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53131b282d6eb0b2971cb2ec18ecda97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53131b282d6eb0b2971cb2ec18ecda97");
            return;
        }
        a();
        this.h.m = i();
        if (this.m) {
            return;
        }
        this.m = true;
        com.sankuai.eh.component.service.tools.d.a("真实加载链接", this.h.m);
        a("eh_show", new d.b().a("name", "eh.page.show").a("event", z ? "force" : "success").a("autoshow", Boolean.valueOf(this.h.n)).a("currentUrl", this.h.m).a("monitoryType", Integer.valueOf(c())).b, Long.valueOf(this.h.b("at_eh_open")));
        if (z) {
            com.sankuai.eh.component.service.tools.d.b("页面执行强开");
            String b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(this.h.a().get("timeout")).get("catKey"), "eh_cat");
            Class<?> cls = getClass();
            com.dianping.codelog.b.b(cls, b + " force open", h());
        }
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb3947d7dff99d9fad8e3aa2ec5bbff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb3947d7dff99d9fad8e3aa2ec5bbff6");
        } else if (this.q != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.p;
            if (currentTimeMillis < 400) {
                this.r.sendEmptyMessageDelayed(103, 400 - currentTimeMillis);
                return;
            }
            com.sankuai.eh.plugins.skeleton.a.a(this.q, b.a(this));
            this.q = null;
        }
    }

    public static /* synthetic */ void c(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "58e2b85f3b8062e32bd92a84ad6ca91a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "58e2b85f3b8062e32bd92a84ad6ca91a");
        } else {
            aVar.c = true;
        }
    }

    public void a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "276d7cd6337aa0cf0a42941ea671ac6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "276d7cd6337aa0cf0a42941ea671ac6f");
        } else if (com.sankuai.ehcore.horn.e.h()) {
        } else {
            g();
            if (com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "autoshow"), false).booleanValue()) {
                this.h.n = true;
            }
            if (this.q != null) {
                this.q.b();
                this.q = null;
            }
            a.C0566a a2 = com.sankuai.eh.plugins.skeleton.a.a(this.i).a(new com.sankuai.eh.plugins.skeleton.util.b(this.f, new b.a().a("data", jsonElement).b));
            a2.c = true;
            a2.b = true;
            this.q = a2.a();
            if (this.q == null) {
                this.n = false;
                return;
            }
            this.c = false;
            com.sankuai.ehcore.tools.b e = e();
            e.d("skeleton: " + e().g);
        }
    }

    private String h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "254e5eb93e392b623dc498e0fde7fb88", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "254e5eb93e392b623dc498e0fde7fb88");
        }
        JSONObject jSONObject = new JSONObject();
        com.sankuai.ehcore.detector.a.a(jSONObject, e());
        com.sankuai.ehcore.detector.a.a(jSONObject, this.e);
        return jSONObject.toString();
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object[] objArr = {message};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a20e89f53ae837e84d916c072e3e5664", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a20e89f53ae837e84d916c072e3e5664")).booleanValue();
        }
        if (this.f == null || this.f.isFinishing()) {
            return false;
        }
        switch (message.what) {
            case 102:
                a(true);
                break;
            case 103:
                com.sankuai.eh.plugins.skeleton.vg.a aVar = this.q;
                Object[] objArr2 = {this};
                ChangeQuickRedirect changeQuickRedirect2 = c.a;
                com.sankuai.eh.plugins.skeleton.a.a(aVar, PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1188768f44dd2afe549e125ec0a3a778", RobustBitConfig.DEFAULT_VALUE) ? (a.b) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1188768f44dd2afe549e125ec0a3a778") : new c(this));
                this.q = null;
                break;
        }
        return false;
    }

    public static /* synthetic */ void b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3a496873553ab22b9ddd8121eba281d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3a496873553ab22b9ddd8121eba281d9");
        } else {
            aVar.c = true;
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1265afcf0bc476b090cc055a0fc4297c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1265afcf0bc476b090cc055a0fc4297c");
            return;
        }
        this.h.m = i();
        JsonElement jsonElement = this.h.a().get("rum");
        if (com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "enabled"), false).booleanValue()) {
            String c = com.sankuai.ehcore.horn.e.c(com.sankuai.eh.component.service.utils.c.a(com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(com.sankuai.ehcore.horn.e.e(), "path"), "")));
            if (this.e == null || TextUtils.isEmpty(c)) {
                return;
            }
            this.e.evaluateJavascript(c.replaceFirst("__eh_rum__", com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(jsonElement, "pattern", new JsonPrimitive(this.h.i)))), d.a(this));
        }
    }

    public static /* synthetic */ void a(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f42a154bb845b6e1452153e55e9c47bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f42a154bb845b6e1452153e55e9c47bd");
            return;
        }
        aVar.h.b("rum", str);
        com.sankuai.eh.component.service.tools.d.a("new_perform", str);
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d77feb0a9ec247e3a9538c8e6ef362e4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d77feb0a9ec247e3a9538c8e6ef362e4")).intValue();
        }
        if (this.g != null) {
            return this.g.d;
        }
        return 0;
    }

    public final com.sankuai.eh.plugins.apiPrefetch.a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ef2724355c4d4876347940b6bb10715", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.eh.plugins.apiPrefetch.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ef2724355c4d4876347940b6bb10715");
        }
        if (this.j == null) {
            return new com.sankuai.eh.plugins.apiPrefetch.a(new JsonPrimitive(""));
        }
        return this.j;
    }

    public final void a(String str, Map<String, Object> map, Long l) {
        Object[] objArr = {str, map, l};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5793f3baf8d6eac06e90866cfb55f13f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5793f3baf8d6eac06e90866cfb55f13f");
        } else {
            com.sankuai.ehcore.util.a.a(str, new d.b().a(map).a(com.sankuai.ehcore.util.a.a(this.h)).b, l);
        }
    }

    private String i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2468f1e3fa3ee3542942b5fac37688b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2468f1e3fa3ee3542942b5fac37688b1");
        }
        if (this.e != null) {
            return this.e.getUrl();
        }
        return null;
    }

    public final com.sankuai.ehcore.tools.b e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86878c3e429a0131375ce4b1b51ece71", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.ehcore.tools.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86878c3e429a0131375ce4b1b51ece71");
        }
        if (this.h == null) {
            return new com.sankuai.ehcore.tools.b();
        }
        return this.h;
    }

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c1596ea792222b4f6e411be67c43a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c1596ea792222b4f6e411be67c43a3");
            return;
        }
        try {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("key", com.sankuai.eh.component.service.utils.c.b(this.h.k));
            hashMap.put("ehdebug", "1");
            boolean z = PreferenceManager.getDefaultSharedPreferences(this.f).getBoolean("enable_horn_debug", false);
            for (String str : Uri.parse(this.h.k).getQueryParameterNames()) {
                hashMap.put(str, Uri.parse(this.h.k).getQueryParameter(str));
            }
            hashMap.put("os", z ? "android_test" : "android");
            hashMap.putAll(com.sankuai.eh.component.service.network.a.b());
            Uri.Builder buildUpon = Uri.parse(this.h.k).buildUpon();
            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                buildUpon.appendQueryParameter(entry.getKey(), entry.getValue());
            }
            com.sankuai.eh.component.service.network.a.a(false).callPlayGround(hashMap).a(new com.sankuai.meituan.retrofit2.f<ap>() { // from class: com.sankuai.ehcore.module.core.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onResponse(Call<ap> call, Response<ap> response) {
                    Object[] objArr2 = {call, response};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "742f701d045a4ba2e604fd9ba8cce3c6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "742f701d045a4ba2e604fd9ba8cce3c6");
                        return;
                    }
                    try {
                        com.sankuai.eh.component.service.tools.d.a("主动请求链接", call.e().b());
                        String string = response.e().string();
                        com.sankuai.eh.component.service.tools.d.a("主动请求下载完成", string);
                        a.this.a(com.sankuai.eh.component.service.utils.b.a(string));
                    } catch (Exception unused) {
                        com.sankuai.eh.component.service.tools.d.a("主动请求响应数据有误", response.e().string());
                    }
                }

                @Override // com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<ap> call, Throwable th) {
                    Object[] objArr2 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad8c1565887a2987560866863369bb4a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad8c1565887a2987560866863369bb4a");
                        return;
                    }
                    com.sankuai.eh.component.service.tools.d.a("主动请求链接", call.e().b());
                    com.sankuai.eh.component.service.tools.d.a("哎呀！主动请求下载失败了，快看看原因", th.getMessage());
                }
            });
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "684f32b67bec7c2f8b92f9e0bb6d34c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "684f32b67bec7c2f8b92f9e0bb6d34c9");
        } else {
            aVar.e.evaluateJavascript("(function() {\n    var link = document.createElement('script');\n    link.src = \"https://cdn.bootcss.com/vConsole/3.3.0/vconsole.min.js\";\n    document.head.appendChild(link);\n\tlink.onload = function() {\n\tnew VConsole();    \n}\n})();", null);
        }
    }
}

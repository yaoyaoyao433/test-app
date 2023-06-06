package com.sankuai.eh.component.web.module;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.component.web.plugins.api.a;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class i implements j {
    public static ChangeQuickRedirect e;
    private h a;
    private boolean b;
    private boolean c;
    protected c f;

    @Override // com.sankuai.eh.component.web.module.j
    public View a(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        return null;
    }

    @Override // com.sankuai.eh.component.web.module.j
    public void a(int i, int i2, Intent intent) {
    }

    @Override // com.sankuai.eh.component.web.module.j
    public void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @Override // com.sankuai.eh.component.web.module.j
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b6571acc427c7eb6b59d350ca5d19de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b6571acc427c7eb6b59d350ca5d19de");
        }
    }

    @Override // com.sankuai.eh.component.web.module.j
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "550dc2d1d4abe10d2382ec1f9f997077", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "550dc2d1d4abe10d2382ec1f9f997077");
        }
    }

    @Override // com.sankuai.eh.component.web.module.j
    public void g() {
    }

    public i(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73513e11766ed115d15b7ef8e9a28905", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73513e11766ed115d15b7ef8e9a28905");
            return;
        }
        this.c = true;
        this.f = cVar;
    }

    @Override // com.sankuai.eh.component.web.module.j
    public void a(Context context, Bundle bundle) {
        Object[] objArr = {context, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4070596681206fecbb910797e287d9e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4070596681206fecbb910797e287d9e8");
        } else if (this.f != null) {
            this.f.o = this;
            String string = bundle.getString("url");
            Object[] objArr2 = {string};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc3697b1807c1d2ab7eb3a1b1c571116", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc3697b1807c1d2ab7eb3a1b1c571116");
                return;
            }
            b(string, true);
            a.C0556a c0556a = new a.C0556a();
            c0556a.b = "onModuleStart";
            com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.f);
        }
    }

    @Override // com.sankuai.eh.component.web.module.j
    public void a(@NonNull View view, @Nullable Bundle bundle) {
        Object[] objArr = {view, bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d784f718097f607dddf78e2575438bb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d784f718097f607dddf78e2575438bb9");
            return;
        }
        if (this.f != null) {
            this.f.p = (ViewGroup) view;
        }
        a.C0556a c0556a = new a.C0556a();
        c0556a.b = "onViewCrated";
        com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.f);
    }

    @Override // com.sankuai.eh.component.web.module.j
    public void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10f82debab8ffdf3cd18ca0e614d855a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10f82debab8ffdf3cd18ca0e614d855a");
        } else if (this.f != null) {
            a.C0556a c0556a = new a.C0556a();
            c0556a.b = "onActivityCreated";
            c0556a.d = new b.C0551b().a("url", this.f.b()).b;
            com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.f);
        }
    }

    @Override // com.sankuai.eh.component.web.module.j
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "279a93ecd8861218f8678c1a0a714162", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "279a93ecd8861218f8678c1a0a714162");
            return;
        }
        a.C0556a c0556a = new a.C0556a();
        c0556a.b = "onModuleLoad";
        com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.f);
    }

    @Override // com.sankuai.eh.component.web.module.j
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c66ded06c994cc53639466452494218e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c66ded06c994cc53639466452494218e");
            return;
        }
        a.C0556a c0556a = new a.C0556a();
        c0556a.b = "cmp_disappear";
        com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.f);
    }

    @Override // com.sankuai.eh.component.web.module.j
    public final void j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f65e15deba47e20f4cd4442794c45bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f65e15deba47e20f4cd4442794c45bd");
        } else {
            c("finish");
        }
    }

    @Override // com.sankuai.eh.component.web.module.j
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1a023d67e411460a9e7822ec9c1dbc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1a023d67e411460a9e7822ec9c1dbc1");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a00baa12c26a204f9a0f97dea783b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a00baa12c26a204f9a0f97dea783b9d");
            return;
        }
        a.C0556a c0556a = new a.C0556a();
        c0556a.b = "onModuleClose";
        com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.f);
    }

    public final boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21341796d94b37ca529ad3e6360a529a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21341796d94b37ca529ad3e6360a529a")).booleanValue();
        }
        this.b = true;
        a.C0556a c0556a = new a.C0556a();
        c0556a.b = "onOverrideLoad";
        c0556a.d = new b.C0551b().a("url", str).b;
        com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.f);
        return false;
    }

    public final void a(String str, Bitmap bitmap) {
        Object[] objArr = {str, bitmap};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc1e7a2d206c28fb1d3ead02fafead5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc1e7a2d206c28fb1d3ead02fafead5c");
            return;
        }
        if (this.f != null) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = e;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b9012c55c3425e56372b0619567facb0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b9012c55c3425e56372b0619567facb0");
            } else {
                if (this.b) {
                    c("close");
                    b(str, false);
                }
                if (this.a != null) {
                    this.a.c("isFirstPageStart", Boolean.valueOf(this.c));
                    this.a.c("willPageRestart", Boolean.valueOf(this.b));
                }
                com.sankuai.eh.component.service.tools.d.a("拓展列表", this.f.c());
                a.C0556a c0556a = new a.C0556a();
                c0556a.b = "onPageStart";
                c0556a.d = new b.C0551b().a("url", str).b;
                com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.f);
            }
        }
        this.c = false;
        this.b = true;
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d0eb9071a359f1056a078cf03704b82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d0eb9071a359f1056a078cf03704b82");
        } else if (this.f != null) {
            c cVar = this.f;
            Boolean bool = Boolean.TRUE;
            Object[] objArr2 = {"load", bool};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "4bbb2c9220444044a0132c44a27cb07d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "4bbb2c9220444044a0132c44a27cb07d");
            } else if (cVar.f != null) {
                cVar.f.a("load", bool);
            }
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = e;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a8b12ae229e4254830ff753dee0525d0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a8b12ae229e4254830ff753dee0525d0");
                return;
            }
            a.C0556a c0556a = new a.C0556a();
            c0556a.b = "onPageLoad";
            com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.f);
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed56dd044b7da8e2dc5dc078e06386d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed56dd044b7da8e2dc5dc078e06386d9");
            return;
        }
        if (this.f != null) {
            this.f.a("currentUrl", str);
        }
        com.sankuai.eh.component.service.tools.d.a("time_eval", System.currentTimeMillis() + " doUpdateVisitedHistory");
        a.C0556a c0556a = new a.C0556a();
        c0556a.b = "onUpdateHistory";
        c0556a.d = new b.C0551b().a("url", str).b;
        com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.f);
    }

    public final boolean a(ConsoleMessage consoleMessage) {
        String str;
        Object[] objArr = {consoleMessage};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1c4218e339976e43c9a319a67992642", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1c4218e339976e43c9a319a67992642")).booleanValue();
        }
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("line", consoleMessage.lineNumber());
                String sourceId = consoleMessage.sourceId();
                Object[] objArr2 = {sourceId};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.component.service.utils.e.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1a80d0e4fb36fb64a988d4a8e1062027", RobustBitConfig.DEFAULT_VALUE)) {
                    str = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1a80d0e4fb36fb64a988d4a8e1062027");
                } else if (TextUtils.isEmpty(sourceId)) {
                    str = "";
                } else {
                    if (com.sankuai.eh.component.service.utils.e.a(sourceId).endsWith(".html")) {
                        sourceId = com.sankuai.eh.component.service.utils.e.b(sourceId);
                    }
                    String[] split = sourceId.split("/");
                    str = split[split.length - 1];
                }
                if (TextUtils.isEmpty(str)) {
                    str = consoleMessage.sourceId();
                }
                jSONObject.put("sourceId", str);
                jSONObject.put("msg", consoleMessage.message());
                if (consoleMessage.message().contains("SyntaxError")) {
                    new d.c().a(e.a("special", this.a.e)).a("type", d.EnumC0550d.ERROR_SYNTAX.a()).a().b();
                }
            } catch (Exception unused) {
            }
            a.C0556a c0556a = new a.C0556a();
            c0556a.b = "onConsoleMsg";
            c0556a.c = "error";
            c0556a.d = jSONObject;
            com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.f);
        }
        return false;
    }

    private void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f4a283b1584a57a8c1528b78dc7beb3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f4a283b1584a57a8c1528b78dc7beb3");
            return;
        }
        a.C0556a c0556a = new a.C0556a();
        c0556a.b = "onPageClose";
        c0556a.c = str;
        com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.f);
        com.sankuai.eh.component.web.plugins.core.b.a(this.a);
    }

    private void b(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb6be6396d3fb0fccec722584f9e4e06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb6be6396d3fb0fccec722584f9e4e06");
            return;
        }
        this.a = new h(z ? str : com.sankuai.eh.component.service.utils.e.b(str), this.f);
        this.f.f = this.a;
        this.f.b("pageUrl", this.a.b);
        this.a.c = z;
        h hVar = this.a;
        c cVar = this.f;
        int i = cVar.s;
        cVar.s = i + 1;
        hVar.a(DMKeys.KEY_PAGE_INDEX, Integer.valueOf(i));
        this.a.a("url", com.sankuai.eh.component.service.utils.e.a(this.a.b));
        this.a.a(SearchIntents.EXTRA_QUERY, com.sankuai.eh.component.service.utils.e.f(this.a.b));
        this.a.e = com.sankuai.eh.component.service.database.d.a(str);
        e.b(this.a);
        e.a(this.f);
        e.a(this.a);
        com.sankuai.eh.component.service.tools.d.a(this.a.b + "的页面配置：", com.sankuai.eh.component.service.utils.b.a(this.a.e));
    }
}

package com.sankuai.eh.component.web.module;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.gson.JsonElement;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.spi.IComponent;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.component.web.plugins.api.a;
import com.sankuai.eh.component.web.plugins.m;
import com.sankuai.eh.component.web.view.EHRelativeLayout;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class a implements IComponent {
    public static ChangeQuickRedirect a;
    protected c b;
    protected Bundle c;

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public final int a() {
        return 10;
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public void a(int i, int i2, Intent intent) {
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public void a(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    public abstract void a(ViewGroup viewGroup);

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public final void a(Activity activity, Bundle bundle) {
        boolean z;
        boolean z2;
        boolean z3;
        Object[] objArr = {activity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc0f7fc5ddb8b583cf31df679f57b84a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc0f7fc5ddb8b583cf31df679f57b84a");
            return;
        }
        this.c = com.sankuai.eh.component.service.utils.e.a(activity.getIntent(), bundle);
        this.b = new c(this.c.getString("url"), activity, bundle);
        com.sankuai.eh.component.web.plugins.core.b.a(activity, this.b);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e654a6b3cf2ff5d13ffc5c2da0661369", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e654a6b3cf2ff5d13ffc5c2da0661369");
        } else {
            JsonElement b = com.sankuai.eh.component.service.database.d.b(this.b.i);
            c cVar = this.b;
            if (b == null) {
                b = com.sankuai.eh.component.service.database.d.a(this.b.h);
            }
            cVar.j = b;
            this.b.a("from", com.sankuai.eh.component.service.tools.b.a().c());
            this.b.a("sourceId", Long.toString(System.currentTimeMillis()));
            this.b.a("loadConfig", com.sankuai.waimai.platform.utils.f.a(this.b.i.getIntent(), "ehc_loadConfig"));
            this.b.a("original", com.sankuai.eh.component.service.utils.e.b(this.b.g, com.sankuai.eh.component.service.a.a()));
            this.b.a("originalPattern", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(this.b.j, "pattern"), ""));
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3944b750d273267507d67669e1047d8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3944b750d273267507d67669e1047d8a");
        } else {
            com.sankuai.eh.component.web.plugins.core.b.a(new com.sankuai.eh.component.web.plugins.core.a(), this.b);
            JsonElement jsonElement = this.b.j;
            Object[] objArr4 = {jsonElement};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.eh.component.web.plugins.core.d.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "01ffc5e606b2653fcc422a5c191f0313", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "01ffc5e606b2653fcc422a5c191f0313")).booleanValue();
            } else {
                z = com.sankuai.eh.component.service.utils.f.b(com.sankuai.eh.component.service.database.d.i()) && com.sankuai.eh.component.service.utils.f.b(com.sankuai.eh.component.web.plugins.core.d.a(jsonElement));
            }
            if (z) {
                com.sankuai.eh.component.web.plugins.core.b.a(new com.sankuai.eh.component.web.plugins.core.d(), this.b);
            }
            String str = this.b.g;
            Object[] objArr5 = {str};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.eh.component.web.tab.a.a;
            if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "3442d304c862a7b98f8a5e5a946928b0", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "3442d304c862a7b98f8a5e5a946928b0")).booleanValue();
            } else {
                z2 = "1".equals(com.sankuai.eh.component.service.utils.e.b(str, "fupTabFlag")) && com.sankuai.eh.component.service.database.d.f();
                if (z2) {
                    new d.c().a("ehc_fup_tab").a("type", "click").b();
                }
            }
            if (z2) {
                com.sankuai.eh.component.web.plugins.core.b.a(new com.sankuai.eh.component.web.tab.c(), this.b);
            }
            String str2 = this.b.g;
            Object[] objArr6 = {str2};
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.eh.component.web.modal.a.a;
            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "94f000e670f3c17e7f6a7154f3210f62", RobustBitConfig.DEFAULT_VALUE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "94f000e670f3c17e7f6a7154f3210f62")).booleanValue();
            } else {
                String b2 = com.sankuai.eh.component.service.utils.e.b(str2, "ehc_inserturl");
                z3 = (TextUtils.isEmpty(b2) || TextUtils.isEmpty(com.sankuai.eh.component.service.utils.e.b(str2, com.sankuai.eh.component.service.a.a())) || TextUtils.isEmpty(com.sankuai.eh.component.service.utils.e.b(b2, "bizId")) || !com.sankuai.eh.component.service.utils.f.b(com.sankuai.eh.component.service.database.d.h())) ? false : true;
            }
            if (z3) {
                com.sankuai.eh.component.web.plugins.core.b.a(new com.sankuai.eh.component.web.modal.e(), this.b);
            }
            if (com.sankuai.eh.component.service.utils.b.a(this.b.j, "data", "urlRewrite") != null) {
                com.sankuai.eh.component.web.plugins.core.b.a(new m(), this.b);
            }
            if (com.sankuai.eh.component.web.chain.f.a()) {
                com.sankuai.eh.component.web.plugins.core.b.a(new com.sankuai.eh.component.web.chain.a(), this.b);
            }
            if (com.sankuai.eh.component.web.plugins.i.a(this.b.j)) {
                com.sankuai.eh.component.web.plugins.core.b.a(new com.sankuai.eh.component.web.plugins.i(), this.b);
            }
            if (com.sankuai.eh.component.web.plugins.d.a(this.b.j)) {
                com.sankuai.eh.component.web.plugins.core.b.a(new com.sankuai.eh.component.web.plugins.d(), this.b);
            }
        }
        Object[] objArr7 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect7 = a;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c3195cc340718c30778cd3dc3b38536b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c3195cc340718c30778cd3dc3b38536b");
        } else {
            com.sankuai.eh.component.service.utils.thread.b.a().c(b.b());
        }
        a.C0556a c0556a = new a.C0556a();
        c0556a.b = "onComponentInit";
        c0556a.e = this.c;
        com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, com.sankuai.eh.component.web.view.EHRelativeLayout, java.lang.Object, android.view.ViewGroup] */
    @Override // com.sankuai.eh.component.service.spi.IComponent
    public final <T> T a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3eed4dc433f9494c07d66fef8cc504ac", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3eed4dc433f9494c07d66fef8cc504ac");
        }
        ?? r12 = (T) ((EHRelativeLayout) LayoutInflater.from(context).inflate(R.layout.eh_component_web_content, (ViewGroup) null));
        a((ViewGroup) r12);
        a.C0556a c0556a = new a.C0556a();
        c0556a.b = "onComponentStart";
        c0556a.d = new b.C0551b().a("url", this.c.getString("url")).b;
        c0556a.e = r12;
        com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.b);
        return r12;
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d5f5c39d878d3f0ac6590e604d7f57c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d5f5c39d878d3f0ac6590e604d7f57c");
        } else if (this.b != null) {
            a.C0556a c0556a = new a.C0556a();
            c0556a.b = "onComponentClose";
            com.sankuai.eh.component.web.plugins.core.b.a(c0556a.a(), this.b);
            com.sankuai.eh.component.web.plugins.core.b.b(this.b.i);
        }
    }

    public static /* synthetic */ void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cce07c5acecba98aeeb9d625dd7c20e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cce07c5acecba98aeeb9d625dd7c20e6");
            return;
        }
        boolean j = com.sankuai.eh.component.service.database.d.j();
        if (j != com.sankuai.eh.component.service.database.a.a().b("isPresetEnabled", true)) {
            com.sankuai.eh.component.service.database.a.a().a("isPresetEnabled", j);
        }
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15f178c20efe1fce03d62c584500f862", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15f178c20efe1fce03d62c584500f862")).booleanValue();
        }
        if (this.b != null) {
            this.b.b("onBackPressed", Boolean.TRUE);
            com.sankuai.eh.component.web.plugins.e b = this.b.b(UIConfig.MODAL);
            if ((b instanceof com.sankuai.eh.component.web.modal.e) && ((com.sankuai.eh.component.web.modal.e) b).X_()) {
                return true;
            }
            com.sankuai.eh.component.web.plugins.e b2 = this.b.b("fup_tab");
            if (b2 instanceof com.sankuai.eh.component.web.tab.c) {
                com.sankuai.eh.component.web.tab.c cVar = (com.sankuai.eh.component.web.tab.c) b2;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.eh.component.web.tab.c.a;
                if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "45f8a7bf608f9a18ec19b73d1cd9f974", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "45f8a7bf608f9a18ec19b73d1cd9f974")).booleanValue();
                }
                if (cVar.b instanceof com.sankuai.eh.component.service.spi.a) {
                    return ((com.sankuai.eh.component.service.spi.a) cVar.b).a();
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.sankuai.eh.component.service.spi.IComponent
    public boolean d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19624925c5afbd3c5633b2f05b577c5b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19624925c5afbd3c5633b2f05b577c5b")).booleanValue();
        }
        if (this.b != null) {
            com.sankuai.eh.component.web.plugins.e b = this.b.b(UIConfig.MODAL);
            if (b instanceof com.sankuai.eh.component.web.modal.e) {
                com.sankuai.eh.component.web.modal.e eVar = (com.sankuai.eh.component.web.modal.e) b;
                if (eVar.X_()) {
                    eVar.e();
                    return true;
                }
            }
        }
        return false;
    }
}

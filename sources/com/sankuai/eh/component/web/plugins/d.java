package com.sankuai.eh.component.web.plugins;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import com.google.gson.JsonElement;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends b {
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
        return "fullscreenLayout";
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "356c5866df7747e7ba0801f5e4824d60", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "356c5866df7747e7ba0801f5e4824d60") : new String[]{"onComponentInit"};
    }

    @Override // com.sankuai.eh.component.web.plugins.e
    public final void a(com.sankuai.eh.component.web.plugins.api.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6ad0337c59abea76258a8c6a1d417d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6ad0337c59abea76258a8c6a1d417d4");
        } else if (g()) {
            String a2 = aVar.a();
            char c = 65535;
            if (a2.hashCode() == -1732242418 && a2.equals("onComponentInit")) {
                c = 0;
            }
            if (c == 0 && (aVar.d() instanceof Bundle)) {
                Bundle bundle = (Bundle) aVar.d();
                if (a(this.d.j)) {
                    h();
                    Window window = this.d.i.getWindow();
                    JsonElement jsonElement = this.d.j;
                    Object[] objArr2 = {jsonElement};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    com.sankuai.eh.component.service.utils.a.a(window, "#ffeeeeee", PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "8a09ae38c118b973236feb954d10edd5", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "8a09ae38c118b973236feb954d10edd5")).intValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(jsonElement, "data", "statusBarStyle"), 1));
                    String string = bundle.getString("url");
                    Object[] objArr3 = {string};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4e9e712616c912d2702c59281afa425f", RobustBitConfig.DEFAULT_VALUE)) {
                        string = (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4e9e712616c912d2702c59281afa425f");
                    } else if (!TextUtils.isEmpty(string)) {
                        string = com.sankuai.eh.component.service.utils.e.g(com.sankuai.eh.component.service.utils.e.a(string, "notitlebar")).buildUpon().appendQueryParameter("notitlebar", "1").appendQueryParameter("future", "2").appendQueryParameter("fullscreenlayout", "1").build().toString();
                    }
                    bundle.putString("url", string);
                    bundle.putString("notitlebar", "1");
                    bundle.putString("future", "2");
                    a(true);
                }
            }
        }
    }

    public static boolean a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4f09d45bc0794b54d530101a0a7a4ef5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4f09d45bc0794b54d530101a0a7a4ef5")).booleanValue() : com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(jsonElement, "data", "fullscreenLayout"), false).booleanValue();
    }
}

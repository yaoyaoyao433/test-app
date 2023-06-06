package com.sankuai.eh.component.web.bridge;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.google.gson.JsonObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.web.bridge.local.e;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static Map<String, Class<? extends com.sankuai.eh.component.web.bridge.local.a>> d = new HashMap();
    public com.sankuai.eh.component.web.module.c b;
    private Context c;

    public b() {
    }

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1d912983a7928018e54247a5d566ff0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1d912983a7928018e54247a5d566ff0b");
            return;
        }
        Object[] objArr2 = {"report", e.class};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "16a3261048eff83196368f032bf6142f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "16a3261048eff83196368f032bf6142f");
        } else {
            d.put("report", e.class);
        }
    }

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de3eb44ff271495dd1d0c8c647e9e9b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de3eb44ff271495dd1d0c8c647e9e9b2");
        } else {
            this.c = context;
        }
    }

    @JavascriptInterface
    public final void callback(String str) {
        com.sankuai.eh.component.web.bridge.local.a dVar;
        boolean z = true;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "051b7ff567392a18174deb13cc9a7660", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "051b7ff567392a18174deb13cc9a7660");
            return;
        }
        d.a("EHNativeBridge", "callback: " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "628dc503a28c68a582721a5c7013a574", RobustBitConfig.DEFAULT_VALUE)) {
            z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "628dc503a28c68a582721a5c7013a574")).booleanValue();
        } else if (com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(str), "info", "actionId") != null) {
            com.sankuai.eh.component.web.bridge.local.c cVar = new com.sankuai.eh.component.web.bridge.local.c();
            cVar.c = (JsonObject) com.sankuai.eh.component.service.utils.b.a(str, (Class<Object>) JsonObject.class);
            cVar.a(this.b);
            cVar.a();
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        String a2 = com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.a(str), "method");
        if (!TextUtils.isEmpty(a2) || d.containsKey(a2)) {
            try {
                dVar = d.get(a2).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception unused) {
                dVar = new com.sankuai.eh.component.web.bridge.local.d();
            }
            dVar.c = (JsonObject) com.sankuai.eh.component.service.utils.b.a(str, (Class<Object>) JsonObject.class);
            dVar.a(this.b);
            dVar.a();
        }
    }
}

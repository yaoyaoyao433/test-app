package com.sankuai.eh.plugins.runtime;

import android.os.Handler;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    public HashMap<String, JsonElement> b;
    public List<String> c;
    private InterfaceC0564a d;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.eh.plugins.runtime.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0564a {
        void a(String str);
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f97a05df577424e955fd43ec2fad2f66", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f97a05df577424e955fd43ec2fad2f66");
            return;
        }
        this.b = new HashMap<>();
        this.c = new ArrayList();
    }

    public a(InterfaceC0564a interfaceC0564a) {
        this();
        Object[] objArr = {interfaceC0564a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "175bd65f688319c717d14559a2648c0b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "175bd65f688319c717d14559a2648c0b");
        } else {
            this.d = interfaceC0564a;
        }
    }

    public static /* synthetic */ void a(a aVar, JsonElement jsonElement, String str) {
        Object[] objArr = {aVar, jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c75e3846206287f795b6137af42d6e96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c75e3846206287f795b6137af42d6e96");
        } else {
            aVar.a(jsonElement, str);
        }
    }

    private void c(JsonElement jsonElement, String str) {
        Object[] objArr = {jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b141caa390e694e4da836b01bfd5bc6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b141caa390e694e4da836b01bfd5bc6e");
        } else {
            new Handler().postDelayed(c.a(this, str, jsonElement), com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(jsonElement, "timeout"), 3000));
        }
    }

    public static /* synthetic */ void a(a aVar, String str, JsonElement jsonElement) {
        Object[] objArr = {aVar, str, jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf48fe01c4576cfa0ca3ff7d92ffc2bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf48fe01c4576cfa0ca3ff7d92ffc2bc");
        } else if (aVar.c.contains(str)) {
        } else {
            String a2 = aVar.a(jsonElement);
            com.dianping.codelog.b.b(a.class, a2, com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "action"), "") + " timeout");
            aVar.b(jsonElement, "timeout...");
            aVar.a(jsonElement, new d.b().a("status", "timeout").b);
        }
    }

    public final void a(JsonElement jsonElement, String str) {
        Object[] objArr = {jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66b33aebb61d90ca1274434f608cd3e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66b33aebb61d90ca1274434f608cd3e6");
            return;
        }
        String b = com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "script"), "");
        if (TextUtils.isEmpty(b)) {
            return;
        }
        JsonObject jsonObject = new b.a().a("info", new b.a().a("actionId", new JsonPrimitive(str)).a("pattern", com.sankuai.eh.component.service.utils.b.c(jsonElement, "pattern")).a("scriptKey", com.sankuai.eh.component.service.utils.b.c(jsonElement, "scriptKey")).b).a("data", com.sankuai.eh.component.service.utils.b.c(jsonElement, "params")).b;
        d.a("js_module", "start load js: " + str);
        String replaceFirst = b.replaceFirst("__ehc_params__", jsonObject.toString());
        if (this.d != null) {
            InterfaceC0564a interfaceC0564a = this.d;
            interfaceC0564a.a(TitansConstants.JAVASCRIPT_PREFIX + replaceFirst);
            if (com.sankuai.eh.component.service.utils.b.d(com.sankuai.eh.component.service.utils.b.c(com.sankuai.eh.component.service.database.d.g(), "apiEnabled"))) {
                c(jsonElement);
            }
        }
        c(jsonElement, str);
        a(jsonElement, new d.b().a("status", "start").b);
    }

    public String a(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f7cd41ad0fdaecd29476b3abaea39d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f7cd41ad0fdaecd29476b3abaea39d1");
        }
        return com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "catKey"), "unknown") + CommonConstant.Symbol.DOT + com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "action"), "unknown");
    }

    private String b(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b61c6ca64a80bae157eef8b277fa997", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b61c6ca64a80bae157eef8b277fa997") : com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "catKey"), "unknown");
    }

    public void a(JsonElement jsonElement, Map<String, Object> map) {
        Object[] objArr = {jsonElement, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3d91b9627083a873a6b63af24ed1346", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3d91b9627083a873a6b63af24ed1346");
        } else {
            d.c("js_module", new d.b().a("action", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "action"), "")).a("pattern", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "pattern"), "")).a("primaryKey", com.sankuai.eh.component.service.utils.b.a(jsonElement, "primaryKey")).a("scriptKey", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "scriptKey"), "")).a(map).b, null);
        }
    }

    public void b(JsonElement jsonElement, String str) {
        Object[] objArr = {jsonElement, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b23ddb09fd87ca5fca55ee90f3b5f48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b23ddb09fd87ca5fca55ee90f3b5f48");
        } else {
            new d.c().a(b(jsonElement)).a("action", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "action"), "unknown")).a("scriptKey", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "scriptKey"), "unknown")).b();
        }
    }

    private void c(JsonElement jsonElement) {
        Object[] objArr = {jsonElement};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbfe913cd57adeda94ac3a9da54afdfd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbfe913cd57adeda94ac3a9da54afdfd");
        } else {
            new d.c().a("ehc.js_module").a("action", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "action"), "unknown")).a("scriptKey", com.sankuai.eh.component.service.utils.b.b(com.sankuai.eh.component.service.utils.b.c(jsonElement, "scriptKey"), "unknown")).b();
        }
    }
}

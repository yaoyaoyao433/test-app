package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class a implements k {
    public static ChangeQuickRedirect a;

    public final com.sankuai.waimai.alita.core.jsexecutor.g a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa852113df790591121257de73956342", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.alita.core.jsexecutor.g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa852113df790591121257de73956342");
        }
        com.sankuai.waimai.alita.core.engine.a a2 = com.sankuai.waimai.alita.core.engine.d.a().a(str);
        if (a2 == null) {
            return null;
        }
        return a2.c;
    }

    @Deprecated
    public final void a(String str, Runnable runnable) {
        Object[] objArr = {str, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2715edb61e5e10423d1d18e7af152b33", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2715edb61e5e10423d1d18e7af152b33");
            return;
        }
        com.sankuai.waimai.alita.core.jsexecutor.g a2 = a(str);
        if (a2 == null) {
            return;
        }
        a2.a(runnable);
    }

    @Deprecated
    public final void a(m mVar, String str, Object obj) {
        Object[] objArr = {mVar, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36b447588e4052aef783c7941aa178d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36b447588e4052aef783c7941aa178d");
        } else if (mVar == null || TextUtils.isEmpty(str)) {
            com.sankuai.waimai.alita.core.utils.c.a("NativeCallback | no callback");
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                jSONObject.put("msg", "");
                jSONObject.put("data", obj);
                String jSONObject2 = jSONObject.toString();
                HashMap hashMap = new HashMap();
                hashMap.put("bridge_name", a());
                hashMap.put("result", jSONObject2);
                hashMap.put("callbackId", str);
                com.sankuai.waimai.alita.core.utils.c.b("alita_js", (String) null, "bridgeCallback", (Map<String, Object>) hashMap);
                mVar.a(str, jSONObject2);
            } catch (Exception e) {
                a(mVar, str, e.getMessage());
            }
        }
    }

    public final void a(String str, m mVar, String str2, Object obj) {
        Object[] objArr = {str, mVar, str2, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31fa87e31420a351e31ead9f9a467b87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31fa87e31420a351e31ead9f9a467b87");
        } else if (mVar == null || TextUtils.isEmpty(str2)) {
            com.sankuai.waimai.alita.core.utils.c.a("NativeCallback | no callback");
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                jSONObject.put("msg", "");
                jSONObject.put("data", obj);
                String jSONObject2 = jSONObject.toString();
                HashMap hashMap = new HashMap();
                com.sankuai.waimai.alita.core.jsexecutor.task.d a2 = com.sankuai.waimai.alita.core.engine.j.a().a(str);
                hashMap.put("bundle_id", a2 != null ? a2.b : "");
                hashMap.put("bridge_name", a());
                hashMap.put("result", jSONObject2);
                hashMap.put("callbackId", str2);
                com.sankuai.waimai.alita.core.utils.c.b("alita_js", (String) null, "bridgeCallback", (Map<String, Object>) hashMap);
                mVar.a(str2, jSONObject2);
            } catch (Exception e) {
                a(mVar, str2, e.getMessage());
            }
        }
    }

    public final void a(m mVar, String str) {
        Object[] objArr = {mVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80bb3e0a6fea74897ab45b0df4cdc144", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80bb3e0a6fea74897ab45b0df4cdc144");
        } else if (mVar == null || TextUtils.isEmpty(str)) {
            com.sankuai.waimai.alita.core.utils.c.a("NativeCallback | no callback");
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", -1);
                jSONObject.put("msg", "");
                jSONObject.put("data", "{}");
                com.sankuai.waimai.alita.core.utils.c.a("NativeCallback | fault");
                mVar.a(str, jSONObject.toString());
            } catch (Exception e) {
                com.sankuai.waimai.alita.core.utils.c.a("NativeCallback | callFailed -> " + e.getMessage());
            }
        }
    }

    public final void a(m mVar, String str, String str2) {
        Object[] objArr = {mVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fedc41a49f97d35052984715dfd0911a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fedc41a49f97d35052984715dfd0911a");
        } else if (mVar == null || TextUtils.isEmpty(str)) {
            com.sankuai.waimai.alita.core.utils.c.a("NativeCallback | no callback");
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", -1);
                jSONObject.put("msg", str2);
                jSONObject.put("data", "{}");
                com.sankuai.waimai.alita.core.utils.c.a("NativeCallback | fault -> " + str2);
                mVar.a(str, jSONObject.toString());
            } catch (Exception e) {
                com.sankuai.waimai.alita.core.utils.c.a("NativeCallback | callFailed -> " + e.getMessage());
            }
        }
    }
}

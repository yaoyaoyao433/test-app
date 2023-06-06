package com.meituan.msc.modules.api;

import android.support.annotation.NonNull;
import com.meituan.msc.common.model.Event;
import com.meituan.msc.extern.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements IApiCallback {
    public static ChangeQuickRedirect a;
    public String b;
    @NonNull
    protected Event c;

    @Override // com.meituan.msc.extern.IApiCallback
    @NonNull
    public final Event getEvent() {
        return this.c;
    }

    @Override // com.meituan.msc.extern.IApiCallback
    public final void onSuccess(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "649185cede22f493ceb43241e0c27d64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "649185cede22f493ceb43241e0c27d64");
        } else {
            a("ok", jSONObject);
        }
    }

    @Override // com.meituan.msc.extern.IApiCallback
    public final void onFail() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "046e7ece47b092ef391cbaa738be043b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "046e7ece47b092ef391cbaa738be043b");
        } else {
            onFail(null);
        }
    }

    @Override // com.meituan.msc.extern.IApiCallback
    public final void onFail(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "daf52602515b580c22838a0890cbcece", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "daf52602515b580c22838a0890cbcece");
        } else {
            a("fail", jSONObject);
        }
    }

    @Override // com.meituan.msc.extern.IApiCallback
    public final void onCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be9b738c5675bcff410507cb79622231", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be9b738c5675bcff410507cb79622231");
        } else {
            a("cancel", null);
        }
    }

    private void a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e5d9c6b39d328d1e78c4a929b905fc7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e5d9c6b39d328d1e78c4a929b905fc7");
        } else {
            this.b = a(jSONObject, this.c.b, str);
        }
    }

    public static String a(JSONObject jSONObject, String str, String str2) {
        String str3;
        Object[] objArr = {jSONObject, str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f7c13f2974e989969b33a6b5725e31a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f7c13f2974e989969b33a6b5725e31a8");
        }
        JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        try {
            if ("ok".equals(str2)) {
                str3 = "success";
            } else {
                str3 = "fail".equals(str2) ? "failure" : str2;
            }
            jSONObject2.put("msc.status", str3);
            if (!jSONObject2.has("errMsg") || jSONObject2.get("errMsg") == null) {
                jSONObject2.put("errMsg", String.format("%s:%s", str, str2));
            } else {
                jSONObject2.put("errMsg", String.format("%s:%s %s", str, str2, jSONObject2.getString("errMsg")));
            }
        } catch (JSONException unused) {
            com.meituan.msc.modules.reporter.g.a("Api", "assemble result exception!");
        }
        String jSONObject3 = jSONObject2.toString();
        if ("fail".equals(str2)) {
            com.meituan.msc.modules.reporter.g.e("BaseApiCallback", "api call failed: " + jSONObject3);
        }
        return jSONObject3;
    }
}

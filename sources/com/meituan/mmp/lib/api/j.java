package com.meituan.mmp.lib.api;

import android.support.annotation.NonNull;
import com.meituan.mmp.lib.model.Event;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class j implements IApiCallback {
    public static ChangeQuickRedirect b;
    public String c;
    @NonNull
    protected Event d;

    public j(@NonNull Event event) {
        Object[] objArr = {event};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4de1728be4591ff6026c2487b4a823b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4de1728be4591ff6026c2487b4a823b");
        } else {
            this.d = event;
        }
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "180de6d749b9c5ef29f7b210a1514e8b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "180de6d749b9c5ef29f7b210a1514e8b") : this.d.b;
    }

    @Override // com.meituan.mmp.main.IApiCallback
    @NonNull
    public Event getEvent() {
        return this.d;
    }

    @Override // com.meituan.mmp.main.IApiCallback
    public void onSuccess(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68429105f723ea0a8f75acb6fcfc5230", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68429105f723ea0a8f75acb6fcfc5230");
        } else {
            a("ok", jSONObject);
        }
    }

    @Override // com.meituan.mmp.main.IApiCallback
    public void onFail() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78b9263f5f3942544157626b9e5ad0f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78b9263f5f3942544157626b9e5ad0f2");
        } else {
            onFail(null);
        }
    }

    @Override // com.meituan.mmp.main.IApiCallback
    public void onFail(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd0031e9c469d9be3cb9866ae227c5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd0031e9c469d9be3cb9866ae227c5c");
        } else {
            a("fail", jSONObject);
        }
    }

    @Override // com.meituan.mmp.main.IApiCallback
    public void onCancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "57e574794e6ed3d59abc503f85f4bac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "57e574794e6ed3d59abc503f85f4bac9");
        } else {
            a("cancel", null);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "409d836d008ae05ae160871e94c3206e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "409d836d008ae05ae160871e94c3206e");
        } else {
            this.c = a(jSONObject, this.d.b, str);
        }
    }

    public static String a(JSONObject jSONObject, String str, String str2) {
        String str3;
        Object[] objArr = {jSONObject, str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "99adda9f00108b64ff6a7f467cc43508", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "99adda9f00108b64ff6a7f467cc43508");
        }
        JSONObject jSONObject2 = jSONObject == null ? new JSONObject() : jSONObject;
        try {
            if ("ok".equals(str2)) {
                str3 = "success";
            } else {
                str3 = "fail".equals(str2) ? "failure" : str2;
            }
            jSONObject2.put("mmp.status", str3);
            if (!jSONObject2.has("errMsg") || jSONObject2.get("errMsg") == null) {
                jSONObject2.put("errMsg", String.format("%s:%s", str, str2));
            } else {
                jSONObject2.put("errMsg", String.format("%s:%s %s", str, str2, jSONObject2.getString("errMsg")));
            }
        } catch (JSONException unused) {
            com.meituan.mmp.lib.trace.b.d("Api", "assemble result exception!");
        }
        String jSONObject3 = jSONObject2.toString();
        if ("fail".equals(str2)) {
            com.meituan.mmp.lib.trace.b.c("BaseApiCallback", "api call failed: " + jSONObject3);
        }
        return jSONObject3;
    }
}

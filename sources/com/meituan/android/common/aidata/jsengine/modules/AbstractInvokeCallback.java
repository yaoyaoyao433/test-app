package com.meituan.android.common.aidata.jsengine.modules;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class AbstractInvokeCallback {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void callSuccess(IJSNativeModuleCallback iJSNativeModuleCallback, String str, Object obj) {
        Object[] objArr = {iJSNativeModuleCallback, str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09eda8da83690192460aa037056e6e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09eda8da83690192460aa037056e6e5a");
        } else {
            callSuccess(iJSNativeModuleCallback, str, 0, null, obj);
        }
    }

    public void callSuccess(IJSNativeModuleCallback iJSNativeModuleCallback, String str, int i, String str2, Object obj) {
        Object[] objArr = {iJSNativeModuleCallback, str, Integer.valueOf(i), str2, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e4860629d040c51fb6b85d60db17136", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e4860629d040c51fb6b85d60db17136");
        } else if (iJSNativeModuleCallback == null || TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i);
                jSONObject.put("msg", str2);
                jSONObject.put("data", obj);
                new StringBuilder("NativeCallback callSuccess:").append(jSONObject);
                iJSNativeModuleCallback.invoke(str, jSONObject);
            } catch (Exception e) {
                new StringBuilder("NativeCallback callSuccess error: ").append(e.getMessage());
                callFailed(iJSNativeModuleCallback, str, e.getMessage());
            }
        }
    }

    public void callFailed(IJSNativeModuleCallback iJSNativeModuleCallback, String str) {
        Object[] objArr = {iJSNativeModuleCallback, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d3849a9294a6383a2eee7c9fb00bec5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d3849a9294a6383a2eee7c9fb00bec5");
        } else {
            callFailed(iJSNativeModuleCallback, str, null);
        }
    }

    public void callFailed(IJSNativeModuleCallback iJSNativeModuleCallback, String str, String str2) {
        Object[] objArr = {iJSNativeModuleCallback, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f06e70a2caacd3ee4cf83d72df171acc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f06e70a2caacd3ee4cf83d72df171acc");
        } else if (iJSNativeModuleCallback == null || TextUtils.isEmpty(str)) {
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", -1);
                jSONObject.put("msg", str2);
                jSONObject.put("data", "{}");
                new StringBuilder("NativeCallback callFailed:").append(str2);
                iJSNativeModuleCallback.invoke(str, jSONObject);
            } catch (Exception e) {
                new StringBuilder("NativeCallback callFailed: -> ").append(e.getMessage());
            }
        }
    }
}

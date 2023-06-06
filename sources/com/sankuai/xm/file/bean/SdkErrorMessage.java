package com.sankuai.xm.file.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class SdkErrorMessage {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String message;

    public SdkErrorMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c1ce0dc994f7ee3e7d6cc6d28d77d38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c1ce0dc994f7ee3e7d6cc6d28d77d38");
        } else {
            this.message = "";
        }
    }

    public String getMessage() {
        return this.message;
    }

    public void deserializeJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13ab08173eb2c5b9b948611b0a4a5a9d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13ab08173eb2c5b9b948611b0a4a5a9d");
        } else if (jSONObject == null) {
        } else {
            this.message = jSONObject.optString("message");
        }
    }
}

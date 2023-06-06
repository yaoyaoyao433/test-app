package com.dianping.titansmodel;

import com.meituan.android.common.fingerprint.FingerprintManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class d extends g {
    public static ChangeQuickRedirect a;
    public String b;

    @Override // com.dianping.titansmodel.g
    public final void writeToJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb17b2dba606cf00d8ab3e93f526cda3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb17b2dba606cf00d8ab3e93f526cda3");
            return;
        }
        try {
            jSONObject.put("result", this.result);
            jSONObject.put("errorMsg", this.errorMsg);
            jSONObject.put("status", this.status);
            jSONObject.put("errorCode", this.errorCode);
            jSONObject.put(FingerprintManager.TAG, this.b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.dianping.titansmodel.g, com.dianping.titansmodel.a
    public final JSONObject writeToJSON() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60220742534b712eda16b3720cf77eed", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60220742534b712eda16b3720cf77eed");
        }
        JSONObject jSONObject = new JSONObject();
        writeToJSON(jSONObject);
        return jSONObject;
    }
}

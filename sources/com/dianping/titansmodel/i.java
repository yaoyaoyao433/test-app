package com.dianping.titansmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i extends g {
    public static ChangeQuickRedirect a;
    public f[] b;

    @Override // com.dianping.titansmodel.g
    public final void writeToJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d552803f90cf3676be7995c65cbfb4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d552803f90cf3676be7995c65cbfb4a");
            return;
        }
        try {
            jSONObject.put("result", this.result);
            jSONObject.put("errorMsg", this.errorMsg);
            jSONObject.put("status", this.status);
            jSONObject.put("errorCode", this.errorCode);
            jSONObject.put("ret", k.a(this.b));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.dianping.titansmodel.g, com.dianping.titansmodel.a
    public final JSONObject writeToJSON() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1623db678fdf4dd5b98613a9838826db", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1623db678fdf4dd5b98613a9838826db");
        }
        JSONObject jSONObject = new JSONObject();
        writeToJSON(jSONObject);
        return jSONObject;
    }
}

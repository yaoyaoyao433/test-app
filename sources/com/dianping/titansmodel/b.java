package com.dianping.titansmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b extends g {
    public static ChangeQuickRedirect a;
    public e[] b;
    public long c;
    public long d;

    @Override // com.dianping.titansmodel.g
    public final void writeToJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de20423b319295ef705ffb4cb220c4ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de20423b319295ef705ffb4cb220c4ea");
            return;
        }
        try {
            jSONObject.put("result", this.result);
            jSONObject.put("errorMsg", this.errorMsg);
            jSONObject.put("status", this.status);
            jSONObject.put("errorCode", this.errorCode);
            jSONObject.put("photoInfos", k.a(this.b));
            jSONObject.put("compressTime", this.c != 0 ? this.d - this.c : 0L);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.dianping.titansmodel.g, com.dianping.titansmodel.a
    public final JSONObject writeToJSON() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef13ef548b8e5da67552e0c5a5655a0c", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef13ef548b8e5da67552e0c5a5655a0c");
        }
        JSONObject jSONObject = new JSONObject();
        writeToJSON(jSONObject);
        return jSONObject;
    }
}

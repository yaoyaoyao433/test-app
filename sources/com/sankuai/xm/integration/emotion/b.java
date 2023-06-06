package com.sankuai.xm.integration.emotion;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.d;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends d {
    public static ChangeQuickRedirect b;
    private String c;
    private String d;

    public b(String str, String str2, String str3) {
        super(str, null);
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66bba7416d41808a3b74231a0b6c8906", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66bba7416d41808a3b74231a0b6c8906");
            return;
        }
        this.c = str2;
        this.d = str3;
    }

    @Override // com.sankuai.xm.network.httpurlconnection.e
    public final JSONObject bY_() throws JSONException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50c1b23d2b63c448249a0cf4993bf5df", 6917529027641081856L)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50c1b23d2b63c448249a0cf4993bf5df");
        }
        JSONObject jSONObject = new JSONObject();
        new JSONObject();
        jSONObject.put("packageId", this.c);
        jSONObject.put("stickerId", this.d);
        return jSONObject;
    }
}

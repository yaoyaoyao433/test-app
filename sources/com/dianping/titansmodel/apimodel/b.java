package com.dianping.titansmodel.apimodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b implements d {
    public static ChangeQuickRedirect a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String[] f;
    public JSONObject g;
    public JSONArray h;

    @Override // com.dianping.titansmodel.apimodel.d
    public final void initParamWithJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eab4bef678f467487e743cd9fbc4b76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eab4bef678f467487e743cd9fbc4b76");
        } else if (jSONObject != null) {
            this.b = jSONObject.optInt("count");
            this.c = jSONObject.optString("selectedPhotos");
            this.d = jSONObject.optString("type");
            this.e = jSONObject.optString("returnType");
            this.h = jSONObject.optJSONArray("sizeType");
            JSONArray optJSONArray = jSONObject.optJSONArray("filter");
            this.f = new String[optJSONArray == null ? 0 : optJSONArray.length()];
            for (int i = 0; i < this.f.length; i++) {
                this.f[i] = optJSONArray.optString(i);
            }
            this.g = jSONObject.optJSONObject("options");
        }
    }
}

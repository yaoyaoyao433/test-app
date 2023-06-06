package com.dianping.titansmodel.apimodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public int d;
    public String e;

    @Override // com.dianping.titansmodel.apimodel.d
    public final void initParamWithJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8665c7facf3ab2df8110cf3ea2188f1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8665c7facf3ab2df8110cf3ea2188f1");
        } else if (jSONObject == null) {
        } else {
            this.b = jSONObject.optString("url");
            this.c = jSONObject.optString(Constants.PARAM_SCOPE);
            this.d = jSONObject.optInt("type");
            this.e = jSONObject.optString("appKey");
        }
    }
}

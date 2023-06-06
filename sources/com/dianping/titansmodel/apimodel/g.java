package com.dianping.titansmodel.apimodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g implements d {
    public static ChangeQuickRedirect a;
    public String b;

    @Override // com.dianping.titansmodel.apimodel.d
    public final void initParamWithJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b35b37f9e5897739892184ad479288ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b35b37f9e5897739892184ad479288ed");
        } else if (jSONObject == null) {
        } else {
            this.b = jSONObject.optString("localIds");
        }
    }
}

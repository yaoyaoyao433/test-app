package com.dianping.titansmodel.apimodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e implements d {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;

    @Override // com.dianping.titansmodel.apimodel.d
    public final void initParamWithJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccf066898f7b99ba2484b467c145e525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccf066898f7b99ba2484b467c145e525");
        } else if (jSONObject == null) {
        } else {
            this.b = jSONObject.optString("tradeno");
            this.c = jSONObject.optString("paytoken");
        }
    }
}

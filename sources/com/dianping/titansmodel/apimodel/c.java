package com.dianping.titansmodel.apimodel;

import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c implements d {
    public static ChangeQuickRedirect a;
    public String b;

    @Override // com.dianping.titansmodel.apimodel.d
    public final void initParamWithJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69d650eb49fae5aac3ab928e137ccc6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69d650eb49fae5aac3ab928e137ccc6a");
        } else if (jSONObject == null) {
        } else {
            this.b = jSONObject.optString(ShieldMonitorKey.TAG_BUSINESS);
        }
    }
}

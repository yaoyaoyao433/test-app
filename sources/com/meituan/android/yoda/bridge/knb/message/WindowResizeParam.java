package com.meituan.android.yoda.bridge.knb.message;

import android.support.annotation.Keep;
import com.dianping.titansmodel.apimodel.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class WindowResizeParam implements d {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int height;
    public int width;

    @Override // com.dianping.titansmodel.apimodel.d
    public void initParamWithJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da73dd0fae6283eba9f1a71ae8cabe05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da73dd0fae6283eba9f1a71ae8cabe05");
        } else if (jSONObject == null) {
        } else {
            this.width = jSONObject.optInt("width");
            this.height = jSONObject.optInt("height");
        }
    }
}

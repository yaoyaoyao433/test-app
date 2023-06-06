package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ProductFreeInfo implements b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_uuid")
    public String activityID;
    @SerializedName("body_text2")
    public String bottomTitle;
    @SerializedName("scheme_url")
    public String schemeUrl;
    @SerializedName("body_text1")
    public String topTitle;

    @Override // com.sankuai.waimai.store.repository.model.b
    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "452229ee5d5b311219530ff00ff77a65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "452229ee5d5b311219530ff00ff77a65");
            return;
        }
        this.topTitle = jSONObject.optString("body_text1");
        this.bottomTitle = jSONObject.optString("body_text2");
        this.schemeUrl = jSONObject.optString("scheme_url");
        this.activityID = jSONObject.optString("activity_uuid");
    }
}

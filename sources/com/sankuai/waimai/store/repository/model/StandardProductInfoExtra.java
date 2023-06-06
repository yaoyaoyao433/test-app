package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class StandardProductInfoExtra implements b, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code_center_desc")
    public String mCodeCenterDesc;
    @SerializedName("code_center_explain")
    public String mCodeCenterExplain;
    @SerializedName("code_center_image")
    public String mCodeCenterImage;

    @Override // com.sankuai.waimai.store.repository.model.b
    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "25bdcc96fc4e5dbcee6bd375375f36dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "25bdcc96fc4e5dbcee6bd375375f36dc");
            return;
        }
        try {
            this.mCodeCenterImage = jSONObject.optString("code_center_image");
            this.mCodeCenterDesc = jSONObject.optString("code_center_desc");
            this.mCodeCenterExplain = jSONObject.optString("code_center_explain");
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
    }
}

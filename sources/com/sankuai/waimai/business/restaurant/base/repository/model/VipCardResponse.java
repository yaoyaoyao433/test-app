package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class VipCardResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("template_data")
    public String templateData;
    @SerializedName("template_id")
    public String templateId;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5744635ea8add4cfbbf4c90ebe7a308c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5744635ea8add4cfbbf4c90ebe7a308c");
            return;
        }
        this.templateId = jSONObject.optString("template_id");
        this.templateData = jSONObject.optString("template_data");
    }
}

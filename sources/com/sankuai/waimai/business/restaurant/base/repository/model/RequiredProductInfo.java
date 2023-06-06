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
public class RequiredProductInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("has_required_product")
    public boolean hasRequiredProduct;
    @SerializedName("required_tag_id")
    public String requiredTagId;
    @SerializedName("tips")
    public String tips;
    @SerializedName("toast")
    public String toast;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caccc36b08cfaab0d3b9fbb1a57c02c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caccc36b08cfaab0d3b9fbb1a57c02c8");
            return;
        }
        this.hasRequiredProduct = jSONObject.optBoolean("has_required_product");
        this.requiredTagId = jSONObject.optString("required_tag_id");
        this.tips = jSONObject.optString("tips");
        this.toast = jSONObject.optString("toast");
    }
}

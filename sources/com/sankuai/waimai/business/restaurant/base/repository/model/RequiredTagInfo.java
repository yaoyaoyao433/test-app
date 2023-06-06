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
public class RequiredTagInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean hasRequiredProduct;
    @SerializedName("has_required_tag")
    public boolean hasRequiredTag;
    @SerializedName("required_tag_id")
    public String requiredTagId;
    @SerializedName("tips")
    public String tips;
    @SerializedName("toast")
    public String toast;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6a362d2e08828a502f8d4e258b7d692", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6a362d2e08828a502f8d4e258b7d692");
            return;
        }
        this.hasRequiredTag = jSONObject.optBoolean("has_required_tag");
        this.requiredTagId = jSONObject.optString("required_tag_id");
        this.tips = jSONObject.optString("tips");
        this.toast = jSONObject.optString("toast");
    }

    public static RequiredTagInfo updateRequiredTagInfo(RequiredTagInfo requiredTagInfo, RequiredProductInfo requiredProductInfo) {
        Object[] objArr = {requiredTagInfo, requiredProductInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fa88f4d06c9021a74c70e408e0275d4c", RobustBitConfig.DEFAULT_VALUE)) {
            return (RequiredTagInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fa88f4d06c9021a74c70e408e0275d4c");
        }
        if (requiredTagInfo == null) {
            requiredTagInfo = new RequiredTagInfo();
        }
        if (requiredProductInfo != null) {
            requiredTagInfo.hasRequiredProduct = requiredProductInfo.hasRequiredProduct;
            if (!requiredProductInfo.hasRequiredProduct) {
                requiredTagInfo.requiredTagId = requiredProductInfo.requiredTagId;
                requiredTagInfo.tips = requiredProductInfo.tips;
                requiredTagInfo.toast = requiredProductInfo.toast;
            }
        }
        return requiredTagInfo;
    }
}

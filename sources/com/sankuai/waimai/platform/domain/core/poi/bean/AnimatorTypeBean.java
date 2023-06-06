package com.sankuai.waimai.platform.domain.core.poi.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AnimatorTypeBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("alphaType")
    public AnimatorPropertyValueBean alphaType;
    @SerializedName("scaleType")
    public AnimatorPropertyValueBean scaleType;
    @SerializedName("transType")
    public AnimatorPropertyValueBean transType;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bc86a56c510445e1c6cf181c9122b9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bc86a56c510445e1c6cf181c9122b9f");
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("scaleType");
            if (optJSONObject != null) {
                this.scaleType = new AnimatorPropertyValueBean();
                this.scaleType.parseJson(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("transType");
            if (optJSONObject2 != null) {
                this.transType = new AnimatorPropertyValueBean();
                this.transType.parseJson(optJSONObject2);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("alphaType");
            if (optJSONObject3 != null) {
                this.alphaType = new AnimatorPropertyValueBean();
                this.alphaType.parseJson(optJSONObject3);
            }
        } catch (Exception e) {
            a.a(e);
        }
    }
}

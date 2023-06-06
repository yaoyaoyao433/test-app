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
public class AnimatorUpDownBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("downAnim")
    public AnimatorTypeBean downAnim;
    @SerializedName("upAnim")
    public AnimatorTypeBean upAnim;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dc13b9b65f842cefa2815f894ae7372", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dc13b9b65f842cefa2815f894ae7372");
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("upAnim");
            if (optJSONObject != null) {
                this.upAnim = new AnimatorTypeBean();
                this.upAnim.parseJson(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("downAnim");
            if (optJSONObject2 != null) {
                this.downAnim = new AnimatorTypeBean();
                this.downAnim.parseJson(optJSONObject2);
            }
        } catch (Exception e) {
            a.a(e);
        }
    }
}

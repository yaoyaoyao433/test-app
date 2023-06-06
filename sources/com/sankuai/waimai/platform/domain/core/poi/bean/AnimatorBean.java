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
public class AnimatorBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("animType")
    public AnimatorTypeBean animType;
    @SerializedName("fadingIn")
    public AnimatorUpDownBean fadingIn;
    @SerializedName("fadingInandOut")
    public AnimatorUpDownBean fadingInandOut;
    @SerializedName("fadingOut")
    public AnimatorUpDownBean fadingOut;
    @SerializedName("lightWipe")
    public AnimatorUpDownBean lightWipe;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "54676b9aa582f1dbaff441fc6a8fe7ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "54676b9aa582f1dbaff441fc6a8fe7ab");
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("animType");
            if (optJSONObject != null) {
                this.animType = new AnimatorTypeBean();
                this.animType.parseJson(optJSONObject);
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("fadingInandOut");
            if (optJSONObject2 != null) {
                this.fadingInandOut = new AnimatorUpDownBean();
                this.fadingInandOut.parseJson(optJSONObject2);
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("fadingIn");
            if (optJSONObject3 != null) {
                this.fadingIn = new AnimatorUpDownBean();
                this.fadingIn.parseJson(optJSONObject3);
            }
            JSONObject optJSONObject4 = jSONObject.optJSONObject("fadingOut");
            if (optJSONObject4 != null) {
                this.fadingOut = new AnimatorUpDownBean();
                this.fadingOut.parseJson(optJSONObject4);
            }
            JSONObject optJSONObject5 = jSONObject.optJSONObject("lightWipe");
            if (optJSONObject5 != null) {
                this.lightWipe = new AnimatorUpDownBean();
                this.lightWipe.parseJson(optJSONObject5);
            }
        } catch (Exception e) {
            a.a(e);
        }
    }
}

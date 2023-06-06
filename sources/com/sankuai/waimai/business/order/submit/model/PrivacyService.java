package com.sankuai.waimai.business.order.submit.model;

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
public class PrivacyService implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("privacy_close_desc")
    public String privacy_close_desc;
    @SerializedName("privacy_close_snd_desc")
    public String privacy_close_snd_desc;
    @SerializedName("privacy_explain_url")
    public String privacy_explain_url;
    @SerializedName("privacy_icon")
    public String privacy_icon;
    @SerializedName("new_feature_guide_desc")
    public String privacy_new_feature__guide_desc;
    @SerializedName("privacy_open_desc")
    public String privacy_open_desc;
    @SerializedName("privacy_open_guide_desc")
    @Deprecated
    public String privacy_open_guide_desc;
    @SerializedName("privacy_open_snd_desc")
    public String privacy_open_snd_desc;
    @SerializedName("privacy_selected")
    public int privacy_selected;
    @SerializedName("privacy_title")
    public String privacy_title;
    @SerializedName("show")
    public int show;

    public PrivacyService fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "489d697bd1f942d098dc0d5315edbfe7", RobustBitConfig.DEFAULT_VALUE)) {
            return (PrivacyService) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "489d697bd1f942d098dc0d5315edbfe7");
        }
        if (jSONObject == null) {
            return null;
        }
        this.privacy_title = jSONObject.optString("privacy_title");
        this.privacy_icon = jSONObject.optString("privacy_icon");
        this.show = jSONObject.optInt("show");
        this.privacy_selected = jSONObject.optInt("privacy_selected");
        this.privacy_explain_url = jSONObject.optString("privacy_explain_url");
        this.privacy_close_desc = jSONObject.optString("privacy_close_desc");
        this.privacy_open_desc = jSONObject.optString("privacy_open_desc");
        this.privacy_open_guide_desc = jSONObject.optString("privacy_open_guide_desc");
        this.privacy_new_feature__guide_desc = jSONObject.optString("new_feature_guide_desc");
        this.privacy_close_snd_desc = jSONObject.optString("privacy_close_snd_desc");
        this.privacy_open_snd_desc = jSONObject.optString("privacy_open_snd_desc");
        return this;
    }
}

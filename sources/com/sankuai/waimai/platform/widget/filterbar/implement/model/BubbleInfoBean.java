package com.sankuai.waimai.platform.widget.filterbar.implement.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BubbleInfoBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("is_show")
    public boolean isShow;
    @SerializedName("bubble_version")
    public int version;

    public static BubbleInfoBean fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ac6d4f40e4a6dab22bc8d799bd53dd17", RobustBitConfig.DEFAULT_VALUE)) {
            return (BubbleInfoBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ac6d4f40e4a6dab22bc8d799bd53dd17");
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return null;
        }
        BubbleInfoBean bubbleInfoBean = new BubbleInfoBean();
        bubbleInfoBean.isShow = jSONObject.optBoolean("is_show", false);
        bubbleInfoBean.version = jSONObject.optInt("bubble_version", 0);
        return bubbleInfoBean;
    }

    public JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e56ef4ce342b0dd6e794fb382bd9aff4", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e56ef4ce342b0dd6e794fb382bd9aff4");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_show", this.isShow);
            jSONObject.put("bubble_version", this.version);
        } catch (Exception unused) {
        }
        return jSONObject;
    }
}

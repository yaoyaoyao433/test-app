package com.sankuai.waimai.store.widgets.filterbar.home.model;

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
public class BubbleInfoBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("is_show")
    public boolean isShow;
    @SerializedName("bubble_version")
    public int version;

    public BubbleInfoBean() {
    }

    public BubbleInfoBean(BubbleInfoBean bubbleInfoBean) {
        Object[] objArr = {bubbleInfoBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fef0ea2883385e92d9c5528fa5071353", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fef0ea2883385e92d9c5528fa5071353");
        } else if (bubbleInfoBean != null) {
            this.isShow = bubbleInfoBean.isShow;
            this.version = bubbleInfoBean.version;
        }
    }

    public static BubbleInfoBean fromJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9fc5451cd5382551cb69bbec236db134", RobustBitConfig.DEFAULT_VALUE)) {
            return (BubbleInfoBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9fc5451cd5382551cb69bbec236db134");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24ef8f88c99231a52b16800a84502708", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24ef8f88c99231a52b16800a84502708");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("is_show", this.isShow);
            jSONObject.put("bubble_version", this.version);
        } catch (Exception e) {
            com.sankuai.shangou.stone.util.log.a.a(e);
        }
        return jSONObject;
    }
}

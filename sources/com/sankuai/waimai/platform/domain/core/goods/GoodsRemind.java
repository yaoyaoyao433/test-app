package com.sankuai.waimai.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GoodsRemind implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    @Expose
    public String content;
    @SerializedName("title")
    @Expose
    public String title;

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74877a4e3ac56ccfa8b04a03dc41d6d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74877a4e3ac56ccfa8b04a03dc41d6d7");
            return;
        }
        try {
            this.title = jSONObject.optString("title", "");
            this.content = jSONObject.optString("content", "");
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
    }
}

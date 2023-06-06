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
public class OrderTogetherEntrance implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("content")
    public String content;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("visible")
    private int visible;

    public boolean isVisible() {
        return this.visible == 1;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5231c676795cd8bb44a8dac19bed0a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5231c676795cd8bb44a8dac19bed0a9");
        } else if (jSONObject != null) {
            this.visible = jSONObject.optInt("visible");
            this.content = jSONObject.optString("content");
            this.iconUrl = jSONObject.optString("icon_url");
        }
    }
}

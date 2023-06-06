package com.sankuai.waimai.store.platform.domain.core.goods;

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
public class DescriptionBarInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1897557357767888920L;
    @SerializedName("background_color")
    public String backgroundColor;
    @SerializedName("content")
    public String content;
    @SerializedName("content_color")
    public String contentColor;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c150db1bd3da37101e1b20a8f49edc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c150db1bd3da37101e1b20a8f49edc4");
        } else if (jSONObject == null) {
        } else {
            try {
                this.content = jSONObject.optString("content");
                this.contentColor = jSONObject.optString("content_color");
                this.backgroundColor = jSONObject.optString("background_color");
            } catch (Exception e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
    }
}

package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ProductVideoInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("length")
    public int length;
    @SerializedName("mainPicture")
    public String mainPicture;
    @SerializedName(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE)
    public String size;
    @SerializedName("url")
    public String url;

    public void parseVideoInfo(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "173db4e11a618b06151b8a7e9c5e230a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "173db4e11a618b06151b8a7e9c5e230a");
            return;
        }
        this.length = jSONObject.optInt("length");
        this.size = jSONObject.optString(JsBridgeResult.PROPERTY_CHOOSE_MEDIA_SIZE);
        this.url = jSONObject.optString("url");
        this.mainPicture = jSONObject.optString("mainPicture");
    }
}

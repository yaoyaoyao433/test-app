package com.sankuai.waimai.platform.domain.core.poi.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.adapter.internal.CommonCode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import java.io.Serializable;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class AnimatorPicInfoBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("center")
    public int[] dishesCenter;
    @SerializedName(CommonCode.MapKey.HAS_RESOLUTION)
    public int[] picResolution;
    @SerializedName("url")
    public String url;

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d20dcfe4d4898ebbeef0f7cab3b7c827", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d20dcfe4d4898ebbeef0f7cab3b7c827");
            return;
        }
        try {
            this.url = jSONObject.optString("url");
            JSONArray optJSONArray = jSONObject.optJSONArray("center");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.dishesCenter = new int[optJSONArray.length()];
                for (int i = 0; i < optJSONArray.length(); i++) {
                    this.dishesCenter[i] = optJSONArray.optInt(i);
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray(CommonCode.MapKey.HAS_RESOLUTION);
            if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                return;
            }
            this.picResolution = new int[optJSONArray2.length()];
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                this.picResolution[i2] = optJSONArray2.optInt(i2);
            }
        } catch (Exception e) {
            a.a(e);
        }
    }
}

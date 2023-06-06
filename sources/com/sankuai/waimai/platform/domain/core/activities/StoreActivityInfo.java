package com.sankuai.waimai.platform.domain.core.activities;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.domain.core.poi.PoiItem;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class StoreActivityInfo extends PoiItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_text")
    @Expose
    public String activityText;
    @SerializedName("icon_url")
    @Expose
    public String iconUrl;
    @SerializedName("scheme_url")
    @Expose
    public String schemeUrl;

    @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem, com.sankuai.waimai.platform.domain.core.poi.IPoiItem
    public String getTag() {
        return "";
    }

    @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem
    public void setTag(String str) {
    }

    public void parseJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b0a69e978b9f9fa127460f67caf1d426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b0a69e978b9f9fa127460f67caf1d426");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.activityText = jSONObject.optString("activity_text");
                this.schemeUrl = jSONObject.optString("scheme_url");
                this.iconUrl = jSONObject.optString("icon_url");
            } catch (JSONException unused) {
            }
        }
    }
}

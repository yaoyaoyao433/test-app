package com.sankuai.waimai.store.platform.domain.core.activities;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.log.a;
import com.sankuai.waimai.store.platform.domain.core.poi.PoiItem;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class StoreActivityInfo extends PoiItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_id")
    public String activityID;
    @SerializedName("activity_text")
    public String activityText;
    @SerializedName("activity_type")
    public int activityType;
    @SerializedName("icon_url")
    public String iconUrl;
    @SerializedName("scheme_url")
    public String schemeUrl;
    @SerializedName("text_bg_color")
    public String textBgColor;
    @SerializedName("text_color")
    public String textColor;
    @SerializedName("view_type")
    public int viewType;

    @Override // com.sankuai.waimai.store.platform.domain.core.poi.PoiItem, com.sankuai.waimai.store.platform.domain.core.poi.IPoiItem
    public String getTag() {
        return "";
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.poi.PoiItem
    public void setTag(String str) {
    }

    public void parseJson(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38d9590cafdb8436c696b6b22f2d48ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38d9590cafdb8436c696b6b22f2d48ee");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.activityText = jSONObject.optString("activity_text");
                this.schemeUrl = jSONObject.optString("scheme_url");
                this.iconUrl = jSONObject.optString("icon_url");
                this.activityType = jSONObject.optInt("activity_type");
                this.activityID = jSONObject.optString("activity_id");
                this.viewType = jSONObject.optInt("view_type");
                this.textColor = jSONObject.optString("text_color");
                this.textBgColor = jSONObject.optString("text_bg_color");
            } catch (JSONException e) {
                a.a(e);
            }
        }
    }
}

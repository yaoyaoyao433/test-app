package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BoughtPoiCategory extends PoiCategory {
    public static final String TAGCODE = "BoughtPoiCategory";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("tag")
    public String tag;
    @SerializedName("tag_icon")
    public String tagIcon;
    @SerializedName("tag_name")
    public String tagName;

    @Override // com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory
    public String getTagName() {
        return this.tagName;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory
    public String getTagIcon() {
        return this.tagIcon;
    }

    @Override // com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory
    public String getTagCode() {
        return this.tag;
    }

    public void parseJson(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3174d9ba4bb56217af6aa01c3738dc05", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3174d9ba4bb56217af6aa01c3738dc05");
            return;
        }
        this.tag = jSONObject.optString("tag");
        if (TextUtils.isEmpty(this.tag)) {
            this.tag = "BoughtPoiCategory";
        }
        this.tagName = jSONObject.optString("tag_name");
        this.tagIcon = jSONObject.optString("tag_icon");
    }
}

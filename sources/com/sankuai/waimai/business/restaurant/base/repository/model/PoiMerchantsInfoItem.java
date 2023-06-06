package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.domain.core.poi.IPoiItem;
import com.sankuai.waimai.platform.domain.core.poi.PoiItem;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiMerchantsInfoItem extends PoiItem implements IPoiItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int adType;
    @SerializedName("base_picture_url")
    public String basePictureUrl;
    public String chargeInfo;
    public String landPageUrl;
    @SerializedName("main_title")
    public String mainTitle;
    @SerializedName("sub_title")
    public String subTitle;
    private String tag;

    @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem
    public void setTag(String str) {
        this.tag = str;
    }

    @Override // com.sankuai.waimai.platform.domain.core.poi.PoiItem, com.sankuai.waimai.platform.domain.core.poi.IPoiItem
    public String getTag() {
        return this.tag;
    }
}

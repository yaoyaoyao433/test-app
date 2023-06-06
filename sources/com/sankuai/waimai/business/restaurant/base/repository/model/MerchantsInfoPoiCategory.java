package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.platform.domain.core.poi.IPoiItem;
import com.sankuai.waimai.platform.domain.core.shop.PoiCategory;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MerchantsInfoPoiCategory extends PoiCategory {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("modules")
    public List<PoiMerchantsInfoItem> items;
    @SerializedName("menu_entrance_land_page_url")
    public String landPageUrl;
    @SerializedName("module_name")
    public String name;

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public String getTagCode() {
        return null;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public String getTagIcon() {
        return null;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public int getTagSequence() {
        return 0;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public String getTagName() {
        return this.name;
    }

    @Override // com.sankuai.waimai.platform.domain.core.shop.PoiCategory
    public List<? extends IPoiItem> getItemList() {
        return this.items;
    }
}

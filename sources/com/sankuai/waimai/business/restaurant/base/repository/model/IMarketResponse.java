package com.sankuai.waimai.business.restaurant.base.repository.model;

import android.support.annotation.Keep;
import com.sankuai.waimai.platform.domain.core.shop.PoiCategory;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public interface IMarketResponse {
    BoughtPoiCategory getBoughtPoiCategory();

    int getCategoryShowType();

    long getChosenSpuId();

    boolean getChosenSpuNeedAdd();

    List<GoodsPoiCategory> getGoodsPoiCategories();

    OperationPoiCategory getOperationPoiCategory();

    String getPoiIdStr();

    PoiCategory getSelectPoiCategory();

    int getTemplateType();

    boolean hasVolumeBoard();

    void setChosenSpu(long j, boolean z);
}

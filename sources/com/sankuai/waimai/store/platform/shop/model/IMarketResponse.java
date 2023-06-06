package com.sankuai.waimai.store.platform.shop.model;

import android.support.annotation.Keep;
import com.sankuai.waimai.store.platform.domain.core.shop.PoiCategory;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public interface IMarketResponse {
    long getChosenSpuId();

    boolean getChosenSpuNeedAdd();

    Object getDataSrc();

    List<GoodsPoiCategory> getGoodsPoiCategories();

    String getOfficialPoiId();

    OperationPoiCategory getOperationPoiCategory();

    long getPoiId();

    PoiCategory getSelectPoiCategory();

    String getStids();

    String getStringPoiId();

    int getTemplateType();

    List<Integer> questionTypes();

    void setChosenSpu(long j, boolean z);
}

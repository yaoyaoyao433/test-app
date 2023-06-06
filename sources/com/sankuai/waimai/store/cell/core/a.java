package com.sankuai.waimai.store.cell.core;

import android.support.annotation.NonNull;
import android.view.View;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.repository.model.GoodDetailResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface a extends com.sankuai.waimai.store.observers.a {
    void a(@NonNull GoodsSpu goodsSpu, int i);

    void a(boolean z, boolean z2);

    View getView();

    void setActionCallback(@NonNull b bVar);

    void setCellConfig(CellUiConfig cellUiConfig);

    void setEventCallback(@NonNull c cVar);

    void setGoodDetailResponse(GoodDetailResponse goodDetailResponse);

    void setPoiHelper(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar);
}

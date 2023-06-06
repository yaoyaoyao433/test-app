package com.sankuai.waimai.store.poi.list.refactor.service;

import android.arch.lifecycle.f;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import com.sankuai.waimai.store.assembler.component.BaseCard;
import com.sankuai.waimai.store.repository.model.PoiVerticalityDataResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface c {
    BaseCard a(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull f fVar, @NonNull FragmentActivity fragmentActivity);

    BaseCard b(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull f fVar, @NonNull FragmentActivity fragmentActivity);

    List<BaseCard> c(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull f fVar, @NonNull FragmentActivity fragmentActivity);

    List<BaseCard> d(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull f fVar, @NonNull FragmentActivity fragmentActivity);

    List<BaseCard> e(@NonNull PoiVerticalityDataResponse poiVerticalityDataResponse, @NonNull f fVar, @NonNull FragmentActivity fragmentActivity);
}

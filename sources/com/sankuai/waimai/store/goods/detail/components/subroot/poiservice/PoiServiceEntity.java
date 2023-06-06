package com.sankuai.waimai.store.goods.detail.components.subroot.poiservice;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiServiceEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Poi.PoiImpressLabel mPoiLabel;
    public int mShowType;

    public PoiServiceEntity(Poi.PoiImpressLabel poiImpressLabel, int i) {
        this.mPoiLabel = poiImpressLabel;
        this.mShowType = i;
    }
}

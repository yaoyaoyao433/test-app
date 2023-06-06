package com.sankuai.waimai.store.goods.subscribe;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SpuSubscribeModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("poi_info")
    public Poi poiInfo;
    @SerializedName("spus")
    public List<GoodsSpu> spus;
}

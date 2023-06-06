package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SpuInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("channel_spu_id")
    public String channelSpuId;
    @SerializedName("poi_info")
    public Poi poi;
    @SerializedName("spu")
    public GoodsSpu spu;
}

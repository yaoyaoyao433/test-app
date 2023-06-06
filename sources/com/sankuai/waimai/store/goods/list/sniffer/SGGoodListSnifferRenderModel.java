package com.sankuai.waimai.store.goods.list.sniffer;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.base.net.sg.c;
import com.sankuai.waimai.store.platform.domain.manager.poi.a;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGGoodListSnifferRenderModel extends SGGoodListSnifferCommonModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("error")
    public String error;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String poiIdStr;
    @SerializedName("spu_tag_id")
    public String spuTagId;
    @SerializedName("wm_poi_id")
    public long wmPoiId;

    public SGGoodListSnifferRenderModel(long j, String str, String str2, String str3) {
        this.env = c.a().b();
        this.wmPoiId = j;
        this.poiIdStr = str;
        this.spuTagId = str2;
        this.error = str3;
        a l = com.sankuai.waimai.store.order.a.e().l(a.a(this.poiIdStr, this.wmPoiId));
        if (l == null || l.b == null) {
            return;
        }
        this.buzType = l.b.getBuzType();
        this.poiName = l.b.getName();
    }
}

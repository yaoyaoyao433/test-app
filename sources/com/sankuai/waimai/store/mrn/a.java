package com.sankuai.waimai.store.mrn;

import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.store.util.jsonadapter.JsonStringToLongAdapter;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a {
    public static ChangeQuickRedirect a;
    @SerializedName("poi_id")
    @JsonAdapter(JsonStringToLongAdapter.class)
    public long b;
    @SerializedName(FoodDetailNetWorkPreLoader.URI_POI_STR)
    public String c;
    @SerializedName("biz_line")
    public String d;
    public boolean e;

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53cb53bfb994f1ca34ec9868e95a856f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53cb53bfb994f1ca34ec9868e95a856f") : com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.c, this.b);
    }
}

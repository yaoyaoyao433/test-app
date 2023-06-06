package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class PoiCardInfo implements Serializable {
    public static final int MODULE = 1;
    public static final int POI = 0;
    public static final int RECYCLE_MACH = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    public transient int apiIndex;
    @SerializedName("card_id")
    public String cardID;
    @SerializedName("card_type")
    public int cardType;
    @SerializedName("module_info")
    public BaseModuleDesc moduleDesc;
    @SerializedName("poi_info")
    public PoiVerticality poi;
    public transient long poiId;
    public transient String spuIdList;
}

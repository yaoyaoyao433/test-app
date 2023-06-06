package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.api.again.AgainManager;
import com.sankuai.waimai.store.platform.domain.core.poi.Product;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class LastBoughtProduct extends Product implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bought_times")
    public int boughtTimes;
    @SerializedName("bought_times_desc")
    public String boughtTimesDesc;
    @SerializedName("poi_id")
    public long poiId;
    @SerializedName(AgainManager.EXTRA_POI_NAME)
    public String poiName;
    @SerializedName("product_recommend")
    public String productRecommend;
    @SerializedName("product_recommend_code")
    public int productRecommendCode;
}

package com.sankuai.waimai.store.platform.domain.core.goods;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import com.sankuai.waimai.store.platform.shop.model.SaleOutRemind;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SpuProductsResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_info")
    public ActivityInfo activityInfo;
    @SerializedName("brandInfo")
    public SGSortModel brandInfo;
    @SerializedName("brandUpdate")
    public boolean brandUpdate;
    @SerializedName("current_page")
    public int currentPage;
    @SerializedName("has_next_page")
    public boolean hasNextPage;
    @SerializedName("product_spu_list")
    public List<GoodsSpu> productSpuList;
    @SerializedName("rank_extend")
    public String rankExtend;
    @SerializedName("rank_trace_id")
    public String rankTraceId;
    @SerializedName("saleOutRemind")
    public SaleOutRemind saleOutRemind;
    @SerializedName("allSortedSaleOutSpuId")
    public List<Long> saleOutSpuIds;
    @SerializedName("sortList")
    public List<SGSortModel> sortList;
    @SerializedName("allSortedSpuId")
    public List<Long> spuIds;
    @SerializedName("trace_id")
    public String traceId;
}

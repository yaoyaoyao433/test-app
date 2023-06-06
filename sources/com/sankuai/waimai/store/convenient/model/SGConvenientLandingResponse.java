package com.sankuai.waimai.store.convenient.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGConvenientLandingResponse extends BaseDataResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("card_info_list")
    public List<PoiCardInfo> cardInfoList;
    @SerializedName("next_page_offset")
    public int nextPageOffset;
    @SerializedName("page_bg_pic")
    public String pageBgPic;
    @SerializedName("page_name")
    public String pageName;
    @SerializedName("poi_has_next_page")
    public boolean poiHasNextPage;
    @SerializedName("quick_filter")
    public BaseModuleDesc quickFilter;
    @SerializedName("rank_trace_id")
    public String rankTraceId;
    @SerializedName("shelf_page_trace_id")
    public String shelfPageTraceId;
}

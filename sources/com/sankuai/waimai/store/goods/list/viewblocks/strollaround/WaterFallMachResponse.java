package com.sankuai.waimai.store.goods.list.viewblocks.strollaround;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.domain.core.base.BaseDataResponse;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class WaterFallMachResponse extends BaseDataResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("current_page")
    public int currentPage;
    @SerializedName("has_next_page")
    public boolean hasNextPage;
    @SerializedName("module_list")
    public List<BaseModuleDesc> moduleList;
    @SerializedName("name")
    public String name;
    @SerializedName("product_count")
    public int productCount;
}

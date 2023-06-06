package com.sankuai.waimai.store.repository.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class TileList implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("has_next_page")
    public boolean hasNextPage;
    @SerializedName("all_item_id")
    public List<String> itemIdList;
    @SerializedName("item_list")
    public List<BaseModuleDesc> itemList;
    @SerializedName("list_type")
    public int listType;
    @SerializedName("trace_id")
    public String traceId;
}

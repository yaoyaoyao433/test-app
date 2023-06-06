package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.search.model.SearchFilterGroup;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GuidedItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    public String code;
    @SerializedName("cpv_key")
    public String cpvKey;
    public boolean expanded;
    public com.sankuai.waimai.store.search.statistics.f filterButtonNode;
    public String filterFrom;
    public com.sankuai.waimai.store.search.statistics.f filterGroupNode;
    @SerializedName("filter_item_status")
    public int filterItemStatus;
    @SerializedName("filter_style")
    public int filterStyle;
    public com.sankuai.waimai.store.search.statistics.f filterWindowNode;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("index")
    public int index;
    public boolean isExposed;
    public boolean isFragmentOpen;
    public boolean isSelected;
    public int itemWidth;
    @SerializedName("label")
    public String label;
    public int localNumberOfSelectedItems;
    @SerializedName("items")
    public List<SearchFilterGroup.SearchFilterItem> mDropDownItems;
    public com.sankuai.waimai.store.search.statistics.f overPageSearchNode;
    @SerializedName("search_filter_dot")
    public SGSearchFilterDot searchFilterDot;
    @SerializedName("search_text")
    public String searchText;
    @SerializedName("secondGuidedQuery")
    public String secondGuidedQuery;
    public String selectedCodeStr;
    @SerializedName("showText")
    public String showText;
    @SerializedName("sub_text")
    public String subText;
    @SerializedName("text")
    public String text;
    @SerializedName("text_width")
    public int textWidth;
    @SerializedName("type")
    public int type;

    public GuidedItem() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "715fd3c8badfa71015b50f4bbaac392d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "715fd3c8badfa71015b50f4bbaac392d");
            return;
        }
        this.isExposed = false;
        this.filterFrom = "";
        this.expanded = false;
        this.localNumberOfSelectedItems = 0;
        this.isFragmentOpen = false;
        this.itemWidth = 0;
    }

    public boolean isNewTextFilter() {
        return this.type == 3;
    }
}

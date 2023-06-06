package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import android.support.annotation.Nullable;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class CommonSortFilterEntity implements Serializable {
    public static final int SEARCH_SWITCH_MODE_POI = 100;
    public static final int SEARCH_SWITCH_MODE_SPU = 200;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("drug_b2c_filter_tab")
    public DrugB2CFilterTabInfo drugB2cFilterTabInfo;
    @SerializedName("filter_list")
    public List<SearchFilterGroup> filterList;
    public boolean isExpose;
    @SerializedName("quick_filter_item_list")
    public List<GuidedItem> quickfilterList;
    @SerializedName("switch_button")
    public int searchSwitchMode;
    @SerializedName("sort_list")
    public List<SortItemInfo> sortList;
    @SerializedName("sort_list_button")
    private List<SortItemInfo> sortListButton;

    public CommonSortFilterEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efa976893871ae5033bdba6de2ae390b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efa976893871ae5033bdba6de2ae390b");
        } else {
            this.isExpose = false;
        }
    }

    @Nullable
    public static SortItemInfo getSelectItem(List<SortItemInfo> list, long j) {
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b46e1243fd4c1e5290a0cc8b3bcda12", RobustBitConfig.DEFAULT_VALUE)) {
            return (SortItemInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b46e1243fd4c1e5290a0cc8b3bcda12");
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return null;
        }
        for (SortItemInfo sortItemInfo : list) {
            if (sortItemInfo != null && j == sortItemInfo.code) {
                return sortItemInfo;
            }
        }
        return null;
    }

    public List<SortItemInfo> getSortListButton() {
        return this.sortListButton;
    }
}

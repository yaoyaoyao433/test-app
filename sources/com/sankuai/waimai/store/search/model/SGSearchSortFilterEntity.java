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
public class SGSearchSortFilterEntity implements Serializable {
    public static final int SEARCH_SWITCH_MODE_POI = 100;
    public static final int SEARCH_SWITCH_MODE_SPU = 200;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("filter_list")
    public List<SearchFilterGroup> filterList;
    public boolean isExpose;
    @SerializedName("switch_button")
    public int searchSwitchMode;
    @SerializedName("sort_list")
    public List<SortItemInfo> sortList;
    @SerializedName("sort_list_button")
    private List<SortItemInfo> sortListButton;

    public SGSearchSortFilterEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "372fab9ab4624ef90f7079c8c36d92a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "372fab9ab4624ef90f7079c8c36d92a7");
        } else {
            this.isExpose = false;
        }
    }

    @Nullable
    public static SortItemInfo getSelectItem(List<SortItemInfo> list, long j) {
        Object[] objArr = {list, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d7fb9367ddb22a9ff7ed4ee62fe8b933", RobustBitConfig.DEFAULT_VALUE)) {
            return (SortItemInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d7fb9367ddb22a9ff7ed4ee62fe8b933");
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

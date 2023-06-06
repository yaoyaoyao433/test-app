package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.ui.SearchShareData;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class TabStyleSortFilterEntity implements Serializable {
    public static final int MULTIPLE_ITEM = 200;
    public static final int SINGLE_ITEM = 100;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("filter_list")
    public List<SearchFilterTabGroup> filterList;
    public boolean isExpose;
    @SerializedName("brand_filter")
    public BrandFilter mBrandFilter;
    @SerializedName("price_sort_list")
    public List<SortItemInfo> priceSortList;
    @SerializedName("quick_filter_item_list")
    public List<GuidedItem> quickfilterList;
    @SerializedName("address_bar")
    public SearchLocation searchLocation;
    @SerializedName("sort_list")
    public List<SortItemInfo> sortList;
    @SerializedName("sort_list_button")
    public List<SortItemInfo> sortListButton;

    public TabStyleSortFilterEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab7a20270e35e15c10dfac9426591d7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab7a20270e35e15c10dfac9426591d7f");
        } else {
            this.isExpose = false;
        }
    }

    public boolean getTabDefaultStatus(List<SearchFilterTabGroup> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1adb1224df496632a9b278c3b22b405b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1adb1224df496632a9b278c3b22b405b")).booleanValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return false;
        }
        for (SearchFilterTabGroup searchFilterTabGroup : list) {
            if (searchFilterTabGroup != null && searchFilterTabGroup.isHit) {
                return true;
            }
        }
        return false;
    }

    public boolean isCodeEqual(List<SearchFilterTabGroup> list, @NonNull SearchShareData searchShareData) {
        Object[] objArr = {list, searchShareData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4cd81eccb2653ecf537b48028310363b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4cd81eccb2653ecf537b48028310363b")).booleanValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(list)) {
            return false;
        }
        for (SearchFilterTabGroup searchFilterTabGroup : list) {
            if (searchFilterTabGroup != null && TextUtils.equals(searchFilterTabGroup.code, searchShareData.am)) {
                return true;
            }
        }
        return false;
    }
}

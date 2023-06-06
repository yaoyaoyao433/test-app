package com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class QuickSortFilterBottomBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final boolean canMultiSelect;
    public final List<FilterConditionResponse.FilterGroup.FilterItem> filterList;
    public final String group;
    public final List<String> selectCodeList;

    public QuickSortFilterBottomBean() {
        this.canMultiSelect = true;
        this.group = "";
        this.selectCodeList = null;
        this.filterList = null;
    }

    public QuickSortFilterBottomBean(boolean z, String str, List<String> list, List<FilterConditionResponse.FilterGroup.FilterItem> list2) {
        this.canMultiSelect = z;
        this.group = str;
        this.selectCodeList = list;
        this.filterList = list2;
    }
}

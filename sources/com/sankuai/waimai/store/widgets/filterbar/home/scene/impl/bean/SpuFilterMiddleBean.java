package com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.widgets.filterbar.home.model.FilterConditionResponse;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SpuFilterMiddleBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<FilterConditionResponse.FilterGroup> groupList;
    public int index;
    public List<String> selectCodeList;

    public SpuFilterMiddleBean(int i, List<String> list, List<FilterConditionResponse.FilterGroup> list2) {
        this.index = i;
        this.selectCodeList = list;
        this.groupList = list2;
    }
}

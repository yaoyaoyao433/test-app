package com.sankuai.waimai.store.widgets.filterbar.home.scene.impl.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class QuickSortFilterMiddleBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final List<SGSortModel> modelList;
    public final long selectType;

    public QuickSortFilterMiddleBean(long j, List<SGSortModel> list) {
        this.selectType = j;
        this.modelList = list;
    }
}

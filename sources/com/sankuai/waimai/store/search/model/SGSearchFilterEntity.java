package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SGSearchFilterEntity implements com.sankuai.waimai.store.search.ui.result.controller.quickfilter.a, Serializable {
    public static final int SELECTED_MODE_RADIO = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_filter_list")
    public List<SearchFilterGroup> filterGroups;
    public int globalNumberOfSelectedItems = 0;
}

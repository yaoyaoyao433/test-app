package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class SearchFilterGroup implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("items")
    public List<SearchFilterItem> filterItems;
    @SerializedName("type")
    public int groupFilterType;
    @SerializedName("group_title")
    public String groupTitle;
    public String selectedItemsStr;
    @SerializedName("slide_fliter")
    public SearchSlideFilter slideFilter;
    @SerializedName("support_multi_choice")
    public int supportMultiChoice;
    public int localNumberOfSelectedItems = 0;
    public boolean expanded = false;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SearchFilterItem implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("bg_url")
        public String backgroundUrl;
        @SerializedName("cpv_value")
        public String cpvValue;
        @SerializedName("code")
        public String filterCode;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String filterIcon;
        @SerializedName("name")
        public String filterName;
        public String groupTitle;
        @SerializedName("remarks")
        public String remarks;
        @SerializedName("search_filter_dot")
        public SGSearchFilterDot searchFilterDot;
        public boolean selected = false;
        @SerializedName("type")
        public int type;
    }
}

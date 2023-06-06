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
public class SearchFilterTabGroup implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("code")
    public String code;
    @SerializedName("items")
    public List<SearchFilterItem> filterItems;
    @SerializedName("group_title")
    public String groupTitle;
    public boolean isExpose = false;
    @SerializedName("isHit")
    public boolean isHit;
    @SerializedName("selected_tab_image")
    public String selectedItemImage;
    @SerializedName("tab_tip_content")
    public String tabTipContent;
    @SerializedName("unselect_tab_image")
    public String unSelectItemImage;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SearchFilterItem implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("bg_url")
        public String backgroundUrl;
        @SerializedName("code")
        public String filterCode;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String filterIcon;
        @SerializedName("name")
        public String filterName;
        @SerializedName("search_filter_dot")
        public SGSearchFilterDot searchFilterDot;
        @SerializedName("type")
        public int type;
    }
}

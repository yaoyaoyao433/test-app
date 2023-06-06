package com.sankuai.waimai.store.widgets.filterbar.home.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.BaseModuleDesc;
import com.sankuai.waimai.store.repository.model.CardScenes;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class FilterConditionResponse implements Serializable {
    public static final int FILTER_STYLE_ONE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("activity_filter_data")
    public BaseModuleDesc activityFilterData;
    @SerializedName("card_scenes")
    public CardScenes cardScenes;
    @SerializedName("filter_data")
    public FilterGroup filterData;
    @SerializedName("activity_filter_list")
    public List<FilterGroup> filterList;
    @SerializedName("filter_style")
    public int filterStyle;
    @SerializedName("isDisplay")
    private int isDisplay;
    @SerializedName("filter_groups")
    public List<FilterGroup> middleFilter;
    @SerializedName("sort_groups")
    public List<SortItem> sortList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class FilterGroup implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("code")
        public String code;
        @SerializedName("display_style")
        public int displayStyle;
        @SerializedName("items")
        public List<FilterItem> favourItems = new ArrayList();
        @SerializedName("group_title")
        public String groupTitle;
        @SerializedName("support_multi_choice")
        public int supportMultiChoice;
        @SerializedName("type")
        public int type;

        /* compiled from: ProGuard */
        @Keep
        /* loaded from: classes5.dex */
        public static class FilterItem implements Serializable {
            public static ChangeQuickRedirect changeQuickRedirect;
            @SerializedName("bg_url")
            public String backgroundUrl;
            @SerializedName("bubble_info")
            public BubbleInfoBean bubbleInfo;
            @SerializedName("code")
            public String code;
            @SerializedName("group_code")
            public String groupCode;
            @SerializedName("name")
            public String name;
            @SerializedName("remarks")
            public String remarks;
            @SerializedName("type")
            public int type;
            @SerializedName(RemoteMessageConst.Notification.ICON)
            public String url;
        }
    }

    public FilterConditionResponse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52f767fcd479d48a2ce25fa6e2c01b30", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52f767fcd479d48a2ce25fa6e2c01b30");
        } else {
            this.isDisplay = 0;
        }
    }

    public boolean hasValuedFilterData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "472691c73e8c135dadccc2d2a08b4328", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "472691c73e8c135dadccc2d2a08b4328")).booleanValue() : com.sankuai.shangou.stone.util.a.a(this.sortList, this.middleFilter, getFilterList()) || hasCouponFilterData();
    }

    public boolean hasCouponFilterData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f59def651d6758e4203dd8081abbb042", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f59def651d6758e4203dd8081abbb042")).booleanValue() : (this.activityFilterData == null || this.activityFilterData.jsonData == null || this.activityFilterData.jsonData.get("activity_list") == null) ? false : true;
    }

    public List<FilterGroup> getFilterList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e19a7cf6c75de58b04aa4f74f3b3e553", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e19a7cf6c75de58b04aa4f74f3b3e553");
        }
        if (this.filterStyle == 1 && this.filterData == null) {
            return com.sankuai.shangou.stone.util.a.d(this.filterData);
        }
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) this.filterList)) {
            return this.filterList;
        }
        if (this.filterData != null) {
            return com.sankuai.shangou.stone.util.a.d(this.filterData);
        }
        return null;
    }

    public boolean isDisplayFilter() {
        return this.isDisplay == 1;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "325317e756760eb301330ab182122024", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "325317e756760eb301330ab182122024");
        }
        return "FilterConditionResponse{, middleFilter=" + this.middleFilter + ", isDisplay=" + this.isDisplay + '}';
    }
}

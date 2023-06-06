package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.store.search.statistics.StatisticsEntity;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class OverPageFilterGroup extends StatisticsEntity implements Serializable {
    public static final int OVER_PAGE_SHOW_TYPE_ICON = 1;
    public static final int OVER_PAGE_SHOW_TYPE_TEXT = 2;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("filter_items")
    public List<GuidedItem> filterItems;
    @SerializedName(RemoteMessageConst.Notification.ICON)
    public String icon;
    @SerializedName("index")
    public int index;
    @SerializedName("recommend_type")
    public int recommendType;
    @SerializedName("show_type")
    public int showType;
    @SerializedName("title")
    public String title;
}

package com.sankuai.waimai.business.page.kingkong.future.tabfeed;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.page.home.model.AdditionTabs;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class FkkTabItem implements Serializable {
    public static final int FEED_LIST_TAB = 3;
    public static final int NEARBY_POI_LIST_TAB = 0;
    public static final int NEAR_POILIST_TAB_INDEX = 0;
    public static final int SELF_DELIVERY_TAB = 1;
    public static final int TEMPLATE_TYPE_MAX = 3;
    public static final int TEMPLATE_TYPE_MIN = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("attract_content")
    public String attractContent;
    @SerializedName("attract_pic")
    public String attractPic;
    @SerializedName("bubble_info")
    public AdditionTabs.AdditionTabBudbble bubbleInfo;
    @SerializedName("click_title_icon")
    public String clickTitleIcon;
    @SerializedName("interval")
    public int interval;
    @SerializedName("name")
    public String name;
    @SerializedName("template_type")
    public int templateType;
    @SerializedName("title_icon")
    public String titleIcon;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class AdditionTabBudbble implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("name")
        public String name;
    }
}

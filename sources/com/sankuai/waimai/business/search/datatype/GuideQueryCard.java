package com.sankuai.waimai.business.search.datatype;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GuideQueryCard implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("guided_query_v2_list")
    public List<GuideQuery> guidedQueryV2List;
    @SerializedName("guided_query_v2_tab_list")
    public List<TabGuideQuery> guidedQueryV2TabList;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static final class GuideQuery implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("guided_type")
        public String guidedType;
        public boolean isExposed = false;
        @SerializedName("label")
        public String label;
        @SerializedName("query_pic")
        public String queryPic;
        @SerializedName("search_query")
        public String searchQuery;
        @SerializedName("show_query")
        public String showQuery;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static final class TabGuideQuery implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("tab")
        public String tab;
        @SerializedName("tabSecondSearchQuery")
        public List<GuideQuery> tabSecondSearchQueryList;
    }
}

package com.sankuai.waimai.store.drug.search.common.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.waimai.store.search.statistics.StatisticsEntity;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class NoResultNonDeliveryEntity extends StatisticsEntity implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("explain_text")
    public String explain_text;
    public boolean isMeiShiButtonExposed;
    public boolean isMeiShiLabelExposed;
    public boolean isPaotuiExposed;
    public boolean isShangjiaExposed;
    @SerializedName("only_recommend_remind_context")
    public String nonResultNonDeliveryContext;
    @SerializedName("only_recommend_remind_icon")
    public String nonResultNonDeliveryIcon;
    @SerializedName("only_recommend_remind_sub_context")
    public String nonResultNonDeliverySubContext;
    @SerializedName("recommend_entry")
    private List<PaotuiRecommendEntrance> recommendEntry;
    @SerializedName("search_button")
    public SearchButton searchButton;
    @SerializedName("search_found_word_list")
    private List<SearchHotLabel> searchHotLabels;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class PaotuiRecommendEntrance implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("background_pic")
        public String backgroundPic;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("scheme_context")
        public String schemeContext;
        @SerializedName("title")
        public String title;
        @SerializedName("title_icon")
        public String titleIcon;
        @SerializedName("type")
        public int type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SearchButton implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("text")
        public String text;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SearchHotLabel implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("index")
        public int index;
        @SerializedName("jump_scheme")
        public String jumpScheme;
        @SerializedName("label_name")
        public String labelName;
    }

    public NoResultNonDeliveryEntity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "885f0b9c9cb393bcf07d2f12dafd1905", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "885f0b9c9cb393bcf07d2f12dafd1905");
            return;
        }
        this.isMeiShiButtonExposed = false;
        this.isMeiShiLabelExposed = false;
        this.isPaotuiExposed = false;
        this.isShangjiaExposed = false;
    }

    public List<PaotuiRecommendEntrance> getRecommendEntry() {
        return this.recommendEntry;
    }

    public List<SearchHotLabel> getSearchHotLabels() {
        return this.searchHotLabels;
    }
}

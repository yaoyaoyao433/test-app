package com.sankuai.waimai.store.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class GlobalSearchExtraInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Deprecated
    public ExpAbInfo expAbInfo;
    @SerializedName("exp_ab_info")
    public Map<String, String> expAbInfoMap;
    @SerializedName("floating_info")
    public List<FloatingInfo> floatingInfoList;
    @SerializedName("has_result")
    public boolean hasResult;
    @SerializedName("search_sidebar")
    public SearchSidebarDrugIm mSearchSidebarDrugIm;
    @SerializedName("maicai_support_classify")
    public String maiCaiSupportClassify;
    @SerializedName("maicai_support_level")
    public String maiCaiSupportLevel;
    @SerializedName("more_param")
    public String moreParam;
    @SerializedName("paotui_channel")
    public String paotuiChannel;
    @SerializedName("questionnaire_info")
    public Questionnaire questionnaire;
    @SerializedName("search_log_Id")
    public String searchLogId;
    @SerializedName("query_in_search_bar")
    public String searchQuery;
    @SerializedName("trace_info")
    public String searchTraceInfo;
    @SerializedName("tgt_stids")
    public String tgt_stids;
    @SerializedName("filter_bar_use_new_style")
    public boolean useNewFilterbar;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class CardMsg implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("exposurePos")
        public Integer exposurePos;
        @SerializedName("projectId")
        public String projectId;
        @SerializedName("queryChangeCnt")
        public Integer queryChangeCnt;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("skipText")
        public String skipText;
        @SerializedName("surveyId")
        private Integer surveyId;
        @SerializedName("surveyName")
        private String surveyName;
        @SerializedName("text")
        public String text;
        @SerializedName("viewProject")
        private Integer viewProject;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static final class Config implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("noresult")
        public int noresultThreshold;
        @SerializedName("change_n_keyword")
        public int searchTimesThreshold;
        @SerializedName("slider_to_n")
        public int slideToThreshold;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static final class FloatingInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("card_msg")
        public String cardMsg;
        @SerializedName("location")
        public Integer location;
        @SerializedName("template_id")
        public String templateId;
        @SerializedName("type")
        public Integer type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static final class QuestionnaireExtraInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("change_n_keyword")
        public TextContent mTextContentChange;
        @SerializedName("noresult")
        public TextContent mTextContentNoResult;
        @SerializedName("slider_to_n")
        public TextContent mTextContentSlide;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static final class Scene implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("noresult")
        public String noresultId;
        @SerializedName("change_n_keyword")
        public String searchTimesId;
        @SerializedName("slider_to_n")
        public String slideToId;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class SearchSidebarDrugIm implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(RemoteMessageConst.Notification.ICON)
        public String icon;
        @SerializedName("index")
        public int index;
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String scheme;
        @SerializedName("type")
        public int type;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static final class TextContent implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("sub_text")
        public String subText;
        @SerializedName("text")
        public String text;
    }

    public String getFeedbackUrl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a69185b5eb0961f3098638cccde49b9", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a69185b5eb0961f3098638cccde49b9") : this.questionnaire != null ? this.questionnaire.feedbackUrl : "";
    }

    public Config getQuestionnaireConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d12c2ce027718289d1c49e4469e58329", RobustBitConfig.DEFAULT_VALUE)) {
            return (Config) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d12c2ce027718289d1c49e4469e58329");
        }
        if (this.questionnaire != null) {
            return this.questionnaire.config;
        }
        return null;
    }

    public Scene getQuestionnaireScene() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "49b8b9b72255b1361093bc92a1b20f43", RobustBitConfig.DEFAULT_VALUE)) {
            return (Scene) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "49b8b9b72255b1361093bc92a1b20f43");
        }
        if (this.questionnaire != null) {
            return this.questionnaire.scene;
        }
        return null;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class Questionnaire implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("questionnaire_opportunity_config")
        private Config config;
        @SerializedName("questionnaire_url")
        private String feedbackUrl;
        @SerializedName("questionnaire_opportunity_to_extra_info")
        public QuestionnaireExtraInfo mQuestionnaireExtraInfo;
        @SerializedName("questionnaire_opportunity_to_scene")
        private Scene scene;
    }
}

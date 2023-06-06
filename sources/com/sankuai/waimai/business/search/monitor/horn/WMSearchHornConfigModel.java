package com.sankuai.waimai.business.search.monitor.horn;

import android.support.annotation.Keep;
import com.dianping.util.h;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class WMSearchHornConfigModel {
    private static final String TAG = "WMSearchHornConfigModel";
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("bid_validate_rules")
    public Map<String, List<Rule>> bidValidateRules;
    @SerializedName("enabled")
    public boolean enabled;
    @SerializedName("recommended_success_bids")
    public String[] recommendedSuccessBids;
    @SerializedName("recommend_template_ids")
    public String[] recommendedTemplateIDs;
    @SerializedName("related_success_bids")
    public String[] relatedSuccessBids;
    @SerializedName("success_sample_rate")
    public float successSampleRate;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class Rule {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("key")
        public String key;
        @SerializedName("ruleType")
        public int ruleType;
        @SerializedName("rules")
        public Map<String, Object> rules;
        @SerializedName("type")
        public String type;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public float getSuccessSampleRate() {
        return this.successSampleRate;
    }

    public String[] getRecommendedTemplateIDs() {
        return this.recommendedTemplateIDs != null ? this.recommendedTemplateIDs : new String[0];
    }

    public String[] getRelatedSuccessBids() {
        return this.relatedSuccessBids != null ? this.relatedSuccessBids : new String[0];
    }

    public String[] getRecommendedSuccessBids() {
        return this.recommendedSuccessBids != null ? this.recommendedSuccessBids : new String[0];
    }

    public Map<String, List<Rule>> getBidValidateRules() {
        return this.bidValidateRules;
    }

    public static WMSearchHornConfigModel deserialize(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7ef9d09d92ac98ee614bf32f09e5801f", RobustBitConfig.DEFAULT_VALUE)) {
            return (WMSearchHornConfigModel) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7ef9d09d92ac98ee614bf32f09e5801f");
        }
        try {
            return (WMSearchHornConfigModel) new Gson().fromJson(str, (Class<Object>) WMSearchHornConfigModel.class);
        } catch (Exception e) {
            h.d(TAG, e.getMessage());
            return null;
        }
    }
}

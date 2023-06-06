package com.sankuai.waimai.alita.alitarule;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class AlitaRuleResponse {
    @SerializedName("rules")
    public List<AlitaRule> a;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public static class AlitaRule {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("ruleDetail")
        public String ruleDetail;
        @SerializedName("ruleId")
        public String ruleId;
        @SerializedName("status")
        public String status;
        @SerializedName("version")
        public String version;

        public Map<String, Object> getRuleDetail() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c561cfc6c43e329b3b12737f1cbe07f6", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c561cfc6c43e329b3b12737f1cbe07f6");
            }
            HashMap hashMap = new HashMap();
            if (TextUtils.isEmpty(this.ruleDetail)) {
                return hashMap;
            }
            try {
                return (Map) new Gson().fromJson(this.ruleDetail, (Class<Object>) Map.class);
            } catch (Exception unused) {
                return hashMap;
            }
        }
    }
}

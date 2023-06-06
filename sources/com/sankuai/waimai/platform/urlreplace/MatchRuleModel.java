package com.sankuai.waimai.platform.urlreplace;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class MatchRuleModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("match")
    public String match;
    @SerializedName("replace")
    public a replaceRule;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        @SerializedName(NetLogConstants.Details.SCHEME)
        public String a;
        @SerializedName("host")
        public String b;
        @SerializedName("path")
        public String c;
        @SerializedName("param")
        public Map<String, String> d;
    }
}

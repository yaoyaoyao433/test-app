package com.meituan.android.common.metricx.sliver;

import android.text.TextUtils;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class SliverConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long anrThrehold;
    public boolean anrTraceEnable;
    public boolean enable;
    public long sampleOtherThrehold;
    public long sampleSelfThrehold;

    public SliverConfig(String str) {
        this.enable = false;
        this.anrTraceEnable = false;
        this.sampleSelfThrehold = 50L;
        this.sampleOtherThrehold = 1000L;
        this.anrThrehold = MetricsAnrManager.ANR_THRESHOLD;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.enable = jSONObject.optBoolean("enable", false);
                this.anrTraceEnable = jSONObject.optBoolean("anrTraceEnable", false);
                this.sampleOtherThrehold = jSONObject.optLong("sampleOtherThrehold", this.sampleOtherThrehold);
                this.sampleSelfThrehold = jSONObject.optLong("sampleSelfThrehold", this.sampleSelfThrehold);
                this.anrThrehold = jSONObject.optLong("anrThrehold", this.anrThrehold);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        if (Metrics.debug) {
            this.enable = true;
        }
    }
}

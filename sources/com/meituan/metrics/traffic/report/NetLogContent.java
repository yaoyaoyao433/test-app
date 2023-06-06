package com.meituan.metrics.traffic.report;

import android.support.annotation.Keep;
import com.meituan.android.common.metricx.utils.ILogger;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NetLogContent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private JSONObject details;
    private Map<String, Object> env;
    private Map<String, Object> tags;

    public NetLogContent(Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d766be2e9304191e1339d7b7c57510f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d766be2e9304191e1339d7b7c57510f");
            return;
        }
        this.env = builder.env;
        this.tags = builder.tags;
        this.details = builder.details;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "092a025a392add5977ab5c473b41ede2", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "092a025a392add5977ab5c473b41ede2");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("env", new JSONObject(this.env));
            jSONObject.put("tags", new JSONObject(this.tags));
            jSONObject.put("details", this.details);
        } catch (Throwable th) {
            ILogger metricxLogger = Logger.getMetricxLogger();
            metricxLogger.e("netLogContent toString failed: " + th.getMessage(), th);
        }
        return jSONObject.toString();
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private JSONObject details;
        private Map<String, Object> env;
        private Map<String, Object> tags;

        public Builder env(Map<String, Object> map) {
            this.env = map;
            return this;
        }

        public Builder tags(Map<String, Object> map) {
            this.tags = map;
            return this;
        }

        public Builder details(JSONObject jSONObject) {
            this.details = jSONObject;
            return this;
        }

        public NetLogContent build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3c52fce372e781bf406475b67e73a6a", RobustBitConfig.DEFAULT_VALUE) ? (NetLogContent) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3c52fce372e781bf406475b67e73a6a") : new NetLogContent(this);
        }
    }
}

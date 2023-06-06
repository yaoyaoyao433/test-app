package com.sankuai.waimai.store.platform.domain.core.base;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.util.i;
import java.io.Serializable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class BaseDataResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("api_response_extra_info")
    public ApiResponseExtraInfo apiExtra;
    @SerializedName("degrade_info")
    public DegradeInfo degradeInfo;
    @SerializedName("trace_id")
    public String traceId;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ApiResponseExtraInfo implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("rec_trace_info")
        public String recTraceInfo;
        @SerializedName("api_stids")
        public String stids;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class DegradeInfo implements Serializable {
        public static final int TYPE_DEGRADE_RETRY = 2;
        public static ChangeQuickRedirect changeQuickRedirect = null;
        private static final long serialVersionUID = 1915425103728870265L;
        @SerializedName("common_api_path")
        public String commonApiPath;
        @SerializedName("response_type")
        public int responseType;
    }

    public String getStids() {
        return this.apiExtra == null ? "" : this.apiExtra.stids;
    }

    public String getTraceId() {
        return this.traceId == null ? "" : this.traceId;
    }

    public String getTraceInfo() {
        return (this.apiExtra == null || this.apiExtra.recTraceInfo == null) ? "-999" : this.apiExtra.recTraceInfo;
    }

    public void parseBaseData(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bfc9e669de8d02fa00474df8ebe59c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bfc9e669de8d02fa00474df8ebe59c9");
        } else if (jSONObject == null) {
        } else {
            this.apiExtra = (ApiResponseExtraInfo) i.a().fromJson(jSONObject.optString("api_response_extra_info"), (Class<Object>) ApiResponseExtraInfo.class);
            this.degradeInfo = (DegradeInfo) i.a().fromJson(jSONObject.optString("degrade_info"), (Class<Object>) DegradeInfo.class);
            this.traceId = jSONObject.optString("trace_id");
        }
    }

    public DegradeInfo getDegradeInfo() {
        return this.degradeInfo;
    }
}

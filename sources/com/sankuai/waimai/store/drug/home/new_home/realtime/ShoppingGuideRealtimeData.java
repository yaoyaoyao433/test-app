package com.sankuai.waimai.store.drug.home.new_home.realtime;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes5.dex */
public class ShoppingGuideRealtimeData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("api_response_extra_info")
    public ApiResponseExtraInfo extraInfo;
    @SerializedName("json_data")
    public Map<String, Object> jsonData;
    @SerializedName("template_id")
    public String templateId;
    @SerializedName("trace_id")
    public String traceId;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes5.dex */
    public static class ApiResponseExtraInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("api_stids")
        public String stid;
    }
}

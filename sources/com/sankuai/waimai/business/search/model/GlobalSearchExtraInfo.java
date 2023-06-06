package com.sankuai.waimai.business.search.model;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class GlobalSearchExtraInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("exp_ab_info")
    public Map<String, String> expAbInfo;
    @SerializedName("more_param")
    public String moreParam;
    @SerializedName("paotui_channel")
    public String paotuiChannel;
    @SerializedName("search_log_Id")
    public String searchLogId;
    @SerializedName("trace_info")
    public String searchTraceInfo;
    @SerializedName("tgt_stids")
    public String tgt_stids;
    @SerializedName("search_trace_info")
    public Map<Integer, String> traceInfo;
}

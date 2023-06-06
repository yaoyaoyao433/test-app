package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.actions.SearchIntents;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.asl.annotation.constrains.Pattern;
import com.sankuai.asl.annotation.constrains.Required;
import com.sankuai.titans.config.annotation.TitansConfig;
import java.util.List;
/* compiled from: ProGuard */
@TitansConfig(key = "report")
/* loaded from: classes4.dex */
public class Report {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("devices")
    @Expose
    public List<String> devices;
    @SerializedName("dns")
    @Expose
    @Pattern(message = "内部页面仅支持填写 Host, 不得包含协议头或者 path", regexp = "^([a-zA-Z0-9][a-zA-Z0-9\\-]*)(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]*)+(\\:\\d+)$")
    public List<String> dns;
    @SerializedName("offline")
    @Expose
    public List<OfflineReport> offline;
    @SerializedName(SearchIntents.EXTRA_QUERY)
    @Required(message = "\b页面参数白名单 必填")
    @Expose
    public List<String> query;
}

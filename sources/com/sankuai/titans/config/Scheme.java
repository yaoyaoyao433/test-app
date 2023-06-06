package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.asl.annotation.constrains.Required;
import com.sankuai.titans.config.annotation.TitansConfig;
import java.util.List;
/* compiled from: ProGuard */
@TitansConfig(key = NetLogConstants.Details.SCHEME)
/* loaded from: classes4.dex */
public class Scheme {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ehwebview")
    @Expose
    private List<String> ehwebview;
    @SerializedName("white")
    @Required(message = "scheme协议白名单 必填")
    @Expose
    private List<String> white;

    public List<String> getWhite() {
        return this.white;
    }

    public List<String> getEhwebview() {
        return this.ehwebview;
    }
}

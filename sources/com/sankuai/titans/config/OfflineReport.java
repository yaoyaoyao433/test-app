package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.asl.annotation.constrains.Pattern;
import com.sankuai.asl.annotation.constrains.Required;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OfflineReport {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("name")
    @Required(message = "单元名称 必填")
    @Expose
    public String name;
    @SerializedName("url")
    @Required(message = "完整 URL 必填")
    @Expose
    @Pattern(message = "需要以 http/https 开头", regexp = "^http")
    public String url;
}

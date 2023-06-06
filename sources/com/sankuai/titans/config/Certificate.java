package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.asl.annotation.constrains.Pattern;
import com.sankuai.asl.annotation.constrains.Required;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class Certificate {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("domain")
    @Required(message = "域名必填")
    @Expose
    @Pattern(message = "域名不得包含协议，且需要完整的 Host + path", regexp = "^([a-zA-Z0-9][a-zA-Z0-9\\-]*)(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]*)+(\\:\\d+)?(\\/[a-zA-Z0-9][a-zA-Z0-9\\-]*)*$")
    public String domain;
    @SerializedName("expires")
    @Required(message = "截止日期必填")
    @Expose
    @Pattern(message = "截止日期日期格式为 MMMM-DD-YY", regexp = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$")
    public String expires;
}

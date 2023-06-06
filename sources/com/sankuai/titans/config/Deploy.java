package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.asl.annotation.constrains.Pattern;
import com.sankuai.asl.annotation.constrains.Required;
import com.sankuai.titans.config.annotation.TitansConfig;
import java.util.List;
/* compiled from: ProGuard */
@TitansConfig(key = "deploy")
/* loaded from: classes4.dex */
public class Deploy {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("white")
    @Required(message = "下载许可白名单 必填")
    @Expose
    @Pattern(message = "下载许可白名单 仅支持填写 Host, 不得包含协议头或者 path", regexp = "^[a-zA-Z0-9][a-zA-Z0-9\\-]*(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]*)+(\\:\\d+)$")
    public List<String> white;
}

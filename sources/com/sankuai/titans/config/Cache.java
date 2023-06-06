package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.asl.annotation.constrains.Required;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.titans.config.annotation.TitansConfig;
import java.util.List;
/* compiled from: ProGuard */
@TitansConfig(key = "cache")
/* loaded from: classes4.dex */
public class Cache {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(KNBConfig.CONFIG_CLEAR_CACHE)
    @Required(message = "清理内核版本 必填")
    @Expose
    public List<String> clear;
    @SerializedName(KNBConfig.CONFIG_CLEAR_FILE_LIST)
    @Expose
    public List<String> clearFileList;
    @SerializedName("customKey")
    @Required(message = "清理内容 必填")
    @Expose
    public String customKey;
}

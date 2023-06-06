package com.sankuai.titans.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.titans.config.annotation.TitansConfig;
import java.util.List;
/* compiled from: ProGuard */
@TitansConfig(key = "plugin")
/* loaded from: classes4.dex */
public class Plugin {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("blackList")
    @Expose
    private List<String> blackList;

    public List<String> getBlackList() {
        return this.blackList;
    }
}

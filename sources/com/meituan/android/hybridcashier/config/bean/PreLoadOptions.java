package com.meituan.android.hybridcashier.config.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.neohybrid.core.config.PreLoadConfig;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PreLoadOptions implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName(PreLoadConfig.PRELOAD_DELAY)
    private long preloadDelay;
    @SerializedName("enable_preload")
    private boolean preloadEnabled;
    @SerializedName("preload_path")
    private String preloadPath;
    @SerializedName("enable_preload_used")
    private boolean preloadUsedEnabled;

    public boolean isPreloadEnabled() {
        return this.preloadEnabled;
    }

    public boolean isPreloadUsedEnabled() {
        return this.preloadUsedEnabled;
    }

    public String getPreloadPath() {
        return this.preloadPath;
    }

    public long getPreloadDelay() {
        return this.preloadDelay;
    }
}

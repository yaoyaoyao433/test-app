package com.dianping.titans.offline.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class OfflineHornConfigEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("blackList")
    @Expose
    private List<String> blackList;
    @SerializedName("config")
    @Expose
    private List<OfflineHornConfig> configList;
    @SerializedName("looperTime")
    @Expose
    private int looperTime;
    @SerializedName("presetConfig")
    @Expose
    public List<PresetConfig> presetConfig;

    public final List<OfflineHornConfig> getConfigList() {
        return this.configList;
    }

    public final List<String> getBlackList() {
        return this.blackList;
    }

    public final void setConfigList(List<OfflineHornConfig> list) {
        this.configList = list;
    }

    public final int getLooperTime() {
        return this.looperTime;
    }

    public final void setLooperTime(int i) {
        this.looperTime = i;
    }
}

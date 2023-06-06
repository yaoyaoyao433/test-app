package com.sankuai.meituan.android.knb.config;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.sniffer.db.SnifferDBHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.meituan.android.knb.KNBConfigEntity;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class BridgeConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("green")
    @KNBConfigEntity.TiledConfig(name = KNBConfig.CONFIG_BRIDGE_GREEN)
    @Expose
    public List<String> green;
    @SerializedName(SnifferDBHelper.COLUMN_LOG)
    @Expose
    public BridgeLog log;
    @SerializedName("white")
    @Expose
    public List<String> white;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class BridgeLog {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("rate")
        @Expose
        public float rate;
    }
}

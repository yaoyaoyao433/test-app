package com.meituan.android.hybridcashier.config.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class HybridCashierGlobalConfig implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("disable_downgrade_reload")
    private boolean disableDowngradeReLoad;
    @SerializedName("disable_hook_feature")
    private boolean disableHookFeature;
    @SerializedName("enable_nsf_saved")
    private boolean enableNsfSaved;

    public boolean isDisableHookFeature() {
        return this.disableHookFeature;
    }

    public boolean isDisableDowngradeReLoad() {
        return this.disableDowngradeReLoad;
    }

    public boolean isEnableNsfSaved() {
        return this.enableNsfSaved;
    }
}

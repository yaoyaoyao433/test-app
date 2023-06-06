package com.meituan.android.hybridcashier.config.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.neohybrid.core.config.LoadingConfig;
import com.meituan.android.neohybrid.util.gson.annotation.JsonCheck;
import com.meituan.android.neohybrid.util.gson.annotation.Required;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
@JsonCheck
/* loaded from: classes2.dex */
public class NeoConfigurations implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("breathe_options")
    private BreatheOptions breatheOptions;
    @SerializedName("enable_check_upsepay_status")
    private Boolean enableCheckUpsePayStatus;
    @SerializedName("enable_neo_bridge")
    private Boolean enableNeoBridge;
    @SerializedName("enable_neo_prerender_bridge")
    private boolean enableNeoPrerenderBridge;
    @SerializedName("enable_neo_request_bridge")
    private Boolean enableNeoRequestBridge;
    @SerializedName("enable_preset_bundle")
    private Boolean enablePresetBundle;
    @SerializedName(LoadingConfig.LOADING_ENABLED)
    @Required
    private Boolean loadingEnable;
    @SerializedName("nsr_options")
    private NSROptions nsrOptions;
    @SerializedName("preload_options")
    private PreLoadOptions preLoadOptions;
    @SerializedName("ssr_options")
    private SSROptions ssrOptions;

    public boolean isLoadingEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cf927cd8e851d2391d9cd25c7aa95f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cf927cd8e851d2391d9cd25c7aa95f8")).booleanValue();
        }
        if (this.loadingEnable == null) {
            return false;
        }
        return this.loadingEnable.booleanValue();
    }

    public NSROptions getNsrOptions() {
        return this.nsrOptions;
    }

    public PreLoadOptions getPreLoadOptions() {
        return this.preLoadOptions;
    }

    public SSROptions getSsrOptions() {
        return this.ssrOptions;
    }

    public BreatheOptions getBreatheOptions() {
        return this.breatheOptions;
    }

    public boolean isEnableNeoBridge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "de8b9bd783e068cd6a24577fc44c1fb2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "de8b9bd783e068cd6a24577fc44c1fb2")).booleanValue();
        }
        if (this.enableNeoBridge == null) {
            return false;
        }
        return this.enableNeoBridge.booleanValue();
    }

    public boolean isEnableNeoPrerenderBridge() {
        return this.enableNeoPrerenderBridge;
    }

    public boolean isEnableNeoRequestBridge() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe0787d301a61eb7698e3976147ed587", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe0787d301a61eb7698e3976147ed587")).booleanValue();
        }
        if (this.enableNeoRequestBridge == null) {
            return false;
        }
        return this.enableNeoRequestBridge.booleanValue();
    }

    public boolean isEnableCheckUpsePayStatus() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "deef60184a9ff848bfd85767d8604bcd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "deef60184a9ff848bfd85767d8604bcd")).booleanValue();
        }
        if (this.enableCheckUpsePayStatus == null) {
            return false;
        }
        return this.enableCheckUpsePayStatus.booleanValue();
    }

    public boolean isEnablePresetBundle() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fa9c9f263f1ce90e3044369b1108da5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fa9c9f263f1ce90e3044369b1108da5")).booleanValue();
        }
        if (this.enablePresetBundle == null) {
            return false;
        }
        return this.enablePresetBundle.booleanValue();
    }
}

package com.meituan.android.neohybrid.core.horn.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.neohybrid.core.horn.options.NeoOfflineOptions;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class NeoHornConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("disable_over_scroll")
    private boolean disableOverScroll;
    @SerializedName("enable_combine_dispatcher_request")
    private boolean enableCombineDispatcherRequest;
    @SerializedName("enable_hybrid_host_switch")
    private boolean enableHybridHostSwitch;
    @SerializedName("enable_point_report")
    private boolean enablePointReport;
    @SerializedName("enable_request_without_nb_container")
    private boolean enableRequestWithoutNBContainer;
    @SerializedName("enable_use_hybrid_dispatcher")
    private boolean enableUseHybridDispatcher;
    @SerializedName("enable_web_view_create_hook")
    private boolean enableWebViewCreateHook;
    @SerializedName("offline_options")
    private NeoOfflineOptions neoOfflineOptions;
    @SerializedName("recreate_options")
    private String reCreateOptions;
    @SerializedName("render_process_gone_options")
    private String renderProcessGoneOptions;
    @SerializedName("ssr_use_new_api")
    private boolean ssrUseNewApi;

    public boolean isDisableOverScroll() {
        return this.disableOverScroll;
    }

    public NeoOfflineOptions getNeoOfflineOptions() {
        return this.neoOfflineOptions;
    }

    public boolean isEnableHybridHostSwitch() {
        return this.enableHybridHostSwitch;
    }

    public boolean isEnablePointReport() {
        return this.enablePointReport;
    }

    public String getReCreateOptions() {
        return this.reCreateOptions;
    }

    public boolean isSsrUseNewApi() {
        return this.ssrUseNewApi;
    }

    public boolean isEnableWebViewCreateHook() {
        return this.enableWebViewCreateHook;
    }

    public String getRenderProcessGoneOptions() {
        return this.renderProcessGoneOptions;
    }

    public boolean isEnableCombineDispatcherRequest() {
        return this.enableCombineDispatcherRequest;
    }

    public boolean isEnableUseHybridDispatcher() {
        return this.enableUseHybridDispatcher;
    }

    public boolean isEnableRequestWithoutNBContainer() {
        return this.enableRequestWithoutNBContainer;
    }
}

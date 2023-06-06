package com.meituan.android.cashier.oneclick.hybrid;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.neohybrid.core.config.LoadingConfig;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OneClickHornConfig implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1494502258928782721L;
    @SerializedName("base64_split_length")
    private int base64SplitLength;
    @SerializedName("capture_when_app_back2home")
    private boolean captureWhenAppBack2home;
    @SerializedName("wasai_check_md5")
    private boolean checkMd5;
    @SerializedName("check_webview_wasm_support")
    private boolean checkWebviewWasmSupport;
    @SerializedName("downgrade_hybrid_to_old_flow")
    private boolean downgradeByHybridToOldFlow;
    @SerializedName("downgrade_wasai_to_hybrid")
    private boolean downgradeWasaiToHybrid;
    @SerializedName("downgrade_wasai_to_hybrid_when_ddd_or_so_error")
    private boolean downgradeWasaiToHybridWhenDddOrSoError;
    @SerializedName("hybrid_dialog_path")
    private String hybridDialogPath;
    @SerializedName(LoadingConfig.LOADING_DURATION)
    private long loadingDuration;
    @SerializedName("bitmap_scale_size")
    private int snapshotScaleSize;
    @SerializedName("use_wasai")
    private boolean useWasai;
    @SerializedName("wasai_dialog_default_version")
    private String wasaiDialogDefaultVersion;
    @SerializedName("wasai_dialog_path")
    private String wasaiDialogPath;
    @SerializedName("web_unavailable_timeout")
    private long webUnavailableTimeout;

    public String getHybridDialogPath() {
        return this.hybridDialogPath;
    }

    public boolean isDowngradeByHybridToOldFlow() {
        return this.downgradeByHybridToOldFlow;
    }

    public long getLoadingDuration() {
        return this.loadingDuration;
    }

    public long getWebUnavailableTimeout() {
        return this.webUnavailableTimeout;
    }

    public String getWasaiDialogPath() {
        return this.wasaiDialogPath;
    }

    public String getWasaiDialogDefaultVersion() {
        return this.wasaiDialogDefaultVersion;
    }

    public boolean isUseWasai() {
        return this.useWasai;
    }

    public boolean isDowngradeWasaiToHybrid() {
        return this.downgradeWasaiToHybrid;
    }

    public boolean isDowngradeWasaiToHybridWhenDddOrSoError() {
        return this.downgradeWasaiToHybridWhenDddOrSoError;
    }

    public boolean isCheckMd5() {
        return this.checkMd5;
    }

    public void setCheckMd5(boolean z) {
        this.checkMd5 = z;
    }

    public boolean isCaptureWhenAppBack2home() {
        return this.captureWhenAppBack2home;
    }

    public void setCaptureWhenAppBack2home(boolean z) {
        this.captureWhenAppBack2home = z;
    }

    public int getBase64SplitLength() {
        return this.base64SplitLength;
    }

    public void setBase64SplitLength(int i) {
        this.base64SplitLength = i;
    }

    public int getSnapshotScaleSize() {
        return this.snapshotScaleSize;
    }

    public void setSnapshotScaleSize(int i) {
        this.snapshotScaleSize = i;
    }

    public boolean isCheckWebviewWasmSupport() {
        return this.checkWebviewWasmSupport;
    }

    public void setCheckWebviewWasmSupport(boolean z) {
        this.checkWebviewWasmSupport = z;
    }
}

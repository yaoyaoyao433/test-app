package com.meituan.android.hybridcashier.config.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.neohybrid.util.gson.annotation.ArrayCheck;
import com.meituan.android.neohybrid.util.gson.annotation.FailedType;
import com.meituan.android.neohybrid.util.gson.annotation.JsonCheck;
import com.meituan.android.neohybrid.util.gson.annotation.Range;
import com.meituan.android.neohybrid.util.gson.annotation.Required;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
@JsonCheck(failedType = FailedType.NULL)
/* loaded from: classes2.dex */
public class CaptureOptions {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("capture_button_list")
    @ArrayCheck
    private List<String> captureButtonList;
    @SerializedName("enable_capture")
    @Required
    private boolean captureEnable;
    @SerializedName("enable_gzip")
    @Required
    private boolean captureGZipEnable;
    @SerializedName("capture_height")
    @Required
    @Range(max = Integer.MAX_VALUE)
    private int captureHeight;
    @SerializedName("enable_webview_back_button_capture")
    private boolean captureOnWebViewBackButtonsEnable;
    @SerializedName("capture_quality")
    @Required
    @Range(max = 100)
    private int captureQuality;
    @SerializedName("capture_width")
    @Required
    @Range(max = Integer.MAX_VALUE)
    private int captureWidth;
    @SerializedName("enable_continuous_capture")
    private boolean continuousCaptureEnable;
    @SerializedName("continuous_capture_pixel")
    private int continuousCapturePixel;

    public boolean isCaptureEnable() {
        return this.captureEnable;
    }

    public boolean isCaptureGZipEnable() {
        return this.captureGZipEnable;
    }

    public int getCaptureWidth() {
        return this.captureWidth;
    }

    public int getCaptureHeight() {
        return this.captureHeight;
    }

    public int getCaptureQuality() {
        return this.captureQuality;
    }

    public boolean isCaptureOnWebViewBackButtonsEnable() {
        return this.captureOnWebViewBackButtonsEnable;
    }

    public List<String> getCaptureButtonList() {
        return this.captureButtonList;
    }

    public boolean isContinuousCaptureEnable() {
        return this.continuousCaptureEnable;
    }

    public int getContinuousCapturePixel() {
        return this.continuousCapturePixel;
    }
}

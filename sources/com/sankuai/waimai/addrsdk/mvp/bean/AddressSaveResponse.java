package com.sankuai.waimai.addrsdk.mvp.bean;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class AddressSaveResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("address_view_id")
    private String addressViewId;
    @SerializedName("extra")
    private String extra;
    @SerializedName("prompt_info")
    private PromptInfo promptInfo;
    @SerializedName("success_tip")
    private String successTip;

    public String getAddressViewId() {
        return this.addressViewId;
    }

    public void setAddressViewId(String str) {
        this.addressViewId = str;
    }

    public String getSuccessTip() {
        return this.successTip;
    }

    public void setSuccessTip(String str) {
        this.successTip = str;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public PromptInfo getPromptInfo() {
        return this.promptInfo;
    }

    public void setPromptInfo(PromptInfo promptInfo) {
        this.promptInfo = promptInfo;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class PromptInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("cancel_button_text")
        private String cancelButtonText;
        @SerializedName("confirm_button_text")
        private String confirmButtonText;
        @SerializedName("prompt_text")
        private String promptText;

        public String getCancelButtonText() {
            return this.cancelButtonText;
        }

        public void setCancelButtonText(String str) {
            this.cancelButtonText = str;
        }

        public String getConfirmButtonText() {
            return this.confirmButtonText;
        }

        public void setConfirmButtonText(String str) {
            this.confirmButtonText = str;
        }

        public String getPromptText() {
            return this.promptText;
        }

        public void setPromptText(String str) {
            this.promptText = str;
        }
    }
}

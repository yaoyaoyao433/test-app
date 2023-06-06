package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class NoPasswordGuide implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3298835566124867653L;
    @SerializedName("cancel_button")
    private String cancelText;
    @SerializedName("open_button")
    private String confirmText;
    @SerializedName("credit")
    private int credit;
    @SerializedName("agreement_name")
    private String protocolText;
    @SerializedName("agreement_tip")
    private String protocolTip;
    @SerializedName("agreement_url")
    private String protocolUrl;
    @SerializedName("submit_url")
    private String submitUrl;
    @SerializedName("guide_tip")
    private String tip;
    @SerializedName("guide_title")
    private String title;

    public int getCredit() {
        return this.credit;
    }

    public void setCredit(int i) {
        this.credit = i;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getProtocolTip() {
        return this.protocolTip;
    }

    public void setProtocolTip(String str) {
        this.protocolTip = str;
    }

    public String getProtocolText() {
        return this.protocolText;
    }

    public void setProtocolText(String str) {
        this.protocolText = str;
    }

    public String getProtocolUrl() {
        return this.protocolUrl;
    }

    public void setProtocolUrl(String str) {
        this.protocolUrl = str;
    }

    public String getCancelText() {
        return this.cancelText;
    }

    public void setCancelText(String str) {
        this.cancelText = str;
    }

    public String getConfirmText() {
        return this.confirmText;
    }

    public void setConfirmText(String str) {
        this.confirmText = str;
    }

    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }

    public String getTip() {
        return this.tip;
    }

    public void setTip(String str) {
        this.tip = str;
    }
}

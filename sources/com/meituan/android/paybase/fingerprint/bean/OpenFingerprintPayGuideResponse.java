package com.meituan.android.paybase.fingerprint.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OpenFingerprintPayGuideResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -414527825388026322L;
    @SerializedName("agreement_name")
    private String agreementName;
    @SerializedName("agreement_url")
    private String agreementUrl;
    @SerializedName("cancel_button")
    private String cancelButtonText;
    @SerializedName("finger_type")
    private int fingerType;
    @SerializedName("open_button")
    private String openButtonText;
    @SerializedName("page_tip")
    private String pageTip;
    @SerializedName("page_title")
    private String pageTitle;

    public String getPageTitle() {
        return this.pageTitle;
    }

    public String getPageTip() {
        return this.pageTip;
    }

    public String getCancelButtonText() {
        return this.cancelButtonText;
    }

    public String getOpenButtonText() {
        return this.openButtonText;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
    }

    public void setPageTip(String str) {
        this.pageTip = str;
    }

    public void setCancelButtonText(String str) {
        this.cancelButtonText = str;
    }

    public void setOpenButtonText(String str) {
        this.openButtonText = str;
    }

    public int getFingerType() {
        return this.fingerType;
    }

    public void setFingerType(int i) {
        this.fingerType = i;
    }

    public String getAgreementName() {
        return this.agreementName;
    }

    public void setAgreementName(String str) {
        this.agreementName = str;
    }

    public String getAgreementUrl() {
        return this.agreementUrl;
    }

    public void setAgreementUrl(String str) {
        this.agreementUrl = str;
    }
}

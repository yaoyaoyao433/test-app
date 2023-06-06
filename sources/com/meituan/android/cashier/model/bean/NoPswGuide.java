package com.meituan.android.cashier.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class NoPswGuide implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2517619846875636369L;
    @SerializedName("agreement_name")
    private String agreeName;
    @SerializedName("agreement_tip")
    private String agreeTip;
    @SerializedName("agreement_url")
    private String agreementUrl;
    @SerializedName("cancel_button")
    private String cancleButton;
    @SerializedName("description")
    private String description;
    @SerializedName("guide_title")
    private String guideTitle;
    @SerializedName("open_button")
    private String openButton;
    @SerializedName("submit_url")
    private String submitUrl;

    public String getAgreementUrl() {
        return this.agreementUrl;
    }

    public void setAgreementUrl(String str) {
        this.agreementUrl = str;
    }

    public String getAgreeName() {
        return this.agreeName;
    }

    public void setAgreeName(String str) {
        this.agreeName = str;
    }

    public String getAgreeTip() {
        return this.agreeTip;
    }

    public void setAgreeTip(String str) {
        this.agreeTip = str;
    }

    public String getCancleButton() {
        return this.cancleButton;
    }

    public void setCancleButton(String str) {
        this.cancleButton = str;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public String getGuideTitle() {
        return this.guideTitle;
    }

    public void setGuideTitle(String str) {
        this.guideTitle = str;
    }

    public String getOpenButton() {
        return this.openButton;
    }

    public void setOpenButton(String str) {
        this.openButton = str;
    }

    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }
}

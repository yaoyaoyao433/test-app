package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.desk.component.bean.precomponent.AdjustCreditGuide;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CheckPayPassword implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7677847824864678992L;
    @SerializedName("adjust_nopassword_credit")
    private AdjustCreditGuide adjustCreditGuide;
    @SerializedName("forgetEntry")
    private String forgetEntry;
    @SerializedName("nopasswordguide")
    private NoPasswordGuide noPasswordGuide;
    @SerializedName("page_subtip")
    private String pageSubtip;
    @SerializedName("page_tip")
    private String pageTip;
    @SerializedName("page_title")
    private String pageTitle;
    @SerializedName("page_type")
    private int pageType;
    @SerializedName("submit_url")
    private String submitUrl;

    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
    }

    public String getForgetEntry() {
        return this.forgetEntry;
    }

    public void setForgetEntry(String str) {
        this.forgetEntry = str;
    }

    public int getPageType() {
        return this.pageType;
    }

    public void setPageType(int i) {
        this.pageType = i;
    }

    public String getPageTip() {
        return this.pageTip;
    }

    public void setPageTip(String str) {
        this.pageTip = str;
    }

    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }

    public String getPageSubtip() {
        return this.pageSubtip;
    }

    public void setPageSubtip(String str) {
        this.pageSubtip = str;
    }

    public NoPasswordGuide getNoPasswordGuide() {
        return this.noPasswordGuide;
    }

    public void setNoPasswordGuide(NoPasswordGuide noPasswordGuide) {
        this.noPasswordGuide = noPasswordGuide;
    }

    public AdjustCreditGuide getAdjustCreditGuide() {
        return this.adjustCreditGuide;
    }

    public void setAdjustCreditGuide(AdjustCreditGuide adjustCreditGuide) {
        this.adjustCreditGuide = adjustCreditGuide;
    }
}

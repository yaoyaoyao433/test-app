package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.setpassword.CancelAlert;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class SetPasswordProcessInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8861235020199968429L;
    @SerializedName("cancel_alert")
    private CancelAlert cancelAlert;
    @SerializedName("guide_sub_tip")
    private String guideSubTip;
    @SerializedName("guide_title")
    private String guideTitle;
    private boolean isShowAlready;
    @SerializedName("page_sub_tip")
    private String pageSubTip;
    @SerializedName("page1_tip")
    private SetPasswordPageInfo pageTip1;
    @SerializedName("page2_tip")
    private SetPasswordPageInfo pageTip2;
    @SerializedName("page_title")
    private String pageTitle;

    public SetPasswordProcessInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9dbdfaab089afd8ff76de3c819a342a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9dbdfaab089afd8ff76de3c819a342a");
        } else {
            this.isShowAlready = false;
        }
    }

    public CancelAlert getCancelAlert() {
        return this.cancelAlert;
    }

    public void setCancelAlert(CancelAlert cancelAlert) {
        this.cancelAlert = cancelAlert;
    }

    public SetPasswordPageInfo getPageTip1() {
        return this.pageTip1;
    }

    public void setPageTip1(SetPasswordPageInfo setPasswordPageInfo) {
        this.pageTip1 = setPasswordPageInfo;
    }

    public SetPasswordPageInfo getPageTip2() {
        return this.pageTip2;
    }

    public void setPageTip2(SetPasswordPageInfo setPasswordPageInfo) {
        this.pageTip2 = setPasswordPageInfo;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
    }

    public String getPageSubTip() {
        return this.pageSubTip;
    }

    public void setPageSubTip(String str) {
        this.pageSubTip = str;
    }

    public String getGuideTitle() {
        return this.guideTitle;
    }

    public void setGuideTitle(String str) {
        this.guideTitle = str;
    }

    public String getGuideSubTip() {
        return this.guideSubTip;
    }

    public void setGuideSubTip(String str) {
        this.guideSubTip = str;
    }

    public boolean isShowAlready() {
        return this.isShowAlready;
    }

    public void setShowAlready(boolean z) {
        this.isShowAlready = z;
    }
}

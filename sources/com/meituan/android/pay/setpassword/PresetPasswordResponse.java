package com.meituan.android.pay.setpassword;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PresetPasswordResponse implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4629323898328391030L;
    private CancelAlert cancelAlert;
    private String message;
    private String nextPageTip;
    private String nextSubPageTip;
    private String pageTip;
    private String subPageTip;
    private String submitText;
    private String submitUrl;
    private String title;
    private String warnDes;

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public String getPageTip() {
        return this.pageTip;
    }

    public void setPageTip(String str) {
        this.pageTip = str;
    }

    public String getNextPageTip() {
        return this.nextPageTip;
    }

    public void setNextPageTip(String str) {
        this.nextPageTip = str;
    }

    public String getWarnDes() {
        return this.warnDes;
    }

    public void setWarnDes(String str) {
        this.warnDes = str;
    }

    public String getSubPageTip() {
        return this.subPageTip;
    }

    public void setSubPageTip(String str) {
        this.subPageTip = str;
    }

    public String getNextSubPageTip() {
        return this.nextSubPageTip;
    }

    public void setNextSubPageTip(String str) {
        this.nextSubPageTip = str;
    }

    public String getSubmitText() {
        return this.submitText;
    }

    public void setSubmitText(String str) {
        this.submitText = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public CancelAlert getCancelAlert() {
        return this.cancelAlert;
    }

    public void setCancelAlert(CancelAlert cancelAlert) {
        this.cancelAlert = cancelAlert;
    }

    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }
}

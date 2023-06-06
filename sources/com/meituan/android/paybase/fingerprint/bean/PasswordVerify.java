package com.meituan.android.paybase.fingerprint.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PasswordVerify implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2547048498311381034L;
    @SerializedName("entry_text")
    private String entryText;
    @SerializedName("page_title")
    private String pageTitle;
    @SerializedName("pay_button")
    private String payButton;
    @SerializedName("verify_type")
    private int verifyType;

    public int getVerifyType() {
        return this.verifyType;
    }

    public void setVerifyType(int i) {
        this.verifyType = i;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public void setPageTitle(String str) {
        this.pageTitle = str;
    }

    public String getPayButton() {
        return this.payButton;
    }

    public void setPayButton(String str) {
        this.payButton = str;
    }

    public String getEntryText() {
        return this.entryText;
    }

    public void setEntryText(String str) {
        this.entryText = str;
    }
}

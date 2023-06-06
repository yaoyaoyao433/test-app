package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class AdjustNoPasswordCredit implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 924243176872132820L;
    @SerializedName("adjust_button")
    private String adjustButton;
    @SerializedName("cancel_button")
    private String cancelButton;
    @SerializedName("credit_default")
    private int creditDefault;
    @SerializedName("credit_now")
    private String creditNow;
    @SerializedName("credit_opt")
    private int[] creditOpt;
    @SerializedName("submit_url")
    private String submitUrl;
    @SerializedName("guide_tip")
    private String tip;
    @SerializedName("guide_title")
    private String title;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String getTip() {
        return this.tip;
    }

    public void setTip(String str) {
        this.tip = str;
    }

    public int getCreditDefault() {
        return this.creditDefault;
    }

    public void setCreditDefault(int i) {
        this.creditDefault = i;
    }

    public int[] getCreditOpt() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c77a10c844496b1c1aa989d84da256e", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c77a10c844496b1c1aa989d84da256e");
        }
        if (this.creditOpt != null) {
            return (int[]) this.creditOpt.clone();
        }
        return null;
    }

    public void setCreditOpt(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40f7fd3830557c3f3fbc0ee4666f6ab3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40f7fd3830557c3f3fbc0ee4666f6ab3");
        } else {
            this.creditOpt = (int[]) iArr.clone();
        }
    }

    public String getCancelButton() {
        return this.cancelButton;
    }

    public void setCancelButton(String str) {
        this.cancelButton = str;
    }

    public String getAdjustButton() {
        return this.adjustButton;
    }

    public void setAdjustButton(String str) {
        this.adjustButton = str;
    }

    public String getSubmitUrl() {
        return this.submitUrl;
    }

    public void setSubmitUrl(String str) {
        this.submitUrl = str;
    }

    public String getCreditNow() {
        return this.creditNow;
    }

    public void setCreditNow(String str) {
        this.creditNow = str;
    }
}

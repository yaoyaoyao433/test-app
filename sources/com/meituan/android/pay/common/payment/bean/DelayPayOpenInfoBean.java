package com.meituan.android.pay.common.payment.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class DelayPayOpenInfoBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 3763229262785876562L;
    @SerializedName("cancel_button_name")
    private String cancelButtonName;
    @SerializedName("confirm_button_name")
    private String confirmButtonName;
    @SerializedName("contract_prefix")
    private String contractPrefix;
    @SerializedName("contract_summarize")
    private String contractSummarize;
    private List<Contracts> contracts;
    @SerializedName("img_url")
    private String imgUrl;
    @SerializedName("main_title")
    private String mainTitle;
    @SerializedName("sub_title")
    private String subtitle;

    public String getMainTitle() {
        return this.mainTitle;
    }

    public void setMainTitle(String str) {
        this.mainTitle = str;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setImgUrl(String str) {
        this.imgUrl = str;
    }

    public String getContractPrefix() {
        return this.contractPrefix;
    }

    public void setContractPrefix(String str) {
        this.contractPrefix = str;
    }

    public String getContractSummarize() {
        return this.contractSummarize;
    }

    public void setContractSummarize(String str) {
        this.contractSummarize = str;
    }

    public String getConfirmButtonName() {
        return this.confirmButtonName;
    }

    public void setConfirmButtonName(String str) {
        this.confirmButtonName = str;
    }

    public String getCancelButtonName() {
        return this.cancelButtonName;
    }

    public void setCancelButtonName(String str) {
        this.cancelButtonName = str;
    }

    public List<Contracts> getContracts() {
        return this.contracts;
    }

    public void setContracts(List<Contracts> list) {
        this.contracts = list;
    }
}

package com.meituan.android.pay.common.payment.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Contracts implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -893560370853717477L;
    @SerializedName("contract_title")
    private String contractTitle;
    @SerializedName("contract_url")
    private String contractUrl;

    public String getContractTitle() {
        return this.contractTitle;
    }

    public void setContractTitle(String str) {
        this.contractTitle = str;
    }

    public String getContractUrl() {
        return this.contractUrl;
    }

    public void setContractUrl(String str) {
        this.contractUrl = str;
    }
}

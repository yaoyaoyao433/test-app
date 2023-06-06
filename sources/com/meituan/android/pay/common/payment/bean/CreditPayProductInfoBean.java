package com.meituan.android.pay.common.payment.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CreditPayProductInfoBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7475505711808575499L;
    @SerializedName("prompt_text")
    private String promptText;
    @SerializedName("service_provider_desc")
    private String serviceProviderDesc;

    public String getPromptText() {
        return this.promptText;
    }

    public void setPromptText(String str) {
        this.promptText = str;
    }

    public String getServiceProviderDesc() {
        return this.serviceProviderDesc;
    }

    public void setServiceProviderDesc(String str) {
        this.serviceProviderDesc = str;
    }
}

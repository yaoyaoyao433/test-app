package com.meituan.android.hybridcashier.downgrade;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class DowngradeBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 173635608834464037L;
    @SerializedName("cashier_type")
    private String cashierType;
    private String degradeMessage;
    @SerializedName("degrade_url")
    private String degradeUrl;

    public String getCashierType() {
        return this.cashierType;
    }

    public String getDegradeUrl() {
        return this.degradeUrl;
    }

    public void setCashierType(String str) {
        this.cashierType = str;
    }

    public void setDegradeUrl(String str) {
        this.degradeUrl = str;
    }

    public String getDegradeMessage() {
        return this.degradeMessage;
    }

    public void setDegradeMessage(String str) {
        this.degradeMessage = str;
    }
}

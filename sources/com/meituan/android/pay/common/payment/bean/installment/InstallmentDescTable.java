package com.meituan.android.pay.common.payment.bean.installment;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class InstallmentDescTable implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 9147562899075186225L;
    @SerializedName("annualized_rate")
    private String annualizedRate;
    @SerializedName("fee_rate")
    private String feeRate;
    private String period;

    public void setPeriod(String str) {
        this.period = str;
    }

    public String getPeriod() {
        return this.period;
    }

    public void setFeeRate(String str) {
        this.feeRate = str;
    }

    public String getFeeRate() {
        return this.feeRate;
    }

    public void setAnnualizedRate(String str) {
        this.annualizedRate = str;
    }

    public String getAnnualizedRate() {
        return this.annualizedRate;
    }
}

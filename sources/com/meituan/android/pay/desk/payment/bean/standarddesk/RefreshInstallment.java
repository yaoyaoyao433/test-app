package com.meituan.android.pay.desk.payment.bean.standarddesk;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.payment.bean.installment.Installment;
import com.meituan.android.pay.common.payment.bean.installment.InstallmentRateDescBean;
import com.meituan.android.pay.common.promotion.bean.Agreement;
import com.meituan.android.pay.common.promotion.bean.CombineLabel;
import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class RefreshInstallment implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7956893816216300515L;
    @SerializedName("common_agreements")
    private Agreement commonAgreement;
    @SerializedName("installment_info")
    private Installment installment;
    @SerializedName("installment_rate_desc")
    private InstallmentRateDescBean installmentRateDescBean;
    @SerializedName("installment_available_flag")
    private int isSupportInstallment;
    @SerializedName("labels")
    private List<CombineLabel> labels;
    @SerializedName("pay_type")
    private String payType;
    @SerializedName("discounts")
    private PaymentReduce paymentReduce;
    @SerializedName("installment_non_available_reason")
    private String unsupportedInstallmentReason;

    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String str) {
        this.payType = str;
    }

    public InstallmentRateDescBean getInstallmentRateDescBean() {
        return this.installmentRateDescBean;
    }

    public void setInstallmentRateDescBean(InstallmentRateDescBean installmentRateDescBean) {
        this.installmentRateDescBean = installmentRateDescBean;
    }

    public int getIsSupportInstallment() {
        return this.isSupportInstallment;
    }

    public void setIsSupportInstallment(int i) {
        this.isSupportInstallment = i;
    }

    public String getUnsupportedInstallmentReason() {
        return this.unsupportedInstallmentReason;
    }

    public void setUnsupportedInstallmentReason(String str) {
        this.unsupportedInstallmentReason = str;
    }

    public Installment getInstallment() {
        return this.installment;
    }

    public void setInstallment(Installment installment) {
        this.installment = installment;
    }

    public PaymentReduce getPaymentReduce() {
        return this.paymentReduce;
    }

    public void setPaymentReduce(PaymentReduce paymentReduce) {
        this.paymentReduce = paymentReduce;
    }

    public List<CombineLabel> getLabels() {
        return this.labels;
    }

    public void setLabels(List<CombineLabel> list) {
        this.labels = list;
    }

    public Agreement getCommonAgreement() {
        return this.commonAgreement;
    }

    public void setCommonAgreement(Agreement agreement) {
        this.commonAgreement = agreement;
    }
}

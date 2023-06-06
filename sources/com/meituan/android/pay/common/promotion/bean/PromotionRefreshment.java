package com.meituan.android.pay.common.promotion.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.payment.bean.installment.Installment;
import com.meituan.android.pay.common.payment.bean.installment.InstallmentRateDescBean;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PromotionRefreshment implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5079111840460688447L;
    @SerializedName("calculate_promo_info")
    private ArrayList<PromotionInfo> calculatePromotionInfo;
    @SerializedName("common_agreements")
    private Agreement commonAgreement;
    @SerializedName("installment_info")
    private Installment installmentInfo;
    @SerializedName("installment_rate_desc")
    private InstallmentRateDescBean installmentRateDescBean;
    @SerializedName("installment_available_flag")
    private int isSupportInstallment;
    @SerializedName("pay_type")
    private String payType;
    @SerializedName("installment_non_available_reason")
    private String unsupportedInstallmentReason;

    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String str) {
        this.payType = str;
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

    public Installment getInstallmentInfo() {
        return this.installmentInfo;
    }

    public void setInstallmentInfo(Installment installment) {
        this.installmentInfo = installment;
    }

    public InstallmentRateDescBean getInstallmentRateDescBean() {
        return this.installmentRateDescBean;
    }

    public void setInstallmentRateDescBean(InstallmentRateDescBean installmentRateDescBean) {
        this.installmentRateDescBean = installmentRateDescBean;
    }

    public Agreement getCommonAgreement() {
        return this.commonAgreement;
    }

    public void setCommonAgreement(Agreement agreement) {
        this.commonAgreement = agreement;
    }

    public ArrayList<PromotionInfo> getCalculatePromotionInfo() {
        return this.calculatePromotionInfo;
    }

    public void setCalculatePromotionInfo(ArrayList<PromotionInfo> arrayList) {
        this.calculatePromotionInfo = arrayList;
    }
}

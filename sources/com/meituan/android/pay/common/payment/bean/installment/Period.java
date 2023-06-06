package com.meituan.android.pay.common.payment.bean.installment;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Period implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5337913153859313956L;
    @SerializedName("annualized_rate_info")
    private String annualizedRateInfo;
    private String content;
    @SerializedName("coupons")
    private List<PeriodCoupon> coupons;
    @SerializedName("discount_amount")
    private float discountAmount;
    @SerializedName(DMKeys.KEY_SELECTED)
    private boolean isSelected;
    private int period;
    @SerializedName("price_id")
    private String priceId;
    @SerializedName("principal_amount")
    private float principalAmount;
    @SerializedName("repay_amount")
    private float repayAmount;
    @SerializedName("service_fee")
    private float serviceFee;
    private String title;
    @SerializedName("total_repay_amount")
    private float totalRepayAmount;

    public float getTotalRepayAmount() {
        return this.totalRepayAmount;
    }

    public void setTotalRepayAmount(float f) {
        this.totalRepayAmount = f;
    }

    public String getPriceId() {
        return this.priceId;
    }

    public void setPriceId(String str) {
        this.priceId = str;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public int getPeriod() {
        return this.period;
    }

    public void setPeriod(int i) {
        this.period = i;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }

    public float getRepayAmount() {
        return this.repayAmount;
    }

    public void setRepayAmount(float f) {
        this.repayAmount = f;
    }

    public float getServiceFee() {
        return this.serviceFee;
    }

    public void setServiceFee(float f) {
        this.serviceFee = f;
    }

    public float getPrincipalAmount() {
        return this.principalAmount;
    }

    public void setPrincipalAmount(float f) {
        this.principalAmount = f;
    }

    public float getDiscountAmount() {
        return this.discountAmount;
    }

    public void setDiscountAmount(float f) {
        this.discountAmount = f;
    }

    public List<PeriodCoupon> getCoupons() {
        return this.coupons;
    }

    public void setCoupons(List<PeriodCoupon> list) {
        this.coupons = list;
    }

    public String getAnnualizedRateInfo() {
        return this.annualizedRateInfo;
    }

    public void setAnnualizedRateInfo(String str) {
        this.annualizedRateInfo = str;
    }
}

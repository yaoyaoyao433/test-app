package com.meituan.android.pay.common.payment.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class FinanceServiceBean extends MTPayment {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2508216548367146348L;
    @SerializedName("credit_pay_product_info")
    private CreditPayProductInfoBean creditProductInfo;
    private boolean folded;

    public boolean isFolded() {
        return this.folded;
    }

    public void setFolded(boolean z) {
        this.folded = z;
    }

    public CreditPayProductInfoBean getCreditProductInfo() {
        return this.creditProductInfo;
    }

    public void setCreditProductInfo(CreditPayProductInfoBean creditPayProductInfoBean) {
        this.creditProductInfo = creditPayProductInfoBean;
    }
}

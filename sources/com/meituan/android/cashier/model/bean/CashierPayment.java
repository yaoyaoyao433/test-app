package com.meituan.android.cashier.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.desk.payment.bean.standarddesk.WalletPayment;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CashierPayment extends WalletPayment {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8791374637381283250L;
    @SerializedName("banklist_page")
    private BankListPage bankListPage;
    private boolean folded;
    @SerializedName("no_promo_info")
    private String noPromoInfo;
    @SerializedName("support_interrupt")
    private boolean supportInterrupt;

    public boolean isSupportInterrupt() {
        return this.supportInterrupt;
    }

    public void setSupportInterrupt(boolean z) {
        this.supportInterrupt = z;
    }

    public boolean isFolded() {
        return this.folded;
    }

    public void setFolded(boolean z) {
        this.folded = z;
    }

    public BankListPage getBankListPage() {
        return this.bankListPage;
    }

    public void setBankListPage(BankListPage bankListPage) {
        this.bankListPage = bankListPage;
    }

    public String getNoPromoInfo() {
        return this.noPromoInfo;
    }

    public void setNoPromoInfo(String str) {
        this.noPromoInfo = str;
    }
}

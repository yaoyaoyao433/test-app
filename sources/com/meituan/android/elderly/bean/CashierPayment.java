package com.meituan.android.elderly.bean;

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
    @SerializedName("no_promo_info")
    private String noPromoInfo;

    public String getNoPromoInfo() {
        return this.noPromoInfo;
    }

    public void setNoPromoInfo(String str) {
        this.noPromoInfo = str;
    }
}

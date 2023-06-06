package com.meituan.android.cashier.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CashierInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5641009440287621547L;
    @SerializedName("common")
    private Cashier common;
    @SerializedName("wallet")
    private Cashier wallet;

    public Cashier getCommon() {
        return this.common;
    }

    public void setCommon(Cashier cashier) {
        this.common = cashier;
    }

    public Cashier getWallet() {
        return this.wallet;
    }

    public void setWallet(Cashier cashier) {
        this.wallet = cashier;
    }
}

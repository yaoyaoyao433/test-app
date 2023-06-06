package com.meituan.android.pay.common.payment.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.payment.data.b;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class BalanceCombineDeduct implements b, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1124885975519131583L;
    private float balance;
    @SerializedName("name")
    private String deductName;
    @SerializedName("switch_status")
    private boolean isSwitchOn;
    @SerializedName("pay_type")
    private String payType;

    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String str) {
        this.payType = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.b
    public String getDeductName() {
        return this.deductName;
    }

    public void setDeductName(String str) {
        this.deductName = str;
    }

    @Override // com.meituan.android.pay.common.payment.data.b
    public boolean isSwitchOn() {
        return this.isSwitchOn;
    }

    public void setSwitchOn(boolean z) {
        this.isSwitchOn = z;
    }

    public float getBalance() {
        return this.balance;
    }

    public void setBalance(float f) {
        this.balance = f;
    }
}

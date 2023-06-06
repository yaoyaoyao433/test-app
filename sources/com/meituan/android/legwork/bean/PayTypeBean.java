package com.meituan.android.legwork.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class PayTypeBean implements Serializable {
    public static final int BALANCE_DEGRADE = 1;
    public static final int CHARGE_CAN_NOT_SHOW = 0;
    public static final int CHARGE_CAN_SHOW = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    public double balanceAmount;
    public int balancePayDegrade;
    public String getAmountErrorText;
    public int orderPayType;
    public double orderTotal;
    public String payTypePopText;
    public int rechargePageSwitch;

    public boolean isBalanceDegrade() {
        return this.balancePayDegrade == 1;
    }

    public boolean isChargeShow() {
        return this.rechargePageSwitch == 1;
    }

    public void translateToOnlineBean(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "300c07a72044fa5b1a06c92c1129ce06", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "300c07a72044fa5b1a06c92c1129ce06");
            return;
        }
        this.orderTotal = d;
        this.orderPayType = 1;
        this.balancePayDegrade = 1;
        this.rechargePageSwitch = 0;
    }

    public int getPayType() {
        if (this.orderPayType == 3) {
            return this.orderPayType;
        }
        return 1;
    }

    public boolean isBalanceSufficient(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "74b79974988c46fddae34677c7ff1632", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "74b79974988c46fddae34677c7ff1632")).booleanValue() : this.balanceAmount >= d;
    }
}

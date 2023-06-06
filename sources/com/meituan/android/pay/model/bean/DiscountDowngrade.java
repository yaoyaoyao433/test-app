package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class DiscountDowngrade implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7287351275958923633L;
    @SerializedName("money_detail")
    private List<DiscountDowngradeDetail> downgradeDetail;
    @SerializedName("promo_degrade_pay")
    private boolean isDegradePay;
    private String message;
    @SerializedName("order_money")
    private String orderMoney;

    public String getOrderMoney() {
        return this.orderMoney;
    }

    public void setOrderMoney(String str) {
        this.orderMoney = str;
    }

    public boolean isDegradePay() {
        return this.isDegradePay;
    }

    public void setDegradePay(boolean z) {
        this.isDegradePay = z;
    }

    public List<DiscountDowngradeDetail> getDowngradeDetail() {
        return this.downgradeDetail;
    }

    public void setDowngradeDetail(List<DiscountDowngradeDetail> list) {
        this.downgradeDetail = list;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}

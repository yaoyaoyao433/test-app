package com.meituan.android.hybridcashier.bridge.result;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.cashier.bridge.icashier.ICashierJSHandler;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PayResultBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("action")
    private String action;
    @SerializedName("dest_cashier_type")
    private String destCashierType;
    @SerializedName("downgrade_info")
    private String downgradeInfo;
    @SerializedName("pay_result_extra")
    private String payResultExtra;
    @SerializedName(ICashierJSHandler.KEY_PROMOTION)
    private JsonObject promotion;
    @SerializedName("source_cashier_type")
    private String sourceCashierType;
    @SerializedName("status")
    private String status;

    public String getAction() {
        return this.action;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public JsonObject getPromotion() {
        return this.promotion;
    }

    public void setPromotion(JsonObject jsonObject) {
        this.promotion = jsonObject;
    }

    public String getPayResultExtra() {
        return this.payResultExtra;
    }

    public void setPayResultExtra(String str) {
        this.payResultExtra = str;
    }

    public String getDestCashierType() {
        return this.destCashierType;
    }

    public void setDestCashierType(String str) {
        this.destCashierType = str;
    }

    public String getSourceCashierType() {
        return this.sourceCashierType;
    }

    public void setSourceCashierType(String str) {
        this.sourceCashierType = str;
    }

    public String getDowngradeInfo() {
        return this.downgradeInfo;
    }

    public void setDowngradeInfo(String str) {
        this.downgradeInfo = str;
    }
}

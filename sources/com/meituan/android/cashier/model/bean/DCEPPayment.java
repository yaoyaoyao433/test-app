package com.meituan.android.cashier.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.widgets.label.Label;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class DCEPPayment implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -9059062307371536320L;
    @SerializedName("bottomlabels")
    private ArrayList<Label> bottomLabels;
    @SerializedName("card_info")
    private CardInfo cardInfo;
    private Icon icon;
    private String name;
    @SerializedName("pay_type")
    private String payType;
    @SerializedName("discounts")
    private PaymentReduce paymentReduce;
    private boolean selected;
    private int status;
    @SerializedName("status_info")
    private String statusInfo;

    public String getPayType() {
        return this.payType;
    }

    public void setPayType(String str) {
        this.payType = str;
    }

    public Icon getIcon() {
        return this.icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public void setSelected(boolean z) {
        this.selected = z;
    }

    public String getStatusInfo() {
        return this.statusInfo;
    }

    public void setStatusInfo(String str) {
        this.statusInfo = str;
    }

    public CardInfo getCardInfo() {
        return this.cardInfo;
    }

    public void setCardInfo(CardInfo cardInfo) {
        this.cardInfo = cardInfo;
    }

    public ArrayList<Label> getBottomLabels() {
        return this.bottomLabels;
    }

    public void setBottomLabels(ArrayList<Label> arrayList) {
        this.bottomLabels = arrayList;
    }

    public PaymentReduce getPaymentReduce() {
        return this.paymentReduce;
    }

    public void setPaymentReduce(PaymentReduce paymentReduce) {
        this.paymentReduce = paymentReduce;
    }
}

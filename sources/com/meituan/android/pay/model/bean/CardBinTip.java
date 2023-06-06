package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.promotion.bean.PaymentReduce;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.android.paybase.widgets.label.Label;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CardBinTip implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7413673265959631754L;
    private String icon;
    private List<Label> labels;
    private BankLimit limit;
    private String name;
    @SerializedName("color")
    private String nameColor;
    @SerializedName("discounts")
    private PaymentReduce paymentReduce;

    public List<Label> getLabels() {
        return this.labels;
    }

    public void setLabels(List<Label> list) {
        this.labels = list;
    }

    public PaymentReduce getPaymentReduce() {
        return this.paymentReduce;
    }

    public void setPaymentReduce(PaymentReduce paymentReduce) {
        this.paymentReduce = paymentReduce;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getNameColor() {
        return this.nameColor;
    }

    public void setNameColor(String str) {
        this.nameColor = str;
    }

    public BankLimit getLimit() {
        return this.limit;
    }

    public void setLimit(BankLimit bankLimit) {
        this.limit = bankLimit;
    }
}

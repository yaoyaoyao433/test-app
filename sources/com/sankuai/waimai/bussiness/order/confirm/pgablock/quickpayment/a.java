package com.sankuai.waimai.bussiness.order.confirm.pgablock.quickpayment;

import com.google.gson.annotations.SerializedName;
import com.sankuai.waimai.business.order.submit.model.PaymentItem;
import com.sankuai.waimai.bussiness.order.confirm.model.PaymentTemplate;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a implements Serializable {
    @SerializedName("default_pay_type")
    public int a = 1;
    @SerializedName("payment_info")
    public List<PaymentItem> b;
    @SerializedName("pay_type_tip")
    public String c;
    @SerializedName("payment_template")
    public PaymentTemplate d;
}

package com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result;

import android.support.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.sankuai.waimai.business.order.submit.model.PaymentItem;
import java.io.Serializable;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PoiOrderPreviewPaymentResult implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("default_pay_type")
    public int defaultPayType = 1;
    @SerializedName("pay_type_tip")
    public String payTypeTip;
    @SerializedName("payment_detail")
    public List<PaymentItem> paymentDetail;
}

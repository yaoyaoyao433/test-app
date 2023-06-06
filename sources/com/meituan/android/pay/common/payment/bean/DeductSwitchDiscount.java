package com.meituan.android.pay.common.payment.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.promotion.bean.PayLabelConstants;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class DeductSwitchDiscount implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 4302049167687648381L;
    @SerializedName(PayLabelConstants.TYPE_REDUCE)
    private float reduce;

    public float getReduce() {
        return this.reduce;
    }

    public void setReduce(float f) {
        this.reduce = f;
    }
}

package com.meituan.android.pay.desk.component.data;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Price implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7739691170034942684L;
    private float orderPrice;
    private float realPrice;

    public float getOrderPrice() {
        return this.orderPrice;
    }

    public void setOrderPrice(float f) {
        this.orderPrice = f;
    }

    public float getRealPrice() {
        return this.realPrice;
    }

    public void setRealPrice(float f) {
        this.realPrice = f;
    }
}

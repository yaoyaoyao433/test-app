package com.meituan.android.pay.common.promotion.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class LabelAbTest implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 8924649993630704984L;
    @SerializedName("is_show_pay_reduce")
    private boolean isSaveMoneyStyle;
    @SerializedName("is_shift_multi_coupon")
    private boolean isShiftMultiCoupon;
    @SerializedName("is_show_float")
    private boolean showFloat;

    public LabelAbTest() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5504cd85bd0776b0effaffb2d0ab2fe6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5504cd85bd0776b0effaffb2d0ab2fe6");
        } else {
            this.showFloat = true;
        }
    }

    public boolean isShowFloat() {
        return this.showFloat;
    }

    public void setShowFloat(boolean z) {
        this.showFloat = z;
    }

    public boolean isSaveMoneyStyle() {
        return this.isSaveMoneyStyle;
    }

    public void setSaveMoneyStyle(boolean z) {
        this.isSaveMoneyStyle = z;
    }

    public boolean isShiftMultiCoupon() {
        return this.isShiftMultiCoupon;
    }

    public void setShiftMultiCoupon(boolean z) {
        this.isShiftMultiCoupon = z;
    }
}

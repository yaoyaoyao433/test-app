package com.meituan.android.pay.common.payment.bean.installment;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PeriodCoupon implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -4104748974150929594L;
    private String code;
    private String content;
    @SerializedName(DMKeys.KEY_SELECTED)
    private boolean isSelected;

    public String getCode() {
        return this.code;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public boolean isSelected() {
        return this.isSelected;
    }

    public void setSelected(boolean z) {
        this.isSelected = z;
    }
}

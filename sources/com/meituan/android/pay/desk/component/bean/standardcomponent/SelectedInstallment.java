package com.meituan.android.pay.desk.component.bean.standardcomponent;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.pay.common.payment.bean.installment.Period;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class SelectedInstallment implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8941015078030389667L;
    @SerializedName("installment_periods")
    private String allPeriods;
    @SerializedName("installment_period_info")
    private Period period;

    public String getAllPeriods() {
        return this.allPeriods;
    }

    public void setAllPeriods(String str) {
        this.allPeriods = str;
    }

    public Period getPeriod() {
        return this.period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}

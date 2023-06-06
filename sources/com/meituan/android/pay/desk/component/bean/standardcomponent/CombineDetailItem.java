package com.meituan.android.pay.desk.component.bean.standardcomponent;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CombineDetailItem implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8170013751975146342L;
    @SerializedName("msg")
    private String combineDetailAmount;
    @SerializedName("title")
    private String combineDetailName;

    public String getCombineDetailName() {
        return this.combineDetailName;
    }

    public void setCombineDetailName(String str) {
        this.combineDetailName = str;
    }

    public String getCombineDetailAmount() {
        return this.combineDetailAmount;
    }

    public void setCombineDetailAmount(String str) {
        this.combineDetailAmount = str;
    }
}

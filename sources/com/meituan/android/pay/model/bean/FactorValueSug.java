package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class FactorValueSug implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5676521457355963969L;
    @SerializedName("sug_text")
    private String sugText;
    @SerializedName("sug_value")
    private String sugValue;

    public String getSugText() {
        return this.sugText;
    }

    public void setSugText(String str) {
        this.sugText = str;
    }

    public String getSugValue() {
        return this.sugValue;
    }

    public void setSugValue(String str) {
        this.sugValue = str;
    }
}

package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Option implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 2383400777529104632L;
    @SerializedName("factor_display")
    private Display display;
    @SerializedName("option_value")
    private int optionValue;

    public int getOptionValue() {
        return this.optionValue;
    }

    public void setOptionValue(int i) {
        this.optionValue = i;
    }

    public Display getDisplay() {
        return this.display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}

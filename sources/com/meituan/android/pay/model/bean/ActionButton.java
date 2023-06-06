package com.meituan.android.pay.model.bean;

import com.google.gson.annotations.SerializedName;
import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class ActionButton implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6935620260540954007L;
    @SerializedName("action")
    private String buttonAction;
    @SerializedName("name")
    private String buttonName;

    public String getButtonName() {
        return this.buttonName;
    }

    public void setButtonName(String str) {
        this.buttonName = str;
    }

    public String getButtonAction() {
        return this.buttonAction;
    }

    public void setButtonAction(String str) {
        this.buttonAction = str;
    }
}

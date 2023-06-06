package com.meituan.android.cashier.model.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class Icon implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3505313307057047935L;
    private String disable;
    private String enable;

    public String getEnable() {
        return this.enable;
    }

    public void setEnable(String str) {
        this.enable = str;
    }

    public String getDisable() {
        return this.disable;
    }

    public void setDisable(String str) {
        this.disable = str;
    }
}

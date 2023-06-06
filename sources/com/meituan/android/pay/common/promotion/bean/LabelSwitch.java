package com.meituan.android.pay.common.promotion.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class LabelSwitch implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -701385423140365079L;
    private int check;

    public int getCheck() {
        return this.check;
    }

    public void setCheck(int i) {
        this.check = i;
    }
}

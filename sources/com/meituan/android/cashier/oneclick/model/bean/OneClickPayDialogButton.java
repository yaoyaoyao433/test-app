package com.meituan.android.cashier.oneclick.model.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class OneClickPayDialogButton implements Serializable {
    public static final int TYPE_DOUBLE_OPEN = 3;
    public static final int TYPE_DO_ONECLICKPAY = 4;
    public static final int TYPE_ONLY_OPEN_CREDIT_PAY = 2;
    public static final int TYPE_ONLY_OPEN_ONECLICK_PAY = 1;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6322032596192333526L;
    private String path;
    private String text;
    private int type;

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }
}

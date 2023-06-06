package com.meituan.android.cashier.bean;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class CashierProductInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -7808455358336284042L;
    private String nextReqParams;
    private String path;
    private String type;

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public String getNextReqParams() {
        return this.nextReqParams;
    }

    public void setNextReqParams(String str) {
        this.nextReqParams = str;
    }
}

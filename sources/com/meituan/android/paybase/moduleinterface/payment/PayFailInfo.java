package com.meituan.android.paybase.moduleinterface.payment;

import com.meituan.android.paybase.utils.JsonBean;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
/* compiled from: ProGuard */
@JsonBean
/* loaded from: classes2.dex */
public class PayFailInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3744297650700789141L;
    private int errorCode;
    private String errorCodeString;
    private String extra;
    private String msg;
    private String preComponentFailInfo;

    public int getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(int i) {
        this.errorCode = i;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public String getErrorCodeString() {
        return this.errorCodeString;
    }

    public void setErrorCodeString(String str) {
        this.errorCodeString = str;
    }

    public String getExtra() {
        return this.extra;
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public String getPreComponentFailInfo() {
        return this.preComponentFailInfo;
    }

    public void setPreComponentFailInfo(String str) {
        this.preComponentFailInfo = str;
    }
}

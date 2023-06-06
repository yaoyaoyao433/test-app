package com.meituan.android.customerservice.retrofit.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HttpResult<T extends Serializable> implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;
    private String control;
    private T data;
    private String errMsg;
    private String ext;
    private String page;
    private String reason;
    private boolean success;

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T t) {
        this.data = t;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }

    public String getControl() {
        return this.control;
    }

    public void setControl(String str) {
        this.control = str;
    }

    public String getExt() {
        return this.ext;
    }

    public void setExt(String str) {
        this.ext = str;
    }

    public String getPage() {
        return this.page;
    }

    public void setPage(String str) {
        this.page = str;
    }

    public String getReason() {
        return this.reason;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cbb2ea7a7d5610913465a79f55bb817", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cbb2ea7a7d5610913465a79f55bb817");
        }
        String obj = this.data != null ? this.data.toString() : "";
        return "success=" + this.success + ",code=" + this.code + ",errMsg=" + this.errMsg + ",reason=" + this.reason + ",ext=" + this.ext + ",page=" + this.page + ",control=" + this.control + " ,data=" + obj;
    }
}

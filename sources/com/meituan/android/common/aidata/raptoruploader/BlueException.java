package com.meituan.android.common.aidata.raptoruploader;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BlueException extends Exception {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected int errorType;
    protected String mErrorCode;
    protected String mErrorMsg;

    public BlueException() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8174edb8f28d168d5d87546394da9cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8174edb8f28d168d5d87546394da9cd");
            return;
        }
        this.mErrorMsg = "";
        this.mErrorCode = "-1";
        this.errorType = -1;
    }

    public BlueException(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f3efe467b82728000dae4ab55d64c825", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f3efe467b82728000dae4ab55d64c825");
            return;
        }
        this.mErrorMsg = "";
        this.mErrorCode = "-1";
        this.errorType = -1;
        this.mErrorMsg = str;
    }

    public BlueException(Throwable th, String str) {
        super(th);
        Object[] objArr = {th, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ed2e95e454d308ade036b3daf0d6db2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ed2e95e454d308ade036b3daf0d6db2");
            return;
        }
        this.mErrorMsg = "";
        this.mErrorCode = "-1";
        this.errorType = -1;
        this.mErrorCode = str;
    }

    public BlueException(Throwable th, int i) {
        super(th);
        Object[] objArr = {th, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5deec083720c05252b3f8fbd72dc672f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5deec083720c05252b3f8fbd72dc672f");
            return;
        }
        this.mErrorMsg = "";
        this.mErrorCode = "-1";
        this.errorType = -1;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        this.mErrorCode = sb.toString();
    }

    public BlueException(BlueException blueException) {
        super(blueException.getCause());
        Object[] objArr = {blueException};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e854991e7990b1fcf9ce86910bab569", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e854991e7990b1fcf9ce86910bab569");
            return;
        }
        this.mErrorMsg = "";
        this.mErrorCode = "-1";
        this.errorType = -1;
        this.mErrorCode = blueException.getErrorCode();
    }

    public BlueException(String str, String str2) {
        super(str);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "acb36d3271faec7c33ab7188938d9e70", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "acb36d3271faec7c33ab7188938d9e70");
            return;
        }
        this.mErrorMsg = "";
        this.mErrorCode = "-1";
        this.errorType = -1;
        this.mErrorMsg = str;
        this.mErrorCode = str2;
    }

    public String getErrorMsg() {
        return this.mErrorMsg;
    }

    public String getErrorCode() {
        return this.mErrorCode;
    }

    public void setErrorCode(String str) {
        this.mErrorCode = str;
    }

    public BlueException(String str, int i) {
        super(str);
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f2e0515da0cac8a59b862acbb074ab2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f2e0515da0cac8a59b862acbb074ab2");
            return;
        }
        this.mErrorMsg = "";
        this.mErrorCode = "-1";
        this.errorType = -1;
        this.mErrorMsg = str;
        this.errorType = i;
    }

    public int getErrorType() {
        return this.errorType;
    }

    @Override // java.lang.Throwable
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c38c87b8ad94ce4b2ec15cadf48b7c28", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c38c87b8ad94ce4b2ec15cadf48b7c28") : getMessage();
    }
}

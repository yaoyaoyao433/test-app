package com.meituan.android.common.aidata.ai.bundle.exception;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class BaseException extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int errorType;

    public abstract String errorDescription(int i);

    public void setErrorType(int i) {
        this.errorType = i;
    }

    public BaseException() {
    }

    public BaseException(Exception exc) {
        super(exc);
        Object[] objArr = {exc};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5b335800fc63aafc666310613a5c5467", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5b335800fc63aafc666310613a5c5467");
        }
    }

    public BaseException(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b392039245e6370912cf08d932b1ab4f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b392039245e6370912cf08d932b1ab4f");
        } else {
            this.errorType = i;
        }
    }

    public BaseException(Throwable th, int i) {
        super(th);
        Object[] objArr = {th, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fbd3b8382f384f0da2942bdc0b89bd25", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fbd3b8382f384f0da2942bdc0b89bd25");
        } else {
            this.errorType = i;
        }
    }

    public int getErrorType() {
        return this.errorType;
    }

    public String getErrorDesc() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "744017a1f2020e022a7607bd65d96448", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "744017a1f2020e022a7607bd65d96448") : errorDescription(this.errorType);
    }
}

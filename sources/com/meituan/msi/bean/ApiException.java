package com.meituan.msi.bean;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ApiException extends Exception {
    public static final int DEFAULT_CODE = 500;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int code;
    private final String msg;

    public ApiException(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ea4070376bfbea4324207accc57f83a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ea4070376bfbea4324207accc57f83a");
            return;
        }
        this.code = i;
        this.msg = str;
    }

    public ApiException(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2d60d269b9d387d40464dfedd740f064", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2d60d269b9d387d40464dfedd740f064");
            return;
        }
        this.code = 500;
        this.msg = str;
    }

    public ApiException(int i, String str, Throwable th) {
        super(str, th);
        Object[] objArr = {Integer.valueOf(i), str, th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c45b17f257af917ed7a6c8cc981472c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c45b17f257af917ed7a6c8cc981472c");
            return;
        }
        this.code = i;
        this.msg = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.msg;
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}

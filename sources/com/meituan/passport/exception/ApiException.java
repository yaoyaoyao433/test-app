package com.meituan.passport.exception;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ApiException extends IOException {
    public static final String UNKNOW_ERROR = "unKnow_exception";
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int code;
    public final String data;
    protected String extraMessage;
    protected String message;
    public final String type;

    public ApiException(String str, int i, String str2) {
        this(str, i, str2, (String) null);
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00c7bf6b42362fbf008fccff8c355b42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00c7bf6b42362fbf008fccff8c355b42");
        } else {
            this.message = str;
        }
    }

    public ApiException(String str, int i, String str2, String str3) {
        super(str);
        Object[] objArr = {str, Integer.valueOf(i), str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb516749e153d82eadc28fafd1b53d9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb516749e153d82eadc28fafd1b53d9f");
            return;
        }
        this.code = i;
        this.type = str2;
        this.data = str3;
        this.message = str;
    }

    public ApiException(String str, Throwable th, int i, String str2) {
        this(str, th, i, str2, null);
        Object[] objArr = {str, th, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bddac5489952c8953e87afc0d51c347a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bddac5489952c8953e87afc0d51c347a");
        } else {
            this.message = str;
        }
    }

    public ApiException(String str, Throwable th, int i, String str2, String str3) {
        super(str, th);
        Object[] objArr = {str, th, Integer.valueOf(i), str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce050ea911246c6619367e276b80b3d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce050ea911246c6619367e276b80b3d3");
            return;
        }
        this.code = i;
        this.type = str2;
        this.data = str3;
        this.message = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45205453180cb46879fb487de7a57fb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45205453180cb46879fb487de7a57fb1");
        }
        if (TextUtils.isEmpty(this.message)) {
            return super.getMessage();
        }
        return this.message;
    }

    public void updateMessage(String str) {
        this.message = str;
    }

    public void setExtraMessage(String str) {
        this.extraMessage = str;
    }

    public String getExtraMessage() {
        return this.extraMessage;
    }

    public String getAllMessage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aae7aeae7226eb30a89b0b37c1b7e73e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aae7aeae7226eb30a89b0b37c1b7e73e");
        }
        if (TextUtils.isEmpty(this.message)) {
            return this.extraMessage;
        }
        if (TextUtils.isEmpty(this.extraMessage)) {
            return this.message;
        }
        return this.message + this.extraMessage;
    }

    @Override // java.lang.Throwable
    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4d2bb9cc4c471474df4ecdb1b637115", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4d2bb9cc4c471474df4ecdb1b637115");
        }
        return "ApiException{code=" + this.code + ", type='" + this.type + "', data='" + this.data + "', message='" + this.message + "'}";
    }
}

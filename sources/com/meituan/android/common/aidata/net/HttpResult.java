package com.meituan.android.common.aidata.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HttpResult {
    public static final int ERROR_CODE_DEFAULT = -1;
    public static final int ERROR_CODE_RESPONSE_BODY_NULL = 3;
    public static final int ERROR_CODE_RESPONSE_CODE_NOT_200 = 2;
    public static final int ERROR_CODE_RESPONSE_NULL = 1;
    public static final String KEY_CODE = "code";
    public static final String KEY_DATA = "data";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_MSG = "msg";
    public static ChangeQuickRedirect changeQuickRedirect;
    public int code;
    public String data;
    public String msg;

    public HttpResult() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a136e2329e2e7eca9bb245ff8a316e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a136e2329e2e7eca9bb245ff8a316e0");
        } else {
            this.code = -1;
        }
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4fdf49d5c7782c39f230ddbf86edd098", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4fdf49d5c7782c39f230ddbf86edd098");
        }
        return "HttpResult{code=" + this.code + ", msg='" + this.msg + "', data='" + this.data + "'}";
    }
}

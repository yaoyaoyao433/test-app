package com.meituan.android.common.aidata.jsengine.common;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JSResult {
    public static final String KEY_CODE = "code";
    public static final String KEY_DATA = "data";
    public static final String KEY_MSG = "msg";
    public static final String KEY_SUCCESS = "isSuccess";
    public static final int RESULT_FAIL = -1;
    public static final int RESULT_OK = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;
    private Object data;
    private String msg;
    private String objectName;

    public JSResult(int i, String str, Object obj) {
        Object[] objArr = {Integer.valueOf(i), str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d7e56ab480b5fdec59a9543e01e2ef29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d7e56ab480b5fdec59a9543e01e2ef29");
            return;
        }
        this.code = -1;
        this.msg = "";
        this.code = i;
        this.msg = str;
        this.data = obj;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setData(String str) {
        this.data = str;
    }

    public void setObjectName(String str) {
        this.objectName = str;
    }

    public int getCode() {
        return this.code;
    }

    public Object getData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getObjectName() {
        return this.objectName;
    }
}

package com.meituan.android.edfu.cvlog.netservice.bean;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class ImageResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;
    private String message;
    private Object result;

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public Object getResult() {
        return this.result;
    }

    public void setResult(Object obj) {
        this.result = obj;
    }
}

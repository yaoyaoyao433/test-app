package com.meituan.android.edfu.mvex.netservice.entity.imageretrieval;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes2.dex */
public class BaseResult<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;
    private String message;
    private T result;

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

    public T getResult() {
        return this.result;
    }

    public void setResult(T t) {
        this.result = t;
    }
}

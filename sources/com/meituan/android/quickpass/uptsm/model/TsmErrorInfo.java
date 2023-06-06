package com.meituan.android.quickpass.uptsm.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class TsmErrorInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int code;
    private String message;
    private String type;

    public int getCode() {
        return this.code;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}

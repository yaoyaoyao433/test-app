package com.meituan.android.ptcommonim.bridge;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class ResponseWrapper<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public T data;
    public int status;

    public ResponseWrapper(int i, T t) {
        this.status = i;
        this.data = t;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class BaseData {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String data;
        public String message;

        public BaseData(String str, String str2) {
            this.data = str;
            this.message = str2;
        }

        public BaseData(String str) {
            this.message = str;
        }
    }
}

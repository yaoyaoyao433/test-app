package com.sankuai.titans.base.utils;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class JsCustomEvent<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String action;
    public T data;

    public JsCustomEvent(@NonNull String str, T t) {
        Object[] objArr = {str, t};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6127c7f96b15ceac4be968ecdceb1247", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6127c7f96b15ceac4be968ecdceb1247");
            return;
        }
        this.action = str;
        this.data = t;
    }

    public String getAction() {
        return this.action;
    }

    public T getData() {
        return this.data;
    }
}

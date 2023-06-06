package com.meituan.passport.pojo;

import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class BaseResult<T> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public T data;
    private int status;

    public boolean success() {
        return this.status == 1;
    }
}

package com.meituan.passport.pojo;

import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class Result {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int status;
    private int success;
    private String token;

    public boolean success() {
        return this.success == 0;
    }

    public boolean status() {
        return this.status == 1;
    }

    public String getToken() {
        return this.token;
    }
}

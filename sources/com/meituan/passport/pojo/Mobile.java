package com.meituan.passport.pojo;

import android.support.annotation.RestrictTo;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class Mobile {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String countryCode;
    public String number;

    public Mobile() {
    }

    public Mobile(String str, String str2) {
        this.number = str;
        this.countryCode = str2;
    }
}

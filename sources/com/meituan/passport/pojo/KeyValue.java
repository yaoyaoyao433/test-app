package com.meituan.passport.pojo;

import android.support.annotation.RestrictTo;
import com.meituan.passport.clickaction.d;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class KeyValue {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String key;
    public d<String> value;

    public KeyValue(String str, d<String> dVar) {
        this.key = str;
        this.value = dVar;
    }
}

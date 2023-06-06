package com.coloros.ocs.base.a;

import androidx.annotation.NonNull;
/* loaded from: classes.dex */
public final class b {
    @NonNull
    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}

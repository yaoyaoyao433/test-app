package com.airbnb.lottie.model;

import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.LruCache;
/* compiled from: ProGuard */
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class g {
    private static final g a = new g();
    private final LruCache<String, com.airbnb.lottie.e> b = new LruCache<>(10485760);

    public static g a() {
        return a;
    }

    @VisibleForTesting
    g() {
    }

    @Nullable
    public final com.airbnb.lottie.e a(String str) {
        return this.b.get(str);
    }

    public final void a(@Nullable String str, @Nullable com.airbnb.lottie.e eVar) {
        if (str == null) {
            return;
        }
        this.b.put(str, eVar);
    }
}

package com.facebook.react.bridge;

import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SoftAssertions {
    public static void assertUnreachable(String str) {
        ReactSoftException.logSoftException("SoftAssertions", new AssertionException(str));
    }

    public static void assertCondition(boolean z, String str) {
        if (z) {
            return;
        }
        ReactSoftException.logSoftException("SoftAssertions", new AssertionException(str));
    }

    public static <T> T assertNotNull(@Nullable T t) {
        if (t == null) {
            ReactSoftException.logSoftException("SoftAssertions", new AssertionException("Expected object to not be null!"));
        }
        return t;
    }
}

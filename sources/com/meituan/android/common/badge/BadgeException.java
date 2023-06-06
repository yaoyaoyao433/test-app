package com.meituan.android.common.badge;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class BadgeException extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;

    public BadgeException(String str) {
        super(str);
    }

    public BadgeException(Throwable th) {
        super(th);
    }

    public BadgeException(String str, Throwable th) {
        super(str, th);
    }
}

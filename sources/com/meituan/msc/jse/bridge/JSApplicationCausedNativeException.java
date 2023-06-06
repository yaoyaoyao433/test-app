package com.meituan.msc.jse.bridge;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class JSApplicationCausedNativeException extends RuntimeException {
    public static ChangeQuickRedirect changeQuickRedirect;

    public JSApplicationCausedNativeException(String str) {
        super(str);
    }

    public JSApplicationCausedNativeException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }
}

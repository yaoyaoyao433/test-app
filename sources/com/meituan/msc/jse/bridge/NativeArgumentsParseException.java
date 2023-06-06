package com.meituan.msc.jse.bridge;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class NativeArgumentsParseException extends JSApplicationCausedNativeException {
    public static ChangeQuickRedirect changeQuickRedirect;

    public NativeArgumentsParseException(String str) {
        super(str);
    }

    public NativeArgumentsParseException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }
}

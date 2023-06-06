package com.meituan.passport.api;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface IPassportProvider {
    boolean isDebug();

    void throwExceptionIfDebug(String str);

    void throwExceptionIfDebug(Throwable th);
}

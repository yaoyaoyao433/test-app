package com.meituan.uuid;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface UUIDEventLogProvider {
    void commonInfoReport(String str);

    void getUUIDReturnReport(String str);

    void throwableReport(Throwable th);
}

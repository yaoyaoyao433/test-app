package com.meituan.android.common.metricx.utils;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ILogger {
    void d(String str);

    void d(String str, Object... objArr);

    void dF(String str, Object... objArr);

    void dt(String str, String str2, Object... objArr);

    void e(String str);

    void e(String str, Throwable th);

    void e(String str, Object... objArr);

    void eF(String str, Object... objArr);

    void et(String str, String str2);

    void et(String str, String str2, Throwable th);

    void i(String str);

    void i(String str, Object... objArr);

    void iF(String str, Object... objArr);

    void it(String str, String str2, Object... objArr);

    void setLogLevel(int i);

    void v(String str);

    void v(String str, Object... objArr);

    void vF(String str, Object... objArr);
}

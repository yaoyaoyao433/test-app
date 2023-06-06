package com.meituan.metrics.laggy;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ThreadStackEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    public StackTraceElement[] stackTraceElements;
    public long ts;

    public ThreadStackEntity(long j, StackTraceElement[] stackTraceElementArr) {
        this.ts = j;
        this.stackTraceElements = stackTraceElementArr;
    }
}

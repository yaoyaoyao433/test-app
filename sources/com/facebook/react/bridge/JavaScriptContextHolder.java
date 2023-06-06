package com.facebook.react.bridge;

import android.support.annotation.GuardedBy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class JavaScriptContextHolder {
    @GuardedBy("this")
    private long mContext;

    public JavaScriptContextHolder(long j) {
        this.mContext = j;
    }

    @GuardedBy("this")
    public long get() {
        return this.mContext;
    }

    public synchronized void clear() {
        this.mContext = 0L;
    }
}

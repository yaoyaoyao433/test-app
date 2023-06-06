package com.meituan.android.privacy.interfaces;

import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.WorkerThread;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface c {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface a {
        int a();

        long b();

        long c();

        String d();

        @Nullable
        String e();

        @Nullable
        String f();
    }

    @AnyThread
    long a(@NonNull String str);

    @WorkerThread
    a b(@NonNull String str);
}

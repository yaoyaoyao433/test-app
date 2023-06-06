package com.jakewharton.rxbinding.internal;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.Keep;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class MainThreadSubscription implements Runnable, k {
    private static final Handler a = new Handler(Looper.getMainLooper());
    private static final AtomicIntegerFieldUpdater<MainThreadSubscription> b = AtomicIntegerFieldUpdater.newUpdater(MainThreadSubscription.class, "unsubscribed");
    @Keep
    private volatile int unsubscribed;
}

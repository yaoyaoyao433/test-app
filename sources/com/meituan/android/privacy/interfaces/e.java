package com.meituan.android.privacy.interfaces;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.AnyThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.annotation.WorkerThread;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface e {
    @WorkerThread
    int a(@Nullable Context context, String str, String str2);

    @WorkerThread
    int a(@Nullable Context context, String str, String str2, boolean z);

    @UiThread
    void a(@NonNull Activity activity, String str, String str2, d dVar);

    @AnyThread
    void a(@Nullable Context context, String str, String str2, @NonNull d dVar);

    @AnyThread
    void a(@NonNull Context context, boolean z);

    @AnyThread
    void a(@NonNull String str, @NonNull d dVar);

    boolean a(@NonNull Context context);

    @AnyThread
    boolean a(@NonNull Context context, @NonNull aa aaVar);
}

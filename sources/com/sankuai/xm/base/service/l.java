package com.sankuai.xm.base.service;

import android.content.Context;
import android.support.annotation.CheckResult;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import com.sankuai.xm.base.util.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface l {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a<T> extends c<T> {
        @CheckResult
        a<T> a();

        @CheckResult
        a<T> a(@IntRange(from = 0) int i);

        @CheckResult
        a<T> a(Context context);

        @CheckResult
        a<T> a(short s);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b<T> extends d<T> {
        @CheckResult
        b<T> a(short... sArr);

        @CheckResult
        b<T> b();

        @CheckResult
        b<T> c();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface c<T> {
        void a(T t);

        void b(T t);

        boolean d();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface d<T> {
        void a(b.a<T> aVar);
    }

    @NonNull
    <T> a<T> a(@NonNull Class<T> cls);

    @NonNull
    <T> a<T> a(@NonNull String str);

    @NonNull
    <T> b<T> b(@NonNull Class<T> cls);

    @NonNull
    <T> b<T> b(String str);
}

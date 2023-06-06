package com.sankuai.xm.base.service;

import android.content.Context;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public interface c {

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface a<T> extends InterfaceC1374c<T> {
        @CheckResult
        a<T> a();

        @CheckResult
        a<T> a(Context context);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface b<T> {
        void a(T t);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.xm.base.service.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public interface InterfaceC1374c<T> {
        void a(com.sankuai.xm.base.callback.c<T> cVar);

        void b(com.sankuai.xm.base.callback.c<T> cVar);

        boolean b();
    }

    @NonNull
    <T> b<T> a(String str);

    <T> void a(T t);

    @NonNull
    <T> a<T> a_(Class<T> cls);
}

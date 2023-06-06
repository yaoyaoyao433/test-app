package com.dianping.nvnetwork.failover.fetcher;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface b {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(b bVar, Request request);

        void a(b bVar, Request request, q qVar, Throwable th);

        void a(b bVar, q qVar, Throwable th);
    }

    int a();

    boolean a(Request request, q qVar);

    int b();

    void b(Request request, a aVar);

    void cancel();
}

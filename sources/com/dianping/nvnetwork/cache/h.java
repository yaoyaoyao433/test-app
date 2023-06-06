package com.dianping.nvnetwork.cache;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface h extends com.dianping.nvnetwork.http.a {
    void a();

    void a(Request request);

    boolean a(Request request, q qVar);

    @Override // com.dianping.nvnetwork.http.a
    rx.d<q> exec(Request request);
}

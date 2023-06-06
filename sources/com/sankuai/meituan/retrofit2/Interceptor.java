package com.sankuai.meituan.retrofit2;

import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface Interceptor {

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        com.sankuai.meituan.retrofit2.raw.b a(aj ajVar) throws IOException;

        aj request();
    }

    com.sankuai.meituan.retrofit2.raw.b intercept(a aVar) throws IOException;
}

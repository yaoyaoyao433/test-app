package com.sankuai.meituan.retrofit2;

import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface Call<T> extends Cloneable {
    Response<T> a() throws IOException;

    void a(f<T> fVar);

    boolean b();

    boolean c();

    void cancel();

    Call<T> d();

    aj e();
}

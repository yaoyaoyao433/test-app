package com.meizu.cloud.pushsdk.c.c;

import java.io.Closeable;
/* loaded from: classes3.dex */
public abstract class l implements Closeable {
    public abstract com.meizu.cloud.pushsdk.c.g.d a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        m.a(a());
    }
}

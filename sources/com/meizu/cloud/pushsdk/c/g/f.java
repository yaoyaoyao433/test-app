package com.meizu.cloud.pushsdk.c.g;

import com.meituan.robust.common.CommonConstant;
import java.io.IOException;
/* loaded from: classes3.dex */
public abstract class f implements l {
    private final l a;

    public f(l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.a = lVar;
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l
    public void a(b bVar, long j) throws IOException {
        this.a.a(bVar, j);
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Closeable, java.lang.AutoCloseable, com.meizu.cloud.pushsdk.c.g.m
    public void close() throws IOException {
        this.a.close();
    }

    @Override // com.meizu.cloud.pushsdk.c.g.l, java.io.Flushable
    public void flush() throws IOException {
        this.a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + CommonConstant.Symbol.BRACKET_LEFT + this.a.toString() + CommonConstant.Symbol.BRACKET_RIGHT;
    }
}

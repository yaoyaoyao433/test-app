package com.xiaomi.push;

import java.io.ByteArrayOutputStream;
/* loaded from: classes6.dex */
public final class io extends ByteArrayOutputStream {
    public io() {
    }

    public io(int i) {
        super(i);
    }

    public final byte[] a() {
        return this.buf;
    }

    public final int b() {
        return this.count;
    }
}

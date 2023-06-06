package com.huawei.updatesdk.a.a.b;

import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    private static final a b = new a();
    private final Queue<byte[]> a = new ArrayDeque(0);

    private a() {
    }

    public static a b() {
        return b;
    }

    public final void a(byte[] bArr) {
        if (bArr.length == 65536) {
            synchronized (this.a) {
                if (this.a.size() < 32 && !this.a.offer(bArr)) {
                    com.huawei.updatesdk.a.a.c.a.a.a.a("ByteArrayPool", "releaseBytes false");
                }
            }
        }
    }

    public final byte[] a() {
        byte[] poll;
        synchronized (this.a) {
            poll = this.a.poll();
        }
        return poll == null ? new byte[65536] : poll;
    }
}

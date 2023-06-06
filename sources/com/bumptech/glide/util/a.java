package com.bumptech.glide.util;

import android.util.Log;
import java.util.Queue;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    private static final a b = new a();
    private final Queue<byte[]> a = h.a(0);

    public static a a() {
        return b;
    }

    private a() {
    }

    public final byte[] b() {
        byte[] poll;
        synchronized (this.a) {
            poll = this.a.poll();
        }
        if (poll == null) {
            byte[] bArr = new byte[65536];
            Log.isLoggable("ByteArrayPool", 3);
            return bArr;
        }
        return poll;
    }

    public final boolean a(byte[] bArr) {
        boolean z = false;
        if (bArr.length != 65536) {
            return false;
        }
        synchronized (this.a) {
            if (this.a.size() < 32) {
                z = true;
                this.a.offer(bArr);
            }
        }
        return z;
    }
}

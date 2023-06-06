package com.dianping.nvtunnelkit.kit;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface t {

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a();

        void a(int i);

        void a(Throwable th);

        com.dianping.nvtunnelkit.conn.a b();
    }

    int a(ByteBuffer byteBuffer, int i) throws IOException;

    void a() throws IOException;

    void a(int i);

    void a(long j, SocketAddress socketAddress) throws IOException;

    void a(a aVar);

    void a(ByteBuffer byteBuffer) throws IOException;

    boolean b();
}

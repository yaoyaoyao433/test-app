package com.tencent.map.tools.net.http;

import com.tencent.mapsdk.internal.kd;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class HttpConnectionInputStream extends InputStream {
    private final HttpURLConnection mConnection;
    private final InputStream mProxyInputStream;

    public HttpConnectionInputStream(HttpURLConnection httpURLConnection) throws IOException {
        this.mConnection = httpURLConnection;
        this.mProxyInputStream = httpURLConnection.getInputStream();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        return this.mProxyInputStream.read();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
        kd.a((Closeable) this.mProxyInputStream);
        this.mConnection.disconnect();
    }
}

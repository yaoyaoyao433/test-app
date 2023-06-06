package com.bumptech.glide.load.data;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.squareup.picasso.InputStreamWrapper;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g implements c<InputStream> {
    private static final b a = new a();
    private final com.bumptech.glide.load.model.d b;
    private final b c;
    private long d;
    private HttpURLConnection e;
    private InputStream f;
    private volatile boolean g;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface b {
        HttpURLConnection a(URL url) throws IOException;
    }

    public g(com.bumptech.glide.load.model.d dVar) {
        this(dVar, a);
    }

    private g(com.bumptech.glide.load.model.d dVar, b bVar) {
        this.b = dVar;
        this.c = bVar;
    }

    private InputStream a(URL url, int i, URL url2, Map<String, String> map) throws IOException {
        while (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new IOException("In re-direct loop");
                        break;
                    }
                } catch (URISyntaxException unused) {
                }
            }
            this.e = this.c.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.e.addRequestProperty(entry.getKey(), entry.getValue());
            }
            this.e.setConnectTimeout(2500);
            this.e.setReadTimeout(2500);
            this.e.setUseCaches(false);
            this.e.setDoInput(true);
            this.e.connect();
            if (this.g) {
                return null;
            }
            int responseCode = this.e.getResponseCode();
            int i2 = responseCode / 100;
            if (i2 == 2) {
                HttpURLConnection httpURLConnection = this.e;
                if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                    this.d = httpURLConnection.getContentLength();
                    this.f = com.bumptech.glide.util.b.a(httpURLConnection.getInputStream(), this.d);
                } else {
                    if (Log.isLoggable("HttpUrlFetcher", 3)) {
                        new StringBuilder("Got non empty content encoding: ").append(httpURLConnection.getContentEncoding());
                    }
                    this.f = httpURLConnection.getInputStream();
                }
                return this.f;
            } else if (i2 == 3) {
                String headerField = this.e.getHeaderField("Location");
                if (TextUtils.isEmpty(headerField)) {
                    throw new IOException("Received empty or null redirect url");
                }
                URL url3 = new URL(url, headerField);
                i++;
                url2 = url;
                url = url3;
            } else {
                if (responseCode == -1) {
                    throw new IOException("Unable to retrieve response code from HttpUrlConnection.");
                }
                throw new IOException("Request failed " + responseCode + ": " + this.e.getResponseMessage());
            }
        }
        throw new IOException("Too many (> 5) redirects!");
    }

    @Override // com.bumptech.glide.load.data.c
    public final void a() {
        if (this.f != null) {
            try {
                this.f.close();
            } catch (IOException unused) {
            }
        }
        if (this.e != null) {
            this.e.disconnect();
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final String b() {
        return this.b.b();
    }

    @Override // com.bumptech.glide.load.data.c
    public final void cancel() {
        this.g = true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    static class a implements b {
        private a() {
        }

        @Override // com.bumptech.glide.load.data.g.b
        public final HttpURLConnection a(URL url) throws IOException {
            return (HttpURLConnection) HttpURLWrapper.wrapURLConnection(url.openConnection());
        }
    }

    @Override // com.bumptech.glide.load.data.c
    public final /* synthetic */ InputStream a(int i) throws Exception {
        com.bumptech.glide.load.model.d dVar = this.b;
        if (dVar.e == null) {
            if (TextUtils.isEmpty(dVar.d)) {
                String str = dVar.b;
                if (TextUtils.isEmpty(str)) {
                    str = dVar.a.toString();
                }
                dVar.d = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
            }
            dVar.e = new URL(dVar.d);
        }
        InputStream a2 = a(dVar.e, 0, null, this.b.a());
        InputStreamWrapper inputStreamWrapper = com.bumptech.glide.k.c;
        return inputStreamWrapper != null ? inputStreamWrapper.a(this.b.b(), this.d, a2) : a2;
    }
}

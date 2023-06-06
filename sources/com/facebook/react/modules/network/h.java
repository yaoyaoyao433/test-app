package com.facebook.react.modules.network;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Cache;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    @Nullable
    private static g a;

    public static OkHttpClient a(Context context) {
        if (a != null) {
            return a.a();
        }
        return a(context, 10485760).build();
    }

    private static OkHttpClient.Builder a() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        OkHttpClient.Builder cookieJar = builder.connectTimeout(0L, TimeUnit.MILLISECONDS).readTimeout(0L, TimeUnit.MILLISECONDS).writeTimeout(0L, TimeUnit.MILLISECONDS).cookieJar(new m());
        try {
            Security.insertProviderAt((Provider) Class.forName("org.conscrypt.OpenSSLProvider").newInstance(), 1);
            return cookieJar;
        } catch (Exception unused) {
            return a(cookieJar);
        }
    }

    private static OkHttpClient.Builder a(Context context, int i) {
        OkHttpClient.Builder a2 = a();
        File a3 = q.a(context, "rn_default", "http-cache", u.b);
        if (a3 != null) {
            a3.mkdirs();
        }
        return a2.cache(new Cache(a3, 10485760L));
    }

    private static OkHttpClient.Builder a(OkHttpClient.Builder builder) {
        if (Build.VERSION.SDK_INT <= 19) {
            try {
                builder.sslSocketFactory(new a());
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e) {
                com.facebook.common.logging.a.d("OkHttpClientProvider", "Error while enabling TLS 1.2", e);
            }
        }
        return builder;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends SSLSocketFactory {
        private SSLSocketFactory a;

        public a() throws KeyManagementException, NoSuchAlgorithmException {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
            this.a = sSLContext.getSocketFactory();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final String[] getDefaultCipherSuites() {
            return this.a.getDefaultCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final String[] getSupportedCipherSuites() {
            return this.a.getSupportedCipherSuites();
        }

        @Override // javax.net.ssl.SSLSocketFactory
        public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
            return a(this.a.createSocket(socket, str, i, z));
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(String str, int i) throws IOException, UnknownHostException {
            return a(this.a.createSocket(str, i));
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
            return a(this.a.createSocket(str, i, inetAddress, i2));
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
            return a(this.a.createSocket(inetAddress, i));
        }

        @Override // javax.net.SocketFactory
        public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
            return a(this.a.createSocket(inetAddress, i, inetAddress2, i2));
        }

        private static Socket a(Socket socket) {
            if (socket != null && (socket instanceof SSLSocket)) {
                ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1", "TLSv1.1", "TLSv1.2"});
            }
            return socket;
        }
    }
}

package com.huawei.secure.android.common.ssl;

import android.content.Context;
import com.huawei.secure.android.common.ssl.util.f;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.BrowserCompatHostnameVerifier;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b extends SSLSocketFactory {
    @Deprecated
    public static final X509HostnameVerifier a = new BrowserCompatHostnameVerifier();
    @Deprecated
    public static final X509HostnameVerifier b = new StrictHostnameVerifier();
    private static final String c = b.class.getSimpleName();
    private static volatile b d = null;
    private SSLContext e;
    private SSLSocket f = null;
    private Context g;
    private String[] h;
    private X509TrustManager i;
    private String[] j;
    private String[] k;
    private String[] l;

    public static b a(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        long currentTimeMillis = System.currentTimeMillis();
        com.huawei.secure.android.common.ssl.util.c.a(context);
        if (d == null) {
            synchronized (b.class) {
                if (d == null) {
                    d = new b(context);
                }
            }
        }
        if (d.g == null && context != null) {
            d.b(context);
        }
        StringBuilder sb = new StringBuilder("getInstance: cost : ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" ms");
        return d;
    }

    private void b(Context context) {
        this.g = context.getApplicationContext();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        f.a(c);
        Socket createSocket = this.e.getSocketFactory().createSocket(str, i);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.f = (SSLSocket) createSocket;
            this.h = (String[]) this.f.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        String[] strArr = this.h;
        return strArr != null ? strArr : new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        f.a(c);
        Socket createSocket = this.e.getSocketFactory().createSocket(socket, str, i, z);
        if (createSocket instanceof SSLSocket) {
            a(createSocket);
            this.f = (SSLSocket) createSocket;
            this.h = (String[]) this.f.getEnabledCipherSuites().clone();
        }
        return createSocket;
    }

    private void a(Socket socket) {
        boolean z;
        boolean z2 = true;
        if (com.huawei.secure.android.common.ssl.util.b.a(this.l)) {
            z = false;
        } else {
            f.a(c);
            a.c((SSLSocket) socket, this.l);
            z = true;
        }
        if (com.huawei.secure.android.common.ssl.util.b.a(this.k) && com.huawei.secure.android.common.ssl.util.b.a(this.j)) {
            z2 = false;
        } else {
            f.a(c);
            SSLSocket sSLSocket = (SSLSocket) socket;
            a.b(sSLSocket);
            if (!com.huawei.secure.android.common.ssl.util.b.a(this.k)) {
                a.a(sSLSocket, this.k);
            } else {
                a.b(sSLSocket, this.j);
            }
        }
        if (!z) {
            f.a(c);
            a.b((SSLSocket) socket);
        }
        if (z2) {
            return;
        }
        f.a(c);
        a.a((SSLSocket) socket);
    }

    private b(Context context) throws NoSuchAlgorithmException, CertificateException, KeyStoreException, IOException, KeyManagementException {
        this.e = null;
        if (context == null) {
            f.a(c, "SecureSSLSocketFactory: context is null");
            return;
        }
        b(context);
        this.e = a.a();
        this.i = c.a(context);
        this.e.init(null, new X509TrustManager[]{this.i}, null);
    }

    public b(X509TrustManager x509TrustManager) throws NoSuchAlgorithmException, KeyManagementException, IllegalArgumentException {
        this.e = null;
        this.e = a.a();
        this.i = x509TrustManager;
        this.e.init(null, new X509TrustManager[]{x509TrustManager}, null);
    }
}

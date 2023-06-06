package com.dianping.nvnetwork.httpdns;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e extends SSLSocketFactory {
    public static ChangeQuickRedirect a;
    public HostnameVerifier b;
    public HttpsURLConnection c;
    private final String d;

    public e(HttpsURLConnection httpsURLConnection, HostnameVerifier hostnameVerifier) {
        Object[] objArr = {httpsURLConnection, hostnameVerifier};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4565f58db096ce25f91e2497f50004a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4565f58db096ce25f91e2497f50004a4");
            return;
        }
        this.d = "AutoDns";
        this.c = httpsURLConnection;
        this.b = hostnameVerifier;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Object[] objArr = {socket, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c6c6e21340912915b1a3e3c67af406a", 6917529027641081856L)) {
            return (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c6c6e21340912915b1a3e3c67af406a");
        }
        String a2 = a(this.c);
        String str2 = a2 == null ? str : a2;
        new StringBuilder("customized createSocket. peerHost: ").append(str2);
        new StringBuilder("customized createSocket. host: ").append(str);
        InetAddress inetAddress = socket.getInetAddress();
        new StringBuilder("address : ").append(inetAddress);
        if (z) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getInsecure(10000, d.b());
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        if (Build.VERSION.SDK_INT >= 17) {
            sSLCertificateSocketFactory.setHostname(sSLSocket, str2);
        } else {
            try {
                sSLSocket.getClass().getMethod("setHostname", String.class).invoke(sSLSocket, str2);
            } catch (Exception e) {
                Log.w("AutoDns", "SNI not useable", e);
                com.dianping.networklog.c.a("SNI not useable " + e.getMessage(), 4);
            }
        }
        SSLSession session = sSLSocket.getSession();
        if (!this.b.verify(str2, session)) {
            com.dianping.networklog.c.a("Cannot verify hostname: " + str2, 4);
            throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str2);
        }
        com.dianping.networklog.c.a("Established " + session.getProtocol() + " connection with " + session.getPeerHost() + " using " + str, 4);
        StringBuilder sb = new StringBuilder("Established ");
        sb.append(session.getProtocol());
        sb.append(" connection with ");
        sb.append(session.getPeerHost());
        sb.append(" using ");
        sb.append(str);
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e121a5ad214aea69007860e74e2ed22", 6917529027641081856L)) {
            return (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e121a5ad214aea69007860e74e2ed22");
        }
        Log.e("AutoDns", "AutoDns error ?  createSocket(String host, int port)");
        return HttpsURLConnection.getDefaultSSLSocketFactory().createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        Object[] objArr = {str, Integer.valueOf(i), inetAddress, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "791f45659ace6293fe19a855f4c5036b", 6917529027641081856L)) {
            return (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "791f45659ace6293fe19a855f4c5036b");
        }
        Log.e("AutoDns", "AutoDns error ?  createSocket(String host, int port, InetAddress localHost, int localPort)");
        return HttpsURLConnection.getDefaultSSLSocketFactory().createSocket(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Object[] objArr = {inetAddress, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81d47e5cf4e3de0d3630ee12e35b4f3b", 6917529027641081856L)) {
            return (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81d47e5cf4e3de0d3630ee12e35b4f3b");
        }
        Log.e("AutoDns", "AutoDns error ?  createSocket(InetAddress host, int port)");
        return HttpsURLConnection.getDefaultSSLSocketFactory().createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Object[] objArr = {inetAddress, Integer.valueOf(i), inetAddress2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a45c76c5dc1016af46fea2ef6c2cf675", 6917529027641081856L)) {
            return (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a45c76c5dc1016af46fea2ef6c2cf675");
        }
        Log.e("AutoDns", "AutoDns error ? createSocket(InetAddress address, int port, InetAddress localAddress, int localPort)");
        return HttpsURLConnection.getDefaultSSLSocketFactory().createSocket(inetAddress, i, inetAddress2, i2);
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7338e4c2eec7aa7de10b329180bfe812", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7338e4c2eec7aa7de10b329180bfe812")).booleanValue();
        }
        String a2 = a(this.c);
        if (TextUtils.isEmpty(a2) || !(obj instanceof e)) {
            return false;
        }
        String a3 = a(((e) obj).c);
        if (TextUtils.isEmpty(a3)) {
            return false;
        }
        return a2.equals(a3);
    }

    private String a(HttpsURLConnection httpsURLConnection) {
        Object[] objArr = {httpsURLConnection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d15806cc5e43fbaa85b1720de661eb48", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d15806cc5e43fbaa85b1720de661eb48");
        }
        if (httpsURLConnection != null) {
            return this.c.getRequestProperty("SHARK_DNS_HOST");
        }
        return null;
    }
}

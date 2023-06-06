package com.meituan.android.httpdns;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
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
/* loaded from: classes2.dex */
public class y extends SSLSocketFactory {
    public static ChangeQuickRedirect a;
    public HostnameVerifier b;
    public SSLSocketFactory c;
    private final String d;
    private HttpsURLConnection e;
    private r f;

    public y(HttpsURLConnection httpsURLConnection, r rVar) {
        Object[] objArr = {httpsURLConnection, rVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e1fc4ca8f5d140918ca2b16896e7b8f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e1fc4ca8f5d140918ca2b16896e7b8f");
            return;
        }
        this.d = y.class.getSimpleName();
        this.b = HttpsURLConnection.getDefaultHostnameVerifier();
        this.c = HttpsURLConnection.getDefaultSSLSocketFactory();
        this.e = httpsURLConnection;
        this.f = rVar;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6856b8eb7469709753528058723eb5a", 6917529027641081856L) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6856b8eb7469709753528058723eb5a") : this.c.createSocket();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c99288f5e0ba1b28421e42723756bf9e", 6917529027641081856L) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c99288f5e0ba1b28421e42723756bf9e") : this.c.createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        Object[] objArr = {str, Integer.valueOf(i), inetAddress, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68ecd3335366b17f00d868a7788cca85", 6917529027641081856L) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68ecd3335366b17f00d868a7788cca85") : this.c.createSocket(str, i, inetAddress, i2);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Object[] objArr = {inetAddress, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "624ee33dcc361725ab8a3d6d33c3c12f", 6917529027641081856L) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "624ee33dcc361725ab8a3d6d33c3c12f") : this.c.createSocket(inetAddress, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Object[] objArr = {inetAddress, Integer.valueOf(i), inetAddress2, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e346d8789d8fd9893a3a516f486a4738", 6917529027641081856L) ? (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e346d8789d8fd9893a3a516f486a4738") : this.c.createSocket(inetAddress, i, inetAddress2, i2);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c81c3828b76f914814d429dddeb095", 6917529027641081856L) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c81c3828b76f914814d429dddeb095") : this.c.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88d6372ee46dfcc8c65f6b6f4e874e8b", 6917529027641081856L) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88d6372ee46dfcc8c65f6b6f4e874e8b") : this.c.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Object[] objArr = {socket, str, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8624f3ec98f81f6253ad20110fc66c8", 6917529027641081856L)) {
            return (Socket) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8624f3ec98f81f6253ad20110fc66c8");
        }
        String requestProperty = this.e.getRequestProperty("__DNS_Host");
        String str2 = requestProperty == null ? str : requestProperty;
        r rVar = this.f;
        rVar.a("customized createSocket. host: " + str2);
        InetAddress inetAddress = socket.getInetAddress();
        if (z) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        if (Build.VERSION.SDK_INT >= 17) {
            this.f.a("Setting SNI hostname");
            sSLCertificateSocketFactory.setHostname(sSLSocket, str2);
        } else {
            this.f.a("No documented SNI support on Android <4.2, trying with reflection");
            try {
                sSLSocket.getClass().getMethod("setHostname", String.class).invoke(sSLSocket, str2);
            } catch (Exception unused) {
                this.f.a("SNI not useable");
            }
        }
        SSLSession session = sSLSocket.getSession();
        if (!this.b.verify(str2, session)) {
            throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str2);
        }
        r rVar2 = this.f;
        rVar2.a("Established " + session.getProtocol() + " connection with " + session.getPeerHost() + " using " + session.getCipherSuite());
        return sSLSocket;
    }
}

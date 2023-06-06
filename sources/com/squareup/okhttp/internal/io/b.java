package com.squareup.okhttp.internal.io;

import com.meituan.robust.common.CommonConstant;
import com.squareup.okhttp.ab;
import com.squareup.okhttp.g;
import com.squareup.okhttp.internal.framed.d;
import com.squareup.okhttp.internal.h;
import com.squareup.okhttp.internal.http.k;
import com.squareup.okhttp.internal.http.s;
import com.squareup.okhttp.internal.tls.f;
import com.squareup.okhttp.j;
import com.squareup.okhttp.l;
import com.squareup.okhttp.q;
import com.squareup.okhttp.w;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okio.e;
import okio.m;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements j {
    private static SSLSocketFactory m;
    private static f n;
    public final ab a;
    public Socket b;
    public q c;
    public volatile d d;
    public int e;
    public e f;
    public okio.d g;
    public boolean i;
    private Socket k;
    private w l;
    public final List<Reference<s>> h = new ArrayList();
    public long j = Long.MAX_VALUE;

    public b(ab abVar) {
        this.a = abVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:13|14|15|(13:20|21|22|23|24|25|26|28|29|(1:31)(1:45)|32|(4:37|(1:39)|40|41)(1:43)|42)|88|21|22|23|24|25|26|28|29|(0)(0)|32|(2:34|36)(1:44)|37|(0)|40|41|42|11) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011c, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0121, code lost:
        com.squareup.okhttp.internal.j.a(r16.b);
        com.squareup.okhttp.internal.j.a(r16.k);
        r16.b = null;
        r16.k = null;
        r16.f = null;
        r16.g = null;
        r16.c = null;
        r16.l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0137, code lost:
        if (r7 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0139, code lost:
        r7 = new com.squareup.okhttp.internal.http.p(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x013e, code lost:
        r9 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0140, code lost:
        r9 = r7.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
        if (com.squareup.okhttp.internal.http.p.a != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0146, code lost:
        com.squareup.okhttp.internal.http.p.a.invoke(r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0150, code lost:
        r7.b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0153, code lost:
        if (r21 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0155, code lost:
        r11 = true;
        r3.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015a, code lost:
        if (r3.a == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017b, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017c, code lost:
        if (r11 != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017e, code lost:
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0181, code lost:
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009c A[Catch: IOException -> 0x011c, TryCatch #4 {IOException -> 0x011c, blocks: (B:25:0x0079, B:26:0x007c, B:28:0x009c, B:30:0x00ac, B:32:0x00b2, B:34:0x00b8, B:36:0x00f7, B:37:0x00fe, B:29:0x00a2, B:39:0x0104, B:40:0x011b), top: B:79:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2 A[Catch: IOException -> 0x011c, TryCatch #4 {IOException -> 0x011c, blocks: (B:25:0x0079, B:26:0x007c, B:28:0x009c, B:30:0x00ac, B:32:0x00b2, B:34:0x00b8, B:36:0x00f7, B:37:0x00fe, B:29:0x00a2, B:39:0x0104, B:40:0x011b), top: B:79:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f7 A[Catch: IOException -> 0x011c, TryCatch #4 {IOException -> 0x011c, blocks: (B:25:0x0079, B:26:0x007c, B:28:0x009c, B:30:0x00ac, B:32:0x00b2, B:34:0x00b8, B:36:0x00f7, B:37:0x00fe, B:29:0x00a2, B:39:0x0104, B:40:0x011b), top: B:79:0x0079 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r17, int r18, int r19, java.util.List<com.squareup.okhttp.l> r20, boolean r21) throws com.squareup.okhttp.internal.http.p {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.io.b.a(int, int, int, java.util.List, boolean):void");
    }

    private void a(int i, int i2, com.squareup.okhttp.internal.a aVar) throws IOException {
        SSLSocket sSLSocket;
        if (this.a.a()) {
            a(i, i2);
        }
        com.squareup.okhttp.a aVar2 = this.a.a;
        try {
            try {
                sSLSocket = (SSLSocket) aVar2.i.createSocket(this.k, aVar2.a(), aVar2.b(), true);
            } catch (AssertionError e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
            sSLSocket = null;
        }
        try {
            l a = aVar.a(sSLSocket);
            if (a.d) {
                h.a().a(sSLSocket, aVar2.a(), aVar2.e);
            }
            sSLSocket.startHandshake();
            q a2 = q.a(sSLSocket.getSession());
            if (!aVar2.j.verify(aVar2.a(), sSLSocket.getSession())) {
                X509Certificate x509Certificate = (X509Certificate) a2.b.get(0);
                throw new SSLPeerUnverifiedException("Hostname " + aVar2.a() + " not verified:\n    certificate: " + g.a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + com.squareup.okhttp.internal.tls.d.a(x509Certificate));
            }
            if (aVar2.k != g.a) {
                aVar2.k.a(aVar2.a(), new com.squareup.okhttp.internal.tls.b(a(aVar2.i)).a(a2.b));
            }
            String b = a.d ? h.a().b(sSLSocket) : null;
            this.b = sSLSocket;
            this.f = m.a(m.b(this.b));
            this.g = m.a(m.a(this.b));
            this.c = a2;
            this.l = b != null ? w.a(b) : w.HTTP_1_1;
            if (sSLSocket != null) {
                h.a().a(sSLSocket);
            }
        } catch (AssertionError e2) {
            e = e2;
            if (!com.squareup.okhttp.internal.j.a(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (Throwable th2) {
            th = th2;
            if (sSLSocket != null) {
                h.a().a(sSLSocket);
            }
            com.squareup.okhttp.internal.j.a((Socket) sSLSocket);
            throw th;
        }
    }

    private static synchronized f a(SSLSocketFactory sSLSocketFactory) {
        f fVar;
        synchronized (b.class) {
            if (sSLSocketFactory != m) {
                n = h.a().a(h.a().a(sSLSocketFactory));
                m = sSLSocketFactory;
            }
            fVar = n;
        }
        return fVar;
    }

    private void a(int i, int i2) throws IOException {
        x b = b();
        com.squareup.okhttp.s sVar = b.a;
        String str = "CONNECT " + sVar.b + CommonConstant.Symbol.COLON + sVar.c + " HTTP/1.1";
        do {
            com.squareup.okhttp.internal.http.e eVar = new com.squareup.okhttp.internal.http.e(null, this.f, this.g);
            this.f.timeout().timeout(i, TimeUnit.MILLISECONDS);
            this.g.timeout().timeout(i2, TimeUnit.MILLISECONDS);
            eVar.a(b.c, str);
            eVar.b();
            z.a c = eVar.c();
            c.a = b;
            z a = c.a();
            long a2 = k.a(a);
            if (a2 == -1) {
                a2 = 0;
            }
            okio.s a3 = eVar.a(a2);
            com.squareup.okhttp.internal.j.b(a3, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
            a3.close();
            int i3 = a.c;
            if (i3 == 200) {
                if (!this.f.a().d() || !this.g.a().d()) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                return;
            } else if (i3 == 407) {
                b = k.a(this.a.a.d, a, this.a.b);
            } else {
                throw new IOException("Unexpected response code for CONNECT: " + a.c);
            }
        } while (b != null);
        throw new IOException("Failed to authenticate with proxy");
    }

    private x b() throws IOException {
        return new x.a().a(this.a.a.a).a("Host", com.squareup.okhttp.internal.j.a(this.a.a.a)).a("Proxy-Connection", "Keep-Alive").a("User-Agent", "okhttp/2.7.6").a();
    }

    @Override // com.squareup.okhttp.j
    public final ab a() {
        return this.a;
    }

    public final void cancel() {
        com.squareup.okhttp.internal.j.a(this.k);
    }

    public final boolean a(boolean z) {
        if (this.b.isClosed() || this.b.isInputShutdown() || this.b.isOutputShutdown()) {
            return false;
        }
        if (this.d == null && z) {
            try {
                int soTimeout = this.b.getSoTimeout();
                this.b.setSoTimeout(1);
                if (this.f.d()) {
                    this.b.setSoTimeout(soTimeout);
                    return false;
                }
                this.b.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.a.a.a.b);
        sb.append(CommonConstant.Symbol.COLON);
        sb.append(this.a.a.a.c);
        sb.append(", proxy=");
        sb.append(this.a.b);
        sb.append(" hostAddress=");
        sb.append(this.a.c);
        sb.append(" cipherSuite=");
        sb.append(this.c != null ? this.c.a : "none");
        sb.append(" protocol=");
        sb.append(this.l);
        sb.append('}');
        return sb.toString();
    }
}

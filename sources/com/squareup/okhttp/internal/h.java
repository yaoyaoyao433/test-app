package com.squareup.okhttp.internal;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.android.common.aidata.mrn.Constants;
import com.squareup.okhttp.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class h {
    private static final h a = c();

    public static String b() {
        return "OkHttp";
    }

    public X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void a(SSLSocket sSLSocket, String str, List<w> list) {
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    public static h a() {
        return a;
    }

    public static void a(String str) {
        System.out.println(str);
    }

    public com.squareup.okhttp.internal.tls.f a(X509TrustManager x509TrustManager) {
        return new com.squareup.okhttp.internal.tls.e(x509TrustManager.getAcceptedIssuers());
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:1|(2:2|3)|4|5|(4:6|7|8|9)|(4:11|12|13|14)|15|16|18|19|20|21|22|(1:(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(18:1|2|3|4|5|6|7|8|9|(4:11|12|13|14)|15|16|18|19|20|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0091, code lost:
        r10 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.squareup.okhttp.internal.h c() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.okhttp.internal.h.c():com.squareup.okhttp.internal.h");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a extends h {
        private final Class<?> a;
        private final g<Socket> b;
        private final g<Socket> c;
        private final Method d;
        private final Method e;
        private final g<Socket> f;
        private final g<Socket> g;
        private final g<Socket> h;
        private final g<Socket> i;

        public a(Class<?> cls, g<Socket> gVar, g<Socket> gVar2, Method method, Method method2, g<Socket> gVar3, g<Socket> gVar4, g<Socket> gVar5, g<Socket> gVar6) {
            this.a = cls;
            this.b = gVar;
            this.c = gVar2;
            this.d = method;
            this.e = method2;
            this.f = gVar3;
            this.g = gVar4;
            this.h = gVar5;
            this.i = gVar6;
        }

        @Override // com.squareup.okhttp.internal.h
        public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
            try {
                socket.connect(inetSocketAddress, i);
            } catch (AssertionError e) {
                if (!j.a(e)) {
                    throw e;
                }
                throw new IOException(e);
            } catch (SecurityException e2) {
                IOException iOException = new IOException("Exception in connect");
                iOException.initCause(e2);
                throw iOException;
            }
        }

        @Override // com.squareup.okhttp.internal.h
        public final X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
            Object a = a(sSLSocketFactory, this.a, "sslParameters");
            if (a == null) {
                try {
                    a = a(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
                } catch (ClassNotFoundException unused) {
                    return null;
                }
            }
            X509TrustManager x509TrustManager = (X509TrustManager) a(a, X509TrustManager.class, "x509TrustManager");
            return x509TrustManager != null ? x509TrustManager : (X509TrustManager) a(a, X509TrustManager.class, "trustManager");
        }

        @Override // com.squareup.okhttp.internal.h
        public final com.squareup.okhttp.internal.tls.f a(X509TrustManager x509TrustManager) {
            com.squareup.okhttp.internal.tls.f a = com.squareup.okhttp.internal.tls.a.a(x509TrustManager);
            return a != null ? a : super.a(x509TrustManager);
        }

        @Override // com.squareup.okhttp.internal.h
        public final void a(SSLSocket sSLSocket, String str, List<w> list) {
            if (str != null) {
                this.b.a(sSLSocket, Boolean.TRUE);
                this.c.a(sSLSocket, str);
            }
            if (this.g != null && this.g.a((g<Socket>) sSLSocket)) {
                this.g.b(sSLSocket, a(list));
            }
            if (this.i == null || !this.i.a((g<Socket>) sSLSocket)) {
                return;
            }
            this.i.b(sSLSocket, a(list));
        }

        @Override // com.squareup.okhttp.internal.h
        public final String b(SSLSocket sSLSocket) {
            byte[] bArr;
            byte[] bArr2;
            if (this.f != null && this.f.a((g<Socket>) sSLSocket) && (bArr2 = (byte[]) this.f.b(sSLSocket, new Object[0])) != null) {
                return new String(bArr2, j.c);
            }
            if (this.h == null || !this.h.a((g<Socket>) sSLSocket) || (bArr = (byte[]) this.h.a(sSLSocket, new Object[0])) == null) {
                return null;
            }
            return new String(bArr, j.c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class b extends h {
        private final Class<?> a;

        public b(Class<?> cls) {
            this.a = cls;
        }

        @Override // com.squareup.okhttp.internal.h
        public final X509TrustManager a(SSLSocketFactory sSLSocketFactory) {
            Object a = a(sSLSocketFactory, this.a, "context");
            if (a == null) {
                return null;
            }
            return (X509TrustManager) a(a, X509TrustManager.class, "trustManager");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class c extends b {
        private final Method a;
        private final Method b;
        private final Method c;
        private final Class<?> d;
        private final Class<?> e;

        public c(Class<?> cls, Method method, Method method2, Method method3, Class<?> cls2, Class<?> cls3) {
            super(cls);
            this.a = method;
            this.b = method2;
            this.c = method3;
            this.d = cls2;
            this.e = cls3;
        }

        @Override // com.squareup.okhttp.internal.h
        public final void a(SSLSocket sSLSocket, String str, List<w> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                w wVar = list.get(i);
                if (wVar != w.HTTP_1_0) {
                    arrayList.add(wVar.toString());
                }
            }
            try {
                this.a.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.d, this.e}, new d(arrayList)));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }

        @Override // com.squareup.okhttp.internal.h
        public final void a(SSLSocket sSLSocket) {
            try {
                this.c.invoke(null, sSLSocket);
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }

        @Override // com.squareup.okhttp.internal.h
        public final String b(SSLSocket sSLSocket) {
            try {
                d dVar = (d) Proxy.getInvocationHandler(this.b.invoke(null, sSLSocket));
                if (!dVar.b && dVar.c == null) {
                    com.squareup.okhttp.internal.d.a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                } else if (dVar.b) {
                    return null;
                } else {
                    return dVar.c;
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
                throw new AssertionError();
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class d implements InvocationHandler {
        private final List<String> a;
        private boolean b;
        private String c;

        public d(List<String> list) {
            this.a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = j.b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.a;
            } else {
                if ((name.equals("selectProtocol") || name.equals(Constants.SQLConstants.KEY_SELECT)) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.a.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.c = str;
                            return str;
                        }
                    }
                    String str2 = this.a.get(0);
                    this.c = str2;
                    return str2;
                } else if ((name.equals("protocolSelected") || name.equals(DMKeys.KEY_SELECTED)) && objArr.length == 1) {
                    this.c = (String) objArr[0];
                    return null;
                } else {
                    return method.invoke(this, objArr);
                }
            }
        }
    }

    static byte[] a(List<w> list) {
        okio.c cVar = new okio.c();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            w wVar = list.get(i);
            if (wVar != w.HTTP_1_0) {
                cVar.h(wVar.toString().length());
                cVar.b(wVar.toString());
            }
        }
        return cVar.r();
    }

    static <T> T a(Object obj, Class<T> cls, String str) {
        do {
            for (Class<?> cls2 = obj.getClass(); cls2 != Object.class; cls2 = cls2.getSuperclass()) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null && cls.isInstance(obj2)) {
                        return cls.cast(obj2);
                    }
                    return null;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                } catch (NoSuchFieldException unused2) {
                }
            }
            if (str.equals("delegate")) {
                break;
            }
            obj = a(obj, Object.class, "delegate");
        } while (obj != null);
        return null;
    }
}

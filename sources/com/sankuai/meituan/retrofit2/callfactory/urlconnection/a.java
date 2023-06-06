package com.sankuai.meituan.retrofit2.callfactory.urlconnection;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aa;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements a.InterfaceC0637a {
    public static ChangeQuickRedirect a;
    private static final boolean b;
    private static int c;
    private int d;
    private int e;

    static {
        b = Build.VERSION.SDK_INT < 19;
        try {
            String property = System.getProperty("http.maxConnections");
            if (property == null || property.isEmpty()) {
                return;
            }
            c = Integer.parseInt(property);
        } catch (Throwable unused) {
            c = 5;
        }
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "93e8c65b22edd0d12343b29c56fcbdcd", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "93e8c65b22edd0d12343b29c56fcbdcd") : a(60000, 60000);
    }

    public static a a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0138ebef584df257a9e571968fbd0a0", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0138ebef584df257a9e571968fbd0a0") : new a(i, i2);
    }

    public a() {
    }

    private a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7335316b20a94359769b3365aab53423", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7335316b20a94359769b3365aab53423");
            return;
        }
        this.d = i;
        this.e = i2;
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e521c85aa92521b0dabc17d354eb171", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e521c85aa92521b0dabc17d354eb171") : new b(ajVar, this.d, this.e);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class b implements Interceptor.a, com.sankuai.meituan.retrofit2.raw.a {
        public static ChangeQuickRedirect a;
        private int c;
        private int d;
        private int e;
        private aj f;
        private HttpURLConnection g;
        private volatile boolean h;
        private boolean i;
        private boolean j;

        public b(aj ajVar, int i, int i2) {
            Object[] objArr = {a.this, ajVar, Integer.valueOf(i), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18d7670f2e4d0bb12f6cd0550b5f01f7", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18d7670f2e4d0bb12f6cd0550b5f01f7");
                return;
            }
            this.e = -1;
            this.j = true ^ aa.b();
            this.f = ajVar;
            this.c = i;
            this.d = i2;
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final aj request() {
            return this.f;
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final com.sankuai.meituan.retrofit2.raw.b a(aj ajVar) throws IOException {
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76b4771d4f2b41ceb941ed4351a6f814", 6917529027641081856L)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76b4771d4f2b41ceb941ed4351a6f814");
            }
            if (!this.j) {
                this.j = true;
                try {
                    return new y(getClass().getSimpleName(), false).intercept(this);
                } finally {
                }
            } else {
                return execute();
            }
        }

        @Override // com.sankuai.meituan.retrofit2.raw.a
        public final com.sankuai.meituan.retrofit2.raw.b execute() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be7a4fb9805578ec915037d92d250860", 6917529027641081856L)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be7a4fb9805578ec915037d92d250860");
            }
            if (!this.j) {
                return a(null);
            }
            synchronized (this) {
                if (this.i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.i = true;
            }
            int i = 0;
            while (true) {
                try {
                    synchronized (this) {
                        a aVar = a.this;
                        aj ajVar = this.f;
                        Object[] objArr2 = {ajVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a.a;
                        this.g = PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "fc24d895e25a1682bf80b36e7d4276cb", 6917529027641081856L) ? (HttpURLConnection) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "fc24d895e25a1682bf80b36e7d4276cb") : (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(ajVar.b()).openConnection());
                    }
                    if (i > 0) {
                        this.g.setRequestProperty("Connection", "close");
                    }
                    a(this.c, this.d, this.g, this.f);
                    if (this.h) {
                        throw new IOException("Already canceled");
                    }
                    return a(this.f.b(), this.g);
                } catch (EOFException e) {
                    if (a.b && i <= a.c) {
                        i++;
                        this.g.disconnect();
                    } else {
                        throw e;
                    }
                }
            }
        }

        @Override // com.sankuai.meituan.retrofit2.raw.a
        public final void cancel() {
            HttpURLConnection httpURLConnection;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e9c553ad12cbf09ec2ffde40063e8e6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e9c553ad12cbf09ec2ffde40063e8e6");
                return;
            }
            this.h = true;
            synchronized (this) {
                httpURLConnection = this.g;
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }

        private int b(aj ajVar) {
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6eea4324f7ff5345ddc07eba0b42ccf", 6917529027641081856L)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6eea4324f7ff5345ddc07eba0b42ccf")).intValue();
            }
            String a2 = ajVar.a("retrofit-mt-request-timeout");
            if (TextUtils.isEmpty(a2)) {
                return -1;
            }
            try {
                return Integer.parseInt(a2);
            } catch (NumberFormatException unused) {
                throw new NumberFormatException("retrofit-mt-request-timeout set failed and its value should be int");
            }
        }

        private void a(int i, int i2, HttpURLConnection httpURLConnection, aj ajVar) throws IOException {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), httpURLConnection, ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e6077ba584bc9b17acf4e767d59c6a0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e6077ba584bc9b17acf4e767d59c6a0");
                return;
            }
            int j = this.f.j();
            if (j >= 0) {
                this.e = j;
            } else {
                this.e = b(this.f);
            }
            if (this.e >= 0) {
                httpURLConnection.setConnectTimeout(this.e);
                httpURLConnection.setReadTimeout(this.e);
            } else {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i2);
            }
            httpURLConnection.setRequestMethod(ajVar.c());
            httpURLConnection.setDoInput(true);
            if (ajVar.d() != null) {
                for (q qVar : ajVar.d()) {
                    httpURLConnection.addRequestProperty(qVar.a(), qVar.b());
                }
            }
            ak i3 = ajVar.i();
            if (i3 != null) {
                httpURLConnection.setDoOutput(true);
                httpURLConnection.addRequestProperty("Content-Type", i3.contentType());
                long contentLength = i3.contentLength();
                if (contentLength != -1) {
                    httpURLConnection.setFixedLengthStreamingMode((int) contentLength);
                    httpURLConnection.addRequestProperty("Content-Length", String.valueOf(contentLength));
                } else {
                    httpURLConnection.setChunkedStreamingMode(4096);
                }
                i3.writeTo(httpURLConnection.getOutputStream());
            }
        }

        private com.sankuai.meituan.retrofit2.raw.b a(String str, final HttpURLConnection httpURLConnection) throws IOException {
            InputStream inputStream;
            Object[] objArr = {str, httpURLConnection};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f25d12126992a7364dd0b7ec7102fb2d", 6917529027641081856L)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f25d12126992a7364dd0b7ec7102fb2d");
            }
            int responseCode = httpURLConnection.getResponseCode();
            String responseMessage = httpURLConnection.getResponseMessage();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<String>> entry : httpURLConnection.getHeaderFields().entrySet()) {
                String key = entry.getKey();
                if (key != null) {
                    for (String str2 : entry.getValue()) {
                        if (str2 != null) {
                            arrayList.add(new q(key, str2));
                        }
                    }
                }
            }
            final String contentType = httpURLConnection.getContentType();
            final int contentLength = httpURLConnection.getContentLength();
            if (responseCode >= 400) {
                inputStream = httpURLConnection.getErrorStream();
            } else {
                inputStream = httpURLConnection.getInputStream();
            }
            final InputStream inputStream2 = inputStream;
            return new C0633a(str, responseCode, responseMessage, arrayList, new ap() { // from class: com.sankuai.meituan.retrofit2.callfactory.urlconnection.a.b.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.retrofit2.ap
                public final String contentType() {
                    return contentType;
                }

                @Override // com.sankuai.meituan.retrofit2.ap
                public final long contentLength() {
                    return contentLength;
                }

                @Override // com.sankuai.meituan.retrofit2.ap
                public final InputStream source() {
                    return inputStream2;
                }

                @Override // com.sankuai.meituan.retrofit2.ap, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32e3727d6110391686090f6db22d7a37", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32e3727d6110391686090f6db22d7a37");
                    } else {
                        httpURLConnection.disconnect();
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.retrofit2.callfactory.urlconnection.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0633a implements com.sankuai.meituan.retrofit2.raw.b {
        public static ChangeQuickRedirect a;
        private final String b;
        private final String c;
        private final int d;
        private final List<q> e;
        private final ap f;

        public C0633a(String str, int i, String str2, List<q> list, ap apVar) {
            Object[] objArr = {str, Integer.valueOf(i), str2, list, apVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "424106e920d275263509ac48872776fc", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "424106e920d275263509ac48872776fc");
                return;
            }
            this.b = str;
            this.d = i;
            this.c = str2;
            this.e = list;
            this.f = apVar;
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final String url() {
            return this.b;
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final int code() {
            return this.d;
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final String reason() {
            return this.c;
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final List<q> headers() {
            return this.e;
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final ap body() {
            return this.f;
        }
    }
}

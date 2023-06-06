package com.sankuai.meituan.retrofit2.callfactory.mapi;

import android.text.TextUtils;
import com.dianping.dataservice.mapi.d;
import com.dianping.dataservice.mapi.impl.DefaultMApiService;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.o;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aa;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.utils_nvnetwork.c;
import com.sankuai.meituan.retrofit2.y;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements a.InterfaceC0637a {
    public static ChangeQuickRedirect a;
    private DefaultMApiService b;

    public a(DefaultMApiService defaultMApiService) {
        Object[] objArr = {defaultMApiService};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e8ebb1091d301bc9625352129a3402fa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e8ebb1091d301bc9625352129a3402fa");
        } else {
            this.b = defaultMApiService;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4386f0f2e9f22d21a1bc0dc7ba3ec99", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4386f0f2e9f22d21a1bc0dc7ba3ec99") : new C0628a(ajVar, this.b);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.retrofit2.callfactory.mapi.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0628a implements Interceptor.a, com.sankuai.meituan.retrofit2.raw.a {
        public static ChangeQuickRedirect a;
        private aj b;
        private final DefaultMApiService c;
        private volatile boolean d;
        private boolean e;
        private boolean f;
        private Request g;

        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "133ec6ab3dbe7c8df779239dbdf8f075", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "133ec6ab3dbe7c8df779239dbdf8f075") : new C0628a(this.b, this.c);
        }

        public C0628a(aj ajVar, DefaultMApiService defaultMApiService) {
            Object[] objArr = {ajVar, defaultMApiService};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9322ba1b1e695d6cf73f1af6baefb2d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9322ba1b1e695d6cf73f1af6baefb2d");
                return;
            }
            this.f = !aa.b();
            this.b = ajVar;
            this.c = defaultMApiService;
            try {
                this.g = a.a(ajVar);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final aj request() {
            return this.b;
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final com.sankuai.meituan.retrofit2.raw.b a(aj ajVar) throws IOException {
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc8e42f88146455e3c221d4cc434e34d", 6917529027641081856L)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc8e42f88146455e3c221d4cc434e34d");
            }
            if (!this.f) {
                this.f = true;
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ad8f7d201fe181e53843c8a08165cd5", 6917529027641081856L)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ad8f7d201fe181e53843c8a08165cd5");
            }
            IOException iOException = null;
            if (!this.f) {
                return a(null);
            }
            synchronized (this) {
                if (this.e) {
                    throw new IllegalStateException("Already executed.");
                }
                this.e = true;
            }
            if (this.d) {
                throw new IOException("Already canceled");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f75683f1b8d07368b9f21d2f7fe016cb", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f75683f1b8d07368b9f21d2f7fe016cb");
            } else if (this.g == null) {
                throw new IOException("convert com.dianping.nvnetwork.Request failed");
            }
            q execSync = this.c.execSync(this.g);
            c cVar = new c(execSync, this.g);
            Object[] objArr3 = {execSync};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a0be7df76a022c1da9bf0f9adfb803d1", 6917529027641081856L)) {
                iOException = (IOException) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a0be7df76a022c1da9bf0f9adfb803d1");
            } else if (!execSync.isSuccess()) {
                Object error = execSync.error();
                if (error == null) {
                    iOException = new IOException("error not found");
                } else if (error instanceof Throwable) {
                    iOException = new IOException((Throwable) error);
                } else {
                    iOException = new IOException(error.toString());
                }
            }
            if (iOException == null) {
                return cVar;
            }
            throw iOException;
        }

        @Override // com.sankuai.meituan.retrofit2.raw.a
        public final void cancel() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b21a59a9a13ddaca84e43954f8821db2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b21a59a9a13ddaca84e43954f8821db2");
                return;
            }
            this.d = true;
            if (this.g != null) {
                this.c.abort(this.g, (o) null, false);
            }
        }
    }

    static Request a(aj ajVar) throws IOException {
        boolean z;
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6576d0c30c0c12895e6be03913a06051", 6917529027641081856L)) {
            return (Request) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6576d0c30c0c12895e6be03913a06051");
        }
        Request.Builder method = new Request.Builder().url(ajVar.b()).method(ajVar.c());
        if (ajVar.j() >= 0) {
            method.timeout(ajVar.j());
            z = true;
        } else {
            z = false;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        List<com.sankuai.meituan.retrofit2.q> d = ajVar.d();
        if (d != null && d.size() > 0) {
            for (com.sankuai.meituan.retrofit2.q qVar : d) {
                if ("post-fail-over".equals(qVar.a())) {
                    if ("true".equals(qVar.b())) {
                        method.isPostFailOver(true);
                    }
                } else if ("retrofit-mt-request-timeout".equals(qVar.a())) {
                    if (!TextUtils.isEmpty(qVar.b()) && !z) {
                        try {
                            method.timeout(Integer.parseInt(qVar.b()));
                        } catch (NumberFormatException unused) {
                            throw new NumberFormatException("retrofit-mt-request-timeout set failed and its value should be int");
                        }
                    }
                } else if ("fail-over".equals(qVar.a())) {
                    if ("false".equals(qVar.b())) {
                        method.isFailOver(false);
                    }
                } else {
                    com.sankuai.meituan.retrofit2.utils_nvnetwork.b.a(hashMap, qVar.a(), qVar.b());
                }
            }
        }
        ak i = ajVar.i();
        if (i != null) {
            String contentType = i.contentType();
            if (!TextUtils.isEmpty(contentType)) {
                com.sankuai.meituan.retrofit2.utils_nvnetwork.b.a(hashMap, "Content-Type", contentType);
            }
            long contentLength = i.contentLength();
            if (contentLength == -1) {
                com.sankuai.meituan.retrofit2.utils_nvnetwork.b.a(hashMap, "Transfer-Encoding", "chunked");
                com.sankuai.meituan.retrofit2.utils_nvnetwork.b.a(hashMap, "Content-Length");
            } else {
                com.sankuai.meituan.retrofit2.utils_nvnetwork.b.a(hashMap, "Content-Length", Long.toString(contentLength));
                com.sankuai.meituan.retrofit2.utils_nvnetwork.b.a(hashMap, "Transfer-Encoding");
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            i.writeTo(byteArrayOutputStream);
            String[] split = new String(byteArrayOutputStream.toByteArray()).replaceAll("&", "=").split("=");
            if (split.length > 0) {
                Charset forName = Charset.forName("UTF-8");
                for (int i2 = 0; i2 < split.length; i2++) {
                    split[i2] = b.a(split[i2], forName);
                }
            }
            method.input((InputStream) new d(split));
        }
        return method.headers(hashMap).build();
    }
}

package com.sankuai.meituan.retrofit2.callfactory.nvnetwork;

import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.j;
import com.dianping.nvnetwork.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aa;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.raw.b;
import com.sankuai.meituan.retrofit2.utils_nvnetwork.c;
import com.sankuai.meituan.retrofit2.y;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements a.InterfaceC0637a {
    public static ChangeQuickRedirect a;
    private j b;

    public static a a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1981412b3895890ff831029866dc1b4c", 6917529027641081856L) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1981412b3895890ff831029866dc1b4c") : new a(jVar);
    }

    public a() {
    }

    private a(j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "672b6fc335c7b7c91bcffc7ea8fb28e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "672b6fc335c7b7c91bcffc7ea8fb28e9");
        } else if (jVar == null) {
            throw new NullPointerException("NVNetworkService == null");
        } else {
            this.b = jVar;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.raw.a.InterfaceC0637a
    public final com.sankuai.meituan.retrofit2.raw.a get(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fb52c233fd1a7eaf08ab93d47358dec", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fb52c233fd1a7eaf08ab93d47358dec") : new C0629a(this.b, ajVar);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0629a implements Interceptor.a, com.sankuai.meituan.retrofit2.raw.a {
        public static ChangeQuickRedirect a;
        private j b;
        private aj c;
        private Request d;
        private volatile boolean e;
        private boolean f;
        private boolean g;

        public final /* synthetic */ Object clone() throws CloneNotSupportedException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac2627916134dfd1f60212ed957f2463", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac2627916134dfd1f60212ed957f2463") : new C0629a(this.b, this.c);
        }

        public C0629a(j jVar, aj ajVar) {
            Object[] objArr = {jVar, ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0aec64b2b44e2cc8d4baf2198d03947", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0aec64b2b44e2cc8d4baf2198d03947");
                return;
            }
            this.g = !aa.b();
            this.b = jVar;
            this.c = ajVar;
            try {
                this.d = b(ajVar);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final aj request() {
            return this.c;
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final b a(aj ajVar) throws IOException {
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "650d95bcee232d1a91f006e500147b1f", 6917529027641081856L)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "650d95bcee232d1a91f006e500147b1f");
            }
            if (!this.g) {
                this.g = true;
                try {
                    return new y(getClass().getSimpleName(), false).intercept(this);
                } finally {
                }
            } else {
                return execute();
            }
        }

        @Override // com.sankuai.meituan.retrofit2.raw.a
        public final b execute() throws IOException {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "883de9abd00c2a54a7aebeeb34dc3cad", 6917529027641081856L)) {
                return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "883de9abd00c2a54a7aebeeb34dc3cad");
            }
            IOException iOException = null;
            if (!this.g) {
                return a(null);
            }
            synchronized (this) {
                if (this.f) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f = true;
            }
            if (this.e) {
                throw new IOException("Already canceled");
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8ea93ef00ac21c312fb18564c5e5fef3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8ea93ef00ac21c312fb18564c5e5fef3");
            } else if (this.d == null) {
                throw new IOException("convert com.dianping.nvnetwork.Request failed");
            }
            q execSync = this.b.execSync(this.d);
            c cVar = new c(execSync, this.d);
            Object[] objArr3 = {execSync};
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e465199efe9a80b16a8a33cad9d6f26f", 6917529027641081856L)) {
                iOException = (IOException) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e465199efe9a80b16a8a33cad9d6f26f");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74ba91abd10b12fe1ae3d84bc121e2e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74ba91abd10b12fe1ae3d84bc121e2e");
                return;
            }
            this.e = true;
            if (this.d != null) {
                this.b.abort(this.d);
            }
        }

        private static Request b(aj ajVar) throws IOException {
            boolean z;
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "efa48f931532f7c039343e605450e34d", 6917529027641081856L)) {
                return (Request) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "efa48f931532f7c039343e605450e34d");
            }
            Request.Builder method = new Request.Builder().url(ajVar.b()).method(ajVar.c());
            if (!TextUtils.isEmpty(ajVar.h())) {
                method.catCommand(ajVar.h());
            }
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
                    } else if (!"catCmd".equals(qVar.a())) {
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
                method.input((InputStream) new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
            }
            return method.headers(hashMap).build();
        }
    }
}

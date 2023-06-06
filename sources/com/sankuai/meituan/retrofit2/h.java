package com.sankuai.meituan.retrofit2;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.d;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h<T> implements Call<T> {
    public static ChangeQuickRedirect a;
    private final List<Interceptor> b;
    private final List<Interceptor> c;
    private final Executor d;
    private final an e;
    private final a.InterfaceC0637a f;
    private final i<ap, T> g;
    private volatile boolean h;
    private com.sankuai.meituan.retrofit2.raw.a i;
    private aj j;
    private Throwable k;
    private boolean l;
    private com.sankuai.meituan.retrofit2.cache.a m;
    private aj n;
    private long o;

    private static boolean a(int i) {
        return i == 200;
    }

    public static /* synthetic */ String a(h hVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, hVar, changeQuickRedirect, false, "dff16c813bcc1d058f615b095d5895c7", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, hVar, changeQuickRedirect, false, "dff16c813bcc1d058f615b095d5895c7");
        }
        int indexOf = str.indexOf("//");
        int i = indexOf >= 0 ? indexOf + 2 : 0;
        int indexOf2 = str.indexOf("/", i);
        if (indexOf2 >= 0) {
            i = indexOf2 + 1;
        }
        int indexOf3 = str.indexOf(CommonConstant.Symbol.QUESTION_MARK, i);
        if (indexOf3 < 0) {
            indexOf3 = str.length();
        }
        return str.substring(i, indexOf3);
    }

    public static /* synthetic */ boolean a(h hVar, boolean z) {
        hVar.l = true;
        return true;
    }

    public h(an anVar, a.InterfaceC0637a interfaceC0637a, i<ap, T> iVar, List<Interceptor> list, List<Interceptor> list2, Executor executor, com.sankuai.meituan.retrofit2.cache.a aVar) {
        Object[] objArr = {anVar, interfaceC0637a, iVar, list, list2, executor, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c32d0df5c328bd1b5b76c2f51b3adb80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c32d0df5c328bd1b5b76c2f51b3adb80");
            return;
        }
        this.o = -1L;
        this.e = anVar;
        this.f = interfaceC0637a;
        this.g = iVar;
        this.b = list;
        this.c = list2;
        this.d = executor;
        this.m = aVar;
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    /* renamed from: d */
    public final Call<T> clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e966f3d6bc911744f0e40125c50c51", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e966f3d6bc911744f0e40125c50c51") : new h(this.e, this.f, this.g, this.b, this.c, this.d, this.m);
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final synchronized aj e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "618a2277d19b33ffe8b41196a5523a25", 6917529027641081856L)) {
            return (aj) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "618a2277d19b33ffe8b41196a5523a25");
        } else if (this.j != null) {
            return this.j;
        } else if (this.k != null) {
            if (this.k instanceof IOException) {
                throw new RuntimeException("Unable to create request.", this.k);
            }
            throw ((RuntimeException) this.k);
        } else {
            try {
                aj a2 = this.e.a();
                this.j = a2;
                return a2;
            } catch (IOException e) {
                this.k = e;
                throw new RuntimeException("Unable to create request.", e);
            } catch (RuntimeException e2) {
                this.k = e2;
                throw e2;
            }
        }
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final void a(final f<T> fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f614829bd4c92c23e395367b2d3148a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f614829bd4c92c23e395367b2d3148a");
        } else if (fVar == null) {
            throw new NullPointerException("callback == null");
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            com.sankuai.waimai.launcher.util.aop.b.a(this.d, new Runnable() { // from class: com.sankuai.meituan.retrofit2.h.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dd1fc4dd72608e7a92d0b870a1aae14c", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dd1fc4dd72608e7a92d0b870a1aae14c");
                        return;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    Throwable th = h.this.k;
                    aj ajVar = h.this.j;
                    synchronized (h.this) {
                        if (h.this.l) {
                            throw new IllegalStateException("Already executed.");
                        }
                        h.a(h.this, true);
                        if (ajVar == null && th == null) {
                            try {
                                ajVar = h.this.j = h.this.e.a();
                            } catch (IOException | RuntimeException e) {
                                th = h.this.k = e;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    if (th != null) {
                        fVar.onFailure(h.this, th);
                        ar.h.a(h.this, h.this.n, th);
                        return;
                    }
                    try {
                        str = h.a(h.this, ajVar.e);
                    } catch (Throwable unused) {
                        str = "Retrofit-MT-Running";
                    }
                    Thread currentThread = Thread.currentThread();
                    currentThread.setName("Retrofit-MT-" + str);
                    com.sankuai.meituan.retrofit2.ext.b a2 = com.sankuai.meituan.retrofit2.ext.b.a();
                    a2.a(currentTimeMillis);
                    Object[] objArr3 = {new Long(currentTimeMillis2)};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.retrofit2.ext.b.a;
                    if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "382fd4fc332eaa05d5a4ccf168ee6dee", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "382fd4fc332eaa05d5a4ccf168ee6dee");
                    } else {
                        a2.c = currentTimeMillis2;
                    }
                    try {
                        Response<T> a3 = h.this.a(h.this.a(ajVar.a().b("retrofit_exec_time", String.valueOf(currentTimeMillis)).a()));
                        a2.b(System.currentTimeMillis());
                        fVar.onResponse(h.this, a3);
                        ar.h.a(h.this, h.this.n, a3, h.this.o);
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            });
        }
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final synchronized boolean b() {
        return this.l;
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final Response<T> a() throws IOException {
        aj ajVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e76fef4b86e3a4f40ec66aa997103db", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e76fef4b86e3a4f40ec66aa997103db");
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (this.l) {
                throw new IllegalStateException("Already executed.");
            }
            this.l = true;
            if (this.k != null) {
                if (this.k instanceof IOException) {
                    throw ((IOException) this.k);
                }
                throw ((RuntimeException) this.k);
            }
            ajVar = this.j;
            if (ajVar == null) {
                try {
                    ajVar = this.e.a();
                    this.j = ajVar;
                } catch (IOException | RuntimeException e) {
                    this.k = e;
                    throw e;
                }
            }
        }
        com.sankuai.meituan.retrofit2.ext.b.a().a(currentTimeMillis);
        try {
            Response<T> a2 = a(a(ajVar.a().b("retrofit_exec_time", String.valueOf(currentTimeMillis)).a()));
            ar.h.a(this, this.n, a2, this.o);
            return a2;
        } finally {
        }
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final void cancel() {
        com.sankuai.meituan.retrofit2.raw.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c7dc308ec3479fed9a43dcf068c5d08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c7dc308ec3479fed9a43dcf068c5d08");
            return;
        }
        this.h = true;
        synchronized (this) {
            aVar = this.i;
        }
        if (aVar != null) {
            try {
                aVar.cancel();
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final boolean c() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.meituan.retrofit2.raw.b a(aj ajVar) throws IOException {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed150bc0b35e6ec4f7deb79d4b5909a7", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed150bc0b35e6ec4f7deb79d4b5909a7");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b);
        arrayList.addAll(this.c);
        arrayList.add(new com.sankuai.meituan.retrofit2.b());
        if (ajVar.c) {
            arrayList.add(new p());
        }
        com.sankuai.meituan.retrofit2.raw.b a2 = new a(0, ajVar, arrayList).a(ajVar);
        if (a2 == null || aa.a(a2.url())) {
            return a2;
        }
        ai aiVar = new ai(a2);
        v vVar = new v();
        vVar.a(a2.url());
        aiVar.a(vVar);
        return aiVar;
    }

    private com.sankuai.meituan.retrofit2.raw.b b(aj ajVar, boolean z) throws IOException {
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0c83a5249f004262e821ad9e2488717", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0c83a5249f004262e821ad9e2488717");
        }
        com.sankuai.meituan.retrofit2.raw.b e = e(ajVar, z);
        return (ajVar.i == null || !ajVar.i.h) ? e : a(ajVar, e);
    }

    private com.sankuai.meituan.retrofit2.raw.b c(aj ajVar, boolean z) throws IOException {
        com.sankuai.meituan.retrofit2.raw.b bVar;
        com.sankuai.meituan.retrofit2.raw.b bVar2;
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "748d701fed2e61a30b0b4150f3ac77a7", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "748d701fed2e61a30b0b4150f3ac77a7");
        }
        try {
            bVar = a(ajVar, e(ajVar, z));
        } catch (Throwable unused) {
            bVar = null;
        }
        if (bVar == null || !av.a(bVar.code())) {
            try {
                bVar2 = b(ajVar);
            } catch (Throwable unused2) {
                bVar2 = null;
            }
            return (bVar2 == null || !a(bVar2.code())) ? bVar : bVar2;
        }
        return bVar;
    }

    private com.sankuai.meituan.retrofit2.raw.b d(aj ajVar, boolean z) throws IOException {
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22b776893914a14669bd4d456911e36c", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22b776893914a14669bd4d456911e36c");
        }
        com.sankuai.meituan.retrofit2.raw.b bVar = null;
        try {
            bVar = b(ajVar);
        } catch (Throwable unused) {
        }
        if (bVar == null || !a(bVar.code())) {
            bVar = e(ajVar, z);
            if (ajVar.i != null && ajVar.i.h) {
                return a(ajVar, bVar);
            }
        }
        return bVar;
    }

    private com.sankuai.meituan.retrofit2.raw.b b(aj ajVar) throws IOException {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0665e260ed269a39a91a4650512f9277", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0665e260ed269a39a91a4650512f9277");
        }
        com.sankuai.meituan.retrofit2.raw.b a2 = this.m.a(ajVar);
        if (a2 != null) {
            return a2;
        }
        throw new com.sankuai.meituan.retrofit2.exception.a("getting cache response return null");
    }

    private com.sankuai.meituan.retrofit2.raw.b a(aj ajVar, com.sankuai.meituan.retrofit2.raw.b bVar) throws IOException {
        Object[] objArr = {ajVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e1c020aa2b5466238188314e05ef041", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e1c020aa2b5466238188314e05ef041") : a(bVar.code()) ? this.m.a(ajVar, bVar) : bVar;
    }

    @SuppressLint({"LogUse"})
    private com.sankuai.meituan.retrofit2.raw.b e(aj ajVar, boolean z) throws IOException {
        com.sankuai.meituan.retrofit2.raw.a aVar;
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "587476a0d8a82f72eda77b39b644f957", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "587476a0d8a82f72eda77b39b644f957");
        }
        synchronized (this) {
            aVar = this.f.get(ajVar);
            this.i = aVar;
        }
        if (aVar == null) {
            throw new NullPointerException("Call.Factory returned null.");
        }
        if (this.h) {
            aVar.cancel();
        }
        return aVar.execute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response<T> a(com.sankuai.meituan.retrofit2.raw.b bVar) throws IOException {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c0dba10da6515135c70b859bc4f7928", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c0dba10da6515135c70b859bc4f7928");
        }
        long currentTimeMillis = System.currentTimeMillis();
        ap body = bVar.body();
        b bVar2 = new b(bVar);
        int code = bVar2.code();
        if (!av.a(code)) {
            try {
                return Response.a(av.a(body), (com.sankuai.meituan.retrofit2.raw.b) bVar2);
            } finally {
                body.close();
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return Response.a((Object) null, bVar2);
        } else {
            try {
                T a2 = this.g.a(body);
                ar.g.a(this, this.n);
                this.o = System.currentTimeMillis() - currentTimeMillis;
                return Response.a(a2, bVar2);
            } catch (Throwable th) {
                com.sankuai.meituan.retrofit2.exception.b bVar3 = new com.sankuai.meituan.retrofit2.exception.b("Conversion failed", th);
                ar.g.a(this, this.n, bVar3);
                throw bVar3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements com.sankuai.meituan.retrofit2.raw.b {
        public static ChangeQuickRedirect a;
        public com.sankuai.meituan.retrofit2.raw.b b;
        private ap c;

        public b(com.sankuai.meituan.retrofit2.raw.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27a0adce4681ffed681ffdd9b33fc7ac", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27a0adce4681ffed681ffdd9b33fc7ac");
                return;
            }
            this.b = bVar;
            this.c = bVar.body();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final String url() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f067a4c2414a56edc879a8de28f7832", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f067a4c2414a56edc879a8de28f7832") : this.b.url();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final int code() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a6e57693c935461b7688113d9ec4108", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a6e57693c935461b7688113d9ec4108")).intValue() : this.b.code();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final String reason() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "614a74a1dd3e635608b39005e4f683b4", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "614a74a1dd3e635608b39005e4f683b4") : this.b.reason();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final List<q> headers() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba80bf172053288aa9791033cdfbe173", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba80bf172053288aa9791033cdfbe173") : this.b.headers();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final ap body() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c458257d74058e770fcd052656e0b1fd", 6917529027641081856L) ? (ap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c458257d74058e770fcd052656e0b1fd") : new a(this.c.contentType(), this.c.contentLength());
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        public static final class a extends ap {
            public static ChangeQuickRedirect a;
            private final String b;
            private final long c;

            public a(String str, long j) {
                Object[] objArr = {str, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ba1592642210406961f01034675306b", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ba1592642210406961f01034675306b");
                    return;
                }
                this.b = str;
                this.c = j;
            }

            @Override // com.sankuai.meituan.retrofit2.ap
            public final String contentType() {
                return this.b;
            }

            @Override // com.sankuai.meituan.retrofit2.ap
            public final long contentLength() {
                return this.c;
            }

            @Override // com.sankuai.meituan.retrofit2.ap
            public final InputStream source() {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c312159178aafca86ecdf3e86f583590", 6917529027641081856L)) {
                    return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c312159178aafca86ecdf3e86f583590");
                }
                throw new IllegalStateException("Cannot read raw response body of a converted body.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements Interceptor.a {
        public static ChangeQuickRedirect a;
        private final int c;
        private aj d;
        private List<Interceptor> e;

        public a(int i, aj ajVar, List<Interceptor> list) {
            Object[] objArr = {h.this, Integer.valueOf(i), ajVar, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "008956441a7e072c939f3df69ceb4e77", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "008956441a7e072c939f3df69ceb4e77");
                return;
            }
            this.c = i;
            this.d = ajVar;
            this.e = list;
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final aj request() {
            return this.d;
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor.a
        public final com.sankuai.meituan.retrofit2.raw.b a(aj ajVar) throws IOException {
            Object[] objArr = {ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bfabc4f2fa9f9b69f4b430cad58b5ab", 6917529027641081856L)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bfabc4f2fa9f9b69f4b430cad58b5ab");
            }
            if (this.c >= this.e.size()) {
                return h.this.a(ajVar, false);
            }
            return this.e.get(this.c).intercept(new a(this.c + 1, ajVar, this.e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.meituan.retrofit2.raw.b a(aj ajVar, boolean z) throws IOException {
        d.b bVar;
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c6902f8edb9a319fc1d85bbefc58c4", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c6902f8edb9a319fc1d85bbefc58c4");
        }
        boolean z2 = ajVar.e != null && ajVar.e.contains(AbsApiFactory.HTTPS);
        this.n = ajVar;
        try {
            if (ajVar.i != null && TextUtils.isEmpty(ajVar.i.i)) {
                ajVar.i.i = ajVar.e;
            }
            if (ajVar.i == null) {
                bVar = d.b.NET;
            } else {
                bVar = ajVar.i.e;
            }
            if ((this.m != null) && bVar != d.b.NET) {
                if (bVar == d.b.LOCAL) {
                    Object[] objArr2 = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19bd62a0d5b6fd1db0ac211920cdf68a", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19bd62a0d5b6fd1db0ac211920cdf68a") : b(ajVar);
                } else if (bVar == d.b.NET_PREFERRED) {
                    return c(ajVar, z);
                } else {
                    if (bVar == d.b.LOCAL_PREFERRED) {
                        return d(ajVar, z);
                    }
                    return b(ajVar, z);
                }
            }
            return b(ajVar, z);
        } catch (IOException e) {
            if (!z && ajVar.b && z2) {
                aj.a a2 = ajVar.a();
                a2.b = ajVar.e.replace(AbsApiFactory.HTTPS, AbsApiFactory.HTTP);
                return a(a2.a(), true);
            }
            throw e;
        }
    }
}

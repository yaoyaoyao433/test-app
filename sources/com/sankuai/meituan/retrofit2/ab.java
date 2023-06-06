package com.sankuai.meituan.retrofit2;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.meituan.passport.api.AbsApiFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.d;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ab implements Call<ap> {
    public static ChangeQuickRedirect a;
    public volatile boolean b;
    public aj c;
    private final List<Interceptor> d;
    private final Executor e;
    private final a.InterfaceC0637a f;
    private com.sankuai.meituan.retrofit2.raw.a g;
    private Throwable h;
    private boolean i;
    private com.sankuai.meituan.retrofit2.cache.a j;
    private aj k;
    private long l;

    private static boolean a(int i) {
        return i == 200;
    }

    public static /* synthetic */ String a(ab abVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, abVar, changeQuickRedirect, false, "16c98354f30a858b64abd44598efbe7b", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, abVar, changeQuickRedirect, false, "16c98354f30a858b64abd44598efbe7b");
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

    public static /* synthetic */ boolean a(ab abVar, boolean z) {
        abVar.i = true;
        return true;
    }

    public ab(a.InterfaceC0637a interfaceC0637a, List<Interceptor> list) {
        this(interfaceC0637a, list, null);
        Object[] objArr = {interfaceC0637a, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f01f3e166eb15e45f89153e31a424a99", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f01f3e166eb15e45f89153e31a424a99");
        }
    }

    private ab(a.InterfaceC0637a interfaceC0637a, List<Interceptor> list, com.sankuai.meituan.retrofit2.cache.a aVar) {
        Object[] objArr = {interfaceC0637a, list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cc655ed630c7cfb7cb0bf3c421e4cb0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cc655ed630c7cfb7cb0bf3c421e4cb0");
            return;
        }
        this.l = -1L;
        this.f = interfaceC0637a;
        this.d = list;
        this.e = ag.a().b();
        this.j = aVar;
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    /* renamed from: d */
    public final Call<ap> clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a8666f457e9ef982501a687d7c0ffaa", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a8666f457e9ef982501a687d7c0ffaa") : new ab(this.f, this.d, this.j);
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final synchronized aj e() {
        if (this.c != null) {
            return this.c;
        }
        return null;
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final void a(final f<ap> fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc634806f4ad7df7f1dde333dad77081", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc634806f4ad7df7f1dde333dad77081");
        } else if (fVar == null) {
            throw new NullPointerException("callback == null");
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            com.sankuai.waimai.launcher.util.aop.b.a(this.e, new Runnable() { // from class: com.sankuai.meituan.retrofit2.ab.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0919b86c6a6269c720f60b2fd4455ee", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0919b86c6a6269c720f60b2fd4455ee");
                        return;
                    }
                    Throwable th = ab.this.h;
                    aj ajVar = ab.this.c;
                    synchronized (ab.this) {
                        if (ab.this.i) {
                            throw new IllegalStateException("Already executed.");
                        }
                        ab.a(ab.this, true);
                        if (ajVar == null && th == null) {
                            try {
                                ajVar = ab.this.c;
                            } catch (RuntimeException e) {
                                th = ab.this.h = e;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    if (th != null) {
                        fVar.onFailure(ab.this, th);
                        ar.h.a(ab.this, ab.this.k, th);
                        return;
                    }
                    try {
                        str = ab.a(ab.this, ajVar.b());
                    } catch (Throwable unused) {
                        str = "Retrofit-MT-Running";
                    }
                    Thread currentThread = Thread.currentThread();
                    currentThread.setName("Retrofit-MT-" + str);
                    com.sankuai.meituan.retrofit2.ext.b.a().a(currentTimeMillis);
                    try {
                        Response a2 = ab.this.a(ab.this.a(ajVar.a().b("retrofit_exec_time", String.valueOf(currentTimeMillis)).a()));
                        fVar.onResponse(ab.this, a2);
                        ar.h.a(ab.this, ab.this.k, a2, ab.this.l);
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
        return this.i;
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final Response<ap> a() throws IOException {
        aj ajVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b74d586dbf05d0d526f7480af4024805", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b74d586dbf05d0d526f7480af4024805");
        }
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (this) {
            if (this.i) {
                throw new IllegalStateException("Already executed.");
            }
            this.i = true;
            if (this.h != null) {
                if (this.h instanceof IOException) {
                    throw ((IOException) this.h);
                }
                throw ((RuntimeException) this.h);
            }
            ajVar = this.c;
            if (ajVar == null) {
                try {
                    ajVar = this.c;
                } catch (RuntimeException e) {
                    this.h = e;
                    throw e;
                }
            }
        }
        com.sankuai.meituan.retrofit2.ext.b.a().a(currentTimeMillis);
        try {
            Response<ap> a2 = a(a(ajVar.a().b("retrofit_exec_time", String.valueOf(currentTimeMillis)).a()));
            ar.h.a(this, this.k, a2, this.l);
            return a2;
        } finally {
        }
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final void cancel() {
        com.sankuai.meituan.retrofit2.raw.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6915c1afd5b3ad83549f985880f925c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6915c1afd5b3ad83549f985880f925c8");
            return;
        }
        this.b = true;
        synchronized (this) {
            aVar = this.g;
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
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.meituan.retrofit2.raw.b a(aj ajVar) throws IOException {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "568ab583f8140086ae792bc8f83701c4", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "568ab583f8140086ae792bc8f83701c4");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.d);
        arrayList.add(new com.sankuai.meituan.retrofit2.b());
        if (ajVar.f()) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.meituan.retrofit2.raw.b a(aj ajVar, boolean z) throws IOException {
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6153d8c911dd1ba9f36c6745542cab2", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6153d8c911dd1ba9f36c6745542cab2");
        }
        boolean z2 = ajVar.b() != null && ajVar.b().contains(AbsApiFactory.HTTPS);
        this.k = ajVar;
        try {
            if (ajVar.g() != null && TextUtils.isEmpty(ajVar.g().c())) {
                ajVar.g().a(ajVar.b());
            }
            d.b a2 = ajVar.g() == null ? d.b.NET : ajVar.g().a();
            if ((this.j != null) && a2 != d.b.NET) {
                if (a2 == d.b.LOCAL) {
                    Object[] objArr2 = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8fff45ee575a8a3265c8d6e1fb72cfc", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8fff45ee575a8a3265c8d6e1fb72cfc") : b(ajVar);
                } else if (a2 == d.b.NET_PREFERRED) {
                    return c(ajVar, z);
                } else {
                    if (a2 == d.b.LOCAL_PREFERRED) {
                        return d(ajVar, z);
                    }
                    return b(ajVar, z);
                }
            }
            return b(ajVar, z);
        } catch (IOException e) {
            if (!z && ajVar.e() && z2) {
                return a(ajVar.a().b(ajVar.b().replace(AbsApiFactory.HTTPS, AbsApiFactory.HTTP)).a(), true);
            }
            throw e;
        }
    }

    private com.sankuai.meituan.retrofit2.raw.b b(aj ajVar, boolean z) throws IOException {
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b18775a4db8e8b748b4857eb63bad31", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b18775a4db8e8b748b4857eb63bad31");
        }
        com.sankuai.meituan.retrofit2.raw.b e = e(ajVar, z);
        return (ajVar.g() == null || !ajVar.g().b()) ? e : a(ajVar, e);
    }

    private com.sankuai.meituan.retrofit2.raw.b c(aj ajVar, boolean z) throws IOException {
        com.sankuai.meituan.retrofit2.raw.b bVar;
        com.sankuai.meituan.retrofit2.raw.b bVar2;
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58ff2d3f9c753c1df1aafb5858db60e6", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58ff2d3f9c753c1df1aafb5858db60e6");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac9689835f53e4ccd200dfc1f22de72", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac9689835f53e4ccd200dfc1f22de72");
        }
        com.sankuai.meituan.retrofit2.raw.b bVar = null;
        try {
            bVar = b(ajVar);
        } catch (Throwable unused) {
        }
        if (bVar == null || !a(bVar.code())) {
            bVar = e(ajVar, z);
            if (ajVar.g() != null && ajVar.g().b()) {
                return a(ajVar, bVar);
            }
        }
        return bVar;
    }

    private com.sankuai.meituan.retrofit2.raw.b b(aj ajVar) throws IOException {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adb11fb2b297b3722b0581e653327ada", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adb11fb2b297b3722b0581e653327ada");
        }
        com.sankuai.meituan.retrofit2.raw.b a2 = this.j.a(ajVar);
        if (a2 != null) {
            return a2;
        }
        throw new com.sankuai.meituan.retrofit2.exception.a("getting cache response return null");
    }

    private com.sankuai.meituan.retrofit2.raw.b a(aj ajVar, com.sankuai.meituan.retrofit2.raw.b bVar) throws IOException {
        Object[] objArr = {ajVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd9a7106c1545fb0c192dc8f8d4aabc5", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd9a7106c1545fb0c192dc8f8d4aabc5") : a(bVar.code()) ? this.j.a(ajVar, bVar) : bVar;
    }

    @SuppressLint({"LogUse"})
    private com.sankuai.meituan.retrofit2.raw.b e(aj ajVar, boolean z) throws IOException {
        com.sankuai.meituan.retrofit2.raw.a aVar;
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16609f248f83e28739a10367e89d0f16", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16609f248f83e28739a10367e89d0f16");
        }
        synchronized (this) {
            aVar = this.f.get(ajVar);
            this.g = aVar;
        }
        if (aVar == null) {
            throw new NullPointerException("Call.Factory returned null.");
        }
        if (this.b) {
            aVar.cancel();
        }
        return aVar.execute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response<ap> a(com.sankuai.meituan.retrofit2.raw.b bVar) throws IOException {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a62f4d7ecdff11ef76d1eed4a432a6", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a62f4d7ecdff11ef76d1eed4a432a6");
        }
        System.currentTimeMillis();
        ap body = bVar.body();
        b bVar2 = new b(bVar);
        int code = bVar2.code();
        if (!av.a(code)) {
            try {
                return Response.a(av.a(body), (com.sankuai.meituan.retrofit2.raw.b) bVar2);
            } finally {
            }
        } else if (code == 204 || code == 205) {
            body.close();
            return Response.a((Object) null, bVar2);
        } else {
            try {
                ap a2 = av.a(body);
                body.close();
                return Response.a(a2, (com.sankuai.meituan.retrofit2.raw.b) bVar2);
            } finally {
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed25c859f6aeaa3de01f6fc311385291", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed25c859f6aeaa3de01f6fc311385291");
                return;
            }
            this.b = bVar;
            this.c = bVar.body();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final String url() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "926c85dcbb7b7b4b919fdc961051745d", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "926c85dcbb7b7b4b919fdc961051745d") : this.b.url();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final int code() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0526c57583227aca44a516842e04e76", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0526c57583227aca44a516842e04e76")).intValue() : this.b.code();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final String reason() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd58dfe503675faeae40ba9a22e8ac48", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd58dfe503675faeae40ba9a22e8ac48") : this.b.reason();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final List<q> headers() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eaf863b95230cd9872f00918253407b9", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eaf863b95230cd9872f00918253407b9") : this.b.headers();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final ap body() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29f46271c94900cb5dbb3d0190da34e7", 6917529027641081856L) ? (ap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29f46271c94900cb5dbb3d0190da34e7") : new a(this.c.contentType(), this.c.contentLength());
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
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a924779e05e825b73e6a3da32c936bcc", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a924779e05e825b73e6a3da32c936bcc");
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
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8853b02e49caf3c0d32fabdf3d81fe57", 6917529027641081856L)) {
                    return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8853b02e49caf3c0d32fabdf3d81fe57");
                }
                throw new IllegalStateException("Cannot read raw response body of a converted body.");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a implements Interceptor.a {
        public static ChangeQuickRedirect a;
        private final int c;
        private aj d;
        private List<Interceptor> e;

        public a(int i, aj ajVar, List<Interceptor> list) {
            Object[] objArr = {ab.this, Integer.valueOf(i), ajVar, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bc2b7158e9ee387a9d6e9688f8412c4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bc2b7158e9ee387a9d6e9688f8412c4");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e072b6c7528fdef2427ed08a16bf8a6", 6917529027641081856L)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e072b6c7528fdef2427ed08a16bf8a6");
            }
            if (this.c >= this.e.size()) {
                return ab.this.a(ajVar, false);
            }
            return this.e.get(this.c).intercept(new a(this.c + 1, ajVar, this.e));
        }
    }
}

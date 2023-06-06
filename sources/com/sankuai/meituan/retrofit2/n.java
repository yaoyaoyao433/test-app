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
public final class n implements Call<ap> {
    public static ChangeQuickRedirect a;
    public aj b;
    private final List<Interceptor> c;
    private final Executor d;
    private final a.InterfaceC0637a e;
    private volatile boolean f;
    private com.sankuai.meituan.retrofit2.raw.a g;
    private Throwable h;
    private boolean i;
    private final com.sankuai.meituan.retrofit2.cache.a j;
    private aj k;
    private final long l;

    private static boolean a(int i) {
        return i == 200;
    }

    public static /* synthetic */ String a(n nVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, nVar, changeQuickRedirect, false, "782c2afd6ae18e111e8463b9ad8d6cde", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, nVar, changeQuickRedirect, false, "782c2afd6ae18e111e8463b9ad8d6cde");
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

    public static /* synthetic */ boolean a(n nVar, boolean z) {
        nVar.i = true;
        return true;
    }

    public n(a.InterfaceC0637a interfaceC0637a, List<Interceptor> list) {
        this(interfaceC0637a, list, null);
        Object[] objArr = {interfaceC0637a, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc11267f19d451ca4bab53a39608d2de", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc11267f19d451ca4bab53a39608d2de");
        }
    }

    private n(a.InterfaceC0637a interfaceC0637a, List<Interceptor> list, com.sankuai.meituan.retrofit2.cache.a aVar) {
        Object[] objArr = {interfaceC0637a, list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6225b465b6d8410a498dcd3e8d00796", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6225b465b6d8410a498dcd3e8d00796");
            return;
        }
        this.l = -1L;
        this.e = interfaceC0637a;
        this.c = list;
        this.d = ag.a().b();
        this.j = aVar;
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    /* renamed from: d */
    public final Call<ap> clone() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c219cab92e156891dbff97153352f90", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c219cab92e156891dbff97153352f90") : new n(this.e, this.c, this.j);
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final synchronized aj e() {
        if (this.b != null) {
            return this.b;
        }
        return null;
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final void a(final f<ap> fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e858ba98a256de95b9b7696d4e2a398c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e858ba98a256de95b9b7696d4e2a398c");
        } else if (fVar == null) {
            throw new NullPointerException("callback == null");
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            com.sankuai.waimai.launcher.util.aop.b.a(this.d, new Runnable() { // from class: com.sankuai.meituan.retrofit2.n.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d0f0c9b9d7029c6cba9db7a2ff4f5357", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d0f0c9b9d7029c6cba9db7a2ff4f5357");
                        return;
                    }
                    Throwable th = n.this.h;
                    aj ajVar = n.this.b;
                    synchronized (n.this) {
                        if (n.this.i) {
                            throw new IllegalStateException("Already executed.");
                        }
                        n.a(n.this, true);
                        if (ajVar == null && th == null) {
                            try {
                                ajVar = n.this.b;
                            } catch (RuntimeException e) {
                                th = n.this.h = e;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    if (th != null) {
                        fVar.onFailure(n.this, th);
                        ar.h.a(n.this, n.this.k, th);
                        return;
                    }
                    try {
                        str = n.a(n.this, ajVar.b());
                    } catch (Throwable unused) {
                        str = "Retrofit-MT-Running";
                    }
                    Thread currentThread = Thread.currentThread();
                    currentThread.setName("Retrofit-MT-" + str);
                    try {
                        Response a2 = n.this.a(n.this.a(ajVar.a().b("retrofit_exec_time", String.valueOf(currentTimeMillis)).a()));
                        fVar.onResponse(n.this, a2);
                        ar.h.a(n.this, n.this.k, a2, -1L);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f646d8c4e1e798a26319cf7bcd2b941", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f646d8c4e1e798a26319cf7bcd2b941");
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
            ajVar = this.b;
            if (ajVar == null) {
                try {
                    ajVar = this.b;
                } catch (RuntimeException e) {
                    this.h = e;
                    throw e;
                }
            }
        }
        if (ajVar != null) {
            try {
                Response<ap> a2 = a(a(ajVar.a().b("retrofit_exec_time", String.valueOf(currentTimeMillis)).a()));
                ar.h.a(this, this.k, a2, -1L);
                return a2;
            } catch (Throwable th) {
                ar.h.a(this, this.k, th);
                throw th;
            }
        }
        return null;
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final void cancel() {
        com.sankuai.meituan.retrofit2.raw.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bb645ec253e13e0f4d16b21bf038302", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bb645ec253e13e0f4d16b21bf038302");
            return;
        }
        this.f = true;
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
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.sankuai.meituan.retrofit2.raw.b a(aj ajVar) throws IOException {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcc661dad15bcd06e59580ca952781c8", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcc661dad15bcd06e59580ca952781c8");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.c);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ad5894c0d0e8469b41a1262919c394fb", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ad5894c0d0e8469b41a1262919c394fb");
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
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d53643567a57381b93e9071f2975a39b", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d53643567a57381b93e9071f2975a39b") : b(ajVar);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37c37d00cceb79f4b2efe184c2a18618", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37c37d00cceb79f4b2efe184c2a18618");
        }
        com.sankuai.meituan.retrofit2.raw.b e = e(ajVar, z);
        return (ajVar.g() == null || !ajVar.g().b()) ? e : a(ajVar, e);
    }

    private com.sankuai.meituan.retrofit2.raw.b c(aj ajVar, boolean z) throws IOException {
        com.sankuai.meituan.retrofit2.raw.b bVar;
        com.sankuai.meituan.retrofit2.raw.b bVar2;
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ea250441a9706d92f72e458fe21d4c7", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ea250441a9706d92f72e458fe21d4c7");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "242ee16245f4ed624338db2e2f0c3df9", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "242ee16245f4ed624338db2e2f0c3df9");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23c2724c7121713247f5fc1871fea04a", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23c2724c7121713247f5fc1871fea04a");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "416eb4a08054d20770c2ed5e1376a8ae", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "416eb4a08054d20770c2ed5e1376a8ae") : a(bVar.code()) ? this.j.a(ajVar, bVar) : bVar;
    }

    @SuppressLint({"LogUse"})
    private com.sankuai.meituan.retrofit2.raw.b e(aj ajVar, boolean z) throws IOException {
        com.sankuai.meituan.retrofit2.raw.a aVar;
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d5e67096a8eee5da91d4568612838f0", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d5e67096a8eee5da91d4568612838f0");
        }
        synchronized (this) {
            aVar = this.e.get(ajVar);
            this.g = aVar;
        }
        if (aVar == null) {
            throw new NullPointerException("Call.Factory returned null.");
        }
        if (this.f) {
            aVar.cancel();
        }
        return aVar.execute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Response<ap> a(com.sankuai.meituan.retrofit2.raw.b bVar) throws IOException {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5957012cbf053d81ab909b91a27ab816", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5957012cbf053d81ab909b91a27ab816");
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

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b implements com.sankuai.meituan.retrofit2.raw.b {
        public static ChangeQuickRedirect a;
        public final com.sankuai.meituan.retrofit2.raw.b b;
        private final ap c;

        public b(com.sankuai.meituan.retrofit2.raw.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3263ebc7bee697fd1ac601595ef5ace8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3263ebc7bee697fd1ac601595ef5ace8");
                return;
            }
            this.b = bVar;
            this.c = bVar.body();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final String url() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0518e374b6a5b2ddb0d6ba5a96ef1186", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0518e374b6a5b2ddb0d6ba5a96ef1186") : this.b.url();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final int code() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e18c8c515fb70c2910ac79123b4658b", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e18c8c515fb70c2910ac79123b4658b")).intValue() : this.b.code();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final String reason() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f95161ffc36bc0d45585f8037c26eba9", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f95161ffc36bc0d45585f8037c26eba9") : this.b.reason();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final List<q> headers() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ef1b313402c8e969c12139c327d732d", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ef1b313402c8e969c12139c327d732d") : this.b.headers();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final ap body() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27bfae9146eaf141448525c8aaff8fb1", 6917529027641081856L) ? (ap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27bfae9146eaf141448525c8aaff8fb1") : new a(this.c.contentType(), this.c.contentLength());
        }

        /* compiled from: ProGuard */
        /* loaded from: classes4.dex */
        static final class a extends ap {
            public static ChangeQuickRedirect a;
            private final String b;
            private final long c;

            public a(String str, long j) {
                Object[] objArr = {str, new Long(j)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9279568badee97fa5f9d979e206a7c69", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9279568badee97fa5f9d979e206a7c69");
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
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55f3117ca69c76e09368da903fee4626", 6917529027641081856L)) {
                    return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55f3117ca69c76e09368da903fee4626");
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
        private final aj d;
        private final List<Interceptor> e;

        public a(int i, aj ajVar, List<Interceptor> list) {
            Object[] objArr = {n.this, Integer.valueOf(i), ajVar, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2193846f4582259dc7a1e75641c09c0b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2193846f4582259dc7a1e75641c09c0b");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6720981ec749c574c098469d7a366a6", 6917529027641081856L)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6720981ec749c574c098469d7a366a6");
            }
            if (this.c >= this.e.size()) {
                return n.this.a(ajVar, false);
            }
            return this.e.get(this.c).intercept(new a(this.c + 1, ajVar, this.e));
        }
    }
}

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
public final class m implements Call<ap> {
    public static ChangeQuickRedirect a;
    public aj b;
    private final List<Interceptor> c;
    private final Executor d;
    private final a.InterfaceC0637a e;
    private volatile boolean f;
    private com.sankuai.meituan.retrofit2.raw.a g;
    private Throwable h;
    private boolean i;
    private com.sankuai.meituan.retrofit2.cache.a j;
    private aj k;
    private long l;

    private static boolean a(int i) {
        return i == 200;
    }

    public static /* synthetic */ String a(m mVar, String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, mVar, changeQuickRedirect, false, "a4bdfe8745fd41555d54f6cb55148d9f", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, mVar, changeQuickRedirect, false, "a4bdfe8745fd41555d54f6cb55148d9f");
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

    public static /* synthetic */ boolean a(m mVar, boolean z) {
        mVar.i = true;
        return true;
    }

    public m(a.InterfaceC0637a interfaceC0637a, List<Interceptor> list) {
        this(interfaceC0637a, list, null);
        Object[] objArr = {interfaceC0637a, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3baa3ef6b672d65c9201dfc9d13cf6d5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3baa3ef6b672d65c9201dfc9d13cf6d5");
        }
    }

    private m(a.InterfaceC0637a interfaceC0637a, List<Interceptor> list, com.sankuai.meituan.retrofit2.cache.a aVar) {
        Object[] objArr = {interfaceC0637a, list, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0fbfa501c609aa193b39bf65103b524", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0fbfa501c609aa193b39bf65103b524");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0c0ea3d50ca78db5dfd4e0f6773dd60", 6917529027641081856L) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0c0ea3d50ca78db5dfd4e0f6773dd60") : new m(this.e, this.c, this.j);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab24d99447282312034e4244ec1bb717", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab24d99447282312034e4244ec1bb717");
        } else if (fVar == null) {
            throw new NullPointerException("callback == null");
        } else {
            final long currentTimeMillis = System.currentTimeMillis();
            com.sankuai.waimai.launcher.util.aop.b.a(this.d, new Runnable() { // from class: com.sankuai.meituan.retrofit2.m.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfd6da60cb700367395a986c8f91878b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfd6da60cb700367395a986c8f91878b");
                        return;
                    }
                    Throwable th = m.this.h;
                    aj ajVar = m.this.b;
                    synchronized (m.this) {
                        if (m.this.i) {
                            throw new IllegalStateException("Already executed.");
                        }
                        m.a(m.this, true);
                        if (ajVar == null && th == null) {
                            try {
                                ajVar = m.this.b;
                            } catch (RuntimeException e) {
                                th = m.this.h = e;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                    }
                    if (th != null) {
                        fVar.onFailure(m.this, th);
                        ar.h.a(m.this, m.this.k, th);
                        return;
                    }
                    try {
                        str = m.a(m.this, ajVar.b());
                    } catch (Throwable unused) {
                        str = "Retrofit-MT-Running";
                    }
                    Thread currentThread = Thread.currentThread();
                    currentThread.setName("Retrofit-MT-" + str);
                    try {
                        Response a2 = m.this.a(m.this.a(ajVar.a().b("retrofit_exec_time", String.valueOf(currentTimeMillis)).a()));
                        fVar.onResponse(m.this, a2);
                        ar.h.a(m.this, m.this.k, a2, m.this.l);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ed59bb5059ba7338f7148d29433ee2e", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ed59bb5059ba7338f7148d29433ee2e");
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
        try {
            Response<ap> a2 = a(a(ajVar.a().b("retrofit_exec_time", String.valueOf(currentTimeMillis)).a()));
            ar.h.a(this, this.k, a2, this.l);
            return a2;
        } catch (Throwable th) {
            ar.h.a(this, this.k, th);
            throw th;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.Call
    public final void cancel() {
        com.sankuai.meituan.retrofit2.raw.a aVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "460eae12625bbd6871d4a545ccfd99a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "460eae12625bbd6871d4a545ccfd99a7");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9526224c5c53dbd1a2570b856f76937c", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9526224c5c53dbd1a2570b856f76937c");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b2679ca1f5979b3b89ce2597e25e0b8", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b2679ca1f5979b3b89ce2597e25e0b8");
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
                    return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d8a66f02cf06d8f0117732d7f89b5aa3", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d8a66f02cf06d8f0117732d7f89b5aa3") : b(ajVar);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f12eca3f0b3de72bfd3f9a7bb5827e08", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f12eca3f0b3de72bfd3f9a7bb5827e08");
        }
        com.sankuai.meituan.retrofit2.raw.b e = e(ajVar, z);
        return (ajVar.g() == null || !ajVar.g().b()) ? e : a(ajVar, e);
    }

    private com.sankuai.meituan.retrofit2.raw.b c(aj ajVar, boolean z) throws IOException {
        com.sankuai.meituan.retrofit2.raw.b bVar;
        com.sankuai.meituan.retrofit2.raw.b bVar2;
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "466200bbf66c423c493814514cd95a3b", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "466200bbf66c423c493814514cd95a3b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4be006c395e04b2a001b9865877c0e95", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4be006c395e04b2a001b9865877c0e95");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "baf756e65beb3c1805a2693f3af646d5", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "baf756e65beb3c1805a2693f3af646d5");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "915f2be97fc87633dc33b2d36de71db3", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "915f2be97fc87633dc33b2d36de71db3") : a(bVar.code()) ? this.j.a(ajVar, bVar) : bVar;
    }

    @SuppressLint({"LogUse"})
    private com.sankuai.meituan.retrofit2.raw.b e(aj ajVar, boolean z) throws IOException {
        com.sankuai.meituan.retrofit2.raw.a aVar;
        Object[] objArr = {ajVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d9b481aed18902e26d580d1c87e5c25", 6917529027641081856L)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d9b481aed18902e26d580d1c87e5c25");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dc2462ced61c197caa6eb62d03e96b9", 6917529027641081856L)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dc2462ced61c197caa6eb62d03e96b9");
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
        public com.sankuai.meituan.retrofit2.raw.b b;
        private ap c;

        public b(com.sankuai.meituan.retrofit2.raw.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec4f3d0f7a1c0072514ca2b8d19e4ca6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec4f3d0f7a1c0072514ca2b8d19e4ca6");
                return;
            }
            this.b = bVar;
            this.c = bVar.body();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final String url() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3c4b40c33754b32ccccf05d65ed2af0", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3c4b40c33754b32ccccf05d65ed2af0") : this.b.url();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final int code() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c298af368122caef0532a26d79f11c78", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c298af368122caef0532a26d79f11c78")).intValue() : this.b.code();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final String reason() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fafe7fa11e6e9d74e25324f8f4085bb", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fafe7fa11e6e9d74e25324f8f4085bb") : this.b.reason();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final List<q> headers() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40a1e13089d727e0491831a648a1e5b9", 6917529027641081856L) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40a1e13089d727e0491831a648a1e5b9") : this.b.headers();
        }

        @Override // com.sankuai.meituan.retrofit2.raw.b
        public final ap body() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac288530a48222c0e9ccaa7ab1da393", 6917529027641081856L) ? (ap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac288530a48222c0e9ccaa7ab1da393") : new a(this.c.contentType(), this.c.contentLength());
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
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b08b1c39f6e33912d9634c45a8ad6e5", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b08b1c39f6e33912d9634c45a8ad6e5");
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
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc21587b31fc0f4e90703acf8f089c7b", 6917529027641081856L)) {
                    return (InputStream) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc21587b31fc0f4e90703acf8f089c7b");
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
            Object[] objArr = {m.this, Integer.valueOf(i), ajVar, list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2fbb062efa8c86c7db66c031fd489f9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2fbb062efa8c86c7db66c031fd489f9");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5662cb7c5f45bb95e941939b99284a5e", 6917529027641081856L)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5662cb7c5f45bb95e941939b99284a5e");
            }
            if (this.c >= this.e.size()) {
                return m.this.a(ajVar, false);
            }
            return this.e.get(this.c).intercept(new a(this.c + 1, ajVar, this.e));
        }
    }
}

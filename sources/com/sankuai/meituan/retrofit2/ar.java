package com.sankuai.meituan.retrofit2;

import com.meituan.android.common.unionid.oneid.network.OneIdNetworkTool;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.meituan.retrofit2.au;
import com.sankuai.meituan.retrofit2.c;
import com.sankuai.meituan.retrofit2.e;
import com.sankuai.meituan.retrofit2.http.AUTODOWNGRADE;
import com.sankuai.meituan.retrofit2.http.DELETE;
import com.sankuai.meituan.retrofit2.http.FormUrlEncoded;
import com.sankuai.meituan.retrofit2.http.GET;
import com.sankuai.meituan.retrofit2.http.GZIP;
import com.sankuai.meituan.retrofit2.http.HEAD;
import com.sankuai.meituan.retrofit2.http.HTTP;
import com.sankuai.meituan.retrofit2.http.Headers;
import com.sankuai.meituan.retrofit2.http.Multipart;
import com.sankuai.meituan.retrofit2.http.OPTIONS;
import com.sankuai.meituan.retrofit2.http.PATCH;
import com.sankuai.meituan.retrofit2.http.POST;
import com.sankuai.meituan.retrofit2.http.PUT;
import com.sankuai.meituan.retrofit2.i;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.raw.c;
import com.sankuai.titans.proxy.util.Constants;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class ar {
    public static ChangeQuickRedirect a;
    private static volatile at q;
    private static volatile as r;
    final a.InterfaceC0637a b;
    final t c;
    final List<i.a> d;
    final List<e.a> e;
    public final c.a f;
    private final Map<Method, au> i;
    private final List<Interceptor> j;
    private final Executor k;
    private final Executor l;
    private final boolean m;
    private final com.sankuai.meituan.retrofit2.cache.a n;
    private static List<Interceptor> o = new ArrayList();
    private static Executor p = null;
    public static at g = new at() { // from class: com.sankuai.meituan.retrofit2.ar.1
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.meituan.retrofit2.at
        public final void a(Call call, aj ajVar) {
            Object[] objArr = {call, ajVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30c34e37560528ad2467fe7585d867a1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30c34e37560528ad2467fe7585d867a1");
                return;
            }
            at atVar = ar.q;
            if (atVar != null) {
                atVar.a(call, ajVar);
            }
        }

        @Override // com.sankuai.meituan.retrofit2.at
        public final void a(Call call, aj ajVar, Throwable th) {
            Object[] objArr = {call, ajVar, th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ceb6ea940b8f2041a53ef52c86a9eafa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ceb6ea940b8f2041a53ef52c86a9eafa");
                return;
            }
            at atVar = ar.q;
            if (atVar != null) {
                atVar.a(call, ajVar, th);
            }
        }
    };
    public static as h = new as() { // from class: com.sankuai.meituan.retrofit2.ar.2
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.meituan.retrofit2.as
        public final void a(Call call, aj ajVar, Response response, long j) {
            Object[] objArr = {call, ajVar, response, new Long(j)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08e757ab97e50deb7936d588a82aa8fa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08e757ab97e50deb7936d588a82aa8fa");
                return;
            }
            as asVar = ar.r;
            if (asVar != null) {
                asVar.a(call, ajVar, response, j);
            }
        }

        @Override // com.sankuai.meituan.retrofit2.as
        public final void a(Call call, aj ajVar, Throwable th) {
            Object[] objArr = {call, ajVar, th};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d65b393ea5d129759914722d2f68fbe", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d65b393ea5d129759914722d2f68fbe");
                return;
            }
            as asVar = ar.r;
            if (asVar != null) {
                asVar.a(call, ajVar, th);
            }
        }
    };

    public static void a(Executor executor) {
        p = executor;
    }

    public ar(a.InterfaceC0637a interfaceC0637a, t tVar, List<i.a> list, List<e.a> list2, List<Interceptor> list3, Executor executor, Executor executor2, boolean z, com.sankuai.meituan.retrofit2.cache.a aVar, c.a aVar2) {
        Object[] objArr = {interfaceC0637a, tVar, list, list2, list3, executor, executor2, Byte.valueOf(z ? (byte) 1 : (byte) 0), aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfd5861cb228a8565a6709fcc4e50cee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfd5861cb228a8565a6709fcc4e50cee");
            return;
        }
        this.i = new LinkedHashMap();
        this.b = interfaceC0637a;
        this.c = tVar;
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
        this.j = list3;
        this.k = executor;
        this.l = executor2;
        this.m = z;
        this.n = aVar;
        this.f = aVar2;
    }

    public final <T> T a(final Class<T> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac5b51bbd1344eee742ab6ab3d006057", 6917529027641081856L)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac5b51bbd1344eee742ab6ab3d006057");
        }
        av.a((Class) cls);
        if (this.m) {
            b((Class<?>) cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() { // from class: com.sankuai.meituan.retrofit2.ar.3
            public static ChangeQuickRedirect a;
            private final ag d = ag.a();

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object... objArr2) throws Throwable {
                Object[] objArr3 = {obj, method, objArr2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect2, false, "e55b66b591dad04288fe8922c98dbd79", 6917529027641081856L)) {
                    return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect2, false, "e55b66b591dad04288fe8922c98dbd79");
                }
                if (method.getDeclaringClass() == Object.class) {
                    return method.invoke(this, objArr2);
                }
                au a2 = ar.this.a(method);
                return a2.e.a(new h(new k(a2, objArr2), ar.this.b, a2.f, ar.this.j, ar.o, ar.this.k, ar.this.n));
            }
        });
    }

    public final Call<ap> a(aj ajVar) {
        Object[] objArr = {ajVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e2526cbfbbc6740e5309e394283c354", 6917529027641081856L)) {
            return (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e2526cbfbbc6740e5309e394283c354");
        }
        av.a(ajVar, "request == null");
        return new h(new com.sankuai.meituan.retrofit2.a(ajVar), this.b, ajVar.d ? c.C0627c.a : c.a.b, this.j, o, this.k, this.n);
    }

    private void b(Class<?> cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ccf194cb5c8e3cfcb7765f478da64f6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ccf194cb5c8e3cfcb7765f478da64f6d");
            return;
        }
        ag.a();
        for (Method method : cls.getDeclaredMethods()) {
            a(method);
        }
    }

    public final au a(Method method) {
        au auVar;
        Annotation[] annotationArr;
        Object[] objArr = {method};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb06d4ff67e314cdd12d5d1a835621f", 6917529027641081856L)) {
            return (au) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb06d4ff67e314cdd12d5d1a835621f");
        }
        synchronized (this.i) {
            auVar = this.i.get(method);
            if (auVar == null) {
                au.a aVar = new au.a(this, method);
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = au.a.a;
                if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "209d5704b869c907a0d8d5f77a0a878b", 6917529027641081856L)) {
                    auVar = (au) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "209d5704b869c907a0d8d5f77a0a878b");
                } else {
                    aVar.z = aVar.a();
                    aVar.g = aVar.z.a();
                    if (aVar.g == Response.class || aVar.g == com.sankuai.meituan.retrofit2.raw.b.class) {
                        throw aVar.a(CommonConstant.Symbol.SINGLE_QUOTES + av.a(aVar.g).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    aVar.y = aVar.b();
                    for (Annotation annotation : aVar.d) {
                        Object[] objArr3 = {annotation};
                        ChangeQuickRedirect changeQuickRedirect3 = au.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "54cead1b27d00630cc7936214d9928f4", 6917529027641081856L)) {
                            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "54cead1b27d00630cc7936214d9928f4");
                        } else if (annotation instanceof DELETE) {
                            aVar.a("DELETE", ((DELETE) annotation).value(), false);
                        } else if (annotation instanceof GET) {
                            aVar.a("GET", ((GET) annotation).value(), false);
                        } else if (annotation instanceof HEAD) {
                            aVar.a("HEAD", ((HEAD) annotation).value(), false);
                            if (!Void.class.equals(aVar.g)) {
                                throw aVar.a("HEAD method must use Void as response type.", new Object[0]);
                            }
                        } else if (annotation instanceof PATCH) {
                            aVar.a("PATCH", ((PATCH) annotation).value(), true);
                        } else if (annotation instanceof POST) {
                            aVar.a("POST", ((POST) annotation).value(), true);
                        } else if (annotation instanceof PUT) {
                            aVar.a(OneIdNetworkTool.PUT, ((PUT) annotation).value(), true);
                        } else if (annotation instanceof OPTIONS) {
                            aVar.a(Constants.KEY_METHOD_OPTIONS, ((OPTIONS) annotation).value(), false);
                        } else if (annotation instanceof HTTP) {
                            HTTP http = (HTTP) annotation;
                            aVar.a(http.method(), http.path(), http.hasBody());
                        } else if (annotation instanceof Headers) {
                            String[] value = ((Headers) annotation).value();
                            if (value.length == 0) {
                                throw aVar.a("@Headers annotation is empty.", new Object[0]);
                            }
                            aVar.u = aVar.a(value);
                        } else if (annotation instanceof Multipart) {
                            if (aVar.p) {
                                throw aVar.a("Only one encoding annotation is allowed.", new Object[0]);
                            }
                            aVar.q = true;
                        } else if (annotation instanceof FormUrlEncoded) {
                            if (aVar.q) {
                                throw aVar.a("Only one encoding annotation is allowed.", new Object[0]);
                            }
                            aVar.p = true;
                        } else if (annotation instanceof AUTODOWNGRADE) {
                            aVar.r = true;
                        } else if (annotation instanceof GZIP) {
                            aVar.s = true;
                        }
                    }
                    if (aVar.n == null) {
                        throw aVar.a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                    }
                    if (!aVar.o) {
                        if (aVar.q) {
                            throw aVar.a("Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                        if (aVar.p) {
                            throw aVar.a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    }
                    int length = aVar.e.length;
                    aVar.x = new af[length];
                    for (int i = 0; i < length; i++) {
                        Type type = aVar.f[i];
                        if (av.d(type)) {
                            throw aVar.a(i, "Parameter type must not include a type variable or wildcard: %s", type);
                        }
                        Annotation[] annotationArr2 = aVar.e[i];
                        if (annotationArr2 == null) {
                            throw aVar.a(i, "No Retrofit annotation found.", new Object[0]);
                        }
                        aVar.x[i] = aVar.a(i, type, annotationArr2);
                    }
                    if (aVar.t == null && !aVar.m) {
                        throw aVar.a("Missing either @%s URL or @Url parameter.", aVar.n);
                    }
                    if (!aVar.p && !aVar.q && !aVar.o && aVar.j) {
                        throw aVar.a("Non-body HTTP method cannot contain @Body.", new Object[0]);
                    }
                    if (aVar.p && !aVar.h) {
                        throw aVar.a("Form-encoded method must contain at least one @Field.", new Object[0]);
                    }
                    if (aVar.q && !aVar.i) {
                        throw aVar.a("Multipart method must contain at least one @Part.", new Object[0]);
                    }
                    auVar = new au(aVar);
                }
                this.i.put(method, auVar);
            }
        }
        return auVar;
    }

    public final a.InterfaceC0637a a() {
        return this.b;
    }

    public final <T> i<T, ak> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Object[] objArr = {type, annotationArr, annotationArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c3399cf7153320bffb60f0e8e45cf14", 6917529027641081856L)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c3399cf7153320bffb60f0e8e45cf14");
        }
        Object[] objArr2 = {null, type, annotationArr, annotationArr2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd2fe027e069c4a9353be97ad1b89ac4", 6917529027641081856L)) {
            return (i) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd2fe027e069c4a9353be97ad1b89ac4");
        }
        av.a(type, "type == null");
        av.a(annotationArr, "parameterAnnotations == null");
        av.a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.d.indexOf(null) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            i<T, ak> iVar = (i<T, ak>) this.d.get(i).a(type, annotationArr, annotationArr2, this);
            if (iVar != null) {
                return iVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> i<T, String> a(Type type, Annotation[] annotationArr) {
        Object[] objArr = {type, annotationArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74719b2f0cb59d827af67a433f0d1d2f", 6917529027641081856L)) {
            return (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74719b2f0cb59d827af67a433f0d1d2f");
        }
        av.a(type, "type == null");
        av.a(annotationArr, "annotations == null");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            i<T, String> iVar = (i<T, String>) this.d.get(i).b(type, annotationArr, this);
            if (iVar != null) {
                return iVar;
            }
        }
        return c.d.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static final class a {
        public static ChangeQuickRedirect a;
        public com.sankuai.meituan.kernel.net.e b;
        public final boolean c;
        private ag d;
        private a.InterfaceC0637a e;
        @CallFactoryKey
        private String f;
        private com.sankuai.meituan.kernel.net.d g;
        private Executor h;
        private t i;
        private List<i.a> j;
        private List<e.a> k;
        private List<Interceptor> l;
        private Executor m;
        private boolean n;
        private com.sankuai.meituan.retrofit2.cache.a o;

        private a(ag agVar, boolean z) {
            Object[] objArr = {agVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5379a3a92e28abb4bcf6b982f8d04ef3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5379a3a92e28abb4bcf6b982f8d04ef3");
                return;
            }
            this.j = new ArrayList();
            this.k = new ArrayList();
            this.l = new ArrayList();
            this.d = agVar;
            this.c = z;
            this.j.add(new c());
        }

        public a() {
            this(ag.a(), false);
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0122312829529b7f8e5bad777ad1151f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0122312829529b7f8e5bad777ad1151f");
            }
        }

        public a(boolean z) {
            this(ag.a(), true);
            Object[] objArr = {(byte) 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b83ad34af2e4f0f61feda3cdf4b4129f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b83ad34af2e4f0f61feda3cdf4b4129f");
            }
        }

        public final a a(a.InterfaceC0637a interfaceC0637a) {
            Object[] objArr = {interfaceC0637a};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6272e5af6fcd6a2561ac57f5e98af06", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6272e5af6fcd6a2561ac57f5e98af06");
            }
            this.e = (a.InterfaceC0637a) av.a(interfaceC0637a, "factory == null");
            return this;
        }

        public final a a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d6ab7f8e11054b4783ab138b34f9feb", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d6ab7f8e11054b4783ab138b34f9feb");
            }
            av.a(str, "baseUrl == null");
            t e = t.e(str);
            if (e == null) {
                throw new IllegalArgumentException("Illegal URL: " + str);
            }
            return a(e);
        }

        public final a a(t tVar) {
            Object[] objArr = {tVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a4ff82900c1cd7b49ee6248827aea9e", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a4ff82900c1cd7b49ee6248827aea9e");
            }
            av.a(tVar, "baseUrl == null");
            List<String> list = tVar.b;
            if (!"".equals(list.get(list.size() - 1))) {
                throw new IllegalArgumentException("baseUrl must end in /: " + tVar);
            }
            this.i = tVar;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final a a(i.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e06dc1e09abd980d8e6b81ea457711e", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e06dc1e09abd980d8e6b81ea457711e");
            }
            this.j.add(av.a(aVar, "factory == null"));
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final a a(e.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc83760e877b3b003a3b4b100621568d", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc83760e877b3b003a3b4b100621568d");
            }
            this.k.add(av.a(aVar, "factory == null"));
            return this;
        }

        public final a a(Interceptor interceptor) {
            Object[] objArr = {interceptor};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aa4a2ec058ff08de029e43912147b59", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aa4a2ec058ff08de029e43912147b59");
            }
            if (interceptor == null) {
                throw new NullPointerException("interceptor == null");
            }
            this.l.add(interceptor);
            return this;
        }

        public final a a(List<Interceptor> list) {
            Object[] objArr = {list};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "676e7c4bfcce8d62afdde4da79291baf", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "676e7c4bfcce8d62afdde4da79291baf");
            }
            if (list == null) {
                throw new NullPointerException("interceptors==null");
            }
            if (!list.isEmpty()) {
                this.l.addAll(list);
            }
            return this;
        }

        public final a a(Executor executor) {
            Object[] objArr = {executor};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b82b0a54fd179a4c3fe2480a2c1ab31", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b82b0a54fd179a4c3fe2480a2c1ab31");
            }
            this.h = (Executor) av.a(executor, "executor == null");
            return this;
        }

        public final a b(Executor executor) {
            Object[] objArr = {executor};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9288342f3d5b131bc0edd4b059a5c961", 6917529027641081856L)) {
                return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9288342f3d5b131bc0edd4b059a5c961");
            }
            this.m = (Executor) av.a(executor, "executor == null");
            return this;
        }

        public final ar a() {
            a.InterfaceC0637a interfaceC0637a;
            c.a aVar;
            a.InterfaceC0637a interfaceC0637a2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e74ef477b43097a5546beb43e363d1db", 6917529027641081856L)) {
                return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e74ef477b43097a5546beb43e363d1db");
            }
            if (this.i == null) {
                throw new IllegalStateException("Base URL required.");
            }
            if (!this.c) {
                String str = this.f;
                if (str != null) {
                    interfaceC0637a2 = com.meituan.android.singleton.i.a(str);
                } else if (this.g != null) {
                    interfaceC0637a2 = com.meituan.android.singleton.i.a(this.g);
                } else {
                    interfaceC0637a2 = this.e;
                }
                if (interfaceC0637a2 == null) {
                    interfaceC0637a2 = com.meituan.android.singleton.i.a();
                }
                interfaceC0637a = interfaceC0637a2;
                aVar = null;
            } else if (this.b != null) {
                aVar = com.meituan.android.singleton.i.a(this.b);
                interfaceC0637a = null;
            } else {
                interfaceC0637a = null;
                aVar = null;
            }
            Executor executor = this.h;
            if (executor == null && (executor = ar.p) == null) {
                executor = this.d.b();
            }
            Executor executor2 = executor;
            Executor executor3 = this.m;
            if (executor3 == null) {
                executor3 = this.d.c();
            }
            Executor executor4 = executor3;
            ArrayList arrayList = new ArrayList(this.k);
            arrayList.add(this.d.a(executor4));
            return new ar(interfaceC0637a, this.i, new ArrayList(this.j), arrayList, this.l, executor2, executor4, this.n, this.o, aVar);
        }
    }
}

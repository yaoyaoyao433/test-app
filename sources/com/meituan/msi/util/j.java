package com.meituan.msi.util;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.mock.a;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class j {
    private static boolean a = true;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        private static Interceptor b;
        private static Interceptor c;

        public static synchronized Interceptor a() {
            synchronized (b.class) {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68dd125ab923f2d237c80b5ca6b2a902", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68dd125ab923f2d237c80b5ca6b2a902");
                }
                if (b == null) {
                    b = new Interceptor() { // from class: com.meituan.msi.util.j.b.1
                        public static ChangeQuickRedirect a;

                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) throws IOException {
                            Object[] objArr2 = {chain};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a4ebc030c6c37fe4ab25852bb38b0b53", RobustBitConfig.DEFAULT_VALUE) ? (Response) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a4ebc030c6c37fe4ab25852bb38b0b53") : chain.proceed(chain.request().newBuilder().build());
                        }
                    };
                }
                return b;
            }
        }

        public static synchronized Interceptor b() {
            synchronized (b.class) {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9c6010114eead659df7bab76e0a64a8a", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9c6010114eead659df7bab76e0a64a8a");
                }
                if (c == null) {
                    c = new Interceptor() { // from class: com.meituan.msi.util.j.b.2
                        public static ChangeQuickRedirect a;

                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) throws IOException {
                            Object[] objArr2 = {chain};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86847a3768b8f175ce3061dfa511d4be", RobustBitConfig.DEFAULT_VALUE)) {
                                return (Response) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86847a3768b8f175ce3061dfa511d4be");
                            }
                            try {
                                return chain.proceed(chain.request());
                            } catch (Throwable th) {
                                if (th instanceof IOException) {
                                    throw th;
                                }
                                throw new IOException(th);
                            }
                        }
                    };
                }
                return c;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        private static com.sankuai.meituan.retrofit2.Interceptor b;
        private static com.sankuai.meituan.retrofit2.Interceptor c;
        private static a d;

        public static synchronized List<com.sankuai.meituan.retrofit2.Interceptor> a(boolean z) {
            synchronized (c.class) {
                Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "942aa108f360281e06bdd9db1b56cc4b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "942aa108f360281e06bdd9db1b56cc4b");
                }
                ArrayList arrayList = new ArrayList();
                if (com.meituan.msi.a.i()) {
                    arrayList.add(c());
                }
                arrayList.add(a());
                if (z) {
                    arrayList.add(b());
                }
                return arrayList;
            }
        }

        private static synchronized com.sankuai.meituan.retrofit2.Interceptor a() {
            synchronized (c.class) {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6020367cb4258d8d9c53a60e92cb032", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.meituan.retrofit2.Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6020367cb4258d8d9c53a60e92cb032");
                }
                if (b == null) {
                    b = new com.sankuai.meituan.retrofit2.Interceptor() { // from class: com.meituan.msi.util.j.c.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.retrofit2.Interceptor
                        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
                            Object[] objArr2 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e5c9e51d8cd5f730253ddc7b41ad9c1", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e5c9e51d8cd5f730253ddc7b41ad9c1") : aVar.a(aVar.request().a().a());
                        }
                    };
                }
                return b;
            }
        }

        private static synchronized com.sankuai.meituan.retrofit2.Interceptor b() {
            synchronized (c.class) {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "400226182ecf33ec9c9907c007debd05", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.meituan.retrofit2.Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "400226182ecf33ec9c9907c007debd05");
                }
                if (c == null) {
                    c = new com.sankuai.meituan.retrofit2.mock.a(com.meituan.msi.a.f(), new a.InterfaceC0636a() { // from class: com.meituan.msi.util.j.c.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.retrofit2.mock.a.InterfaceC0636a
                        public final String a() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a78768cd7c33a152df4ef72a48493bcc", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a78768cd7c33a152df4ef72a48493bcc") : com.meituan.msi.a.a().b();
                        }
                    });
                }
                return c;
            }
        }

        private static synchronized a c() {
            synchronized (c.class) {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ee842ac101d444167473642af88679c6", RobustBitConfig.DEFAULT_VALUE)) {
                    return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ee842ac101d444167473642af88679c6");
                }
                if (d == null) {
                    d = new a(com.meituan.msi.a.f());
                }
                return d;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class d implements com.sankuai.meituan.retrofit2.Interceptor {
        public static ChangeQuickRedirect a;
        private com.sankuai.meituan.retrofit2.Interceptor b;
        private com.sankuai.meituan.retrofit2.Interceptor c;

        public d(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cd0302933fa710d00aaaefbdfd36d6c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cd0302933fa710d00aaaefbdfd36d6c");
                return;
            }
            this.b = null;
            this.c = null;
            try {
                try {
                    this.b = (com.sankuai.meituan.retrofit2.Interceptor) Class.forName("com.meituan.android.common.candy.MtRetrofitInterceptor").getConstructor(Context.class).newInstance(context);
                } catch (Exception unused) {
                    this.c = (com.sankuai.meituan.retrofit2.Interceptor) Class.forName("com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.MtRetrofitInterceptor").getConstructor(new Class[0]).newInstance(new Object[0]);
                }
            } catch (Throwable unused2) {
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35cb08b68c47a15ec5c76e8859012a6d", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35cb08b68c47a15ec5c76e8859012a6d");
            }
            if (this.b != null) {
                return this.b.intercept(aVar);
            }
            if (this.c != null) {
                return this.c.intercept(aVar);
            }
            return aVar.a(aVar.request());
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class e implements com.sankuai.meituan.retrofit2.Interceptor {
        public static ChangeQuickRedirect a;
        private Method b;

        public e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc71ad72292a1a18d9f07338b278ca4d", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc71ad72292a1a18d9f07338b278ca4d");
                return;
            }
            this.b = null;
            try {
                try {
                    this.b = Class.forName("com.meituan.android.common.mtguard.MTGuard").getDeclaredMethod("userIdentification", new Class[0]);
                } catch (Exception unused) {
                    this.b = Class.forName("com.meituan.android.common.mtguard.MTGuard").getDeclaredMethod("siua", new Class[0]);
                }
            } catch (Throwable unused2) {
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82cb4be46e11b81e227f6730d1df5955", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82cb4be46e11b81e227f6730d1df5955");
            }
            aj request = aVar.request();
            if (this.b != null) {
                try {
                    String str = new String((byte[]) this.b.invoke(null, new Object[0]));
                    aj.a a2 = request.a();
                    a2.b("siua", str);
                    request = a2.a();
                } catch (Throwable unused) {
                }
            }
            return aVar.a(request);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a implements com.sankuai.meituan.retrofit2.Interceptor {
        public static ChangeQuickRedirect a;
        public Context b;

        public a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bec83c2dd7fa8781ef868f35d8d93226", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bec83c2dd7fa8781ef868f35d8d93226");
            } else if (context != null) {
                this.b = context.getApplicationContext();
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a58aec57c2cfea369ad0f1af188c360f", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a58aec57c2cfea369ad0f1af188c360f");
            }
            aj request = aVar.request();
            if (this.b != null && request != null) {
                String a2 = com.sankuai.meituan.switchtestenv.a.a(this.b, request.b());
                if (!TextUtils.isEmpty(a2)) {
                    request = request.a().b(a2).a();
                }
            }
            return aVar.a(request);
        }
    }

    public static boolean a() {
        return a;
    }
}

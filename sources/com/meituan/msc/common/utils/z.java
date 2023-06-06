package com.meituan.msc.common.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.devtools.DebugHelper;
import com.meituan.msc.util.perf.PerfTrace;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class z {
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
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6834454107bd27badd34581121e21d7", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6834454107bd27badd34581121e21d7");
                }
                if (b == null) {
                    b = new Interceptor() { // from class: com.meituan.msc.common.utils.z.b.1
                        public static ChangeQuickRedirect a;

                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) throws IOException {
                            Object[] objArr2 = {chain};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "90674290abb007cc0caab95f09da36c4", RobustBitConfig.DEFAULT_VALUE)) {
                                return (Response) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "90674290abb007cc0caab95f09da36c4");
                            }
                            Request.Builder newBuilder = chain.request().newBuilder();
                            if (com.meituan.msc.modules.update.f.e != null) {
                                newBuilder.header("User-Agent", u.a(com.meituan.msc.modules.update.f.e));
                            }
                            return chain.proceed(newBuilder.build());
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
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d35e1ef3c76641c126594e36012d8634", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d35e1ef3c76641c126594e36012d8634");
                }
                if (c == null) {
                    c = new Interceptor() { // from class: com.meituan.msc.common.utils.z.b.2
                        public static ChangeQuickRedirect a;

                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) throws IOException {
                            Object[] objArr2 = {chain};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b5a0ce83e0a0c08aac353c11f2ad6c6", RobustBitConfig.DEFAULT_VALUE)) {
                                return (Response) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b5a0ce83e0a0c08aac353c11f2ad6c6");
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

        public static synchronized List<com.sankuai.meituan.retrofit2.Interceptor> a(boolean z) {
            synchronized (c.class) {
                Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3bf6f1fd4dd2916e2746f7d935cc7152", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3bf6f1fd4dd2916e2746f7d935cc7152");
                }
                ArrayList arrayList = new ArrayList();
                if (DebugHelper.a()) {
                    arrayList.add(new a(MSCEnvHelper.getContext()));
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
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "952d7a497d185e9d885f60eb9f88adec", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.meituan.retrofit2.Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "952d7a497d185e9d885f60eb9f88adec");
                }
                if (b == null) {
                    b = new com.sankuai.meituan.retrofit2.Interceptor() { // from class: com.meituan.msc.common.utils.z.c.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.retrofit2.Interceptor
                        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
                            Object[] objArr2 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "50a1c18ffae32cc780e0694cca8826e0", RobustBitConfig.DEFAULT_VALUE)) {
                                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "50a1c18ffae32cc780e0694cca8826e0");
                            }
                            aj.a a2 = aVar.request().a();
                            if (com.meituan.msc.modules.update.f.e != null) {
                                a2.a("User-Agent", u.a(com.meituan.msc.modules.update.f.e));
                            }
                            return aVar.a(a2.a());
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
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a25e0c46c3b5fa7eafb80ec8ee4d1810", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.meituan.retrofit2.Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a25e0c46c3b5fa7eafb80ec8ee4d1810");
                }
                if (c == null) {
                    c = new com.sankuai.meituan.retrofit2.mock.a(MSCEnvHelper.getContext(), aa.b());
                }
                return c;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class d implements com.sankuai.meituan.retrofit2.Interceptor {
        public static ChangeQuickRedirect a;
        private com.sankuai.meituan.retrofit2.Interceptor b;

        public d(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cbc311b73b4a038072c28be21c8f6db", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cbc311b73b4a038072c28be21c8f6db");
                return;
            }
            this.b = null;
            try {
                try {
                    this.b = (com.sankuai.meituan.retrofit2.Interceptor) Class.forName("com.meituan.android.common.candy.MtRetrofitInterceptor").getConstructor(Context.class).newInstance(context);
                } catch (Exception e) {
                    com.meituan.msc.modules.reporter.g.a("SignInterceptor", "init :used V4," + e);
                    this.b = (com.sankuai.meituan.retrofit2.Interceptor) Class.forName("com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.MtRetrofitInterceptor").getConstructor(new Class[0]).newInstance(new Object[0]);
                }
            } catch (Throwable th) {
                com.meituan.msc.modules.reporter.g.a("SignInterceptor", "init :" + th);
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public final com.sankuai.meituan.retrofit2.raw.b intercept(final Interceptor.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc093d00efcd3912faef92d810a930f6", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc093d00efcd3912faef92d810a930f6");
            }
            if (this.b != null) {
                PerfTrace.online().a("SignInterceptorBefore");
                com.sankuai.meituan.retrofit2.raw.b intercept = this.b.intercept(new Interceptor.a() { // from class: com.meituan.msc.common.utils.z.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.meituan.retrofit2.Interceptor.a
                    public final com.sankuai.meituan.retrofit2.aj request() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "01b35d39f1ef4fd57ada54afedd959ef", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.retrofit2.aj) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "01b35d39f1ef4fd57ada54afedd959ef") : aVar.request();
                    }

                    @Override // com.sankuai.meituan.retrofit2.Interceptor.a
                    public final com.sankuai.meituan.retrofit2.raw.b a(com.sankuai.meituan.retrofit2.aj ajVar) throws IOException {
                        Object[] objArr2 = {ajVar};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73e8569aee85ef25ee73a53e14e259d4", RobustBitConfig.DEFAULT_VALUE)) {
                            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73e8569aee85ef25ee73a53e14e259d4");
                        }
                        PerfTrace.online().b("SignInterceptorBefore");
                        com.sankuai.meituan.retrofit2.raw.b a2 = aVar.a(ajVar);
                        PerfTrace.online().a("SignInterceptorAfter");
                        return a2;
                    }
                });
                PerfTrace.online().b("SignInterceptorAfter");
                return intercept;
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db7f9c402b27671e91071d29c892b6df", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db7f9c402b27671e91071d29c892b6df");
                return;
            }
            this.b = null;
            try {
                try {
                    this.b = Class.forName("com.meituan.android.common.mtguard.MTGuard").getDeclaredMethod("userIdentification", new Class[0]);
                } catch (Exception unused) {
                    this.b = Class.forName("com.meituan.android.common.mtguard.MTGuard").getDeclaredMethod("siua", new Class[0]);
                }
            } catch (Throwable th) {
                com.meituan.msc.modules.reporter.g.a("SiuaInterceptor", "init :" + th);
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d2e7de0310c8f5e88ef342ab8d4684", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d2e7de0310c8f5e88ef342ab8d4684");
            }
            com.sankuai.meituan.retrofit2.aj request = aVar.request();
            if (this.b != null) {
                PerfTrace.online().a("SiuaHandle");
                try {
                    byte[] bArr = (byte[]) this.b.invoke(null, new Object[0]);
                    if (bArr != null) {
                        String str = new String(bArr);
                        aj.a a2 = request.a();
                        a2.b("siua", str);
                        request = a2.a();
                    } else {
                        com.meituan.msc.modules.reporter.g.a("SiuaInterceptor", "siua null");
                    }
                } catch (Throwable th) {
                    com.meituan.msc.modules.reporter.g.a("SiuaInterceptor", "intercept :" + th);
                }
                PerfTrace.online().b("SiuaHandle");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07713365be0078d4caa215bd203f57a5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07713365be0078d4caa215bd203f57a5");
            } else {
                this.b = context;
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4375581e10095d111505dbabaabc3971", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4375581e10095d111505dbabaabc3971");
            }
            com.sankuai.meituan.retrofit2.aj request = aVar.request();
            if (request != null) {
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

package com.meituan.mmp.lib.utils;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.mmp.lib.DebugHelper;
import com.meituan.mmp.main.MMPEnvHelper;
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
public final class aa {
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
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f4a6aeffaa5d65a713a0a548b7b71d4b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f4a6aeffaa5d65a713a0a548b7b71d4b");
                }
                if (b == null) {
                    b = new Interceptor() { // from class: com.meituan.mmp.lib.utils.aa.b.1
                        public static ChangeQuickRedirect a;

                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) throws IOException {
                            Object[] objArr2 = {chain};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "062f05f90b59e646d0074fd10efa3db9", RobustBitConfig.DEFAULT_VALUE)) {
                                return (Response) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "062f05f90b59e646d0074fd10efa3db9");
                            }
                            Request.Builder newBuilder = chain.request().newBuilder();
                            if (com.meituan.mmp.lib.config.a.b != null) {
                                newBuilder.header("User-Agent", w.a(com.meituan.mmp.lib.config.a.b));
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
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b6254c66689378c6a987b59169c3510d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b6254c66689378c6a987b59169c3510d");
                }
                if (c == null) {
                    c = new Interceptor() { // from class: com.meituan.mmp.lib.utils.aa.b.2
                        public static ChangeQuickRedirect a;

                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) throws IOException {
                            Object[] objArr2 = {chain};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd5f5c103be5aac419fef1023b2b9cb0", RobustBitConfig.DEFAULT_VALUE)) {
                                return (Response) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd5f5c103be5aac419fef1023b2b9cb0");
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
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f365b2e17aab5e61c993842e61795eec", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f365b2e17aab5e61c993842e61795eec");
                }
                ArrayList arrayList = new ArrayList();
                if (DebugHelper.b()) {
                    arrayList.add(new a(MMPEnvHelper.getContext()));
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
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3d98e79ceca2bf8a9806a2c75ccf815b", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.meituan.retrofit2.Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3d98e79ceca2bf8a9806a2c75ccf815b");
                }
                if (b == null) {
                    b = new com.sankuai.meituan.retrofit2.Interceptor() { // from class: com.meituan.mmp.lib.utils.aa.c.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.retrofit2.Interceptor
                        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
                            Object[] objArr2 = {aVar};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7bbd1342f65cbe260799bcb79dc198fc", RobustBitConfig.DEFAULT_VALUE)) {
                                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7bbd1342f65cbe260799bcb79dc198fc");
                            }
                            aj.a a2 = aVar.request().a();
                            if (com.meituan.mmp.lib.config.a.b != null) {
                                a2.a("User-Agent", w.a(com.meituan.mmp.lib.config.a.b));
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
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4637d82d76e2861eaf14449642be0c4c", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.meituan.retrofit2.Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4637d82d76e2861eaf14449642be0c4c");
                }
                if (c == null) {
                    c = new com.sankuai.meituan.retrofit2.mock.a(MMPEnvHelper.getContext(), ab.b());
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
        private com.sankuai.meituan.retrofit2.Interceptor c;

        public d(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50661523016f8b1669afdce0d3432f67", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50661523016f8b1669afdce0d3432f67");
                return;
            }
            this.b = null;
            this.c = null;
            try {
                try {
                    this.b = (com.sankuai.meituan.retrofit2.Interceptor) Class.forName("com.meituan.android.common.candy.MtRetrofitInterceptor").getConstructor(Context.class).newInstance(context);
                } catch (Exception e) {
                    com.meituan.mmp.lib.trace.b.d("SignInterceptor", "init :used V4," + e);
                    this.c = (com.sankuai.meituan.retrofit2.Interceptor) Class.forName("com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.MtRetrofitInterceptor").getConstructor(new Class[0]).newInstance(new Object[0]);
                }
            } catch (Throwable th) {
                com.meituan.mmp.lib.trace.b.d("SignInterceptor", "init :" + th);
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b140444db884be562470dde087c99faa", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b140444db884be562470dde087c99faa");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d808c1d404f58ccea9017035df86d2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d808c1d404f58ccea9017035df86d2");
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
                com.meituan.mmp.lib.trace.b.d("SiuaInterceptor", "init :" + th);
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e439d9686c2ddd5137cdb04a31daf201", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e439d9686c2ddd5137cdb04a31daf201");
            }
            com.sankuai.meituan.retrofit2.aj request = aVar.request();
            if (this.b != null) {
                try {
                    byte[] bArr = (byte[]) this.b.invoke(null, new Object[0]);
                    if (bArr != null) {
                        String str = new String(bArr);
                        aj.a a2 = request.a();
                        a2.b("siua", str);
                        request = a2.a();
                    } else {
                        com.meituan.mmp.lib.trace.b.d("SiuaInterceptor", "siua null");
                    }
                } catch (Throwable th) {
                    com.meituan.mmp.lib.trace.b.d("SiuaInterceptor", "intercept :" + th);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ab4369170cf3cd1512f751e3d7c77da", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ab4369170cf3cd1512f751e3d7c77da");
            } else {
                this.b = context;
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c321fc5ef5d3cf12d0babec4507a6fc", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c321fc5ef5d3cf12d0babec4507a6fc");
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

package com.sankuai.meituan.kernel.net.msi.interceptor;

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
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class b {
        public static ChangeQuickRedirect a;
        private static Interceptor b;

        public static synchronized Interceptor a() {
            synchronized (b.class) {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ed80277c58e1b89215502a03e4bbfb9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ed80277c58e1b89215502a03e4bbfb9");
                }
                if (b == null) {
                    b = new Interceptor() { // from class: com.sankuai.meituan.kernel.net.msi.interceptor.a.b.1
                        public static ChangeQuickRedirect a;

                        @Override // okhttp3.Interceptor
                        public final Response intercept(Interceptor.Chain chain) throws IOException {
                            Object[] objArr2 = {chain};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "535e44e177c3ca15bfd5b94691104a69", RobustBitConfig.DEFAULT_VALUE)) {
                                return (Response) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "535e44e177c3ca15bfd5b94691104a69");
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
                return b;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        private static com.sankuai.meituan.retrofit2.Interceptor b;
        private static C0591a c;

        public static synchronized List<com.sankuai.meituan.retrofit2.Interceptor> a(boolean z) {
            synchronized (c.class) {
                Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c9a5c03308ab99c4e088567f7f4ea0a4", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c9a5c03308ab99c4e088567f7f4ea0a4");
                }
                ArrayList arrayList = new ArrayList();
                if (com.meituan.msi.a.i()) {
                    arrayList.add(b());
                }
                if (z) {
                    arrayList.add(a());
                }
                return arrayList;
            }
        }

        private static synchronized com.sankuai.meituan.retrofit2.Interceptor a() {
            synchronized (c.class) {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bec52868995e2de3627ec440546f1398", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.meituan.retrofit2.Interceptor) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bec52868995e2de3627ec440546f1398");
                }
                if (b == null) {
                    b = new com.sankuai.meituan.retrofit2.mock.a(com.meituan.msi.a.f(), new a.InterfaceC0636a() { // from class: com.sankuai.meituan.kernel.net.msi.interceptor.a.c.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.retrofit2.mock.a.InterfaceC0636a
                        public final String a() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1659775d53ec6511902c623a45111034", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1659775d53ec6511902c623a45111034") : com.meituan.msi.a.a().b();
                        }
                    });
                }
                return b;
            }
        }

        private static synchronized C0591a b() {
            synchronized (c.class) {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8e59e193f6e2abcc41bd009f96d0dc34", RobustBitConfig.DEFAULT_VALUE)) {
                    return (C0591a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8e59e193f6e2abcc41bd009f96d0dc34");
                }
                if (c == null) {
                    c = new C0591a(com.meituan.msi.a.f());
                }
                return c;
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class d implements com.sankuai.meituan.retrofit2.Interceptor {
        public static ChangeQuickRedirect a;
        private com.sankuai.meituan.retrofit2.Interceptor b;
        private com.sankuai.meituan.retrofit2.Interceptor c;

        public d(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d40b5750b3712512fdbe1df066940ecd", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d40b5750b3712512fdbe1df066940ecd");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d94f125530305b596bea61231e2369ec", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d94f125530305b596bea61231e2369ec");
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
    /* loaded from: classes4.dex */
    public static class e implements com.sankuai.meituan.retrofit2.Interceptor {
        public static ChangeQuickRedirect a;
        private Method b;

        public e() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3da7f77b3e77706b64f72ef42b40bf9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3da7f77b3e77706b64f72ef42b40bf9");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d7a43a8838ad3a32ed39117f0de4030", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d7a43a8838ad3a32ed39117f0de4030");
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
    /* renamed from: com.sankuai.meituan.kernel.net.msi.interceptor.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0591a implements com.sankuai.meituan.retrofit2.Interceptor {
        public static ChangeQuickRedirect a;
        public Context b;

        public C0591a(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de8452f83996b8ecb802d635d3b15dfa", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de8452f83996b8ecb802d635d3b15dfa");
            } else if (context != null) {
                this.b = context.getApplicationContext();
            }
        }

        @Override // com.sankuai.meituan.retrofit2.Interceptor
        public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3f279174132730d4cbbe01462a91e36", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3f279174132730d4cbbe01462a91e36");
            }
            aj request = aVar.request();
            if (this.b != null && request != null) {
                String a2 = com.sankuai.meituan.switchtestenv.a.a(this.b, request.e);
                if (!TextUtils.isEmpty(a2)) {
                    aj.a a3 = request.a();
                    a3.b = a2;
                    request = a3.a();
                }
            }
            return aVar.a(request);
        }
    }
}

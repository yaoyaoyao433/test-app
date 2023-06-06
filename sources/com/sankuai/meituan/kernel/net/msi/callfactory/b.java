package com.sankuai.meituan.kernel.net.msi.callfactory;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.e;
import com.sankuai.meituan.kernel.net.msi.interceptor.a;
import com.sankuai.meituan.kernel.net.msi.okhttp3.c;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static Dispatcher b;

    public static /* synthetic */ Dispatcher a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c94a5fff9f2537939c1049a1ac9f1b12", RobustBitConfig.DEFAULT_VALUE)) {
            return (Dispatcher) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c94a5fff9f2537939c1049a1ac9f1b12");
        }
        if (b == null) {
            Dispatcher dispatcher = new Dispatcher();
            b = dispatcher;
            dispatcher.setMaxRequests(20);
            b.setMaxRequestsPerHost(20);
        }
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        if (r13.equals("webSocket") != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.sankuai.meituan.kernel.net.d a(java.lang.String r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.kernel.net.msi.callfactory.b.a
            java.lang.String r11 = "45b7b93ef386f533780ddb4ccba19dfd"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            com.sankuai.meituan.kernel.net.d r13 = (com.sankuai.meituan.kernel.net.d) r13
            return r13
        L1e:
            r1 = -1
            int r2 = r13.hashCode()
            r3 = -1145698329(0xffffffffbbb607e7, float:-0.0055551413)
            if (r2 == r3) goto L58
            r0 = -838595071(0xffffffffce040e01, float:-5.5387757E8)
            if (r2 == r0) goto L4d
            r0 = 1095692943(0x414ef28f, float:12.934218)
            if (r2 == r0) goto L42
            r0 = 1427818632(0x551ac888, float:1.06366291E13)
            if (r2 == r0) goto L38
            goto L62
        L38:
            java.lang.String r0 = "download"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L62
            r0 = 3
            goto L63
        L42:
            java.lang.String r0 = "request"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L62
            r0 = 0
            goto L63
        L4d:
            java.lang.String r0 = "upload"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L62
            r0 = 2
            goto L63
        L58:
            java.lang.String r2 = "webSocket"
            boolean r13 = r13.equals(r2)
            if (r13 == 0) goto L62
            goto L63
        L62:
            r0 = -1
        L63:
            r13 = 0
            switch(r0) {
                case 0: goto L7a;
                case 1: goto L74;
                case 2: goto L6e;
                case 3: goto L68;
                default: goto L67;
            }
        L67:
            return r13
        L68:
            com.sankuai.meituan.kernel.net.msi.callfactory.b$a r0 = new com.sankuai.meituan.kernel.net.msi.callfactory.b$a
            r0.<init>()
            return r0
        L6e:
            com.sankuai.meituan.kernel.net.msi.callfactory.b$c r0 = new com.sankuai.meituan.kernel.net.msi.callfactory.b$c
            r0.<init>()
            return r0
        L74:
            com.sankuai.meituan.kernel.net.msi.callfactory.b$d r0 = new com.sankuai.meituan.kernel.net.msi.callfactory.b$d
            r0.<init>()
            return r0
        L7a:
            com.sankuai.meituan.kernel.net.msi.callfactory.b$b r0 = new com.sankuai.meituan.kernel.net.msi.callfactory.b$b
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.kernel.net.msi.callfactory.b.a(java.lang.String):com.sankuai.meituan.kernel.net.d");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.kernel.net.msi.callfactory.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0589b extends com.sankuai.meituan.kernel.net.d {
        public static ChangeQuickRedirect a;

        @Override // com.sankuai.meituan.kernel.net.d
        public final boolean a() {
            return true;
        }

        public C0589b() {
        }

        @Override // com.sankuai.meituan.kernel.net.d
        public final void a(@NonNull OkHttpClient.Builder builder) {
            Object[] objArr = {builder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20559a18285b636d49ad2d9f440a9a0c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20559a18285b636d49ad2d9f440a9a0c");
            } else {
                builder.dispatcher(b.a()).connectTimeout(10000L, TimeUnit.MILLISECONDS).readTimeout(10000L, TimeUnit.MILLISECONDS).writeTimeout(10000L, TimeUnit.MILLISECONDS).addInterceptor(a.b.a()).addInterceptor(new com.sankuai.meituan.kernel.net.msi.okhttp3.b()).eventListener(new c.a());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class d extends e {
        public static ChangeQuickRedirect a;

        public d() {
        }

        @Override // com.sankuai.meituan.kernel.net.d
        public final void a(@NonNull OkHttpClient.Builder builder) {
            Object[] objArr = {builder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4632b3210ecdd2ffafa2b93222d2f592", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4632b3210ecdd2ffafa2b93222d2f592");
            } else {
                builder.dispatcher(b.a()).connectTimeout(10000L, TimeUnit.MILLISECONDS).readTimeout(10000L, TimeUnit.MILLISECONDS).writeTimeout(10000L, TimeUnit.MILLISECONDS).addInterceptor(a.b.a());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class c extends com.sankuai.meituan.kernel.net.d {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // com.sankuai.meituan.kernel.net.d
        public final void a(@NonNull OkHttpClient.Builder builder) {
            Object[] objArr = {builder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80e7d57fc2f1b7cdec63cd8af5953941", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80e7d57fc2f1b7cdec63cd8af5953941");
            } else {
                builder.dispatcher(b.a()).connectTimeout(10000L, TimeUnit.MILLISECONDS).readTimeout(10000L, TimeUnit.MILLISECONDS).writeTimeout(10000L, TimeUnit.MILLISECONDS).addInterceptor(a.b.a());
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a extends com.sankuai.meituan.kernel.net.d {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.sankuai.meituan.kernel.net.d
        public final void a(@NonNull OkHttpClient.Builder builder) {
            Object[] objArr = {builder};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "084de8f55b0b13b1e75147c7b7481b4c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "084de8f55b0b13b1e75147c7b7481b4c");
            } else {
                builder.dispatcher(b.a()).connectTimeout(10000L, TimeUnit.MILLISECONDS).readTimeout(10000L, TimeUnit.MILLISECONDS).writeTimeout(10000L, TimeUnit.MILLISECONDS).addInterceptor(a.b.a()).addInterceptor(new com.sankuai.meituan.kernel.net.msi.okhttp3.b()).eventListener(new c.a());
            }
        }
    }
}

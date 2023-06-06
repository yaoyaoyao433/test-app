package com.sankuai.meituan.kernel.net.okhttp3;

import android.content.Context;
import com.meituan.android.cipstorage.ah;
import com.meituan.android.cipstorage.x;
import com.meituan.android.mrn.engine.MRNBundleManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import okhttp3.Interceptor;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class q implements ah, Interceptor {
    public static ChangeQuickRedirect a;
    private static final String[] h = {".jpg", ".jpeg", ".png", ".webp", ".gif", ".ico", ".icon", ".svg", ".bmp"};
    private static final String[] i = {MRNBundleManager.MRN_BUNDLE_SUFFIX, ".js", ".css", ".map", ".html", ".ttf", ".eot", ".otf", ".woff"};
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    private String f;
    private String g;

    public q(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07a717666cd4fa7d8c5f5fda6bef2f1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07a717666cd4fa7d8c5f5fda6bef2f1c");
            return;
        }
        this.b = false;
        this.c = true;
        this.d = true;
        String str = com.sankuai.meituan.kernel.net.base.c.b.getPackageName() + "_preferences";
        com.meituan.android.cipstorage.q a2 = com.sankuai.meituan.kernel.net.utils.d.a(com.sankuai.meituan.kernel.net.base.c.b);
        a2.a(this);
        x a3 = x.a(a2);
        b(a3, null, str);
        a(a3, (com.meituan.android.cipstorage.q) null, str);
        c(a3, null, str);
        d(a3, null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x008b  */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r13) throws java.io.IOException {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.kernel.net.okhttp3.q.a
            java.lang.String r11 = "62d9cf5a96ce51965074da60637c6b7f"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            okhttp3.Response r13 = (okhttp3.Response) r13
            return r13
        L1e:
            okhttp3.Request r1 = r13.request()
            boolean r2 = r12.b
            if (r2 == 0) goto Ld6
            okhttp3.HttpUrl r2 = r1.url()
            boolean r3 = r12.c
            if (r3 != 0) goto L32
            boolean r3 = r12.d
            if (r3 == 0) goto L88
        L32:
            java.util.List r3 = r2.pathSegments()
            if (r3 == 0) goto L88
            int r4 = r3.size()
            if (r4 <= 0) goto L88
            int r4 = r3.size()
            int r4 = r4 - r0
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L88
            java.lang.String r3 = r3.toLowerCase()
            boolean r4 = r12.c
            if (r4 == 0) goto L6c
            r4 = 0
        L58:
            java.lang.String[] r5 = com.sankuai.meituan.kernel.net.okhttp3.q.h
            int r5 = r5.length
            if (r4 >= r5) goto L6c
            java.lang.String[] r5 = com.sankuai.meituan.kernel.net.okhttp3.q.h
            r5 = r5[r4]
            boolean r5 = r3.endsWith(r5)
            if (r5 == 0) goto L69
            r4 = 1
            goto L6d
        L69:
            int r4 = r4 + 1
            goto L58
        L6c:
            r4 = 0
        L6d:
            boolean r5 = r12.d
            if (r5 == 0) goto L86
            if (r4 != 0) goto L86
        L73:
            java.lang.String[] r5 = com.sankuai.meituan.kernel.net.okhttp3.q.i
            int r5 = r5.length
            if (r9 >= r5) goto L86
            java.lang.String[] r5 = com.sankuai.meituan.kernel.net.okhttp3.q.i
            r5 = r5[r9]
            boolean r5 = r3.endsWith(r5)
            if (r5 == 0) goto L83
            goto L89
        L83:
            int r9 = r9 + 1
            goto L73
        L86:
            r0 = r4
            goto L89
        L88:
            r0 = 0
        L89:
            if (r0 != 0) goto Ld6
            okhttp3.HttpUrl$Builder r0 = r2.newBuilder()
            java.lang.String r3 = r12.e
            okhttp3.HttpUrl$Builder r0 = r0.host(r3)
            okhttp3.Request$Builder r1 = r1.newBuilder()
            okhttp3.HttpUrl r0 = r0.build()
            okhttp3.Request$Builder r0 = r1.url(r0)
            java.lang.String r1 = "Portm-Target"
            java.lang.String r2 = r2.host()
            okhttp3.Request$Builder r0 = r0.addHeader(r1, r2)
            java.lang.String r1 = "Portm-Proxy"
            java.lang.String r2 = "v1.0"
            okhttp3.Request$Builder r0 = r0.addHeader(r1, r2)
            java.lang.String r1 = r12.f
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lc3
            java.lang.String r1 = "Portm-Token"
            java.lang.String r2 = r12.f
            r0.addHeader(r1, r2)
        Lc3:
            java.lang.String r1 = r12.g
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Ld2
            java.lang.String r1 = "Portm-User"
            java.lang.String r2 = r12.g
            r0.addHeader(r1, r2)
        Ld2:
            okhttp3.Request r1 = r0.build()
        Ld6:
            okhttp3.Response r13 = r13.proceed(r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.kernel.net.okhttp3.q.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    private void a(x xVar, com.meituan.android.cipstorage.q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c05573de5ef6bac53e6858ef4044114", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c05573de5ef6bac53e6858ef4044114");
            return;
        }
        String str2 = "";
        if (xVar != null) {
            str2 = xVar.b("meituan_portm_url", (String) null, str);
        } else if (qVar != null) {
            str2 = qVar.b("meituan_portm_url", (String) null);
        }
        Map<String, String> a2 = com.sankuai.meituan.kernel.net.utils.c.a(str2);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        this.e = a2.get("portm_host");
        this.f = a2.get("Portm-Token");
        this.g = a2.get("Portm-User");
    }

    private void b(x xVar, com.meituan.android.cipstorage.q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e02932e04adc81caaefdc2a44d90f1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e02932e04adc81caaefdc2a44d90f1d");
        } else if (xVar != null) {
            this.b = xVar.b("enable_meituan_portm", false, str);
        } else if (qVar != null) {
            this.b = qVar.b("enable_meituan_portm", false);
        }
    }

    private void c(x xVar, com.meituan.android.cipstorage.q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f2a2c9e22d4cb8ea3ee257e6da025fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f2a2c9e22d4cb8ea3ee257e6da025fd");
        } else if (xVar != null) {
            this.c = xVar.b("enable_filter_pic_res", true, str);
        } else if (qVar != null) {
            this.c = qVar.b("enable_filter_pic_res", true);
        }
    }

    private void d(x xVar, com.meituan.android.cipstorage.q qVar, String str) {
        Object[] objArr = {xVar, qVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae1cd9cbfcaa27447befa1d4fd2f3dea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae1cd9cbfcaa27447befa1d4fd2f3dea");
        } else if (xVar != null) {
            this.d = xVar.b("enable_filter_other_res", true, str);
        } else if (qVar != null) {
            this.d = qVar.b("enable_filter_other_res", true);
        }
    }

    @Override // com.meituan.android.cipstorage.ah
    public final void a(String str, com.meituan.android.cipstorage.u uVar, String str2) {
        Object[] objArr = {str, uVar, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35c35848e0e523a9b533f0f2dd9ae535", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35c35848e0e523a9b533f0f2dd9ae535");
            return;
        }
        com.meituan.android.cipstorage.q a2 = com.meituan.android.cipstorage.q.a(com.sankuai.meituan.kernel.net.base.c.b, str);
        if ("enable_meituan_portm".equals(str2)) {
            b(null, a2, null);
        } else if ("meituan_portm_url".equals(str2)) {
            a((x) null, a2, (String) null);
        } else if ("enable_filter_pic_res".equals(str2)) {
            c(null, a2, null);
        } else if ("enable_filter_other_res".equals(str2)) {
            d(null, a2, null);
        }
    }
}

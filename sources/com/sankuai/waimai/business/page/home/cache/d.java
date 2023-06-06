package com.sankuai.waimai.business.page.home.cache;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.singleton.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.f;
import com.sankuai.waimai.platform.capacity.log.a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static final Executor b;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final BlockingQueue<Runnable> h;
    private Context c;
    private final FileDownloadService d;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
        void a(String str);

        void a(String str, Throwable th);

        void b(String str);
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        e = availableProcessors;
        f = availableProcessors == 1 ? e : Math.max(2, Math.min(e - 1, 4));
        g = (e * 2) + 1;
        h = new LinkedBlockingQueue(128);
        b = com.sankuai.android.jarvis.c.a("Page-FileDownloader", f, g, 30L, TimeUnit.SECONDS, h);
    }

    public d(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de828278572f6466c19ff291bc9939f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de828278572f6466c19ff291bc9939f0");
            return;
        }
        this.c = context;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.d = (FileDownloadService) (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4d4007f1c19338612b4d270893c652f4", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4d4007f1c19338612b4d270893c652f4") : new ar.a().a(b).b(b).a("https://s3plus.sankuai.com").a(i.a(new com.sankuai.meituan.kernel.net.d() { // from class: com.sankuai.waimai.business.page.home.cache.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.kernel.net.d
            public final boolean a() {
                return false;
            }

            @Override // com.sankuai.meituan.kernel.net.d
            public final void a(OkHttpClient.Builder builder) {
                Object[] objArr3 = {builder};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "73a4a8968da1e04ee02577b458eeb275", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "73a4a8968da1e04ee02577b458eeb275");
                } else {
                    builder.connectTimeout(30L, TimeUnit.SECONDS).writeTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS);
                }
            }
        })).a()).a(FileDownloadService.class);
    }

    public final void a(final String str, final a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2707363124289d80750bbaf0a6a6e3c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2707363124289d80750bbaf0a6a6e3c1");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if ("https://s3plus.sankuai.com".equals(str) || "https://s3plus.sankuai.com/".equals(str) || "/".equals(str)) {
                a.AbstractC1040a a2 = new com.sankuai.waimai.business.page.common.log.a().a("FileDownloader");
                com.sankuai.waimai.platform.capacity.log.i.a(a2.d("downloadUrl not contains path :" + str).c(str).b());
                return;
            }
            final c cVar = new c(this.c);
            cVar.a(str);
            if (cVar.c()) {
                return;
            }
            try {
                this.d.downloadFile(str).a(new f<ap>() { // from class: com.sankuai.waimai.business.page.home.cache.d.2
                    public static ChangeQuickRedirect a;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:51:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    /* JADX WARN: Type inference failed for: r13v3 */
                    /* JADX WARN: Type inference failed for: r13v6, types: [java.io.InputStream] */
                    @Override // com.sankuai.meituan.retrofit2.f
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void onResponse(com.sankuai.meituan.retrofit2.Call<com.sankuai.meituan.retrofit2.ap> r12, com.sankuai.meituan.retrofit2.Response<com.sankuai.meituan.retrofit2.ap> r13) {
                        /*
                            r11 = this;
                            r0 = 2
                            java.lang.Object[] r0 = new java.lang.Object[r0]
                            r8 = 0
                            r0[r8] = r12
                            r12 = 1
                            r0[r12] = r13
                            com.meituan.robust.ChangeQuickRedirect r12 = com.sankuai.waimai.business.page.home.cache.d.AnonymousClass2.a
                            java.lang.String r9 = "f80cf03f7efa5cf0cb2db4ab55503f88"
                            r4 = 0
                            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
                            r1 = r0
                            r2 = r11
                            r3 = r12
                            r5 = r9
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
                            if (r1 == 0) goto L1e
                            com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r12, r8, r9)
                            return
                        L1e:
                            boolean r12 = r13.f()
                            if (r12 == 0) goto L78
                            r12 = 0
                            java.lang.Object r13 = r13.e()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
                            com.sankuai.meituan.retrofit2.ap r13 = (com.sankuai.meituan.retrofit2.ap) r13     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
                            java.io.InputStream r13 = r13.source()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5f
                            com.sankuai.waimai.business.page.home.cache.a r12 = r2     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L71
                            boolean r12 = r12.a(r13)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L71
                            com.sankuai.waimai.business.page.home.cache.d$a r0 = r3     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L71
                            if (r0 != 0) goto L41
                            if (r13 == 0) goto L40
                            r13.close()     // Catch: java.lang.Exception -> L3f
                            goto L40
                        L3f:
                            return
                        L40:
                            return
                        L41:
                            if (r12 == 0) goto L4b
                            com.sankuai.waimai.business.page.home.cache.d$a r12 = r3     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L71
                            java.lang.String r0 = r4     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L71
                            r12.a(r0)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L71
                            goto L52
                        L4b:
                            com.sankuai.waimai.business.page.home.cache.d$a r12 = r3     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L71
                            java.lang.String r0 = r4     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L71
                            r12.b(r0)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L71
                        L52:
                            if (r13 == 0) goto L88
                        L54:
                            r13.close()     // Catch: java.lang.Exception -> L88
                            goto L88
                        L58:
                            r12 = move-exception
                            goto L63
                        L5a:
                            r13 = move-exception
                            r10 = r13
                            r13 = r12
                            r12 = r10
                            goto L72
                        L5f:
                            r13 = move-exception
                            r10 = r13
                            r13 = r12
                            r12 = r10
                        L63:
                            com.sankuai.waimai.business.page.home.cache.d$a r0 = r3     // Catch: java.lang.Throwable -> L71
                            if (r0 == 0) goto L6e
                            com.sankuai.waimai.business.page.home.cache.d$a r0 = r3     // Catch: java.lang.Throwable -> L71
                            java.lang.String r1 = r4     // Catch: java.lang.Throwable -> L71
                            r0.a(r1, r12)     // Catch: java.lang.Throwable -> L71
                        L6e:
                            if (r13 == 0) goto L88
                            goto L54
                        L71:
                            r12 = move-exception
                        L72:
                            if (r13 == 0) goto L77
                            r13.close()     // Catch: java.lang.Exception -> L77
                        L77:
                            throw r12
                        L78:
                            com.sankuai.waimai.business.page.home.cache.d$a r12 = r3
                            if (r12 == 0) goto L83
                            com.sankuai.waimai.business.page.home.cache.d$a r12 = r3
                            java.lang.String r13 = r4
                            r12.b(r13)
                        L83:
                            com.sankuai.waimai.business.page.home.cache.a r12 = r2
                            r12.d()
                        L88:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.home.cache.d.AnonymousClass2.onResponse(com.sankuai.meituan.retrofit2.Call, com.sankuai.meituan.retrofit2.Response):void");
                    }

                    @Override // com.sankuai.meituan.retrofit2.f
                    public final void onFailure(Call<ap> call, Throwable th) {
                        Object[] objArr2 = {call, th};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b20133ff7ce4c49fc3f773f85d78a28", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b20133ff7ce4c49fc3f773f85d78a28");
                            return;
                        }
                        a.AbstractC1040a a3 = new com.sankuai.waimai.business.page.common.log.a().a("FileDownloader");
                        com.sankuai.waimai.platform.capacity.log.i.a(a3.d("downloadUrl not contains path:" + str).c(str).b());
                        if (aVar == null) {
                            return;
                        }
                        aVar.a(str, th);
                    }
                });
            } catch (Exception e2) {
                com.sankuai.waimai.foundation.utils.log.a.e("FileDownloader", "url:" + str + "\t\texception:" + e2.toString(), new Object[0]);
                cVar.d();
                if (aVar != null) {
                    aVar.a(str, e2);
                }
            }
        }
    }
}

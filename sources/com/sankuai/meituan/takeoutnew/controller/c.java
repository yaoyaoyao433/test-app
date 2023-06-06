package com.sankuai.meituan.takeoutnew.controller;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.model.WelcomeAd;
import com.sankuai.waimai.business.page.homepage.controller.b;
import java.io.Closeable;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements Runnable {
    public static ChangeQuickRedirect a;
    private final WelcomeAd b;
    private final b.a c;

    public c(WelcomeAd welcomeAd, b.a aVar) {
        Object[] objArr = {welcomeAd, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d1ca79a1fd4310bf3216abcb1ab470", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d1ca79a1fd4310bf3216abcb1ab470");
            return;
        }
        this.b = welcomeAd;
        this.c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1  */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.sankuai.meituan.takeoutnew.controller.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.nio.channels.ReadableByteChannel, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.takeoutnew.controller.c.run():void");
    }

    private void a(Closeable closeable) {
        Object[] objArr = {closeable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff291286ba49f252516b7ae7d94affbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff291286ba49f252516b7ae7d94affbe");
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b A[Catch: IOException -> 0x00b1, TryCatch #0 {IOException -> 0x00b1, blocks: (B:9:0x003d, B:23:0x005b, B:28:0x009d, B:29:0x00b0), top: B:36:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.HttpURLConnection a(java.lang.String r13, int r14) throws java.lang.Exception {
        /*
            r12 = this;
            r14 = 2
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r7 = 0
            r14[r7] = r13
            r8 = 10000(0x2710, float:1.4013E-41)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r9 = 1
            r14[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.meituan.takeoutnew.controller.c.a
            java.lang.String r11 = "6032d03b241094bd1599f0f3492067de"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r14
            r1 = r12
            r2 = r10
            r4 = r11
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L27
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r14, r12, r10, r7, r11)
            java.net.HttpURLConnection r13 = (java.net.HttpURLConnection) r13
            return r13
        L27:
            r14 = 0
        L28:
            java.net.URL r0 = new java.net.URL     // Catch: java.io.IOException -> Lbb
            r0.<init>(r13)     // Catch: java.io.IOException -> Lbb
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.io.IOException -> Lbb
            java.net.URLConnection r0 = com.meituan.metrics.traffic.hurl.HttpURLWrapper.wrapURLConnection(r0)     // Catch: java.io.IOException -> Lbb
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.io.IOException -> Lbb
            r0.setConnectTimeout(r8)
            r0.setReadTimeout(r8)
            int r1 = r0.getResponseCode()     // Catch: java.io.IOException -> Lb1
            r2 = 301(0x12d, float:4.22E-43)
            if (r1 == r2) goto L58
            r2 = 302(0x12e, float:4.23E-43)
            if (r1 == r2) goto L58
            r2 = 303(0x12f, float:4.25E-43)
            if (r1 == r2) goto L58
            r2 = 305(0x131, float:4.27E-43)
            if (r1 == r2) goto L58
            r2 = 307(0x133, float:4.3E-43)
            if (r1 != r2) goto L56
            goto L58
        L56:
            r1 = 0
            goto L59
        L58:
            r1 = 1
        L59:
            if (r1 == 0) goto L97
            java.lang.String r13 = "Location"
            java.lang.String r13 = r0.getHeaderField(r13)     // Catch: java.io.IOException -> Lb1
            int r14 = r14 + 1
            r0.disconnect()     // Catch: java.io.IOException -> Lb1
            com.sankuai.waimai.business.page.common.log.a r2 = new com.sankuai.waimai.business.page.common.log.a     // Catch: java.io.IOException -> Lb1
            r2.<init>()     // Catch: java.io.IOException -> Lb1
            java.lang.String r3 = "download_with_cache_redirect"
            com.sankuai.waimai.platform.capacity.log.a$a r2 = r2.a(r3)     // Catch: java.io.IOException -> Lb1
            java.lang.String r3 = "download_redirect"
            com.sankuai.waimai.platform.capacity.log.a$a r2 = r2.b(r3)     // Catch: java.io.IOException -> Lb1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb1
            r3.<init>()     // Catch: java.io.IOException -> Lb1
            r3.append(r13)     // Catch: java.io.IOException -> Lb1
            java.lang.String r4 = "#redirect"
            r3.append(r4)     // Catch: java.io.IOException -> Lb1
            java.lang.String r3 = r3.toString()     // Catch: java.io.IOException -> Lb1
            com.sankuai.waimai.platform.capacity.log.a$a r2 = r2.c(r3)     // Catch: java.io.IOException -> Lb1
            com.sankuai.waimai.platform.capacity.log.a$a r2 = r2.b(r9)     // Catch: java.io.IOException -> Lb1
            com.sankuai.waimai.platform.capacity.log.a r2 = r2.b()     // Catch: java.io.IOException -> Lb1
            com.sankuai.waimai.platform.capacity.log.i.d(r2)     // Catch: java.io.IOException -> Lb1
        L97:
            r2 = 5
            if (r14 > r2) goto L9d
            if (r1 != 0) goto L28
            return r0
        L9d:
            java.lang.Exception r13 = new java.lang.Exception     // Catch: java.io.IOException -> Lb1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lb1
            java.lang.String r1 = "Too many redirects: "
            r0.<init>(r1)     // Catch: java.io.IOException -> Lb1
            r0.append(r14)     // Catch: java.io.IOException -> Lb1
            java.lang.String r14 = r0.toString()     // Catch: java.io.IOException -> Lb1
            r13.<init>(r14)     // Catch: java.io.IOException -> Lb1
            throw r13     // Catch: java.io.IOException -> Lb1
        Lb1:
            r13 = move-exception
            java.lang.Exception r14 = new java.lang.Exception
            java.lang.String r0 = "network failed in getResponseCode()"
            r14.<init>(r0, r13)
            throw r14
        Lbb:
            r14 = move-exception
            com.meituan.android.mtplayer.video.proxy.j r0 = new com.meituan.android.mtplayer.video.proxy.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "open url failed , url = "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            r0.<init>(r13, r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.takeoutnew.controller.c.a(java.lang.String, int):java.net.HttpURLConnection");
    }
}

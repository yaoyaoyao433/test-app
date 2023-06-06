package com.vivo.push.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.vivo.push.d.r;
import com.vivo.push.model.InsideNotificationItem;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class k extends AsyncTask<String, Void, List<Bitmap>> {
    private Context a;
    private InsideNotificationItem b;
    private long c;
    private boolean d;
    private int e = 0;
    private r.a f;

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(List<Bitmap> list) {
        List<Bitmap> list2 = list;
        super.onPostExecute(list2);
        p.c("ImageDownTask", "onPostExecute");
        com.vivo.push.m.c(new l(this, list2));
    }

    public k(Context context, InsideNotificationItem insideNotificationItem, long j, boolean z, r.a aVar) {
        this.a = context;
        this.b = insideNotificationItem;
        this.c = j;
        this.d = z;
        this.f = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (r4 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
        r5 = null;
     */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<android.graphics.Bitmap> doInBackground(java.lang.String... r10) {
        /*
            r9 = this;
            com.vivo.push.model.InsideNotificationItem r0 = r9.b
            int r0 = r0.getNotifyDisplayStatus()
            r9.e = r0
            boolean r0 = r9.d
            r1 = 0
            if (r0 != 0) goto L15
            java.lang.String r10 = "ImageDownTask"
            java.lang.String r0 = "bitmap is not display by forbid net"
            com.vivo.push.util.p.d(r10, r0)
            return r1
        L15:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2 = 0
            r3 = 0
        L1c:
            r4 = 2
            if (r3 >= r4) goto Lb9
            r4 = r10[r3]
            java.lang.String r5 = "ImageDownTask"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "imgUrl="
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r7 = " i="
            r6.append(r7)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            com.vivo.push.util.p.d(r5, r6)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto Lb0
            java.net.URL r5 = new java.net.URL     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            java.net.URLConnection r4 = r5.openConnection()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            java.net.URLConnection r4 = com.meituan.metrics.traffic.hurl.HttpURLWrapper.wrapURLConnection(r4)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            r5 = 30000(0x7530, float:4.2039E-41)
            r4.setConnectTimeout(r5)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            r5 = 1
            r4.setDoInput(r5)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            r4.setUseCaches(r2)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            r4.connect()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            int r5 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            java.lang.String r6 = "ImageDownTask"
            java.lang.String r7 = "code="
            java.lang.String r8 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            java.lang.String r7 = r7.concat(r8)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            com.vivo.push.util.p.c(r6, r7)     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L80
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L88 java.io.IOException -> L8a java.net.MalformedURLException -> L98
            android.graphics.Bitmap r5 = com.sankuai.waimai.launcher.util.image.a.a(r4)     // Catch: java.io.IOException -> L8b java.net.MalformedURLException -> L99 java.lang.Throwable -> La8
            goto L82
        L80:
            r4 = r1
            r5 = r4
        L82:
            if (r4 == 0) goto La4
            r4.close()     // Catch: java.lang.Exception -> La4
            goto La4
        L88:
            r10 = move-exception
            goto Laa
        L8a:
            r4 = r1
        L8b:
            java.lang.String r5 = "ImageDownTask"
            java.lang.String r6 = "IOException"
            com.vivo.push.util.p.a(r5, r6)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto La3
        L94:
            r4.close()     // Catch: java.lang.Exception -> La3
            goto La3
        L98:
            r4 = r1
        L99:
            java.lang.String r5 = "ImageDownTask"
            java.lang.String r6 = "MalformedURLException"
            com.vivo.push.util.p.a(r5, r6)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto La3
            goto L94
        La3:
            r5 = r1
        La4:
            r0.add(r5)
            goto Lb5
        La8:
            r10 = move-exception
            r1 = r4
        Laa:
            if (r1 == 0) goto Laf
            r1.close()     // Catch: java.lang.Exception -> Laf
        Laf:
            throw r10
        Lb0:
            if (r3 != 0) goto Lb5
            r0.add(r1)
        Lb5:
            int r3 = r3 + 1
            goto L1c
        Lb9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.push.util.k.doInBackground(java.lang.String[]):java.util.List");
    }
}

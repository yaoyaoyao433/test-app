package com.tencent.smtt.utils;

import android.os.Build;
import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.metrics.traffic.report.DataUtils;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.passport.UserCenter;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
/* loaded from: classes6.dex */
public class f {

    /* loaded from: classes6.dex */
    public interface a {
        void a(int i);
    }

    public static String a(String str, Map<String, String> map, byte[] bArr, a aVar, boolean z) {
        HttpURLConnection a2;
        if (bArr == null || (a2 = a(str, map)) == null) {
            return null;
        }
        if (z) {
            a(a2, bArr);
        } else {
            b(a2, bArr);
        }
        return a(a2, aVar, false);
    }

    public static String a(String str, byte[] bArr, a aVar, boolean z) {
        byte[] bArr2;
        try {
            String str2 = str + (z ? h.a().c() : g.a().b());
            try {
                bArr2 = z ? h.a().a(bArr) : g.a().a(bArr);
            } catch (Exception e) {
                e.printStackTrace();
                TbsLog.e("HttpUtils", "rsaKey exception #2: " + e);
                bArr2 = bArr;
            }
            if (bArr2 == null) {
                TbsLog.e("HttpUtils", "postData is null");
                return null;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM);
            hashMap.put("Content-Length", String.valueOf(bArr2.length));
            HttpURLConnection a2 = a(str2, hashMap);
            if (a2 != null) {
                b(a2, bArr2);
                return a(a2, aVar, z);
            }
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            TbsLog.e("HttpUtils", "rsaKey exception #1: " + e2);
            return null;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    private static java.lang.String a(java.net.HttpURLConnection r4, com.tencent.smtt.utils.f.a r5, boolean r6) {
        /*
            r0 = 0
            int r1 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L93
            if (r5 == 0) goto La
            r5.a(r1)     // Catch: java.lang.Throwable -> L93
        La:
            r5 = 200(0xc8, float:2.8E-43)
            if (r1 != r5) goto L86
            java.io.InputStream r5 = r4.getInputStream()     // Catch: java.lang.Throwable -> L93
            java.lang.String r4 = r4.getContentEncoding()     // Catch: java.lang.Throwable -> L93
            if (r4 == 0) goto L26
            java.lang.String r1 = "gzip"
            boolean r1 = r4.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L93
            if (r1 == 0) goto L26
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L93
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L93
            goto L3d
        L26:
            if (r4 == 0) goto L3c
            java.lang.String r1 = "deflate"
            boolean r4 = r4.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L93
            if (r4 == 0) goto L3c
            java.util.zip.InflaterInputStream r4 = new java.util.zip.InflaterInputStream     // Catch: java.lang.Throwable -> L93
            java.util.zip.Inflater r1 = new java.util.zip.Inflater     // Catch: java.lang.Throwable -> L93
            r2 = 1
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L93
            r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L93
            goto L3d
        L3c:
            r4 = r5
        L3d:
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L80
            r5.<init>()     // Catch: java.lang.Throwable -> L80
            r0 = 128(0x80, float:1.794E-43)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L76
        L46:
            int r1 = r4.read(r0)     // Catch: java.lang.Throwable -> L76
            r2 = -1
            if (r1 == r2) goto L52
            r2 = 0
            r5.write(r0, r2, r1)     // Catch: java.lang.Throwable -> L76
            goto L46
        L52:
            if (r6 == 0) goto L60
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L76
            byte[] r6 = r5.toByteArray()     // Catch: java.lang.Throwable -> L76
            java.lang.String r1 = "utf-8"
            r0.<init>(r6, r1)     // Catch: java.lang.Throwable -> L76
            goto L88
        L60:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L76
            com.tencent.smtt.utils.g r6 = com.tencent.smtt.utils.g.a()     // Catch: java.lang.Throwable -> L76
            byte[] r1 = r5.toByteArray()     // Catch: java.lang.Throwable -> L76
            byte[] r6 = r6.c(r1)     // Catch: java.lang.Throwable -> L76
            r0.<init>(r6)     // Catch: java.lang.Throwable -> L76
            goto L88
        L72:
            r6 = move-exception
            r0 = r4
            r4 = r6
            goto Lc5
        L76:
            r6 = move-exception
            r0 = r4
            r4 = r6
            goto L95
        L7a:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r5
            r5 = r3
            goto Lc5
        L80:
            r5 = move-exception
            r3 = r0
            r0 = r4
            r4 = r5
            r5 = r3
            goto L95
        L86:
            r4 = r0
            r5 = r4
        L88:
            a(r4)
            a(r5)
            r4 = r0
            goto Lc3
        L90:
            r4 = move-exception
            r5 = r0
            goto Lc5
        L93:
            r4 = move-exception
            r5 = r0
        L95:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r6 = "HttpUtil"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r2 = "httpPost exception: "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc4
            r1.append(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lc4
            com.tencent.smtt.utils.TbsLog.e(r6, r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r1 = "[HttpError] "
            r6.<init>(r1)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> Lc4
            r6.append(r4)     // Catch: java.lang.Throwable -> Lc4
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> Lc4
            a(r0)
            a(r5)
        Lc3:
            return r4
        Lc4:
            r4 = move-exception
        Lc5:
            a(r0)
            a(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.utils.f.a(java.net.HttpURLConnection, com.tencent.smtt.utils.f$a, boolean):java.lang.String");
    }

    private static HttpURLConnection a(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        String str2;
        String str3;
        HttpURLConnection httpURLConnection2 = null;
        try {
            httpURLConnection = (HttpURLConnection) HttpURLWrapper.wrapURLConnection(new URL(str).openConnection());
        } catch (Exception e) {
            e = e;
        }
        try {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setConnectTimeout(UserCenter.TYPE_LOGOUT_NEGATIVE);
            if (Build.VERSION.SDK_INT > 13) {
                str2 = "Connection";
                str3 = "close";
            } else {
                str2 = "http.keepAlive";
                str3 = "false";
            }
            httpURLConnection.setRequestProperty(str2, str3);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            return httpURLConnection;
        } catch (Exception e2) {
            e = e2;
            httpURLConnection2 = httpURLConnection;
            TbsLog.e("HttpUtil", "initHttpPostURLConnection exception: " + e);
            return httpURLConnection2;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    private static void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        try {
            gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream(), DataUtils.PARSE_JSON_LIMIT_SIZE));
            try {
                try {
                    gZIPOutputStream.write(bArr);
                    gZIPOutputStream.flush();
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                    a(null);
                    a(gZIPOutputStream);
                }
            } catch (Throwable th) {
                th = th;
                a(null);
                a(gZIPOutputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            gZIPOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream = null;
            a(null);
            a(gZIPOutputStream);
            throw th;
        }
        a(null);
        a(gZIPOutputStream);
    }

    private static void b(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = httpURLConnection.getOutputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            outputStream.write(bArr);
            outputStream.flush();
            a(outputStream);
        } catch (Exception e2) {
            e = e2;
            outputStream2 = outputStream;
            TbsLog.e("HttpUtil", "writePostData exception: " + e);
            a(outputStream2);
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
            a(outputStream2);
            throw th;
        }
    }
}

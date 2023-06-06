package com.dianping.nvnetwork.tnold.zip.gzip;

import com.dianping.nvnetwork.tnold.zip.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    public static ChangeQuickRedirect a;
    private static final String f = com.dianping.nvtunnelkit.logger.a.a("GzipUtil");
    private static final com.dianping.nvnetwork.tunnel.tool.a g = new com.dianping.nvnetwork.tunnel.tool.a(5120);
    public static final d b = new d("Gzip encode header failed");
    public static final d c = new d("Gzip encode body failed");
    public static final c d = new c("Gzip decode header failed");
    public static final c e = new c("Gzip decode body failed");

    public static byte[] a(byte[] bArr) throws Exception {
        GZIPOutputStream gZIPOutputStream;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        GZIPOutputStream gZIPOutputStream2 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa65798c4299d6e350c4f41366a4e08a", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa65798c4299d6e350c4f41366a4e08a");
        }
        if (h.b(bArr)) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            try {
                gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            gZIPOutputStream.write(bArr);
            a(gZIPOutputStream);
            a(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e3) {
            e = e3;
            gZIPOutputStream2 = gZIPOutputStream;
            com.dianping.nvtunnelkit.logger.b.a(f, "gzip encode fail", e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            gZIPOutputStream2 = gZIPOutputStream;
            a(gZIPOutputStream2);
            a(byteArrayOutputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.zip.GZIPInputStream, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(byte[] r13) throws java.lang.Exception {
        /*
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.dianping.nvnetwork.tnold.zip.gzip.g.a
            java.lang.String r11 = "3fda146f94524618fd91c18756e5a6f5"
            r2 = 0
            r4 = 1
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r8
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1e
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r2, r10, r0, r11)
            byte[] r13 = (byte[]) r13
            return r13
        L1e:
            boolean r0 = com.dianping.nvnetwork.tnold.zip.h.b(r13)
            if (r0 != 0) goto L99
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L7b
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L7b
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L7b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L77 java.io.IOException -> L7b
            java.io.ByteArrayOutputStream r13 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L72
            r1 = 16384(0x4000, float:2.2959E-41)
            r13.<init>(r1)     // Catch: java.lang.Throwable -> L6f java.io.IOException -> L72
            com.dianping.nvnetwork.tunnel.tool.a r1 = com.dianping.nvnetwork.tnold.zip.gzip.g.g     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L68
            r3 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = r1.a(r3)     // Catch: java.lang.Throwable -> L63 java.io.IOException -> L68
        L3d:
            int r2 = r0.read(r1)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5e
            if (r2 <= 0) goto L47
            r13.write(r1, r9, r2)     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5e
            goto L3d
        L47:
            byte[] r2 = r13.toByteArray()     // Catch: java.lang.Throwable -> L59 java.io.IOException -> L5e
            if (r1 == 0) goto L52
            com.dianping.nvnetwork.tunnel.tool.a r3 = com.dianping.nvnetwork.tnold.zip.gzip.g.g
            r3.a(r1)
        L52:
            a(r0)
            a(r13)
            return r2
        L59:
            r2 = move-exception
            r12 = r1
            r1 = r13
            r13 = r2
            goto L8a
        L5e:
            r2 = move-exception
            r12 = r0
            r0 = r13
            r13 = r2
            goto L6d
        L63:
            r1 = move-exception
            r12 = r1
            r1 = r13
            r13 = r12
            goto L8b
        L68:
            r1 = move-exception
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = r2
        L6d:
            r2 = r12
            goto L7e
        L6f:
            r13 = move-exception
            r1 = r2
            goto L8b
        L72:
            r13 = move-exception
            r1 = r2
            r2 = r0
            r0 = r1
            goto L7e
        L77:
            r13 = move-exception
            r0 = r2
            r1 = r0
            goto L8b
        L7b:
            r13 = move-exception
            r0 = r2
            r1 = r0
        L7e:
            java.lang.String r3 = com.dianping.nvnetwork.tnold.zip.gzip.g.f     // Catch: java.lang.Throwable -> L86
            java.lang.String r4 = "gzip decode fail"
            com.dianping.nvtunnelkit.logger.b.a(r3, r4, r13)     // Catch: java.lang.Throwable -> L86
            throw r13     // Catch: java.lang.Throwable -> L86
        L86:
            r13 = move-exception
            r12 = r1
            r1 = r0
            r0 = r2
        L8a:
            r2 = r12
        L8b:
            if (r2 == 0) goto L92
            com.dianping.nvnetwork.tunnel.tool.a r3 = com.dianping.nvnetwork.tnold.zip.gzip.g.g
            r3.a(r2)
        L92:
            a(r0)
            a(r1)
            throw r13
        L99:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.nvnetwork.tnold.zip.gzip.g.b(byte[]):byte[]");
    }

    private static void a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7f8502015d1b29866a90083c68ed1038", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7f8502015d1b29866a90083c68ed1038");
        } else if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void a(OutputStream outputStream) {
        Object[] objArr = {outputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "61f5892988c77154dbdce78b0581f0a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "61f5892988c77154dbdce78b0581f0a5");
        } else if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}

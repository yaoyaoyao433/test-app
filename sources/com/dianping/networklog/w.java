package com.dianping.networklog;

import com.meituan.metrics.traffic.hurl.HttpURLWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.HttpURLConnection;
import java.net.URL;
/* loaded from: classes.dex */
public final class w {
    public static ChangeQuickRedirect a;
    private static w b;
    private static final m c = new m(1024);
    private b d;

    /* loaded from: classes.dex */
    static class a implements b {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.dianping.networklog.w.b
        public final HttpURLConnection a(URL url) {
            Object[] objArr = {url};
            ChangeQuickRedirect changeQuickRedirect = a;
            return (HttpURLConnection) (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c81be68b72be74586f528959178711a8", 6917529027641081856L) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c81be68b72be74586f528959178711a8") : HttpURLWrapper.wrapURLConnection(url.openConnection()));
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        HttpURLConnection a(URL url);
    }

    /* loaded from: classes.dex */
    public static class c {
        public static final w a = new w();
    }

    public w() {
        this(new a());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bfee87b99a4c5451e89a013769992b4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bfee87b99a4c5451e89a013769992b4");
        }
    }

    private w(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18683cc33a15166532e6167ea1b6a23a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18683cc33a15166532e6167ea1b6a23a");
        } else {
            this.d = bVar;
        }
    }

    public static w a() {
        return b != null ? b : c.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0196 A[Catch: all -> 0x01c7, TryCatch #4 {all -> 0x01c7, blocks: (B:76:0x0192, B:78:0x0196, B:79:0x019d), top: B:90:0x0192 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d8  */
    /* JADX WARN: Type inference failed for: r2v15, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] a(java.lang.String r18, java.io.InputStream r19, java.util.Map<java.lang.String, java.lang.String> r20) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.networklog.w.a(java.lang.String, java.io.InputStream, java.util.Map):byte[]");
    }
}

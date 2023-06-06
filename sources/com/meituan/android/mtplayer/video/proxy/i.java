package com.meituan.android.mtplayer.video.proxy;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class i implements r {
    public static ChangeQuickRedirect a;
    s b;
    private final com.meituan.android.mtplayer.video.proxy.sourcestorage.b c;
    private InputStream d;
    private HttpURLConnection e;

    public i(String str, com.meituan.android.mtplayer.video.proxy.sourcestorage.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65be7614d70cf233328b7f8653b9a8e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65be7614d70cf233328b7f8653b9a8e8");
            return;
        }
        this.c = (com.meituan.android.mtplayer.video.proxy.sourcestorage.b) n.a(bVar);
        s a2 = bVar.a(str);
        if (a2 == null) {
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = q.a;
            String str2 = null;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "278cdcce4603268187a1bad815383795", RobustBitConfig.DEFAULT_VALUE)) {
                str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "278cdcce4603268187a1bad815383795");
            } else {
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                if (!TextUtils.isEmpty(fileExtensionFromUrl)) {
                    str2 = singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
                }
            }
            a2 = new s(str, -2147483648L, str2);
        }
        this.b = a2;
    }

    public i(i iVar) {
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46838278b014213d5e3e99c1222fdc3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46838278b014213d5e3e99c1222fdc3d");
            return;
        }
        this.b = iVar.b;
        this.c = iVar.c;
    }

    @Override // com.meituan.android.mtplayer.video.proxy.r
    public final synchronized long a() throws j {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca1de32de1053827785bd32e09e2c708", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca1de32de1053827785bd32e09e2c708")).longValue();
        }
        if (this.b.c == -2147483648L) {
            d();
        }
        return this.b.c;
    }

    @Override // com.meituan.android.mtplayer.video.proxy.r
    public final synchronized void a(long j) throws j {
        long a2;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c7b87d3b13646201a1e48e6967a31b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c7b87d3b13646201a1e48e6967a31b4");
            return;
        }
        try {
            this.e = a(j, -1);
            String contentType = this.e.getContentType();
            this.d = new BufferedInputStream(this.e.getInputStream());
            HttpURLConnection httpURLConnection = this.e;
            int responseCode = this.e.getResponseCode();
            Object[] objArr2 = {httpURLConnection, new Long(j), Integer.valueOf(responseCode)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fa9620c01d5383e1fde6ff7019eecef1", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = ((Long) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fa9620c01d5383e1fde6ff7019eecef1")).longValue();
            } else {
                a2 = a(httpURLConnection);
                if (responseCode != 200) {
                    a2 = responseCode == 206 ? a2 + j : this.b.c;
                }
            }
            this.b = new s(this.b.b, a2, contentType);
            this.c.a(this.b.b, this.b);
        } catch (p unused) {
        } catch (IOException unused2) {
        } catch (NullPointerException unused3) {
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.r
    public final synchronized void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d139fd2216deb0aa8f6c4338f371c11c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d139fd2216deb0aa8f6c4338f371c11c");
            return;
        }
        if (this.e != null) {
            try {
                this.d = null;
                this.e.disconnect();
            } catch (ArrayIndexOutOfBoundsException unused) {
            } catch (IllegalArgumentException | NullPointerException unused2) {
            }
        }
    }

    @Override // com.meituan.android.mtplayer.video.proxy.r
    public final synchronized int a(byte[] bArr, int i, int i2) throws p {
        Object[] objArr = {bArr, 0, 8192};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7d49d8ec8fadc221353479fbee9c1bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7d49d8ec8fadc221353479fbee9c1bd")).intValue();
        }
        InputStream inputStream = this.d;
        if (inputStream == null) {
            throw new p("mInputStream = null,finish");
        }
        try {
            try {
                return inputStream.read(bArr, 0, 8192);
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new p("okio ArrayIndexOutOfBoundsException, url = " + this.b.b, e);
            }
        } catch (InterruptedIOException e2) {
            throw new p("reading process is interrupted , finish", e2);
        } catch (IOException e3) {
            throw new p("io exception when read , url = " + this.b.b, e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.meituan.android.mtplayer.video.proxy.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.meituan.android.mtplayer.video.proxy.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    private void d() throws j {
        long a2;
        String contentType;
        InputStream inputStream;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f73c4866acd3ea32fb1f851aab5f3a92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f73c4866acd3ea32fb1f851aab5f3a92");
            return;
        }
        com.meituan.android.mtplayer.video.utils.c.b("Proxy", "HttpUrlSource:Read content info from " + this.b.b);
        ?? r0 = 0;
        InputStream inputStream2 = 0;
        r3 = null;
        r3 = null;
        InputStream inputStream3 = null;
        InputStream inputStream4 = null;
        inputStream2 = null;
        try {
            try {
                r0 = a(0L, 10000);
                try {
                    a2 = a(r0);
                    contentType = r0.getContentType();
                    inputStream = r0.getInputStream();
                } catch (p unused) {
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.b = new s(this.b.b, a2, contentType);
                this.c.a(this.b.b, this.b);
                ?? sb = new StringBuilder("HttpUrlSource:Source info fetched: ");
                inputStream2 = this.b;
                sb.append(inputStream2);
                com.meituan.android.mtplayer.video.utils.c.b("Proxy", sb.toString());
                q.a(inputStream);
                if (r0 == 0) {
                    return;
                }
                r0.disconnect();
            } catch (p unused2) {
                inputStream3 = inputStream;
                com.meituan.android.mtplayer.video.utils.c.d("Proxy", "HttpUrlSource:network error in fetchContentInfo() ");
                q.a(inputStream3);
                if (r0 != 0) {
                    r0.disconnect();
                }
            } catch (IOException e2) {
                e = e2;
                inputStream4 = inputStream;
                com.meituan.android.mtplayer.video.utils.c.b("Proxy", "HttpUrlSource:Error fetching info from " + this.b.b + ",error:", e);
                q.a(inputStream4);
                if (r0 != 0) {
                    r0.disconnect();
                }
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                q.a(inputStream2);
                if (r0 != 0) {
                    r0.disconnect();
                }
                throw th;
            }
        } catch (p unused3) {
            r0 = 0;
        } catch (IOException e3) {
            e = e3;
            r0 = 0;
        } catch (Throwable th3) {
            th = th3;
            r0 = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0 A[Catch: IllegalStateException -> 0x00d5, NullPointerException -> 0x00de, IOException -> 0x00e7, TryCatch #3 {IOException -> 0x00e7, IllegalStateException -> 0x00d5, NullPointerException -> 0x00de, blocks: (B:17:0x0092, B:31:0x00b0, B:36:0x00c1, B:37:0x00d4), top: B:52:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.net.HttpURLConnection a(long r13, int r15) throws com.meituan.android.mtplayer.video.proxy.j, com.meituan.android.mtplayer.video.proxy.p {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.mtplayer.video.proxy.i.a(long, int):java.net.HttpURLConnection");
    }

    private long a(HttpURLConnection httpURLConnection) {
        Object[] objArr = {httpURLConnection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca6e24d970addc9afedea70f7619783e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca6e24d970addc9afedea70f7619783e")).longValue();
        }
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return NumberUtils.parseLong(headerField, -1L);
    }

    public final synchronized String c() throws j {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29f30a1a3cee4aca2046ee4e3c0719d9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29f30a1a3cee4aca2046ee4e3c0719d9");
        }
        if (TextUtils.isEmpty(this.b.d)) {
            d();
        }
        return this.b.d;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8739e57d8ddf459e5f1b6b52e49e770", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8739e57d8ddf459e5f1b6b52e49e770");
        }
        return "HttpUrlSource{mSourceInfo='" + this.b + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
    }
}

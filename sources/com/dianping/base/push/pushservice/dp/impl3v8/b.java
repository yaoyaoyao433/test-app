package com.dianping.base.push.pushservice.dp.impl3v8;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(OutputStream outputStream, int i, String str) throws Exception {
        byte[] a2;
        Object[] objArr = {outputStream, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "515b803c2acc43644f1bfc35deb8dbc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "515b803c2acc43644f1bfc35deb8dbc0");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            a2 = new byte[0];
        } else {
            a2 = com.dianping.base.push.pushservice.dp.impl3v8.a.a(str.getBytes(Charset.defaultCharset()));
        }
        int length = a2.length + 0 + 2 + 1 + 1;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        Object[] objArr2 = {Integer.valueOf(length)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        byteArrayOutputStream.write(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "72370f997a7412b845a803458f05214a", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "72370f997a7412b845a803458f05214a") : new byte[]{(byte) (length >> 24), (byte) (length >> 16), (byte) (length >> 8), (byte) length});
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(i);
        Object[] objArr3 = {0};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        byteArrayOutputStream.write(PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fcbfe635ca45be394d9f29ae68604e90", RobustBitConfig.DEFAULT_VALUE) ? (byte[]) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fcbfe635ca45be394d9f29ae68604e90") : new byte[]{0, 0});
        byteArrayOutputStream.write(a2);
        outputStream.write(byteArrayOutputStream.toByteArray());
        outputStream.flush();
    }

    public static int a(InputStream inputStream, a aVar) throws Exception {
        int i = 0;
        Object[] objArr = {inputStream, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fe2fdb89de601ac985a5bc166f8d0b7c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fe2fdb89de601ac985a5bc166f8d0b7c")).intValue();
        }
        int read = inputStream.read();
        if (read <= 0) {
            return read;
        }
        int read2 = inputStream.read();
        int read3 = inputStream.read();
        int read4 = inputStream.read();
        int read5 = inputStream.read();
        if (read2 < 0 || read3 < 0 || read4 < 0 || read5 < 0) {
            return -1;
        }
        int i2 = (read2 << 24) | ((read3 & 255) << 16) | ((read4 & 255) << 8) | (read5 & 255);
        if (i2 > 4194304) {
            throw new IOException("buffer > 4m");
        }
        int read6 = inputStream.read();
        int read7 = inputStream.read();
        int read8 = inputStream.read();
        int read9 = inputStream.read();
        if (read8 < 0 || read9 < 0) {
            return -1;
        }
        int i3 = ((read8 & 255) << 8) | (read9 & 255);
        if (i3 <= 1024) {
            int i4 = (((i2 - i3) - 2) - 1) - 1;
            if (i4 <= 0) {
                return read7;
            }
            byte[] bArr = new byte[i4];
            while (i < i4) {
                int read10 = inputStream.read(bArr, i, i4 - i);
                if (read10 == -1) {
                    return -1;
                }
                i += read10;
            }
            if (read6 == 1) {
                bArr = com.dianping.base.push.pushservice.dp.impl3v8.a.b(bArr);
            }
            aVar.b = read7;
            aVar.c = bArr;
            return read7;
        }
        throw new IOException("keyLength > 1k");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        public static ChangeQuickRedirect a;
        public int b;
        public byte[] c;

        public a(int i, byte[] bArr) {
            Object[] objArr = {-1, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "171d7be6727d39f563757cd25c91fbce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "171d7be6727d39f563757cd25c91fbce");
                return;
            }
            this.b = -1;
            this.c = null;
        }

        public final boolean a() {
            return this.b < 0 || this.c == null;
        }
    }
}

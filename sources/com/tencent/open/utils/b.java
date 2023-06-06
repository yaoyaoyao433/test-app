package com.tencent.open.utils;

import com.meituan.android.neohybrid.v2.neo.bridge.presenter.r;
import com.meituan.robust.common.CommonConstant;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Properties;
import java.util.zip.ZipException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b {
    private static final l a = new l(101010256);
    private static final m b = new m(38651);

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        Properties a;
        byte[] b;

        private a() {
            this.a = new Properties();
        }

        void a(byte[] bArr) throws IOException {
            if (bArr == null) {
                return;
            }
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int length = b.b.a().length;
            byte[] bArr2 = new byte[length];
            wrap.get(bArr2);
            if (!b.b.equals(new m(bArr2))) {
                throw new ProtocolException("unknow protocl [" + Arrays.toString(bArr) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT);
            } else if (bArr.length - length <= 2) {
            } else {
                byte[] bArr3 = new byte[2];
                wrap.get(bArr3);
                int b = new m(bArr3).b();
                if ((bArr.length - length) - 2 < b) {
                    return;
                }
                byte[] bArr4 = new byte[b];
                wrap.get(bArr4);
                this.a.load(new ByteArrayInputStream(bArr4));
                int length2 = ((bArr.length - length) - b) - 2;
                if (length2 > 0) {
                    this.b = new byte[length2];
                    wrap.get(this.b);
                }
            }
        }

        public String toString() {
            return "ApkExternalInfo [p=" + this.a + ", otherData=" + Arrays.toString(this.b) + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
        }
    }

    public static String a(File file, String str) throws IOException {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, r.o);
            try {
                byte[] a2 = a(randomAccessFile);
                if (a2 != null) {
                    a aVar = new a();
                    aVar.a(a2);
                    String property = aVar.a.getProperty(str);
                    randomAccessFile.close();
                    return property;
                }
                randomAccessFile.close();
                return null;
            } catch (Throwable th) {
                th = th;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
        }
    }

    public static String a(File file) throws IOException {
        return a(file, "channelNo");
    }

    private static byte[] a(RandomAccessFile randomAccessFile) throws IOException {
        boolean z;
        long length = randomAccessFile.length() - 22;
        randomAccessFile.seek(length);
        byte[] a2 = a.a();
        int read = randomAccessFile.read();
        while (true) {
            z = true;
            if (read == -1) {
                z = false;
                break;
            } else if (read == a2[0] && randomAccessFile.read() == a2[1] && randomAccessFile.read() == a2[2] && randomAccessFile.read() == a2[3]) {
                break;
            } else {
                length--;
                randomAccessFile.seek(length);
                read = randomAccessFile.read();
            }
        }
        if (!z) {
            throw new ZipException("archive is not a ZIP archive");
        }
        randomAccessFile.seek(length + 16 + 4);
        byte[] bArr = new byte[2];
        randomAccessFile.readFully(bArr);
        int b2 = new m(bArr).b();
        if (b2 == 0) {
            return null;
        }
        byte[] bArr2 = new byte[b2];
        randomAccessFile.read(bArr2);
        return bArr2;
    }
}

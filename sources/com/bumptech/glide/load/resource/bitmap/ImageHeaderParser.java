package com.bumptech.glide.load.resource.bitmap;

import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.MotionEventCompat;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class ImageHeaderParser {
    private static final byte[] a;
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    private final InputStream c;
    private final b d;

    private static int a(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private static boolean a(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum ImageType {
        GIF(true),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        JPEG(false),
        PNG_A(true),
        PNG(false),
        UNKNOWN(false);
        
        private final boolean a;

        ImageType(boolean z) {
            this.a = z;
        }

        public final boolean hasAlpha() {
            return this.a;
        }
    }

    static {
        byte[] bArr = new byte[0];
        try {
            bArr = "Exif\u0000\u0000".getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
        }
        a = bArr;
    }

    public ImageHeaderParser(InputStream inputStream) {
        this.c = inputStream;
        this.d = new b(inputStream);
    }

    public final ImageType a() throws IOException {
        int a2 = this.d.a();
        if (a2 == 65496) {
            return ImageType.JPEG;
        }
        int a3 = ((a2 << 16) & SupportMenu.CATEGORY_MASK) | (this.d.a() & SupportMenu.USER_MASK);
        if (a3 == -1991225785) {
            this.d.a(21L);
            return this.d.a.read() >= 3 ? ImageType.PNG_A : ImageType.PNG;
        } else if ((a3 >> 8) == 4671814) {
            return ImageType.GIF;
        } else {
            this.c.reset();
            byte[] bArr = new byte[26];
            this.d.a(bArr);
            if (com.dianping.animated.webp.b.a(bArr, 0, 21)) {
                if (com.dianping.animated.webp.b.a(bArr, 0)) {
                    return ImageType.ANIMATED_WEBP;
                }
                return c();
            }
            return ImageType.UNKNOWN;
        }
    }

    private ImageType c() throws IOException {
        this.c.reset();
        this.d.a(12L);
        int a2 = ((this.d.a() << 16) | this.d.a()) & 255;
        if (a2 == 88) {
            this.d.a(4L);
            return (this.d.b() & 16) != 0 ? ImageType.WEBP_A : ImageType.WEBP;
        } else if (a2 == 76) {
            this.d.a(4L);
            return (this.d.b() & 8) != 0 ? ImageType.WEBP_A : ImageType.WEBP;
        } else {
            return ImageType.WEBP;
        }
    }

    public final int b() throws IOException {
        if (a(this.d.a())) {
            byte[] d = d();
            boolean z = false;
            boolean z2 = d != null && d.length > a.length;
            if (z2) {
                for (int i = 0; i < a.length; i++) {
                    if (d[i] != a[i]) {
                        break;
                    }
                }
            }
            z = z2;
            if (z) {
                return a(new a(d));
            }
            return -1;
        }
        return -1;
    }

    private byte[] d() throws IOException {
        short b2;
        int a2;
        long j;
        long a3;
        do {
            short b3 = this.d.b();
            if (b3 != 255) {
                if (Log.isLoggable("ImageHeaderParser", 3)) {
                    new StringBuilder("Unknown segmentId=").append((int) b3);
                }
                return null;
            }
            b2 = this.d.b();
            if (b2 == 218) {
                return null;
            }
            if (b2 == 217) {
                Log.isLoggable("ImageHeaderParser", 3);
                return null;
            }
            a2 = this.d.a() - 2;
            if (b2 != 225) {
                j = a2;
                a3 = this.d.a(j);
            } else {
                byte[] bArr = new byte[a2];
                int a4 = this.d.a(bArr);
                if (a4 != a2) {
                    if (Log.isLoggable("ImageHeaderParser", 3)) {
                        StringBuilder sb = new StringBuilder("Unable to read segment data, type: ");
                        sb.append((int) b2);
                        sb.append(", length: ");
                        sb.append(a2);
                        sb.append(", actually read: ");
                        sb.append(a4);
                    }
                    return null;
                }
                return bArr;
            }
        } while (a3 == j);
        if (Log.isLoggable("ImageHeaderParser", 3)) {
            StringBuilder sb2 = new StringBuilder("Unable to skip enough data, type: ");
            sb2.append((int) b2);
            sb2.append(", wanted to skip: ");
            sb2.append(a2);
            sb2.append(", but actually skipped: ");
            sb2.append(a3);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.a r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.a(com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$a):int");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a {
        private final ByteBuffer a;

        public a(byte[] bArr) {
            this.a = ByteBuffer.wrap(bArr);
            this.a.order(ByteOrder.BIG_ENDIAN);
        }

        public final void a(ByteOrder byteOrder) {
            this.a.order(byteOrder);
        }

        public final int a() {
            return this.a.array().length;
        }

        public final int a(int i) {
            return this.a.getInt(i);
        }

        public final short b(int i) {
            return this.a.getShort(i);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class b {
        final InputStream a;

        public b(InputStream inputStream) {
            this.a = inputStream;
        }

        public final int a() throws IOException {
            return ((this.a.read() << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) | (this.a.read() & 255);
        }

        public final short b() throws IOException {
            return (short) (this.a.read() & 255);
        }

        public final long a(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    j2--;
                } else {
                    j2 -= skip;
                }
            }
            return j - j2;
        }

        public final int a(byte[] bArr) throws IOException {
            int length = bArr.length;
            while (length > 0) {
                int read = this.a.read(bArr, bArr.length - length, length);
                if (read == -1) {
                    break;
                }
                length -= read;
            }
            return bArr.length - length;
        }
    }
}

package com.dianping.imagemanager.utils;

import android.support.v4.view.InputDeviceCompat;
import android.support.v4.view.MotionEventCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    public static ChangeQuickRedirect a;
    private static final byte[] b = g.a("ftyp");
    private static final byte[] c = g.a("heic");
    private static final byte[] d = g.a("heix");
    private static final byte[] e = g.a("hevc");
    private static final byte[] f = g.a("hevx");
    private static final byte[] g = g.a("mif1");
    private static final byte[] h = g.a("msf1");

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum a {
        GIF(true, false),
        JPEG(false, true),
        PNG_A(true, false),
        PNG(false, false),
        BMP(false, false),
        SIMPLE_WEBP(false, false),
        LOSSLESS_WEBP(false, false),
        EXTENDED_WEBP_WITH_ALPHA(true, false),
        ANIMATED_WEBP(true, false),
        HEIF(false, true),
        HEIC(false, true),
        UNKNOWN(true, true);
        
        public static ChangeQuickRedirect a;
        public final boolean n;
        private final boolean o;

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d3cd0094dff0bf46da8706f566dba41d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d3cd0094dff0bf46da8706f566dba41d") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "041ba0be4871870117059178623ddda1", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "041ba0be4871870117059178623ddda1") : (a[]) values().clone();
        }

        a(boolean z, boolean z2) {
            Object[] objArr = {r10, Integer.valueOf(r11), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82bed9e57380c4c65e30408f0cf33d12", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82bed9e57380c4c65e30408f0cf33d12");
                return;
            }
            this.o = z;
            this.n = z2;
        }
    }

    public static a a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "94adeafbb7d87f8ff047838e4b8ae2de", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "94adeafbb7d87f8ff047838e4b8ae2de") : a(m.a(str, str2));
    }

    public static a a(InputStream inputStream) {
        Object[] objArr = {inputStream};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ebf1b810685880eb78a77c37df1db966", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ebf1b810685880eb78a77c37df1db966");
        }
        if (inputStream == null) {
            return a.UNKNOWN;
        }
        try {
            try {
                byte[] bArr = new byte[26];
                inputStream.read(bArr);
                a a2 = a(bArr);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
                return a2;
            } catch (IOException e3) {
                e3.printStackTrace();
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
                return a.UNKNOWN;
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException e5) {
                e5.printStackTrace();
            }
            throw th;
        }
    }

    public static a a(byte[] bArr) {
        int i;
        Object[] objArr = {bArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3ef7c7770e3a77b0bf0584f5c09858f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3ef7c7770e3a77b0bf0584f5c09858f7");
        }
        if (bArr == null) {
            return a.UNKNOWN;
        }
        try {
            i = (bArr[1] & 255) | ((bArr[0] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (i == 65496) {
            return a.JPEG;
        }
        if (t.a(bArr, 0, 21)) {
            if (t.b(bArr, 0)) {
                return a.SIMPLE_WEBP;
            }
            if (t.a(bArr, 0)) {
                return a.ANIMATED_WEBP;
            }
            if (t.c(bArr, 0)) {
                return a.LOSSLESS_WEBP;
            }
            if (t.d(bArr, 0)) {
                return a.EXTENDED_WEBP_WITH_ALPHA;
            }
        }
        int i2 = ((i << 8) & 16776960) | (bArr[2] & 255);
        if (i2 == 4671814) {
            return a.GIF;
        }
        if ((((i2 << 8) & InputDeviceCompat.SOURCE_ANY) | (bArr[3] & 255)) == -1991225785) {
            return bArr[25] >= 3 ? a.PNG_A : a.PNG;
        } else if (i == 16973) {
            return a.BMP;
        } else {
            if (g.a(bArr, 4, b)) {
                if (!g.a(bArr, 8, g) && !g.a(bArr, 8, h)) {
                    if (g.a(bArr, 8, c) || g.a(bArr, 8, d) || g.a(bArr, 8, e) || g.a(bArr, 8, f)) {
                        return a.HEIC;
                    }
                }
                return a.HEIF;
            }
            return a.UNKNOWN;
        }
    }
}

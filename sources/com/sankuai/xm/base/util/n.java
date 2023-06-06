package com.sankuai.xm.base.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.tencent.mapsdk.internal.jw;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class n {
    public static ChangeQuickRedirect a;
    public static final SimpleDateFormat b = new SimpleDateFormat("yyyyMMdd_HHmmss");
    public static final float c = a();

    public static String a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "39bdcefd78fe78ec09cf1fdb0164f266", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "39bdcefd78fe78ec09cf1fdb0164f266");
        }
        if (i != 1) {
            switch (i) {
                case 3:
                    return "bmp";
                case 4:
                    return CommonConstant.File.GIF;
                default:
                    return CommonConstant.File.JPG;
            }
        }
        return "png";
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d683aa2975e9b3ffa94c4c0be8343b55", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d683aa2975e9b3ffa94c4c0be8343b55");
        }
        return "IMG_" + System.currentTimeMillis() + CommonConstant.Symbol.UNDERLINE + str;
    }

    public static int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d707e3b71c147dd5c31861b85398241c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d707e3b71c147dd5c31861b85398241c")).intValue();
        }
        if (ac.a(str)) {
            return 0;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("w");
            if (ac.a(queryParameter)) {
                return 0;
            }
            return Integer.valueOf(queryParameter).intValue();
        } catch (Exception e) {
            com.sankuai.xm.log.c.d("meituan_base", "ImageUtils.getImageWidthFromUrl, ex = " + e.getMessage(), new Object[0]);
            return 0;
        }
    }

    public static int c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a19235017ad07684436e827d11be008c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a19235017ad07684436e827d11be008c")).intValue();
        }
        if (ac.a(str)) {
            return 0;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("h");
            if (ac.a(queryParameter)) {
                return 0;
            }
            return Integer.valueOf(queryParameter).intValue();
        } catch (Exception e) {
            com.sankuai.xm.log.c.d("meituan_base", "ImageUtils.getImageHeightFromUrl, ex = " + e.getMessage(), new Object[0]);
            return 0;
        }
    }

    public static int d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c08bfa2085755ff16347cf32bb83e5eb", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c08bfa2085755ff16347cf32bb83e5eb")).intValue();
        }
        if (ac.a(str)) {
            return 1;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("ot");
            if (ac.a(queryParameter)) {
                return 1;
            }
            return Integer.valueOf(queryParameter).intValue();
        } catch (Exception e) {
            com.sankuai.xm.log.c.d("meituan_base", "ImageUtils.getImageOrientationFromUrl, ex = " + e.getMessage(), new Object[0]);
            return 1;
        }
    }

    public static int[] a(int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7 = i4;
        int i8 = i5;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d7fa580e5d8f1880de3bdce07f429f9d", 6917529027641081856L)) {
            return (int[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d7fa580e5d8f1880de3bdce07f429f9d");
        }
        if (i <= 0 || i2 <= 0) {
            i6 = i8;
        } else {
            float f = i7;
            float f2 = i8;
            float f3 = (f * 1.0f) / f2;
            int max = Math.max(i2, i);
            int min = Math.min(i2, i);
            float f4 = (max * 1.0f) / min;
            if (f4 == 1.0f) {
                i6 = Math.max(Math.min(i2, i7), i8);
                i8 = i6;
            } else {
                if (f4 <= f3) {
                    if (min < i8) {
                        i7 = (int) (f2 * f4);
                    } else if (max > i7) {
                        i8 = (int) (f / f4);
                    } else {
                        i7 = max;
                        i8 = min;
                    }
                }
                if (i > i2) {
                    i6 = i8;
                    i8 = i7;
                } else {
                    i6 = i7;
                }
            }
        }
        if (i8 != i6) {
            switch (i3) {
            }
            return new int[]{i6, i8};
        }
        int i9 = i8;
        i8 = i6;
        i6 = i9;
        return new int[]{i6, i8};
    }

    public static int e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e724cdfed918aae1ea13bf7674c198b", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e724cdfed918aae1ea13bf7674c198b")).intValue();
        }
        if (ac.a(str)) {
            return 2;
        }
        String lowerCase = str.toLowerCase();
        if (ac.a(lowerCase, "image/png")) {
            return 1;
        }
        if (ac.a(lowerCase, "image/bmp")) {
            return 3;
        }
        return ac.a(lowerCase, "image/gif") ? 4 : 2;
    }

    public static String f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5f152a03f9ed4857145a93a245402e2e", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5f152a03f9ed4857145a93a245402e2e");
        }
        if (ac.a(str) || str.contains("image/")) {
            return str;
        }
        return "image/" + str;
    }

    public static boolean g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7e798ea3734ce0eefe9fdb253f7300f7", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7e798ea3734ce0eefe9fdb253f7300f7")).booleanValue();
        }
        if (ac.a(str)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 28 || !str.contains("heic")) {
            String lowerCase = str.toLowerCase();
            return lowerCase.contains(CommonConstant.File.JPG) || lowerCase.contains(CommonConstant.File.JPEG) || lowerCase.contains("bmp") || lowerCase.contains(CommonConstant.File.GIF) || lowerCase.contains("png") || lowerCase.contains("webp");
        }
        return true;
    }

    public static BitmapFactory.Options a(String str, int i, int i2) {
        int i3 = 200;
        Object[] objArr = {str, 200, 200};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e31133880db020349e825daa4942e74c", 6917529027641081856L)) {
            return (BitmapFactory.Options) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e31133880db020349e825daa4942e74c");
        }
        try {
            BitmapFactory.Options h = h(str);
            if (h == null) {
                return null;
            }
            int i4 = h.outWidth;
            int i5 = h.outHeight;
            int i6 = 50;
            if (i4 > i5) {
                int i7 = (i5 * 200) / i4;
                if (i7 < 50) {
                    i3 = (i4 * 50) / i5;
                } else {
                    i6 = i7;
                }
            } else {
                if (i4 < i5) {
                    int i8 = (i4 * 200) / i5;
                    if (i8 < 50) {
                        i6 = (i5 * 50) / i4;
                        i3 = 50;
                    } else {
                        i3 = i8;
                    }
                }
                i6 = 200;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.outWidth = i3;
            options.outHeight = i6;
            return options;
        } catch (Exception | OutOfMemoryError e) {
            com.sankuai.xm.log.c.b("meituan_base", "ImageMsgHandler.getThumbnailSizeByPath, exception = " + e.toString(), new Object[0]);
            return null;
        }
    }

    public static Bitmap a(int i, int i2, String str) {
        Object[] objArr = {Integer.valueOf((int) jw.h), 1280, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "04c6a5f168d8569a6938d16970ec3a26", 6917529027641081856L)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "04c6a5f168d8569a6938d16970ec3a26");
        }
        BitmapFactory.Options h = h(str);
        if (h == null) {
            return null;
        }
        return a(str, h, a(h.outWidth, h.outHeight, jw.h, 1280));
    }

    private static Bitmap a(String str, BitmapFactory.Options options, int i) {
        InputStream inputStream;
        Object[] objArr = {str, options, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6dd2fa470343ba95bc81bae348151c44", 6917529027641081856L)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6dd2fa470343ba95bc81bae348151c44");
        }
        if (k.o(str)) {
            try {
                options.inSampleSize = i;
                options.inJustDecodeBounds = false;
                options.inPurgeable = true;
                options.inInputShareable = true;
                options.inTempStorage = new byte[16384];
                options.inPreferredConfig = Bitmap.Config.RGB_565;
                inputStream = k.q(str);
                try {
                    Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(inputStream, (Rect) null, options);
                    m.a(inputStream);
                    return a2;
                } catch (Throwable th) {
                    th = th;
                    try {
                        com.sankuai.xm.log.c.a("ImageUtils", th);
                        m.a(inputStream);
                        return null;
                    } catch (Throwable th2) {
                        m.a(inputStream);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        }
        return null;
    }

    public static BitmapFactory.Options h(String str) {
        InputStream q;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        InputStream inputStream = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ba6de85662fbd2ace6c8a33a8cc43cd", 6917529027641081856L)) {
            return (BitmapFactory.Options) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ba6de85662fbd2ace6c8a33a8cc43cd");
        }
        if (k.o(str)) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                try {
                    q = k.q(str);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(q, (Rect) null, options);
                if (a2 != null) {
                    a2.recycle();
                }
                m.a(q);
            } catch (Exception e2) {
                e = e2;
                inputStream = q;
                com.sankuai.xm.log.c.a("ImageUtils", e);
                m.a(inputStream);
                return options;
            } catch (Throwable th2) {
                th = th2;
                inputStream = q;
                m.a(inputStream);
                throw th;
            }
            return options;
        }
        return null;
    }

    private static int a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dddebdd9bd30340d7fb1eb8f3b455f73", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dddebdd9bd30340d7fb1eb8f3b455f73")).intValue();
        }
        double min = Math.min(i / i3, i2 / i4);
        while (true) {
            int i6 = i5 << 1;
            if (i6 > min) {
                return i5;
            }
            i5 = i6;
        }
    }

    public static File a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af1998d91011917f0ff86100d3f2e7c8", 6917529027641081856L)) {
            return (File) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af1998d91011917f0ff86100d3f2e7c8");
        }
        if (context == null) {
            return null;
        }
        String format = b.format(new Date());
        String str = Environment.DIRECTORY_PICTURES;
        File a2 = k.a(str, "DaXiang_Chat/IMG_" + format + ".jpg");
        k.g(a2.getAbsolutePath());
        return a2;
    }

    public static boolean i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dec35488b3e69ba23644913c897be217", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dec35488b3e69ba23644913c897be217")).booleanValue() : !ac.a(str) && str.toLowerCase().endsWith(CommonConstant.File.GIF);
    }

    public static boolean a(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "527c4385629d2abd546f8285c56f75fe", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "527c4385629d2abd546f8285c56f75fe")).booleanValue() : i(uri.toString());
    }

    private static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1ab9519802d271357540bc468899a350", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1ab9519802d271357540bc468899a350")).intValue();
        }
        EGL10 egl10 = (EGL10) EGLContext.getEGL();
        EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
        egl10.eglInitialize(eglGetDisplay, new int[2]);
        int[] iArr = new int[1];
        egl10.eglGetConfigs(eglGetDisplay, null, 0, iArr);
        EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
        egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr);
        int[] iArr2 = new int[1];
        int i = 0;
        for (int i2 = 0; i2 < iArr[0]; i2++) {
            egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i2], 12332, iArr2);
            if (i < iArr2[0]) {
                i = iArr2[0];
            }
        }
        egl10.eglTerminate(eglGetDisplay);
        return Math.max(i, 2048);
    }

    public static byte[] a(Bitmap bitmap, Bitmap.CompressFormat compressFormat, long j) {
        float f;
        Bitmap bitmap2 = bitmap;
        Object[] objArr = {bitmap2, compressFormat, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70a1177cb3be6fa06b8d8fcb2bb1c3f1", 6917529027641081856L)) {
            return (byte[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70a1177cb3be6fa06b8d8fcb2bb1c3f1");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap2.compress(compressFormat, 100, byteArrayOutputStream);
        float size = byteArrayOutputStream.size();
        int i = 3;
        while (bitmap2 != null && j > 0) {
            if (size <= ((float) j)) {
                break;
            }
            int i2 = i - 1;
            if (i <= 0) {
                break;
            }
            float floor = ((float) Math.floor(Math.sqrt((f / size) * 0.8d) * 100.0d)) / 100.0f;
            Matrix matrix = new Matrix();
            matrix.setScale(floor, floor);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, true);
            if (createBitmap != null && !bitmap2.isRecycled()) {
                bitmap2.recycle();
            }
            if (createBitmap != null) {
                byteArrayOutputStream.reset();
                createBitmap.compress(compressFormat, 100, byteArrayOutputStream);
            }
            float size2 = byteArrayOutputStream.size();
            com.sankuai.xm.log.c.a("ImageUtils", "compress file, loop:%s, size:%s", Integer.valueOf(i2), Float.valueOf(size2));
            i = i2;
            size = size2;
            bitmap2 = createBitmap;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:202)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:45)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    public static boolean a(java.lang.String r17, java.io.OutputStream r18, long r19) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.xm.base.util.n.a(java.lang.String, java.io.OutputStream, long):boolean");
    }
}

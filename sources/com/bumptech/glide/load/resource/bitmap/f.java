package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class f implements a<InputStream> {
    private static final Set<ImageHeaderParser.ImageType> d = EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG, ImageHeaderParser.ImageType.WEBP_A, ImageHeaderParser.ImageType.WEBP);
    private static final Queue<BitmapFactory.Options> e = com.bumptech.glide.util.h.a(0);
    public static final f a = new f() { // from class: com.bumptech.glide.load.resource.bitmap.f.1
        @Override // com.bumptech.glide.load.resource.bitmap.a
        public final String a() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.f
        protected final int a(int i, int i2, int i3, int i4) {
            return Math.min(i2 / i4, i / i3);
        }
    };
    public static final f b = new f() { // from class: com.bumptech.glide.load.resource.bitmap.f.2
        @Override // com.bumptech.glide.load.resource.bitmap.a
        public final String a() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // com.bumptech.glide.load.resource.bitmap.f
        protected final int a(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int max = Math.max(1, Integer.highestOneBit(ceil));
            return max << (max >= ceil ? 0 : 1);
        }
    };
    public static final f c = new f() { // from class: com.bumptech.glide.load.resource.bitmap.f.3
        @Override // com.bumptech.glide.load.resource.bitmap.f
        protected final int a(int i, int i2, int i3, int i4) {
            return 0;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.a
        public final String a() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }
    };

    protected abstract int a(int i, int i2, int i3, int i4);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0130  */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.bumptech.glide.load.engine.bitmap_recycle.c] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.bumptech.glide.load.resource.bitmap.a.C0044a a(java.io.InputStream r22, com.bumptech.glide.load.engine.bitmap_recycle.c r23, int r24, int r25, com.bumptech.glide.load.a r26) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.f.a(java.io.InputStream, com.bumptech.glide.load.engine.bitmap_recycle.c, int, int, com.bumptech.glide.load.a):com.bumptech.glide.load.resource.bitmap.a$a");
    }

    private static boolean a(InputStream inputStream) {
        if (19 <= Build.VERSION.SDK_INT) {
            return true;
        }
        inputStream.mark(1024);
        try {
            try {
                boolean contains = d.contains(new ImageHeaderParser(inputStream).a());
                try {
                    inputStream.reset();
                } catch (IOException e2) {
                    if (Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Cannot reset the input stream", e2);
                    }
                }
                return contains;
            } catch (Throwable th) {
                try {
                    inputStream.reset();
                } catch (IOException e3) {
                    if (Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Cannot reset the input stream", e3);
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            if (Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Cannot determine the image type from header", e4);
            }
            try {
                inputStream.reset();
                return false;
            } catch (IOException e5) {
                if (Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Cannot reset the input stream", e5);
                    return false;
                }
                return false;
            }
        }
    }

    private static Bitmap.Config a(InputStream inputStream, com.bumptech.glide.load.a aVar, BitmapFactory.Options options, int i) {
        if (aVar == com.bumptech.glide.load.a.ALWAYS_ARGB_8888 || aVar == com.bumptech.glide.load.a.PREFER_ARGB_8888 || Build.VERSION.SDK_INT == 16) {
            return Bitmap.Config.ARGB_8888;
        }
        if (i == 0) {
            if (!com.bumptech.glide.i.a()) {
                if (options != null && com.bumptech.glide.util.h.c(options.outMimeType)) {
                    return Bitmap.Config.ARGB_8888;
                }
            } else if (options != null && com.bumptech.glide.util.h.a(options.outMimeType)) {
                return Bitmap.Config.ARGB_8888;
            }
        } else if (options != null) {
            if (com.bumptech.glide.util.h.a(options.outMimeType)) {
                return Bitmap.Config.ARGB_8888;
            }
            if (com.bumptech.glide.util.h.b(options.outMimeType)) {
                return i == 1 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
            }
        }
        boolean z = false;
        inputStream.mark(1024);
        try {
            try {
                boolean hasAlpha = new ImageHeaderParser(inputStream).a().hasAlpha();
                try {
                    inputStream.reset();
                } catch (IOException e2) {
                    if (Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Cannot reset the input stream", e2);
                    }
                }
                z = hasAlpha;
            } catch (Throwable th) {
                try {
                    inputStream.reset();
                } catch (IOException e3) {
                    if (Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Cannot reset the input stream", e3);
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            if (Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Cannot determine whether the image has alpha or not from header for format " + aVar, e4);
            }
            try {
                inputStream.reset();
            } catch (IOException e5) {
                if (Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Cannot reset the input stream", e5);
                }
            }
        }
        return z ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
    }

    private static Bitmap a(com.bumptech.glide.util.f fVar, o oVar, BitmapFactory.Options options, com.bumptech.glide.load.engine.bitmap_recycle.c cVar) {
        if (options.inJustDecodeBounds) {
            fVar.mark(5242880);
        } else {
            oVar.a();
        }
        Bitmap bitmap = null;
        try {
            bitmap = com.sankuai.waimai.launcher.util.image.a.a(fVar, (Rect) null, options);
        } catch (IllegalArgumentException e2) {
            if ("Problem decoding into existing bitmap".equals(e2.getMessage()) && !options.inJustDecodeBounds && options.inBitmap != null) {
                cVar.a(options.inBitmap);
                options.inBitmap = null;
                try {
                    fVar.reset();
                } catch (IOException unused) {
                }
                try {
                    bitmap = com.sankuai.waimai.launcher.util.image.a.a(fVar, (Rect) null, options);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                throw e2;
            }
        }
        try {
            if (options.inJustDecodeBounds) {
                fVar.reset();
            }
        } catch (IOException e3) {
            if (Log.isLoggable("Downsampler", 6)) {
                Log.e("Downsampler", "Exception loading inDecodeBounds=" + options.inJustDecodeBounds + " sample=" + options.inSampleSize, e3);
            }
        }
        return bitmap;
    }

    @TargetApi(11)
    private static synchronized BitmapFactory.Options b() {
        BitmapFactory.Options poll;
        synchronized (f.class) {
            synchronized (e) {
                poll = e.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                b(poll);
            }
        }
        return poll;
    }

    private static void a(BitmapFactory.Options options) {
        b(options);
        synchronized (e) {
            e.offer(options);
        }
    }

    @TargetApi(11)
    private static void b(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= Build.VERSION.SDK_INT) {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }
}

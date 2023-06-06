package com.tencent.mapsdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.meituan.android.common.statistics.Constants;
import com.tencent.map.tools.Util;
import com.tencent.mapsdk.core.utils.cache.MemoryCache;
import com.tencent.mapsdk.internal.ji;
import com.tencent.tencentmap.mapsdk.maps.TencentMapOptions;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class gx {
    protected static Paint a = null;
    public static a b = null;
    private static final int c = 2048;
    private static final String d = "BitmapUtil";
    private static byte[] e;

    static {
        Paint paint = new Paint();
        a = paint;
        paint.setAntiAlias(true);
    }

    private static byte[] c(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (bitmap == null || bitmap.isRecycled()) {
            return new byte[0];
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
            byteArrayOutputStream = null;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            kd.a(byteArrayOutputStream);
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            kd.a(byteArrayOutputStream);
            throw th;
        }
    }

    private static Bitmap a(int[] iArr, int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(iArr, i, i2, config);
    }

    public static byte[] a() {
        Bitmap a2;
        if (e == null && (a2 = a(256, 256, Bitmap.Config.ARGB_8888)) != null) {
            new Canvas(a2).drawARGB(0, 255, 255, 255);
            e = c(a2);
        }
        return e;
    }

    public static Bitmap a(View view) {
        Bitmap bitmap;
        if (view != null) {
            try {
                synchronized (view) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                    view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                    view.setDrawingCacheEnabled(true);
                    view.buildDrawingCache();
                    Bitmap drawingCache = view.getDrawingCache();
                    if (drawingCache != null && !drawingCache.isRecycled()) {
                        int width = drawingCache.getWidth();
                        int height = drawingCache.getHeight();
                        if (drawingCache != null && !drawingCache.isRecycled() && width > 0 && height > 0 && (bitmap = a(width, height, Bitmap.Config.ARGB_8888)) != null) {
                            bitmap.setDensity(drawingCache.getDensity());
                            Canvas canvas = new Canvas(bitmap);
                            bitmap.eraseColor(0);
                            canvas.drawBitmap(drawingCache, 0.0f, 0.0f, a);
                            view.destroyDrawingCache();
                        }
                    }
                    bitmap = null;
                    view.destroyDrawingCache();
                }
                return bitmap;
            } catch (Throwable th) {
                Log.e(d, "BitmapUtil.convertToBitmap errorDetail:" + Log.getStackTraceString(th));
            }
        }
        return null;
    }

    private static Bitmap d(Bitmap bitmap) {
        Bitmap a2;
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (bitmap == null || bitmap.isRecycled() || width <= 0 || height <= 0 || (a2 = a(width, height, Bitmap.Config.ARGB_8888)) == null) {
            return null;
        }
        a2.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(a2);
        a2.eraseColor(0);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, a);
        return a2;
    }

    private static Bitmap a(Bitmap bitmap, int i, int i2) {
        Bitmap a2;
        if (bitmap == null || bitmap.isRecycled() || i <= 0 || i2 <= 0 || (a2 = a(i, i2, Bitmap.Config.ARGB_8888)) == null) {
            return null;
        }
        a2.setDensity(bitmap.getDensity());
        Canvas canvas = new Canvas(a2);
        a2.eraseColor(0);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, a);
        return a2;
    }

    public static Bitmap a(Bitmap bitmap, Context context, int i, int i2) {
        int min;
        int min2;
        Bitmap a2;
        if (bitmap == null || bitmap.isRecycled() || i <= 0 || i2 <= 0 || (a2 = a((min = Math.min(i, 2048)), (min2 = Math.min(i2, 2048)), Bitmap.Config.ARGB_8888)) == null) {
            return null;
        }
        a2.eraseColor(0);
        Canvas canvas = new Canvas(a2);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        bitmapDrawable.setBounds(0, 0, min, min2);
        bitmapDrawable.draw(canvas);
        return a2;
    }

    public static String a(Bitmap bitmap) {
        ByteBuffer allocate;
        if (bitmap == null || bitmap.isRecycled()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (Build.VERSION.SDK_INT >= 19) {
            allocate = ByteBuffer.allocate(bitmap.getAllocationByteCount());
        } else {
            allocate = ByteBuffer.allocate(bitmap.getByteCount());
        }
        bitmap.copyPixelsToBuffer(allocate);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        sb.append("@");
        sb.append(width);
        sb.append(Constants.GestureMoveEvent.KEY_X);
        sb.append(height);
        sb.append("@");
        sb.append(Util.getMD5String(allocate.array()));
        allocate.clear();
        return sb.toString();
    }

    private static Bitmap c(String str, int i) {
        Rect rect = new Rect();
        TextPaint textPaint = new TextPaint(65);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(Integer.MIN_VALUE);
        textPaint.setTextSize(i);
        textPaint.clearShadowLayer();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        StaticLayout staticLayout = new StaticLayout(str, textPaint, Math.round(rect.width()), Layout.Alignment.ALIGN_CENTER, 0.0f, 0.0f, false);
        Bitmap a2 = a(staticLayout.getWidth(), staticLayout.getHeight(), Bitmap.Config.ARGB_8888);
        if (a2 == null) {
            return null;
        }
        Canvas canvas = new Canvas(a2);
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        return a2;
    }

    private static boolean a(Bitmap bitmap, String str, Bitmap.CompressFormat compressFormat) {
        FileOutputStream fileOutputStream;
        if (bitmap == null || bitmap.isRecycled() || TextUtils.isEmpty(str)) {
            return false;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            bitmap.compress(compressFormat, 100, fileOutputStream);
            kd.a(fileOutputStream);
            return true;
        } catch (Exception e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            kd.a(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            kd.a(fileOutputStream2);
            throw th;
        }
    }

    private static boolean a(Bitmap bitmap, String str) {
        return a(bitmap, str, Bitmap.CompressFormat.PNG);
    }

    private static Bitmap e(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setRotate(90.0f, width / 2.0f, height / 2.0f);
        try {
            return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        } catch (OutOfMemoryError unused) {
            try {
                return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
            } catch (OutOfMemoryError unused2) {
                return null;
            }
        }
    }

    private static Drawable f(Bitmap bitmap) {
        return new BitmapDrawable(bitmap);
    }

    private static Bitmap a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        if (drawable instanceof NinePatchDrawable) {
            Bitmap a2 = a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            if (a2 == null) {
                return null;
            }
            Canvas canvas = new Canvas(a2);
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.draw(canvas);
            return a2;
        }
        return null;
    }

    private static Bitmap a(int i, int i2, Bitmap.Config config) {
        try {
            try {
                return Bitmap.createBitmap(i, i2, config);
            } catch (OutOfMemoryError unused) {
                return Bitmap.createBitmap(i, i2, config);
            }
        } catch (OutOfMemoryError unused2) {
            return null;
        }
    }

    private static Bitmap a(Bitmap bitmap, float f) {
        if (bitmap == null || f == 1.0f) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    private static byte[] a(Bitmap bitmap, Bitmap.CompressFormat compressFormat) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(compressFormat, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.FileInputStream, java.io.InputStream] */
    public static Bitmap a(Context context, String str) {
        ?? r4;
        Bitmap bitmap;
        String str2;
        ?? r0 = null;
        try {
            if (str != null) {
                try {
                } catch (Exception e2) {
                    e = e2;
                    r4 = 0;
                } catch (Throwable th) {
                    th = th;
                    if (r0 != null) {
                        try {
                            r0.close();
                        } catch (Exception unused) {
                        }
                    }
                    throw th;
                }
                if (str.trim().length() != 0) {
                    if (str.trim().charAt(0) != '/') {
                        str2 = context.getFilesDir() + "/" + str;
                    } else {
                        str2 = context.getFilesDir() + str;
                    }
                    r4 = new FileInputStream(str2);
                    try {
                        bitmap = com.sankuai.waimai.launcher.util.image.a.a((InputStream) r4);
                    } catch (Exception e3) {
                        e = e3;
                        e.printStackTrace();
                        if (r4 != 0) {
                            try {
                                r4.close();
                            } catch (Exception unused2) {
                            }
                        }
                        bitmap = null;
                        str = r4;
                        return bitmap;
                    }
                    try {
                        r4.close();
                        str = r4;
                    } catch (Exception unused3) {
                    }
                    return bitmap;
                }
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            r0 = str;
        }
    }

    private static Bitmap g(Bitmap bitmap) {
        try {
            return Bitmap.createBitmap(bitmap);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static final Bitmap a(String str) {
        try {
            return com.sankuai.waimai.launcher.util.image.a.a(str);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap b(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89 java.lang.OutOfMemoryError -> L8c java.lang.Exception -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L89 java.lang.OutOfMemoryError -> L8c java.lang.Exception -> L91
            com.tencent.mapsdk.internal.mi r2 = com.tencent.mapsdk.internal.mi.a(r4, r0)     // Catch: java.lang.Throwable -> L89 java.lang.OutOfMemoryError -> L8c java.lang.Exception -> L91
            java.lang.String r2 = r2.e()     // Catch: java.lang.Throwable -> L89 java.lang.OutOfMemoryError -> L8c java.lang.Exception -> L91
            r1.append(r2)     // Catch: java.lang.Throwable -> L89 java.lang.OutOfMemoryError -> L8c java.lang.Exception -> L91
            r1.append(r5)     // Catch: java.lang.Throwable -> L89 java.lang.OutOfMemoryError -> L8c java.lang.Exception -> L91
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L89 java.lang.OutOfMemoryError -> L8c java.lang.Exception -> L91
            java.io.InputStream r1 = com.tencent.mapsdk.internal.kd.b(r1)     // Catch: java.lang.Throwable -> L89 java.lang.OutOfMemoryError -> L8c java.lang.Exception -> L91
            if (r1 != 0) goto L5e
            java.lang.String r2 = com.tencent.mapsdk.internal.mf.a()     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            if (r2 == 0) goto L3c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            r2.<init>()     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            java.lang.String r3 = com.tencent.mapsdk.internal.mf.a()     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            r2.append(r3)     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            r2.append(r5)     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            java.io.InputStream r2 = com.tencent.mapsdk.internal.mf.b(r4, r2)     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            goto L5f
        L3c:
            java.lang.String r2 = com.tencent.mapsdk.internal.mf.b()     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            if (r2 == 0) goto L5e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            r2.<init>()     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            java.lang.String r3 = com.tencent.mapsdk.internal.mf.b()     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            r2.append(r3)     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            r2.append(r5)     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            java.io.InputStream r2 = com.tencent.mapsdk.internal.kd.b(r2)     // Catch: java.lang.OutOfMemoryError -> L5a java.lang.Exception -> L5c java.lang.Throwable -> L9b
            goto L5f
        L5a:
            r4 = r1
            goto L8d
        L5c:
            r4 = move-exception
            goto L93
        L5e:
            r2 = r1
        L5f:
            if (r2 != 0) goto L78
            java.lang.String r1 = "tencentmap/mapsdk_vector/"
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L70 java.lang.OutOfMemoryError -> L73 java.lang.Exception -> L75
            java.lang.String r5 = r1.concat(r5)     // Catch: java.lang.Throwable -> L70 java.lang.OutOfMemoryError -> L73 java.lang.Exception -> L75
            java.io.InputStream r4 = com.tencent.mapsdk.internal.mf.b(r4, r5)     // Catch: java.lang.Throwable -> L70 java.lang.OutOfMemoryError -> L73 java.lang.Exception -> L75
            goto L79
        L70:
            r4 = move-exception
            r1 = r2
            goto L9c
        L73:
            r4 = r2
            goto L8d
        L75:
            r4 = move-exception
            r1 = r2
            goto L93
        L78:
            r4 = r2
        L79:
            android.graphics.Bitmap r5 = com.sankuai.waimai.launcher.util.image.a.a(r4)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L85 java.lang.OutOfMemoryError -> L8d
            com.tencent.mapsdk.internal.kd.a(r4)
            goto L9a
        L81:
            r5 = move-exception
            r1 = r4
            r4 = r5
            goto L9c
        L85:
            r5 = move-exception
            r1 = r4
            r4 = r5
            goto L93
        L89:
            r4 = move-exception
            r1 = r0
            goto L9c
        L8c:
            r4 = r0
        L8d:
            com.tencent.mapsdk.internal.kd.a(r4)
            goto L99
        L91:
            r4 = move-exception
            r1 = r0
        L93:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L9b
            com.tencent.mapsdk.internal.kd.a(r1)
        L99:
            r5 = r0
        L9a:
            return r5
        L9b:
            r4 = move-exception
        L9c:
            com.tencent.mapsdk.internal.kd.a(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.gx.b(android.content.Context, java.lang.String):android.graphics.Bitmap");
    }

    public static Bitmap a(Context context, int i) {
        try {
            return com.sankuai.waimai.launcher.util.image.a.a(context.getResources(), i);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    public static Bitmap b(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() / gy.b()), (int) (bitmap.getHeight() / gy.b()), true);
            } catch (OutOfMemoryError unused) {
                return null;
            }
        }
        return bitmap;
    }

    public static Bitmap c(Context context, String str) {
        InputStream inputStream;
        try {
            inputStream = context.getAssets().open(str);
        } catch (Exception unused) {
            inputStream = null;
        } catch (OutOfMemoryError unused2) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            Bitmap a2 = com.sankuai.waimai.launcher.util.image.a.a(inputStream);
            kd.a((Closeable) inputStream);
            return a2;
        } catch (Exception unused3) {
            kd.a((Closeable) inputStream);
            return null;
        } catch (OutOfMemoryError unused4) {
            kd.a((Closeable) inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            kd.a((Closeable) inputStream);
            throw th;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        private static final AtomicInteger b = new AtomicInteger();
        private final MemoryCache<jr> a;

        public a(Context context, int i) {
            File c = mi.a(context, (TencentMapOptions) null).c();
            if (ju.a("4.5.5.2", "4.4.6")) {
                kc.a(new File(c, "BitmapDescriptorCache"), new File(c, "bitmaps"));
            }
            MemoryCache.a aVar = new MemoryCache.a();
            aVar.b = i;
            aVar.c = new ji.b<jr>() { // from class: com.tencent.mapsdk.internal.gx.a.1
                @Override // com.tencent.mapsdk.internal.ji.b
                public final /* synthetic */ boolean a(jr jrVar) {
                    jr jrVar2 = jrVar;
                    if (jrVar2 != null) {
                        String str = jrVar2.f;
                        if (!jrVar2.f() || str == null) {
                            return true;
                        }
                        a.this.a.a(str);
                        return true;
                    }
                    return true;
                }

                /* renamed from: a  reason: avoid collision after fix types in other method */
                private boolean a2(jr jrVar) {
                    if (jrVar != null) {
                        String str = jrVar.f;
                        if (!jrVar.f() || str == null) {
                            return true;
                        }
                        a.this.a.a(str);
                        return true;
                    }
                    return true;
                }
            };
            this.a = (MemoryCache) jm.a(jr.class, aVar);
            a();
        }

        public static void a() {
            if (b.get() < 0) {
                b.set(0);
            }
            b.incrementAndGet();
        }

        public static int b() {
            return b.get();
        }

        public final synchronized void c() {
            if (b.get() <= 0 || b.decrementAndGet() == 0) {
                this.a.j();
            }
        }

        public final synchronized void a(String str, Bitmap bitmap) {
            a(str, new jr(bitmap));
        }

        private synchronized void a(String str, jr jrVar) {
            kj.b(ki.r, "putCache:" + str + " id:" + jrVar.f + " bitmapData:" + jrVar);
            jr a = this.a.a(str, jr.class);
            if (a != null) {
                kj.b(ki.r, "getCache:" + str + " id:" + a.f + " recycle:" + a.g() + " bitmapData:" + a);
            }
            if (a != null && !a.g() && !TextUtils.isEmpty(a.f) && a.f.equals(jrVar.f)) {
                kj.b(ki.r, "same bitmap!!".concat(String.valueOf(str)));
                a.e();
                return;
            }
            this.a.b(str, (String) jrVar);
        }

        public final synchronized Bitmap a(String str) {
            jr b2 = this.a.b(str, jr.class);
            if (b2 != null) {
                return b2.c();
            }
            return null;
        }

        public final synchronized boolean b(String str) {
            jr a = this.a.a(str, jr.class);
            if (a == null || !a.f()) {
                return false;
            }
            kj.b(ki.r, "remove:" + str + " bitmapData:" + a);
            this.a.a(str);
            return true;
        }
    }

    private static Bitmap a(String str, int i) {
        Rect rect = new Rect();
        TextPaint textPaint = new TextPaint(65);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(Integer.MIN_VALUE);
        textPaint.setTextSize(i);
        textPaint.clearShadowLayer();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        StaticLayout staticLayout = new StaticLayout(str, textPaint, Math.round(rect.width()), Layout.Alignment.ALIGN_CENTER, 0.0f, 0.0f, false);
        Bitmap a2 = a(staticLayout.getWidth(), staticLayout.getHeight(), Bitmap.Config.ARGB_8888);
        if (a2 == null) {
            return null;
        }
        Canvas canvas = new Canvas(a2);
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        return a2;
    }

    private static Bitmap b(String str, int i) {
        Rect rect = new Rect();
        TextPaint textPaint = new TextPaint(65);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setColor(Integer.MIN_VALUE);
        textPaint.setTextSize(i);
        textPaint.clearShadowLayer();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        StaticLayout staticLayout = new StaticLayout(str, textPaint, Math.round(rect.width()), Layout.Alignment.ALIGN_CENTER, 0.0f, 0.0f, false);
        Bitmap a2 = a(staticLayout.getWidth(), staticLayout.getHeight(), Bitmap.Config.ARGB_8888);
        if (a2 == null) {
            return null;
        }
        Canvas canvas = new Canvas(a2);
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        staticLayout.draw(canvas);
        canvas.restore();
        return a2;
    }
}

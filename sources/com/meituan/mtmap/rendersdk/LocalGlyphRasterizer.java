package com.meituan.mtmap.rendersdk;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Typeface;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class LocalGlyphRasterizer {
    private static final String FONT_STYLE_BLOD = "Bold";
    private static final String MAP_FONT_NAME = "Source Han Sans CN Normal";
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final ThreadLocal<GlyphPaint> threadLocal = new ThreadLocal<>();
    private static Map<String, Typeface> sTypefaceName = new ConcurrentHashMap();

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class GlyphPaint {
        public static ChangeQuickRedirect changeQuickRedirect;
        private Bitmap bitmap;
        private Canvas canvas;
        private Paint paint;

        public GlyphPaint() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dc6bd999717e38b563127c5db8cca7c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dc6bd999717e38b563127c5db8cca7c");
                return;
            }
            this.bitmap = Bitmap.createBitmap(35, 35, Bitmap.Config.ARGB_8888);
            this.paint = new Paint();
            this.canvas = new Canvas();
        }
    }

    public LocalGlyphRasterizer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (!PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "876d0d162e881b144c922185f3e90774", 6917529027641081856L)) {
            throw new UnsupportedOperationException("Utility classes should not be constructed.");
        }
        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "876d0d162e881b144c922185f3e90774");
    }

    @WorkerThread
    public static Bitmap drawGlyphBitmap(String str, boolean z, char c) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "584551313129444aa46002d27b48a24d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "584551313129444aa46002d27b48a24d");
        }
        try {
            if (threadLocal.get() == null) {
                threadLocal.set(new GlyphPaint());
            }
            GlyphPaint glyphPaint = threadLocal.get();
            glyphPaint.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            glyphPaint.canvas.drawPaint(glyphPaint.paint);
            glyphPaint.paint.setXfermode(null);
            glyphPaint.paint.setAntiAlias(true);
            glyphPaint.paint.setTextSize(24.0f);
            if (sTypefaceName.containsKey(str)) {
                glyphPaint.paint.setTypeface(sTypefaceName.get(str));
            } else {
                glyphPaint.paint.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            }
            Path path = new Path();
            glyphPaint.paint.getTextPath(String.valueOf(c), 0, 1, 0.0f, 28.0f, path);
            path.close();
            glyphPaint.canvas.setBitmap(glyphPaint.bitmap);
            glyphPaint.canvas.drawPath(path, glyphPaint.paint);
            return glyphPaint.bitmap;
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return null;
        }
    }

    @WorkerThread
    @RequiresApi(api = 23)
    public static float getGlyphAdvance(String str, boolean z, char c) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a03ea49c9fe5c2cc2bde370d3f4d9b34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a03ea49c9fe5c2cc2bde370d3f4d9b34")).floatValue();
        }
        try {
            if (threadLocal.get() == null) {
                threadLocal.set(new GlyphPaint());
            }
            GlyphPaint glyphPaint = threadLocal.get();
            glyphPaint.paint.setXfermode(null);
            glyphPaint.paint.setAntiAlias(true);
            glyphPaint.paint.setTextSize(24.0f);
            if (sTypefaceName.containsKey(str)) {
                glyphPaint.paint.setTypeface(sTypefaceName.get(str));
            } else {
                glyphPaint.paint.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            }
            return glyphPaint.paint.getRunAdvance(String.valueOf(c).toCharArray(), 0, 1, 0, 1, false, 1);
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return -1.0f;
        }
    }

    @WorkerThread
    @RequiresApi(api = 26)
    public static float[] getGlyphMetrics(String str, boolean z, char c) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "df80ac4d12ed9f026250a2acb93c12ce", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "df80ac4d12ed9f026250a2acb93c12ce");
        }
        try {
            if (threadLocal.get() == null) {
                threadLocal.set(new GlyphPaint());
            }
            GlyphPaint glyphPaint = threadLocal.get();
            glyphPaint.paint.setXfermode(null);
            glyphPaint.paint.setAntiAlias(true);
            glyphPaint.paint.setTextSize(24.0f);
            if (sTypefaceName.containsKey(str)) {
                glyphPaint.paint.setTypeface(sTypefaceName.get(str));
            } else {
                glyphPaint.paint.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            }
            Path path = new Path();
            glyphPaint.paint.getTextPath(String.valueOf(c), 0, 1, 0.0f, 0.0f, path);
            glyphPaint.paint.getFontMetrics();
            path.close();
            float[] approximate = path.approximate(0.5f);
            if (approximate != null && approximate.length >= 3) {
                float[] fArr = new float[5];
                float f = approximate[1];
                fArr[2] = f;
                fArr[0] = f;
                float f2 = approximate[2];
                fArr[3] = f2;
                fArr[1] = f2;
                for (int i = 3; i < approximate.length; i += 3) {
                    int i2 = i + 1;
                    if (fArr[0] > approximate[i2]) {
                        fArr[0] = approximate[i2];
                    }
                    if (fArr[2] < approximate[i2]) {
                        fArr[2] = approximate[i2];
                    }
                    int i3 = i + 2;
                    if (fArr[1] > approximate[i3]) {
                        fArr[1] = approximate[i3];
                    }
                    if (fArr[3] < approximate[i3]) {
                        fArr[3] = approximate[i3];
                    }
                }
                fArr[4] = glyphPaint.paint.getRunAdvance(String.valueOf(c).toCharArray(), 0, 1, 0, 1, false, 1);
                return fArr;
            }
            return new float[0];
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return new float[0];
        }
    }

    @WorkerThread
    @RequiresApi(api = 23)
    public static float[] getGlyphInfo(String str, boolean z, char c) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Character.valueOf(c)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2418b18b1a33ef72799f0c920f01cf53", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2418b18b1a33ef72799f0c920f01cf53");
        }
        try {
            if (threadLocal.get() == null) {
                threadLocal.set(new GlyphPaint());
            }
            GlyphPaint glyphPaint = threadLocal.get();
            glyphPaint.paint.setXfermode(null);
            glyphPaint.paint.setAntiAlias(true);
            glyphPaint.paint.setTextSize(24.0f);
            if (sTypefaceName.containsKey(str)) {
                glyphPaint.paint.setTypeface(sTypefaceName.get(str));
            } else {
                glyphPaint.paint.setTypeface(z ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            }
            Path path = new Path();
            glyphPaint.paint.getTextPath(String.valueOf(c), 0, 1, 0.0f, 0.0f, path);
            Paint.FontMetrics fontMetrics = glyphPaint.paint.getFontMetrics();
            path.close();
            float[] approximate = Build.VERSION.SDK_INT >= 26 ? path.approximate(0.5f) : null;
            if (approximate == null) {
                return new float[0];
            }
            approximate[0] = fontMetrics.top;
            approximate[3] = glyphPaint.paint.getRunAdvance(String.valueOf(c).toCharArray(), 0, 1, 0, 1, false, 1);
            return approximate;
        } catch (Throwable th) {
            SdkExceptionHandler.handleException(th);
            return new float[0];
        }
    }

    @WorkerThread
    public static Boolean canRasterizeGlyph(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "95d7886dd5180db3582647140831be83", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "95d7886dd5180db3582647140831be83");
        }
        if (sTypefaceName.containsKey(str)) {
            return Boolean.TRUE;
        }
        String[] split = str.split(CommonConstant.Symbol.COMMA);
        if (split.length > 0) {
            int i = split[split.length - 1].contains(FONT_STYLE_BLOD) ? 1 : 0;
            if (MAP_FONT_NAME.equals(split[0])) {
                putTypeface(str, i == 1 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT);
            } else {
                putTypeface(str, Typeface.create(split[0], i));
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @RequiresApi(api = 23)
    public static Boolean isMultiPath(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d3c2d0cc467c247ba4f3ecf2fa8ffe3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d3c2d0cc467c247ba4f3ecf2fa8ffe3");
        }
        try {
            if (threadLocal.get() == null) {
                threadLocal.set(new GlyphPaint());
            }
            GlyphPaint glyphPaint = threadLocal.get();
            glyphPaint.paint.setXfermode(null);
            glyphPaint.paint.setAntiAlias(true);
            glyphPaint.paint.setTextSize(24.0f);
            if (sTypefaceName.containsKey(str)) {
                glyphPaint.paint.setTypeface(sTypefaceName.get(str));
            } else {
                glyphPaint.paint.setTypeface(Typeface.DEFAULT);
            }
            Path path = new Path();
            glyphPaint.paint.getTextPath("十", 0, 1, 0.0f, 0.0f, path);
            path.close();
            float[] approximate = Build.VERSION.SDK_INT >= 26 ? path.approximate(0.5f) : null;
            for (int i = 3; i < approximate.length; i += 3) {
                if (approximate[i] == approximate[i - 3]) {
                    return Boolean.TRUE;
                }
            }
        } catch (Throwable unused) {
        }
        return Boolean.FALSE;
    }

    public static Boolean canGetGlyphPathData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8b82a291e24f1979557127c0f7830455", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8b82a291e24f1979557127c0f7830455");
        }
        return Boolean.valueOf(Build.VERSION.SDK_INT >= 26);
    }

    public static Boolean canGetGlyphAdvance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2802d8d5a930cc811bcd64007a7d177", RobustBitConfig.DEFAULT_VALUE)) {
            return (Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2802d8d5a930cc811bcd64007a7d177");
        }
        return Boolean.valueOf(Build.VERSION.SDK_INT >= 23);
    }

    public static void putTypeface(String str, Typeface typeface) {
        Object[] objArr = {str, typeface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d67b0752909ed1ddb764c3069daee8b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d67b0752909ed1ddb764c3069daee8b6");
        } else if (TextUtils.isEmpty(str) || typeface == null) {
        } else {
            sTypefaceName.put(str, typeface);
        }
    }

    public static void removeTypeface(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "83e1518cba11c99c04ccbd2eccd21832", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "83e1518cba11c99c04ccbd2eccd21832");
        } else if (TextUtils.isEmpty(str)) {
        } else {
            sTypefaceName.remove(str);
        }
    }

    public static Typeface getTypeface(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "af653a6b1d0300d781f621ec90ff2a78", RobustBitConfig.DEFAULT_VALUE)) {
            return (Typeface) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "af653a6b1d0300d781f621ec90ff2a78");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return sTypefaceName.remove(str);
    }
}

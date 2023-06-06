package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.opengl.GLUtils;
import com.dianping.titans.service.FileUtil;
import com.tencent.tencentmap.mapsdk.maps.TencentMapContext;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class lz {
    public static final int a = 1;
    public static final int b = 2;

    private static float a(float f, float f2) {
        return (int) ((f * f2) + 0.5f);
    }

    private static Bitmap a(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = 2;
        int i2 = 2;
        while (i2 < width) {
            i2 <<= 1;
        }
        while (i < height) {
            i <<= 1;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        try {
            Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            createBitmap.setDensity(0);
            Canvas canvas = new Canvas(createBitmap);
            canvas.setDensity(0);
            createBitmap.eraseColor(0);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return createBitmap;
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Bitmap a(InputStream inputStream) {
        return com.sankuai.waimai.launcher.util.image.a.a(inputStream, (Rect) null, a());
    }

    private static Bitmap a(byte[] bArr) {
        return com.sankuai.waimai.launcher.util.image.a.a(bArr, 0, bArr.length, a());
    }

    private static Bitmap b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = 2;
        int i2 = 2;
        while (i2 < width) {
            i2 <<= 1;
        }
        while (i < height) {
            i <<= 1;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i2, i, false);
        if (createScaledBitmap != bitmap) {
            bitmap.recycle();
        }
        return createScaledBitmap;
    }

    private static BitmapFactory.Options a() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        return options;
    }

    private static int a(GL10 gl10, Bitmap bitmap) {
        int b2 = b(gl10);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        return b2;
    }

    private static void a(GL10 gl10, int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(4);
        allocateDirect.order(ByteOrder.nativeOrder());
        IntBuffer asIntBuffer = allocateDirect.asIntBuffer();
        asIntBuffer.put(i);
        asIntBuffer.position(0);
        gl10.glDeleteTextures(1, asIntBuffer);
    }

    private static int a(GL10 gl10, int i, int i2, int i3, int i4, IntBuffer intBuffer) {
        int b2 = b(gl10);
        gl10.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        gl10.glTexSubImage2D(3553, 0, 0, 0, i3, i4, 6408, 5121, intBuffer);
        return b2;
    }

    private static Bitmap c(TencentMapContext tencentMapContext, Bitmap bitmap, String str, int i, int i2) {
        mj mjVar = new mj(tencentMapContext);
        mjVar.setColor(i);
        mjVar.setTextSize(a(i2, 2.0f));
        mjVar.setTypeface(Typeface.DEFAULT_BOLD);
        float f = mjVar.getFontMetrics().bottom - mjVar.getFontMetrics().top;
        int ceil = (int) Math.ceil(Math.max(bitmap.getWidth(), mjVar.measureText(str)) + 0.0f);
        int ceil2 = (int) Math.ceil(Math.max(bitmap.getHeight(), f) + 0.0f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, ceil, ceil2, false);
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDensity(0);
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, new Paint());
        float f2 = ceil2;
        float f3 = (f2 - ((f2 - f) / 2.0f)) - mjVar.getFontMetrics().bottom;
        mjVar.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, (float) (ceil / 2), f3, mjVar);
        return createBitmap;
    }

    private static float a(TencentMapContext tencentMapContext, String str, int i, float f) {
        mj mjVar = new mj(tencentMapContext);
        mjVar.setTextSize(a(i, f));
        mjVar.setTypeface(Typeface.DEFAULT_BOLD);
        return mjVar.measureText(str);
    }

    private static Bitmap a(String str, float f, int i, int i2, int i3, Typeface typeface) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setTextSize(f);
        if (typeface != null) {
            paint.setTypeface(typeface);
        }
        Paint paint2 = new Paint(paint);
        paint2.setColor(i2);
        paint2.setStrokeWidth(paint.getStrokeWidth() + 2.0f);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        float f2 = fontMetrics.bottom - fontMetrics.top;
        switch (i3) {
            case 1:
                int ceil = (int) Math.ceil(((f2 + 2.0f) * str.length()) + 4.0f);
                float f3 = 0.0f - fontMetrics.top;
                Bitmap createBitmap = Bitmap.createBitmap((int) Math.ceil(paint2.measureText(str.substring(0, 1)) + 4.0f), ceil, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                for (int i4 = 0; i4 < str.length(); i4++) {
                    char charAt = str.charAt(i4);
                    canvas.drawText(String.valueOf(charAt), 2.0f, f3, paint2);
                    canvas.drawText(String.valueOf(charAt), 2.0f, f3, paint);
                    f3 += f2;
                }
                return createBitmap;
            case 2:
                int ceil2 = (int) Math.ceil(paint2.measureText(str) + 4.0f);
                int ceil3 = (int) Math.ceil(f2);
                Bitmap createBitmap2 = Bitmap.createBitmap(ceil2, ceil3, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                float f4 = (float) (ceil2 / 2);
                float f5 = (float) ((ceil3 / 2) + 1);
                paint2.setTextAlign(Paint.Align.CENTER);
                paint.setTextAlign(Paint.Align.CENTER);
                canvas2.drawText(str, f4, f5, paint2);
                canvas2.drawText(str, f4, f5, paint);
                return createBitmap2;
            default:
                return null;
        }
    }

    private static int a(GL10 gl10) {
        int[] iArr = new int[1];
        gl10.glGenTextures(1, iArr, 0);
        return iArr[0];
    }

    private static int b(GL10 gl10) {
        int a2 = a(gl10);
        gl10.glBindTexture(3553, a2);
        gl10.glTexParameterf(3553, 10241, 9729.0f);
        gl10.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
        gl10.glTexParameterf(3553, 10242, 33071.0f);
        gl10.glTexParameterf(3553, 10243, 33071.0f);
        return a2;
    }

    private static Bitmap b(byte[] bArr) {
        return b(com.sankuai.waimai.launcher.util.image.a.a(bArr, 0, bArr.length, a()));
    }

    private static Bitmap b(InputStream inputStream) {
        return b(com.sankuai.waimai.launcher.util.image.a.a(inputStream, (Rect) null, a()));
    }

    private static Bitmap a(TencentMapContext tencentMapContext, Bitmap bitmap, String str, int i, int i2) {
        mj mjVar = new mj(tencentMapContext);
        mjVar.setColor(i);
        mjVar.setTextSize(a(i2, 2.0f));
        mjVar.setTypeface(Typeface.DEFAULT_BOLD);
        float f = mjVar.getFontMetrics().bottom - mjVar.getFontMetrics().top;
        int ceil = (int) Math.ceil(Math.max(bitmap.getWidth(), mjVar.measureText(str)) + 0.0f);
        int ceil2 = (int) Math.ceil(Math.max(bitmap.getHeight(), f) + 0.0f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, ceil, ceil2, false);
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDensity(0);
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, new Paint());
        float f2 = ceil2;
        float f3 = (f2 - ((f2 - f) / 2.0f)) - mjVar.getFontMetrics().bottom;
        mjVar.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, (float) (ceil / 2), f3, mjVar);
        return createBitmap;
    }

    private static Bitmap b(TencentMapContext tencentMapContext, Bitmap bitmap, String str, int i, int i2) {
        mj mjVar = new mj(tencentMapContext);
        mjVar.setColor(i);
        mjVar.setTextSize(a(i2, 2.0f));
        mjVar.setTypeface(Typeface.DEFAULT_BOLD);
        float f = mjVar.getFontMetrics().bottom - mjVar.getFontMetrics().top;
        int ceil = (int) Math.ceil(Math.max(bitmap.getWidth(), mjVar.measureText(str)) + 0.0f);
        int ceil2 = (int) Math.ceil(Math.max(bitmap.getHeight(), f) + 0.0f);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, ceil, ceil2, false);
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDensity(0);
        canvas.drawBitmap(createScaledBitmap, 0.0f, 0.0f, new Paint());
        float f2 = ceil2;
        float f3 = (f2 - ((f2 - f) / 2.0f)) - mjVar.getFontMetrics().bottom;
        mjVar.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(str, (float) (ceil / 2), f3, mjVar);
        return createBitmap;
    }
}

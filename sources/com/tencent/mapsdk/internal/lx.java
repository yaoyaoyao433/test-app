package com.tencent.mapsdk.internal;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLUtils;
import com.dianping.titans.service.FileUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL10;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class lx {
    public static final long a = 20;
    public static int b = 0;
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;

    public static double a(double d2, double d3, long j, long j2) {
        return ((d3 - d2) * (j2 / j)) + d2;
    }

    public static double b(double d2, double d3, long j, long j2) {
        double d4 = j2 / j;
        return ((d3 - d2) * d4 * d4) + d2;
    }

    public static double c(double d2, double d3, long j, long j2) {
        double d4 = (j2 / j) - 1.0d;
        return ((d3 - d2) * (1.0d - (d4 * d4))) + d2;
    }

    public static double d(double d2, double d3, long j, long j2) {
        double d4 = j2 / j;
        double d5 = d4 * d4;
        double d6 = d5 * d5;
        return ((d3 - d2) * d6 * d6) + d2;
    }

    public static double e(double d2, double d3, long j, long j2) {
        double d4 = (j2 / j) - 1.0d;
        double d5 = d4 * d4;
        double d6 = d5 * d5;
        return ((d3 - d2) * (1.0d - (d6 * d6))) + d2;
    }

    private static double f(double d2, double d3, long j, long j2) {
        double d4 = j2 / j;
        return ((d3 - d2) * d4 * d4 * d4 * d4) + d2;
    }

    private static double g(double d2, double d3, long j, long j2) {
        double d4 = (j2 / j) - 1.0d;
        return ((d3 - d2) * (1.0d - (((d4 * d4) * d4) * d4))) + d2;
    }

    private static double h(double d2, double d3, long j, long j2) {
        double d4 = j2 / (j - 1);
        double d5 = d4 * d4;
        return ((d2 - d3) * (1.0d - (d5 * d5))) + d3;
    }

    static {
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (maxMemory <= 16777216) {
            b = 1;
        } else if (maxMemory >= 67108864) {
            b = 2;
        } else {
            b = 0;
        }
    }

    private static boolean a() {
        return b == 1;
    }

    private static FloatBuffer a(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.rewind();
        return asFloatBuffer;
    }

    private static FloatBuffer a(int i) {
        ByteBuffer allocateDirect;
        ByteBuffer.allocate(0);
        int i2 = i * 4;
        try {
            allocateDirect = ByteBuffer.allocateDirect(i2);
        } catch (OutOfMemoryError e2) {
            allocateDirect = ByteBuffer.allocateDirect(i2);
            e2.printStackTrace();
        }
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.rewind();
        return asFloatBuffer;
    }

    private static FloatBuffer a(float[] fArr, FloatBuffer floatBuffer) {
        int length = fArr.length;
        if (floatBuffer == null || floatBuffer.capacity() != length) {
            floatBuffer = a(length);
        }
        floatBuffer.put(fArr);
        floatBuffer.rewind();
        return floatBuffer;
    }

    private static ShortBuffer a(short[] sArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect.asShortBuffer();
        asShortBuffer.put(sArr);
        asShortBuffer.rewind();
        return asShortBuffer;
    }

    private static ShortBuffer b(int i) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * 2);
        allocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer asShortBuffer = allocateDirect.asShortBuffer();
        asShortBuffer.rewind();
        return asShortBuffer;
    }

    private static ShortBuffer a(short[] sArr, ShortBuffer shortBuffer) {
        int length = sArr.length;
        if (shortBuffer == null || shortBuffer.capacity() != length) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length * 2);
            allocateDirect.order(ByteOrder.nativeOrder());
            shortBuffer = allocateDirect.asShortBuffer();
            shortBuffer.rewind();
        }
        shortBuffer.put(sArr);
        shortBuffer.rewind();
        return shortBuffer;
    }

    private static int a(GL10 gl10, Bitmap bitmap) {
        int[] iArr = new int[1];
        gl10.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        gl10.glBindTexture(3553, i);
        gl10.glTexParameterf(3553, 10241, 9729.0f);
        gl10.glTexParameterf(3553, FileUtil.DEFAULT_STREAM_BUFFER_SIZE, 9729.0f);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        return i;
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
        Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        createBitmap.eraseColor(0);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    private static float[] c(int i) {
        return new float[]{((i >> 16) & 255) / 255.0f, ((i >> 8) & 255) / 255.0f, (i & 255) / 255.0f, ((i >> 24) & 255) / 255.0f};
    }

    private static int a(float f) {
        int i = 1;
        while (true) {
            int i2 = i + 1;
            int i3 = 2 << i;
            if (i3 >= ((int) Math.ceil(f))) {
                return i3;
            }
            i = i2;
        }
    }
}

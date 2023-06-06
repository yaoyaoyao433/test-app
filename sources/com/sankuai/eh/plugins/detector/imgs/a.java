package com.sankuai.eh.plugins.detector.imgs;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.plugins.detector.imgs.b;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;

    private static float[][] a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3dcc4e99b7aabfa2bf5c38bbdfa8d45c", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[][]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3dcc4e99b7aabfa2bf5c38bbdfa8d45c");
        }
        float[][] fArr = (float[][]) Array.newInstance(float.class, 1, 2);
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int width = bitmap.getWidth() * bitmap.getHeight();
        if (width == 0) {
            return null;
        }
        int i = 0;
        for (int i2 = 0; i2 < width; i2++) {
            int i3 = i2 * 4;
            int i4 = array[i3] & 255;
            int i5 = array[i3 + 1] & 255;
            int i6 = array[i3 + 2] & 255;
            if (i4 == 255 && i5 == 255 && i6 == 255) {
                i++;
            }
        }
        fArr[0][0] = Color.parseColor("#ffffff");
        fArr[0][1] = Float.valueOf(String.format("%.5f", Float.valueOf(i / width))).floatValue();
        return fArr;
    }

    public static float[][] a(Bitmap bitmap, int i) {
        Object[] objArr = {bitmap, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "70ca783e88fd08fc54525daf98433113", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[][]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "70ca783e88fd08fc54525daf98433113");
        }
        if (bitmap == null) {
            return null;
        }
        if (i == 2) {
            return a(bitmap);
        }
        return b(bitmap, 5);
    }

    private static float[][] b(Bitmap bitmap, int i) {
        Object[] objArr = {bitmap, 5};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "531816d1d1825193be69d00418c49dfe", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[][]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "531816d1d1825193be69d00418c49dfe");
        }
        b.a c = c(bitmap, 5);
        if (c == null) {
            return null;
        }
        return c.a();
    }

    private static b.a c(Bitmap bitmap, int i) {
        Object[] objArr = {bitmap, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f3696aacf4ccd733aa47f2986952b791", RobustBitConfig.DEFAULT_VALUE) ? (b.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f3696aacf4ccd733aa47f2986952b791") : a(bitmap, i, 10, false);
    }

    private static b.a a(Bitmap bitmap, int i, int i2, boolean z) {
        Object[] objArr = {bitmap, Integer.valueOf(i), 10, (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68bb6c499edf4aa0e09a4d12e2c83d95", RobustBitConfig.DEFAULT_VALUE)) {
            return (b.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68bb6c499edf4aa0e09a4d12e2c83d95");
        }
        if (i < 2 || i > 256) {
            throw new IllegalArgumentException("Specified colorCount must be between 2 and 256.");
        }
        bitmap.hasAlpha();
        return b.a(a(bitmap, 10, false), i);
    }

    private static int[][] a(Bitmap bitmap, int i, boolean z) {
        int i2;
        Object[] objArr = {bitmap, Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65baa7adb4ca6086b31bba00608e963f", RobustBitConfig.DEFAULT_VALUE)) {
            return (int[][]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65baa7adb4ca6086b31bba00608e963f");
        }
        ByteBuffer allocate = ByteBuffer.allocate(bitmap.getByteCount());
        bitmap.copyPixelsToBuffer(allocate);
        byte[] array = allocate.array();
        int width = bitmap.getWidth() * bitmap.getHeight();
        boolean z2 = !bitmap.hasAlpha();
        int i3 = (!z2 ? 4 : 2) * width;
        if (i3 != array.length) {
            throw new IllegalArgumentException("(expectedDataLength = " + i3 + ") != (pixels.length = " + array.length + CommonConstant.Symbol.BRACKET_RIGHT);
        }
        int i4 = ((width + i) - 1) / i;
        int[][] iArr = new int[i4];
        if (!z2) {
            int i5 = 0;
            i2 = 0;
            while (i5 < width) {
                int i6 = i5 * 4;
                int i7 = array[i6] & 255;
                int i8 = array[i6 + 1] & 255;
                int i9 = array[i6 + 2] & 255;
                if (!z || i7 <= 250 || i8 <= 250 || i9 <= 250) {
                    int[] iArr2 = new int[3];
                    iArr2[0] = i7;
                    iArr2[1] = i8;
                    iArr2[2] = i9;
                    iArr[i2] = iArr2;
                    i2++;
                }
                i5 += i;
            }
        } else {
            int i10 = 0;
            i2 = 0;
            while (i10 < width) {
                int i11 = i10 * 2;
                int i12 = array[i11] & 255;
                int i13 = array[i11 + 1] & 255;
                int i14 = array[i11 + 2] & 255;
                if (!z || i12 <= 250 || i13 <= 250 || i14 <= 250) {
                    int[] iArr3 = new int[3];
                    iArr3[0] = i12;
                    iArr3[1] = i13;
                    iArr3[2] = i14;
                    iArr[i2] = iArr3;
                    i2++;
                }
                i10 += i;
            }
        }
        d.a("pixels", "所有像素数:" + i4 + "  收集像素数：" + i2);
        return (int[][]) Arrays.copyOfRange(iArr, 0, i2);
    }
}

package com.meituan.android.ocr;

import android.graphics.Bitmap;
import android.support.v4.view.MotionEventCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Array;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static Bitmap a(Bitmap bitmap, float f, int i) {
        int[] iArr;
        int i2 = 0;
        int i3 = 1;
        Object[] objArr = {bitmap, Float.valueOf(0.08f), 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db56dbb2b210c276ba57afe66a62d393", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db56dbb2b210c276ba57afe66a62d393");
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.08f), Math.round(bitmap.getHeight() * 0.08f), false);
        Bitmap copy = createScaledBitmap.copy(createScaledBitmap.getConfig(), true);
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i4 = width * height;
        int[] iArr2 = new int[i4];
        copy.getPixels(iArr2, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[i4];
        int[] iArr6 = new int[Math.max(width, height)];
        int[] iArr7 = new int[1024];
        for (int i7 = 0; i7 < 1024; i7++) {
            iArr7[i7] = i7 / 4;
        }
        int[][] iArr8 = (int[][]) Array.newInstance(int.class, 3, 3);
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < height) {
            int i11 = -1;
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            while (i11 <= i3) {
                int i21 = iArr2[i9 + Math.min(i5, Math.max(i11, i2))];
                int i22 = i11 + 1;
                int[] iArr9 = iArr8[i22];
                iArr9[i2] = (i21 & 16711680) >> 16;
                iArr9[1] = (i21 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[2] = i21 & 255;
                int abs = 2 - Math.abs(i11);
                i12 += iArr9[i2] * abs;
                i13 += iArr9[1] * abs;
                i14 += iArr9[2] * abs;
                if (i11 > 0) {
                    i15 += iArr9[i2];
                    i16 += iArr9[1];
                    i17 += iArr9[2];
                } else {
                    i18 += iArr9[i2];
                    i19 += iArr9[1];
                    i20 += iArr9[2];
                }
                i11 = i22;
                i3 = 1;
            }
            int i23 = 0;
            int i24 = 1;
            while (i23 < width) {
                iArr3[i9] = iArr7[i12];
                iArr4[i9] = iArr7[i13];
                iArr5[i9] = iArr7[i14];
                int i25 = i12 - i18;
                int i26 = i13 - i19;
                int i27 = i14 - i20;
                int[] iArr10 = iArr8[((i24 - 1) + 3) % 3];
                int i28 = i18 - iArr10[i2];
                int i29 = i19 - iArr10[1];
                int i30 = i20 - iArr10[2];
                if (i8 == 0) {
                    iArr6[i23] = Math.min(i23 + 1 + 1, i5);
                }
                int i31 = iArr2[i10 + iArr6[i23]];
                iArr10[0] = (i31 & 16711680) >> 16;
                iArr10[1] = (i31 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr10[2] = i31 & 255;
                int i32 = i15 + iArr10[0];
                int i33 = i16 + iArr10[1];
                int i34 = i17 + iArr10[2];
                i12 = i25 + i32;
                i13 = i26 + i33;
                i14 = i27 + i34;
                i24 = (i24 + 1) % 3;
                int[] iArr11 = iArr8[i24 % 3];
                i18 = i28 + iArr11[0];
                i19 = i29 + iArr11[1];
                i20 = i30 + iArr11[2];
                i15 = i32 - iArr11[0];
                i16 = i33 - iArr11[1];
                i17 = i34 - iArr11[2];
                i9++;
                i23++;
                i2 = 0;
            }
            i10 += width;
            i8++;
            i2 = 0;
            i3 = 1;
        }
        int i35 = 0;
        while (i35 < width) {
            Bitmap bitmap2 = copy;
            int i36 = width * (-1);
            int i37 = -1;
            int i38 = 0;
            int i39 = 0;
            int i40 = 0;
            int i41 = 0;
            int i42 = 0;
            int i43 = 0;
            int i44 = 0;
            int i45 = 0;
            int i46 = 0;
            for (int i47 = 1; i37 <= i47; i47 = 1) {
                int max = Math.max(0, i36) + i35;
                int i48 = i37 + 1;
                int[] iArr12 = iArr8[i48];
                iArr12[0] = iArr3[max];
                iArr12[1] = iArr4[max];
                iArr12[2] = iArr5[max];
                int abs2 = 2 - Math.abs(i37);
                i38 += iArr3[max] * abs2;
                i39 += iArr4[max] * abs2;
                i40 += iArr5[max] * abs2;
                if (i37 > 0) {
                    i41 += iArr12[0];
                    i42 += iArr12[1];
                    i43 += iArr12[2];
                } else {
                    i44 += iArr12[0];
                    i45 += iArr12[1];
                    i46 += iArr12[2];
                }
                if (i37 < i6) {
                    i36 += width;
                }
                i37 = i48;
            }
            int i49 = i35;
            int i50 = 0;
            int i51 = 1;
            while (i50 < height) {
                iArr2[i49] = (iArr2[i49] & (-16777216)) | (iArr7[i38] << 16) | (iArr7[i39] << 8) | iArr7[i40];
                int i52 = i38 - i44;
                int i53 = i39 - i45;
                int i54 = i40 - i46;
                int[] iArr13 = iArr8[((i51 - 1) + 3) % 3];
                int i55 = i44 - iArr13[0];
                int i56 = i45 - iArr13[1];
                int i57 = i46 - iArr13[2];
                if (i35 == 0) {
                    iArr = iArr7;
                    iArr6[i50] = Math.min(i50 + 2, i6) * width;
                } else {
                    iArr = iArr7;
                }
                int i58 = iArr6[i50] + i35;
                iArr13[0] = iArr3[i58];
                iArr13[1] = iArr4[i58];
                iArr13[2] = iArr5[i58];
                int i59 = i41 + iArr13[0];
                int i60 = i42 + iArr13[1];
                int i61 = i43 + iArr13[2];
                i38 = i52 + i59;
                i39 = i53 + i60;
                i40 = i54 + i61;
                i51 = (i51 + 1) % 3;
                int[] iArr14 = iArr8[i51];
                i44 = i55 + iArr14[0];
                i45 = i56 + iArr14[1];
                i46 = i57 + iArr14[2];
                i41 = i59 - iArr14[0];
                i42 = i60 - iArr14[1];
                i43 = i61 - iArr14[2];
                i49 += width;
                i50++;
                iArr7 = iArr;
            }
            i35++;
            copy = bitmap2;
            iArr7 = iArr7;
        }
        Bitmap bitmap3 = copy;
        bitmap3.setPixels(iArr2, 0, width, 0, 0, width, height);
        return bitmap3;
    }
}

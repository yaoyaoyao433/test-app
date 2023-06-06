package com.sankuai.common.utils;

import android.graphics.Bitmap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.tencent.mapsdk.internal.p;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class StackBlurManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final JavaBlurProcess _blurProcess;
    private final Bitmap _image;
    private Bitmap _result;
    public static final int EXECUTOR_THREADS = Math.min(Runtime.getRuntime().availableProcessors(), 4);
    public static final ExecutorService EXECUTOR = (ExecutorService) c.a();

    public StackBlurManager(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "835b656e6b2112ce8fddc7f0073fcbb6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "835b656e6b2112ce8fddc7f0073fcbb6");
            return;
        }
        this._image = bitmap;
        this._blurProcess = new JavaBlurProcess();
    }

    public Bitmap process(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b9aa296c79015750d4e6f4d39755308", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b9aa296c79015750d4e6f4d39755308");
        }
        this._result = this._blurProcess.blur(this._image, i);
        return this._result;
    }

    public Bitmap returnBlurredImage() {
        return this._result;
    }

    public void saveIntoFile(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7b51010d2f4688156deeb8a64603283", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7b51010d2f4688156deeb8a64603283");
            return;
        }
        try {
            this._result.compress(Bitmap.CompressFormat.PNG, 90, new FileOutputStream(str));
        } catch (Exception unused) {
        }
    }

    public Bitmap getImage() {
        return this._image;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class JavaBlurProcess {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final short[] stackblur_mul = {512, 512, 456, 512, 328, 456, 335, 512, 405, 328, 271, 456, 388, 335, 292, 512, 454, 405, 364, 328, 298, 271, 496, 456, 420, 388, 360, 335, 312, 292, 273, 512, 482, 454, 428, 405, 383, 364, 345, 328, 312, 298, 284, 271, 259, 496, 475, 456, 437, 420, 404, 388, 374, 360, 347, 335, 323, 312, 302, 292, 282, 273, 265, 512, 497, 482, 468, 454, 441, 428, 417, 405, 394, 383, 373, 364, 354, 345, 337, 328, 320, 312, 305, 298, 291, 284, 278, 271, 265, 259, 507, 496, 485, 475, 465, 456, 446, 437, 428, 420, 412, 404, 396, 388, 381, 374, 367, 360, 354, 347, 341, 335, 329, 323, 318, 312, 307, 302, 297, 292, 287, 282, 278, 273, 269, 265, 261, 512, 505, 497, 489, 482, 475, 468, 461, 454, 447, 441, 435, 428, 422, 417, 411, 405, 399, 394, 389, 383, 378, 373, 368, 364, 359, 354, 350, 345, 341, 337, 332, 328, 324, 320, 316, 312, 309, 305, 301, 298, 294, 291, 287, 284, 281, 278, 274, 271, 268, 265, 262, 259, 257, 507, 501, 496, 491, 485, 480, 475, 470, 465, 460, 456, 451, 446, 442, 437, 433, 428, 424, 420, 416, 412, 408, 404, 400, 396, 392, 388, 385, 381, 377, 374, 370, 367, 363, 360, 357, 354, 350, 347, 344, 341, 338, 335, 332, 329, 326, 323, 320, 318, 315, 312, 310, 307, 304, 302, 299, 297, 294, 292, 289, 287, 285, 282, 280, 278, 275, 273, 271, 269, 267, 265, 263, 261, 259};
        private static final byte[] stackblur_shr = {9, 11, p.ZERO_TAG, 13, 13, 14, 14, 15, 15, 15, 15, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 18, 18, 18, 18, 18, 18, 18, 18, 18, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 19, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 22, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 23, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24};

        /* JADX INFO: Access modifiers changed from: private */
        public static void blurIteration(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
            int i7 = i;
            int i8 = i2;
            Object[] objArr = {iArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ff2944f7ee7e76706afb5b6f72027497", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ff2944f7ee7e76706afb5b6f72027497");
                return;
            }
            int i9 = i7 - 1;
            int i10 = i8 - 1;
            int i11 = (i3 * 2) + 1;
            short s = stackblur_mul[i3];
            byte b = stackblur_shr[i3];
            int[] iArr2 = new int[i11];
            if (i6 == 1) {
                int i12 = (i5 * i8) / i4;
                int i13 = ((i5 + 1) * i8) / i4;
                while (i12 < i13) {
                    int i14 = i7 * i12;
                    int i15 = 0;
                    long j = 0;
                    long j2 = 0;
                    long j3 = 0;
                    long j4 = 0;
                    long j5 = 0;
                    long j6 = 0;
                    while (i15 <= i3) {
                        iArr2[i15] = iArr[i14];
                        i15++;
                        j += ((iArr[i14] >>> 16) & 255) * i15;
                        j2 += ((iArr[i14] >>> 8) & 255) * i15;
                        j3 += (iArr[i14] & 255) * i15;
                        j4 += (iArr[i14] >>> 16) & 255;
                        j5 += (iArr[i14] >>> 8) & 255;
                        j6 += iArr[i14] & 255;
                    }
                    int i16 = i14;
                    int i17 = 1;
                    long j7 = 0;
                    long j8 = 0;
                    long j9 = 0;
                    while (i17 <= i3) {
                        if (i17 <= i9) {
                            i16++;
                        }
                        iArr2[i17 + i3] = iArr[i16];
                        int i18 = (i3 + 1) - i17;
                        j += ((iArr[i16] >>> 16) & 255) * i18;
                        j2 += ((iArr[i16] >>> 8) & 255) * i18;
                        j3 += (iArr[i16] & 255) * i18;
                        j7 += (iArr[i16] >>> 16) & 255;
                        j8 += (iArr[i16] >>> 8) & 255;
                        j9 += iArr[i16] & 255;
                        i17++;
                        i13 = i13;
                        i12 = i12;
                    }
                    int i19 = i13;
                    int i20 = i12;
                    int i21 = i3 > i9 ? i9 : i3;
                    int i22 = i21;
                    int i23 = i21 + i14;
                    int i24 = i14;
                    int i25 = i3;
                    int i26 = 0;
                    while (i26 < i7) {
                        int i27 = i26;
                        long j10 = j7;
                        long j11 = s;
                        iArr[i24] = (int) ((iArr[i24] & (-16777216)) | ((((j * j11) >>> b) & 255) << 16) | ((((j2 * j11) >>> b) & 255) << 8) | (((j11 * j3) >>> b) & 255));
                        i24++;
                        long j12 = j - j4;
                        long j13 = j2 - j5;
                        long j14 = j3 - j6;
                        int i28 = (i25 + i11) - i3;
                        if (i28 >= i11) {
                            i28 -= i11;
                        }
                        long j15 = j4 - ((iArr2[i28] >>> 16) & 255);
                        long j16 = j5 - ((iArr2[i28] >>> 8) & 255);
                        long j17 = j6 - (iArr2[i28] & 255);
                        if (i22 < i9) {
                            i23++;
                            i22++;
                        }
                        iArr2[i28] = iArr[i23];
                        long j18 = j10 + ((iArr[i23] >>> 16) & 255);
                        long j19 = j8 + ((iArr[i23] >>> 8) & 255);
                        long j20 = j9 + (iArr[i23] & 255);
                        j = j12 + j18;
                        j2 = j13 + j19;
                        j3 = j14 + j20;
                        i25++;
                        if (i25 >= i11) {
                            i25 = 0;
                        }
                        j4 = j15 + ((iArr2[i25] >>> 16) & 255);
                        j5 = j16 + ((iArr2[i25] >>> 8) & 255);
                        j6 = j17 + (iArr2[i25] & 255);
                        j7 = j18 - ((iArr2[i25] >>> 16) & 255);
                        j8 = j19 - ((iArr2[i25] >>> 8) & 255);
                        j9 = j20 - (iArr2[i25] & 255);
                        i26 = i27 + 1;
                        i7 = i;
                    }
                    i12 = i20 + 1;
                    i13 = i19;
                    i7 = i;
                }
            } else if (i6 == 2) {
                int i29 = i;
                int i30 = (i5 * i29) / i4;
                int i31 = ((i5 + 1) * i29) / i4;
                while (i30 < i31) {
                    int i32 = 0;
                    long j21 = 0;
                    long j22 = 0;
                    long j23 = 0;
                    long j24 = 0;
                    long j25 = 0;
                    long j26 = 0;
                    while (i32 <= i3) {
                        iArr2[i32] = iArr[i30];
                        i32++;
                        j21 += ((iArr[i30] >>> 16) & 255) * i32;
                        j22 += ((iArr[i30] >>> 8) & 255) * i32;
                        j23 += (iArr[i30] & 255) * i32;
                        j24 += (iArr[i30] >>> 16) & 255;
                        j25 += (iArr[i30] >>> 8) & 255;
                        j26 += iArr[i30] & 255;
                        i11 = i11;
                        s = s;
                    }
                    int i33 = i11;
                    short s2 = s;
                    int i34 = i30;
                    int i35 = 1;
                    long j27 = 0;
                    long j28 = 0;
                    long j29 = 0;
                    while (i35 <= i3) {
                        if (i35 <= i10) {
                            i34 += i29;
                        }
                        iArr2[i35 + i3] = iArr[i34];
                        int i36 = (i3 + 1) - i35;
                        j21 += ((iArr[i34] >>> 16) & 255) * i36;
                        j22 += ((iArr[i34] >>> 8) & 255) * i36;
                        j23 += (iArr[i34] & 255) * i36;
                        j27 += (iArr[i34] >>> 16) & 255;
                        j28 += (iArr[i34] >>> 8) & 255;
                        j29 += iArr[i34] & 255;
                        i35++;
                        b = b;
                        iArr2 = iArr2;
                    }
                    byte b2 = b;
                    int[] iArr3 = iArr2;
                    int i37 = i3 > i10 ? i10 : i3;
                    int i38 = (i37 * i29) + i30;
                    long j30 = j29;
                    int i39 = i30;
                    long j31 = j28;
                    long j32 = j27;
                    int i40 = i3;
                    int i41 = i37;
                    int i42 = 0;
                    while (i42 < i8) {
                        int i43 = i31;
                        int i44 = i30;
                        int i45 = i41;
                        int i46 = i38;
                        short s3 = s2;
                        long j33 = s3;
                        iArr[i39] = (int) ((iArr[i39] & (-16777216)) | ((((j21 * j33) >>> b2) & 255) << 16) | ((((j22 * j33) >>> b2) & 255) << 8) | (((j33 * j23) >>> b2) & 255));
                        i39 += i29;
                        long j34 = j21 - j24;
                        long j35 = j22 - j25;
                        long j36 = j23 - j26;
                        int i47 = (i40 + i33) - i3;
                        int i48 = i33;
                        if (i47 >= i48) {
                            i47 -= i48;
                        }
                        long j37 = j24 - ((iArr3[i47] >>> 16) & 255);
                        long j38 = j25 - ((iArr3[i47] >>> 8) & 255);
                        long j39 = j26 - (iArr3[i47] & 255);
                        i41 = i45;
                        if (i41 < i10) {
                            i38 = i46 + i29;
                            i41++;
                        } else {
                            i38 = i46;
                        }
                        iArr3[i47] = iArr[i38];
                        long j40 = j32 + ((iArr[i38] >>> 16) & 255);
                        long j41 = j31 + ((iArr[i38] >>> 8) & 255);
                        long j42 = j30 + (iArr[i38] & 255);
                        j21 = j34 + j40;
                        j22 = j35 + j41;
                        j23 = j36 + j42;
                        i40++;
                        if (i40 >= i48) {
                            i40 = 0;
                        }
                        j24 = j37 + ((iArr3[i40] >>> 16) & 255);
                        j25 = j38 + ((iArr3[i40] >>> 8) & 255);
                        j26 = j39 + (iArr3[i40] & 255);
                        j32 = j40 - ((iArr3[i40] >>> 16) & 255);
                        j31 = j41 - ((iArr3[i40] >>> 8) & 255);
                        j30 = j42 - (iArr3[i40] & 255);
                        i42++;
                        i33 = i48;
                        s2 = s3;
                        i31 = i43;
                        i30 = i44;
                        i29 = i;
                        i8 = i2;
                    }
                    i11 = i33;
                    s = s2;
                    b = b2;
                    iArr2 = iArr3;
                    i8 = i2;
                    i30++;
                    i29 = i;
                }
            }
        }

        public Bitmap blur(Bitmap bitmap, float f) {
            Object[] objArr = {bitmap, Float.valueOf(f)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1f25afc44479260de59c59893899a01a", RobustBitConfig.DEFAULT_VALUE)) {
                return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1f25afc44479260de59c59893899a01a");
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int i = StackBlurManager.EXECUTOR_THREADS;
            ArrayList arrayList = new ArrayList(i);
            ArrayList arrayList2 = new ArrayList(i);
            int i2 = 0;
            while (i2 < i) {
                int i3 = (int) f;
                int[] iArr2 = iArr;
                int i4 = height;
                int i5 = i2;
                arrayList.add(new BlurTask(iArr, width, height, i3, i, i5, 1));
                arrayList2.add(new BlurTask(iArr2, width, i4, i3, i, i5, 2));
                i2++;
                height = i4;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            int i6 = height;
            try {
                StackBlurManager.EXECUTOR.invokeAll(arrayList);
                try {
                    StackBlurManager.EXECUTOR.invokeAll(arrayList2);
                    return Bitmap.createBitmap(iArr3, width, i6, Bitmap.Config.ARGB_8888);
                } catch (InterruptedException unused) {
                    return null;
                }
            } catch (InterruptedException unused2) {
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes3.dex */
        public static class BlurTask implements Callable<Void> {
            public static ChangeQuickRedirect changeQuickRedirect;
            private final int _coreIndex;
            private final int _h;
            private final int _radius;
            private final int _round;
            private final int[] _src;
            private final int _totalCores;
            private final int _w;

            public BlurTask(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
                Object[] objArr = {iArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45e0a63031bc385dec8cff03f04d5481", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45e0a63031bc385dec8cff03f04d5481");
                    return;
                }
                this._src = iArr;
                this._w = i;
                this._h = i2;
                this._radius = i3;
                this._totalCores = i4;
                this._coreIndex = i5;
                this._round = i6;
            }

            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfabc89448cbb9ba2fdfeb9a2d8bc6e5", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Void) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfabc89448cbb9ba2fdfeb9a2d8bc6e5");
                }
                JavaBlurProcess.blurIteration(this._src, this._w, this._h, this._radius, this._totalCores, this._coreIndex, this._round);
                return null;
            }
        }
    }
}

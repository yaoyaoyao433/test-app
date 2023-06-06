package com.sankuai.meituan.android.knb.image;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.image.a;
import java.io.File;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class KNBImageUtil {
    private static final int FILE_STATUS_0 = 0;
    private static final int FILE_STATUS_1 = 1;
    private static final int FILE_STATUS_2 = 2;
    private static final int FILE_STATUS_3 = 3;
    public static final String IMAGE_BASE64 = "data:image/jpeg;base64,%s";
    private static final int SAMPLE_SIZE_0 = 1;
    private static final int SAMPLE_SIZE_1 = 4;
    private static final int SAMPLE_SIZE_2 = 8;
    private static final int SAMPLE_SIZE_3 = 16;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static int calculateSampleSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b958ef97549f3774d45b045b84da9c37", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b958ef97549f3774d45b045b84da9c37")).intValue();
        }
        switch (i) {
            case 0:
                return 1;
            case 1:
                return 4;
            case 2:
                return 8;
            case 3:
                return 16;
            default:
                return 1;
        }
    }

    public static int getStatusByFileLength(long j) throws OutOfMemoryError {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "39a5cf40e03385240d1b8c44362769a5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "39a5cf40e03385240d1b8c44362769a5")).intValue();
        }
        long freeMemorySize = getFreeMemorySize();
        if (freeMemorySize > 2 * j) {
            return 0;
        }
        if (freeMemorySize >= j) {
            if (j <= 2097152) {
                return 1;
            }
            if (j <= 4194304) {
                return 2;
            }
            return j <= 6291456 ? 3 : 3;
        }
        throw new OutOfMemoryError("free memory is low than the file");
    }

    public static BitmapFactory.Options calculateSampleSize(BitmapFactory.Options options, int i) {
        Object[] objArr = {options, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d39b31644bf64bc6b72ddb6160888d7b", RobustBitConfig.DEFAULT_VALUE)) {
            return (BitmapFactory.Options) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d39b31644bf64bc6b72ddb6160888d7b");
        }
        if (options == null) {
            options = new BitmapFactory.Options();
        }
        options.inSampleSize = calculateSampleSize(i);
        return options;
    }

    public static void calculateInSampleSize(int i, int i2, int i3, int i4, BitmapFactory.Options options, File file) throws NullPointerException, OutOfMemoryError {
        int min;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), options, file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6c04d08f9dfc2a8ee8f035b9e2e72612", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6c04d08f9dfc2a8ee8f035b9e2e72612");
        } else if (options == null) {
            throw new NullPointerException("options is null");
        } else {
            if (i4 > i2 || i3 > i) {
                if (i2 == 0 && i == 0) {
                    if (file == null) {
                        throw new NullPointerException("file is null");
                    }
                    try {
                        calculateSampleSize(options, getStatusByFileLength(file.length()));
                        min = 1;
                    } catch (OutOfMemoryError e) {
                        throw new OutOfMemoryError(e.getMessage());
                    }
                } else if (i2 == 0) {
                    min = (int) Math.floor(i3 / i);
                } else if (i == 0) {
                    min = (int) Math.floor(i4 / i2);
                } else {
                    min = Math.min((int) Math.floor(i4 / i2), (int) Math.floor(i3 / i));
                }
                options.inSampleSize = min;
            } else {
                try {
                    options.inSampleSize = calculateSampleSize(getStatusByFileLength(file.length()));
                } catch (NullPointerException e2) {
                    options.inSampleSize = 1;
                    throw new NullPointerException(e2.getMessage());
                } catch (OutOfMemoryError e3) {
                    options.inSampleSize = 1;
                    throw new OutOfMemoryError(e3.getMessage());
                }
            }
            options.inJustDecodeBounds = false;
        }
    }

    public static Matrix scaleByExifInterface(File file) {
        Object[] objArr = {file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb8c49f7ce493e2797e9484bc41b78a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb8c49f7ce493e2797e9484bc41b78a3");
        }
        Matrix matrix = new Matrix();
        if (file == null) {
            return matrix;
        }
        try {
            switch (new ExifInterface(file.getAbsolutePath()).getAttributeInt("Orientation", 0)) {
                case 2:
                    matrix.preScale(-1.0f, 1.0f);
                    break;
                case 3:
                    matrix.postRotate(180.0f);
                    break;
                case 4:
                    matrix.preScale(1.0f, -1.0f);
                    break;
                case 5:
                    matrix.postRotate(90.0f);
                    matrix.preScale(1.0f, -1.0f);
                    break;
                case 6:
                    matrix.postRotate(90.0f);
                    break;
                case 7:
                    matrix.postRotate(-90.0f);
                    matrix.preScale(1.0f, -1.0f);
                    break;
                case 8:
                    matrix.postRotate(270.0f);
                    break;
                default:
                    matrix = null;
                    break;
            }
        } catch (IOException unused) {
        }
        return matrix;
    }

    public static long getFreeMemorySize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "70101cf08c75b4f101b83f7e0d08a885", RobustBitConfig.DEFAULT_VALUE) ? ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "70101cf08c75b4f101b83f7e0d08a885")).longValue() : Runtime.getRuntime().freeMemory();
    }

    public static Bitmap createBitmap(int i, int i2, BitmapFactory.Options options, File file) throws IllegalArgumentException {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), options, file};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ab21c30bb3c90e20083c3fb8b851a554", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ab21c30bb3c90e20083c3fb8b851a554");
        }
        if (file != null) {
            if (options == null) {
                throw new IllegalArgumentException("the options cannot be null.");
            }
            try {
                calculateInSampleSize(i, i2, options.outWidth, options.outHeight, options, file);
                Bitmap a = a.a(file.getAbsolutePath(), options);
                if (a != null) {
                    try {
                        return Bitmap.createScaledBitmap(a, i, i2, true);
                    } catch (Throwable unused) {
                        return a;
                    }
                }
                return a;
            } catch (Throwable unused2) {
                return null;
            }
        }
        throw new IllegalArgumentException("the file cannot be null.");
    }
}

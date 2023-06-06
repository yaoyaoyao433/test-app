package com.dianping.shield.component.utils;

import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ColorMatrixColorFilterUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class ColorArray {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final float[] YUANTU = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] HUIDU = {0.213f, 0.715f, 0.072f, 0.0f, 0.0f, 0.213f, 0.715f, 0.072f, 0.0f, 0.0f, 0.213f, 0.715f, 0.072f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] HUIDU2 = {0.3086f, 0.6094f, 0.082f, 0.0f, 0.0f, 0.3086f, 0.6094f, 0.082f, 0.0f, 0.0f, 0.3086f, 0.6094f, 0.082f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] HUIDU3 = {0.33f, 0.33f, 0.33f, 0.0f, 0.0f, 0.33f, 0.33f, 0.33f, 0.0f, 0.0f, 0.33f, 0.33f, 0.33f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] HEIBAI = {0.8f, 1.6f, 0.2f, 0.0f, -163.9f, 0.8f, 1.6f, 0.2f, 0.0f, -163.9f, 0.8f, 1.6f, 0.2f, 0.0f, -163.9f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] HUAIJIU = {0.2f, 0.5f, 0.1f, 0.0f, 40.8f, 0.2f, 0.5f, 0.1f, 0.0f, 40.8f, 0.2f, 0.5f, 0.1f, 0.0f, 40.8f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] GETE = {1.9f, -0.3f, -0.2f, 0.0f, -87.0f, -0.2f, 1.7f, -0.1f, 0.0f, -87.0f, -0.1f, -0.6f, 2.0f, 0.0f, -87.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] DANYA = {0.6f, 0.3f, 0.1f, 0.0f, 73.3f, 0.2f, 0.7f, 0.1f, 0.0f, 73.3f, 0.2f, 0.3f, 0.4f, 0.0f, 73.3f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] LANDIAO = {2.1f, -1.4f, 0.6f, 0.0f, -71.0f, -0.3f, 2.0f, -0.3f, 0.0f, -71.0f, -1.1f, -0.2f, 2.6f, 0.0f, -71.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] GUANGYUN = {0.9f, 0.0f, 0.0f, 0.0f, 64.9f, 0.0f, 0.9f, 0.0f, 0.0f, 64.9f, 0.0f, 0.0f, 0.9f, 0.0f, 64.9f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] MENGHUAN = {0.8f, 0.3f, 0.1f, 0.0f, 46.5f, 0.1f, 0.9f, 0.0f, 0.0f, 46.5f, 0.1f, 0.3f, 0.7f, 0.0f, 46.5f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] JIUHONG = {1.2f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] JIAOPIAN = {-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] JIAOPIAN2 = {0.71f, 0.2f, 0.0f, 0.0f, 60.0f, 0.0f, 0.94f, 0.0f, 0.0f, 60.0f, 0.0f, 0.0f, 0.62f, 0.0f, 60.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] HUGUANGLUEYING = {0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] HEPIAN = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] FUGU = {0.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] FANHUANG = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] CHUANTONG = {1.0f, 0.0f, 0.0f, 0.0f, -10.0f, 0.0f, 1.0f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 1.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] RUISE = {4.8f, -1.0f, -0.1f, 0.0f, -388.4f, -0.5f, 4.4f, -0.1f, 0.0f, -388.4f, -0.5f, -1.0f, 5.2f, 0.0f, -388.4f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] QINGNING = {0.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.9f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] LANGMAN = {0.9f, 0.0f, 0.0f, 0.0f, 63.0f, 0.0f, 0.9f, 0.0f, 0.0f, 63.0f, 0.0f, 0.0f, 0.9f, 0.0f, 63.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        public static final float[] YESE = {1.0f, 0.0f, 0.0f, 0.0f, -66.6f, 0.0f, 1.1f, 0.0f, 0.0f, -66.6f, 0.0f, 0.0f, 1.0f, 0.0f, -66.6f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }

    public static ColorMatrixColorFilter getColorMatrixColorFilter(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee6306b757a2b857358e31b4db109ddd", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorMatrixColorFilter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee6306b757a2b857358e31b4db109ddd");
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setScale((f2 / 255.0f) + 1.0f, (f3 / 255.0f) + 1.0f, (f4 / 255.0f) + 1.0f, f / 255.0f);
        ColorMatrix colorMatrix3 = new ColorMatrix();
        colorMatrix3.postConcat(colorMatrix);
        colorMatrix3.postConcat(colorMatrix2);
        return new ColorMatrixColorFilter(colorMatrix3);
    }

    public static ColorMatrixColorFilter getColorMatrixColorFilter(float f, float f2, float f3) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ebd384514374278d50f7dd598bc2b9e7", RobustBitConfig.DEFAULT_VALUE) ? (ColorMatrixColorFilter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ebd384514374278d50f7dd598bc2b9e7") : getColorMatrixColorFilter(255.0f, f, f2, f3);
    }

    public static ColorMatrixColorFilter getColorMatrixColorFilter(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2ca86094421a503b4e675c4af04e8e7e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorMatrixColorFilter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2ca86094421a503b4e675c4af04e8e7e");
        }
        String replaceFirst = str.replaceFirst("#", "").replaceFirst("0x", "");
        if (Build.VERSION.SDK_INT >= 26) {
            return getColorMatrixColorFilter(Long.parseLong(replaceFirst, 16));
        }
        if (replaceFirst.length() == 8) {
            replaceFirst = replaceFirst.substring(2, replaceFirst.length());
        }
        return getColorMatrixColorFilter(Integer.parseInt(replaceFirst, 16));
    }

    public static ColorMatrixColorFilter getColorMatrixColorFilter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fd07af7d7faf870a33755a5b22ac42c9", RobustBitConfig.DEFAULT_VALUE) ? (ColorMatrixColorFilter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fd07af7d7faf870a33755a5b22ac42c9") : getColorMatrixColorFilter(Color.red(i), Color.green(i), Color.blue(i));
    }

    @RequiresApi(api = 26)
    public static ColorMatrixColorFilter getColorMatrixColorFilter(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c4e2c29cdce96c02a4a3e934905f091f", RobustBitConfig.DEFAULT_VALUE) ? (ColorMatrixColorFilter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c4e2c29cdce96c02a4a3e934905f091f") : getColorMatrixColorFilter(Color.alpha(j), Color.red(j), Color.green(j), Color.blue(j));
    }

    public static ColorMatrixColorFilter getColorMatrixColorFilter(float[] fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "068d7d171d4255bf8b89433c65318c64", RobustBitConfig.DEFAULT_VALUE) ? (ColorMatrixColorFilter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "068d7d171d4255bf8b89433c65318c64") : new ColorMatrixColorFilter(fArr);
    }

    public static ColorMatrixColorFilter grayScale() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f5795f461de5b76b2e912c02e9541b5f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorMatrixColorFilter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f5795f461de5b76b2e912c02e9541b5f");
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        return new ColorMatrixColorFilter(colorMatrix);
    }

    public static ColorMatrixColorFilter blackAndWhite() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6b4d90afdb94849787a9e7d321aeb802", RobustBitConfig.DEFAULT_VALUE) ? (ColorMatrixColorFilter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6b4d90afdb94849787a9e7d321aeb802") : getColorMatrixColorFilter(ColorArray.HEIBAI);
    }

    public static ColorMatrixColorFilter raw() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d3a8815a2ceca3a6c5fa8b65ff2cbc06", RobustBitConfig.DEFAULT_VALUE) ? (ColorMatrixColorFilter) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d3a8815a2ceca3a6c5fa8b65ff2cbc06") : getColorMatrixColorFilter(ColorArray.YUANTU);
    }
}

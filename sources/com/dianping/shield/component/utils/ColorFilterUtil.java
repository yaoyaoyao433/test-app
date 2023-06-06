package com.dianping.shield.component.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ColorFilterUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void setColorFilter(ImageView imageView, @ColorInt int i) {
        Object[] objArr = {imageView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "120ecb3117cf70402db88b7aa65c9f8c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "120ecb3117cf70402db88b7aa65c9f8c");
        } else {
            imageView.setColorFilter(ColorMatrixColorFilterUtil.getColorMatrixColorFilter(i));
        }
    }

    public static void setColorFilter(ImageView imageView, String str) {
        Object[] objArr = {imageView, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b22376b9bf685f246e533787432b4ac9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b22376b9bf685f246e533787432b4ac9");
        } else {
            imageView.setColorFilter(ColorMatrixColorFilterUtil.getColorMatrixColorFilter(Color.parseColor(str)));
        }
    }

    public static void setColorFilter(ImageView imageView, Context context, @ColorRes int i) {
        Object[] objArr = {imageView, context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "50d6dc7c01cc7292cbe7c43152f485fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "50d6dc7c01cc7292cbe7c43152f485fd");
        } else {
            imageView.setColorFilter(ColorMatrixColorFilterUtil.getColorMatrixColorFilter(ContextCompat.getColor(context, i)));
        }
    }

    public static void setColorFilter(ImageView imageView, int i, int i2, int i3, int i4) {
        Object[] objArr = {imageView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f932488c08538c529e96fdf12a097e9f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f932488c08538c529e96fdf12a097e9f");
        } else {
            imageView.setColorFilter(ColorMatrixColorFilterUtil.getColorMatrixColorFilter(i, i2, i3, i4));
        }
    }

    public static void setColorFilter(ImageView imageView, int i, int i2, int i3) {
        Object[] objArr = {imageView, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "00dc9d066b73138107750f9d9fd59a14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "00dc9d066b73138107750f9d9fd59a14");
        } else {
            imageView.setColorFilter(ColorMatrixColorFilterUtil.getColorMatrixColorFilter(i, i2, i3));
        }
    }

    public static void setColorFilter(ImageView imageView, float[] fArr) {
        Object[] objArr = {imageView, fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "091163de24916680d2e7faa6e1a4e1be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "091163de24916680d2e7faa6e1a4e1be");
        } else {
            imageView.setColorFilter(ColorMatrixColorFilterUtil.getColorMatrixColorFilter(fArr));
        }
    }

    public static void setColorFilter(Drawable drawable, @ColorInt int i) {
        Object[] objArr = {drawable, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8845fd4ad241a63b802bd2a45680b54f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8845fd4ad241a63b802bd2a45680b54f");
        } else {
            drawable.setColorFilter(ColorMatrixColorFilterUtil.getColorMatrixColorFilter(i));
        }
    }

    public static void setColorFilter(Drawable drawable, String str) {
        Object[] objArr = {drawable, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7d5f7c5b84dff7e13c21ab04e617d8cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7d5f7c5b84dff7e13c21ab04e617d8cb");
        } else {
            drawable.setColorFilter(ColorMatrixColorFilterUtil.getColorMatrixColorFilter(Color.parseColor(str)));
        }
    }

    public static void setColorFilter(Drawable drawable, Context context, @ColorRes int i) {
        Object[] objArr = {drawable, context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9386ee41f0a1a3a299ac563d09ac3e97", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9386ee41f0a1a3a299ac563d09ac3e97");
        } else {
            drawable.setColorFilter(ColorMatrixColorFilterUtil.getColorMatrixColorFilter(ContextCompat.getColor(context, i)));
        }
    }

    public static void setColorFilter(Drawable drawable, int i, int i2, int i3, int i4) {
        Object[] objArr = {drawable, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "488464403468dd31aecd843e6f918074", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "488464403468dd31aecd843e6f918074");
        } else {
            drawable.setColorFilter(ColorMatrixColorFilterUtil.getColorMatrixColorFilter(i, i2, i3, i4));
        }
    }

    public static void setColorFilter(Drawable drawable, int i, int i2, int i3) {
        Object[] objArr = {drawable, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d9dec894d80acad3af2521e72fe6d8ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d9dec894d80acad3af2521e72fe6d8ec");
        } else {
            drawable.setColorFilter(ColorMatrixColorFilterUtil.getColorMatrixColorFilter(i, i2, i3));
        }
    }

    public static void setColorFilter(Drawable drawable, float[] fArr) {
        Object[] objArr = {drawable, fArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb07c3e7cf7de4573927966d3c290121", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb07c3e7cf7de4573927966d3c290121");
        } else {
            drawable.setColorFilter(ColorMatrixColorFilterUtil.getColorMatrixColorFilter(fArr));
        }
    }

    public static void setGrayScale(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5a05e6b27f404d605c18370092648236", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5a05e6b27f404d605c18370092648236");
        } else {
            imageView.setColorFilter(ColorMatrixColorFilterUtil.grayScale());
        }
    }

    public static void setGrayScale(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cbb0f0a771dff81ac985112c39dba6a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cbb0f0a771dff81ac985112c39dba6a1");
        } else {
            drawable.setColorFilter(ColorMatrixColorFilterUtil.grayScale());
        }
    }

    public static void setBlackAndWhite(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "85f07f7ac3d47718ad7a1177edb8e781", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "85f07f7ac3d47718ad7a1177edb8e781");
        } else {
            imageView.setColorFilter(ColorMatrixColorFilterUtil.blackAndWhite());
        }
    }

    public static void setBlackAndWhite(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "24de3e5fd216b523d9547ef39fd0a679", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "24de3e5fd216b523d9547ef39fd0a679");
        } else {
            drawable.setColorFilter(ColorMatrixColorFilterUtil.blackAndWhite());
        }
    }

    public static void setRaw(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "be3f566d7bd75247ca7c9ee801ed445b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "be3f566d7bd75247ca7c9ee801ed445b");
        } else {
            imageView.setColorFilter(ColorMatrixColorFilterUtil.raw());
        }
    }

    public static void setRaw(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4a2fa4ccf70ef4b0226623578c5a59c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4a2fa4ccf70ef4b0226623578c5a59c7");
        } else {
            drawable.setColorFilter(ColorMatrixColorFilterUtil.raw());
        }
    }
}

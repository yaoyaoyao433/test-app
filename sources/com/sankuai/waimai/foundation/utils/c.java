package com.sankuai.waimai.foundation.utils;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static Bitmap a(@NonNull View view, int i) {
        Object[] objArr = {view, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "511e654d9e7a7f1a2ab6f0d5be129ea7", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "511e654d9e7a7f1a2ab6f0d5be129ea7") : a(view, 0, false);
    }

    private static Bitmap a(@NonNull View view, int i, boolean z) {
        Bitmap bitmap;
        Object[] objArr = {view, Integer.valueOf(i), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7ae316bf74fb28833068153ae03cace5", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7ae316bf74fb28833068153ae03cace5");
        }
        try {
            bitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight() - i, Bitmap.Config.RGB_565);
            try {
                view.draw(new Canvas(bitmap));
            } catch (Throwable th) {
                th = th;
                com.sankuai.waimai.foundation.utils.log.a.b(th);
                return bitmap;
            }
        } catch (Throwable th2) {
            th = th2;
            bitmap = null;
        }
        return bitmap;
    }

    public static Bitmap a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3ecd9985f645ef10f89fd6ecaedd504", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3ecd9985f645ef10f89fd6ecaedd504");
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int width = !drawable.getBounds().isEmpty() ? drawable.getBounds().width() : drawable.getIntrinsicWidth();
        int height = !drawable.getBounds().isEmpty() ? drawable.getBounds().height() : drawable.getIntrinsicHeight();
        if (width <= 0) {
            width = 1;
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height > 0 ? height : 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Bitmap a(Drawable drawable, int i, int i2) {
        Object[] objArr = {drawable, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ffc3eb433be7eb20452968aa895cceeb", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ffc3eb433be7eb20452968aa895cceeb");
        }
        if (i <= 0 && i2 <= 0) {
            return a(drawable);
        }
        int width = !drawable.getBounds().isEmpty() ? drawable.getBounds().width() : drawable.getIntrinsicWidth();
        int height = !drawable.getBounds().isEmpty() ? drawable.getBounds().height() : drawable.getIntrinsicHeight();
        if (width == i && height == i2 && (drawable instanceof BitmapDrawable)) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    public static Bitmap a(Bitmap bitmap, int i, int i2) {
        float width;
        float f;
        Bitmap.Config config;
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6b508942f481aebb2c5a11c6e742b51", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6b508942f481aebb2c5a11c6e742b51");
        }
        if (bitmap == null) {
            return null;
        }
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f2 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            width = i2 / bitmap.getHeight();
            f = (i - (bitmap.getWidth() * width)) * 0.5f;
        } else {
            width = i / bitmap.getWidth();
            f2 = (i2 - (bitmap.getHeight() * width)) * 0.5f;
            f = 0.0f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f + 0.5f), (int) (f2 + 0.5f));
        Object[] objArr2 = {bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d81ceccfc21b460fe2f40c13e4f4ce93", RobustBitConfig.DEFAULT_VALUE)) {
            config = (Bitmap.Config) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d81ceccfc21b460fe2f40c13e4f4ce93");
        } else {
            config = bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        if (Build.VERSION.SDK_INT >= 12 && createBitmap != null) {
            createBitmap.setHasAlpha(bitmap.hasAlpha());
        }
        if (createBitmap == null) {
            return null;
        }
        new Canvas(createBitmap).drawBitmap(bitmap, matrix, new Paint(6));
        return createBitmap;
    }
}

package com.dianping.imagemanager.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class s {
    public static ChangeQuickRedirect a;

    public static Bitmap a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "078632529456151fc91558559a2100e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "078632529456151fc91558559a2100e3");
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth() <= 0 ? 200 : drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight() > 0 ? drawable.getIntrinsicHeight() : 200, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean a(float f, boolean[] zArr) {
        Object[] objArr = {Float.valueOf(f), zArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3583bd28dd63973e74e9cbd041f2e89", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3583bd28dd63973e74e9cbd041f2e89")).booleanValue();
        }
        if (f <= 0.0f) {
            return false;
        }
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(boolean[] zArr) {
        Object[] objArr = {zArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c040802c93b3565f4994e4507e3d92ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c040802c93b3565f4994e4507e3d92ae")).booleanValue();
        }
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    public static float a(RectF rectF) {
        Object[] objArr = {rectF};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "630235b14b35d9aec45e273dfa7ba747", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "630235b14b35d9aec45e273dfa7ba747")).floatValue() : rectF.width() < rectF.height() ? rectF.width() : rectF.height();
    }
}

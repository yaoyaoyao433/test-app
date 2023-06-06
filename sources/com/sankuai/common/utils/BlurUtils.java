package com.sankuai.common.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class BlurUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static Bitmap blurBitmap(View view, Bitmap bitmap) {
        Object[] objArr = {view, bitmap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a73961322b5b37d8d503ea834bb9d688", RobustBitConfig.DEFAULT_VALUE) ? (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a73961322b5b37d8d503ea834bb9d688") : blurBitmap(view.getWidth(), view.getHeight(), bitmap, 30, Color.parseColor("#8C000000"));
    }

    public static Bitmap blurBitmap(int i, int i2, Bitmap bitmap, int i3, int i4) {
        float f;
        float f2;
        Bitmap createBitmap;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), bitmap, Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1f5cbeea55fc66958bb725a897150e49", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1f5cbeea55fc66958bb725a897150e49");
        }
        float f3 = (i * 1.0f) / i2;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (f3 >= (1.0f * width) / height) {
            int ceil = (int) Math.ceil(f / f3);
            createBitmap = Bitmap.createBitmap(bitmap, 0, (height - ceil) / 2, width, ceil);
        } else {
            int ceil2 = (int) Math.ceil(f2 * f3);
            createBitmap = Bitmap.createBitmap(bitmap, (width - ceil2) / 2, 0, ceil2, height);
        }
        Bitmap copy = createBitmap.copy(createBitmap.getConfig(), true);
        if (copy != null) {
            Bitmap process = new StackBlurManager(copy).process(i3);
            Canvas canvas = new Canvas(copy);
            canvas.drawBitmap(process, 0.0f, 0.0f, (Paint) null);
            Paint paint = new Paint();
            paint.setColor(i4);
            canvas.drawRect(0.0f, 0.0f, copy.getWidth(), copy.getHeight(), paint);
            canvas.save();
            canvas.restore();
        }
        return copy;
    }
}

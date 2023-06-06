package com.sankuai.waimai.business.restaurant.composeorder.rn;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static Bitmap a(View view, int i, float f) {
        Object[] objArr = {view, Integer.valueOf(i), Float.valueOf(600.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6deae1d680a26bbe5a44c0a36ed5b69b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6deae1d680a26bbe5a44c0a36ed5b69b");
        }
        if (view == null) {
            return null;
        }
        int i2 = i * 2;
        int measuredHeight = view.getMeasuredHeight() + i2;
        float measuredWidth = view.getMeasuredWidth() + i2;
        float f2 = measuredWidth / 600.0f;
        int i3 = (int) (measuredHeight / f2);
        int i4 = (int) (measuredWidth / f2);
        Bitmap createBitmap = Bitmap.createBitmap(i4, i3, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f3 = i4;
        float f4 = i3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, f3, f4, new int[]{-8228139, -11621704, -6303905}, (float[]) null, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        canvas.drawRect(0.0f, 0.0f, f3, f4, paint);
        float f5 = 1.0f / f2;
        canvas.scale(f5, f5);
        float f6 = i;
        canvas.translate(f6, f6);
        view.draw(canvas);
        return createBitmap;
    }
}

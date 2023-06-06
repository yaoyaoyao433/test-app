package com.meituan.android.edfu.mvex.ui.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Transformation;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements Transformation {
    public static ChangeQuickRedirect a;
    private int b;

    public b(int i) {
        Object[] objArr = {12};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aefa48f9fb45e20ee3b3b8790bd0c95d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aefa48f9fb45e20ee3b3b8790bd0c95d");
        } else {
            this.b = 12;
        }
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f4db19c6c9d7b173a7b66b6b652a964", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f4db19c6c9d7b173a7b66b6b652a964");
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
        Paint paint = new Paint();
        Canvas canvas = new Canvas(createBitmap);
        paint.setAntiAlias(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        canvas.drawRoundRect(new RectF(new RectF(0.0f, 0.0f, width, height)), this.b, this.b, paint);
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        bitmap.recycle();
        return createBitmap;
    }

    @Override // com.squareup.picasso.Transformation
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d06d07c8ad421446bb2947d6d7d946d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d06d07c8ad421446bb2947d6d7d946d4");
        }
        return "round : radius = " + this.b;
    }
}

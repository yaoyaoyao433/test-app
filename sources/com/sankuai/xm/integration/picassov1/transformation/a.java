package com.sankuai.xm.integration.picassov1.transformation;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.squareup.picasso.Transformation;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements Transformation {
    public static ChangeQuickRedirect a;

    @Override // com.squareup.picasso.Transformation
    public final String a() {
        return "CropCircleTransformation()";
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d32028ba9f431d75b2266aee69322aa2", 6917529027641081856L)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d32028ba9f431d75b2266aee69322aa2");
        }
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int width = (bitmap.getWidth() - min) / 2;
        int height = (bitmap.getHeight() - min) / 2;
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        if (width != 0 || height != 0) {
            Matrix matrix = new Matrix();
            matrix.setTranslate(-width, -height);
            bitmapShader.setLocalMatrix(matrix);
        }
        paint.setShader(bitmapShader);
        paint.setAntiAlias(true);
        float f = min / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        return createBitmap;
    }
}

package com.sankuai.waimai.platform.capacity.imageloader.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.utils.BitmapTransformation;
import com.sankuai.waimai.foundation.utils.c;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.foundation.utils.h;
import com.sankuai.waimai.foundation.utils.log.a;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RoundAndCenterCropTransform implements BitmapTransformation {
    public static ChangeQuickRedirect a;
    private float b;
    private boolean c;
    private float d;
    private float e;
    private float f;
    private float g;

    public RoundAndCenterCropTransform(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "173b8b5502cbb4d64512cd25f6e767e6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "173b8b5502cbb4d64512cd25f6e767e6");
            return;
        }
        this.b = -1.0f;
        this.b = g.a(context, i);
    }

    public RoundAndCenterCropTransform(Context context, boolean z) {
        Object[] objArr = {context, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "615619fa5a8eaaa7e531cd32c22e40f5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "615619fa5a8eaaa7e531cd32c22e40f5");
            return;
        }
        this.b = -1.0f;
        this.c = true;
    }

    public RoundAndCenterCropTransform(Context context, int i, int i2, int i3, int i4) {
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d440b56bd2ccfa68a806b2630840dbde", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d440b56bd2ccfa68a806b2630840dbde");
            return;
        }
        this.b = -1.0f;
        this.d = g.a(context, i);
        this.e = g.a(context, i2);
        this.f = g.a(context, i3);
        this.g = g.a(context, i4);
    }

    @Override // com.sankuai.meituan.mtimageloader.utils.BitmapTransformation
    public Bitmap transform(Bitmap bitmap, int i, int i2) {
        Object[] objArr = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34c1fa3b80659e6ca0dd65bc72aa1fec", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34c1fa3b80659e6ca0dd65bc72aa1fec");
        }
        Object[] objArr2 = {bitmap, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86baaa08f8827a5a15d363b1c37cf9a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86baaa08f8827a5a15d363b1c37cf9a3");
        }
        if (bitmap == null) {
            return null;
        }
        Bitmap a2 = c.a(bitmap, i, i2);
        if (a2 == null) {
            a.e("RoundAndCenterCropTransform", "centerCrop return null", new Object[0]);
            a2 = bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(a2.getWidth(), a2.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(a2, tileMode, tileMode));
        paint.setAntiAlias(true);
        RectF rectF = new RectF(0.0f, 0.0f, a2.getWidth(), a2.getHeight());
        if (this.c) {
            canvas.drawRoundRect(rectF, a2.getWidth() / 2, a2.getHeight() / 2, paint);
        } else if (h.e(Double.valueOf(this.b), Double.valueOf(0.0d))) {
            canvas.drawRoundRect(rectF, this.b, this.b, paint);
        } else {
            this.d = h.b(Double.valueOf((double) this.d), Double.valueOf(0.0d)) ? 0.0f : this.d;
            this.e = h.b(Double.valueOf((double) this.e), Double.valueOf(0.0d)) ? 0.0f : this.e;
            this.f = h.b(Double.valueOf((double) this.f), Double.valueOf(0.0d)) ? 0.0f : this.f;
            this.g = h.b(Double.valueOf((double) this.g), Double.valueOf(0.0d)) ? 0.0f : this.g;
            Path path = new Path();
            path.reset();
            path.addRoundRect(rectF, new float[]{this.d, this.d, this.e, this.e, this.f, this.f, this.g, this.g}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
        return createBitmap;
    }
}

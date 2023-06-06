package com.meituan.msc.views.image.blur;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.renderscript.RSRuntimeException;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.picasso.Transformation;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a implements Transformation {
    public static ChangeQuickRedirect a;
    private Context b;
    private int c;
    private int d;

    public a(Context context, int i, int i2) {
        Object[] objArr = {context, Integer.valueOf(i), 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca386a4a0f22658e1f355b2faeca9d49", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca386a4a0f22658e1f355b2faeca9d49");
            return;
        }
        this.b = context.getApplicationContext();
        this.c = i;
        this.d = 1;
    }

    @Override // com.squareup.picasso.Transformation
    public final Bitmap a(Bitmap bitmap) {
        Bitmap bitmap2;
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c432dd7faaa7b961ee8d83cab8f3b2de", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c432dd7faaa7b961ee8d83cab8f3b2de");
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth() / this.d, bitmap.getHeight() / this.d, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(1.0f / this.d, 1.0f / this.d);
        Paint paint = new Paint();
        paint.setFlags(2);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        try {
            if (Build.VERSION.SDK_INT >= 18) {
                try {
                    bitmap2 = c.a(this.b, createBitmap, this.c);
                } catch (RSRuntimeException unused) {
                    bitmap2 = b.a(createBitmap, this.c, true);
                }
            } else {
                bitmap2 = b.a(createBitmap, this.c, true);
            }
        } catch (Throwable th) {
            g.b("[BlurTransformation@transform]", null, th);
            bitmap2 = createBitmap;
        }
        bitmap.recycle();
        return bitmap2;
    }

    @Override // com.squareup.picasso.Transformation
    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d93b86ad4bbc8e04169b8a172530c199", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d93b86ad4bbc8e04169b8a172530c199");
        }
        return "BlurTransformation{mRadius=" + this.c + ", mSampling=" + this.d + '}';
    }
}

package com.meituan.mmp.lib.api.canvas;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class g extends Canvas {
    public static ChangeQuickRedirect a;
    public Bitmap b;

    public g() {
    }

    public g(Bitmap bitmap) {
        super(bitmap);
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b85e6695963fb1b8b0c6ff2b2d36987", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b85e6695963fb1b8b0c6ff2b2d36987");
        } else {
            this.b = bitmap;
        }
    }

    public final void a(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d400364172bd4ed8a617879b4dfa1cdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d400364172bd4ed8a617879b4dfa1cdc");
        } else if (this.b == null || this.b.isRecycled()) {
        } else {
            RectF rectF = new RectF(f, f2, f3, f4);
            RectF rectF2 = new RectF(0.0f, 0.0f, this.b.getWidth(), this.b.getHeight());
            Region.Op op = Region.Op.XOR;
            Bitmap createBitmap = Bitmap.createBitmap(this.b.getWidth(), this.b.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.clipRect(rectF);
            if (Build.VERSION.SDK_INT >= 28) {
                canvas.clipRect(rectF2);
            } else {
                canvas.clipRect(rectF2, op);
            }
            canvas.drawBitmap(this.b, 0.0f, 0.0f, (Paint) null);
            if (createBitmap.isRecycled()) {
                return;
            }
            this.b.eraseColor(0);
            drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
            createBitmap.recycle();
        }
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba1c387a5ec5dfb7d85d404ac659cb32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba1c387a5ec5dfb7d85d404ac659cb32");
        } else if (bitmap == null || !bitmap.equals(this.b)) {
            super.setBitmap(bitmap);
            if (this.b != null && !this.b.isRecycled()) {
                this.b.recycle();
            }
            this.b = bitmap;
        }
    }
}

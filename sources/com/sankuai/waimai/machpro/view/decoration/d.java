package com.sankuai.waimai.machpro.view.decoration;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private final float b;
    private final float c;
    private final float d;
    private final int e;
    private int f;
    private int g;
    private float[] h;
    private boolean i;
    private Paint j;
    private Path k;
    private Bitmap l;

    public d(String[] strArr) {
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a33f1525ad314dacb1202a8fc418165", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a33f1525ad314dacb1202a8fc418165");
            return;
        }
        this.h = new float[8];
        this.b = com.sankuai.waimai.machpro.util.b.a((Object) strArr[0]);
        this.c = com.sankuai.waimai.machpro.util.b.a((Object) strArr[1]);
        this.d = com.sankuai.waimai.machpro.util.b.a((Object) strArr[2]);
        this.e = com.sankuai.waimai.machpro.util.b.a(strArr[3], 0);
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aad59ba0f6c8b9ce6d54d8575f9f0b35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aad59ba0f6c8b9ce6d54d8575f9f0b35");
        } else if (this.f == i && this.g == i2) {
        } else {
            this.f = i;
            this.g = i2;
            this.i = true;
        }
    }

    public final void a(float[] fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d57b25207e8e21efacbe32c83e9d8af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d57b25207e8e21efacbe32c83e9d8af");
            return;
        }
        for (int i = 0; i < fArr.length; i++) {
            if (this.h[i] != fArr[i]) {
                this.h[i] = fArr[i];
                this.i = true;
            }
        }
    }

    public final void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dca395c53949df88a28e542a85742dfe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dca395c53949df88a28e542a85742dfe");
        } else if (Build.VERSION.SDK_INT >= 28) {
            b(canvas);
        } else {
            c(canvas);
        }
    }

    private void b(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53aa77b0ef531b0d8001e01b67ed1cd9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53aa77b0ef531b0d8001e01b67ed1cd9");
            return;
        }
        if (this.j == null) {
            this.j = new Paint();
            this.j.setAntiAlias(true);
            this.j.setColor(this.e);
            this.j.setShadowLayer(this.d, this.b, this.c, this.e);
        }
        if (this.i) {
            this.i = false;
            RectF rectF = new RectF(0.0f, 0.0f, this.f, this.g);
            this.k = new Path();
            this.k.addRoundRect(rectF, this.h, Path.Direction.CW);
        }
        canvas.drawPath(this.k, this.j);
    }

    private void c(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de30df2f9635545d281f638c77f25b90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de30df2f9635545d281f638c77f25b90");
            return;
        }
        if (this.i) {
            this.i = false;
            if (this.l != null && !this.l.isRecycled()) {
                this.l.recycle();
            }
            int i = (int) (this.d * 2.0f);
            try {
                this.l = Bitmap.createBitmap(this.f + i, this.g + i, Bitmap.Config.ARGB_4444);
                if (this.l == null) {
                    return;
                }
                Canvas canvas2 = new Canvas(this.l);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(this.e);
                paint.setStyle(Paint.Style.FILL);
                paint.setShadowLayer(this.d, this.b, this.c, this.e);
                Path path = new Path();
                path.addRoundRect(new RectF(this.d, this.d, this.f + this.d, this.g + this.d), this.h, Path.Direction.CW);
                canvas2.translate(-this.b, -this.c);
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, paint);
            } catch (Throwable unused) {
                return;
            }
        }
        if (this.l == null || this.l.isRecycled()) {
            return;
        }
        canvas.drawBitmap(this.l, (-this.d) + this.b, (-this.d) + this.c, (Paint) null);
    }
}

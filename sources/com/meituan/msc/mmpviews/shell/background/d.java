package com.meituan.msc.mmpviews.shell.background;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.support.annotation.NonNull;
import com.meituan.msc.mmpviews.csstypes.a;
import com.meituan.msc.mmpviews.csstypes.b;
import com.meituan.msc.mmpviews.csstypes.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends a {
    public static ChangeQuickRedirect i;
    private final a.C0447a j;

    public d(a.C0447a c0447a, @NonNull b.C0448b c0448b, @NonNull c.a aVar) {
        super(c0448b, aVar);
        Object[] objArr = {c0447a, c0448b, aVar};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa59aa145f687b381d61972b69226206", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa59aa145f687b381d61972b69226206");
            return;
        }
        this.j = c0447a;
        this.f = false;
    }

    @Override // com.meituan.msc.mmpviews.shell.background.a, com.meituan.msc.mmpviews.shell.background.c, android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b698f5c0314e131283000314b893e046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b698f5c0314e131283000314b893e046");
        } else {
            a(canvas);
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.background.a
    public final void a(@NonNull Canvas canvas, RectF rectF) {
        Object[] objArr = {canvas, rectF};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e7804c54a24474a01b5deadbf41afea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e7804c54a24474a01b5deadbf41afea");
        } else {
            canvas.drawRect(rectF, b());
        }
    }

    @Override // com.meituan.msc.mmpviews.shell.background.a
    public final void b(@NonNull Canvas canvas, RectF rectF) {
        Object[] objArr = {canvas, rectF};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed801eaef40dff158341bf921201092a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed801eaef40dff158341bf921201092a");
        } else {
            canvas.drawRect(rectF, b());
        }
    }

    private Paint b() {
        float f;
        float f2;
        float f3;
        float f4;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "de3e84c1df207d68c293934614fec09e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Paint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "de3e84c1df207d68c293934614fec09e");
        }
        Rect bounds = getBounds();
        int i2 = bounds.right - bounds.left;
        int i3 = bounds.bottom - bounds.top;
        if (this.j.d) {
            float f5 = (this.j.b.y - this.j.c.y) / (this.j.b.x - this.j.c.x);
            float f6 = i2;
            float f7 = i3;
            float f8 = f5 * f5;
            float f9 = f7 * f5;
            float f10 = f6 * f8;
            if (f5 < 0.0f) {
                float f11 = f8 + 1.0f;
                f = ((f10 + f9) / f11) / 2.0f;
                f2 = f7 - (f / f5);
                f3 = ((((f6 * 2.0f) + f10) - f9) / f11) / 2.0f;
                f4 = (f6 - f3) / f5;
            } else {
                float f12 = f8 + 1.0f;
                f = ((((f6 * 2.0f) + f10) + f9) / f12) / 2.0f;
                f2 = (f7 + (f6 / f5)) - (f / f5);
                f3 = ((f10 - f9) / f12) / 2.0f;
                f4 = (-f3) / f5;
            }
        } else {
            float max = Math.max(i3, i2);
            f = this.j.b.x * max;
            f2 = this.j.b.y * max;
            f3 = this.j.c.x * max;
            f4 = this.j.c.y * max;
        }
        LinearGradient linearGradient = new LinearGradient(f, f2, f3, f4, this.j.f, this.j.e, Shader.TileMode.REPEAT);
        Paint paint = new Paint();
        paint.setShader(linearGradient);
        return paint;
    }

    @Override // com.meituan.msc.mmpviews.shell.background.a
    public final float[] a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79535c858b052552fe4fee6cdb42e671", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79535c858b052552fe4fee6cdb42e671");
        }
        float[] a = super.a();
        if (this.j.d) {
            return a;
        }
        Rect bounds = getBounds();
        int i2 = bounds.right - bounds.left;
        int i3 = bounds.bottom - bounds.top;
        if (i2 > i3) {
            a[1] = a[1] * (i3 / i2);
        } else {
            a[0] = a[0] * (i2 / i3);
        }
        return a;
    }
}

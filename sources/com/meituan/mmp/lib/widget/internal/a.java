package com.meituan.mmp.lib.widget.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.meituan.mmp.lib.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends Drawable {
    public static ChangeQuickRedirect a;
    public float b;
    public final Paint c;
    private final RectF d;
    private float e;
    private final Path f;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f605a4513c20785c60adb1a4df283f4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f605a4513c20785c60adb1a4df283f4");
            return;
        }
        this.b = 0.0f;
        this.c = new Paint(1);
        this.d = new RectF();
        this.e = p.d(3);
        this.f = new Path();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "981245cfbd6af9ce2860a222b06ce0f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "981245cfbd6af9ce2860a222b06ce0f9");
            return;
        }
        float min = Math.min(this.b, Math.min(this.d.width(), this.d.height()) * 0.5f);
        canvas.drawRoundRect(new RectF(this.d.left + this.e, this.d.top + this.e, this.d.right - this.e, this.d.bottom - this.e), min, min, this.c);
        canvas.drawPath(this.f, this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f02e4d5ce7f705b685ecedd943070589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f02e4d5ce7f705b685ecedd943070589");
            return;
        }
        super.setBounds(i, i2, i3, i4);
        float f = i4;
        this.d.set(i, i2, i3, f);
        float f2 = (i + i3) / 2.0f;
        this.f.moveTo(f2, f);
        this.f.lineTo(f2 - this.e, f - this.e);
        this.f.lineTo(f2 + this.e, f - this.e);
        this.f.close();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5632aa584e99fe4b21f27fb5dd249a7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5632aa584e99fe4b21f27fb5dd249a7c");
        } else {
            this.c.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "487e4785cbbd45353563afdc89218972", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "487e4785cbbd45353563afdc89218972");
        } else {
            this.c.setColorFilter(colorFilter);
        }
    }
}

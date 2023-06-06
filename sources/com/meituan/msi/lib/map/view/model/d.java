package com.meituan.msi.lib.map.view.model;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends Drawable {
    public static ChangeQuickRedirect a;
    public float b;
    public final Paint c;
    private final RectF d;
    private final float e;
    private final Path f;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "53e322d678be118271a3638aa6e39f6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "53e322d678be118271a3638aa6e39f6d");
            return;
        }
        this.b = 0.0f;
        this.c = new Paint(1);
        this.d = new RectF();
        this.e = com.meituan.msi.util.f.b(3.0f);
        this.f = new Path();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60e3e375628b98c797c09d10f47db2fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60e3e375628b98c797c09d10f47db2fc");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5975ce7064dfe68ea679fac7fd21fe1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5975ce7064dfe68ea679fac7fd21fe1");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63e97b126ada96b492597f7f6ce21539", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63e97b126ada96b492597f7f6ce21539");
        } else {
            this.c.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65a3a68ab5d05ae11531cb90c4efdf50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65a3a68ab5d05ae11531cb90c4efdf50");
        } else {
            this.c.setColorFilter(colorFilter);
        }
    }
}

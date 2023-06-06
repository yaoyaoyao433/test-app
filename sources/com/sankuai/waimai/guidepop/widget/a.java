package com.sankuai.waimai.guidepop.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends Drawable {
    public static ChangeQuickRedirect a;
    private Drawable b;
    private Paint c;
    private Path d;

    private a(@NonNull Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9ac1c10974aed8fb21023b5bb2867dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9ac1c10974aed8fb21023b5bb2867dc");
            return;
        }
        this.d = new Path();
        this.b = drawable;
        this.c = new Paint(1);
        this.c.setColor(-1);
    }

    public a(@NonNull Drawable drawable, int i, int i2, int i3, int i4) {
        this(drawable);
        Object[] objArr = {drawable, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6507431c1af5083d790a7dcd1459bbe8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6507431c1af5083d790a7dcd1459bbe8");
        } else {
            this.d.addRect(i, i2, i3, i4, Path.Direction.CW);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc0ba744dbf1284a6f41c84bf7caf8d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc0ba744dbf1284a6f41c84bf7caf8d5");
            return;
        }
        this.b.setBounds(getBounds());
        if (this.d == null || this.d.isEmpty()) {
            this.b.draw(canvas);
            return;
        }
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getBounds().width(), getBounds().height(), this.c, 31);
        this.b.draw(canvas);
        this.c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        canvas.drawPath(this.d, this.c);
        this.c.setXfermode(null);
        canvas.restoreToCount(saveLayer);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94dd564d7a24fdfb98f4f99bff46722e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94dd564d7a24fdfb98f4f99bff46722e");
        } else {
            this.b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52f45c5bc7b43c2bcf47d3d0d17f2d62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52f45c5bc7b43c2bcf47d3d0d17f2d62");
        } else {
            this.b.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb3b47b668edf841fa690f247b120890", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb3b47b668edf841fa690f247b120890")).intValue() : this.b.getOpacity();
    }
}

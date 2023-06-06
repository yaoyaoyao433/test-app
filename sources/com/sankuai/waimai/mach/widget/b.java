package com.sankuai.waimai.mach.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends Drawable {
    public static ChangeQuickRedirect a;
    private Path b;
    private RectF c;
    private float[] d;
    private Paint e;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e062a7002f4bab564e2761a5bd93ed7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e062a7002f4bab564e2761a5bd93ed7f");
            return;
        }
        this.b = new Path();
        this.e = new Paint();
        this.e.setAntiAlias(true);
        this.e.setStyle(Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6d62046a14505d255bf07b057b90a0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6d62046a14505d255bf07b057b90a0c");
            return;
        }
        super.setBounds(i, i2, i3, i4);
        this.c = new RectF(i, i2, i3, i4);
    }

    public final void a(float[] fArr) {
        Object[] objArr = {fArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ddd32c251fb7b255a51eb0b8abae63aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ddd32c251fb7b255a51eb0b8abae63aa");
            return;
        }
        this.d = fArr;
        invalidateSelf();
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d6747af1abe692a0355f6f770bdea551", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d6747af1abe692a0355f6f770bdea551");
        } else {
            this.e.setColor(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61232f03c20a3bd00de6e9aefe5f5426", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61232f03c20a3bd00de6e9aefe5f5426");
            return;
        }
        this.b.reset();
        if (this.d != null) {
            this.b.addRoundRect(this.c, this.d, Path.Direction.CW);
        } else {
            this.b.addRect(this.c, Path.Direction.CW);
        }
        canvas.drawPath(this.b, this.e);
    }
}

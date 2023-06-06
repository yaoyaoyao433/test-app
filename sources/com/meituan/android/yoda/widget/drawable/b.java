package com.meituan.android.yoda.widget.drawable;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends Drawable {
    public static ChangeQuickRedirect a = null;
    private static final String b = "b";
    private Bitmap c;
    private Paint d;
    private int e;
    private RectF f;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public b(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8781f4c91e3c5cb2affb7a29486f264", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8781f4c91e3c5cb2affb7a29486f264");
            return;
        }
        this.e = 3;
        this.f = new RectF();
        this.d = new Paint();
        this.d.setColor(i);
        this.d.setAntiAlias(true);
        this.e = (int) TypedValue.applyDimension(1, this.e, context.getResources().getDisplayMetrics());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "199cf5d92cf7247bb74829a985d92b49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "199cf5d92cf7247bb74829a985d92b49");
            return;
        }
        super.setBounds(i, i2, i3, i4);
        a(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(@NonNull Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c6899fc520f97ba094435bdbec14cf5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c6899fc520f97ba094435bdbec14cf5");
            return;
        }
        super.setBounds(rect);
        a(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45816a898a86b5502b5bb17980b2b442", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45816a898a86b5502b5bb17980b2b442");
        } else {
            this.f.set(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c294ff12990630250e8a301b211f749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c294ff12990630250e8a301b211f749");
        } else {
            canvas.drawRoundRect(this.f, this.e, this.e, this.d);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@IntRange(from = 0, to = 255) int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd0a7eb51f01e688f0f9911897299011", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd0a7eb51f01e688f0f9911897299011");
        } else {
            this.d.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38768bf92b45ca116097c5c4c4ab14be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38768bf92b45ca116097c5c4c4ab14be");
        } else {
            this.d.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2910dfaa1eb16005e4c0a8be1e2b01a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2910dfaa1eb16005e4c0a8be1e2b01a")).intValue() : this.c == null ? super.getIntrinsicWidth() : this.c.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94da125eebf3e8ec217f120efba361f7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94da125eebf3e8ec217f120efba361f7")).intValue() : this.c == null ? super.getIntrinsicHeight() : this.c.getHeight();
    }
}

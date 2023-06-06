package com.sankuai.waimai.store.widgets.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.internal.view.SupportMenu;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends Drawable {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public float e;
    public float f;
    private final Paint g;
    private final RectF h;
    private final RectF i;
    private LinearGradient j;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5960ecb67840a9ea8205c488cb10720b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5960ecb67840a9ea8205c488cb10720b");
            return;
        }
        this.g = new Paint();
        this.g.setStyle(Paint.Style.STROKE);
        this.g.setAntiAlias(true);
        this.h = new RectF();
        this.i = new RectF();
        this.b = 5;
        this.c = SupportMenu.CATEGORY_MASK;
        this.d = -1;
        this.e = 20.0f;
        this.f = 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "528644fc26b8380843198dd137702677", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "528644fc26b8380843198dd137702677")).intValue() : (int) this.h.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ec9e02f99fcb50041b9f8d48f25f840", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ec9e02f99fcb50041b9f8d48f25f840")).intValue() : (int) this.h.height();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "024d01661b028cd82f11b5a1b9364b9c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "024d01661b028cd82f11b5a1b9364b9c");
            return;
        }
        this.g.setColor(this.c);
        this.g.setStrokeWidth(this.b);
        float f = this.e * 2.0f;
        canvas.drawArc(this.i.left, this.i.top, this.i.left + f, this.i.top + f, 180.0f, 90.0f, false, this.g);
        canvas.drawArc(this.i.right - f, this.i.top, this.i.right, this.i.top + f, 0.0f, -90.0f, false, this.g);
        this.g.setStrokeWidth(this.b);
        canvas.drawLine(this.i.left + this.e, this.i.top, this.i.right - this.e, this.i.top, this.g);
        this.g.setShader(this.j);
        canvas.drawLine(this.i.left, this.i.top + this.e, this.i.left, this.i.bottom, this.g);
        canvas.drawLine(this.i.right, this.i.top + this.e, this.i.right, this.i.bottom, this.g);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed6a537dd25f23a5322fa342bae6bb5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed6a537dd25f23a5322fa342bae6bb5b");
            return;
        }
        this.h.set(rect);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af3d3f7505b9eda85b28fa0cf6197dd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af3d3f7505b9eda85b28fa0cf6197dd4");
        } else {
            this.i.set(this.h);
            this.i.inset(this.b / 2.0f, this.b / 2.0f);
            this.i.bottom -= this.f;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        this.j = PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "15e347170670eeaac7e4c501d070354e", RobustBitConfig.DEFAULT_VALUE) ? (LinearGradient) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "15e347170670eeaac7e4c501d070354e") : new LinearGradient(this.i.left, this.i.top, this.i.left, this.i.bottom, this.c, this.d, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e1af2a472a8e00557c2126261e56ca7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e1af2a472a8e00557c2126261e56ca7");
        } else {
            this.g.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e5b7cfcf51d55acf0a40c1a2d0e3e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e5b7cfcf51d55acf0a40c1a2d0e3e6a");
        } else {
            this.g.setColorFilter(colorFilter);
        }
    }
}

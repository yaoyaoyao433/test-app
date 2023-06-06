package com.sankuai.waimai.business.page.common.widget.tablayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends Drawable {
    public static ChangeQuickRedirect a;
    private Paint b;
    private RectF c;
    private int d;
    private int e;
    private int f;
    private int g;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89fb700a0c4aa2cb0f4f54b46a232c0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89fb700a0c4aa2cb0f4f54b46a232c0f");
            return;
        }
        this.d = -16777216;
        this.e = 0;
        this.g = 1;
        Object[] objArr2 = {context, Float.valueOf(2.0f)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.f = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a22b776777833914c1286dd80eb4c153", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a22b776777833914c1286dd80eb4c153")).intValue() : (int) ((context.getResources().getDisplayMetrics().density * 2.0f) + 0.5f);
        this.b = new Paint();
        this.b.setColor(this.d);
        this.b.setAntiAlias(true);
    }

    public final void a(int i) {
        Object[] objArr = {0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e30e9dd8ddf6da0ec6b8669be1e07ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e30e9dd8ddf6da0ec6b8669be1e07ac");
        } else {
            this.b.setColor(0);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c24c87626c346b18fd238f1f4bc0ff8a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c24c87626c346b18fd238f1f4bc0ff8a");
            return;
        }
        canvas.drawColor(0);
        if (this.e == 0 || this.e >= this.c.bottom) {
            canvas.drawRect(this.c, this.b);
            return;
        }
        int i = (int) ((this.c.bottom - this.e) / 2.0f);
        switch (this.g) {
            case 0:
                canvas.drawRect(this.c.left, this.c.top, this.c.right, this.c.bottom - (i * 2), this.b);
                return;
            case 1:
                float f = i;
                canvas.drawRect(this.c.left, this.c.top + f, this.c.right, this.c.bottom - f, this.b);
                return;
            case 2:
                canvas.drawRect(this.c.left, this.c.top + (i * 2), this.c.right, this.c.bottom, this.b);
                return;
            default:
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e161e8828ae528e4bc5c0435b086a70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e161e8828ae528e4bc5c0435b086a70");
            return;
        }
        super.setBounds(i, i2, i3, i4);
        this.c = new RectF(i, i2, i3, i4);
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f399e9d4e5d0c65cf80fe4c0535a7bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f399e9d4e5d0c65cf80fe4c0535a7bc");
            return;
        }
        this.f = i;
        this.e = 0;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26a1e896464692006e8ed9a2e4e55bf4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26a1e896464692006e8ed9a2e4e55bf4")).intValue() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1db23f61555173e414573688eeb8a639", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1db23f61555173e414573688eeb8a639");
        } else {
            this.b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "849c4da06a68abcdb9a3bc0928704dd1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "849c4da06a68abcdb9a3bc0928704dd1");
        } else {
            this.b.setColorFilter(colorFilter);
        }
    }
}

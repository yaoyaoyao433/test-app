package com.meituan.android.yoda.widget.drawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends Drawable {
    public static ChangeQuickRedirect a = null;
    private static final String b = "a";
    private Paint c;
    private RectF d;
    private Path e;
    private float f;
    private boolean g;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "734f53a59e0e43228232a02ea9d9c3cc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "734f53a59e0e43228232a02ea9d9c3cc");
            return;
        }
        this.d = new RectF();
        this.e = new Path();
        this.f = 0.0f;
        this.g = false;
        this.c = new Paint();
        this.c.setColor(Color.parseColor("#333333"));
        this.c.setAntiAlias(true);
        this.c.setDither(true);
        this.c.setStrokeCap(Paint.Cap.ROUND);
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setStrokeWidth(x.a(2.0f));
    }

    public final a a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a8b33b53436f0da46d996da2e890a205", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a8b33b53436f0da46d996da2e890a205");
        }
        this.c.setColor(i);
        return this;
    }

    public final a a(float f) {
        Object[] objArr = {Float.valueOf(20.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35671142a532f42ae185658d09bab949", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35671142a532f42ae185658d09bab949");
        }
        this.f = x.a(20.0f);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a7ff4f7ffc691c4f470b9912b97efbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a7ff4f7ffc691c4f470b9912b97efbc");
            return;
        }
        super.setBounds(i, i2, i3, i4);
        a(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(@NonNull Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a62282ff3f5d21fda3b133f2cfdb083b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a62282ff3f5d21fda3b133f2cfdb083b");
            return;
        }
        super.setBounds(rect);
        a(rect.left, rect.top, rect.right, rect.bottom);
    }

    private void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9824516c3ef2619d4068718efe268332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9824516c3ef2619d4068718efe268332");
            return;
        }
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        float f3 = (i5 > i6 ? i6 : i5) / 2.0f;
        this.d.set(f - f3, f2 - f3, f + f3, f2 + f3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d105c68cd3baebfabe5288e31451bf5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d105c68cd3baebfabe5288e31451bf5b");
            return;
        }
        this.e.reset();
        if (this.g) {
            if (this.f <= 0.0f) {
                this.e.moveTo(this.d.width() / 4.0f, this.d.top);
                this.e.lineTo((this.d.width() * 3.0f) / 4.0f, this.d.centerY());
                this.e.lineTo(this.d.width() / 4.0f, this.d.bottom);
            } else {
                this.e.moveTo(this.d.centerX() - (this.f / 4.0f), this.d.centerY() - (this.f / 2.0f));
                this.e.lineTo(this.d.centerX() + (this.f / 4.0f), this.d.centerY());
                this.e.lineTo(this.d.centerX() - (this.f / 4.0f), this.d.centerY() + (this.f / 2.0f));
            }
        } else if (this.f <= 0.0f) {
            this.e.moveTo((this.d.width() * 3.0f) / 4.0f, this.d.top);
            this.e.lineTo(this.d.width() / 4.0f, this.d.centerY());
            this.e.lineTo((this.d.width() * 3.0f) / 4.0f, this.d.bottom);
        } else {
            this.e.moveTo(this.d.centerX() + (this.f / 4.0f), this.d.centerY() - (this.f / 2.0f));
            this.e.lineTo(this.d.centerX() - (this.f / 4.0f), this.d.centerY());
            this.e.lineTo(this.d.centerX() + (this.f / 4.0f), this.d.centerY() + (this.f / 2.0f));
        }
        canvas.drawPath(this.e, this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(@IntRange(from = 0, to = 255) int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bec6ab03d774909bf63c2184bbeb9029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bec6ab03d774909bf63c2184bbeb9029");
        } else {
            this.c.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "719e085a5a5c294d58d9f58300566be1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "719e085a5a5c294d58d9f58300566be1");
        } else {
            this.c.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9211c23b3b3665564bc8f30052508d7e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9211c23b3b3665564bc8f30052508d7e")).intValue() : this.d.width() == 0.0f ? super.getIntrinsicWidth() : (int) this.d.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81f6ab2bb8502477b6dfa3fefba37c2b", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81f6ab2bb8502477b6dfa3fefba37c2b")).intValue() : this.d.height() == 0.0f ? super.getIntrinsicHeight() : (int) this.d.height();
    }
}

package com.dianping.imagemanager.image.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class a extends Drawable implements Drawable.Callback {
    public static ChangeQuickRedirect a;
    public final Drawable[] b;
    private final b c;
    private final Rect d;
    private boolean e;
    private boolean f;
    private boolean g;

    public a(Drawable[] drawableArr) {
        Object[] objArr = {drawableArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdba4dba9b6eda1d88abe4690c527bc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdba4dba9b6eda1d88abe4690c527bc5");
            return;
        }
        this.c = new b();
        this.d = new Rect();
        this.e = false;
        this.f = false;
        this.g = false;
        this.b = drawableArr;
        for (int i = 0; i < this.b.length; i++) {
            c.a(this.b[i], (Drawable.Callback) this);
        }
    }

    public final Drawable a(int i, Drawable drawable) {
        Object[] objArr = {Integer.valueOf(i), drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a1ac32466a7a66cbde171365453d0e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a1ac32466a7a66cbde171365453d0e8");
        }
        Drawable drawable2 = this.b[i];
        if (drawable != drawable2) {
            if (drawable != null && this.g) {
                drawable.mutate();
            }
            c.a(this.b[i], (Drawable.Callback) null);
            c.a(drawable, (Drawable.Callback) null);
            c.a(drawable, this.c);
            c.a(drawable, (Drawable) this);
            c.a(drawable, (Drawable.Callback) this);
            this.f = false;
            this.b[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a41b4c7bc7cadb326bab26b6dde9fb5c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a41b4c7bc7cadb326bab26b6dde9fb5c")).intValue();
        }
        int i = -1;
        for (int i2 = 0; i2 < this.b.length; i2++) {
            Drawable drawable = this.b[i2];
            if (drawable != null) {
                i = Math.max(i, drawable.getIntrinsicWidth());
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0818d41d502f3cdbf4166098afbcdda7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0818d41d502f3cdbf4166098afbcdda7")).intValue();
        }
        int i = -1;
        for (int i2 = 0; i2 < this.b.length; i2++) {
            Drawable drawable = this.b[i2];
            if (drawable != null) {
                i = Math.max(i, drawable.getIntrinsicHeight());
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5480ff9ee0c6acff01383b9f2e7c1a16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5480ff9ee0c6acff01383b9f2e7c1a16");
            return;
        }
        for (int i = 0; i < this.b.length; i++) {
            Drawable drawable = this.b[i];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "da867b22921dba730bf84a0dee4ae1f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "da867b22921dba730bf84a0dee4ae1f8")).booleanValue();
        }
        if (!this.f) {
            this.e = false;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= this.b.length) {
                    break;
                }
                Drawable drawable = this.b[i];
                boolean z2 = this.e;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.e = z2 | z;
                i++;
            }
            this.f = true;
        }
        return this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2cb6350a6a9e79a7fc62a733bddb11e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2cb6350a6a9e79a7fc62a733bddb11e")).booleanValue();
        }
        boolean z = false;
        for (int i = 0; i < this.b.length; i++) {
            Drawable drawable = this.b[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "896e28627aee45471b9d4fefe89cb6c8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "896e28627aee45471b9d4fefe89cb6c8")).booleanValue();
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.b.length; i2++) {
            Drawable drawable = this.b[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c73d0d8071ae086f11c57bba82ca065d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c73d0d8071ae086f11c57bba82ca065d");
            return;
        }
        for (int i = 0; i < this.b.length; i++) {
            Drawable drawable = this.b[i];
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "547d948d0b21e789be22cc6420f4f90f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "547d948d0b21e789be22cc6420f4f90f")).booleanValue();
        }
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.d;
        for (int i = 0; i < this.b.length; i++) {
            Drawable drawable = this.b[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e6373c93bb33f1d1b3e6c98410b4a8b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e6373c93bb33f1d1b3e6c98410b4a8b");
        }
        for (int i = 0; i < this.b.length; i++) {
            Drawable drawable = this.b[i];
            if (drawable != null) {
                drawable.mutate();
            }
        }
        this.g = true;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17ec7874527676be4943057553ced992", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17ec7874527676be4943057553ced992")).intValue();
        }
        if (this.b.length == 0) {
            return -2;
        }
        int i = -1;
        for (int i2 = 1; i2 < this.b.length; i2++) {
            Drawable drawable = this.b[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4669a33a5d563410a94069009cbecee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4669a33a5d563410a94069009cbecee");
            return;
        }
        this.c.b = i;
        for (int i2 = 0; i2 < this.b.length; i2++) {
            Drawable drawable = this.b[i2];
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af4f24b6c533ee7e45735979d47a4c48", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af4f24b6c533ee7e45735979d47a4c48");
            return;
        }
        this.c.a(colorFilter);
        for (int i = 0; i < this.b.length; i++) {
            Drawable drawable = this.b[i];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b12db624a0714a78c480276517fc99dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b12db624a0714a78c480276517fc99dd");
            return;
        }
        this.c.a(z);
        for (int i = 0; i < this.b.length; i++) {
            Drawable drawable = this.b[i];
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b9a0cf50defcd6e66d73e3701d37a04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b9a0cf50defcd6e66d73e3701d37a04");
            return;
        }
        this.c.b(z);
        for (int i = 0; i < this.b.length; i++) {
            Drawable drawable = this.b[i];
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "219d6d93d5a1ae58c187b0faa9c769a9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "219d6d93d5a1ae58c187b0faa9c769a9")).booleanValue();
        }
        boolean visible = super.setVisible(z, z2);
        for (int i = 0; i < this.b.length; i++) {
            Drawable drawable = this.b[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64898774d0539798ee5755ea5a8b1599", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64898774d0539798ee5755ea5a8b1599");
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Object[] objArr = {drawable, runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f60bcf29fd9d6281a70098fa5632843", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f60bcf29fd9d6281a70098fa5632843");
        } else {
            scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Object[] objArr = {drawable, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3360b4f51ef2e3aa1e73f74eb805172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3360b4f51ef2e3aa1e73f74eb805172");
        } else {
            unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "398d226b1f0dec5f7f50e906022bd5a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "398d226b1f0dec5f7f50e906022bd5a2");
            return;
        }
        for (int i = 0; i < this.b.length; i++) {
            Drawable drawable = this.b[i];
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
        }
    }
}

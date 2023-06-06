package com.dianping.imagemanager.image.drawable;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class e extends Drawable implements Drawable.Callback {
    public static ChangeQuickRedirect a;
    private static final Matrix d = new Matrix();
    private Drawable b;
    private final b c;

    public e(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "efdaa8d6ac8478a5453d3747de67234c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "efdaa8d6ac8478a5453d3747de67234c");
            return;
        }
        this.c = new b();
        this.b = drawable;
    }

    public Drawable a(Drawable drawable) {
        Drawable drawable2;
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81d938b47152e3bd1bc4506c44ddfb21", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81d938b47152e3bd1bc4506c44ddfb21");
        }
        Object[] objArr2 = {drawable};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "766bf5fe1d1d523bfee705fc7c223a7b", RobustBitConfig.DEFAULT_VALUE)) {
            drawable2 = (Drawable) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "766bf5fe1d1d523bfee705fc7c223a7b");
        } else {
            Drawable drawable3 = this.b;
            c.a(drawable, this.c);
            c.a(drawable, (Drawable) this);
            this.b = drawable;
            drawable2 = drawable3;
        }
        invalidateSelf();
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa0e4904a1e1b30767cec2a21004c13e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa0e4904a1e1b30767cec2a21004c13e")).intValue() : this.b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d1238301a6df51f4efcfd1c3dbdd8e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d1238301a6df51f4efcfd1c3dbdd8e6");
            return;
        }
        this.c.b = i;
        this.b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cd1bd06afed646e915bbaac82848582", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cd1bd06afed646e915bbaac82848582");
            return;
        }
        this.c.a(colorFilter);
        this.b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eafce5b6f7486b8b2e985e00da3a1e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eafce5b6f7486b8b2e985e00da3a1e5a");
            return;
        }
        this.c.a(z);
        this.b.setDither(z);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62a34a90065b19fa2390cc1e0f69242e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62a34a90065b19fa2390cc1e0f69242e");
            return;
        }
        this.c.b(z);
        this.b.setFilterBitmap(z);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d7bbdf6d6a9450aa4ce16b3ef39adef", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d7bbdf6d6a9450aa4ce16b3ef39adef")).booleanValue();
        }
        super.setVisible(z, z2);
        return this.b.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d40d72f257f45e8a6906ef237ec983", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d40d72f257f45e8a6906ef237ec983");
        } else {
            this.b.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2689888971062e647e54658ad3803495", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2689888971062e647e54658ad3803495")).booleanValue() : this.b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc2a0dcf50ac26a4a5efdd9302ebf924", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc2a0dcf50ac26a4a5efdd9302ebf924")).booleanValue() : this.b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "433a3e7435586c6955dfb0ff58eee35b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "433a3e7435586c6955dfb0ff58eee35b")).booleanValue() : this.b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6079c7516dcac4f729392ea35ebcabd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6079c7516dcac4f729392ea35ebcabd0");
        } else {
            this.b.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95159511261187a41eb54ec00034f00e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95159511261187a41eb54ec00034f00e")).intValue() : this.b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a17a3e65da60eff269f4853e88138168", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a17a3e65da60eff269f4853e88138168")).intValue() : this.b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d939912ddf9113e10704633ac18c0cb7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d939912ddf9113e10704633ac18c0cb7")).booleanValue() : this.b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0132cf3bc2aea925315079f9f15c174", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0132cf3bc2aea925315079f9f15c174");
        }
        this.b.mutate();
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.b;
    }

    public final Drawable a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e99bd92bf60e654943e7e983d6855a5a", RobustBitConfig.DEFAULT_VALUE) ? (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e99bd92bf60e654943e7e983d6855a5a") : getCurrent();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79716bafc0d487788df24ea3e18c2227", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79716bafc0d487788df24ea3e18c2227");
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Object[] objArr = {drawable, runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aed6f993d1410ba276f649f46ef3ecb2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aed6f993d1410ba276f649f46ef3ecb2");
        } else {
            scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Object[] objArr = {drawable, runnable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02f9bf919946c79eea488d361baef025", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02f9bf919946c79eea488d361baef025");
        } else {
            unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9bf59a21e8fc99a4f71f2f2607847486", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9bf59a21e8fc99a4f71f2f2607847486");
        } else {
            this.b.setHotspot(f, f2);
        }
    }
}

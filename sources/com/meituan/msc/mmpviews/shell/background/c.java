package com.meituan.msc.mmpviews.shell.background;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class c extends Drawable implements Animatable, Drawable.Callback {
    public static ChangeQuickRedirect g;
    private boolean a;
    Drawable h;

    public c(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c2d10570b257566745eeb01118de6b2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c2d10570b257566745eeb01118de6b2");
        } else {
            this.h = drawable;
        }
    }

    public void a(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5705091bbb04e915b0e4908ef10bfad9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5705091bbb04e915b0e4908ef10bfad9");
            return;
        }
        if (this.h != null) {
            this.h.setCallback(null);
        }
        this.h = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            drawable.setVisible(isVisible(), true);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        Object[] objArr = {theme};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a3d26cd496f5c902bfa592b80188897", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a3d26cd496f5c902bfa592b80188897");
            return;
        }
        super.applyTheme(theme);
        if (this.h == null || !this.h.canApplyTheme()) {
            return;
        }
        this.h.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c665a7d64057485b719b014a9f04c35c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c665a7d64057485b719b014a9f04c35c");
            return;
        }
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        Object[] objArr = {drawable, runnable, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d20c8e4aa4c6e6597ef5d1170cbf8d0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d20c8e4aa4c6e6597ef5d1170cbf8d0e");
            return;
        }
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Object[] objArr = {drawable, runnable};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12c3ac63bc73dbc23b69d3fd3b49c514", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12c3ac63bc73dbc23b69d3fd3b49c514");
            return;
        }
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bb5b25c5b037aa47aa6ac76946e4d5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bb5b25c5b037aa47aa6ac76946e4d5e");
        } else if (this.h != null) {
            this.h.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "817f8d9eab3040efccb28e50dd2e55de", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "817f8d9eab3040efccb28e50dd2e55de")).intValue() : super.getChangingConfigurations() | this.h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78bcc8d0585f9874b1e16a9b65f07740", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78bcc8d0585f9874b1e16a9b65f07740")).booleanValue() : this.h != null && this.h.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public void setHotspot(float f, float f2) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c98275bdef77ed7375cdc178012dd78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c98275bdef77ed7375cdc178012dd78");
        } else if (this.h != null) {
            this.h.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a55e87427d18e8d8bc60e2d8f57e906", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a55e87427d18e8d8bc60e2d8f57e906");
        } else if (this.h != null) {
            this.h.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 23)
    public void getHotspotBounds(@NonNull Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "265c614c38fc8835c6e50ecbc0b8f903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "265c614c38fc8835c6e50ecbc0b8f903");
        } else if (this.h != null) {
            this.h.getHotspotBounds(rect);
        } else {
            rect.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean z3 = false;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7df05aaeab0a0ec5074683bf34e070f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7df05aaeab0a0ec5074683bf34e070f")).booleanValue();
        }
        boolean visible = super.setVisible(z, z2);
        if (this.h != null && this.h.setVisible(z, z2)) {
            z3 = true;
        }
        return visible | z3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58264fdbf9f2a561a9ad15380bb23896", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58264fdbf9f2a561a9ad15380bb23896");
        } else if (this.h != null) {
            this.h.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 19)
    public int getAlpha() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38204aa29d2440c33d72948cc7a300f0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38204aa29d2440c33d72948cc7a300f0")).intValue();
        }
        if (this.h != null) {
            return this.h.getAlpha();
        }
        return 255;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c42744c3ef94049cb16aecddd48ea638", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c42744c3ef94049cb16aecddd48ea638");
        } else if (this.h != null) {
            this.h.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public void setTintList(@Nullable ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c6015db1201d516b91b85c7bd2b4645", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c6015db1201d516b91b85c7bd2b4645");
        } else if (this.h != null) {
            this.h.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        Object[] objArr = {mode};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "459d908c3aee9666cdc27dd7ce907548", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "459d908c3aee9666cdc27dd7ce907548");
        } else if (this.h != null) {
            this.h.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 23)
    public boolean onLayoutDirectionChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47e46102254f9541faa467eee5c3e6c8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47e46102254f9541faa467eee5c3e6c8")).booleanValue() : this.h != null && this.h.setLayoutDirection(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2b65055611f2376275fdf7ccba267c7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2b65055611f2376275fdf7ccba267c7")).intValue();
        }
        if (this.h != null) {
            return this.h.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49e08fd79e61e87e8d7296aabbbc0948", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49e08fd79e61e87e8d7296aabbbc0948")).booleanValue() : this.h != null && this.h.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a802e751c2031da4a35a63a2ca4a1dcf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a802e751c2031da4a35a63a2ca4a1dcf")).booleanValue();
        }
        if (this.h == null || !this.h.isStateful()) {
            return false;
        }
        boolean state = this.h.setState(iArr);
        if (state) {
            onBoundsChange(getBounds());
        }
        return state;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = g;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc904a9c06c096cde7ee6fa50f07ead3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc904a9c06c096cde7ee6fa50f07ead3")).booleanValue() : this.h != null && this.h.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cdbce315605da0a8244b963695ed9a00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cdbce315605da0a8244b963695ed9a00");
        } else if (this.h != null) {
            this.h.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7577c6a218d85966e0ce06af21c8d00", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7577c6a218d85966e0ce06af21c8d00")).intValue();
        }
        if (this.h != null) {
            return this.h.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e84916bdcdb341344019e10f5ba558f9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e84916bdcdb341344019e10f5ba558f9")).intValue();
        }
        if (this.h != null) {
            return this.h.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public void getOutline(@NonNull Outline outline) {
        Object[] objArr = {outline};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5840d6cd839831533bf9c519c02e55cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5840d6cd839831533bf9c519c02e55cc");
        } else if (this.h != null) {
            this.h.getOutline(outline);
        } else {
            super.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d2985a70d57547793d810b7b04ae41b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d2985a70d57547793d810b7b04ae41b");
        }
        if (!this.a && super.mutate() == this) {
            if (this.h != null) {
                this.h.mutate();
            }
            this.a = true;
        }
        return this;
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a1b75006e95d626e39db123ee41a449", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a1b75006e95d626e39db123ee41a449");
        } else if (this.h instanceof Animatable) {
            ((Animatable) this.h).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d6f618eadbebab9d6e023dde8c6b954", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d6f618eadbebab9d6e023dde8c6b954");
        } else if (this.h instanceof Animatable) {
            ((Animatable) this.h).stop();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a9bfe68fe995b84c8c6a95087cf75d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a9bfe68fe995b84c8c6a95087cf75d6")).booleanValue();
        }
        if (this.h instanceof Animatable) {
            return ((Animatable) this.h).isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(api = 21)
    public ColorFilter getColorFilter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "523af25f62a05e21983ccb73b5697d1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ColorFilter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "523af25f62a05e21983ccb73b5697d1c");
        }
        Drawable drawable = this.h;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return super.getColorFilter();
    }
}

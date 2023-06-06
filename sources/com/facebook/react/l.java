package com.facebook.react;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.PicassoDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class l extends PicassoDrawable {
    private PicassoDrawable a;
    private a b;
    private boolean c;

    public l(PicassoDrawable picassoDrawable, int i) {
        this(new a(picassoDrawable.getConstantState(), i), picassoDrawable, null);
    }

    protected l(a aVar, PicassoDrawable picassoDrawable, Resources resources) {
        this.b = aVar;
        if (picassoDrawable != null) {
            this.a = picassoDrawable;
        } else if (resources != null) {
            this.a = (PicassoDrawable) aVar.a.newDrawable(resources);
        } else {
            this.a = (PicassoDrawable) aVar.a.newDrawable();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        if (this.a != null) {
            this.a.setBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        if (this.a != null) {
            this.a.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setChangingConfigurations(int i) {
        if (this.a != null) {
            this.a.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        if (this.a != null) {
            return this.a.getChangingConfigurations();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        if (this.a != null) {
            this.a.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        if (this.a != null) {
            this.a.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(11)
    public final Drawable.Callback getCallback() {
        if (this.a != null) {
            return this.a.getCallback();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(19)
    public final int getAlpha() {
        if (this.a != null) {
            return this.a.getAlpha();
        }
        return 255;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        if (this.a != null) {
            this.a.setColorFilter(i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        if (this.a != null) {
            this.a.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        if (this.a != null) {
            return this.a.getCurrent();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.a != null) {
            return this.a.setVisible(z, z2);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.b.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.b.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        if (this.a != null) {
            return this.a.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        if (this.a != null) {
            return this.a.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        if (this.a != null) {
            return this.a.getPadding(rect);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        if (this.a != null) {
            this.a.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        if (this.a != null) {
            this.a.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        if (this.a != null) {
            this.a.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.a != null) {
            this.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.a != null) {
            this.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.a != null) {
            this.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.a != null) {
            return this.a.getOpacity();
        }
        return 0;
    }

    @Override // com.squareup.picasso.PicassoDrawable
    public final boolean a() {
        if (this.a != null) {
            return this.a.a();
        }
        return false;
    }

    @Override // com.squareup.picasso.PicassoDrawable
    public final void a(int i) {
        if (this.a != null) {
            this.a.a(i);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.a != null) {
            this.a.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.a != null) {
            this.a.stop();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (this.a != null) {
            return this.a.isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.c && super.mutate() == this) {
            this.a = (PicassoDrawable) this.a.mutate();
            this.b = new a(this.b);
            this.c = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends Drawable.ConstantState {
        private final Drawable.ConstantState a;
        private final int b;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        a(a aVar) {
            this(aVar.a, aVar.b);
        }

        a(Drawable.ConstantState constantState, int i) {
            this.a = constantState;
            this.b = i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new l(this, null, resources);
        }
    }
}

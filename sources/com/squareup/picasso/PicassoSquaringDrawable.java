package com.squareup.picasso;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class PicassoSquaringDrawable extends PicassoDrawable {
    private PicassoDrawable a;
    private State b;
    private boolean c;

    public PicassoSquaringDrawable(PicassoDrawable picassoDrawable, int i) {
        this(new State(picassoDrawable.getConstantState(), i), picassoDrawable, null);
    }

    protected PicassoSquaringDrawable(State state, PicassoDrawable picassoDrawable, Resources resources) {
        this.b = state;
        if (picassoDrawable != null) {
            this.a = picassoDrawable;
        } else if (resources != null) {
            this.a = (PicassoDrawable) state.a.newDrawable(resources);
        } else {
            this.a = (PicassoDrawable) state.a.newDrawable();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        if (this.a != null) {
            this.a.setBounds(i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        super.setBounds(rect);
        if (this.a != null) {
            this.a.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i) {
        if (this.a != null) {
            this.a.setChangingConfigurations(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.a != null) {
            return this.a.getChangingConfigurations();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        if (this.a != null) {
            this.a.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        if (this.a != null) {
            this.a.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(11)
    public Drawable.Callback getCallback() {
        if (this.a != null) {
            return this.a.getCallback();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(19)
    public int getAlpha() {
        if (this.a != null) {
            return this.a.getAlpha();
        }
        return 255;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i, PorterDuff.Mode mode) {
        if (this.a != null) {
            this.a.setColorFilter(i, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        if (this.a != null) {
            this.a.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        if (this.a != null) {
            return this.a.getCurrent();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.a != null) {
            return this.a.setVisible(z, z2);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.b.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.b.b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.a != null) {
            return this.a.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.a != null) {
            return this.a.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.a != null) {
            return this.a.getPadding(rect);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        if (this.a != null) {
            this.a.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        super.unscheduleSelf(runnable);
        if (this.a != null) {
            this.a.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        super.scheduleSelf(runnable, j);
        if (this.a != null) {
            this.a.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.a != null) {
            this.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.a != null) {
            this.a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.a != null) {
            this.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
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

    @Override // com.squareup.picasso.PicassoDrawable
    public final void d() {
        if (this.a != null) {
            this.a.d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.a != null) {
            this.a.start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.a != null) {
            this.a.stop();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.a != null) {
            return this.a.isRunning();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.c && super.mutate() == this) {
            this.a = (PicassoDrawable) this.a.mutate();
            this.b = new State(this.b);
            this.c = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.b;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class State extends Drawable.ConstantState {
        private final Drawable.ConstantState a;
        private final int b;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        State(State state) {
            this(state.a, state.b);
        }

        State(Drawable.ConstantState constantState, int i) {
            this.a = constantState;
            this.b = i;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return newDrawable(null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new PicassoSquaringDrawable(this, null, resources);
        }
    }
}

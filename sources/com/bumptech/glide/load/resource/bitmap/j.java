package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.squareup.picasso.PicassoBitmapDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class j extends PicassoBitmapDrawable {
    a a;
    private final Rect b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    @Override // com.squareup.picasso.PicassoDrawable
    public final void a(int i) {
    }

    @Override // com.squareup.picasso.PicassoDrawable
    public final boolean a() {
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    public j(Resources resources, Bitmap bitmap) {
        this(resources, new a(bitmap));
    }

    protected j(Resources resources, a aVar) {
        int i;
        this.b = new Rect();
        this.a = aVar;
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
            i = i == 0 ? 160 : i;
            aVar.b = i;
        } else {
            i = aVar.b;
        }
        this.c = aVar.a.getScaledWidth(i);
        this.d = aVar.a.getScaledHeight(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.d;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.e = true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.e) {
            Gravity.apply(119, this.c, this.d, getBounds(), this.b);
            this.e = false;
        }
        canvas.drawBitmap(this.a.a, (Rect) null, this.b, this.a.c);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.a.c.getAlpha() != i) {
            a aVar = this.a;
            aVar.a();
            aVar.c.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        a aVar = this.a;
        aVar.a();
        aVar.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.a.a;
        return (bitmap == null || bitmap.hasAlpha() || this.a.c.getAlpha() < 255) ? -3 : -1;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            this.a = new a(this.a);
            this.f = true;
        }
        return this;
    }

    @Override // com.squareup.picasso.PicassoBitmapDrawable
    public final Bitmap b() {
        return this.a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends Drawable.ConstantState {
        private static final Paint d = new Paint(6);
        final Bitmap a;
        int b;
        Paint c;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        public a(Bitmap bitmap) {
            this.c = d;
            this.a = bitmap;
        }

        a(a aVar) {
            this(aVar.a);
            this.b = aVar.b;
        }

        final void a() {
            if (d == this.c) {
                this.c = new Paint(6);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new j((Resources) null, this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new j(resources, this);
        }
    }
}

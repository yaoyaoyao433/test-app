package com.bumptech.glide.load.resource.gif;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Gravity;
import com.bumptech.glide.gifdecoder.a;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import com.bumptech.glide.load.resource.gif.f;
import com.squareup.picasso.PicassoGifDrawable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class b extends PicassoGifDrawable implements f.b {
    public final a a;
    public final com.bumptech.glide.gifdecoder.a b;
    final f c;
    boolean d;
    private final Paint e;
    private final Rect f;
    private ImageHeaderParser.ImageType g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private boolean m;

    @Override // com.squareup.picasso.PicassoDrawable
    public final boolean a() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public b(Context context, a.InterfaceC0036a interfaceC0036a, com.bumptech.glide.load.engine.bitmap_recycle.c cVar, com.bumptech.glide.load.g<Bitmap> gVar, int i, int i2, com.bumptech.glide.gifdecoder.c cVar2, byte[] bArr, Bitmap bitmap, ImageHeaderParser.ImageType imageType) {
        this(new a(cVar2, bArr, context, gVar, i, i2, interfaceC0036a, cVar, bitmap, imageType));
    }

    public b(b bVar, Bitmap bitmap, com.bumptech.glide.load.g<Bitmap> gVar) {
        this(new a(bVar.a.a, bVar.a.b, bVar.a.c, gVar, bVar.a.e, bVar.a.f, bVar.a.g, bVar.a.h, bitmap, bVar.a.j));
    }

    protected b(a aVar) {
        this.f = new Rect();
        this.g = ImageHeaderParser.ImageType.GIF;
        this.j = true;
        this.l = -1;
        this.a = aVar;
        this.b = new com.bumptech.glide.gifdecoder.a(aVar.g, aVar.j);
        this.e = new Paint();
        this.b.a(aVar.a, aVar.b);
        this.c = new f(aVar.c, this, this.b, aVar.e, aVar.f);
        f fVar = this.c;
        com.bumptech.glide.load.g<Bitmap> gVar = aVar.d;
        if (gVar == null) {
            throw new NullPointerException("Transformation must not be null");
        }
        fVar.f = fVar.f.a(gVar);
    }

    @Override // com.squareup.picasso.PicassoGifDrawable
    public final Bitmap b() {
        return this.a.i;
    }

    @Override // com.squareup.picasso.PicassoGifDrawable
    public final int c() {
        return this.b.c();
    }

    @Override // com.squareup.picasso.PicassoGifDrawable
    public final int b(int i) {
        return this.b.a(i);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.i = true;
        this.k = 0;
        if (this.j) {
            f();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.i = false;
        g();
        if (Build.VERSION.SDK_INT < 11) {
            e();
        }
    }

    private void e() {
        this.c.b();
        invalidateSelf();
    }

    @Override // com.squareup.picasso.PicassoDrawable
    public final void d() {
        this.b.j.set(true);
        if (this.i) {
            return;
        }
        start();
    }

    private void f() {
        if (this.b.c() == 1) {
            invalidateSelf();
        } else if (this.h) {
        } else {
            this.h = true;
            this.c.a();
            invalidateSelf();
        }
    }

    private void g() {
        this.h = false;
        this.c.d = false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        this.j = z;
        if (!z) {
            g();
        } else if (this.i) {
            f();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.i.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.i.getHeight();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.d) {
            return;
        }
        if (this.m) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f);
            this.m = false;
        }
        f fVar = this.c;
        Bitmap bitmap = fVar.g != null ? fVar.g.b : null;
        if (bitmap == null) {
            bitmap = this.a.i;
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.f, this.e);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.e.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }

    @Override // com.bumptech.glide.load.resource.gif.f.b
    @TargetApi(11)
    public final void c(int i) {
        if (Build.VERSION.SDK_INT >= 11 && getCallback() == null) {
            stop();
            e();
            return;
        }
        invalidateSelf();
        if (i == this.b.c() - 1) {
            this.k++;
        }
        if (this.l == -1 || this.k < this.l) {
            return;
        }
        stop();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // com.squareup.picasso.PicassoDrawable
    public final void a(int i) {
        int i2;
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to PicassoDrawable.LOOP_FOREVER, or equal to PicassoDrawable.LOOP_INTRINSIC");
        }
        if (i == 0) {
            com.bumptech.glide.gifdecoder.a aVar = this.b;
            if (ImageHeaderParser.ImageType.ANIMATED_WEBP != aVar.h) {
                i2 = aVar.e.m;
            } else {
                i2 = aVar.i.a.k();
            }
            int i3 = i2 == -1 ? 1 : i2 == 0 ? 0 : i2 + 1;
            if (i3 == 0) {
                i3 = -1;
            }
            this.l = i3;
            return;
        }
        this.l = i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class a extends Drawable.ConstantState {
        com.bumptech.glide.gifdecoder.c a;
        byte[] b;
        Context c;
        com.bumptech.glide.load.g<Bitmap> d;
        int e;
        int f;
        a.InterfaceC0036a g;
        com.bumptech.glide.load.engine.bitmap_recycle.c h;
        public Bitmap i;
        ImageHeaderParser.ImageType j;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        public a(com.bumptech.glide.gifdecoder.c cVar, byte[] bArr, Context context, com.bumptech.glide.load.g<Bitmap> gVar, int i, int i2, a.InterfaceC0036a interfaceC0036a, com.bumptech.glide.load.engine.bitmap_recycle.c cVar2, Bitmap bitmap, ImageHeaderParser.ImageType imageType) {
            if (bitmap == null) {
                throw new NullPointerException("The first frame of the GIF must not be null");
            }
            this.a = cVar;
            this.b = bArr;
            this.h = cVar2;
            this.i = bitmap;
            this.c = context.getApplicationContext();
            this.d = gVar;
            this.e = i;
            this.f = i2;
            this.j = imageType;
            this.g = interfaceC0036a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new b(this);
        }
    }
}

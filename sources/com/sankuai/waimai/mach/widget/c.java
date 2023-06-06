package com.sankuai.waimai.mach.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.common.i;
import com.squareup.picasso.PicassoBitmapDrawable;
import com.squareup.picasso.PicassoGifDrawable;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes5.dex */
public class c extends ImageView {
    public static ChangeQuickRedirect c;
    private static Boolean d;
    private f a;
    private com.sankuai.waimai.mach.widget.decorations.d b;
    private boolean e;
    private int f;
    private String g;

    static {
        try {
            PicassoGifDrawable.class.getName();
            d = Boolean.TRUE;
        } catch (Throwable unused) {
            d = Boolean.FALSE;
        }
    }

    public String getSource() {
        return this.g;
    }

    public void setSource(String str) {
        this.g = str;
    }

    public c(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6c03eb646bac35b18a901a90680462d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6c03eb646bac35b18a901a90680462d");
            return;
        }
        this.a = new f(this);
        this.b = new com.sankuai.waimai.mach.widget.decorations.d(this);
        this.e = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f91699f736852b50270a9fa749e6f1f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f91699f736852b50270a9fa749e6f1f0");
            return;
        }
        try {
            this.b.b(canvas);
            canvas.save();
            this.b.a(canvas);
            super.draw(canvas);
            canvas.restore();
            this.b.c(canvas);
        } catch (Exception e) {
            com.sankuai.waimai.mach.e e2 = i.a().e();
            if (e2 != null) {
                e2.a("mach_image_view", "MachImageView.draw", e.getMessage(), null);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d8d167c964f58fc42e750bf9ca9f445", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d8d167c964f58fc42e750bf9ca9f445");
            return;
        }
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            this.a.a(dVar);
            this.b.a(dVar);
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e945ec18ca6d5838332a35a4b32d5a5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e945ec18ca6d5838332a35a4b32d5a5e");
            return;
        }
        setImageDrawableWithoutStartAnim(drawable);
        b();
    }

    public void setImageDrawableWithoutStartAnim(@Nullable Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "742b8229a73fd29812cf182087a9eada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "742b8229a73fd29812cf182087a9eada");
            return;
        }
        if (d.booleanValue() && this.f > 0 && (drawable instanceof PicassoGifDrawable)) {
            RunnableC1021c.a((PicassoGifDrawable) drawable, this.f);
        }
        if (this.e) {
            if (drawable instanceof BitmapDrawable) {
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                ((BitmapDrawable) drawable).setTileModeXY(tileMode, tileMode);
            } else if (d.booleanValue() && (drawable instanceof PicassoBitmapDrawable)) {
                drawable = new a(drawable);
            }
        }
        c();
        super.setImageDrawable(drawable);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a056ade6e2e25103e63a0c7e2ea99f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a056ade6e2e25103e63a0c7e2ea99f5");
            return;
        }
        Drawable drawable = getDrawable();
        if (d.booleanValue() && (drawable instanceof PicassoGifDrawable)) {
            PicassoGifDrawable picassoGifDrawable = (PicassoGifDrawable) drawable;
            if (picassoGifDrawable.b().isRecycled()) {
                com.sankuai.waimai.mach.e e = i.a().e();
                if (e != null) {
                    e.a("mach_image_view", "GifDrawable首帧被回收", "GifDrawable首帧被回收", null);
                    return;
                }
                return;
            }
            picassoGifDrawable.start();
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbdc43b44e551a6663f7b9267694cade", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbdc43b44e551a6663f7b9267694cade");
            return;
        }
        Drawable drawable = getDrawable();
        if (d.booleanValue() && (drawable instanceof PicassoGifDrawable)) {
            ((PicassoGifDrawable) drawable).stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.mach.widget.c$c  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static class RunnableC1021c implements Runnable {
        public static ChangeQuickRedirect a;
        private final WeakReference<PicassoGifDrawable> b;
        private final int c;

        public static void a(PicassoGifDrawable picassoGifDrawable, int i) {
            Object[] objArr = {picassoGifDrawable, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0a18d9a8a049b77a0c4b0c2156656428", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0a18d9a8a049b77a0c4b0c2156656428");
            } else {
                new Handler(Looper.getMainLooper()).post(new RunnableC1021c(picassoGifDrawable, i));
            }
        }

        private RunnableC1021c(PicassoGifDrawable picassoGifDrawable, int i) {
            Object[] objArr = {picassoGifDrawable, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8af4b93cfad757b8bc52b3342a8caf4", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8af4b93cfad757b8bc52b3342a8caf4");
                return;
            }
            this.b = new WeakReference<>(picassoGifDrawable);
            this.c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed834a809be0338fba8a87b94d721b9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed834a809be0338fba8a87b94d721b9");
                return;
            }
            PicassoGifDrawable picassoGifDrawable = this.b.get();
            if (picassoGifDrawable != null) {
                picassoGifDrawable.a(this.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed9fa67fb61b3ca26b82373efa379f4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed9fa67fb61b3ca26b82373efa379f4f");
        } else if (this.e) {
            setImageDrawable(new BitmapDrawable(bitmap));
        } else {
            super.setImageBitmap(bitmap);
        }
    }

    public void setRepeat(boolean z) {
        this.e = z;
    }

    public void setLoopCount(int i) {
        this.f = i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    static class b extends Canvas {
        public static ChangeQuickRedirect a;
        private Canvas b;
        private final Paint c;

        public b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce012fc7800379c73b03588edb0ba00e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce012fc7800379c73b03588edb0ba00e");
            } else {
                this.c = new Paint(6);
            }
        }

        private Paint a(Bitmap bitmap) {
            Object[] objArr = {bitmap};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49c9a99e655e4a5427ef9a16abd3871d", RobustBitConfig.DEFAULT_VALUE)) {
                return (Paint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49c9a99e655e4a5427ef9a16abd3871d");
            }
            a aVar = (a) this.c.getShader();
            if (aVar == null) {
                this.c.setShader(new a(bitmap));
            } else if (aVar.a != bitmap) {
                aVar.a = bitmap;
            }
            return this.c;
        }

        @Override // android.graphics.Canvas
        public final void drawBitmap(@NonNull Bitmap bitmap, @NonNull Matrix matrix, @Nullable Paint paint) {
            Object[] objArr = {bitmap, matrix, paint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bcf4b5aaa564c99014b49ef1526567d7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bcf4b5aaa564c99014b49ef1526567d7");
            } else {
                this.b.drawRect(this.b.getClipBounds(), a(bitmap));
            }
        }

        @Override // android.graphics.Canvas
        public final void drawBitmap(@NonNull Bitmap bitmap, float f, float f2, @Nullable Paint paint) {
            Object[] objArr = {bitmap, Float.valueOf(f), Float.valueOf(f2), paint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "532b11ab939dc625d08a944fdaaf4735", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "532b11ab939dc625d08a944fdaaf4735");
            } else {
                this.b.drawRect(this.b.getClipBounds(), a(bitmap));
            }
        }

        @Override // android.graphics.Canvas
        public final void drawBitmap(@NonNull Bitmap bitmap, @Nullable Rect rect, @NonNull Rect rect2, @Nullable Paint paint) {
            Object[] objArr = {bitmap, rect, rect2, paint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52458c7b1e6321fb199fb943e06795f8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52458c7b1e6321fb199fb943e06795f8");
            } else {
                this.b.drawRect(this.b.getClipBounds(), a(bitmap));
            }
        }

        @Override // android.graphics.Canvas
        public final void drawBitmap(@NonNull Bitmap bitmap, @Nullable Rect rect, @NonNull RectF rectF, @Nullable Paint paint) {
            Object[] objArr = {bitmap, rect, rectF, paint};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "17071963039144108bd1204f13c1df08", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "17071963039144108bd1204f13c1df08");
            } else {
                this.b.drawRect(this.b.getClipBounds(), a(bitmap));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ProGuard */
        /* loaded from: classes5.dex */
        public static class a extends BitmapShader {
            public Bitmap a;

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public a(@android.support.annotation.NonNull android.graphics.Bitmap r2) {
                /*
                    r1 = this;
                    android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
                    r1.<init>(r2, r0, r0)
                    r1.a = r2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.mach.widget.c.b.a.<init>(android.graphics.Bitmap):void");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a extends Drawable {
        public static ChangeQuickRedirect a;
        private final Drawable b;
        private b c;

        public a(Drawable drawable) {
            Object[] objArr = {drawable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c4cf2b8c571962272f87178cc46a5ea", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c4cf2b8c571962272f87178cc46a5ea");
            } else {
                this.b = drawable;
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final void draw(@NonNull Canvas canvas) {
            Object[] objArr = {canvas};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9eb3459ab2c5eca90302949a4c466e1c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9eb3459ab2c5eca90302949a4c466e1c");
                return;
            }
            if (this.c == null) {
                this.c = new b();
            }
            this.c.b = canvas;
            this.b.draw(this.c);
        }

        @Override // android.graphics.drawable.Drawable
        public final int getIntrinsicHeight() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66fd08f65a7d2a38cb5bd96d7c7b4679", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66fd08f65a7d2a38cb5bd96d7c7b4679")).intValue() : this.b.getIntrinsicHeight();
        }

        @Override // android.graphics.drawable.Drawable
        public final int getIntrinsicWidth() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e667f07eb1c5ab630c820f3465fb7aaa", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e667f07eb1c5ab630c820f3465fb7aaa")).intValue() : this.b.getIntrinsicWidth();
        }

        @Override // android.graphics.drawable.Drawable
        public final void setAlpha(int i) {
            Object[] objArr = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46145b3033597ec362471bee64c27b6b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46145b3033597ec362471bee64c27b6b");
            } else {
                this.b.setAlpha(i);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(@NonNull Rect rect) {
            Object[] objArr = {rect};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d79310da18d61ec2172351dc07bd86a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d79310da18d61ec2172351dc07bd86a");
            } else {
                this.b.setBounds(rect);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final void setBounds(int i, int i2, int i3, int i4) {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0de504fdf047d22a48236eebd575ec29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0de504fdf047d22a48236eebd575ec29");
            } else {
                this.b.setBounds(i, i2, i3, i4);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final void setColorFilter(@Nullable ColorFilter colorFilter) {
            Object[] objArr = {colorFilter};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9f8b6477e0de540f5bdc36bef568dd1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9f8b6477e0de540f5bdc36bef568dd1");
            } else {
                this.b.setColorFilter(colorFilter);
            }
        }

        @Override // android.graphics.drawable.Drawable
        public final int getOpacity() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eae0f690225c8cccbfd1c11152da4af2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eae0f690225c8cccbfd1c11152da4af2")).intValue() : this.b.getOpacity();
        }
    }
}

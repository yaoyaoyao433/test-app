package com.meituan.roodesign.widgets.shape;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.IntRange;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.graphics.drawable.TintAwareDrawable;
import android.support.v4.util.ObjectsCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.widgets.shape.j;
import com.meituan.roodesign.widgets.shape.k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable {
    public static ChangeQuickRedirect a;
    private static final Paint b = new Paint(1);
    private a c;
    private final k.f[] d;
    private final k.f[] e;
    private boolean f;
    private final Matrix g;
    private final Path h;
    private final Path i;
    private final RectF j;
    private final RectF k;
    private final Region l;
    private final Region m;
    private i n;
    private final Paint o;
    private final Paint p;
    private final com.meituan.roodesign.widgets.shadow.a q;
    @NonNull
    private final j.a r;
    private final j s;
    @Nullable
    private PorterDuffColorFilter t;
    @Nullable
    private PorterDuffColorFilter u;
    @Nullable
    private Rect v;
    @NonNull
    private final RectF w;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface CompatibilityShadowMode {
    }

    private static int a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20edb421de186dd53324299443721eb2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20edb421de186dd53324299443721eb2")).intValue() : (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public static /* synthetic */ boolean a(MaterialShapeDrawable materialShapeDrawable, boolean z) {
        materialShapeDrawable.f = true;
        return true;
    }

    public MaterialShapeDrawable() {
        this(new i());
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3501b96eccc8a24cd5d6db37d3b56612", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3501b96eccc8a24cd5d6db37d3b56612");
        }
    }

    private MaterialShapeDrawable(@NonNull i iVar) {
        this(new a(iVar, null));
        Object[] objArr = {iVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85699258187196660c760a035681d74a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85699258187196660c760a035681d74a");
        }
    }

    private MaterialShapeDrawable(@NonNull a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96c7030fdb835253f581f45c7d4e71bc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96c7030fdb835253f581f45c7d4e71bc");
            return;
        }
        this.d = new k.f[4];
        this.e = new k.f[4];
        this.g = new Matrix();
        this.h = new Path();
        this.i = new Path();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new Region();
        this.m = new Region();
        this.o = new Paint(1);
        this.p = new Paint(1);
        this.q = new com.meituan.roodesign.widgets.shadow.a();
        this.s = new j();
        this.w = new RectF();
        this.c = aVar;
        this.p.setStyle(Paint.Style.STROKE);
        this.o.setStyle(Paint.Style.FILL);
        b.setColor(-1);
        b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f();
        a(getState());
        this.r = new j.a() { // from class: com.meituan.roodesign.widgets.shape.MaterialShapeDrawable.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.roodesign.widgets.shape.j.a
            public final void a(@NonNull k kVar, Matrix matrix, int i) {
                Object[] objArr2 = {kVar, matrix, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f34ca906a8157dc2b554826e31f3f159", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f34ca906a8157dc2b554826e31f3f159");
                } else {
                    MaterialShapeDrawable.this.d[i] = kVar.a(matrix);
                }
            }

            @Override // com.meituan.roodesign.widgets.shape.j.a
            public final void b(@NonNull k kVar, Matrix matrix, int i) {
                Object[] objArr2 = {kVar, matrix, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "99ac727467f29c425a19c6c41e2228a3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "99ac727467f29c425a19c6c41e2228a3");
                } else {
                    MaterialShapeDrawable.this.e[i] = kVar.a(matrix);
                }
            }
        };
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd9e3920ecb799a7498ddf09b0aa8d26", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd9e3920ecb799a7498ddf09b0aa8d26");
        }
        this.c = new a(this.c);
        return this;
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        Object[] objArr = {mode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43c3d6c1b2f035e70eab7522e864136a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43c3d6c1b2f035e70eab7522e864136a");
        } else if (this.c.i != mode) {
            this.c.i = mode;
            f();
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a07256c5d38d8cb2a40d86395739aa0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a07256c5d38d8cb2a40d86395739aa0b");
            return;
        }
        this.c.h = colorStateList;
        f();
        b();
    }

    @Override // android.graphics.drawable.Drawable, android.support.v4.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e64c5e556c2605639e76984492390bfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e64c5e556c2605639e76984492390bfa");
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2ef03591a62290c04065a3a705cbd13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2ef03591a62290c04065a3a705cbd13");
        } else if (this.c.n != i) {
            this.c.n = i;
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2d1a1144199c71354e72569a72146e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2d1a1144199c71354e72569a72146e");
            return;
        }
        this.c.d = colorFilter;
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "596a12cb04e294d952dd5efb92ec380d", RobustBitConfig.DEFAULT_VALUE)) {
            return (Region) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "596a12cb04e294d952dd5efb92ec380d");
        }
        this.l.set(getBounds());
        b(a(), this.h);
        this.m.setPath(this.h, this.l);
        this.l.op(this.m, Region.Op.DIFFERENCE);
        return this.l;
    }

    @NonNull
    private RectF a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e860522d54137bd4a091bc5d59db0c96", RobustBitConfig.DEFAULT_VALUE)) {
            return (RectF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e860522d54137bd4a091bc5d59db0c96");
        }
        this.j.set(getBounds());
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c79c8237a16ec15b60a7cef9238b0ad", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c79c8237a16ec15b60a7cef9238b0ad")).booleanValue();
        }
        if (this.v != null) {
            rect.set(this.v);
            return true;
        }
        return super.getPadding(rect);
    }

    @ColorInt
    private int a(@ColorInt int i) {
        boolean z;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6f458052921f8ba5d5fd06bfd872fdd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6f458052921f8ba5d5fd06bfd872fdd")).intValue();
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        float floatValue = (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9a4a8748ac6ae991a814ddd5e48a91d6", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9a4a8748ac6ae991a814ddd5e48a91d6")).floatValue() : this.c.p + this.c.q) + this.c.o;
        if (this.c.c != null) {
            com.meituan.roodesign.widgets.elevation.a aVar = this.c.c;
            Object[] objArr3 = {Integer.valueOf(i), Float.valueOf(floatValue)};
            ChangeQuickRedirect changeQuickRedirect3 = com.meituan.roodesign.widgets.elevation.a.a;
            if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "c005adcc4fae5f24db01b1f8b69131ad", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "c005adcc4fae5f24db01b1f8b69131ad")).intValue();
            }
            if (aVar.b) {
                Object[] objArr4 = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = com.meituan.roodesign.widgets.elevation.a.a;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "4377ea6906efe291671ef08f1f3e3c46", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "4377ea6906efe291671ef08f1f3e3c46")).booleanValue();
                } else {
                    z = ColorUtils.setAlphaComponent(i, 255) == aVar.d;
                }
                if (z) {
                    Object[] objArr5 = {Integer.valueOf(i), Float.valueOf(floatValue)};
                    ChangeQuickRedirect changeQuickRedirect5 = com.meituan.roodesign.widgets.elevation.a.a;
                    if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "e2116cc264c341e592386f4b07be4ccf", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "e2116cc264c341e592386f4b07be4ccf")).intValue();
                    }
                    Object[] objArr6 = {Float.valueOf(floatValue)};
                    ChangeQuickRedirect changeQuickRedirect6 = com.meituan.roodesign.widgets.elevation.a.a;
                    float f = 0.0f;
                    if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "d36fa4b5d0b405b11b5fed17e4ed5753", RobustBitConfig.DEFAULT_VALUE)) {
                        f = ((Float) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "d36fa4b5d0b405b11b5fed17e4ed5753")).floatValue();
                    } else if (aVar.e > 0.0f && floatValue > 0.0f) {
                        f = Math.min(((((float) Math.log1p(floatValue / aVar.e)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                    }
                    return com.meituan.roodesign.widgets.internal.b.a(i, aVar.c, f);
                }
            }
            return i;
        }
        return i;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3af22335a174d6373e876233966c6e5e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3af22335a174d6373e876233966c6e5e");
            return;
        }
        this.f = true;
        super.invalidateSelf();
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6192c009ab287e46612e7d1fd1dab5f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6192c009ab287e46612e7d1fd1dab5f");
        } else {
            super.invalidateSelf();
        }
    }

    private boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edff79871ebb9d5e94e74f42a2b54c17", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edff79871ebb9d5e94e74f42a2b54c17")).booleanValue() : (this.c.w == Paint.Style.FILL_AND_STROKE || this.c.w == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21fefacd5f7272e7edca07ae93ad6051", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21fefacd5f7272e7edca07ae93ad6051");
            return;
        }
        this.f = true;
        super.onBoundsChange(rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d0, code lost:
        if (r0 != false) goto L69;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(@android.support.annotation.NonNull android.graphics.Canvas r26) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.roodesign.widgets.shape.MaterialShapeDrawable.draw(android.graphics.Canvas):void");
    }

    private void a(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull i iVar, @NonNull RectF rectF) {
        Object[] objArr = {canvas, paint, path, iVar, rectF};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "499f5d371222e417d200f89f8f2308c3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "499f5d371222e417d200f89f8f2308c3");
        } else if (iVar.a(rectF)) {
            float a2 = iVar.h.a(rectF);
            canvas.drawRoundRect(rectF, a2, a2, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    private void a(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30f56b7eaff8c54f2a386de43795dc98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30f56b7eaff8c54f2a386de43795dc98");
            return;
        }
        if (this.c.t != 0) {
            canvas.drawPath(this.h, this.q.b);
        }
        for (int i = 0; i < 4; i++) {
            this.d[i].a(this.q, this.c.s, canvas);
            this.e[i].a(this.q, this.c.s, canvas);
        }
        int d = d();
        int e = e();
        canvas.translate(-d, -e);
        canvas.drawPath(this.h, b);
        canvas.translate(d, e);
    }

    private int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c9c16745b57bfe9ad7ccb506dc8b097", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c9c16745b57bfe9ad7ccb506dc8b097")).intValue() : (int) (this.c.t * Math.sin(Math.toRadians(this.c.u)));
    }

    private int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f08617ee33f2417d5a68b704a32816c", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f08617ee33f2417d5a68b704a32816c")).intValue() : (int) (this.c.t * Math.cos(Math.toRadians(this.c.u)));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private void a(@NonNull RectF rectF, @NonNull Path path) {
        Object[] objArr = {rectF, path};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0460d3fede503a37227030cd275ee1a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0460d3fede503a37227030cd275ee1a1");
        } else {
            this.s.a(this.c.b, this.c.l, rectF, this.r, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        Object[] objArr = {outline};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fcd58dae1186519d5996dcbd906ebab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fcd58dae1186519d5996dcbd906ebab");
        } else if (this.c.r == 2) {
        } else {
            if (i()) {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                outline.setRoundRect(getBounds(), PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cd3ef3d62b487b15b88fd97cdbd35e9", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cd3ef3d62b487b15b88fd97cdbd35e9")).floatValue() : this.c.b.g.a(a()));
                return;
            }
            b(a(), this.h);
            if (this.h.isConvex()) {
                outline.setConvexPath(this.h);
            }
        }
    }

    private void b(@NonNull RectF rectF, @NonNull Path path) {
        Object[] objArr = {rectF, path};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f01196cb4ae12c215e543b086405348", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f01196cb4ae12c215e543b086405348");
            return;
        }
        a(rectF, path);
        if (this.c.k != 1.0f) {
            this.g.reset();
            this.g.setScale(this.c.k, this.c.k, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.g);
        }
        path.computeBounds(this.w, true);
    }

    private boolean f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef3dfcf9f55579f8ec9e8242e1f416d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef3dfcf9f55579f8ec9e8242e1f416d0")).booleanValue();
        }
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        this.t = a(this.c.h, this.c.i, this.o, true);
        this.u = a(this.c.g, this.c.i, this.p, false);
        if (this.c.v) {
            this.q.a(this.c.h.getColorForState(getState(), 0));
        }
        return (ObjectsCompat.equals(porterDuffColorFilter, this.t) && ObjectsCompat.equals(porterDuffColorFilter2, this.u)) ? false : true;
    }

    @NonNull
    private PorterDuffColorFilter a(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z) {
        Object[] objArr = {colorStateList, mode, paint, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63fdaffb7b70caedf2f070b7f0e153c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (PorterDuffColorFilter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63fdaffb7b70caedf2f070b7f0e153c7");
        }
        if (colorStateList == null || mode == null) {
            return a(paint, z);
        }
        return a(colorStateList, mode, z);
    }

    @Nullable
    private PorterDuffColorFilter a(@NonNull Paint paint, boolean z) {
        int color;
        int a2;
        Object[] objArr = {paint, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a790a8350d953428cb399cd025e5b78", RobustBitConfig.DEFAULT_VALUE)) {
            return (PorterDuffColorFilter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a790a8350d953428cb399cd025e5b78");
        }
        if (!z || (a2 = a((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(a2, PorterDuff.Mode.SRC_IN);
    }

    @NonNull
    private PorterDuffColorFilter a(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z) {
        Object[] objArr = {colorStateList, mode, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac87778dac2c29211396b2f6cd908a84", RobustBitConfig.DEFAULT_VALUE)) {
            return (PorterDuffColorFilter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac87778dac2c29211396b2f6cd908a84");
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = a(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "755777ab41b244db9ba4535b066b2476", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "755777ab41b244db9ba4535b066b2476")).booleanValue();
        }
        if (super.isStateful()) {
            return true;
        }
        if (this.c.h == null || !this.c.h.isStateful()) {
            if (this.c.g == null || !this.c.g.isStateful()) {
                if (this.c.f == null || !this.c.f.isStateful()) {
                    return this.c.e != null && this.c.e.isStateful();
                }
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = true;
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d83cf1a931bafc727c1c6a07b94a0057", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d83cf1a931bafc727c1c6a07b94a0057")).booleanValue();
        }
        boolean a2 = a(iArr);
        boolean f = f();
        if (!a2 && !f) {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    private boolean a(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "719e5e6bf7fa7326c01904922fd86437", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "719e5e6bf7fa7326c01904922fd86437")).booleanValue();
        }
        if (this.c.e != null && color2 != (colorForState2 = this.c.e.getColorForState(iArr, (color2 = this.o.getColor())))) {
            this.o.setColor(colorForState2);
            z = true;
        }
        if (this.c.f == null || color == (colorForState = this.c.f.getColorForState(iArr, (color = this.p.getColor())))) {
            return z;
        }
        this.p.setColor(colorForState);
        return true;
    }

    private float g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45717d237a34ed59356de4d554362a18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45717d237a34ed59356de4d554362a18")).floatValue();
        }
        if (c()) {
            return this.p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    @NonNull
    private RectF h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56780f36ca9262277bc42877c92d35b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (RectF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56780f36ca9262277bc42877c92d35b1");
        }
        this.k.set(a());
        float g = g();
        this.k.inset(g, g);
        return this.k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private boolean i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba0f8bae69daa9daca34c5063868025c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba0f8bae69daa9daca34c5063868025c")).booleanValue() : this.c.b.a(a());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static final class a extends Drawable.ConstantState {
        public static ChangeQuickRedirect a;
        @NonNull
        public i b;
        @Nullable
        public com.meituan.roodesign.widgets.elevation.a c;
        @Nullable
        public ColorFilter d;
        @Nullable
        public ColorStateList e;
        @Nullable
        public ColorStateList f;
        @Nullable
        public ColorStateList g;
        @Nullable
        public ColorStateList h;
        @Nullable
        public PorterDuff.Mode i;
        @Nullable
        public Rect j;
        public float k;
        public float l;
        public float m;
        public int n;
        public float o;
        public float p;
        public float q;
        public int r;
        public int s;
        public int t;
        public int u;
        public boolean v;
        public Paint.Style w;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        public a(i iVar, com.meituan.roodesign.widgets.elevation.a aVar) {
            Object[] objArr = {iVar, null};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df233b1cef16eb1085523d89f539f0ee", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df233b1cef16eb1085523d89f539f0ee");
                return;
            }
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = PorterDuff.Mode.SRC_IN;
            this.j = null;
            this.k = 1.0f;
            this.l = 1.0f;
            this.n = 255;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0.0f;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.v = false;
            this.w = Paint.Style.FILL_AND_STROKE;
            this.b = iVar;
            this.c = null;
        }

        public a(@NonNull a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e27789ad0faef8b1a209bfa3bc7f11b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e27789ad0faef8b1a209bfa3bc7f11b");
                return;
            }
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = PorterDuff.Mode.SRC_IN;
            this.j = null;
            this.k = 1.0f;
            this.l = 1.0f;
            this.n = 255;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0.0f;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.v = false;
            this.w = Paint.Style.FILL_AND_STROKE;
            this.b = aVar.b;
            this.c = aVar.c;
            this.m = aVar.m;
            this.d = aVar.d;
            this.e = aVar.e;
            this.f = aVar.f;
            this.i = aVar.i;
            this.h = aVar.h;
            this.n = aVar.n;
            this.k = aVar.k;
            this.t = aVar.t;
            this.r = aVar.r;
            this.v = aVar.v;
            this.l = aVar.l;
            this.o = aVar.o;
            this.p = aVar.p;
            this.q = aVar.q;
            this.s = aVar.s;
            this.u = aVar.u;
            this.g = aVar.g;
            this.w = aVar.w;
            if (aVar.j != null) {
                this.j = new Rect(aVar.j);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e813c350cb4d27e4f98cfa39f1d5261b", RobustBitConfig.DEFAULT_VALUE)) {
                return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e813c350cb4d27e4f98cfa39f1d5261b");
            }
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this);
            MaterialShapeDrawable.a(materialShapeDrawable, true);
            return materialShapeDrawable;
        }
    }
}

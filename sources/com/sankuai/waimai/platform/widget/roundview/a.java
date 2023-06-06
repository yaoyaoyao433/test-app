package com.sankuai.waimai.platform.widget.roundview;

import android.content.res.ColorStateList;
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
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.NonNull;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends Drawable {
    public static ChangeQuickRedirect a;
    boolean b;
    private final RectF c;
    private final RectF d;
    private final RectF e;
    private final Bitmap f;
    private final Paint g;
    private final int h;
    private final int i;
    private final RectF j;
    private final Paint k;
    private final Matrix l;
    private final RectF m;
    private Shader.TileMode n;
    private Shader.TileMode o;
    private boolean p;
    private float q;
    private final boolean[] r;
    private float s;
    private ColorStateList t;
    private ImageView.ScaleType u;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "569c2aea9ec69ee1cc22bbfbc2893be5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "569c2aea9ec69ee1cc22bbfbc2893be5");
            return;
        }
        this.c = new RectF();
        this.d = new RectF();
        this.e = new RectF();
        this.j = new RectF();
        this.l = new Matrix();
        this.m = new RectF();
        this.n = Shader.TileMode.CLAMP;
        this.o = Shader.TileMode.CLAMP;
        this.p = true;
        this.q = 0.0f;
        this.r = new boolean[]{true, true, true, true};
        this.b = false;
        this.s = 0.0f;
        this.t = ColorStateList.valueOf(-16777216);
        this.u = ImageView.ScaleType.FIT_CENTER;
        this.f = bitmap;
        this.h = bitmap.getWidth();
        this.i = bitmap.getHeight();
        this.e.set(0.0f, 0.0f, this.h, this.i);
        this.g = new Paint();
        this.g.setStyle(Paint.Style.FILL);
        this.g.setAntiAlias(true);
        this.k = new Paint();
        this.k.setStyle(Paint.Style.STROKE);
        this.k.setAntiAlias(true);
        this.k.setColor(this.t.getColorForState(getState(), -16777216));
        this.k.setStrokeWidth(this.s);
    }

    public static a a(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8f8bee36172b36f4f7a73c0e0be7780", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8f8bee36172b36f4f7a73c0e0be7780");
        }
        if (bitmap != null) {
            return new a(bitmap);
        }
        return null;
    }

    public static Drawable a(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "847cc300a539c53466860b34c9e6da80", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "847cc300a539c53466860b34c9e6da80");
        }
        if (drawable == null || (drawable instanceof a)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), a(layerDrawable.getDrawable(i)));
            }
            return layerDrawable;
        }
        Bitmap b = b(drawable);
        if (b != null) {
            return new a(b);
        }
        return drawable;
    }

    private static Bitmap b(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c6deb100b7aec040d1e77d9237f6a6f6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c6deb100b7aec040d1e77d9237f6a6f6");
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.a(th);
            return null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6739b6b8d20bcb115f2d5f0d93b3630", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6739b6b8d20bcb115f2d5f0d93b3630")).booleanValue() : this.t.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Object[] objArr = {iArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cff0b2f39b7b342f2418b158c0dff0c4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cff0b2f39b7b342f2418b158c0dff0c4")).booleanValue();
        }
        int colorForState = this.t.getColorForState(iArr, 0);
        if (this.k.getColor() != colorForState) {
            this.k.setColor(colorForState);
            return true;
        }
        return super.onStateChange(iArr);
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.roundview.a$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                a[ImageView.ScaleType.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private void a() {
        float width;
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1dfaeb74849ffe5dd084cca5fc3f9091", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1dfaeb74849ffe5dd084cca5fc3f9091");
            return;
        }
        switch (AnonymousClass1.a[this.u.ordinal()]) {
            case 1:
                this.j.set(this.c);
                this.j.inset(this.s / 2.0f, this.s / 2.0f);
                this.l.reset();
                this.l.setTranslate((int) (((this.j.width() - this.h) * 0.5f) + 0.5f), (int) (((this.j.height() - this.i) * 0.5f) + 0.5f));
                break;
            case 2:
                this.j.set(this.c);
                this.j.inset(this.s / 2.0f, this.s / 2.0f);
                this.l.reset();
                float f2 = 0.0f;
                if (this.h * this.j.height() > this.j.width() * this.i) {
                    width = this.j.height() / this.i;
                    f = (this.j.width() - (this.h * width)) * 0.5f;
                } else {
                    width = this.j.width() / this.h;
                    f2 = (this.j.height() - (this.i * width)) * 0.5f;
                    f = 0.0f;
                }
                this.l.setScale(width, width);
                this.l.postTranslate(((int) (f + 0.5f)) + (this.s / 2.0f), ((int) (f2 + 0.5f)) + (this.s / 2.0f));
                break;
            case 3:
                this.l.reset();
                float min = (((float) this.h) > this.c.width() || ((float) this.i) > this.c.height()) ? Math.min(this.c.width() / this.h, this.c.height() / this.i) : 1.0f;
                this.l.setScale(min, min);
                this.l.postTranslate((int) (((this.c.width() - (this.h * min)) * 0.5f) + 0.5f), (int) (((this.c.height() - (this.i * min)) * 0.5f) + 0.5f));
                this.j.set(this.e);
                this.l.mapRect(this.j);
                this.j.inset(this.s / 2.0f, this.s / 2.0f);
                this.l.setRectToRect(this.e, this.j, Matrix.ScaleToFit.FILL);
                break;
            case 4:
            default:
                this.j.set(this.e);
                this.l.setRectToRect(this.e, this.c, Matrix.ScaleToFit.CENTER);
                this.l.mapRect(this.j);
                this.j.inset(this.s / 2.0f, this.s / 2.0f);
                this.l.setRectToRect(this.e, this.j, Matrix.ScaleToFit.FILL);
                break;
            case 5:
                this.j.set(this.e);
                this.l.setRectToRect(this.e, this.c, Matrix.ScaleToFit.END);
                this.l.mapRect(this.j);
                this.j.inset(this.s / 2.0f, this.s / 2.0f);
                this.l.setRectToRect(this.e, this.j, Matrix.ScaleToFit.FILL);
                break;
            case 6:
                this.j.set(this.e);
                this.l.setRectToRect(this.e, this.c, Matrix.ScaleToFit.START);
                this.l.mapRect(this.j);
                this.j.inset(this.s / 2.0f, this.s / 2.0f);
                this.l.setRectToRect(this.e, this.j, Matrix.ScaleToFit.FILL);
                break;
            case 7:
                this.j.set(this.c);
                this.j.inset(this.s / 2.0f, this.s / 2.0f);
                this.l.reset();
                this.l.setRectToRect(this.e, this.j, Matrix.ScaleToFit.FILL);
                break;
        }
        this.d.set(this.j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(@NonNull Rect rect) {
        Object[] objArr = {rect};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63ca96f55b03d851e9c6f10338516de5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63ca96f55b03d851e9c6f10338516de5");
            return;
        }
        super.onBoundsChange(rect);
        this.c.set(rect);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62812f33badce57fc9ea44bf94c54bc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62812f33badce57fc9ea44bf94c54bc1");
            return;
        }
        if (this.p) {
            BitmapShader bitmapShader = new BitmapShader(this.f, this.n, this.o);
            if (this.n == Shader.TileMode.CLAMP && this.o == Shader.TileMode.CLAMP) {
                bitmapShader.setLocalMatrix(this.l);
            }
            this.g.setShader(bitmapShader);
            this.p = false;
        }
        if (this.b) {
            if (this.s > 0.0f) {
                canvas.drawOval(this.d, this.g);
                canvas.drawOval(this.j, this.k);
                return;
            }
            canvas.drawOval(this.d, this.g);
        } else if (a(this.r)) {
            float f = this.q;
            if (this.s > 0.0f) {
                canvas.drawRoundRect(this.d, f, f, this.g);
                canvas.drawRoundRect(this.j, f, f, this.k);
                a(canvas);
                Object[] objArr2 = {canvas};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "25ac5d7fc510e446098dc9cb7af72066", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "25ac5d7fc510e446098dc9cb7af72066");
                    return;
                } else if (b(this.r) || this.q == 0.0f) {
                    return;
                } else {
                    float f2 = this.d.left;
                    float f3 = this.d.top;
                    float width = f2 + this.d.width();
                    float height = f3 + this.d.height();
                    float f4 = this.q;
                    float f5 = this.s / 2.0f;
                    if (!this.r[0]) {
                        canvas.drawLine(f2 - f5, f3, f2 + f4, f3, this.k);
                        canvas.drawLine(f2, f3 - f5, f2, f3 + f4, this.k);
                    }
                    if (!this.r[1]) {
                        canvas.drawLine((width - f4) - f5, f3, width, f3, this.k);
                        canvas.drawLine(width, f3 - f5, width, f3 + f4, this.k);
                    }
                    if (!this.r[2]) {
                        canvas.drawLine((width - f4) - f5, height, width + f5, height, this.k);
                        canvas.drawLine(width, height - f4, width, height, this.k);
                    }
                    if (this.r[3]) {
                        return;
                    }
                    canvas.drawLine(f2 - f5, height, f2 + f4, height, this.k);
                    canvas.drawLine(f2, height - f4, f2, height, this.k);
                    return;
                }
            }
            canvas.drawRoundRect(this.d, f, f, this.g);
            a(canvas);
        } else {
            canvas.drawRect(this.d, this.g);
            if (this.s > 0.0f) {
                canvas.drawRect(this.j, this.k);
            }
        }
    }

    private void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10aed41f3b46dab3a254dcd1c6a378bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10aed41f3b46dab3a254dcd1c6a378bb");
        } else if (b(this.r) || this.q == 0.0f) {
        } else {
            float f = this.d.left;
            float f2 = this.d.top;
            float width = this.d.width() + f;
            float height = this.d.height() + f2;
            float f3 = this.q;
            if (!this.r[0]) {
                this.m.set(f, f2, f + f3, f2 + f3);
                canvas.drawRect(this.m, this.g);
            }
            if (!this.r[1]) {
                this.m.set(width - f3, f2, width, f3);
                canvas.drawRect(this.m, this.g);
            }
            if (!this.r[2]) {
                this.m.set(width - f3, height - f3, width, height);
                canvas.drawRect(this.m, this.g);
            }
            if (this.r[3]) {
                return;
            }
            this.m.set(f, height - f3, f3 + f, height);
            canvas.drawRect(this.m, this.g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b62b46857915746db2f0d40f6f3d0f9e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b62b46857915746db2f0d40f6f3d0f9e")).intValue() : this.g.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35aa336c56036028fca3e4f75ef09e42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35aa336c56036028fca3e4f75ef09e42");
            return;
        }
        this.g.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49fae4cc6fa04910be976e109b25eaa4", RobustBitConfig.DEFAULT_VALUE) ? (ColorFilter) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49fae4cc6fa04910be976e109b25eaa4") : this.g.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "db14c28087e4836e9d83512944f13712", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "db14c28087e4836e9d83512944f13712");
            return;
        }
        this.g.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47a13ec247db701f0a508e922ce0fe9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47a13ec247db701f0a508e922ce0fe9a");
            return;
        }
        this.g.setDither(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86f1c42132b9ab394a79f94054c30e23", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86f1c42132b9ab394a79f94054c30e23");
            return;
        }
        this.g.setFilterBitmap(z);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.i;
    }

    public final a a(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a5d392383866dffd65adf8f79f6d113", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a5d392383866dffd65adf8f79f6d113");
        }
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
        }
        if (!hashSet.isEmpty()) {
            float floatValue = ((Float) hashSet.iterator().next()).floatValue();
            if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                throw new IllegalArgumentException("Invalid radius value: " + floatValue);
            }
            this.q = floatValue;
        } else {
            this.q = 0.0f;
        }
        this.r[0] = f > 0.0f;
        this.r[1] = f2 > 0.0f;
        this.r[2] = f3 > 0.0f;
        this.r[3] = f4 > 0.0f;
        return this;
    }

    public final a a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e0a6e1f517f873a0750d80239dec3a8", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e0a6e1f517f873a0750d80239dec3a8");
        }
        this.s = f;
        this.k.setStrokeWidth(this.s);
        return this;
    }

    public final a a(ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0bada7fbd9a81240c793da7f2473725a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0bada7fbd9a81240c793da7f2473725a");
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.t = colorStateList;
        this.k.setColor(this.t.getColorForState(getState(), -16777216));
        return this;
    }

    public final a a(ImageView.ScaleType scaleType) {
        Object[] objArr = {scaleType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "392aa8990151b5d3b6573e284c199273", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "392aa8990151b5d3b6573e284c199273");
        }
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.u != scaleType) {
            this.u = scaleType;
            a();
        }
        return this;
    }

    public final a a(Shader.TileMode tileMode) {
        Object[] objArr = {tileMode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2413237f60ee4f865f9f7b5fbcfe37bb", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2413237f60ee4f865f9f7b5fbcfe37bb");
        }
        if (this.n != tileMode) {
            this.n = tileMode;
            this.p = true;
            invalidateSelf();
        }
        return this;
    }

    public final a b(Shader.TileMode tileMode) {
        Object[] objArr = {tileMode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a0aebeb0ab71a13d855ca3787e9095e", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a0aebeb0ab71a13d855ca3787e9095e");
        }
        if (this.o != tileMode) {
            this.o = tileMode;
            this.p = true;
            invalidateSelf();
        }
        return this;
    }

    private static boolean a(boolean[] zArr) {
        Object[] objArr = {zArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce132a419fbd13e7b2f60c78c80cc9bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce132a419fbd13e7b2f60c78c80cc9bd")).booleanValue();
        }
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    private static boolean b(boolean[] zArr) {
        Object[] objArr = {zArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "55a1e8232a251b116bc99c0564d5a9e5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "55a1e8232a251b116bc99c0564d5a9e5")).booleanValue();
        }
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }
}

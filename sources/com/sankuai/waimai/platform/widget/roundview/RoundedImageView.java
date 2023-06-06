package com.sankuai.waimai.platform.widget.roundview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.support.annotation.ColorInt;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RoundedImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private final float[] e;
    private Drawable f;
    private ColorStateList g;
    private float h;
    private ColorFilter i;
    private boolean j;
    private Drawable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private ImageView.ScaleType q;
    private Shader.TileMode r;
    private Shader.TileMode s;
    public static final /* synthetic */ boolean c = !RoundedImageView.class.desiredAssertionStatus();
    public static final Shader.TileMode b = Shader.TileMode.CLAMP;
    private static final ImageView.ScaleType[] d = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    public RoundedImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52ecd32208cc9f3125ace5fd152d1a5f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52ecd32208cc9f3125ace5fd152d1a5f");
            return;
        }
        this.e = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.g = ColorStateList.valueOf(-16777216);
        this.h = 0.0f;
        this.i = null;
        this.j = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.r = b;
        this.s = b;
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2a37099ec6b63d3a4af41c00fdfb7b3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2a37099ec6b63d3a4af41c00fdfb7b3");
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "608f36e2b9f34d34987d9a1aa4924554", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "608f36e2b9f34d34987d9a1aa4924554");
            return;
        }
        this.e = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.g = ColorStateList.valueOf(-16777216);
        this.h = 0.0f;
        this.i = null;
        this.j = false;
        this.l = false;
        this.m = false;
        this.n = false;
        this.r = b;
        this.s = b;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843037, R.attr.riv_corner_radius, R.attr.riv_corner_radius_top_left, R.attr.riv_corner_radius_top_right, R.attr.riv_corner_radius_bottom_left, R.attr.riv_corner_radius_bottom_right, R.attr.riv_border_width, R.attr.riv_border_color, R.attr.riv_mutate_background, R.attr.riv_oval, R.attr.riv_tile_mode, R.attr.riv_tile_mode_x, R.attr.riv_tile_mode_y}, i, 0);
        int i2 = obtainStyledAttributes.getInt(0, -1);
        if (i2 >= 0) {
            setScaleType(d[i2]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.e[0] = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        this.e[1] = obtainStyledAttributes.getDimensionPixelSize(3, -1);
        this.e[2] = obtainStyledAttributes.getDimensionPixelSize(5, -1);
        this.e[3] = obtainStyledAttributes.getDimensionPixelSize(4, -1);
        int length = this.e.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.e[i3] < 0.0f) {
                this.e[i3] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.e.length;
            for (int i4 = 0; i4 < length2; i4++) {
                this.e[i4] = dimensionPixelSize;
            }
        }
        this.h = obtainStyledAttributes.getDimensionPixelSize(6, -1);
        if (this.h < 0.0f) {
            this.h = 0.0f;
        }
        this.g = obtainStyledAttributes.getColorStateList(7);
        if (this.g == null) {
            this.g = ColorStateList.valueOf(-16777216);
        }
        this.n = obtainStyledAttributes.getBoolean(8, false);
        this.m = obtainStyledAttributes.getBoolean(9, false);
        int i5 = obtainStyledAttributes.getInt(10, -2);
        if (i5 != -2) {
            setTileModeX(a(i5));
            setTileModeY(a(i5));
        }
        int i6 = obtainStyledAttributes.getInt(11, -2);
        if (i6 != -2) {
            setTileModeX(a(i6));
        }
        int i7 = obtainStyledAttributes.getInt(12, -2);
        if (i7 != -2) {
            setTileModeY(a(i7));
        }
        c();
        a(true);
        if (this.n) {
            super.setBackgroundDrawable(this.f);
        }
        obtainStyledAttributes.recycle();
    }

    private static Shader.TileMode a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de8a8abaaf5542b301845e0bfaf824ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (Shader.TileMode) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de8a8abaaf5542b301845e0bfaf824ff");
        }
        switch (i) {
            case 0:
                return Shader.TileMode.CLAMP;
            case 1:
                return Shader.TileMode.REPEAT;
            case 2:
                return Shader.TileMode.MIRROR;
            default:
                return null;
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75fd88a132e76c0d2c9474d617479db4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75fd88a132e76c0d2c9474d617479db4");
            return;
        }
        super.drawableStateChanged();
        invalidate();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.q;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        Object[] objArr = {scaleType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ce6eee63232899d00700f1c25731894", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ce6eee63232899d00700f1c25731894");
        } else if (!c && scaleType == null) {
            throw new AssertionError();
        } else {
            if (this.q != scaleType) {
                this.q = scaleType;
                switch (AnonymousClass1.a[scaleType.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        super.setScaleType(ImageView.ScaleType.FIT_XY);
                        break;
                    default:
                        super.setScaleType(scaleType);
                        break;
                }
                c();
                a(false);
                invalidate();
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.platform.widget.roundview.RoundedImageView$1  reason: invalid class name */
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
                a[ImageView.ScaleType.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65f1878305fe566277c2388f69d90d82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65f1878305fe566277c2388f69d90d82");
            return;
        }
        this.o = 0;
        this.k = a.a(drawable);
        c();
        super.setImageDrawable(this.k);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "374f2b8d5f0953d45d0eef6da133d576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "374f2b8d5f0953d45d0eef6da133d576");
            return;
        }
        this.o = 0;
        this.k = a.a(bitmap);
        c();
        super.setImageDrawable(this.k);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "022579134d6c39774b0bac89e26fa1b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "022579134d6c39774b0bac89e26fa1b0");
        } else if (this.o != i) {
            this.o = i;
            this.k = a();
            c();
            super.setImageDrawable(this.k);
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ac5f37b2bbbc2f2afc183dce9a0de35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ac5f37b2bbbc2f2afc183dce9a0de35");
            return;
        }
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    private Drawable a() {
        Drawable drawable;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80b922846fc8eb0531cc29f26e135cc6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80b922846fc8eb0531cc29f26e135cc6");
        }
        Resources resources = getResources();
        if (resources == null) {
            return null;
        }
        if (this.o != 0) {
            try {
                drawable = resources.getDrawable(this.o);
            } catch (Exception unused) {
                this.o = 0;
            }
            return a.a(drawable);
        }
        drawable = null;
        return a.a(drawable);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e5abf63bcf42528875911b12ef305f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e5abf63bcf42528875911b12ef305f");
        } else {
            setBackgroundDrawable(drawable);
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.view.View
    public void setBackgroundResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cf9979740751b6a161629310fd6d8f35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cf9979740751b6a161629310fd6d8f35");
        } else if (this.p != i) {
            this.p = i;
            this.f = b();
            setBackgroundDrawable(this.f);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba488ab8079fa8dab8a70a71241e5f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba488ab8079fa8dab8a70a71241e5f22");
            return;
        }
        this.f = new ColorDrawable(i);
        setBackgroundDrawable(this.f);
    }

    private Drawable b() {
        Drawable drawable;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18532e9874058b7a541dcf8bae82676b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18532e9874058b7a541dcf8bae82676b");
        }
        Resources resources = getResources();
        if (resources == null) {
            return null;
        }
        if (this.p != 0) {
            try {
                drawable = resources.getDrawable(this.p);
            } catch (Exception unused) {
                this.p = 0;
            }
            return a.a(drawable);
        }
        drawable = null;
        return a.a(drawable);
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9e5f7a12ae0794d94ba6438ec7758c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9e5f7a12ae0794d94ba6438ec7758c1");
        } else {
            a(this.k, this.q);
        }
    }

    private void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67d0d2762ebedbf5dc34efbd188ed09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67d0d2762ebedbf5dc34efbd188ed09d");
        } else if (this.n) {
            if (z) {
                this.f = a.a(this.f);
            }
            a(this.f, ImageView.ScaleType.FIT_XY);
        }
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "424dce45d204fc60ec7582be8233a61c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "424dce45d204fc60ec7582be8233a61c");
        } else if (this.i != colorFilter) {
            this.i = colorFilter;
            this.l = true;
            this.j = true;
            d();
            invalidate();
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16d76aa8d15bd8c3c02e4124891afb4d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16d76aa8d15bd8c3c02e4124891afb4d");
        } else if (this.k == null || !this.j) {
        } else {
            this.k = this.k.mutate();
            if (this.l) {
                this.k.setColorFilter(this.i);
            }
        }
    }

    private void a(Drawable drawable, ImageView.ScaleType scaleType) {
        Object[] objArr = {drawable, scaleType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60124c988b830fad4a053aaf96c638aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60124c988b830fad4a053aaf96c638aa");
        } else if (drawable != null) {
            if (drawable instanceof a) {
                a aVar = (a) drawable;
                a a2 = aVar.a(scaleType).a(this.h).a(this.g);
                a2.b = this.m;
                a2.a(this.r).b(this.s);
                if (this.e != null) {
                    aVar.a(this.e[0], this.e[1], this.e[2], this.e[3]);
                }
                d();
            } else if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    a(layerDrawable.getDrawable(i), scaleType);
                }
            }
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.view.View
    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8548da107dbddb51d5b810b6d827046b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8548da107dbddb51d5b810b6d827046b");
            return;
        }
        this.f = drawable;
        a(true);
        super.setBackgroundDrawable(this.f);
    }

    public float getCornerRadius() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3294300087250552c79fc7f2fc502a0", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3294300087250552c79fc7f2fc502a0")).floatValue() : getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73a63d7e057de2780225e662ec108900", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73a63d7e057de2780225e662ec108900")).floatValue();
        }
        float f = 0.0f;
        for (float f2 : this.e) {
            f = Math.max(f2, f);
        }
        return f;
    }

    public void setCornerRadiusDimen(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f34428561da921f0ba7a03f3e663b9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f34428561da921f0ba7a03f3e663b9d");
            return;
        }
        float dimension = getResources().getDimension(i);
        a(dimension, dimension, dimension, dimension);
    }

    public void setCornerRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2405be7952dceb1bae337b04ac44a0d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2405be7952dceb1bae337b04ac44a0d9");
        } else {
            a(f, f, f, f);
        }
    }

    private void a(float f, float f2, float f3, float f4) {
        Object[] objArr = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84679e97dd2e497f7e07811aedc8bb14", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84679e97dd2e497f7e07811aedc8bb14");
        } else if (this.e[0] == f && this.e[1] == f2 && this.e[2] == f4 && this.e[3] == f3) {
        } else {
            this.e[0] = f;
            this.e[1] = f2;
            this.e[3] = f3;
            this.e[2] = f4;
            c();
            a(false);
            invalidate();
        }
    }

    public float getBorderWidth() {
        return this.h;
    }

    public void setBorderWidth(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1747b828adfd9db78a7ad401d08bbd3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1747b828adfd9db78a7ad401d08bbd3f");
        } else {
            setBorderWidth(getResources().getDimension(i));
        }
    }

    public void setBorderWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1a65e4d75e646576847c3b1190add029", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1a65e4d75e646576847c3b1190add029");
        } else if (this.h == f) {
        } else {
            this.h = f;
            c();
            a(false);
            invalidate();
        }
    }

    @ColorInt
    public int getBorderColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4778ca40e884e8408edb096618006118", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4778ca40e884e8408edb096618006118")).intValue() : this.g.getDefaultColor();
    }

    public void setBorderColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82796643484ad99528006c596c67467d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82796643484ad99528006c596c67467d");
        } else {
            setBorderColor(ColorStateList.valueOf(i));
        }
    }

    public ColorStateList getBorderColors() {
        return this.g;
    }

    public void setBorderColor(ColorStateList colorStateList) {
        Object[] objArr = {colorStateList};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aac9f655d5dbd04f950d68bf94f31ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aac9f655d5dbd04f950d68bf94f31ad");
        } else if (this.g.equals(colorStateList)) {
        } else {
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(-16777216);
            }
            this.g = colorStateList;
            c();
            a(false);
            if (this.h > 0.0f) {
                invalidate();
            }
        }
    }

    public void setOval(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3b3e28cf9ce43f3653ef05f1efe0ec2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3b3e28cf9ce43f3653ef05f1efe0ec2");
            return;
        }
        this.m = z;
        c();
        a(false);
        invalidate();
    }

    public Shader.TileMode getTileModeX() {
        return this.r;
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        Object[] objArr = {tileMode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b593a8c900d28de505ce0b4e57082817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b593a8c900d28de505ce0b4e57082817");
        } else if (this.r == tileMode) {
        } else {
            this.r = tileMode;
            c();
            a(false);
            invalidate();
        }
    }

    public Shader.TileMode getTileModeY() {
        return this.s;
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        Object[] objArr = {tileMode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64e014744ce709db1450f0f5ab49b989", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64e014744ce709db1450f0f5ab49b989");
        } else if (this.s == tileMode) {
        } else {
            this.s = tileMode;
            c();
            a(false);
            invalidate();
        }
    }
}

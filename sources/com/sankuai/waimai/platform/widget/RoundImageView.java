package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RoundImageView extends ImageView {
    public static ChangeQuickRedirect a;
    private static final ImageView.ScaleType b = ImageView.ScaleType.CENTER_CROP;
    private static final Bitmap.Config c = Bitmap.Config.ARGB_8888;
    private final RectF d;
    private final RectF e;
    private final Matrix f;
    private final Paint g;
    private final Paint h;
    private final Paint i;
    private int j;
    private int k;
    private int l;
    private Bitmap m;
    private BitmapShader n;
    private int o;
    private int p;
    private float q;
    private float r;
    private ColorFilter s;
    private boolean t;
    private boolean u;
    private boolean v;

    public RoundImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5acffa45be4077167e60869844485da7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5acffa45be4077167e60869844485da7");
            return;
        }
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Matrix();
        this.g = new Paint();
        this.h = new Paint();
        this.i = new Paint();
        this.j = -16777216;
        this.k = 0;
        this.l = 0;
        a();
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f03d281da61635817ab7f9db5516209e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f03d281da61635817ab7f9db5516209e");
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798ba183d75dbcb430e9d1e472c99d7f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798ba183d75dbcb430e9d1e472c99d7f");
            return;
        }
        this.d = new RectF();
        this.e = new RectF();
        this.f = new Matrix();
        this.g = new Paint();
        this.h = new Paint();
        this.i = new Paint();
        this.j = -16777216;
        this.k = 0;
        this.l = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.civ_border_width, R.attr.civ_border_color, R.attr.civ_border_overlay, R.attr.civ_fill_color}, i, 0);
        this.k = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.j = obtainStyledAttributes.getColor(1, -16777216);
        this.v = obtainStyledAttributes.getBoolean(2, false);
        this.l = obtainStyledAttributes.getColor(3, 0);
        obtainStyledAttributes.recycle();
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bc31f33c59d43a7540cf29957aedf5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bc31f33c59d43a7540cf29957aedf5b");
            return;
        }
        super.setScaleType(b);
        this.t = true;
        if (this.u) {
            b();
            this.u = false;
        }
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return b;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        Object[] objArr = {scaleType};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa836d3bc92c8b25b0ea0804c8521e10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa836d3bc92c8b25b0ea0804c8521e10");
        } else if (scaleType != b) {
            throw new IllegalArgumentException(String.format("ScaleType %s not supported.", scaleType));
        }
    }

    @Override // android.widget.ImageView
    public void setAdjustViewBounds(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "719cc4ed0636eee0434a9d2ad27e54e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "719cc4ed0636eee0434a9d2ad27e54e4");
        } else if (z) {
            throw new IllegalArgumentException("adjustViewBounds not supported.");
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fd635b2b12e1fe9fd6de54756989270", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fd635b2b12e1fe9fd6de54756989270");
        } else if (this.m == null) {
        } else {
            if (this.l != 0) {
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.q, this.i);
            }
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.q, this.g);
            if (this.k != 0) {
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, this.r, this.h);
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2379c35e7f5e18d3a4dcd06f45fe6817", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2379c35e7f5e18d3a4dcd06f45fe6817");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    public int getBorderColor() {
        return this.j;
    }

    public void setBorderColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "370b55b134ab0d1e3850167ce492bda2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "370b55b134ab0d1e3850167ce492bda2");
        } else if (i == this.j) {
        } else {
            this.j = i;
            this.h.setColor(this.j);
            invalidate();
        }
    }

    public void setBorderColorResource(@ColorRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c758d0852c836b7d40726cef3f2f8648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c758d0852c836b7d40726cef3f2f8648");
        } else {
            setBorderColor(getContext().getResources().getColor(i));
        }
    }

    public int getFillColor() {
        return this.l;
    }

    public void setFillColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c602157d312dc793660314e9057edbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c602157d312dc793660314e9057edbc");
        } else if (i == this.l) {
        } else {
            this.l = i;
            this.i.setColor(i);
            invalidate();
        }
    }

    public void setFillColorResource(@ColorRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35fca8d8aa4ee1e5cead5462a4c54187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35fca8d8aa4ee1e5cead5462a4c54187");
        } else {
            setFillColor(getContext().getResources().getColor(i));
        }
    }

    public int getBorderWidth() {
        return this.k;
    }

    public void setBorderWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8b25c872302f624cd41238012aae576", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8b25c872302f624cd41238012aae576");
        } else if (i == this.k) {
        } else {
            this.k = i;
            b();
        }
    }

    public void setBorderOverlay(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f3d35820adeb0ab6b058569b9e4c79f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f3d35820adeb0ab6b058569b9e4c79f");
        } else if (z == this.v) {
        } else {
            this.v = z;
            b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e458dc7a1995b2fdf635ffc67e376b84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e458dc7a1995b2fdf635ffc67e376b84");
            return;
        }
        super.setImageBitmap(bitmap);
        this.m = bitmap;
        b();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f44b80092cec6280dc151cd39c8acda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f44b80092cec6280dc151cd39c8acda");
            return;
        }
        super.setImageDrawable(drawable);
        this.m = a(drawable);
        b();
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c664ae3e1fce8d5b4ac4cdd3eb93dcaa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c664ae3e1fce8d5b4ac4cdd3eb93dcaa");
            return;
        }
        super.setImageResource(i);
        this.m = a(getDrawable());
        b();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47514cf25d4aa89415fa07050c66f8f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47514cf25d4aa89415fa07050c66f8f0");
            return;
        }
        super.setImageURI(uri);
        this.m = uri != null ? a(getDrawable()) : null;
        b();
    }

    @Override // android.widget.ImageView
    public void setColorFilter(ColorFilter colorFilter) {
        Object[] objArr = {colorFilter};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5525bc9ce9ff7f67bfc437ce95858752", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5525bc9ce9ff7f67bfc437ce95858752");
        } else if (colorFilter == this.s) {
        } else {
            this.s = colorFilter;
            this.g.setColorFilter(this.s);
            invalidate();
        }
    }

    private Bitmap a(Drawable drawable) {
        Bitmap createBitmap;
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fc90a5c695c6f7ca062a355d3f7dd4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bitmap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fc90a5c695c6f7ca062a355d3f7dd4e");
        }
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            if (drawable instanceof ColorDrawable) {
                createBitmap = Bitmap.createBitmap(2, 2, c);
            } else {
                createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), c);
            }
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e("RoundImageView", e.getMessage(), new Object[0]);
            return null;
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8413ec7f68862d7f2aa7e13e93d2af10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8413ec7f68862d7f2aa7e13e93d2af10");
        } else if (!this.t) {
            this.u = true;
        } else if (getWidth() == 0 && getHeight() == 0) {
        } else {
            if (this.m == null) {
                invalidate();
                return;
            }
            Bitmap bitmap = this.m;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.n = new BitmapShader(bitmap, tileMode, tileMode);
            this.g.setAntiAlias(true);
            this.g.setShader(this.n);
            this.h.setStyle(Paint.Style.STROKE);
            this.h.setAntiAlias(true);
            this.h.setColor(this.j);
            this.h.setStrokeWidth(this.k);
            this.i.setStyle(Paint.Style.FILL);
            this.i.setAntiAlias(true);
            this.i.setColor(this.l);
            this.p = this.m.getHeight();
            this.o = this.m.getWidth();
            this.e.set(0.0f, 0.0f, getWidth(), getHeight());
            this.r = Math.min((this.e.height() - this.k) / 2.0f, (this.e.width() - this.k) / 2.0f);
            this.d.set(this.e);
            if (!this.v) {
                this.d.inset(this.k, this.k);
            }
            this.q = Math.min(this.d.height() / 2.0f, this.d.width() / 2.0f);
            c();
            invalidate();
        }
    }

    private void c() {
        float width;
        float f;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b74b996ae039c16428f862cbc9da42a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b74b996ae039c16428f862cbc9da42a8");
            return;
        }
        this.f.set(null);
        float f2 = 0.0f;
        if (this.o * this.d.height() > this.d.width() * this.p) {
            width = this.d.height() / this.p;
            f = (this.d.width() - (this.o * width)) * 0.5f;
        } else {
            width = this.d.width() / this.o;
            f2 = (this.d.height() - (this.p * width)) * 0.5f;
            f = 0.0f;
        }
        this.f.setScale(width, width);
        this.f.postTranslate(((int) (f + 0.5f)) + this.d.left, ((int) (f2 + 0.5f)) + this.d.top);
        this.n.setLocalMatrix(this.f);
    }
}

package com.meituan.android.mrn.component.blurview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends View {
    public static ChangeQuickRedirect a;
    protected View b;
    private int c;
    private int d;
    private RenderScript e;
    private ScriptIntrinsicBlur f;
    private boolean g;
    private Bitmap h;
    private Runnable i;

    public a(ao aoVar) {
        this(aoVar, null);
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c203199fec5c9e9a10bff2d76240a7b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c203199fec5c9e9a10bff2d76240a7b7");
        }
    }

    private a(ao aoVar, AttributeSet attributeSet) {
        super(aoVar, null);
        Object[] objArr = {aoVar, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5715696bb4e60ce2ed656d88761f6b08", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5715696bb4e60ce2ed656d88761f6b08");
            return;
        }
        this.g = false;
        this.h = null;
        this.i = new Runnable() { // from class: com.meituan.android.mrn.component.blurview.a.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4825c6776f23f971d5df9ce095556094", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4825c6776f23f971d5df9ce095556094");
                    return;
                }
                a.this.a();
                a.this.invalidate();
            }
        };
        a(aoVar);
        setBlurRadius(15);
        setDownsampleFactor(8);
        setOverlayColor(-1426063361);
    }

    public final void setBlurredView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d38f134b60ab54e26e75cfdb19f7ee0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d38f134b60ab54e26e75cfdb19f7ee0");
            return;
        }
        this.b = view;
        b();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f40a37eb864b46ce25c93269a3c03f6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f40a37eb864b46ce25c93269a3c03f6");
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb5ec7d963bb77c716b695dfe059ad80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb5ec7d963bb77c716b695dfe059ad80");
            return;
        }
        super.onDraw(canvas);
        a(getContext());
        if (this.g) {
            return;
        }
        if (this.h == null) {
            post(this.i);
            return;
        }
        canvas.save();
        canvas.scale(this.c, this.c);
        canvas.drawBitmap(this.h, 0.0f, 0.0f, (Paint) null);
        canvas.restore();
        canvas.drawColor(this.d);
    }

    @SuppressLint({"NewApi"})
    public final void setBlurRadius(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e1cda9766d83b61245dc00fc7dc89fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e1cda9766d83b61245dc00fc7dc89fc");
            return;
        }
        this.f.setRadius(i);
        b();
    }

    public final void setDownsampleFactor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc1af206b6b835b2702e9509843cc37e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc1af206b6b835b2702e9509843cc37e");
        } else if (i <= 0) {
            throw new IllegalArgumentException("Downsample factor must be greater than 0.");
        } else {
            if (this.c != i) {
                this.c = i;
                b();
            }
        }
    }

    public final void setOverlayColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8581eee71529016a4c96dba4ccf8c814", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8581eee71529016a4c96dba4ccf8c814");
        } else if (this.d != i) {
            this.d = i;
            b();
        }
    }

    @SuppressLint({"NewApi"})
    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "307566c265717f9d3498f3934381e267", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "307566c265717f9d3498f3934381e267");
        } else if (this.e != null) {
        } else {
            this.e = RenderScript.create(context);
            this.f = ScriptIntrinsicBlur.create(this.e, Element.U8_4(this.e));
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90068a2824f02e3afe8df365fa6361c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90068a2824f02e3afe8df365fa6361c5");
            return;
        }
        if (this.h != null) {
            this.h.recycle();
            this.h = null;
        }
        postInvalidate();
    }

    @SuppressLint({"NewApi"})
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b3fb60ae8a20f343130d96ef9968b04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b3fb60ae8a20f343130d96ef9968b04");
        } else if (this.e == null) {
        } else {
            int width = getWidth();
            int height = getHeight();
            if (width <= 0 || height <= 0) {
                return;
            }
            if (this.b == null) {
                this.b = getRootView().findViewById(16908290);
            }
            if (this.b == null) {
                return;
            }
            this.h = Bitmap.createBitmap(width / this.c, height / this.c, Bitmap.Config.ARGB_8888);
            if (this.h == null) {
                return;
            }
            Canvas canvas = new Canvas(this.h);
            if (this.b instanceof ViewGroup) {
                Rect rect = new Rect();
                try {
                    ((ViewGroup) this.b).offsetDescendantRectToMyCoords(this, rect);
                    canvas.translate((-rect.left) / this.c, (-rect.top) / this.c);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
            canvas.scale(1.0f / this.c, 1.0f / this.c);
            Allocation createFromBitmap = Allocation.createFromBitmap(this.e, this.h, Allocation.MipmapControl.MIPMAP_NONE, 1);
            Allocation createTyped = Allocation.createTyped(this.e, createFromBitmap.getType());
            this.g = true;
            this.b.draw(canvas);
            this.g = false;
            createFromBitmap.copyFrom(this.h);
            this.f.setInput(createFromBitmap);
            this.f.forEach(createTyped);
            createTyped.copyTo(this.h);
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63b22c7aa20698e09b8b5d0f84fcb52e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63b22c7aa20698e09b8b5d0f84fcb52e");
            return;
        }
        super.onAttachedToWindow();
        b();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29ab3770d4a0d5e7dd59af014584c331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29ab3770d4a0d5e7dd59af014584c331");
            return;
        }
        super.onDetachedFromWindow();
        if (this.e != null) {
            this.e.destroy();
            this.e = null;
        }
    }
}

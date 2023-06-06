package com.github.chrisbanes.xdphotoview;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import com.github.chrisbanes.xdphotoview.l;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class PhotoView extends ImageView {
    private k a;
    private ImageView.ScaleType b;

    public PhotoView(Context context) {
        this(context, null);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a();
    }

    @TargetApi(21)
    public PhotoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a();
    }

    private void a() {
        this.a = new k(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        if (this.b != null) {
            setScaleType(this.b);
            this.b = null;
        }
    }

    public k getAttacher() {
        return this.a;
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.a.t;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.a.h;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.a.o = onLongClickListener;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.n = onClickListener;
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.a == null) {
            this.b = scaleType;
            return;
        }
        k kVar = this.a;
        boolean z = true;
        if (scaleType == null) {
            z = false;
        } else if (l.AnonymousClass1.a[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (!z || scaleType == kVar.t) {
            return;
        }
        kVar.t = scaleType;
        kVar.c();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.a != null) {
            this.a.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        if (this.a != null) {
            this.a.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.a != null) {
            this.a.c();
        }
    }

    @Override // android.widget.ImageView
    protected boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.a.c();
        }
        return frame;
    }

    public void setRotationTo(float f) {
        k kVar = this.a;
        kVar.i.setRotate(f % 360.0f);
        kVar.d();
    }

    public void setRotationBy(float f) {
        this.a.a(f);
    }

    public void setZoomable(boolean z) {
        k kVar = this.a;
        kVar.s = z;
        kVar.c();
    }

    public RectF getDisplayRect() {
        return this.a.a();
    }

    public float getMinimumScale() {
        return this.a.b;
    }

    public float getMediumScale() {
        return this.a.c;
    }

    public float getMaximumScale() {
        return this.a.d;
    }

    public float getScale() {
        return this.a.b();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.a.e = z;
    }

    public void setMinimumScale(float f) {
        k kVar = this.a;
        l.a(f, kVar.c, kVar.d);
        kVar.b = f;
    }

    public void setMediumScale(float f) {
        k kVar = this.a;
        l.a(kVar.b, f, kVar.d);
        kVar.c = f;
    }

    public void setMaximumScale(float f) {
        k kVar = this.a;
        l.a(kVar.b, kVar.c, f);
        kVar.d = f;
    }

    public void setOnMatrixChangeListener(d dVar) {
        this.a.j = dVar;
    }

    public void setOnPhotoTapListener(f fVar) {
        this.a.k = fVar;
    }

    public void setOnOutsidePhotoTapListener(e eVar) {
        this.a.l = eVar;
    }

    public void setOnViewTapListener(j jVar) {
        this.a.m = jVar;
    }

    public void setOnViewDragListener(i iVar) {
        this.a.r = iVar;
    }

    public void setScale(float f) {
        k kVar = this.a;
        kVar.a(f, kVar.f.getRight() / 2, kVar.f.getBottom() / 2, false);
    }

    public void setZoomTransitionDuration(int i) {
        this.a.a = i;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.a.g.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnScaleChangeListener(g gVar) {
        this.a.p = gVar;
    }

    public void setOnSingleFlingListener(h hVar) {
        this.a.q = hVar;
    }
}

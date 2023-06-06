package uk.co.senab.photoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import uk.co.senab.photoview.d;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public class PhotoView extends ImageView implements c {
    private d a;
    private ImageView.ScaleType b;

    public PhotoView(Context context) {
        this(context, null);
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        a();
    }

    private void a() {
        if (this.a == null || this.a.c() == null) {
            this.a = new d(this);
        }
        if (this.b != null) {
            setScaleType(this.b);
            this.b = null;
        }
    }

    public void setPhotoViewRotation(float f) {
        this.a.a(f);
    }

    public void setRotationTo(float f) {
        this.a.a(f);
    }

    public void setRotationBy(float f) {
        d dVar = this.a;
        dVar.h.postRotate(f % 360.0f);
        dVar.g();
    }

    public RectF getDisplayRect() {
        return this.a.b();
    }

    public Matrix getDisplayMatrix() {
        return new Matrix(this.a.f());
    }

    @Deprecated
    public float getMinScale() {
        return getMinimumScale();
    }

    public float getMinimumScale() {
        return this.a.c;
    }

    @Deprecated
    public float getMidScale() {
        return getMediumScale();
    }

    public float getMediumScale() {
        return this.a.d;
    }

    @Deprecated
    public float getMaxScale() {
        return getMaximumScale();
    }

    public float getMaximumScale() {
        return this.a.e;
    }

    public float getScale() {
        return this.a.d();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.a.n;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.a.f = z;
    }

    @Deprecated
    public void setMinScale(float f) {
        setMinimumScale(f);
    }

    public void setMinimumScale(float f) {
        d dVar = this.a;
        d.a(f, dVar.d, dVar.e);
        dVar.c = f;
    }

    @Deprecated
    public void setMidScale(float f) {
        setMediumScale(f);
    }

    public void setMediumScale(float f) {
        d dVar = this.a;
        d.a(dVar.c, f, dVar.e);
        dVar.d = f;
    }

    @Deprecated
    public void setMaxScale(float f) {
        setMaximumScale(f);
    }

    public void setMaximumScale(float f) {
        d dVar = this.a;
        d.a(dVar.c, dVar.d, f);
        dVar.e = f;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.a != null) {
            this.a.e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        if (this.a != null) {
            this.a.e();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.a != null) {
            this.a.e();
        }
    }

    public void setOnMatrixChangeListener(d.c cVar) {
        this.a.i = cVar;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.a.l = onLongClickListener;
    }

    public void setOnPhotoTapListener(d.InterfaceC1559d interfaceC1559d) {
        this.a.j = interfaceC1559d;
    }

    public d.InterfaceC1559d getOnPhotoTapListener() {
        return this.a.j;
    }

    public void setOnViewTapListener(d.f fVar) {
        this.a.k = fVar;
    }

    public d.f getOnViewTapListener() {
        return this.a.k;
    }

    public void setScale(float f) {
        d dVar = this.a;
        ImageView c = dVar.c();
        if (c != null) {
            dVar.a(f, c.getRight() / 2, c.getBottom() / 2, false);
        }
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.a != null) {
            d dVar = this.a;
            if (!d.a(scaleType) || scaleType == dVar.n) {
                return;
            }
            dVar.n = scaleType;
            dVar.e();
            return;
        }
        this.b = scaleType;
    }

    public void setZoomable(boolean z) {
        this.a.a(z);
    }

    public Bitmap getVisibleRectangleBitmap() {
        ImageView c = this.a.c();
        if (c == null) {
            return null;
        }
        return c.getDrawingCache();
    }

    public void setZoomTransitionDuration(int i) {
        d dVar = this.a;
        if (i < 0) {
            i = 200;
        }
        dVar.b = i;
    }

    public c getIPhotoViewImplementation() {
        return this.a;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        d dVar = this.a;
        if (onDoubleTapListener != null) {
            dVar.g.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            dVar.g.setOnDoubleTapListener(new b(dVar));
        }
    }

    public void setOnScaleChangeListener(d.e eVar) {
        this.a.m = eVar;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        this.a.a();
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        a();
        super.onAttachedToWindow();
    }
}

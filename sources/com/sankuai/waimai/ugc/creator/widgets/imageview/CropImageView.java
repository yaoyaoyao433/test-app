package com.sankuai.waimai.ugc.creator.widgets.imageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.ugc.creator.utils.h;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CropImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    public a b;

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public CropImageView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3215bb8532c30973e9f83f46352b6a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3215bb8532c30973e9f83f46352b6a6");
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50798f12f85c6f9a30869a82e126ef3b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50798f12f85c6f9a30869a82e126ef3b");
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a955c8d7044903b4d6de2db26768640", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a955c8d7044903b4d6de2db26768640");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a5aeb26406a462a87a5337f5ee8e68e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a5aeb26406a462a87a5337f5ee8e68e8");
            return;
        }
        this.b = new a(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5c86a29aecdce6e11e1213e7ffcc6d55", RobustBitConfig.DEFAULT_VALUE) ? (ImageView.ScaleType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5c86a29aecdce6e11e1213e7ffcc6d55") : this.b.q;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d518f75c8a4fefb1a846f3016f54ac85", RobustBitConfig.DEFAULT_VALUE) ? (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d518f75c8a4fefb1a846f3016f54ac85") : this.b.e;
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        Object[] objArr = {onLongClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7afd65337f72dcef098ee8aacd04e806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7afd65337f72dcef098ee8aacd04e806");
        } else {
            this.b.p = onLongClickListener;
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        Object[] objArr = {onClickListener};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dba5152155836a8515de6c80dc39d600", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dba5152155836a8515de6c80dc39d600");
        } else {
            this.b.o = onClickListener;
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b7ac2283c6619bc239262d6f6b1cf50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b7ac2283c6619bc239262d6f6b1cf50");
            return;
        }
        super.setImageBitmap(bitmap);
        if (this.b != null) {
            this.b.t = bitmap;
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85dbcfdeede1d71bdb1f66f0d719a435", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85dbcfdeede1d71bdb1f66f0d719a435");
            return;
        }
        super.setImageDrawable(drawable);
        if (this.b != null) {
            this.b.b();
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e6804d0cf325a572837928acf36e34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e6804d0cf325a572837928acf36e34");
            return;
        }
        super.setImageResource(i);
        if (this.b != null) {
            this.b.b();
        }
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6b4483a8fa0093ab364363ccf682a54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6b4483a8fa0093ab364363ccf682a54");
            return;
        }
        super.setImageURI(uri);
        if (this.b != null) {
            this.b.b();
        }
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f21d760571ab95c426f29d3300129bd6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f21d760571ab95c426f29d3300129bd6")).booleanValue();
        }
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.b.b();
        }
        return frame;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7c230befaa4aab67bdd7d11eb8c3997", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7c230befaa4aab67bdd7d11eb8c3997");
            return;
        }
        super.onDraw(canvas);
        a aVar = this.b;
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "1799a3101ab87f78484f6446fb680b7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "1799a3101ab87f78484f6446fb680b7d");
        } else if (aVar.g != null) {
            int g = aVar.g();
            int h = aVar.h();
            float f = aVar.g.left;
            float f2 = aVar.g.top;
            float f3 = aVar.g.right;
            float f4 = aVar.g.bottom;
            float width = aVar.g.width();
            float height = aVar.g.height();
            canvas.save();
            aVar.m.reset();
            aVar.m.addRect(f, f2, f3, f4, Path.Direction.CCW);
            aVar.n.reset();
            aVar.n.setColor(aVar.i);
            if (Build.VERSION.SDK_INT >= 28) {
                canvas.clipOutPath(aVar.m);
            } else {
                canvas.clipPath(aVar.m, Region.Op.XOR);
            }
            canvas.drawRect(0.0f, 0.0f, g, h, aVar.n);
            canvas.restore();
            aVar.n.reset();
            aVar.n.setStyle(Paint.Style.STROKE);
            aVar.n.setAntiAlias(true);
            aVar.n.setColor(aVar.j);
            aVar.n.setStrokeWidth(aVar.k);
            canvas.drawRect(f + (aVar.k / 2.0f), f2 + (aVar.k / 2.0f), f3 - (aVar.k / 2.0f), f4 - (aVar.k / 2.0f), aVar.n);
            if (aVar.r) {
                aVar.n.reset();
                aVar.n.setColor(aVar.j);
                aVar.n.setStrokeWidth(aVar.l);
                float f5 = f2 + (height / 3.0f);
                canvas.drawLine(f, f5, f3, f5, aVar.n);
                float f6 = f2 + ((height * 2.0f) / 3.0f);
                canvas.drawLine(f, f6, f3, f6, aVar.n);
                float f7 = f + (width / 3.0f);
                canvas.drawLine(f7, f2, f7, f4, aVar.n);
                float f8 = f + ((width * 2.0f) / 3.0f);
                canvas.drawLine(f8, f2, f8, f4, aVar.n);
            }
        }
    }

    public float[] getSuppMatrixValues() {
        Matrix matrix;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb80f706dfc44256c4240f7c428aa376", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb80f706dfc44256c4240f7c428aa376");
        }
        a aVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "6b6f82d02c0230edc09f7561f63bd1c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "6b6f82d02c0230edc09f7561f63bd1c3");
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "33a45da7e52f3b9118e9497c028d75e6", RobustBitConfig.DEFAULT_VALUE)) {
            matrix = (Matrix) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "33a45da7e52f3b9118e9497c028d75e6");
        } else {
            Matrix matrix2 = new Matrix();
            Object[] objArr4 = {matrix2};
            ChangeQuickRedirect changeQuickRedirect4 = a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "9f6ab0e9dbf6a69c0d2d24cadf0f71af", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "9f6ab0e9dbf6a69c0d2d24cadf0f71af");
            } else {
                matrix2.set(aVar.d);
            }
            matrix = matrix2;
        }
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr;
    }

    public Matrix getDisplayMatrix() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d1355c26b761bd533cb677fa7c1afbe", RobustBitConfig.DEFAULT_VALUE) ? (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d1355c26b761bd533cb677fa7c1afbe") : this.b.c();
    }

    public void setDisplayMatrix(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d690e9dc584b25acb0f2199afb97604", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d690e9dc584b25acb0f2199afb97604");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "2307b4d040e2c0e702cd6cdcc9f1eb91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "2307b4d040e2c0e702cd6cdcc9f1eb91");
        } else if (matrix == null || aVar.b.getDrawable() == null) {
        } else {
            aVar.d.set(matrix);
            aVar.d();
        }
    }

    public float getScale() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e57e18845e9dfaa8e39cc57051f35c73", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e57e18845e9dfaa8e39cc57051f35c73")).floatValue() : this.b.a();
    }

    public void setCropBoundsRatio(float f) {
        RectF rectF;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3503ab1a66f666cb645d6777236be40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3503ab1a66f666cb645d6777236be40");
            return;
        }
        a aVar = this.b;
        Object[] objArr2 = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "f53c2e2206c610ff429fd4619a690f68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "f53c2e2206c610ff429fd4619a690f68");
            return;
        }
        RectF f2 = aVar.f();
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "b2db3ab3289e7213ab03e577a4261e34", RobustBitConfig.DEFAULT_VALUE)) {
            rectF = (RectF) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "b2db3ab3289e7213ab03e577a4261e34");
        } else {
            Drawable drawable = aVar.b.getDrawable();
            if (drawable != null) {
                aVar.f.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                aVar.c.mapRect(aVar.f);
                rectF = aVar.f;
            } else {
                rectF = null;
            }
        }
        if (aVar.g != null && f2 != null && rectF != null && h.a(aVar.g.centerX(), f2.centerX()) && h.a(aVar.g.centerY(), f2.centerY()) && (h.a(aVar.g.width(), f2.width()) || h.a(aVar.g.height(), f2.height()) || h.a(rectF.width(), f2.width()) || h.a(rectF.height(), f2.height()))) {
            aVar.a(f, false, true);
        } else {
            aVar.a(f);
        }
        aVar.d();
    }

    public float getCropBoundsRatio() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cf06b8a019865f42644498a82cc8925", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cf06b8a019865f42644498a82cc8925")).floatValue() : this.b.h;
    }

    public float[] getImageAreaInBounds() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7be7ec84a4268063a83068f31527c44c", RobustBitConfig.DEFAULT_VALUE) ? (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7be7ec84a4268063a83068f31527c44c") : this.b.i();
    }

    public final void a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a73c71ea2516cedc7d3a0d1e016d78ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a73c71ea2516cedc7d3a0d1e016d78ed");
        } else {
            this.b.a(cVar);
        }
    }
}

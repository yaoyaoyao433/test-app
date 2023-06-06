package com.meituan.android.identifycardrecognizer.widgets.rotate;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.media.ThumbnailUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RotateImageView extends TwoStateImageView {
    public static ChangeQuickRedirect a;
    private int c;
    private int d;
    private int e;
    private boolean f;
    private boolean g;
    private long h;
    private long i;
    private Bitmap j;
    private Drawable[] k;
    private TransitionDrawable l;

    public RotateImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fe774c16f089e3360618f2ece4fb9df", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fe774c16f089e3360618f2ece4fb9df");
            return;
        }
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = false;
        this.g = true;
        this.h = 0L;
        this.i = 0L;
    }

    public RotateImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07de796a6be220f9e0c0904079677553", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07de796a6be220f9e0c0904079677553");
            return;
        }
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = false;
        this.g = true;
        this.h = 0L;
        this.i = 0L;
    }

    public int getDegree() {
        return this.e;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "adb6d54854c2502213dfda18c2708ae2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "adb6d54854c2502213dfda18c2708ae2");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        Rect bounds = drawable.getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        if (i == 0 || i2 == 0) {
            return;
        }
        if (this.c != this.e) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis < this.i) {
                int i3 = (int) (currentAnimationTimeMillis - this.h);
                int i4 = this.d;
                if (!this.f) {
                    i3 = -i3;
                }
                int i5 = i4 + ((i3 * 270) / 1000);
                this.c = i5 >= 0 ? i5 % 360 : (i5 % 360) + 360;
                invalidate();
            } else {
                this.c = this.e;
            }
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int width = (getWidth() - paddingLeft) - paddingRight;
        int height = (getHeight() - paddingTop) - paddingBottom;
        int saveCount = canvas.getSaveCount();
        if (getScaleType() == ImageView.ScaleType.FIT_CENTER && (width < i || height < i2)) {
            float f = width;
            float f2 = height;
            float min = Math.min(f / i, f2 / i2);
            canvas.scale(min, min, f / 2.0f, f2 / 2.0f);
        }
        canvas.translate(paddingLeft + (width / 2), paddingTop + (height / 2));
        canvas.rotate(-this.c);
        canvas.translate((-i) / 2.0f, (-i2) / 2.0f);
        drawable.draw(canvas);
        canvas.restoreToCount(saveCount);
    }

    public void setBitmap(Bitmap bitmap) {
        Object[] objArr = {bitmap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "330a0114bba23278554e8cb9ec4da2c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "330a0114bba23278554e8cb9ec4da2c1");
        } else if (bitmap == null) {
            this.j = null;
            this.k = null;
            setImageDrawable(null);
            setVisibility(8);
        } else {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            StringBuilder sb = new StringBuilder("param.width = ");
            sb.append(layoutParams.width);
            sb.append(" getPaddingLeft() = ");
            sb.append(getPaddingLeft());
            sb.append(" getPaddingRight()");
            sb.append(getPaddingRight());
            this.j = ThumbnailUtils.extractThumbnail(bitmap, 400, 400);
            if (this.k == null || !this.g) {
                this.k = new Drawable[2];
                this.k[1] = new BitmapDrawable(getContext().getResources(), this.j);
                setImageDrawable(this.k[1]);
            } else {
                this.k[0] = this.k[1];
                this.k[1] = new BitmapDrawable(getContext().getResources(), this.j);
                this.l = new TransitionDrawable(this.k);
                setImageDrawable(this.l);
                this.l.startTransition(500);
            }
            setVisibility(0);
        }
    }
}

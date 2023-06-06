package com.meituan.android.common.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RoundFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int borderColor;
    private Paint borderPaint;
    private RectF borderRect;
    private int borderWidth;
    private boolean hasBorder;
    private Path path;
    private int radius;
    private RectF rect;

    public RoundFrameLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0f45d5222d82c80b9bad69576e2e3670", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0f45d5222d82c80b9bad69576e2e3670");
            return;
        }
        this.hasBorder = true;
        this.borderWidth = 1;
        this.borderColor = 1082097535;
        this.radius = 10;
        initAttrs(null);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0c0a65eab0c2bd3ae47502966c5fe3e0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0c0a65eab0c2bd3ae47502966c5fe3e0");
            return;
        }
        this.hasBorder = true;
        this.borderWidth = 1;
        this.borderColor = 1082097535;
        this.radius = 10;
        initAttrs(attributeSet);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b38bdc99dd40ce42a5b439b044b5aebd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b38bdc99dd40ce42a5b439b044b5aebd");
            return;
        }
        this.hasBorder = true;
        this.borderWidth = 1;
        this.borderColor = 1082097535;
        this.radius = 10;
        initAttrs(attributeSet);
    }

    private void initAttrs(AttributeSet attributeSet) {
        Object[] objArr = {attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bda15bfae3b154e8b4fc7e36b2a242e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bda15bfae3b154e8b4fc7e36b2a242e5");
            return;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.borderWidth = (int) TypedValue.applyDimension(1, this.borderWidth, displayMetrics);
        this.radius = (int) TypedValue.applyDimension(1, this.radius, displayMetrics);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.rfl_radius, R.attr.rfl_border, R.attr.rfl_borderWidth, R.attr.rfl_borderColor});
        this.radius = obtainStyledAttributes.getDimensionPixelSize(0, this.radius);
        this.borderWidth = obtainStyledAttributes.getDimensionPixelOffset(2, this.borderWidth);
        this.hasBorder = obtainStyledAttributes.getBoolean(1, this.hasBorder);
        this.borderColor = obtainStyledAttributes.getColor(3, this.borderColor);
        obtainStyledAttributes.recycle();
        this.rect = new RectF();
        this.borderRect = new RectF();
        this.path = new Path();
        this.borderPaint = new Paint();
        this.borderPaint.setAntiAlias(true);
        this.borderPaint.setStyle(Paint.Style.STROKE);
        update();
    }

    private void update() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b4f9b6d8966f9617a044b80eb018533", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b4f9b6d8966f9617a044b80eb018533");
            return;
        }
        this.borderPaint.setColor(this.borderColor);
        this.borderPaint.setStrokeWidth(this.borderWidth);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "885ef9dc05676a28f4f1beb9258f34a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "885ef9dc05676a28f4f1beb9258f34a8");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.rect.left = 0.0f;
        this.rect.top = 0.0f;
        this.rect.bottom = i2;
        this.rect.right = i;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72c35f9d7a492c62ed80e89c458c6903", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72c35f9d7a492c62ed80e89c458c6903");
            return;
        }
        this.path.reset();
        this.path.addRoundRect(this.rect, this.radius, this.radius, Path.Direction.CW);
        int save = canvas.save();
        canvas.clipPath(this.path);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8849e6b41f6778b779b079c82eb23528", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8849e6b41f6778b779b079c82eb23528");
            return;
        }
        this.path.reset();
        this.path.addRoundRect(this.rect, this.radius, this.radius, Path.Direction.CW);
        int save = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
        if (this.hasBorder) {
            this.borderRect.left = this.rect.left + (this.borderWidth / 2.0f);
            this.borderRect.top = this.rect.top + (this.borderWidth / 2.0f);
            this.borderRect.right = this.rect.right - (this.borderWidth / 2.0f);
            this.borderRect.bottom = this.rect.bottom - (this.borderWidth / 2.0f);
            canvas.drawRoundRect(this.borderRect, this.radius, this.radius, this.borderPaint);
        }
    }

    public void setHasBorder(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dec7f0d0ac9cefa5b85778e773504e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dec7f0d0ac9cefa5b85778e773504e7");
            return;
        }
        this.hasBorder = z;
        postInvalidate();
    }

    public void setBorderWidth(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a3c21c85d91770fb3a8e0b028334984", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a3c21c85d91770fb3a8e0b028334984");
            return;
        }
        this.borderWidth = i;
        update();
        postInvalidate();
    }

    public void setBorderColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "356721e30bf28653c153eccee7ebe586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "356721e30bf28653c153eccee7ebe586");
            return;
        }
        this.borderColor = i;
        update();
        postInvalidate();
    }

    public void setRadius(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "883ca9a08516187c9bd799557107ff01", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "883ca9a08516187c9bd799557107ff01");
            return;
        }
        this.radius = i;
        postInvalidate();
    }
}

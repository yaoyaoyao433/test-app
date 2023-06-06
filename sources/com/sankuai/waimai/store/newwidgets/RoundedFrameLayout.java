package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RoundedFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    private Paint b;
    private Paint c;
    private float d;
    private float e;
    private float f;
    private float g;
    private Path h;
    private RectF i;

    public RoundedFrameLayout(Context context) {
        this(context, (AttributeSet) null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dc03c7f2e072d29eab45940be31290f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dc03c7f2e072d29eab45940be31290f");
        }
    }

    public RoundedFrameLayout(Context context, float f) {
        this(context, (AttributeSet) null);
        Object[] objArr = {context, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02b415de659884f75d4b89aed57e7956", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02b415de659884f75d4b89aed57e7956");
            return;
        }
        this.d = f;
        this.e = f;
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c532d13e176201e9dda6b2fbc0d5b4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c532d13e176201e9dda6b2fbc0d5b4a");
        }
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0c1b3776be6ad8e732a19b6fb66c8d7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0c1b3776be6ad8e732a19b6fb66c8d7");
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.borderColor, R.attr.borderWidth, R.attr.cornerRadius, R.attr.ratio, R.attr.topLeftCornerRadius, R.attr.topRightCornerRadius, R.attr.bottomLeftCornerRadius, R.attr.bottomRightCornerRadius});
            float dimension = obtainStyledAttributes.getDimension(2, 0.0f);
            this.d = obtainStyledAttributes.getDimension(4, dimension);
            this.e = obtainStyledAttributes.getDimension(5, dimension);
            this.f = obtainStyledAttributes.getDimension(6, dimension);
            this.g = obtainStyledAttributes.getDimension(7, dimension);
            obtainStyledAttributes.recycle();
        }
        this.b = new Paint();
        this.b.setColor(-1);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.c = new Paint();
        this.c.setXfermode(null);
        this.h = new Path();
        this.i = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66a15c1982ea537e2773da04780f1238", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66a15c1982ea537e2773da04780f1238");
            return;
        }
        canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), this.c, 31);
        super.dispatchDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.d > 0.0f) {
            this.h.moveTo(0.0f, this.d);
            this.h.lineTo(0.0f, 0.0f);
            this.h.lineTo(this.d, 0.0f);
            this.i.set(0.0f, 0.0f, this.d * 2.0f, this.d * 2.0f);
            this.h.arcTo(this.i, -90.0f, -90.0f);
            this.h.close();
            canvas.drawPath(this.h, this.b);
        }
        if (this.e > 0.0f) {
            float f = width;
            this.h.moveTo(f - this.e, 0.0f);
            this.h.lineTo(f, 0.0f);
            this.h.lineTo(f, this.e);
            this.i.set(f - (this.e * 2.0f), 0.0f, f, this.e * 2.0f);
            this.h.arcTo(this.i, 0.0f, -90.0f);
            this.h.close();
            canvas.drawPath(this.h, this.b);
        }
        if (this.f > 0.0f) {
            float f2 = height;
            this.h.moveTo(0.0f, f2 - this.f);
            this.h.lineTo(0.0f, f2);
            this.h.lineTo(this.f, f2);
            this.i.set(0.0f, f2 - (this.f * 2.0f), this.f * 2.0f, f2);
            this.h.arcTo(this.i, 90.0f, 90.0f);
            this.h.close();
            canvas.drawPath(this.h, this.b);
        }
        if (this.g > 0.0f) {
            float f3 = width;
            float f4 = height;
            this.h.moveTo(f3 - this.g, f4);
            this.h.lineTo(f3, f4);
            this.h.lineTo(f3, f4 - this.g);
            this.i.set(f3 - (this.g * 2.0f), f4 - (this.g * 2.0f), f3, f4);
            this.h.arcTo(this.i, 0.0f, 90.0f);
            this.h.close();
            canvas.drawPath(this.h, this.b);
        }
        canvas.restore();
    }
}

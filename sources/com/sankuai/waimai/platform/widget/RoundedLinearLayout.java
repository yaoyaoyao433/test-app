package com.sankuai.waimai.platform.widget;

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
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public class RoundedLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private Paint b;
    private Paint c;
    private float d;
    private float e;
    private float f;
    private float g;
    private boolean h;
    private Path i;
    private RectF j;

    public RoundedLinearLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26cbb73a1fa334dc5730765fca1f2c9b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26cbb73a1fa334dc5730765fca1f2c9b");
        }
    }

    public RoundedLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa40f0310a10b0ffdd364afbcce1b43a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa40f0310a10b0ffdd364afbcce1b43a");
        }
    }

    public RoundedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e478b687b58b21e5b150464cc4c485cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e478b687b58b21e5b150464cc4c485cb");
            return;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.cornerRadius, R.attr.topLeftCornerRadius, R.attr.topRightCornerRadius, R.attr.bottomLeftCornerRadius, R.attr.bottomRightCornerRadius, R.attr.cropBackground});
            float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
            this.d = obtainStyledAttributes.getDimension(1, dimension);
            this.e = obtainStyledAttributes.getDimension(2, dimension);
            this.f = obtainStyledAttributes.getDimension(3, dimension);
            this.g = obtainStyledAttributes.getDimension(4, dimension);
            this.h = obtainStyledAttributes.getBoolean(5, false);
            obtainStyledAttributes.recycle();
        }
        this.b = new Paint();
        this.b.setColor(-1);
        this.b.setAntiAlias(true);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.c = new Paint();
        this.c.setXfermode(null);
        this.i = new Path();
        this.j = new RectF();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z = true;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7893d4b3895ebfae109d76818029b27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7893d4b3895ebfae109d76818029b27");
            return;
        }
        this.i.reset();
        if (!this.h || getBackground() == null) {
            canvas.saveLayer(new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight()), this.c, 31);
        } else {
            z = false;
        }
        super.dispatchDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.d > 0.0f) {
            this.i.moveTo(0.0f, this.d);
            this.i.lineTo(0.0f, 0.0f);
            this.i.lineTo(this.d, 0.0f);
            this.j.set(0.0f, 0.0f, this.d * 2.0f, this.d * 2.0f);
            this.i.arcTo(this.j, -90.0f, -90.0f);
            this.i.close();
            canvas.drawPath(this.i, this.b);
        }
        if (this.e > 0.0f) {
            float f = width;
            this.i.moveTo(f - this.e, 0.0f);
            this.i.lineTo(f, 0.0f);
            this.i.lineTo(f, this.e);
            this.j.set(f - (this.e * 2.0f), 0.0f, f, this.e * 2.0f);
            this.i.arcTo(this.j, 0.0f, -90.0f);
            this.i.close();
            canvas.drawPath(this.i, this.b);
        }
        if (this.f > 0.0f) {
            float f2 = height;
            this.i.moveTo(0.0f, f2 - this.f);
            this.i.lineTo(0.0f, f2);
            this.i.lineTo(this.f, f2);
            this.j.set(0.0f, f2 - (this.f * 2.0f), this.f * 2.0f, f2);
            this.i.arcTo(this.j, 90.0f, 90.0f);
            this.i.close();
            canvas.drawPath(this.i, this.b);
        }
        if (this.g > 0.0f) {
            float f3 = width;
            float f4 = height;
            this.i.moveTo(f3 - this.g, f4);
            this.i.lineTo(f3, f4);
            this.i.lineTo(f3, f4 - this.g);
            this.j.set(f3 - (this.g * 2.0f), f4 - (this.g * 2.0f), f3, f4);
            this.i.arcTo(this.j, 0.0f, 90.0f);
            this.i.close();
            canvas.drawPath(this.i, this.b);
        }
        if (z) {
            canvas.restore();
        }
    }
}

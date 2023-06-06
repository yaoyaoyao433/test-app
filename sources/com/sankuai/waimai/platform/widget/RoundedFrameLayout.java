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
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes5.dex */
public class RoundedFrameLayout extends FrameLayout {
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

    public RoundedFrameLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29929e137fcf46d54516965a39a5f8cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29929e137fcf46d54516965a39a5f8cb");
        }
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e4233fcb77dbb377baeed27eb225994", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e4233fcb77dbb377baeed27eb225994");
        }
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25e72443ebb11dd812dd57af8fc4fdef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25e72443ebb11dd812dd57af8fc4fdef");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "172e920757589beb3f6ee764e1c7e33b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "172e920757589beb3f6ee764e1c7e33b");
            return;
        }
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

    public final void a(int i, int i2, int i3, int i4) {
        Object[] objArr = {38, 38, 38, 38};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5ab608c2fe36d3d1e2c4d778a7c540b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5ab608c2fe36d3d1e2c4d778a7c540b");
        } else {
            b(g.a(getContext(), 38.0f), g.a(getContext(), 38.0f), g.a(getContext(), 38.0f), g.a(getContext(), 38.0f));
        }
    }

    public final void b(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b782b772f14e10f4b19321434ff71342", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b782b772f14e10f4b19321434ff71342");
            return;
        }
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }
}

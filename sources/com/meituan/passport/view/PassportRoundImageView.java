package com.meituan.passport.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PassportRoundImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private RectF f;
    private RectF g;
    private Paint h;
    private Path i;

    public PassportRoundImageView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "938e9076c7e824f12a8dbe25fe108d76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "938e9076c7e824f12a8dbe25fe108d76");
            return;
        }
        this.b = 1;
        this.c = -986896;
        this.d = 0;
        this.e = true;
        a(context, null, 0, 0);
    }

    public PassportRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f078c67d6eb52a49158bd66c2260e98", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f078c67d6eb52a49158bd66c2260e98");
            return;
        }
        this.b = 1;
        this.c = -986896;
        this.d = 0;
        this.e = true;
        a(context, attributeSet, i, 0);
    }

    private void a(Context context, AttributeSet attributeSet, int i, int i2) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7679c02bcd91878f4e4aec65bad38d62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7679c02bcd91878f4e4aec65bad38d62");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.passport_riv_borderWidth, R.attr.passport_riv_borderColor, R.attr.passport_riv_border, R.attr.passport_riv_radius}, i, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, this.b);
        this.c = obtainStyledAttributes.getColor(1, this.c);
        this.d = obtainStyledAttributes.getDimensionPixelSize(3, this.d);
        this.e = obtainStyledAttributes.getBoolean(2, this.e);
        obtainStyledAttributes.recycle();
        this.i = new Path();
        this.f = new RectF();
        this.g = new RectF();
        this.h = new Paint();
    }

    public void setRadius(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e428ae231109ff900d87be3d47849af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e428ae231109ff900d87be3d47849af");
            return;
        }
        this.d = i;
        invalidate();
    }

    public void setHasBorder(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04e9f4cc092c59fa202ff8dd1ccc706a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04e9f4cc092c59fa202ff8dd1ccc706a");
            return;
        }
        this.e = z;
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c780d7cdfa1e233bfe4e13febb469a34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c780d7cdfa1e233bfe4e13febb469a34");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (i == i3 && i2 == i4) {
            return;
        }
        this.f.left = 0.0f;
        this.f.top = 0.0f;
        this.f.bottom = i2;
        this.f.right = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a8f5e230f1919ab9d7fdca1922365b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a8f5e230f1919ab9d7fdca1922365b0");
            return;
        }
        int save = canvas.save();
        this.i.reset();
        this.i.addRoundRect(this.f, this.d, this.d, Path.Direction.CW);
        canvas.clipPath(this.i);
        super.onDraw(canvas);
        if (this.e) {
            this.g.left = this.f.left + (this.b / 2.0f);
            this.g.top = this.f.top + (this.b / 2.0f);
            this.g.right = this.f.right - (this.b / 2.0f);
            this.g.bottom = this.f.bottom - (this.b / 2.0f);
            this.h.setColor(this.c);
            this.h.setStyle(Paint.Style.STROKE);
            this.h.setStrokeWidth(this.b);
            canvas.drawRoundRect(this.g, this.d, this.d, this.h);
        }
        canvas.restoreToCount(save);
    }
}

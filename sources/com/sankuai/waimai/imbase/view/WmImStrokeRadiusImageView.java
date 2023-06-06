package com.sankuai.waimai.imbase.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WmImStrokeRadiusImageView extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    private int b;
    private Paint c;
    private int d;
    private int e;
    private RectF f;
    private PorterDuffXfermode g;
    private RectF h;
    private Path i;
    private Path j;

    public WmImStrokeRadiusImageView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b52977a12b411f2928bd77d2033d762", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b52977a12b411f2928bd77d2033d762");
        }
    }

    public WmImStrokeRadiusImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6bc06942c279e18ca84d77c8f36bd4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6bc06942c279e18ca84d77c8f36bd4");
        }
    }

    public WmImStrokeRadiusImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b93bf2e920079882af3f3b85bb03d2c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b93bf2e920079882af3f3b85bb03d2c");
            return;
        }
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dfac5884893e44f1d1e22ec3b061df39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dfac5884893e44f1d1e22ec3b061df39");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.strokeColor, R.attr.strokeWidth, R.attr.radius});
        if (obtainStyledAttributes != null) {
            this.d = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            this.b = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            this.e = obtainStyledAttributes.getColor(0, Color.parseColor("#e4e4e4"));
            obtainStyledAttributes.recycle();
        }
        this.c = new Paint();
        this.c.setAntiAlias(true);
        this.c.setDither(true);
        this.f = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        if (Build.VERSION.SDK_INT <= 26) {
            this.g = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.g = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.j = new Path();
        }
        this.h = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.i = new Path();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ae69c80c7c71c5008f9f57c487d7f35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ae69c80c7c71c5008f9f57c487d7f35");
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = measuredWidth;
        this.f.right = f;
        float f2 = measuredHeight;
        this.f.bottom = f2;
        int saveLayer = canvas.saveLayer(this.f, this.c, 31);
        super.onDraw(canvas);
        if (this.b > 0) {
            this.c.setStyle(Paint.Style.FILL);
            this.c.setXfermode(this.g);
            this.i.reset();
            if (Build.VERSION.SDK_INT <= 26) {
                this.i.addRoundRect(this.f, this.b, this.b, Path.Direction.CCW);
            } else {
                this.j.reset();
                this.j.addRoundRect(this.f, this.b, this.b, Path.Direction.CCW);
                this.i.addRect(this.f, Path.Direction.CW);
                this.i.op(this.j, Path.Op.DIFFERENCE);
            }
            canvas.drawPath(this.i, this.c);
            this.c.setXfermode(null);
        }
        canvas.restoreToCount(saveLayer);
        if (this.d <= 0 || this.b < 0) {
            return;
        }
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setColor(this.e);
        this.h.right = f;
        this.h.bottom = f2;
        canvas.drawRoundRect(this.h, this.b, this.b, this.c);
    }
}

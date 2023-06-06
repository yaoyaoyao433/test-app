package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static final boolean c;
    public float b;
    private View d;
    private Path e;
    private float f;
    private int g;
    private int h;
    private Paint i;
    private Paint j;

    public b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40ea7aee07761d7aea22c0984f5f9f26", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40ea7aee07761d7aea22c0984f5f9f26");
        } else {
            this.d = view;
        }
    }

    public final void a(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b65cf7b5e543fa20fc307a17f6433c44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b65cf7b5e543fa20fc307a17f6433c44");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.borderColor, R.attr.borderWidth, R.attr.cornerRadius, R.attr.ratio});
        this.f = obtainStyledAttributes.getDimension(2, 0.0f);
        this.g = obtainStyledAttributes.getColor(0, 0);
        this.h = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.b = obtainStyledAttributes.getFloat(3, 0.0f);
        obtainStyledAttributes.recycle();
        this.d.setWillNotDraw(false);
        if (c) {
            this.d.setClipToOutline(true);
            this.d.setOutlineProvider(new ViewOutlineProvider() { // from class: com.sankuai.waimai.platform.widget.b.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    Object[] objArr2 = {view, outline};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9a4764aa42b91c7f145ff50dd654760", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9a4764aa42b91c7f145ff50dd654760");
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), b.this.f);
                    }
                }
            });
        } else {
            this.e = new Path();
            this.j = new Paint(1);
            this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        if (a()) {
            this.i = new Paint(1);
            this.i.setStyle(Paint.Style.STROKE);
            this.i.setStrokeWidth(this.h);
            this.i.setColor(this.g);
        }
    }

    private boolean a() {
        return (this.h == 0 || this.g == 0) ? false : true;
    }

    public final void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc7c2ea6b7182d2cad6ab7ca474a3fc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc7c2ea6b7182d2cad6ab7ca474a3fc0");
        } else if (c) {
        } else {
            canvas.saveLayer(0.0f, 0.0f, this.d.getWidth(), this.d.getHeight(), null, 31);
        }
    }

    public final void b(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8659f967fbbe0f7d7651ba2982b4884c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8659f967fbbe0f7d7651ba2982b4884c");
            return;
        }
        if (!c) {
            Object[] objArr2 = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "146a0ba6109a551712ae61a03f4990d5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "146a0ba6109a551712ae61a03f4990d5");
            } else if (!c) {
                this.e.reset();
                this.e.addRoundRect(new RectF(0.0f, 0.0f, this.d.getWidth(), this.d.getHeight()), this.f, this.f, Path.Direction.CW);
                canvas.drawPath(this.e, this.j);
            }
        }
        Object[] objArr3 = {canvas};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c6f1b1371ca0189bf84a71a9ad0ae565", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c6f1b1371ca0189bf84a71a9ad0ae565");
        } else if (a()) {
            float f = this.h * 0.5f;
            canvas.drawRoundRect(new RectF(f, f, this.d.getWidth() - f, this.d.getHeight() - f), this.f, this.f, this.i);
        }
    }

    static {
        c = Build.VERSION.SDK_INT >= 21;
    }
}

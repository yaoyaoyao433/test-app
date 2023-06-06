package com.sankuai.waimai.store.view;

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
public final class d {
    public static ChangeQuickRedirect a;
    public static final boolean b;
    public View c;
    public int d;
    public Paint e;
    public float f;
    private Path g;
    private float h;
    private int i;
    private Paint j;

    public d(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1bf02c4270dbc66c73e37cf061f867c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1bf02c4270dbc66c73e37cf061f867c");
        } else {
            this.c = view;
        }
    }

    public final void a(Context context, AttributeSet attributeSet, int i) {
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1627a5f79324a9a187aa2f17636471f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1627a5f79324a9a187aa2f17636471f7");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.borderColor, R.attr.borderWidth, R.attr.cornerRadius, R.attr.ratio, R.attr.topLeftCornerRadius, R.attr.topRightCornerRadius, R.attr.bottomLeftCornerRadius, R.attr.bottomRightCornerRadius});
        this.h = obtainStyledAttributes.getDimension(2, 0.0f);
        this.d = obtainStyledAttributes.getColor(0, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f = obtainStyledAttributes.getFloat(3, 0.0f);
        obtainStyledAttributes.recycle();
        this.c.setWillNotDraw(false);
        if (b) {
            this.c.setClipToOutline(true);
            this.c.setOutlineProvider(new ViewOutlineProvider() { // from class: com.sankuai.waimai.store.view.d.1
                public static ChangeQuickRedirect a;

                @Override // android.view.ViewOutlineProvider
                public final void getOutline(View view, Outline outline) {
                    Object[] objArr2 = {view, outline};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d8cbde570d51b0c045904607260f991", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d8cbde570d51b0c045904607260f991");
                    } else {
                        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), d.this.h);
                    }
                }
            });
        } else {
            this.g = new Path();
            this.j = new Paint(1);
            this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        if (a()) {
            this.e = new Paint(1);
            this.e.setStyle(Paint.Style.STROKE);
            this.e.setStrokeWidth(this.i);
            this.e.setColor(this.d);
        }
    }

    private boolean a() {
        return (this.i == 0 || this.d == 0) ? false : true;
    }

    public final void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8a7ef85f6902971cbcc46e8cd23d83a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8a7ef85f6902971cbcc46e8cd23d83a");
        } else if (b) {
        } else {
            canvas.saveLayer(0.0f, 0.0f, this.c.getWidth(), this.c.getHeight(), null, 31);
        }
    }

    public final void b(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "713e46a2b868cd2abb51f6118b14be4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "713e46a2b868cd2abb51f6118b14be4c");
            return;
        }
        if (!b) {
            Object[] objArr2 = {canvas};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e16d0b2a30c2898140a69a5631ecbd8a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e16d0b2a30c2898140a69a5631ecbd8a");
            } else if (!b) {
                this.g.reset();
                this.g.addRoundRect(new RectF(0.0f, 0.0f, this.c.getWidth(), this.c.getHeight()), this.h, this.h, Path.Direction.CW);
                canvas.drawPath(this.g, this.j);
            }
        }
        Object[] objArr3 = {canvas};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1abe789e7ebbd1594c7130ef23673054", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1abe789e7ebbd1594c7130ef23673054");
        } else if (a()) {
            float f = this.i * 0.5f;
            canvas.drawRoundRect(new RectF(f, f, this.c.getWidth() - f, this.c.getHeight() - f), this.h, this.h, this.e);
        }
    }

    static {
        b = Build.VERSION.SDK_INT >= 21;
    }
}

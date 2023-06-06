package com.sankuai.waimai.ugc.creator.widgets.round;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    public static ChangeQuickRedirect a;
    final View b;
    float c;
    public float d;
    private int e;
    private int f;
    private Paint g;

    public a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65048b5789a7b9b6b486b37d20e3a201", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65048b5789a7b9b6b486b37d20e3a201");
        } else {
            this.b = view;
        }
    }

    public final void a(Context context, AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72930ff262d6ab3c1195d60ff03c5fa4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72930ff262d6ab3c1195d60ff03c5fa4");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.borderColor, R.attr.borderWidth, R.attr.cornerRadius, R.attr.ratio});
        this.c = obtainStyledAttributes.getDimension(2, 0.0f);
        this.e = obtainStyledAttributes.getColor(0, 0);
        this.f = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.d = obtainStyledAttributes.getFloat(3, 0.0f);
        obtainStyledAttributes.recycle();
        this.b.setWillNotDraw(false);
        this.b.setClipToOutline(true);
        this.b.setOutlineProvider(new ViewOutlineProvider() { // from class: com.sankuai.waimai.ugc.creator.widgets.round.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View view, Outline outline) {
                Object[] objArr2 = {view, outline};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6a15ef4e2cb05d1a10fb78580f954479", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6a15ef4e2cb05d1a10fb78580f954479");
                } else {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), a.this.c);
                }
            }
        });
        this.g = new Paint(1);
        this.g.setStyle(Paint.Style.STROKE);
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15485706dc562ee1a597a507552eb03c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15485706dc562ee1a597a507552eb03c");
            return;
        }
        this.f = i;
        this.b.invalidateOutline();
        this.b.invalidate();
    }

    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b533bdd6c2c9965d09098cb4b7f8f54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b533bdd6c2c9965d09098cb4b7f8f54");
            return;
        }
        this.e = i;
        this.b.invalidateOutline();
        this.b.invalidate();
    }

    public final void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f417c51811f0e449d3263d68033301c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f417c51811f0e449d3263d68033301c1");
            return;
        }
        this.c = f;
        this.b.invalidateOutline();
        this.b.invalidate();
    }

    public final void a(Canvas canvas) {
        boolean z = true;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "049517286fd2dd8287bbf8cf113cb745", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "049517286fd2dd8287bbf8cf113cb745");
            return;
        }
        if ((this.f == 0 || this.e == 0) ? false : false) {
            this.g.setStrokeWidth(this.f);
            this.g.setColor(this.e);
            float f = this.f * 0.5f;
            canvas.drawRoundRect(new RectF(f, f, this.b.getWidth() - f, this.b.getHeight() - f), this.c, this.c, this.g);
        }
    }
}

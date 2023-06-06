package com.sankuai.waimai.business.page.home.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TriangleView extends View {
    public static ChangeQuickRedirect a;
    private Paint b;
    private Path c;
    private boolean d;
    private int e;

    public TriangleView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bf74ee3e55ff15011e154a971aeead8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bf74ee3e55ff15011e154a971aeead8");
        } else {
            a(context, null);
        }
    }

    public TriangleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ffefa9f08c3d05c449761dc2a71b028", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ffefa9f08c3d05c449761dc2a71b028");
        } else {
            a(context, attributeSet);
        }
    }

    public TriangleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39e8c729652d03aca820e5eb0f541b36", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39e8c729652d03aca820e5eb0f541b36");
        } else {
            a(context, attributeSet);
        }
    }

    private void a(Context context, @Nullable AttributeSet attributeSet) {
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "37c8ce9b6966952015915f8249cf513e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "37c8ce9b6966952015915f8249cf513e");
            return;
        }
        this.b = new Paint();
        this.c = new Path();
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.triangleColor, R.attr.triangleUp});
        this.e = obtainStyledAttributes.getColor(0, 0);
        this.d = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
    }

    public void setTriangleColor(@ColorInt int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bad7af70394f013983b9ad2b97360117", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bad7af70394f013983b9ad2b97360117");
            return;
        }
        this.e = i;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3804e10271c1ed5e533283d4ca5099c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3804e10271c1ed5e533283d4ca5099c");
            return;
        }
        super.onDraw(canvas);
        boolean z = this.d;
        Object[] objArr2 = {canvas, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1e28d91288cc208ee1f5224b975c4e1f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1e28d91288cc208ee1f5224b975c4e1f");
        } else if (this.e != 0) {
            int width = getWidth();
            int height = getHeight();
            this.c.reset();
            this.b.reset();
            if (z) {
                float f = width;
                this.c.moveTo(f / 2.0f, 0.0f);
                float f2 = height;
                this.c.lineTo(f, f2);
                this.c.lineTo(0.0f, f2);
            } else {
                this.c.moveTo(0.0f, 0.0f);
                float f3 = width;
                this.c.lineTo(f3, 0.0f);
                this.c.lineTo(f3 / 2.0f, height);
            }
            this.c.close();
            this.b.setAntiAlias(true);
            this.b.setStyle(Paint.Style.FILL);
            this.b.setColor(this.e);
            canvas.drawPath(this.c, this.b);
        }
    }
}

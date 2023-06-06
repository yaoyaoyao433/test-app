package com.sankuai.xm.imui.common.view.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b extends com.sankuai.xm.imui.common.view.shape.a {
    public static ChangeQuickRedirect a;
    public final Path b;
    public final Paint c;
    public final Paint d;
    public float e;
    public boolean f;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class a {
        public float a = 1.0f;
        public float b = 0.0f;
        public int c = 0;
        public int d = -1;
        public float e = 0.0f;
        public boolean f;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b70aa73985fed588d76130dbd6fa44a9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b70aa73985fed588d76130dbd6fa44a9");
            return;
        }
        this.e = 17.0f;
        this.f = false;
        this.b = new Path();
        this.c = new Paint();
        this.c.setAntiAlias(true);
        this.c.setColor(-1);
        this.c.setStyle(Paint.Style.FILL);
        this.d = new Paint();
        this.d.setAntiAlias(true);
        this.d.setColor(-1433892728);
        this.d.setStrokeWidth(1.0f);
        this.d.setStyle(Paint.Style.STROKE);
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96bc04f2804e337a12fefaa1c2500253", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96bc04f2804e337a12fefaa1c2500253");
            return;
        }
        this.e = aVar.e;
        this.c.setColor(aVar.d);
        this.d.setColor(aVar.c);
        this.d.setStrokeWidth(aVar.b);
        this.f = aVar.f;
    }

    @Override // com.sankuai.xm.imui.common.view.shape.a
    public final void a(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97e5794350ea42c76995329704a1bb0c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97e5794350ea42c76995329704a1bb0c");
        } else {
            canvas.drawPath(this.b, this.c);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.shape.a
    public final void b(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc7b25889f4903ef5149667632349752", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc7b25889f4903ef5149667632349752");
        } else {
            canvas.drawPath(this.b, this.d);
        }
    }

    @Override // com.sankuai.xm.imui.common.view.shape.a
    public final void a(RectF rectF) {
        Object[] objArr = {rectF};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87045023a7b4b6982aa238d2dc9908f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87045023a7b4b6982aa238d2dc9908f3");
            return;
        }
        this.b.reset();
        float strokeWidth = this.d.getStrokeWidth();
        float width = rectF.width() - strokeWidth;
        float height = rectF.height() - strokeWidth;
        this.b.moveTo(0.0f, this.e);
        this.b.arcTo(new RectF(0.0f, 0.0f, this.e * 2.0f, this.e * 2.0f), 180.0f, 90.0f);
        this.b.lineTo(width - this.e, 0.0f);
        this.b.arcTo(new RectF(width - (this.e * 2.0f), 0.0f, width, this.e * 2.0f), -90.0f, 90.0f);
        this.b.lineTo(width, height - this.e);
        this.b.arcTo(new RectF(width - (this.e * 2.0f), height - (this.e * 2.0f), width, height), 0.0f, 90.0f);
        this.b.lineTo(this.e, height);
        this.b.arcTo(new RectF(0.0f, height - (this.e * 2.0f), this.e * 2.0f, height), 90.0f, 90.0f);
        this.b.close();
        if (strokeWidth > 0.0f) {
            Matrix matrix = new Matrix();
            float f = strokeWidth / 2.0f;
            matrix.setTranslate(f, f);
            this.b.transform(matrix);
        }
        if (this.f) {
            Matrix matrix2 = new Matrix();
            matrix2.postScale(-1.0f, 1.0f, rectF.width() / 2.0f, 0.0f);
            this.b.transform(matrix2);
        }
    }
}

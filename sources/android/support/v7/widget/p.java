package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.support.v7.widget.am;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class p implements r {
    final RectF a = new RectF();

    @Override // android.support.v7.widget.r
    public final void g(q qVar) {
    }

    @Override // android.support.v7.widget.r
    public void a() {
        am.a = new am.a() { // from class: android.support.v7.widget.p.1
            @Override // android.support.v7.widget.am.a
            public final void a(Canvas canvas, RectF rectF, float f, Paint paint) {
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    p.this.a.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas.translate(rectF.left + f3, rectF.top + f3);
                    canvas.drawArc(p.this.a, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(p.this.a, 180.0f, 90.0f, true, paint);
                    canvas.translate(height, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(p.this.a, 180.0f, 90.0f, true, paint);
                    canvas.translate(width, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(p.this.a, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(save);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.top, (rectF.right - f3) + 1.0f, rectF.top + f3, paint);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.bottom - f3, (rectF.right - f3) + 1.0f, rectF.bottom, paint);
                }
                canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
            }
        };
    }

    @Override // android.support.v7.widget.r
    public final void f(q qVar) {
        Rect rect = new Rect();
        j(qVar).getPadding(rect);
        qVar.a((int) Math.ceil(j(qVar).a()), (int) Math.ceil(j(qVar).b()));
        qVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // android.support.v7.widget.r
    public final void h(q qVar) {
        j(qVar).a(qVar.b());
        f(qVar);
    }

    @Override // android.support.v7.widget.r
    public final void a(q qVar, @Nullable ColorStateList colorStateList) {
        am j = j(qVar);
        j.a(colorStateList);
        j.invalidateSelf();
    }

    @Override // android.support.v7.widget.r
    public final ColorStateList i(q qVar) {
        return j(qVar).e;
    }

    @Override // android.support.v7.widget.r
    public final void a(q qVar, float f) {
        am j = j(qVar);
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
        }
        float f2 = (int) (f + 0.5f);
        if (j.b != f2) {
            j.b = f2;
            j.f = true;
            j.invalidateSelf();
        }
        f(qVar);
    }

    @Override // android.support.v7.widget.r
    public final float d(q qVar) {
        return j(qVar).b;
    }

    @Override // android.support.v7.widget.r
    public final void c(q qVar, float f) {
        am j = j(qVar);
        j.a(f, j.c);
    }

    @Override // android.support.v7.widget.r
    public final float e(q qVar) {
        return j(qVar).d;
    }

    @Override // android.support.v7.widget.r
    public final void b(q qVar, float f) {
        am j = j(qVar);
        j.a(j.d, f);
        f(qVar);
    }

    @Override // android.support.v7.widget.r
    public final float a(q qVar) {
        return j(qVar).c;
    }

    @Override // android.support.v7.widget.r
    public final float b(q qVar) {
        return j(qVar).a();
    }

    @Override // android.support.v7.widget.r
    public final float c(q qVar) {
        return j(qVar).b();
    }

    private static am j(q qVar) {
        return (am) qVar.c();
    }

    @Override // android.support.v7.widget.r
    public final void a(q qVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        am amVar = new am(context.getResources(), colorStateList, f, f2, f3);
        amVar.a(qVar.b());
        qVar.a(amVar);
        f(qVar);
    }
}

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.View;
/* compiled from: ProGuard */
@RequiresApi(21)
/* loaded from: classes.dex */
public final class o implements r {
    @Override // android.support.v7.widget.r
    public final void a() {
    }

    @Override // android.support.v7.widget.r
    public final void a(q qVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        qVar.a(new al(colorStateList, f));
        View d = qVar.d();
        d.setClipToOutline(true);
        d.setElevation(f2);
        b(qVar, f3);
    }

    @Override // android.support.v7.widget.r
    public final void a(q qVar, float f) {
        al j = j(qVar);
        if (f != j.a) {
            j.a = f;
            j.a((Rect) null);
            j.invalidateSelf();
        }
    }

    @Override // android.support.v7.widget.r
    public final void b(q qVar, float f) {
        j(qVar).a(f, qVar.a(), qVar.b());
        f(qVar);
    }

    @Override // android.support.v7.widget.r
    public final float a(q qVar) {
        return j(qVar).b;
    }

    @Override // android.support.v7.widget.r
    public final float d(q qVar) {
        return j(qVar).a;
    }

    @Override // android.support.v7.widget.r
    public final void c(q qVar, float f) {
        qVar.d().setElevation(f);
    }

    @Override // android.support.v7.widget.r
    public final float e(q qVar) {
        return qVar.d().getElevation();
    }

    @Override // android.support.v7.widget.r
    public final void f(q qVar) {
        if (!qVar.a()) {
            qVar.a(0, 0, 0, 0);
            return;
        }
        float a = a(qVar);
        float d = d(qVar);
        int ceil = (int) Math.ceil(am.b(a, d, qVar.b()));
        int ceil2 = (int) Math.ceil(am.a(a, d, qVar.b()));
        qVar.a(ceil, ceil2, ceil, ceil2);
    }

    @Override // android.support.v7.widget.r
    public final void g(q qVar) {
        b(qVar, a(qVar));
    }

    @Override // android.support.v7.widget.r
    public final void h(q qVar) {
        b(qVar, a(qVar));
    }

    @Override // android.support.v7.widget.r
    public final void a(q qVar, @Nullable ColorStateList colorStateList) {
        al j = j(qVar);
        j.a(colorStateList);
        j.invalidateSelf();
    }

    @Override // android.support.v7.widget.r
    public final ColorStateList i(q qVar) {
        return j(qVar).c;
    }

    private static al j(q qVar) {
        return (al) qVar.c();
    }

    @Override // android.support.v7.widget.r
    public final float b(q qVar) {
        return j(qVar).a * 2.0f;
    }

    @Override // android.support.v7.widget.r
    public final float c(q qVar) {
        return j(qVar).a * 2.0f;
    }
}

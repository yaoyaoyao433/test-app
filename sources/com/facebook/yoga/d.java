package com.facebook.yoga;

import javax.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class d {
    public abstract d a(int i);

    public abstract e a(YogaEdge yogaEdge);

    public abstract void a(float f);

    public abstract void a(float f, float f2);

    public abstract void a(YogaAlign yogaAlign);

    public abstract void a(YogaBaselineFunction yogaBaselineFunction);

    public abstract void a(YogaDirection yogaDirection);

    public abstract void a(YogaDisplay yogaDisplay);

    public abstract void a(YogaEdge yogaEdge, float f);

    public abstract void a(YogaFlexDirection yogaFlexDirection);

    public abstract void a(YogaJustify yogaJustify);

    public abstract void a(YogaMeasureFunction yogaMeasureFunction);

    public abstract void a(YogaOverflow yogaOverflow);

    public abstract void a(YogaPositionType yogaPositionType);

    public abstract void a(YogaWrap yogaWrap);

    public abstract void a(d dVar, int i);

    public abstract void a(Object obj);

    public abstract void a(float[] fArr, int i);

    public abstract d b(int i);

    public abstract void b();

    public abstract void b(float f);

    public abstract void b(YogaAlign yogaAlign);

    public abstract void b(YogaEdge yogaEdge);

    public abstract void b(YogaEdge yogaEdge, float f);

    public abstract int c();

    public abstract e c(YogaEdge yogaEdge);

    public abstract void c(float f);

    public abstract void c(YogaAlign yogaAlign);

    public abstract void c(YogaEdge yogaEdge, float f);

    @Nullable
    public abstract d d();

    public abstract e d(YogaEdge yogaEdge);

    public abstract void d(float f);

    public abstract void d(YogaEdge yogaEdge, float f);

    public abstract float e(YogaEdge yogaEdge);

    public abstract void e(float f);

    public abstract void e(YogaEdge yogaEdge, float f);

    public abstract boolean e();

    public abstract float f(YogaEdge yogaEdge);

    public abstract void f();

    public abstract void f(float f);

    public abstract void f(YogaEdge yogaEdge, float f);

    public abstract float g(YogaEdge yogaEdge);

    public abstract void g(float f);

    public abstract void g(YogaEdge yogaEdge, float f);

    public abstract boolean g();

    public abstract void h(float f);

    public abstract boolean h();

    public abstract void i();

    public abstract void i(float f);

    public abstract YogaFlexDirection j();

    public abstract void j(float f);

    public abstract YogaPositionType k();

    public abstract void k(float f);

    public abstract void l();

    public abstract void l(float f);

    public abstract e m();

    public abstract void m(float f);

    public abstract void n();

    public abstract void n(float f);

    public abstract e o();

    public abstract void o(float f);

    public abstract void p();

    public abstract void p(float f);

    public abstract float q();

    public abstract void q(float f);

    public abstract float r();

    public abstract void r(float f);

    public abstract float s();

    public abstract float t();

    public abstract YogaDirection u();

    public abstract boolean v();

    @Nullable
    public abstract Object w();

    public abstract d x();

    public static d a() {
        return a.b ? new YogaNodeJNIBatching() : new YogaNodeJNI();
    }

    public static d a(a aVar) {
        return a.b ? new YogaNodeJNIBatching(aVar) : new YogaNodeJNI(aVar);
    }
}

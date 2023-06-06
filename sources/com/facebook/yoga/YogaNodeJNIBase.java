package com.facebook.yoga;

import com.facebook.proguard.annotations.DoNotStrip;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@DoNotStrip
/* loaded from: classes2.dex */
public abstract class YogaNodeJNIBase extends d implements Cloneable {
    public long a;
    @Nullable
    private YogaNodeJNIBase b;
    @Nullable
    private List<YogaNodeJNIBase> c;
    @Nullable
    private YogaMeasureFunction d;
    @Nullable
    private YogaBaselineFunction e;
    @Nullable
    private Object f;

    public YogaNodeJNIBase() {
        this.a = YogaNative.jni_YGNodeNew(a.b);
        if (this.a == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public YogaNodeJNIBase(a aVar) {
        this.a = YogaNative.jni_YGNodeNewWithConfig(aVar.c, a.b);
        if (this.a == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    @Override // com.facebook.yoga.d
    public void b() {
        this.d = null;
        this.e = null;
        this.f = null;
        YogaNative.jni_YGNodeReset(this.a);
    }

    @Override // com.facebook.yoga.d
    public final boolean h() {
        return this.a == 0;
    }

    @Override // com.facebook.yoga.d
    public final int c() {
        if (this.c == null) {
            return 0;
        }
        return this.c.size();
    }

    @Override // com.facebook.yoga.d
    public final void a(d dVar, int i) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) dVar;
        if (yogaNodeJNIBase.b != null) {
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
        if (this.c == null) {
            this.c = new ArrayList(4);
        }
        this.c.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.b = this;
        YogaNative.jni_YGNodeInsertChild(this.a, yogaNodeJNIBase.a, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.yoga.d
    /* renamed from: y */
    public YogaNodeJNIBase x() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            long jni_YGNodeClone = YogaNative.jni_YGNodeClone(this.a);
            yogaNodeJNIBase.b = null;
            yogaNodeJNIBase.a = jni_YGNodeClone;
            yogaNodeJNIBase.c = null;
            YogaNative.jni_YGNodeClearChildren(yogaNodeJNIBase.a);
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.facebook.yoga.d
    public final void a(float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List<YogaNodeJNIBase> list = ((YogaNodeJNIBase) arrayList.get(i)).c;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].a;
        }
        YogaNative.jni_YGNodeCalculateLayout(this.a, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.d
    public final void f() {
        YogaNative.jni_YGNodeMarkDirty(this.a);
    }

    @Override // com.facebook.yoga.d
    public final boolean g() {
        return YogaNative.jni_YGNodeIsDirty(this.a);
    }

    @Override // com.facebook.yoga.d
    public final void a(YogaDirection yogaDirection) {
        YogaNative.jni_YGNodeStyleSetDirection(this.a, yogaDirection.d);
    }

    @Override // com.facebook.yoga.d
    public final YogaFlexDirection j() {
        return YogaFlexDirection.a(YogaNative.jni_YGNodeStyleGetFlexDirection(this.a));
    }

    @Override // com.facebook.yoga.d
    public final void a(YogaFlexDirection yogaFlexDirection) {
        YogaNative.jni_YGNodeStyleSetFlexDirection(this.a, yogaFlexDirection.e);
    }

    @Override // com.facebook.yoga.d
    public final void a(YogaJustify yogaJustify) {
        YogaNative.jni_YGNodeStyleSetJustifyContent(this.a, yogaJustify.g);
    }

    @Override // com.facebook.yoga.d
    public final void a(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignItems(this.a, yogaAlign.i);
    }

    @Override // com.facebook.yoga.d
    public final void b(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignSelf(this.a, yogaAlign.i);
    }

    @Override // com.facebook.yoga.d
    public final void c(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignContent(this.a, yogaAlign.i);
    }

    @Override // com.facebook.yoga.d
    public final YogaPositionType k() {
        return YogaPositionType.a(YogaNative.jni_YGNodeStyleGetPositionType(this.a));
    }

    @Override // com.facebook.yoga.d
    public final void a(YogaPositionType yogaPositionType) {
        YogaNative.jni_YGNodeStyleSetPositionType(this.a, yogaPositionType.c);
    }

    @Override // com.facebook.yoga.d
    public final void a(YogaWrap yogaWrap) {
        YogaNative.jni_YGNodeStyleSetFlexWrap(this.a, yogaWrap.d);
    }

    @Override // com.facebook.yoga.d
    public final void a(YogaOverflow yogaOverflow) {
        YogaNative.jni_YGNodeStyleSetOverflow(this.a, yogaOverflow.d);
    }

    @Override // com.facebook.yoga.d
    public final void a(YogaDisplay yogaDisplay) {
        YogaNative.jni_YGNodeStyleSetDisplay(this.a, yogaDisplay.c);
    }

    @Override // com.facebook.yoga.d
    public final void a(float f) {
        YogaNative.jni_YGNodeStyleSetFlex(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void b(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrow(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void c(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrink(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void d(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasis(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void e(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercent(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void l() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAuto(this.a);
    }

    @Override // com.facebook.yoga.d
    public final e a(YogaEdge yogaEdge) {
        return a(YogaNative.jni_YGNodeStyleGetMargin(this.a, yogaEdge.j));
    }

    @Override // com.facebook.yoga.d
    public final void a(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetMargin(this.a, yogaEdge.j, f);
    }

    @Override // com.facebook.yoga.d
    public final void b(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercent(this.a, yogaEdge.j, f);
    }

    @Override // com.facebook.yoga.d
    public final void b(YogaEdge yogaEdge) {
        YogaNative.jni_YGNodeStyleSetMarginAuto(this.a, yogaEdge.j);
    }

    @Override // com.facebook.yoga.d
    public final e c(YogaEdge yogaEdge) {
        return a(YogaNative.jni_YGNodeStyleGetPadding(this.a, yogaEdge.j));
    }

    @Override // com.facebook.yoga.d
    public final void c(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPadding(this.a, yogaEdge.j, f);
    }

    @Override // com.facebook.yoga.d
    public final void d(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingPercent(this.a, yogaEdge.j, f);
    }

    @Override // com.facebook.yoga.d
    public final void e(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetBorder(this.a, yogaEdge.j, f);
    }

    @Override // com.facebook.yoga.d
    public final e d(YogaEdge yogaEdge) {
        return a(YogaNative.jni_YGNodeStyleGetPosition(this.a, yogaEdge.j));
    }

    @Override // com.facebook.yoga.d
    public final void f(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPosition(this.a, yogaEdge.j, f);
    }

    @Override // com.facebook.yoga.d
    public final void g(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercent(this.a, yogaEdge.j, f);
    }

    @Override // com.facebook.yoga.d
    public final e m() {
        return a(YogaNative.jni_YGNodeStyleGetWidth(this.a));
    }

    @Override // com.facebook.yoga.d
    public final void f(float f) {
        YogaNative.jni_YGNodeStyleSetWidth(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void g(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercent(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void n() {
        YogaNative.jni_YGNodeStyleSetWidthAuto(this.a);
    }

    @Override // com.facebook.yoga.d
    public final e o() {
        return a(YogaNative.jni_YGNodeStyleGetHeight(this.a));
    }

    @Override // com.facebook.yoga.d
    public final void h(float f) {
        YogaNative.jni_YGNodeStyleSetHeight(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void i(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercent(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void p() {
        YogaNative.jni_YGNodeStyleSetHeightAuto(this.a);
    }

    @Override // com.facebook.yoga.d
    public final void j(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidth(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void k(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercent(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void l(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeight(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void m(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercent(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void n(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidth(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void o(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercent(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void p(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeight(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void q(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercent(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void r(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatio(this.a, f);
    }

    @Override // com.facebook.yoga.d
    public final void a(YogaMeasureFunction yogaMeasureFunction) {
        this.d = yogaMeasureFunction;
        YogaNative.jni_YGNodeSetHasMeasureFunc(this.a, yogaMeasureFunction != null);
    }

    @DoNotStrip
    public final long measure(float f, int i, float f2, int i2) {
        if (!v()) {
            throw new RuntimeException("Measure function isn't defined!");
        }
        return this.d.measure(this, f, YogaMeasureMode.a(i), f2, YogaMeasureMode.a(i2));
    }

    @Override // com.facebook.yoga.d
    public final void a(YogaBaselineFunction yogaBaselineFunction) {
        this.e = yogaBaselineFunction;
        YogaNative.jni_YGNodeSetHasBaselineFunc(this.a, yogaBaselineFunction != null);
    }

    @DoNotStrip
    public final float baseline(float f, float f2) {
        return this.e.baseline(this, f, f2);
    }

    @Override // com.facebook.yoga.d
    public final boolean v() {
        return this.d != null;
    }

    @Override // com.facebook.yoga.d
    public final void a(Object obj) {
        this.f = obj;
    }

    @Override // com.facebook.yoga.d
    @Nullable
    public final Object w() {
        return this.f;
    }

    @Override // com.facebook.yoga.d
    public final void a(float[] fArr, int i) {
        YogaNative.jni_YGNodeSetStyleInputs(this.a, fArr, i);
    }

    @DoNotStrip
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        if (this.c == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        this.c.remove(i);
        this.c.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.b = this;
        return yogaNodeJNIBase.a;
    }

    private static e a(long j) {
        return new e(Float.intBitsToFloat((int) j), (int) (j >> 32));
    }

    protected void finalize() throws Throwable {
        try {
            if (this.a > 0) {
                long j = this.a;
                this.a = 0L;
                YogaNative.jni_YGNodeFree(j);
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.yoga.d
    @Nullable
    public final /* bridge */ /* synthetic */ d d() {
        return this.b;
    }

    @Override // com.facebook.yoga.d
    public final /* synthetic */ d b(int i) {
        if (this.c == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase remove = this.c.remove(i);
        remove.b = null;
        YogaNative.jni_YGNodeRemoveChild(this.a, remove.a);
        return remove;
    }

    @Override // com.facebook.yoga.d
    public final /* synthetic */ d a(int i) {
        if (this.c == null) {
            throw new IllegalStateException("YogaNode does not have children");
        }
        return this.c.get(i);
    }
}

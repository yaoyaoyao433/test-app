package com.sankuai.waimai.platform.mach.dialog.gesture;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.mach.dialog.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a implements d {
    public static ChangeQuickRedirect a;
    g b;
    VelocityTracker c;
    private Context d;
    private View e;
    private int f;
    private int g;
    private int h;
    private boolean i;

    public a(@NonNull View view, @NonNull g gVar, boolean z) {
        Object[] objArr = {view, gVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9607d2eb39f9378c3f33a09d856160b7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9607d2eb39f9378c3f33a09d856160b7");
            return;
        }
        this.c = VelocityTracker.obtain();
        this.e = view;
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.platform.mach.dialog.gesture.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "02455b30a3b9d35a95d30f29ce1e0d10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "02455b30a3b9d35a95d30f29ce1e0d10");
                } else if (a.this.c != null) {
                    a.this.c.recycle();
                    a.this.c = null;
                }
            }
        });
        this.d = view.getContext();
        this.b = gVar;
        this.i = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        if (java.lang.Math.abs(r13) <= android.view.ViewConfiguration.get(r12.d).getScaledMinimumFlingVelocity()) goto L23;
     */
    @Override // com.sankuai.waimai.platform.mach.dialog.gesture.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.MotionEvent r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.platform.mach.dialog.gesture.a.a
            java.lang.String r11 = "62cb7ad5a04cae9f1b5b7013a33d307a"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L22
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            return r13
        L22:
            float r1 = r13.getRawX()
            int r1 = (int) r1
            float r2 = r13.getRawY()
            int r2 = (int) r2
            android.view.VelocityTracker r3 = r12.c
            if (r3 != 0) goto L36
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r12.c = r3
        L36:
            android.view.VelocityTracker r3 = r12.c
            r3.addMovement(r13)
            int r13 = r13.getActionMasked()
            switch(r13) {
                case 0: goto Lc0;
                case 1: goto L64;
                case 2: goto L4b;
                case 3: goto L44;
                default: goto L42;
            }
        L42:
            goto Lc5
        L44:
            android.view.VelocityTracker r13 = r12.c
            r13.clear()
            goto Lc5
        L4b:
            int r13 = r12.h
            int r2 = r2 - r13
            boolean r13 = r12.i
            if (r13 == 0) goto L5b
            if (r2 > 0) goto L63
            android.view.View r13 = r12.e
            float r1 = (float) r2
            r13.setTranslationY(r1)
            goto L63
        L5b:
            if (r2 < 0) goto L63
            android.view.View r13 = r12.e
            float r1 = (float) r2
            r13.setTranslationY(r1)
        L63:
            return r0
        L64:
            android.view.VelocityTracker r13 = r12.c
            r1 = 1000(0x3e8, float:1.401E-42)
            r13.computeCurrentVelocity(r1)
            android.view.VelocityTracker r13 = r12.c
            float r13 = r13.getYVelocity()
            boolean r1 = r12.i
            r2 = 0
            if (r1 == 0) goto L7b
            int r1 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r1 >= 0) goto L92
            goto L7f
        L7b:
            int r1 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r1 <= 0) goto L92
        L7f:
            float r13 = java.lang.Math.abs(r13)
            android.content.Context r1 = r12.d
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r1)
            int r1 = r1.getScaledMinimumFlingVelocity()
            float r1 = (float) r1
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 > 0) goto Laa
        L92:
            android.view.View r13 = r12.e
            float r13 = r13.getTranslationY()
            float r13 = java.lang.Math.abs(r13)
            android.view.View r1 = r12.e
            int r1 = r1.getHeight()
            float r1 = (float) r1
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 <= 0) goto Lb5
        Laa:
            android.view.View r13 = r12.e
            com.sankuai.waimai.platform.mach.dialog.gesture.a$2 r1 = new com.sankuai.waimai.platform.mach.dialog.gesture.a$2
            r1.<init>()
            r13.post(r1)
            goto Lba
        Lb5:
            android.view.View r13 = r12.e
            r13.setTranslationY(r2)
        Lba:
            android.view.VelocityTracker r13 = r12.c
            r13.clear()
            return r0
        Lc0:
            r12.f = r1
            r12.g = r2
            return r0
        Lc5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.platform.mach.dialog.gesture.a.a(android.view.MotionEvent):boolean");
    }

    @Override // com.sankuai.waimai.platform.mach.dialog.gesture.d
    public final boolean b(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9adc8826b2bc42b9b7f019450acc4284", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9adc8826b2bc42b9b7f019450acc4284")).booleanValue();
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f = rawX;
            this.g = rawY;
        } else if (actionMasked == 2 && Math.abs(rawY - this.g) > Math.abs(rawX - this.f)) {
            this.h = rawY;
            return true;
        }
        return false;
    }
}

package com.meituan.android.legwork.mrn.view;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.HorizontalScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class h extends HorizontalScrollView {
    public static ChangeQuickRedirect a;
    public MotionEvent b;
    public int c;
    public int d;

    public h(ReactContext reactContext) {
        super(reactContext);
        Object[] objArr = {reactContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1aa84e419f88f740118b3163b68f1fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1aa84e419f88f740118b3163b68f1fb");
            return;
        }
        this.c = -1;
        setHorizontalScrollBarEnabled(false);
        this.d = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.legwork.mrn.view.h.a
            java.lang.String r11 = "d2a8bfa778e5975d30f66f1837c56220"
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
            boolean r1 = super.onInterceptTouchEvent(r13)
            int r2 = r13.getAction()
            r3 = -1
            if (r2 == 0) goto L70
            r4 = 2
            if (r2 == r4) goto L31
            goto L74
        L31:
            int r2 = r12.c
            if (r2 != r3) goto L74
            float r2 = r13.getX()
            android.view.MotionEvent r3 = r12.b
            float r3 = r3.getX()
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            float r3 = r13.getY()
            android.view.MotionEvent r4 = r12.b
            float r4 = r4.getY()
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            int r4 = r12.d
            float r4 = (float) r4
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L61
            int r4 = r12.d
            float r4 = (float) r4
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 < 0) goto L74
        L61:
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L67
            r2 = 0
            goto L68
        L67:
            r2 = 1
        L68:
            r12.c = r2
            int r2 = r12.c
            if (r2 != 0) goto L74
            r2 = 1
            goto L75
        L70:
            r12.b = r13
            r12.c = r3
        L74:
            r2 = 0
        L75:
            if (r2 != 0) goto L7b
            if (r1 == 0) goto L7a
            goto L7b
        L7a:
            return r9
        L7b:
            android.view.ViewParent r1 = r12.getParent()
            if (r1 == 0) goto L88
            android.view.ViewParent r1 = r12.getParent()
            r1.requestDisallowInterceptTouchEvent(r0)
        L88:
            com.facebook.react.uimanager.events.e.a(r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.legwork.mrn.view.h.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "051b411bef856d6cb1e25183fd3f4ec7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "051b411bef856d6cb1e25183fd3f4ec7")).booleanValue();
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea4eb99d7d24f676b4ee78b3636c5ccf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea4eb99d7d24f676b4ee78b3636c5ccf");
            return;
        }
        q.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b81e97c7d1316cab389c931a111c3b25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b81e97c7d1316cab389c931a111c3b25");
        } else {
            scrollTo(getScrollX(), getScrollY());
        }
    }
}

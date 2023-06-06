package com.sankuai.waimai.business.page.common.view.nested;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.view.animation.TranslateAnimation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class NestedHorizontalRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;
    private final int b;
    private boolean c;
    private boolean d;
    private float e;
    private float f;
    private Rect g;
    private boolean h;
    private float i;
    private boolean j;

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        return false;
    }

    public NestedHorizontalRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5782290e98905f307364a9308cc9c557", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5782290e98905f307364a9308cc9c557");
            return;
        }
        this.b = ViewConfiguration.get(com.meituan.android.singleton.b.a).getScaledTouchSlop();
        this.c = false;
        this.d = false;
        this.e = 0.0f;
        this.f = 0.0f;
        this.h = false;
        this.j = false;
        a();
    }

    public NestedHorizontalRecyclerView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41186b5c6b3e5c8620ca5d895e301687", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41186b5c6b3e5c8620ca5d895e301687");
            return;
        }
        this.b = ViewConfiguration.get(com.meituan.android.singleton.b.a).getScaledTouchSlop();
        this.c = false;
        this.d = false;
        this.e = 0.0f;
        this.f = 0.0f;
        this.h = false;
        this.j = false;
        a();
    }

    public NestedHorizontalRecyclerView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "972e1dfe382763c6dc473e8f057404d4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "972e1dfe382763c6dc473e8f057404d4");
            return;
        }
        this.b = ViewConfiguration.get(com.meituan.android.singleton.b.a).getScaledTouchSlop();
        this.c = false;
        this.d = false;
        this.e = 0.0f;
        this.f = 0.0f;
        this.h = false;
        this.j = false;
        a();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32003d1e45661e4f3c16d1f2eb32c716", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32003d1e45661e4f3c16d1f2eb32c716");
        } else {
            setLayoutManager(new a(getContext(), false));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.page.common.view.nested.NestedHorizontalRecyclerView.a
            java.lang.String r11 = "b44a92700b88e3bc8b431d9380f55437"
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
            android.support.v7.widget.RecyclerView$LayoutManager r1 = r12.getLayoutManager()
            com.sankuai.waimai.business.page.common.view.nested.NestedHorizontalRecyclerView$a r1 = (com.sankuai.waimai.business.page.common.view.nested.NestedHorizontalRecyclerView.a) r1
            int r2 = r13.getAction()
            switch(r2) {
                case 0: goto L30;
                case 1: goto L97;
                case 2: goto L4c;
                default: goto L2f;
            }
        L2f:
            goto L9e
        L30:
            float r2 = r13.getX()
            r12.e = r2
            float r2 = r13.getY()
            r12.f = r2
            float r2 = r13.getX()
            r12.i = r2
            r12.c = r9
            r12.d = r9
            com.sankuai.waimai.business.page.common.view.nested.NestedHorizontalRecyclerView.a.a(r1, r0)
            com.sankuai.waimai.business.page.common.view.nested.NestedHorizontalRecyclerView.a.b(r1, r0)
        L4c:
            float r2 = r13.getX()
            float r3 = r12.e
            float r2 = r2 - r3
            float r2 = java.lang.Math.abs(r2)
            float r3 = r13.getY()
            float r4 = r12.f
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            boolean r4 = r12.d
            if (r4 == 0) goto L6b
            boolean r13 = super.onInterceptTouchEvent(r13)
            return r13
        L6b:
            boolean r4 = r12.c
            if (r4 != 0) goto L87
            int r4 = r12.b
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 < 0) goto L87
            int r3 = r12.b
            float r3 = (float) r3
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L87
            r12.d = r0
            com.sankuai.waimai.business.page.common.view.nested.NestedHorizontalRecyclerView.a.b(r1, r9)
            boolean r13 = super.onInterceptTouchEvent(r13)
            return r13
        L87:
            int r3 = r12.b
            float r3 = (float) r3
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L97
            r12.c = r0
            com.sankuai.waimai.business.page.common.view.nested.NestedHorizontalRecyclerView.a.a(r1, r9)
            r12.stopNestedScroll()
            return r0
        L97:
            boolean r0 = r12.h
            if (r0 == 0) goto L9e
            r12.b()
        L9e:
            boolean r13 = super.onInterceptTouchEvent(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.common.view.nested.NestedHorizontalRecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends LinearLayoutManager {
        public static ChangeQuickRedirect a;
        private boolean b;
        private boolean c;

        public a(Context context, boolean z) {
            super(context, 0, false);
            Object[] objArr = {context, (byte) 0};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1d80e23677aea79c41e1849da90651", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1d80e23677aea79c41e1849da90651");
                return;
            }
            this.b = true;
            this.c = true;
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public final boolean canScrollVertically() {
            return this.b;
        }

        @Override // android.support.v7.widget.LinearLayoutManager, android.support.v7.widget.RecyclerView.LayoutManager
        public final boolean canScrollHorizontally() {
            return this.c;
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27973b7ba8080d89a9c47474e56169bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27973b7ba8080d89a9c47474e56169bd");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        if (this.g == null) {
            this.g = new Rect(getLeft(), getTop(), getRight(), getBottom());
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236b4223aabeb8bcd2b494b72a1334b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236b4223aabeb8bcd2b494b72a1334b3");
            return;
        }
        TranslateAnimation translateAnimation = new TranslateAnimation(getLeft() - this.g.left, 0.0f, 0.0f, 0.0f);
        translateAnimation.setDuration(250L);
        startAnimation(translateAnimation);
        layout(this.g.left, this.g.top, this.g.right, this.g.bottom);
        this.h = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb A[ADDED_TO_REGION] */
    @Override // android.support.v7.widget.RecyclerView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.page.common.view.nested.NestedHorizontalRecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }
}

package com.sankuai.waimai.business.restaurant.poicontainer.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.o;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShopFoldHeaderFrameLayout extends FrameLayout {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private VelocityTracker d;
    private int e;
    private boolean f;
    private boolean g;
    private float h;
    private boolean i;
    private a j;
    private int k;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a {
    }

    public ShopFoldHeaderFrameLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3b892e740aea45c6b6a8bcb9079924d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3b892e740aea45c6b6a8bcb9079924d");
            return;
        }
        this.f = false;
        this.i = false;
        a(context);
    }

    public ShopFoldHeaderFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1c49db2d8adf11aa1982c5bc9faac4c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1c49db2d8adf11aa1982c5bc9faac4c");
            return;
        }
        this.f = false;
        this.i = false;
        a(context);
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "accc2b31ac230ffd9abe5edc1c679241", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "accc2b31ac230ffd9abe5edc1c679241");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.e("ShopFoldHeader", "init", new Object[0]);
        this.d = VelocityTracker.obtain();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.b = viewConfiguration.getScaledMinimumFlingVelocity();
        this.c = viewConfiguration.getScaledMaximumFlingVelocity();
        this.k = viewConfiguration.getScaledTouchSlop();
        com.sankuai.waimai.foundation.utils.log.a.e("ShopFoldHeader", "mMinimumVelocity=%4d,mMaximumVelocity=%4d", Integer.valueOf(this.b), Integer.valueOf(this.c));
    }

    public void setFunctionEnable(boolean z) {
        this.i = z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ae0865bc520c1c7397b389ac91fa134", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ae0865bc520c1c7397b389ac91fa134")).booleanValue();
        }
        com.sankuai.waimai.foundation.utils.log.a.e("ShopFoldHeader", "dispatchTouchEvent " + motionEvent.getAction(), new Object[0]);
        if (!this.i || this.d == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.f = false;
        switch (motionEvent.getAction()) {
            case 0:
                com.sankuai.waimai.foundation.utils.log.a.e("ShopFoldHeader", "dispatchTouchEvent  ACTION_DOWN", new Object[0]);
                this.d.clear();
                this.e = (int) motionEvent.getRawY();
                this.d.addMovement(motionEvent);
                break;
            case 1:
                com.sankuai.waimai.foundation.utils.log.a.e("ShopFoldHeader", "dispatchTouchEvent  ACTION_UP", new Object[0]);
                this.d.addMovement(motionEvent);
                this.d.computeCurrentVelocity(1000, this.c);
                int i = -((int) this.d.getYVelocity());
                if (Math.abs(i) > this.b) {
                    if (o.a(this.e - ((int) motionEvent.getRawY())) == o.a(i) && i > 0) {
                        this.f = true;
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.e("ShopFoldHeader", "error vy ignored", new Object[0]);
                    }
                }
                com.sankuai.waimai.foundation.utils.log.a.b("ShopFoldHeader", "vy = %d", Integer.valueOf(i));
                this.d.clear();
                break;
            case 2:
                this.d.addMovement(motionEvent);
                com.sankuai.waimai.foundation.utils.log.a.e("ShopFoldHeader", "dispatchTouchEvent  ACTION_MOVE", new Object[0]);
                break;
            case 3:
                this.d.clear();
                break;
        }
        if (this.f && this.j != null) {
            com.sankuai.waimai.foundation.utils.log.a.e("ShopFoldHeader", "onFlingUp", new Object[0]);
        }
        com.sankuai.waimai.foundation.utils.log.a.e("ShopFoldHeader", "mIsFlingUp = " + this.f, new Object[0]);
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (java.lang.Math.abs(r12.h - r13.getY()) >= r12.k) goto L17;
     */
    @Override // android.view.ViewGroup
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
            com.meituan.robust.ChangeQuickRedirect r10 = com.sankuai.waimai.business.restaurant.poicontainer.views.ShopFoldHeaderFrameLayout.a
            java.lang.String r11 = "d630020f086dac6d2e7b233058257904"
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
            boolean r1 = r12.i
            if (r1 != 0) goto L2b
            boolean r13 = super.onInterceptTouchEvent(r13)
            return r13
        L2b:
            int r1 = r13.getAction()
            if (r1 == 0) goto L48
            r2 = 2
            if (r1 == r2) goto L35
            goto L51
        L35:
            float r13 = r13.getY()
            float r1 = r12.h
            float r1 = r1 - r13
            float r13 = java.lang.Math.abs(r1)
            int r1 = r12.k
            float r1 = (float) r1
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 < 0) goto L4e
            goto L4f
        L48:
            float r13 = r13.getY()
            r12.h = r13
        L4e:
            r0 = 0
        L4f:
            r12.g = r0
        L51:
            java.lang.String r13 = "ShopFoldHeader"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "onInterceptTouchEvent ismScrolling="
            r0.<init>(r1)
            boolean r1 = r12.g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.sankuai.waimai.foundation.utils.log.a.e(r13, r0, r1)
            boolean r13 = r12.g
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.poicontainer.views.ShopFoldHeaderFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean performClick() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f124feced3364978428559348191a446", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f124feced3364978428559348191a446")).booleanValue();
        }
        if (this.f && this.i) {
            return true;
        }
        com.sankuai.waimai.foundation.utils.log.a.e("ShopFoldHeader", "performClick", new Object[0]);
        return super.performClick();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65fac2737e23cf82778be6d67bbb1331", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65fac2737e23cf82778be6d67bbb1331");
            return;
        }
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.recycle();
            this.d = null;
        }
    }

    public void setOnFlingUpListener(a aVar) {
        this.j = aVar;
    }
}

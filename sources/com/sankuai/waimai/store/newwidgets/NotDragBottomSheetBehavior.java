package com.sankuai.waimai.store.newwidgets;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NotDragBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public static ChangeQuickRedirect m;

    @Override // android.support.design.widget.BottomSheetBehavior, android.support.design.widget.CoordinatorLayout.a
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.support.design.widget.BottomSheetBehavior, android.support.design.widget.CoordinatorLayout.a
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return false;
    }

    @Override // android.support.design.widget.BottomSheetBehavior, android.support.design.widget.CoordinatorLayout.a
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
    }

    @Override // android.support.design.widget.BottomSheetBehavior, android.support.design.widget.CoordinatorLayout.a
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return false;
    }

    @Override // android.support.design.widget.BottomSheetBehavior, android.support.design.widget.CoordinatorLayout.a
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view) {
    }

    @Override // android.support.design.widget.BottomSheetBehavior, android.support.design.widget.CoordinatorLayout.a
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return false;
    }

    public NotDragBottomSheetBehavior() {
    }

    public NotDragBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "97716db802364dfbcb6e22091f910c65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "97716db802364dfbcb6e22091f910c65");
        }
    }
}

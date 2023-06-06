package com.meituan.android.mrn.component.map.view.childview;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* loaded from: classes2.dex */
public final class a extends LinearLayout {
    public static ChangeQuickRedirect a;
    private GestureDetector b;
    private View.OnClickListener c;
    private GestureDetector.OnGestureListener d;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "817d928e555577744caebfd6621a40fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "817d928e555577744caebfd6621a40fc");
            return;
        }
        this.d = new GestureDetector.OnGestureListener() { // from class: com.meituan.android.mrn.component.map.view.childview.a.1
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onDown(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final void onShowPress(MotionEvent motionEvent) {
            }

            @Override // android.view.GestureDetector.OnGestureListener
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e9fa46a2684cb3cadab7008e261ed5c2", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e9fa46a2684cb3cadab7008e261ed5c2")).booleanValue();
                }
                if (a.this.c != null) {
                    a.this.c.onClick(a.this);
                }
                return true;
            }
        };
        this.b = new GestureDetector(getContext(), this.d);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ae65b3f4e95e7d288a8fe9e750c4e5a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ae65b3f4e95e7d288a8fe9e750c4e5a")).booleanValue();
        }
        this.b.onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setOnMakerClickListener(View.OnClickListener onClickListener) {
        this.c = onClickListener;
    }
}

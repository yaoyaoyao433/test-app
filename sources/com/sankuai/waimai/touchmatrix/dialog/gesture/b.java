package com.sankuai.waimai.touchmatrix.dialog.gesture;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements e {
    public static ChangeQuickRedirect a;
    com.sankuai.waimai.touchmatrix.dialog.b b;
    VelocityTracker c;
    public c d;
    public f e;
    private Context f;
    private View g;
    private int h;
    private int i;
    private int j;
    private boolean k;

    public b(@NonNull View view, @NonNull com.sankuai.waimai.touchmatrix.dialog.b bVar, boolean z) {
        Object[] objArr = {view, bVar, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f084c800b8eb41f51900c16c5187397e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f084c800b8eb41f51900c16c5187397e");
            return;
        }
        this.c = VelocityTracker.obtain();
        this.g = view;
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.sankuai.waimai.touchmatrix.dialog.gesture.b.1
            public static ChangeQuickRedirect a;

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                Object[] objArr2 = {view2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f78b97e841ad04024706a812fba5933", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f78b97e841ad04024706a812fba5933");
                } else if (b.this.c != null) {
                    b.this.c.recycle();
                    b.this.c = null;
                }
            }
        });
        this.f = view.getContext();
        this.b = bVar;
        this.k = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.sankuai.waimai.touchmatrix.dialog.gesture.e
    public final boolean a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8238ffc85ad0f896d0ce518491c7d34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8238ffc85ad0f896d0ce518491c7d34")).booleanValue();
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (this.c == null) {
            this.c = VelocityTracker.obtain();
        }
        this.c.addMovement(motionEvent);
        switch (motionEvent.getActionMasked()) {
            case 0:
                this.h = rawX;
                this.i = rawY;
                return true;
            case 1:
                this.c.computeCurrentVelocity(1000);
                float yVelocity = this.c.getYVelocity();
                if (this.e == null) {
                    this.e = new a();
                }
                if (this.e.a(this.g, this.g.getTranslationY(), yVelocity, this.k)) {
                    this.g.post(new Runnable() { // from class: com.sankuai.waimai.touchmatrix.dialog.gesture.b.2
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c1fbde8b99e56ace39e3a9f5a2e35d1f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c1fbde8b99e56ace39e3a9f5a2e35d1f");
                                return;
                            }
                            b.this.b.dismiss();
                            if (b.this.d != null) {
                                b.this.d.a();
                            }
                        }
                    });
                } else {
                    this.g.setTranslationY(0.0f);
                }
                this.c.clear();
                return true;
            case 2:
                int i = rawY - this.j;
                if (this.k) {
                    if (i <= 0) {
                        this.g.setTranslationY(i);
                    }
                } else if (i >= 0) {
                    this.g.setTranslationY(i);
                }
                return true;
            case 3:
                this.c.clear();
                break;
        }
        return false;
    }

    @Override // com.sankuai.waimai.touchmatrix.dialog.gesture.e
    public final boolean b(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e9bccd6b405c7c8484951229ef039bd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e9bccd6b405c7c8484951229ef039bd")).booleanValue();
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = rawX;
            this.i = rawY;
        } else if (actionMasked == 2 && Math.abs(rawY - this.i) > Math.abs(rawX - this.h)) {
            this.j = rawY;
            return true;
        }
        return false;
    }
}

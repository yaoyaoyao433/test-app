package com.meituan.android.legwork.mrn.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.w;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends com.facebook.react.views.view.f {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private ReactContext d;
    private boolean e;
    private VelocityTracker f;
    private int g;
    private int h;
    private int i;
    private View j;
    private boolean k;
    private int l;

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42630d1c6293fc42d852c60789e024ed", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42630d1c6293fc42d852c60789e024ed");
            return;
        }
        this.b = 300;
        this.c = (int) w.a(80.0f);
        this.e = false;
        this.d = (ReactContext) context;
        this.l = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35cc6fe1fd9d9b7fb00e5b008572756a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35cc6fe1fd9d9b7fb00e5b008572756a");
        } else if (this.f == null) {
            this.f = VelocityTracker.obtain();
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1af5dd68afdb7163c7a66250b19b7862", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1af5dd68afdb7163c7a66250b19b7862");
        } else if (this.f != null) {
            this.f.recycle();
            this.f = null;
        }
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ce624accd45cee1b3028ab5fb135e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ce624accd45cee1b3028ab5fb135e9")).booleanValue();
        }
        int action = motionEvent.getAction();
        if (this.e && action == 2) {
            return true;
        }
        int i = action & 255;
        if (i != 0) {
            if (i == 2) {
                this.k = this.j == null || this.j.getScrollY() == 0;
                if (!this.k) {
                    b();
                    return false;
                }
                this.e = ((int) motionEvent.getRawY()) - this.g > this.l;
                a();
                this.f.addMovement(motionEvent);
                return this.e;
            }
            b();
            return this.e;
        }
        int rawY = (int) motionEvent.getRawY();
        this.e = false;
        if (this.j != null && this.j.getScrollY() != 0) {
            r0 = false;
        }
        this.k = r0;
        if (this.k) {
            this.g = rawY;
            this.h = (int) motionEvent.getRawX();
            this.i = motionEvent.getPointerId(0);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e60c565d613749dbcbe62becb601085", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e60c565d613749dbcbe62becb601085");
            } else if (this.f == null) {
                this.f = VelocityTracker.obtain();
            } else {
                this.f.clear();
            }
            this.f.addMovement(motionEvent);
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.facebook.react.views.view.f, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84e1ebd47b4c3961bf0914aa9207826c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84e1ebd47b4c3961bf0914aa9207826c")).booleanValue();
        }
        a();
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.i = motionEvent.getPointerId(0);
                this.g = (int) motionEvent.getRawY();
                this.h = (int) motionEvent.getRawX();
                break;
            case 1:
                if (this.f == null) {
                    return true;
                }
                this.f.computeCurrentVelocity(1000);
                int yVelocity = (int) this.f.getYVelocity(this.i);
                int rawY = ((int) motionEvent.getRawY()) - this.g;
                int rawX = ((int) motionEvent.getRawX()) - this.h;
                if ((yVelocity > 200 && Math.abs(rawX) < rawY) || rawY > this.c) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    valueAnimator.setIntValues(rawY, getHeight());
                    valueAnimator.setDuration(this.b);
                    valueAnimator.addUpdateListener(b.a(this));
                    valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.meituan.android.legwork.mrn.view.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            Object[] objArr2 = {animator};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f8dbb6565feca77f0af95a069793805", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f8dbb6565feca77f0af95a069793805");
                            } else {
                                ((DeviceEventManagerModule.RCTDeviceEventEmitter) a.this.d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("DragDownCloseViewClose", null);
                            }
                        }
                    });
                    valueAnimator.start();
                } else {
                    if (rawY < 0) {
                        rawY = 0;
                    }
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    valueAnimator2.setIntValues(rawY, 0);
                    valueAnimator2.setDuration(150L);
                    valueAnimator2.addUpdateListener(c.a(this));
                    valueAnimator2.start();
                }
                b();
                this.e = false;
                return true;
            case 2:
                int rawY2 = (int) motionEvent.getRawY();
                new StringBuilder("y=").append(rawY2);
                int i = rawY2 - this.g;
                new StringBuilder("dy=").append(i);
                if (i < 0) {
                    i = 0;
                }
                layout(getLeft(), i, getRight(), getHeight() + i);
                break;
            default:
                this.e = false;
                break;
        }
        a();
        this.f.addMovement(motionEvent);
        return true;
    }

    public static /* synthetic */ void b(a aVar, ValueAnimator valueAnimator) {
        Object[] objArr = {aVar, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d988a4ad818de33a721e21473b2508f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d988a4ad818de33a721e21473b2508f2");
            return;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        aVar.layout(aVar.getLeft(), intValue, aVar.getRight(), aVar.getHeight() + intValue);
    }

    public static /* synthetic */ void a(a aVar, ValueAnimator valueAnimator) {
        Object[] objArr = {aVar, valueAnimator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3f310c533e6d0581f37f9fd927bc3f52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3f310c533e6d0581f37f9fd927bc3f52");
            return;
        }
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        aVar.layout(aVar.getLeft(), intValue, aVar.getRight(), aVar.getHeight() + intValue);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae1c622dd415c88baa35ca5411b0d891", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae1c622dd415c88baa35ca5411b0d891");
        } else {
            this.j = com.facebook.react.uimanager.util.a.a(this, "DRAG_DOWN_SCROLL_VIEW_NATIVE_ID");
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63b97084ec3d0b2942c5264efcd462d5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63b97084ec3d0b2942c5264efcd462d5");
        } else if (this.k) {
        } else {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }
}

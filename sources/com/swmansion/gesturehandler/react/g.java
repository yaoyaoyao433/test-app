package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.modal.b;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class g {
    final ViewGroup a;
    private final ReactContext c;
    private final com.swmansion.gesturehandler.d d;
    private final com.swmansion.gesturehandler.b e;
    boolean b = false;
    private boolean f = false;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
        return (android.view.ViewGroup) r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.view.ViewGroup a(android.view.ViewGroup r3) {
        /*
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()
            r0 = r3
        L4:
            if (r0 == 0) goto L13
            boolean r1 = r0 instanceof com.facebook.react.ReactRootView
            if (r1 != 0) goto L13
            boolean r1 = r0 instanceof com.facebook.react.views.modal.b.a
            if (r1 != 0) goto L13
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L13:
            if (r0 == 0) goto L18
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            return r0
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " has not been mounted under ReactRootView"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.react.g.a(android.view.ViewGroup):android.view.ViewGroup");
    }

    public g(ReactContext reactContext, ViewGroup viewGroup) {
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        if (id <= 0) {
            throw new IllegalStateException("Expect view tag to be set for " + viewGroup);
        }
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) reactContext.getNativeModule(RNGestureHandlerModule.class);
        f registry = rNGestureHandlerModule.getRegistry();
        this.a = a(viewGroup);
        new StringBuilder("[GESTURE HANDLER] Initialize gesture handler for root view ").append(this.a);
        this.c = reactContext;
        this.d = new com.swmansion.gesturehandler.d(viewGroup, registry, new j());
        this.d.f = 0.1f;
        this.e = new a();
        this.e.e = -id;
        registry.a(this.e);
        registry.a(this.e.e, id);
        rNGestureHandlerModule.registerRootHelper(this);
    }

    public final void a() {
        new StringBuilder("[GESTURE HANDLER] Tearing down gesture handler registered for root view ").append(this.a);
        RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule) this.c.getNativeModule(RNGestureHandlerModule.class);
        rNGestureHandlerModule.getRegistry().b(this.e.e);
        rNGestureHandlerModule.unregisterRootHelper(this);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class a extends com.swmansion.gesturehandler.b {
        private a() {
        }

        @Override // com.swmansion.gesturehandler.b
        public final void a() {
            g.this.b = true;
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setAction(3);
            if (g.this.a instanceof ReactRootView) {
                ((ReactRootView) g.this.a).onChildStartedNativeGesture(obtain);
            } else {
                ((b.a) g.this.a).onChildStartedNativeGesture(obtain);
            }
        }

        @Override // com.swmansion.gesturehandler.b
        public final void a(MotionEvent motionEvent) {
            if (this.g == 0) {
                e();
                g.this.b = false;
            }
            if (motionEvent.getActionMasked() == 1) {
                f();
            }
        }
    }

    public final void a(boolean z) {
        if (this.d == null || this.f) {
            return;
        }
        b();
    }

    public final boolean a(MotionEvent motionEvent) {
        this.f = true;
        this.d.a(motionEvent);
        this.f = false;
        return this.b;
    }

    void b() {
        if (this.e == null || this.e.g != 2) {
            return;
        }
        this.e.d();
        this.e.f();
    }
}

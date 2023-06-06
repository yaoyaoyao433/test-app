package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h extends com.facebook.react.views.view.f {
    @Nullable
    g a;
    private boolean b;

    public h(Context context) {
        super(context);
    }

    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        boolean z;
        super.onAttachedToWindow();
        UiThreadUtil.assertOnUiThread();
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if ((parent instanceof a) || (parent instanceof h)) {
                z = true;
                break;
            }
        }
        z = false;
        this.b = !z;
        if (this.b && this.a == null) {
            this.a = new g((ReactContext) getContext(), this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.b && ((g) com.facebook.infer.annotation.a.a(this.a)).a(motionEvent)) {
                return true;
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (Throwable th) {
            th.printStackTrace();
            com.facebook.common.logging.a.d("RNGestureHandlerRootView@dispatchTouchEvent", "", th);
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.b) {
            ((g) com.facebook.infer.annotation.a.a(this.a)).a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }
}

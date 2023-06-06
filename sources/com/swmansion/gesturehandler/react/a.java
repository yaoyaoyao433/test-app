package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.MotionEvent;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a extends ReactRootView {
    @Nullable
    ReactInstanceManager a;
    @Nullable
    g b;

    public a(Context context) {
        super(context);
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.b != null) {
            this.b.a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.b == null || !this.b.a(motionEvent)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            com.facebook.common.logging.a.d("RNGestureHandlerEnabledRootView@dispatchTouchEvent", "", th);
            return false;
        }
    }

    @Override // com.facebook.react.ReactRootView
    public final void startReactApplication(ReactInstanceManager reactInstanceManager, String str, @Nullable Bundle bundle) {
        super.startReactApplication(reactInstanceManager, str, bundle);
        this.a = reactInstanceManager;
    }
}

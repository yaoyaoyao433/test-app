package com.facebook.react.views.swiperefresh;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.events.e;
import com.facebook.react.uimanager.w;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReactSwipeRefreshLayout extends SwipeRefreshLayout {
    private boolean a;
    private boolean b;
    private float c;
    private int d;
    private float e;
    private boolean f;

    public ReactSwipeRefreshLayout(ReactContext reactContext) {
        super(reactContext);
        this.a = false;
        this.b = false;
        this.c = 0.0f;
        this.d = ViewConfiguration.get(reactContext).getScaledTouchSlop();
    }

    @Override // android.support.v4.widget.SwipeRefreshLayout
    public void setRefreshing(boolean z) {
        this.b = z;
        if (this.a) {
            super.setRefreshing(z);
        }
    }

    public void setProgressViewOffset(float f) {
        this.c = f;
        if (this.a) {
            int progressCircleDiameter = getProgressCircleDiameter();
            setProgressViewOffset(false, Math.round(w.a(f)) - progressCircleDiameter, Math.round(w.a(f + 64.0f) - progressCircleDiameter));
        }
    }

    @Override // android.support.v4.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a) {
            return;
        }
        this.a = true;
        setProgressViewOffset(this.c);
        setRefreshing(this.b);
    }

    @Override // android.support.v4.widget.SwipeRefreshLayout, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.support.v4.widget.SwipeRefreshLayout
    public boolean canChildScrollUp() {
        try {
            return super.canChildScrollUp();
        } catch (Throwable th) {
            com.facebook.common.logging.a.c("ReactSwipeRefreshLayout@canChildScrollUp", null, th);
            return false;
        }
    }

    @Override // android.support.v4.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.e = motionEvent.getX();
            this.f = false;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.e);
            if (this.f || abs > this.d) {
                this.f = true;
                z = false;
                if (z || !super.onInterceptTouchEvent(motionEvent)) {
                    return false;
                }
                e.a(this, motionEvent);
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return true;
            }
        }
        z = true;
        if (z) {
        }
        return false;
    }
}

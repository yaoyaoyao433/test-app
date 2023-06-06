package com.facebook.react.touch;

import android.support.annotation.Nullable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a implements b {
    public volatile int a = -1;
    @Nullable
    private ViewParent b;

    public final void a(int i, @Nullable ViewParent viewParent) {
        this.a = i;
        a();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
            this.b = viewParent;
        }
    }

    public void a() {
        if (this.b != null) {
            this.b.requestDisallowInterceptTouchEvent(false);
            this.b = null;
        }
    }

    @Override // com.facebook.react.touch.b
    public final boolean a(ViewGroup viewGroup, MotionEvent motionEvent) {
        int i = this.a;
        return (i == -1 || motionEvent.getAction() == 1 || viewGroup.getId() != i) ? false : true;
    }
}

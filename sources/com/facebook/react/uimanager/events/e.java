package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.ak;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class e {
    public static void a(View view, MotionEvent motionEvent) {
        ak.a(view).onChildStartedNativeGesture(motionEvent);
    }
}

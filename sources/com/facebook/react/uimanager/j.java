package com.facebook.react.uimanager;

import android.view.MotionEvent;
import android.view.ViewGroup;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class j {
    protected final ViewGroup e;
    protected int a = -1;
    protected final float[] b = new float[2];
    protected boolean c = false;
    protected long d = Long.MIN_VALUE;
    protected final com.facebook.react.uimanager.events.g f = new com.facebook.react.uimanager.events.g();

    public j(ViewGroup viewGroup) {
        this.e = viewGroup;
    }

    public void a(MotionEvent motionEvent, com.facebook.react.uimanager.events.c cVar) {
        if (this.c) {
            return;
        }
        c(motionEvent, cVar);
        this.c = true;
        this.a = -1;
    }

    public void b(MotionEvent motionEvent, com.facebook.react.uimanager.events.c cVar) {
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            if (this.a != -1) {
                com.facebook.common.logging.a.d("ReactNative", "Got DOWN touch before receiving UP or CANCEL from last gesture");
            }
            this.c = false;
            this.d = motionEvent.getEventTime();
            this.a = a(motionEvent);
            cVar.a(com.facebook.react.uimanager.events.f.a(this.a, com.facebook.react.uimanager.events.h.START, motionEvent, this.d, this.b[0], this.b[1], this.f));
        } else if (this.c) {
        } else {
            if (this.a == -1) {
                com.facebook.common.logging.a.d("ReactNative", "Unexpected state: received touch event but didn't get starting ACTION_DOWN for this gesture before");
            } else if (action == 1) {
                a(motionEvent);
                cVar.a(com.facebook.react.uimanager.events.f.a(this.a, com.facebook.react.uimanager.events.h.END, motionEvent, this.d, this.b[0], this.b[1], this.f));
                this.a = -1;
                this.d = Long.MIN_VALUE;
            } else if (action == 2) {
                a(motionEvent);
                cVar.a(com.facebook.react.uimanager.events.f.a(this.a, com.facebook.react.uimanager.events.h.MOVE, motionEvent, this.d, this.b[0], this.b[1], this.f));
            } else if (action == 5) {
                cVar.a(com.facebook.react.uimanager.events.f.a(this.a, com.facebook.react.uimanager.events.h.START, motionEvent, this.d, this.b[0], this.b[1], this.f));
            } else if (action == 6) {
                cVar.a(com.facebook.react.uimanager.events.f.a(this.a, com.facebook.react.uimanager.events.h.END, motionEvent, this.d, this.b[0], this.b[1], this.f));
            } else if (action == 3) {
                if (this.f.e(motionEvent.getDownTime())) {
                    c(motionEvent, cVar);
                } else {
                    com.facebook.common.logging.a.d("ReactNative", "Received an ACTION_CANCEL touch event for which we have no corresponding ACTION_DOWN");
                }
                this.a = -1;
                this.d = Long.MIN_VALUE;
            } else {
                com.facebook.common.logging.a.c("ReactNative", "Warning : touch event was ignored. Action=" + action + " Target=" + this.a);
            }
        }
    }

    private int a(MotionEvent motionEvent) {
        return ap.a(motionEvent.getX(), motionEvent.getY(), this.e, this.b, (int[]) null);
    }

    private void c(MotionEvent motionEvent, com.facebook.react.uimanager.events.c cVar) {
        if (this.a == -1) {
            com.facebook.common.logging.a.c("ReactNative", "Can't cancel already finished gesture. Is a child View trying to start a gesture from an UP/CANCEL event?");
            return;
        }
        com.facebook.infer.annotation.a.a(!this.c, "Expected to not have already sent a cancel for this gesture");
        ((com.facebook.react.uimanager.events.c) com.facebook.infer.annotation.a.a(cVar)).a(com.facebook.react.uimanager.events.f.a(this.a, com.facebook.react.uimanager.events.h.CANCEL, motionEvent, this.d, this.b[0], this.b[1], this.f));
    }
}

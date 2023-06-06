package com.swmansion.gesturehandler;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class j extends b<j> {
    private static float O = Float.MAX_VALUE;
    private static float P = Float.MIN_VALUE;
    private static int Q = 1;
    private static int R = 10;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public boolean N;
    private float S;
    private VelocityTracker T;
    public float a = O;
    public float b = P;
    public float u = P;
    public float v = O;
    public float w = O;
    public float x = P;
    public float y = P;
    public float z = O;
    public float A = O;
    public float B = O;
    public float C = O;
    public int D = Q;
    public int E = R;

    public j(Context context) {
        this.S = P;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.S = scaledTouchSlop * scaledTouchSlop;
    }

    public final j a(float f) {
        this.S = f * f;
        return this;
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void b() {
        if (this.T != null) {
            this.T.recycle();
            this.T = null;
        }
    }

    private static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX() - motionEvent.getX();
        float rawY = motionEvent.getRawY() - motionEvent.getY();
        motionEvent.offsetLocation(rawX, rawY);
        velocityTracker.addMovement(motionEvent);
        motionEvent.offsetLocation(-rawX, -rawY);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011d  */
    @Override // com.swmansion.gesturehandler.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void a(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.j.a(android.view.MotionEvent):void");
    }
}

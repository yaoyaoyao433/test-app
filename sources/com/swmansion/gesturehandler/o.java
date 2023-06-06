package com.swmansion.gesturehandler;

import android.os.Handler;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class o extends b<o> {
    private static float z = Float.MIN_VALUE;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private Handler H;
    private int I;
    public float a = z;
    public float b = z;
    public float u = z;
    public long v = 500;
    public long w = 500;
    public int x = 1;
    public int y = 1;
    private int A = 1;
    private final Runnable J = new Runnable() { // from class: com.swmansion.gesturehandler.o.1
        @Override // java.lang.Runnable
        public final void run() {
            o.this.c();
        }
    };

    public o() {
        this.m = true;
    }

    private void j() {
        if (this.H == null) {
            this.H = new Handler();
        } else {
            this.H.removeCallbacksAndMessages(null);
        }
        this.H.postDelayed(this.J, this.v);
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void a() {
        if (this.H != null) {
            this.H.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.swmansion.gesturehandler.b
    protected final void b() {
        this.I = 0;
        this.A = 0;
        if (this.H != null) {
            this.H.removeCallbacksAndMessages(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    @Override // com.swmansion.gesturehandler.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void a(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.o.a(android.view.MotionEvent):void");
    }
}

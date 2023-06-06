package uk.co.senab.photoview.gestures;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.MotionEvent;
/* compiled from: ProGuard */
@TargetApi(5)
/* loaded from: classes7.dex */
public class b extends a {
    private int f;
    private int g;

    public b(Context context) {
        super(context);
        this.f = -1;
        this.g = 0;
    }

    @Override // uk.co.senab.photoview.gestures.a
    final float a(MotionEvent motionEvent) {
        try {
            return motionEvent.getX(this.g);
        } catch (Exception unused) {
            return motionEvent.getX();
        }
    }

    @Override // uk.co.senab.photoview.gestures.a
    final float b(MotionEvent motionEvent) {
        try {
            return motionEvent.getY(this.g);
        } catch (Exception unused) {
            return motionEvent.getY();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    @Override // uk.co.senab.photoview.gestures.a, uk.co.senab.photoview.gestures.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 3
            r2 = -1
            r3 = 0
            if (r0 == r1) goto L45
            r1 = 6
            if (r0 == r1) goto L19
            switch(r0) {
                case 0: goto L12;
                case 1: goto L45;
                default: goto L11;
            }
        L11:
            goto L47
        L12:
            int r0 = r6.getPointerId(r3)
            r5.f = r0
            goto L47
        L19:
            int r0 = r6.getAction()
            int r1 = android.os.Build.VERSION.SDK_INT
            r1 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            int r0 = r0 >> 8
            int r1 = r6.getPointerId(r0)
            int r4 = r5.f
            if (r1 != r4) goto L47
            if (r0 != 0) goto L31
            r0 = 1
            goto L32
        L31:
            r0 = 0
        L32:
            int r1 = r6.getPointerId(r0)
            r5.f = r1
            float r1 = r6.getX(r0)
            r5.b = r1
            float r0 = r6.getY(r0)
            r5.c = r0
            goto L47
        L45:
            r5.f = r2
        L47:
            int r0 = r5.f
            if (r0 == r2) goto L4d
            int r3 = r5.f
        L4d:
            int r0 = r6.findPointerIndex(r3)
            r5.g = r0
            boolean r6 = super.c(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.senab.photoview.gestures.b.c(android.view.MotionEvent):boolean");
    }
}

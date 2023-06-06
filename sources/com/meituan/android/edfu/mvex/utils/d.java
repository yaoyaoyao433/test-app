package com.meituan.android.edfu.mvex.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.Handler;
import android.os.Looper;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d implements SensorEventListener {
    public static ChangeQuickRedirect a = null;
    private static final String f = "d";
    public Sensor b;
    public MtSensorManager c;
    public a d;
    public Handler e;
    private Context g;
    private float h;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(boolean z);
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public d(Context context, float f2) {
        Object[] objArr = {context, Float.valueOf(10.0f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e72f3fa31d262225014e137d1219d499", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e72f3fa31d262225014e137d1219d499");
            return;
        }
        this.h = -1.0f;
        this.g = context;
        this.h = 10.0f;
        this.e = new Handler(Looper.getMainLooper());
        this.c = Privacy.createSensorManager(context, "com.meituan.android.edfu:mvex");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r13 >= 450.0f) goto L15;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSensorChanged(android.hardware.SensorEvent r13) {
        /*
            r12 = this;
            r0 = 1
            java.lang.Object[] r8 = new java.lang.Object[r0]
            r9 = 0
            r8[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.edfu.mvex.utils.d.a
            java.lang.String r11 = "4dc1188ef1ea8d9a40a376caae7c4fb1"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1b
            com.meituan.robust.PatchProxy.accessDispatch(r8, r12, r10, r9, r11)
            return
        L1b:
            float[] r13 = r13.values
            r13 = r13[r9]
            com.meituan.android.edfu.mvex.utils.d$a r1 = r12.d
            if (r1 == 0) goto L4e
            float r1 = r12.h
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L3d
            r1 = 1110704128(0x42340000, float:45.0)
            int r1 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r1 > 0) goto L36
            com.meituan.android.edfu.mvex.utils.d$a r13 = r12.d
            r13.a(r0)
            goto L4e
        L36:
            r0 = 1138819072(0x43e10000, float:450.0)
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 < 0) goto L4e
            goto L49
        L3d:
            float r1 = r12.h
            int r13 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r13 >= 0) goto L49
            com.meituan.android.edfu.mvex.utils.d$a r13 = r12.d
            r13.a(r0)
            goto L4e
        L49:
            com.meituan.android.edfu.mvex.utils.d$a r13 = r12.d
            r13.a(r9)
        L4e:
            android.os.Handler r13 = r12.e
            r0 = 0
            r13.removeCallbacksAndMessages(r0)
            android.os.Handler r13 = r12.e
            com.meituan.android.edfu.mvex.utils.d$1 r0 = new com.meituan.android.edfu.mvex.utils.d$1
            r0.<init>()
            r1 = 500(0x1f4, double:2.47E-321)
            r13.postDelayed(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.edfu.mvex.utils.d.onSensorChanged(android.hardware.SensorEvent):void");
    }
}

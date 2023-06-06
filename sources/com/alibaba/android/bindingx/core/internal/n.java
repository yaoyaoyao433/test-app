package com.alibaba.android.bindingx.core.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class n implements SensorEventListener {
    private static n j;
    private static final Object k = new Object();
    private static final Set<Integer> l = t.a((Object[]) new Integer[]{15});
    private static final Set<Integer> m = t.a((Object[]) new Integer[]{11});
    private static final Set<Integer> n = t.a((Object[]) new Integer[]{1, 2});
    @VisibleForTesting
    q a;
    private HandlerThread c;
    private Handler d;
    private final Context e;
    private float[] f;
    private float[] g;
    private float[] h;
    private double[] i;
    private final List<Set<Integer>> p;
    private Set<Integer> q;
    private boolean r;
    private boolean s;
    private boolean t;
    private final Set<Integer> o = new HashSet();
    ArrayList<a> b = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(double d, double d2, double d3);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    private n(@NonNull Context context) {
        this.e = context.getApplicationContext();
        Set[] setArr = {l, m, n};
        ArrayList arrayList = new ArrayList(3);
        Collections.addAll(arrayList, setArr);
        this.p = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n a(Context context) {
        n nVar;
        synchronized (k) {
            if (j == null) {
                j = new n(context);
            }
            nVar = j;
        }
        return nVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(@Nullable a aVar) {
        if (this.b != null) {
            return this.b.remove(aVar);
        }
        return false;
    }

    private boolean b(int i) {
        if (this.t) {
            return false;
        }
        if (this.q != null) {
            String b = b();
            com.alibaba.android.bindingx.core.d.a("[OrientationDetector] register sensor:" + b);
            return a(this.q, i, true);
        }
        if (this.h == null) {
            this.h = new float[9];
        }
        if (this.i == null) {
            this.i = new double[3];
        }
        if (this.g == null) {
            this.g = new float[4];
        }
        for (Set<Integer> set : this.p) {
            this.q = set;
            if (a(this.q, i, true)) {
                String b2 = b();
                com.alibaba.android.bindingx.core.d.a("[OrientationDetector] register sensor:" + b2);
                return true;
            }
        }
        this.t = true;
        this.q = null;
        this.h = null;
        this.i = null;
        return false;
    }

    private String b() {
        return this.t ? "NOT_AVAILABLE" : this.q == l ? "GAME_ROTATION_VECTOR" : this.q == m ? "ROTATION_VECTOR" : this.q == n ? "ACCELEROMETER_MAGNETIC" : "NOT_AVAILABLE";
    }

    public final boolean a(int i) {
        com.alibaba.android.bindingx.core.d.a("[OrientationDetector] sensor started");
        boolean b = b(1);
        if (b) {
            a(true);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        com.alibaba.android.bindingx.core.d.a("[OrientationDetector] sensor stopped");
        a(new HashSet(this.o));
        a(false);
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        float[] fArr = sensorEvent.values;
        if (type == 11) {
            if (this.r && this.q == m) {
                b(fArr, this.i);
                a(this.i[0], this.i[1], this.i[2]);
            }
        } else if (type != 15) {
            switch (type) {
                case 1:
                    if (this.s) {
                        float[] fArr2 = this.f;
                        if (fArr == null || fArr2 == null || !SensorManager.getRotationMatrix(this.h, null, fArr, fArr2)) {
                            return;
                        }
                        a(this.h, this.i);
                        a(Math.toDegrees(this.i[0]), Math.toDegrees(this.i[1]), Math.toDegrees(this.i[2]));
                        return;
                    }
                    return;
                case 2:
                    if (this.s) {
                        if (this.f == null) {
                            this.f = new float[3];
                        }
                        System.arraycopy(fArr, 0, this.f, 0, this.f.length);
                        return;
                    }
                    return;
                default:
                    com.alibaba.android.bindingx.core.d.c("unexpected sensor type:" + type);
                    return;
            }
        } else if (this.r) {
            b(fArr, this.i);
            a(this.i[0], this.i[1], this.i[2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static double[] a(float[] r16, double[] r17) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.bindingx.core.internal.n.a(float[], double[]):double[]");
    }

    private void b(float[] fArr, double[] dArr) {
        if (fArr.length > 4) {
            System.arraycopy(fArr, 0, this.g, 0, 4);
            SensorManager.getRotationMatrixFromVector(this.h, this.g);
        } else {
            SensorManager.getRotationMatrixFromVector(this.h, fArr);
        }
        a(this.h, dArr);
        for (int i = 0; i < 3; i++) {
            dArr[i] = Math.toDegrees(dArr[i]);
        }
    }

    private q c() {
        if (this.a != null) {
            return this.a;
        }
        MtSensorManager createSensorManager = Privacy.createSensorManager(this.e, "");
        if (createSensorManager != null) {
            this.a = new r(createSensorManager);
        }
        return this.a;
    }

    private void a(boolean z) {
        this.r = z;
        this.s = z && this.q == n;
    }

    private boolean a(Set<Integer> set, int i, boolean z) {
        boolean a2;
        HashSet<Integer> hashSet = new HashSet(set);
        hashSet.removeAll(this.o);
        if (hashSet.isEmpty()) {
            return true;
        }
        boolean z2 = false;
        for (Integer num : hashSet) {
            int intValue = num.intValue();
            q c = c();
            if (c == null) {
                a2 = false;
            } else {
                if (this.d == null) {
                    this.c = new HandlerThread("DeviceOrientation");
                    this.c.start();
                    this.d = new Handler(this.c.getLooper());
                }
                a2 = c.a(this, intValue, i, this.d);
            }
            if (!a2) {
                a(hashSet);
                return false;
            } else if (a2) {
                this.o.add(num);
                z2 = true;
            }
        }
        return z2;
    }

    private void a(Iterable<Integer> iterable) {
        for (Integer num : iterable) {
            if (this.o.contains(num)) {
                c().a(this, num.intValue());
                this.o.remove(num);
            }
        }
    }

    @VisibleForTesting
    private void a(double d, double d2, double d3) {
        if (this.b != null) {
            try {
                Iterator<a> it = this.b.iterator();
                while (it.hasNext()) {
                    it.next().a(d, d2, d3);
                }
            } catch (Throwable th) {
                com.alibaba.android.bindingx.core.d.a("[OrientationDetector] ", th);
            }
        }
    }
}

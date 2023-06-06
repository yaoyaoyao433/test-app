package com.meituan.android.common.locate.provider;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.util.Pair;
import com.meituan.android.common.locate.sensor.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes2.dex */
public class i {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile i e;
    private Context a;
    private final int b;
    private final List<Pair<Long, Float>> c;
    private boolean d;
    private a.InterfaceC0223a f;

    public i(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ea6086e63422d81078f9acf026ef4c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ea6086e63422d81078f9acf026ef4c5");
            return;
        }
        this.b = 1000000;
        this.c = new LinkedList();
        this.d = false;
        this.f = new a.InterfaceC0223a() { // from class: com.meituan.android.common.locate.provider.i.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.locate.sensor.a.InterfaceC0223a
            public int a() {
                return 4096;
            }

            @Override // com.meituan.android.common.locate.sensor.a.InterfaceC0223a
            public long b() {
                return 500L;
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "c581921e43677527a434f2ee54bf9148", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "c581921e43677527a434f2ee54bf9148");
                } else if (sensorEvent != null && sensorEvent.sensor.getType() == 6) {
                    float round = Math.round(sensorEvent.values[0] * 100.0f) / 1000.0f;
                    if (round > 1000000.0f) {
                        round = 1000000.0f;
                    }
                    int b = com.meituan.android.common.locate.reporter.q.a(i.this.a).b();
                    Pair<Long, Float> pair = new Pair<>(Long.valueOf(System.currentTimeMillis()), Float.valueOf(round));
                    i.this.c.add(pair);
                    while (i.this.c.size() > b) {
                        i.this.c.remove(0);
                    }
                    com.meituan.android.common.locate.fusionlocation.a.a().d(pair);
                }
            }
        };
        this.a = context;
    }

    public static i a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "35ecad0e5c5ca70cd6258fc1538793b7", RobustBitConfig.DEFAULT_VALUE)) {
            return (i) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "35ecad0e5c5ca70cd6258fc1538793b7");
        }
        if (e == null) {
            synchronized (i.class) {
                if (e == null) {
                    e = new i(context);
                }
            }
        }
        return e;
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2288c624c3be99f7380c4c1d9471ab7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2288c624c3be99f7380c4c1d9471ab7d");
        } else if (this.f == null || !com.meituan.android.common.locate.reporter.q.a(this.a).a()) {
        } else {
            com.meituan.android.common.locate.sensor.a.a(this.a).a(this.f);
            this.d = true;
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a7b997db7b111606b09fc0520cf66334", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a7b997db7b111606b09fc0520cf66334");
            return;
        }
        com.meituan.android.common.locate.sensor.a.a(this.a).b(this.f);
        this.d = false;
    }

    public boolean c() {
        return this.d;
    }
}

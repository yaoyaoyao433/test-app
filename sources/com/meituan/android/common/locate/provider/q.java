package com.meituan.android.common.locate.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.NonNull;
import android.util.Pair;
import com.meituan.android.common.locate.reporter.u;
import com.meituan.android.common.locate.sensor.a;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class q {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile q e;
    private Context a;
    private final int b;
    private final List<Pair<Long, Float>> c;
    private volatile boolean d;
    private final int f;
    private final int g;
    private long h;
    private Thread i;
    private Handler j;
    private Boolean k;
    private long l;
    private a.InterfaceC0223a m;

    @SuppressLint({"HandlerLeak"})
    public q(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dcf862ce2d5630af3fa30cd88387c64e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dcf862ce2d5630af3fa30cd88387c64e");
            return;
        }
        this.b = 1000000;
        this.c = new LinkedList();
        this.d = false;
        this.f = 1;
        this.g = 2;
        this.h = MetricsAnrManager.ANR_THRESHOLD;
        this.k = Boolean.FALSE;
        this.l = 30000L;
        this.m = new a.InterfaceC0223a() { // from class: com.meituan.android.common.locate.provider.q.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.locate.sensor.a.InterfaceC0223a
            public int a() {
                return 4096;
            }

            @Override // com.meituan.android.common.locate.sensor.a.InterfaceC0223a
            public long b() {
                return 0L;
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "9261b83d80f7f497589a4b060a537c8b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "9261b83d80f7f497589a4b060a537c8b");
                } else if (sensorEvent != null && sensorEvent.sensor.getType() == 6) {
                    float round = Math.round(sensorEvent.values[0] * 100.0f) / 1000.0f;
                    if (round > 1000000.0f) {
                        round = 1000000.0f;
                    }
                    LogUtils.a("PressureDate:" + round);
                    int q = u.a(q.this.a).q();
                    q.this.c.add(new Pair(Long.valueOf(System.currentTimeMillis()), Float.valueOf(round)));
                    while (q.this.c.size() > q) {
                        q.this.c.remove(0);
                    }
                }
            }
        };
        if (context == null) {
            return;
        }
        try {
            LogUtils.a("PressureSensorProvider oncreate");
            this.a = context.getApplicationContext();
            if (this.i == null) {
                this.i = com.sankuai.android.jarvis.c.a("pressure_sensor_thread", new Runnable() { // from class: com.meituan.android.common.locate.provider.q.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7fb4a3ae496b94b9438119bddfe8891a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7fb4a3ae496b94b9438119bddfe8891a");
                            return;
                        }
                        Looper.prepare();
                        q.this.j = new Handler() { // from class: com.meituan.android.common.locate.provider.q.1.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // android.os.Handler
                            public void handleMessage(@NonNull Message message) {
                                Object[] objArr3 = {message};
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "e32a06460c69203117037dfdb106324d", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "e32a06460c69203117037dfdb106324d");
                                    return;
                                }
                                switch (message.what) {
                                    case 1:
                                        q.this.c();
                                        q.this.j.sendEmptyMessageDelayed(1, q.this.l);
                                        return;
                                    case 2:
                                        q.this.e();
                                        return;
                                    default:
                                        return;
                                }
                            }
                        };
                        Looper.loop();
                    }
                });
            }
            this.i.start();
            if (!this.i.isAlive()) {
                this.i.start();
            }
            this.k = Boolean.TRUE;
        } catch (Exception e2) {
            LogUtils.a("PressureSensorProvider init exception: " + e2.getMessage());
        }
    }

    public static q a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "91787a5bfaca884a1a84128ea0a63d68", RobustBitConfig.DEFAULT_VALUE)) {
            return (q) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "91787a5bfaca884a1a84128ea0a63d68");
        }
        if (e == null) {
            synchronized (q.class) {
                if (e == null) {
                    e = new q(context);
                }
            }
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "29fd4df8bd30359c2b6ab7e57232fc60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "29fd4df8bd30359c2b6ab7e57232fc60");
            return;
        }
        d();
        this.l = u.a(this.a).s();
        this.h = u.a(this.a).r();
        if (this.l > this.h) {
            if (this.j.hasMessages(2)) {
                this.j.removeMessages(2);
            }
            this.j.sendEmptyMessageDelayed(2, this.h);
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "146c0eaf93256265979af30af56be1ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "146c0eaf93256265979af30af56be1ed");
            return;
        }
        try {
            if (this.m == null || !u.a(this.a).o() || this.d) {
                com.meituan.android.common.locate.platform.logs.c.a(" PressureSensorProvider::noPressureSensor", 3);
                return;
            }
            this.d = true;
            this.c.clear();
            com.meituan.android.common.locate.sensor.a.a(this.a).a(this.m);
            com.meituan.android.common.locate.platform.logs.c.a(" PressureSensorProvider::registerPressureSensor", 3);
        } catch (Exception e2) {
            LogUtils.a(" PressureSensorProvider:" + e2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e3a8f885a30db9fee4faa2adf21891c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e3a8f885a30db9fee4faa2adf21891c");
        } else if (this.d) {
            com.meituan.android.common.locate.sensor.a.a(this.a).b(this.m);
            com.meituan.android.common.locate.platform.logs.c.a(" PressureSensorProvider::unregisterPressureSensor", 3);
            this.d = false;
            JSONObject jSONObject = new JSONObject();
            a(jSONObject);
            if (jSONObject.length() > 0) {
                com.meituan.android.common.locate.platform.logs.m.a().a(jSONObject.toString());
            }
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a1534797e73abdcebd00c5f23390a201", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a1534797e73abdcebd00c5f23390a201");
            return;
        }
        try {
            if (this.j != null && this.k.booleanValue() && u.a(this.a).o()) {
                if (this.j.hasMessages(1)) {
                    this.j.removeMessages(1);
                }
                this.j.sendEmptyMessage(1);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "379bffc9ac75b875d0c9051f575265be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "379bffc9ac75b875d0c9051f575265be");
            return;
        }
        try {
            if (!u.a(this.a).o()) {
                LogUtils.a(" PressureSensorProvider::no open");
                return;
            }
            LinkedList<Pair> linkedList = new LinkedList();
            linkedList.addAll(this.c);
            if (u.a(this.a).q() > 0 && linkedList.size() != 0) {
                int q = u.a(this.a).q();
                while (linkedList.size() > q) {
                    linkedList.remove(0);
                }
                if (linkedList.size() <= 0) {
                    com.meituan.android.common.locate.platform.logs.c.a(" PressureSensorProvider::addPressureForLocate Pressure data is empty by remove", 3);
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", ((Pair) linkedList.get(0)).first);
                LinkedList linkedList2 = new LinkedList();
                for (Pair pair : linkedList) {
                    linkedList2.add(pair.second);
                }
                jSONObject2.put("value", new JSONArray((Collection) linkedList2));
                jSONObject.put("air_pressure_sensor", jSONObject2);
                return;
            }
            com.meituan.android.common.locate.platform.logs.c.a(" PressureSensorProvider::addPressureForLocate Pressure data is empty", 3);
        } catch (Exception e2) {
            LogUtils.a(e2);
        }
    }

    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8385267795cf3127576bca630e6ec731", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8385267795cf3127576bca630e6ec731");
            return;
        }
        try {
            if (this.j != null) {
                if (this.j.hasMessages(1)) {
                    this.j.removeMessages(1);
                }
                if (this.j.hasMessages(2)) {
                    this.j.removeMessages(2);
                }
            }
            e();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}

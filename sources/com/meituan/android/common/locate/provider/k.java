package com.meituan.android.common.locate.provider;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.meituan.android.common.locate.platform.sniffer.c;
import com.meituan.android.common.locate.reporter.u;
import com.meituan.android.common.locate.util.LogUtils;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public class k {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile k g;
    private Context a;
    private final int b;
    private final List<Pair<Long, Integer>> c;
    private MtSensorManager d;
    private Sensor e;
    private volatile boolean f;
    private Thread h;
    private Handler i;
    private final SensorEventListener j;

    public k(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4f5b0cd21b80298f5e14350ba5e9032", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4f5b0cd21b80298f5e14350ba5e9032");
            return;
        }
        this.b = 1000000;
        this.c = new LinkedList();
        this.f = false;
        this.j = new SensorEventListener() { // from class: com.meituan.android.common.locate.provider.k.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "abd98b57d4115573f24e97d6891e49b0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "abd98b57d4115573f24e97d6891e49b0");
                    return;
                }
                int i = (int) sensorEvent.values[0];
                if (i > 1000000) {
                    i = 1000000;
                }
                int p = u.a(k.this.a).p();
                Pair<Long, Integer> pair = new Pair<>(Long.valueOf(System.currentTimeMillis()), Integer.valueOf(i));
                k.this.c.add(pair);
                while (k.this.c.size() > p) {
                    k.this.c.remove(0);
                }
                com.meituan.android.common.locate.fusionlocation.a.a().c(pair);
            }
        };
        try {
            LogUtils.a("LightSensorProvider oncreate");
            this.a = context.getApplicationContext();
            this.d = Privacy.createSensorManager(context, "pt-c140c5921e4d3392");
            this.e = this.d.getDefaultSensor(5);
            if (this.h == null) {
                this.h = com.sankuai.android.jarvis.c.a("light_sensor_thread", new Runnable() { // from class: com.meituan.android.common.locate.provider.k.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // java.lang.Runnable
                    public void run() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8d574197deb91f21bf75b2cd208ec2f4", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8d574197deb91f21bf75b2cd208ec2f4");
                            return;
                        }
                        Looper.prepare();
                        k.this.i = new Handler();
                        Looper.loop();
                    }
                });
            }
            if (!this.h.isAlive()) {
                this.h.start();
            }
            a();
            b();
        } catch (Exception e) {
            LogUtils.a("LightSensorProvider init exception: " + e.getMessage());
        }
    }

    public static k a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0b10f8f910f8e8c663aa2a5aaf985690", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0b10f8f910f8e8c663aa2a5aaf985690");
        }
        if (g == null) {
            synchronized (k.class) {
                if (g == null) {
                    g = new k(context);
                }
            }
        }
        return g;
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ebb14718bf469adb85cbb4683eac4ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ebb14718bf469adb85cbb4683eac4ca");
            return;
        }
        StringBuilder sb = new StringBuilder("LightSensorProvider have light sensor ");
        sb.append(this.e != null);
        com.meituan.android.common.locate.platform.logs.c.a(sb.toString(), 3);
        if (this.e != null) {
            com.meituan.android.common.locate.platform.sniffer.b.a(new c.a("light_sensor_get", "type_light_sensor_success", "", ""));
        } else {
            com.meituan.android.common.locate.platform.sniffer.b.b(new c.a("light_sensor_get", "type_light_sensor_null", "", ""));
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da8abbe1c914db132496d730e8e029c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da8abbe1c914db132496d730e8e029c7");
        } else if (this.e == null || !u.a(this.a).n() || this.f) {
        } else {
            this.f = true;
            if (this.h == null || !this.h.isAlive()) {
                this.d.registerListener(this.j, this.e, 2);
            } else {
                this.d.registerListener(this.j, this.e, 2, this.i);
            }
            com.meituan.android.common.locate.platform.logs.c.a(" LightSensorProvider::registerLightSensor", 3);
        }
    }

    public void a(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ece6816945cb7f0361d5cd13d38daf76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ece6816945cb7f0361d5cd13d38daf76");
            return;
        }
        LinkedList<Pair> linkedList = new LinkedList();
        linkedList.addAll(this.c);
        if (u.a(this.a).p() <= 0 || linkedList.size() == 0) {
            com.meituan.android.common.locate.platform.logs.c.a(" LightSensorProvider::addLightForLocate light data is empty", 3);
            return;
        }
        int p = u.a(this.a).p();
        while (linkedList.size() > p) {
            linkedList.remove(0);
        }
        try {
            if (linkedList.size() <= 0) {
                com.meituan.android.common.locate.platform.logs.c.a(" LightSensorProvider::addLightForLocate light data is empty by remove", 3);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("id", ((Pair) linkedList.get(0)).first);
            LinkedList linkedList2 = new LinkedList();
            for (Pair pair : linkedList) {
                linkedList2.add(pair.second);
            }
            jSONObject2.put("value", new JSONArray((Collection) linkedList2));
            jSONObject.put("light_sensor", jSONObject2);
        } catch (Exception e) {
            LogUtils.a(e);
        }
    }
}

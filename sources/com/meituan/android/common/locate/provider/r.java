package com.meituan.android.common.locate.provider;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import com.meituan.android.common.locate.MtLocation;
import com.meituan.android.common.locate.sensor.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* loaded from: classes2.dex */
public class r extends com.meituan.android.common.locate.util.r {
    private static volatile r a;
    private static volatile Map<Object, com.meituan.android.common.locate.posdrift.c> b = new ConcurrentHashMap();
    public static ChangeQuickRedirect changeQuickRedirect;
    private double c;
    private a.InterfaceC0223a d;

    public r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ae3aa4bbb79ae92023c5f1004f5a51c4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ae3aa4bbb79ae92023c5f1004f5a51c4");
            return;
        }
        this.c = 50.0d;
        this.d = new a.InterfaceC0223a() { // from class: com.meituan.android.common.locate.provider.r.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.android.common.locate.sensor.a.InterfaceC0223a
            public int a() {
                return 257;
            }

            @Override // com.meituan.android.common.locate.sensor.a.InterfaceC0223a
            public long b() {
                return 1000L;
            }

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "05ebea143b4f9ab57139a9ca9c4dff10", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "05ebea143b4f9ab57139a9ca9c4dff10");
                    return;
                }
                try {
                    synchronized (r.b) {
                        if (sensorEvent.sensor.getType() == 4) {
                            if (r.b != null && r.b.size() != 0) {
                                for (Map.Entry entry : r.b.entrySet()) {
                                    com.meituan.android.common.locate.posdrift.c cVar = (com.meituan.android.common.locate.posdrift.c) entry.getValue();
                                    if (cVar != null) {
                                        cVar.a(com.meituan.android.common.locate.posdrift.g.c, sensorEvent.timestamp, sensorEvent.values);
                                    }
                                }
                            }
                            return;
                        }
                        if (sensorEvent.sensor.getType() == 1) {
                            if (r.b != null && r.b.size() != 0) {
                                for (Map.Entry entry2 : r.b.entrySet()) {
                                    com.meituan.android.common.locate.posdrift.c cVar2 = (com.meituan.android.common.locate.posdrift.c) entry2.getValue();
                                    if (cVar2 != null) {
                                        cVar2.a(com.meituan.android.common.locate.posdrift.g.a, sensorEvent.timestamp, new float[]{sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]});
                                    }
                                }
                            }
                        }
                    }
                } catch (Exception e) {
                    com.meituan.android.common.locate.platform.logs.c.a("PreventShakingAppender-onSensorChanged:" + e.getMessage(), 3);
                }
            }
        };
    }

    public static r d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2590ec365c0250b70c181b569d3ce2ad", RobustBitConfig.DEFAULT_VALUE)) {
            return (r) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2590ec365c0250b70c181b569d3ce2ad");
        }
        if (a == null) {
            synchronized (r.class) {
                if (a == null) {
                    a = new r();
                }
            }
        }
        return a;
    }

    public MtLocation a(Object obj, MtLocation mtLocation) {
        Object[] objArr = {obj, mtLocation};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "977badda4e5b77fa9f94b6c16c8b7ee8", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtLocation) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "977badda4e5b77fa9f94b6c16c8b7ee8");
        }
        if (mtLocation == null) {
            return null;
        }
        synchronized (b) {
            if (b == null) {
                return mtLocation;
            }
            com.meituan.android.common.locate.posdrift.c cVar = b.get(obj);
            return cVar == null ? mtLocation : cVar.a(mtLocation);
        }
    }

    @Override // com.meituan.android.common.locate.util.r
    public String a() {
        return "PreventShakingAppender";
    }

    public synchronized void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7f1a800b6d40c9ce07432ff4eb60a55", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7f1a800b6d40c9ce07432ff4eb60a55");
            return;
        }
        super.h();
        synchronized (b) {
            if (b.get(obj) == null) {
                b.put(obj, new com.meituan.android.common.locate.posdrift.c(this.c));
            }
        }
    }

    @Override // com.meituan.android.common.locate.util.r
    public void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b76d785635ef198684282b9fc966a335", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b76d785635ef198684282b9fc966a335");
            return;
        }
        com.meituan.android.common.locate.sensor.a.a(g.a()).b(this.d);
        synchronized (b) {
            if (b != null) {
                b.clear();
            }
        }
    }

    public void b(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5055ded422b2ed2efe6513d496364bef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5055ded422b2ed2efe6513d496364bef");
            return;
        }
        super.i();
        synchronized (b) {
            if (b != null) {
                b.remove(obj);
            }
        }
    }

    @Override // com.meituan.android.common.locate.util.r
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a2d93215c346a3189302f8f864a85da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a2d93215c346a3189302f8f864a85da");
        } else {
            com.meituan.android.common.locate.sensor.a.a(g.a()).a(this.d);
        }
    }
}

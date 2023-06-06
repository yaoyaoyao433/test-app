package com.meituan.mmp.lib.map;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.annotation.NonNull;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.mmp.main.MMPEnvHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static Map<String, a> e = new HashMap();
    private C0419a b;
    private String c;
    private boolean d;
    private int f;

    public static synchronized a a(String str) {
        String str2;
        a aVar;
        MtSensorManager createSensorManager;
        synchronized (a.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fd24134fb20b2faa6dc1fa84e7c0bb3f", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fd24134fb20b2faa6dc1fa84e7c0bb3f");
            }
            if (str != null && str.length() != 0) {
                str2 = str;
                aVar = e.get(str2);
                if (aVar == null && (createSensorManager = Privacy.createSensorManager(MMPEnvHelper.getEnvInfo().getApplicationContext(), str)) != null) {
                    aVar = new a(createSensorManager, str);
                    e.put(str2, aVar);
                }
                return aVar;
            }
            str2 = "GearsDefault";
            aVar = e.get(str2);
            if (aVar == null) {
                aVar = new a(createSensorManager, str);
                e.put(str2, aVar);
            }
            return aVar;
        }
    }

    private static synchronized void b(String str) {
        synchronized (a.class) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4534e53361ff39276d2bf57747edf42a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4534e53361ff39276d2bf57747edf42a");
                return;
            }
            str = (str == null || str.length() == 0) ? "GearsDefault" : "GearsDefault";
            if (e.containsKey(str)) {
                e.remove(str);
            }
        }
    }

    private a(@NonNull MtSensorManager mtSensorManager, String str) {
        Object[] objArr = {mtSensorManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a91ecdcca2104d68bf073cb946eaaa21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a91ecdcca2104d68bf073cb946eaaa21");
            return;
        }
        this.c = "";
        this.d = false;
        this.f = 0;
        this.b = new C0419a(mtSensorManager);
        this.c = str;
    }

    public final synchronized void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89298d6e8ae80bf6c762662de50dc55d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89298d6e8ae80bf6c762662de50dc55d");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6c5e870cfa3c287a64b7284582f65e42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6c5e870cfa3c287a64b7284582f65e42");
            return;
        }
        this.f++;
        if (this.f == 1) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "681105473989142b8c63ef1d5c0314bb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "681105473989142b8c63ef1d5c0314bb");
            } else if (!this.d) {
                this.d = true;
                C0419a c0419a = this.b;
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = C0419a.a;
                if (PatchProxy.isSupport(objArr4, c0419a, changeQuickRedirect4, false, "0b8d5a97d331ad2398f8223d19c5a512", RobustBitConfig.DEFAULT_VALUE)) {
                    ((Boolean) PatchProxy.accessDispatch(objArr4, c0419a, changeQuickRedirect4, false, "0b8d5a97d331ad2398f8223d19c5a512")).booleanValue();
                } else if (!c0419a.i && c0419a.g != null && c0419a.h != null) {
                    if (c0419a.g != null) {
                        c0419a.f.registerListener(c0419a.j, c0419a.g, 3);
                    }
                    if (c0419a.h != null) {
                        c0419a.f.registerListener(c0419a.j, c0419a.h, 3);
                    }
                    c0419a.i = true;
                }
            }
        }
    }

    public final synchronized float b() {
        float floatValue;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dfa09d4d2ebb389de966f84e613cfa6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dfa09d4d2ebb389de966f84e613cfa6")).floatValue();
        }
        C0419a c0419a = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = C0419a.a;
        if (PatchProxy.isSupport(objArr2, c0419a, changeQuickRedirect2, false, "251afc7d25034358ac43ea51cbf24179", RobustBitConfig.DEFAULT_VALUE)) {
            floatValue = ((Float) PatchProxy.accessDispatch(objArr2, c0419a, changeQuickRedirect2, false, "251afc7d25034358ac43ea51cbf24179")).floatValue();
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = C0419a.a;
            if (PatchProxy.isSupport(objArr3, c0419a, changeQuickRedirect3, false, "cce7ee3b7e4ad674a5994f87e9f5e313", RobustBitConfig.DEFAULT_VALUE)) {
                ((Boolean) PatchProxy.accessDispatch(objArr3, c0419a, changeQuickRedirect3, false, "cce7ee3b7e4ad674a5994f87e9f5e313")).booleanValue();
            } else if (c0419a.b != null && c0419a.c != null && SensorManager.getRotationMatrix(c0419a.d, null, c0419a.b, c0419a.c)) {
                SensorManager.getOrientation(c0419a.d, c0419a.e);
            }
            if (c0419a.e == null) {
                floatValue = 0.0f;
            } else {
                float f = c0419a.e[0];
                Object[] objArr4 = {Float.valueOf(f)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                floatValue = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "0407f7c6989c31c74c4eb23d220f01e3", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "0407f7c6989c31c74c4eb23d220f01e3")).floatValue() : (float) ((f * 180.0f) / 3.141592653589793d);
            }
        }
        return floatValue;
    }

    public final synchronized void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "219a871e7b8baa7b5d965d3425bf2fb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "219a871e7b8baa7b5d965d3425bf2fb1");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c973e75e9d16d67981c30b29c9d32553", RobustBitConfig.DEFAULT_VALUE)) {
            ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c973e75e9d16d67981c30b29c9d32553")).booleanValue();
        } else if (this.f != 0) {
            this.f--;
            if (this.f == 0) {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "986b883ab3f2e46e16f8a0296812bc32", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "986b883ab3f2e46e16f8a0296812bc32");
                } else if (this.d) {
                    this.d = false;
                    C0419a c0419a = this.b;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = C0419a.a;
                    if (PatchProxy.isSupport(objArr4, c0419a, changeQuickRedirect4, false, "fcc74b95429ae5546115aba9cf1a0735", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, c0419a, changeQuickRedirect4, false, "fcc74b95429ae5546115aba9cf1a0735");
                    } else if (c0419a.i) {
                        c0419a.f.unregisterListener(c0419a.j);
                        c0419a.i = false;
                    }
                    b(this.c);
                }
            }
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.mmp.lib.map.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static class C0419a {
        public static ChangeQuickRedirect a;
        float[] b;
        float[] c;
        float[] d;
        float[] e;
        MtSensorManager f;
        Sensor g;
        Sensor h;
        boolean i;
        SensorEventListener j;

        public C0419a(@NonNull MtSensorManager mtSensorManager) {
            Object[] objArr = {mtSensorManager};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3148bba71c4221c5a74f9bdfeb27001", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3148bba71c4221c5a74f9bdfeb27001");
                return;
            }
            this.d = new float[16];
            this.e = new float[3];
            this.i = false;
            this.j = new SensorEventListener() { // from class: com.meituan.mmp.lib.map.a.a.1
                public static ChangeQuickRedirect a;

                @Override // android.hardware.SensorEventListener
                public final void onAccuracyChanged(Sensor sensor, int i) {
                }

                @Override // android.hardware.SensorEventListener
                public final void onSensorChanged(SensorEvent sensorEvent) {
                    Object[] objArr2 = {sensorEvent};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "00d76316301721ebff794364efad9616", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "00d76316301721ebff794364efad9616");
                    } else if (sensorEvent == null) {
                    } else {
                        if (sensorEvent.sensor.getType() != 1) {
                            if (sensorEvent.sensor.getType() == 2) {
                                C0419a.this.c = (float[]) sensorEvent.values.clone();
                                return;
                            }
                            return;
                        }
                        C0419a.this.b = (float[]) sensorEvent.values.clone();
                    }
                }
            };
            this.f = mtSensorManager;
            this.g = this.f.getDefaultSensor(1);
            this.h = this.f.getDefaultSensor(2);
        }
    }
}

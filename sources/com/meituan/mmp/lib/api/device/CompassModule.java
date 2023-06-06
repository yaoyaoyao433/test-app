package com.meituan.mmp.lib.api.device;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.utils.u;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CompassModule extends DeviceModule<a> {
    public static ChangeQuickRedirect a;
    private Set<IApiCallback> i;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final boolean d() {
        return true;
    }

    public CompassModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38ed5863c5892874587d9231f678238e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38ed5863c5892874587d9231f678238e");
        } else {
            this.i = new HashSet();
        }
    }

    @Override // com.meituan.mmp.lib.api.device.DeviceModule
    public final /* synthetic */ a a(@NonNull MtSensorManager mtSensorManager, String str) {
        Object[] objArr = {mtSensorManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1f093ffb1488e7a12b6b44895d536a6", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1f093ffb1488e7a12b6b44895d536a6") : new a(getContext(), mtSensorManager, str, this.d);
    }

    @Override // com.meituan.mmp.lib.api.device.DeviceModule, com.meituan.mmp.lib.api.ServiceApi
    public final /* bridge */ /* synthetic */ void i() {
        super.i();
    }

    @Override // com.meituan.mmp.lib.api.device.DeviceModule, com.meituan.mmp.lib.api.AbsApi
    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    @Override // com.meituan.mmp.lib.api.device.DeviceModule, com.meituan.mmp.lib.api.AbsApi
    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b0e73a9cbf658d372007acdc7ed3700", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b0e73a9cbf658d372007acdc7ed3700") : new String[]{"startCompass", "stopCompass"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef5aad5333f5ae58bc6ee80996acda78", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef5aad5333f5ae58bc6ee80996acda78") : new String[]{"startCompass", "stopCompass", "onCompassChange"};
    }

    @Override // com.meituan.mmp.lib.api.device.DeviceModule
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f903b1aa43cb650a040533d7cbe3e60c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f903b1aa43cb650a040533d7cbe3e60c") : TextUtils.isEmpty(str) ? "CompassDefault" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r13.equals("startCompass") == false) goto L26;
     */
    @Override // com.meituan.mmp.lib.api.AbsApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.String r13, org.json.JSONObject r14, com.meituan.mmp.main.IApiCallback r15) {
        /*
            r12 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            r1 = 2
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mmp.lib.api.device.CompassModule.a
            java.lang.String r11 = "58c011212917dda6a10269407cf8e177"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            return
        L21:
            int r0 = r13.hashCode()
            r1 = -334289232(0xffffffffec1326b0, float:-7.115792E26)
            r2 = -1
            if (r0 == r1) goto L3b
            r1 = 816037456(0x30a3be50, float:1.1913901E-9)
            if (r0 == r1) goto L31
            goto L46
        L31:
            java.lang.String r0 = "startCompass"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L46
            goto L47
        L3b:
            java.lang.String r0 = "stopCompass"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L46
            r8 = 1
            goto L47
        L46:
            r8 = -1
        L47:
            switch(r8) {
                case 0: goto L60;
                case 1: goto L4b;
                default: goto L4a;
            }
        L4a:
            goto L7a
        L4b:
            java.lang.String r13 = com.meituan.mmp.lib.api.AbsApi.getToken(r14)
            com.meituan.mmp.lib.api.device.c r13 = r12.e(r13)
            com.meituan.mmp.lib.api.device.CompassModule$a r13 = (com.meituan.mmp.lib.api.device.CompassModule.a) r13
            if (r13 == 0) goto L5b
            com.meituan.mmp.lib.api.device.CompassModule.a.a(r13, r15)
            return
        L5b:
            r13 = 0
            r15.onFail(r13)
            goto L7a
        L60:
            java.lang.String r13 = com.meituan.mmp.lib.api.AbsApi.getToken(r14)
            com.meituan.mmp.lib.api.device.c r13 = r12.d(r13)
            com.meituan.mmp.lib.api.device.CompassModule$a r13 = (com.meituan.mmp.lib.api.device.CompassModule.a) r13
            if (r13 == 0) goto L70
            com.meituan.mmp.lib.api.device.CompassModule.a.a(r13, r14, r15)
            return
        L70:
            java.lang.String r13 = "auth granted but got no data"
            org.json.JSONObject r13 = codeJson(r2, r13)
            r15.onFail(r13)
            return
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.device.CompassModule.invoke(java.lang.String, org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends c implements SensorEventListener {
        public static ChangeQuickRedirect a;
        private String h;
        private int i;
        private u j;
        private boolean k;
        private float[] l;
        private float[] m;

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // com.meituan.mmp.lib.api.device.c
        public final /* bridge */ /* synthetic */ void a(boolean z) {
            super.a(z);
        }

        public a(Context context, MtSensorManager mtSensorManager, String str, com.meituan.mmp.lib.interfaces.c cVar) {
            super(context, mtSensorManager, str, cVar);
            Object[] objArr = {context, mtSensorManager, str, cVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c5e0918f085766ede51010e6af82706", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c5e0918f085766ede51010e6af82706");
                return;
            }
            this.h = "unknow";
            this.i = 0;
            this.k = true;
            this.l = new float[3];
            this.m = new float[3];
        }

        @Override // com.meituan.mmp.lib.api.device.c
        public final void a(IApiCallback iApiCallback) {
            Object[] objArr = {iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c37dbc10cecaae2145f9308bebab4ec", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c37dbc10cecaae2145f9308bebab4ec");
            } else {
                b(iApiCallback);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a(JSONObject jSONObject, @Nullable IApiCallback iApiCallback) {
            boolean z = true;
            Object[] objArr = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c12029557bd1914d33ba7d87b62f382c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c12029557bd1914d33ba7d87b62f382c");
            } else if (!this.k && this.d != null) {
                if (iApiCallback != null) {
                    iApiCallback.onSuccess(null);
                }
            } else {
                this.k = false;
                StringBuilder sb = new StringBuilder();
                if (this.d == null) {
                    this.d = Privacy.createSensorManager(this.c, this.e);
                }
                if (this.d != null) {
                    Sensor defaultSensor = this.d.getDefaultSensor(1);
                    Sensor defaultSensor2 = this.d.getDefaultSensor(2);
                    boolean registerListener = this.d.registerListener(this, defaultSensor, 3);
                    boolean registerListener2 = this.d.registerListener(this, defaultSensor2, 3);
                    if (!registerListener || !registerListener2) {
                        z = false;
                    }
                    if (!registerListener) {
                        sb.append(" register accelerometer sensor listener error!");
                    }
                    if (!registerListener2) {
                        sb.append(" register magnetic sensor listener error!");
                    }
                    if (z) {
                        if (iApiCallback != null) {
                            iApiCallback.onSuccess(null);
                            this.j = new u(200L, new u.a() { // from class: com.meituan.mmp.lib.api.device.CompassModule.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.mmp.lib.utils.u.a
                                public final boolean a() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "acf1d1799d6b7955e37d71cacbd13057", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "acf1d1799d6b7955e37d71cacbd13057")).booleanValue();
                                    }
                                    float[] fArr = new float[9];
                                    float[] fArr2 = new float[3];
                                    SensorManager.getRotationMatrix(fArr, null, a.this.l, a.this.m);
                                    SensorManager.getOrientation(fArr, fArr2);
                                    JSONObject jSONObject2 = new JSONObject();
                                    float degrees = (float) Math.toDegrees(fArr2[0]);
                                    if (degrees < 0.0f) {
                                        degrees += 360.0f;
                                    }
                                    try {
                                        jSONObject2.put("direction", degrees);
                                        if (!a.this.h.equalsIgnoreCase("unknow")) {
                                            jSONObject2.put(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, a.this.h);
                                        } else {
                                            jSONObject2.put(JsBridgeResult.PROPERTY_LOCATION_ACCURACY, a.this.h + "{value:" + a.this.i + CommonConstant.Symbol.BIG_BRACKET_RIGHT);
                                        }
                                    } catch (JSONException e) {
                                        com.meituan.mmp.lib.trace.b.a("InnerApi", e);
                                    }
                                    if (a.this.f != null) {
                                        a.this.f.a("onCompassChange", jSONObject2.toString(), 0);
                                        return true;
                                    }
                                    return true;
                                }
                            });
                        }
                        return;
                    }
                    this.d.unregisterListener(this);
                    this.d = null;
                }
                if (iApiCallback != null) {
                    iApiCallback.onFail(AbsApi.codeJson(-1, sb.toString()));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void b(@Nullable IApiCallback iApiCallback) {
            Object[] objArr = {iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15fd18131501854b0c40604fb4944438", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15fd18131501854b0c40604fb4944438");
                return;
            }
            if (this.d != null) {
                this.d.unregisterListener(this);
                this.j = null;
                this.d = null;
                if (iApiCallback != null) {
                    iApiCallback.onSuccess(null);
                }
            } else if (iApiCallback != null) {
                iApiCallback.onFail();
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Object[] objArr = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "430ab30806e7e5a3de853d88346f519b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "430ab30806e7e5a3de853d88346f519b");
            } else if (this.j != null && this.g) {
                if (sensorEvent.sensor.getType() == 2) {
                    this.m = (float[]) sensorEvent.values.clone();
                    switch (sensorEvent.accuracy) {
                        case -1:
                            this.h = "no-contact";
                            break;
                        case 0:
                            this.h = "unreliable";
                            break;
                        case 1:
                            this.h = "low";
                            break;
                        case 2:
                            this.h = "medium";
                            break;
                        case 3:
                            this.h = "high";
                            break;
                        default:
                            this.h = "unknow";
                            this.i = sensorEvent.accuracy;
                            break;
                    }
                } else if (sensorEvent.sensor.getType() != 1) {
                    return;
                } else {
                    this.l = (float[]) sensorEvent.values.clone();
                }
                if (this.j != null) {
                    this.j.a();
                }
            }
        }
    }
}

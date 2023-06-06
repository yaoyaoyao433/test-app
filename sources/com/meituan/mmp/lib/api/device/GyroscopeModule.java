package com.meituan.mmp.lib.api.device;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.mmp.lib.utils.u;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class GyroscopeModule extends DeviceModule<a> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.device.DeviceModule
    public final /* synthetic */ a a(@NonNull MtSensorManager mtSensorManager, String str) {
        Object[] objArr = {mtSensorManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09e19e4ecf16241f215d3b5b2b0c7ead", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09e19e4ecf16241f215d3b5b2b0c7ead") : new a(getContext(), mtSensorManager, str, this.d);
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29e1be0941e5c3162dab5e589cb21904", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29e1be0941e5c3162dab5e589cb21904") : new String[]{"startGyroscope", "stopGyroscope"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bda45f752f0214f5710a0e9ba7efe2ab", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bda45f752f0214f5710a0e9ba7efe2ab") : new String[]{"onGyroscopeChange", "startGyroscope", "stopGyroscope"};
    }

    @Override // com.meituan.mmp.lib.api.device.DeviceModule
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2b93f71b5d7f3efb40550854ae12949", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2b93f71b5d7f3efb40550854ae12949") : TextUtils.isEmpty(str) ? "GyroscopeDefault" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r13.equals("startGyroscope") == false) goto L26;
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
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mmp.lib.api.device.GyroscopeModule.a
            java.lang.String r11 = "e00b22b77730632685aa1214379747b2"
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
            r1 = -1685952733(0xffffffff9b826723, float:-2.1573346E-22)
            r2 = -1
            if (r0 == r1) goto L3b
            r1 = -28600637(0xfffffffffe4b96c3, float:-6.765402E37)
            if (r0 == r1) goto L31
            goto L46
        L31:
            java.lang.String r0 = "startGyroscope"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L46
            goto L47
        L3b:
            java.lang.String r0 = "stopGyroscope"
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
            com.meituan.mmp.lib.api.device.GyroscopeModule$a r13 = (com.meituan.mmp.lib.api.device.GyroscopeModule.a) r13
            if (r13 == 0) goto L5b
            com.meituan.mmp.lib.api.device.GyroscopeModule.a.a(r13, r15)
            return
        L5b:
            r13 = 0
            r15.onFail(r13)
            goto L7a
        L60:
            java.lang.String r13 = com.meituan.mmp.lib.api.AbsApi.getToken(r14)
            com.meituan.mmp.lib.api.device.c r13 = r12.d(r13)
            com.meituan.mmp.lib.api.device.GyroscopeModule$a r13 = (com.meituan.mmp.lib.api.device.GyroscopeModule.a) r13
            if (r13 == 0) goto L70
            com.meituan.mmp.lib.api.device.GyroscopeModule.a.a(r13, r14, r15)
            return
        L70:
            java.lang.String r13 = "auth granted but got no data"
            org.json.JSONObject r13 = codeJson(r2, r13)
            r15.onFail(r13)
            return
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.device.GyroscopeModule.invoke(java.lang.String, org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends c implements SensorEventListener {
        public static ChangeQuickRedirect a;
        private float[] h;
        private u i;
        private boolean j;

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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2d55e894b91f5b222e584ffbf67032", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2d55e894b91f5b222e584ffbf67032");
                return;
            }
            this.h = new float[3];
            this.j = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a(JSONObject jSONObject, @Nullable IApiCallback iApiCallback) {
            Object[] objArr = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d779587b0cf51499c657195e2efe3d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d779587b0cf51499c657195e2efe3d");
            } else if (!this.j && this.d != null) {
                if (iApiCallback != null) {
                    iApiCallback.onSuccess(null);
                }
            } else {
                this.j = false;
                int b = DeviceModule.b(jSONObject);
                if (this.d == null) {
                    this.d = Privacy.createSensorManager(this.c, this.e);
                }
                if (this.d != null) {
                    if (this.d.registerListener(this, this.d.getDefaultSensor(4), b)) {
                        if (iApiCallback != null) {
                            iApiCallback.onSuccess(null);
                            this.i = new u(DeviceModule.b(b), new u.a() { // from class: com.meituan.mmp.lib.api.device.GyroscopeModule.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.mmp.lib.utils.u.a
                                public final boolean a() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f684a704a4d29b8e54246e450d5eeba1", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f684a704a4d29b8e54246e450d5eeba1")).booleanValue();
                                    }
                                    if (a.this.g) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        try {
                                            jSONObject2.put(Constants.GestureMoveEvent.KEY_X, a.this.h[0]);
                                            jSONObject2.put(Constants.GestureMoveEvent.KEY_Y, a.this.h[1]);
                                            jSONObject2.put("z", a.this.h[2]);
                                            if (a.this.f != null) {
                                                a.this.f.a("onGyroscopeChange", jSONObject2.toString(), 0);
                                            }
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }
                                        return true;
                                    }
                                    return false;
                                }
                            });
                        }
                        return;
                    }
                    this.d.unregisterListener(this);
                    this.d = null;
                }
                if (iApiCallback != null) {
                    iApiCallback.onFail(null);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void b(@Nullable IApiCallback iApiCallback) {
            Object[] objArr = {iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96bb15d6f0ef2ca5c6af90c9d9fb1842", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96bb15d6f0ef2ca5c6af90c9d9fb1842");
                return;
            }
            if (this.d != null) {
                this.d.unregisterListener(this);
                this.i = null;
                this.d = null;
                if (iApiCallback != null) {
                    iApiCallback.onSuccess(null);
                }
            } else if (iApiCallback != null) {
                iApiCallback.onFail(null);
            }
        }

        @Override // com.meituan.mmp.lib.api.device.c
        public final void a(IApiCallback iApiCallback) {
            Object[] objArr = {iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49817b4199a5724d06e326ca9837abed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49817b4199a5724d06e326ca9837abed");
            } else {
                b(iApiCallback);
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Object[] objArr = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ce8fb619eb8c2867cf97ec8a9947413", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ce8fb619eb8c2867cf97ec8a9947413");
            } else if (sensorEvent.sensor.getType() == 4 && sensorEvent.values != null && sensorEvent.values.length == 3) {
                this.h = (float[]) sensorEvent.values.clone();
                if (this.i != null) {
                    this.i.a();
                }
            }
        }
    }
}

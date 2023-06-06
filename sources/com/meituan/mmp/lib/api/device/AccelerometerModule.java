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
import com.meituan.mmp.lib.api.AbsApi;
import com.meituan.mmp.lib.utils.u;
import com.meituan.mmp.main.IApiCallback;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AccelerometerModule extends DeviceModule<a> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final boolean d() {
        return true;
    }

    @Override // com.meituan.mmp.lib.api.device.DeviceModule
    public final /* synthetic */ a a(@NonNull MtSensorManager mtSensorManager, String str) {
        Object[] objArr = {mtSensorManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81392ecc2937af771e6777e69b9827c9", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81392ecc2937af771e6777e69b9827c9") : new a(getContext(), mtSensorManager, str, this.d);
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6b1913511fb60f93543e208e423e6a9", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6b1913511fb60f93543e208e423e6a9") : new String[]{"startAccelerometer", "stopAccelerometer"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ca2d4afc8203787def41e69e5ef9a64", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ca2d4afc8203787def41e69e5ef9a64") : new String[]{"startAccelerometer", "stopAccelerometer", "onAccelerometerChange"};
    }

    @Override // com.meituan.mmp.lib.api.device.DeviceModule
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d5d36ab4ba19cb0375a06a259d22333", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d5d36ab4ba19cb0375a06a259d22333") : TextUtils.isEmpty(str) ? "AccelerometerDefault" : str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r13.equals("startAccelerometer") == false) goto L26;
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
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.mmp.lib.api.device.AccelerometerModule.a
            java.lang.String r11 = "e872e2f8b2039cb2f55dff9dce64be96"
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
            r1 = -1832227987(0xffffffff92ca6b6d, float:-1.2774475E-27)
            r2 = -1
            if (r0 == r1) goto L3b
            r1 = 137546509(0x832cb0d, float:5.380361E-34)
            if (r0 == r1) goto L31
            goto L46
        L31:
            java.lang.String r0 = "startAccelerometer"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L46
            goto L47
        L3b:
            java.lang.String r0 = "stopAccelerometer"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L46
            r8 = 1
            goto L47
        L46:
            r8 = -1
        L47:
            switch(r8) {
                case 0: goto L5f;
                case 1: goto L4b;
                default: goto L4a;
            }
        L4a:
            goto L79
        L4b:
            java.lang.String r13 = com.meituan.mmp.lib.api.AbsApi.getToken(r14)
            com.meituan.mmp.lib.api.device.c r13 = r12.e(r13)
            com.meituan.mmp.lib.api.device.AccelerometerModule$a r13 = (com.meituan.mmp.lib.api.device.AccelerometerModule.a) r13
            if (r13 == 0) goto L5b
            com.meituan.mmp.lib.api.device.AccelerometerModule.a.a(r13, r15)
            return
        L5b:
            r15.onFail()
            goto L79
        L5f:
            java.lang.String r13 = com.meituan.mmp.lib.api.AbsApi.getToken(r14)
            com.meituan.mmp.lib.api.device.c r13 = r12.d(r13)
            com.meituan.mmp.lib.api.device.AccelerometerModule$a r13 = (com.meituan.mmp.lib.api.device.AccelerometerModule.a) r13
            if (r13 == 0) goto L6f
            com.meituan.mmp.lib.api.device.AccelerometerModule.a.a(r13, r15, r14)
            return
        L6f:
            java.lang.String r13 = "auth granted but got no data"
            org.json.JSONObject r13 = codeJson(r2, r13)
            r15.onFail(r13)
            return
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.device.AccelerometerModule.invoke(java.lang.String, org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df34958c8e92b7edf3048586702f7647", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df34958c8e92b7edf3048586702f7647");
            } else {
                this.j = true;
            }
        }

        @Override // com.meituan.mmp.lib.api.device.c
        public final void a(IApiCallback iApiCallback) {
            Object[] objArr = {iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "49f553a69fe58f9e4efe2a13c63acd29", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "49f553a69fe58f9e4efe2a13c63acd29");
            } else {
                b(iApiCallback);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a(IApiCallback iApiCallback, JSONObject jSONObject) {
            Object[] objArr = {iApiCallback, jSONObject};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71787454c22c77d60a5fae2b8cba9956", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71787454c22c77d60a5fae2b8cba9956");
            } else if (!this.j && this.d != null) {
                iApiCallback.onSuccess(null);
            } else {
                this.j = false;
                if (this.d == null) {
                    this.d = Privacy.createSensorManager(this.c, this.e);
                }
                int b = DeviceModule.b(jSONObject);
                if (this.d != null) {
                    if (this.d.registerListener(this, this.d.getDefaultSensor(1), b)) {
                        iApiCallback.onSuccess(null);
                        this.i = new u(DeviceModule.b(b), new u.a() { // from class: com.meituan.mmp.lib.api.device.AccelerometerModule.a.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.lib.utils.u.a
                            public final boolean a() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7e94fd66f74af0b2aac92f686119be87", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7e94fd66f74af0b2aac92f686119be87")).booleanValue();
                                }
                                if (a.this.g) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    try {
                                        jSONObject2.put(Constants.GestureMoveEvent.KEY_X, (-a.this.h[0]) / 10.0f);
                                        jSONObject2.put(Constants.GestureMoveEvent.KEY_Y, (-a.this.h[1]) / 10.0f);
                                        jSONObject2.put("z", (-a.this.h[2]) / 10.0f);
                                        if (a.this.f != null) {
                                            a.this.f.a("onAccelerometerChange", jSONObject2.toString(), 0);
                                        }
                                    } catch (JSONException e) {
                                        com.meituan.mmp.lib.trace.b.a("InnerApi", e);
                                    }
                                    return true;
                                }
                                return false;
                            }
                        });
                        return;
                    }
                    iApiCallback.onFail(AbsApi.codeJson(-1, "start accelerometer failed, register listener failed!"));
                    this.d = null;
                    return;
                }
                iApiCallback.onFail(AbsApi.codeJson(-1, "start accelerometer failed, get system service failed!"));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void b(@Nullable IApiCallback iApiCallback) {
            Object[] objArr = {iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9be23f9c26ab3f9aac5f47e36bc040be", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9be23f9c26ab3f9aac5f47e36bc040be");
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
                iApiCallback.onFail();
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Object[] objArr = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f773bb838f5258650f5c7660f3902b3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f773bb838f5258650f5c7660f3902b3");
            } else if (sensorEvent == null || sensorEvent.values == null || sensorEvent.values.length < 3) {
            } else {
                this.h = (float[]) sensorEvent.values.clone();
                if (this.i != null) {
                    this.i.a();
                }
            }
        }
    }
}

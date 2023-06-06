package com.meituan.mmp.lib.api.device;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
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
public class DeviceMotionModule extends DeviceModule<a> {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.mmp.lib.api.device.DeviceModule
    public final /* synthetic */ a a(@NonNull MtSensorManager mtSensorManager, String str) {
        Object[] objArr = {mtSensorManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e07a329b3dc487171437420ce39bec9", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e07a329b3dc487171437420ce39bec9") : new a(getContext(), mtSensorManager, str, this.d);
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c456ac051b40dec21451c2f3ba2dd2f5", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c456ac051b40dec21451c2f3ba2dd2f5") : new String[]{"startDeviceMotionListening", "stopDeviceMotionListening"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7612a4ee114322d3464fa40ca9cb5983", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7612a4ee114322d3464fa40ca9cb5983") : new String[]{"startDeviceMotionListening", "stopDeviceMotionListening", "onDeviceMotionChange"};
    }

    @Override // com.meituan.mmp.lib.api.AbsApi
    public void invoke(String str, JSONObject jSONObject, IApiCallback iApiCallback) {
        char c;
        Object[] objArr = {str, jSONObject, iApiCallback};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a88c06aac8f9a8ab66522fa7f6c4102c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a88c06aac8f9a8ab66522fa7f6c4102c");
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != -680743539) {
            if (hashCode == 1959488813 && str.equals("startDeviceMotionListening")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals("stopDeviceMotionListening")) {
                c = 1;
            }
            c = 65535;
        }
        switch (c) {
            case 0:
                Object[] objArr2 = {jSONObject, iApiCallback};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cbd6db3ed2522ab7c9dbcfcad9548e7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cbd6db3ed2522ab7c9dbcfcad9548e7");
                    return;
                } else if (Build.VERSION.SDK_INT < 9) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("errMsg", "该功能安卓系统不支持，当前版本为:" + Build.VERSION.SDK_INT + " 最低支持版本:24");
                    } catch (JSONException unused) {
                    }
                    iApiCallback.onFail(jSONObject2);
                    return;
                } else {
                    a d = d(AbsApi.getToken(jSONObject));
                    if (d != null) {
                        d.a(jSONObject, iApiCallback);
                        return;
                    } else {
                        iApiCallback.onFail(codeJson(-1, "auth granted but got no data"));
                        return;
                    }
                }
            case 1:
                a e = e(AbsApi.getToken(jSONObject));
                if (e == null) {
                    iApiCallback.onFail(null);
                    return;
                } else {
                    e.b(iApiCallback);
                    return;
                }
            default:
                return;
        }
    }

    @Override // com.meituan.mmp.lib.api.device.DeviceModule
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bde0344b6958108a10ce492acb0855e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bde0344b6958108a10ce492acb0855e") : TextUtils.isEmpty(str) ? "DeviceModuleDefault" : str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends c implements SensorEventListener {
        public static ChangeQuickRedirect a;
        private float[] h;
        private float[] i;
        private float[] j;
        private u k;
        private boolean l;

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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "404b95a9060a41f5f670ffdc8e9b9aa5", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "404b95a9060a41f5f670ffdc8e9b9aa5");
                return;
            }
            this.h = new float[9];
            this.i = new float[3];
            this.l = true;
        }

        @Override // com.meituan.mmp.lib.api.device.c
        public final void a(IApiCallback iApiCallback) {
            Object[] objArr = {iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9dd25d617c1d245f09bdb4a122af9e41", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9dd25d617c1d245f09bdb4a122af9e41");
            } else {
                b(iApiCallback);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a(JSONObject jSONObject, @Nullable IApiCallback iApiCallback) {
            Object[] objArr = {jSONObject, iApiCallback};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1bb18ac3e24c1f18e88babe806f0d263", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1bb18ac3e24c1f18e88babe806f0d263");
            } else if (!this.l && this.d != null) {
                if (iApiCallback != null) {
                    iApiCallback.onSuccess(null);
                }
            } else {
                this.l = false;
                if (this.d == null) {
                    this.d = Privacy.createSensorManager(this.c, this.e);
                }
                int b = DeviceModule.b(jSONObject);
                if (this.d != null) {
                    if (this.d.registerListener(this, this.d.getDefaultSensor(11), b)) {
                        if (iApiCallback != null) {
                            iApiCallback.onSuccess(null);
                            this.k = new u(DeviceModule.b(b), new u.a() { // from class: com.meituan.mmp.lib.api.device.DeviceMotionModule.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.mmp.lib.utils.u.a
                                public final boolean a() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3b52c5d0fa0af44a5ae95f0818a5075", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3b52c5d0fa0af44a5ae95f0818a5075")).booleanValue();
                                    }
                                    if (a.this.g) {
                                        try {
                                            JSONObject jSONObject2 = new JSONObject();
                                            SensorManager.getRotationMatrixFromVector(a.this.h, a.this.j);
                                            SensorManager.getOrientation(a.this.h, a.this.i);
                                            jSONObject2.put("alpha", a.this.i[0] > 0.0f ? (a.this.i[0] * 180.0f) / 3.141592653589793d : 360.0d + ((a.this.i[0] * 180.0f) / 3.141592653589793d));
                                            jSONObject2.put("beta", (a.this.i[1] * 180.0f) / 3.141592653589793d);
                                            jSONObject2.put("gamma", (a.this.i[2] * 180.0f) / 3.141592653589793d);
                                            if (a.this.f != null) {
                                                a.this.f.a("onDeviceMotionChange", jSONObject2.toString(), 0);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "895e68d41213acd023b7423acfe5e5c6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "895e68d41213acd023b7423acfe5e5c6");
                return;
            }
            if (this.d != null) {
                this.d.unregisterListener(this);
                this.k = null;
                this.d = null;
                if (iApiCallback != null) {
                    iApiCallback.onSuccess(null);
                }
            } else if (iApiCallback != null) {
                iApiCallback.onFail(null);
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Object[] objArr = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "29103d107fca5fe4c3bf842c20ba2100", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "29103d107fca5fe4c3bf842c20ba2100");
            } else if (sensorEvent.sensor.getType() != 11 || sensorEvent.values == null) {
            } else {
                this.j = (float[]) sensorEvent.values.clone();
                if (this.k != null) {
                    this.k.a();
                }
            }
        }
    }
}

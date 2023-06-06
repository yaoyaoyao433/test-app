package com.meituan.msi.api.compass;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.api.device.b;
import com.meituan.msi.api.device.c;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class CompassApi extends b<a> implements IMsiApi {
    public static ChangeQuickRedirect a;
    public a b;

    @MsiApiMethod(name = "offCompassChange")
    public void offCompassChange(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onCompassChange", response = CompassChangeEvent.class)
    public void onCompassChange(MsiContext msiContext) {
    }

    @Override // com.meituan.msi.api.device.b
    public final /* synthetic */ a a(@NonNull MtSensorManager mtSensorManager, String str) {
        Object[] objArr = {mtSensorManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3c6aa34475949f1f4941c62cd1c5daf", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3c6aa34475949f1f4941c62cd1c5daf") : new a(com.meituan.msi.a.f(), mtSensorManager, str);
    }

    public CompassApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e82f24c871d79a5d03d4864713aa93b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e82f24c871d79a5d03d4864713aa93b");
        } else {
            this.b = null;
        }
    }

    @MsiApiMethod(name = "startCompass", request = CompassParam.class)
    public synchronized void startCompass(CompassParam compassParam, MsiContext msiContext) {
        Object[] objArr = {compassParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe4c13d6d6ea75a2981b4a834e5248a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe4c13d6d6ea75a2981b4a834e5248a");
            return;
        }
        this.b = a(compassParam._mt == null ? "" : compassParam._mt.sceneToken, msiContext);
        if (this.b == null) {
            msiContext.onError("auth granted but got no data");
        } else {
            this.b.b(msiContext);
        }
    }

    @MsiApiMethod(name = "stopCompass", request = CompassParam.class)
    public synchronized void stopCompass(CompassParam compassParam, MsiContext msiContext) {
        Object[] objArr = {compassParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf6ae0f9435966c54f1062fc927ab565", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf6ae0f9435966c54f1062fc927ab565");
            return;
        }
        this.b = b(compassParam._mt == null ? "" : compassParam._mt.sceneToken);
        if (this.b == null) {
            msiContext.onError("implement is null");
        } else {
            this.b.c(msiContext);
        }
    }

    @Override // com.meituan.msi.api.device.b
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06122d1e2fe348923dd1601d5c287355", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06122d1e2fe348923dd1601d5c287355") : TextUtils.isEmpty(str) ? "CompassDefault" : str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.meituan.msi.api.device.a implements SensorEventListener {
        public static ChangeQuickRedirect a;
        private String g;
        private int h;
        private c i;
        private boolean j;
        private float[] k;
        private float[] l;

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public a(Context context, MtSensorManager mtSensorManager, String str) {
            super(context, mtSensorManager, str);
            Object[] objArr = {context, mtSensorManager, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c16a9b7cb3d7e3febb7422d1306d1445", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c16a9b7cb3d7e3febb7422d1306d1445");
                return;
            }
            this.g = "unknow";
            this.h = 0;
            this.j = true;
            this.k = new float[3];
            this.l = new float[3];
        }

        @Override // com.meituan.msi.api.device.a
        public final void a(MsiContext msiContext) {
            Object[] objArr = {msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60fce89187799f875830294089167546", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60fce89187799f875830294089167546");
            } else {
                c(msiContext);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void b(@Nullable final MsiContext msiContext) {
            boolean z = true;
            Object[] objArr = {msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e8c5e45785b84fd71725f124184d3d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e8c5e45785b84fd71725f124184d3d");
            } else if (!this.j && this.d != null) {
                if (msiContext != null) {
                    msiContext.onSuccess(null);
                }
            } else {
                this.j = false;
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
                        if (msiContext != null) {
                            msiContext.onSuccess(null);
                            this.i = new c(200L, new c.a() { // from class: com.meituan.msi.api.compass.CompassApi.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.msi.api.device.c.a
                                public final boolean a() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d5e3455a437c2fb85030b8202e9dd27", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d5e3455a437c2fb85030b8202e9dd27")).booleanValue();
                                    }
                                    float[] fArr = new float[9];
                                    float[] fArr2 = new float[3];
                                    SensorManager.getRotationMatrix(fArr, null, a.this.k, a.this.l);
                                    SensorManager.getOrientation(fArr, fArr2);
                                    new JSONObject();
                                    float degrees = (float) Math.toDegrees(fArr2[0]);
                                    if (degrees < 0.0f) {
                                        degrees += 360.0f;
                                    }
                                    CompassChangeEvent compassChangeEvent = new CompassChangeEvent();
                                    compassChangeEvent.direction = degrees;
                                    if (!a.this.g.equalsIgnoreCase("unknow")) {
                                        compassChangeEvent.accuracy = a.this.g;
                                    } else {
                                        compassChangeEvent.accuracy = a.this.g + "{value:" + a.this.h + CommonConstant.Symbol.BIG_BRACKET_RIGHT;
                                    }
                                    msiContext.dispatchEvent("onCompassChange", compassChangeEvent);
                                    return true;
                                }
                            });
                        }
                        return;
                    }
                    this.d.unregisterListener(this);
                    this.d = null;
                }
                if (msiContext != null) {
                    msiContext.onError(sb.toString());
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void c(@Nullable MsiContext msiContext) {
            Object[] objArr = {msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74565bbc2059246163f455534e9a4da0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74565bbc2059246163f455534e9a4da0");
                return;
            }
            if (this.d != null) {
                this.d.unregisterListener(this);
                this.i = null;
                this.d = null;
                if (msiContext != null) {
                    msiContext.onSuccess(null);
                }
            } else if (msiContext != null) {
                msiContext.onError("mSensorManager is null");
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Object[] objArr = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0f8e218429409d9398d549ee4e562688", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0f8e218429409d9398d549ee4e562688");
            } else if (this.i != null && this.f) {
                if (sensorEvent.sensor.getType() == 2) {
                    this.l = (float[]) sensorEvent.values.clone();
                    switch (sensorEvent.accuracy) {
                        case -1:
                            this.g = "no-contact";
                            break;
                        case 0:
                            this.g = "unreliable";
                            break;
                        case 1:
                            this.g = "low";
                            break;
                        case 2:
                            this.g = "medium";
                            break;
                        case 3:
                            this.g = "high";
                            break;
                        default:
                            this.g = "unknow";
                            this.h = sensorEvent.accuracy;
                            break;
                    }
                } else if (sensorEvent.sensor.getType() != 1) {
                    return;
                } else {
                    this.k = (float[]) sensorEvent.values.clone();
                }
                if (this.i != null) {
                    this.i.a();
                }
            }
        }
    }

    @Override // com.meituan.msi.api.device.b, com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c790d1edd00f32d1d01747548bd1deb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c790d1edd00f32d1d01747548bd1deb9");
        } else {
            super.c();
        }
    }

    @Override // com.meituan.msi.api.device.b, com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "328d9512617e7bc53cb2b993b4dced69", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "328d9512617e7bc53cb2b993b4dced69");
        } else {
            super.d();
        }
    }
}

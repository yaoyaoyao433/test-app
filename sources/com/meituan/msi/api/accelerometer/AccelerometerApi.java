package com.meituan.msi.api.accelerometer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
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
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class AccelerometerApi extends b<a> implements IMsiApi {
    public static ChangeQuickRedirect a;
    public a b;

    @MsiApiMethod(name = "offAccelerometerChange")
    public void offAccelerometerChange(MsiContext msiContext) {
    }

    @Override // com.meituan.msi.api.device.b
    public final /* synthetic */ a a(@NonNull MtSensorManager mtSensorManager, String str) {
        Object[] objArr = {mtSensorManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b56e870de7ba0748731b321108934bc", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b56e870de7ba0748731b321108934bc") : new a(com.meituan.msi.a.f(), mtSensorManager, str);
    }

    public AccelerometerApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ca29132b272bb8cd0956d6bd70b9166", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ca29132b272bb8cd0956d6bd70b9166");
        } else {
            this.b = null;
        }
    }

    @MsiApiMethod(name = "startAccelerometer", request = AccelerometerParam.class)
    public synchronized void startAccelerometer(AccelerometerParam accelerometerParam, MsiContext msiContext) {
        Object[] objArr = {accelerometerParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bed5247d6d37f5aee29ea35aeaf9f7ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bed5247d6d37f5aee29ea35aeaf9f7ff");
            return;
        }
        this.b = a(accelerometerParam._mt == null ? "" : accelerometerParam._mt.sceneToken, msiContext);
        if (this.b == null) {
            msiContext.onError("auth granted but got no data");
        } else {
            this.b.a(msiContext, accelerometerParam);
        }
    }

    @MsiApiMethod(name = "stopAccelerometer", request = AccelerometerParam.class)
    public synchronized void stopAccelerometer(AccelerometerParam accelerometerParam, MsiContext msiContext) {
        Object[] objArr = {accelerometerParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fe2ff58fa6613e06d96a91ca18530a6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fe2ff58fa6613e06d96a91ca18530a6f");
            return;
        }
        this.b = b(accelerometerParam._mt == null ? "" : accelerometerParam._mt.sceneToken);
        if (this.b == null) {
            msiContext.onError("implement is null");
        } else {
            this.b.b(msiContext);
        }
    }

    @MsiApiMethod(isCallback = true, name = "onAccelerometerChange", response = AccelerometerChangeEvent.class)
    public void onAccelerometerChange(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "818c82fc9153e028182bf8c3aa5c7e87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "818c82fc9153e028182bf8c3aa5c7e87");
        } else {
            msiContext.onSuccess(null);
        }
    }

    @Override // com.meituan.msi.api.device.b
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b101d9f09dffda66408d3a6af9a9eb6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b101d9f09dffda66408d3a6af9a9eb6") : TextUtils.isEmpty(str) ? "AccelerometerDefault" : str;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.meituan.msi.api.device.a implements SensorEventListener {
        public static ChangeQuickRedirect a;
        private float[] g;
        private c h;
        private boolean i;

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public a(Context context, MtSensorManager mtSensorManager, String str) {
            super(context, mtSensorManager, str);
            Object[] objArr = {context, mtSensorManager, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6074b07fb6f99e9f4c123d77d6b0998", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6074b07fb6f99e9f4c123d77d6b0998");
            } else {
                this.i = true;
            }
        }

        @Override // com.meituan.msi.api.device.a
        public final void a(MsiContext msiContext) {
            Object[] objArr = {msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07bcd164628a0f28618ec7170ca90750", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07bcd164628a0f28618ec7170ca90750");
            } else {
                b(msiContext);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a(final MsiContext msiContext, AccelerometerParam accelerometerParam) {
            Object[] objArr = {msiContext, accelerometerParam};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d627dafbc4e60e8600502950ba49762", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d627dafbc4e60e8600502950ba49762");
            } else if (!this.i && this.d != null) {
                msiContext.onSuccess("");
            } else {
                this.i = false;
                if (this.d == null) {
                    this.d = Privacy.createSensorManager(this.c, this.e);
                }
                int a2 = AccelerometerApi.a(accelerometerParam);
                if (this.d != null) {
                    if (this.d.registerListener(this, this.d.getDefaultSensor(1), a2)) {
                        msiContext.onSuccess("");
                        this.h = new c(b.a(a2), new c.a() { // from class: com.meituan.msi.api.accelerometer.AccelerometerApi.a.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.msi.api.device.c.a
                            public final boolean a() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92f8f9b128cf5bec46a4612fedba573e", RobustBitConfig.DEFAULT_VALUE)) {
                                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92f8f9b128cf5bec46a4612fedba573e")).booleanValue();
                                }
                                if (a.this.f) {
                                    AccelerometerChangeEvent accelerometerChangeEvent = new AccelerometerChangeEvent();
                                    accelerometerChangeEvent.x = (-a.this.g[0]) / 10.0f;
                                    accelerometerChangeEvent.y = (-a.this.g[1]) / 10.0f;
                                    accelerometerChangeEvent.z = (-a.this.g[2]) / 10.0f;
                                    msiContext.dispatchEvent("onAccelerometerChange", accelerometerChangeEvent);
                                    return true;
                                }
                                return false;
                            }
                        });
                        return;
                    }
                    msiContext.onError(500, "start accelerometer failed, register listener failed!");
                    this.d = null;
                    return;
                }
                msiContext.onError(500, "start accelerometer failed, get system service failed!");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void b(@Nullable MsiContext msiContext) {
            Object[] objArr = {msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "464369d802e09d0f9b789f8432d902c9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "464369d802e09d0f9b789f8432d902c9");
                return;
            }
            if (this.d != null) {
                this.d.unregisterListener(this);
                this.h = null;
                this.d = null;
                if (msiContext != null) {
                    msiContext.onSuccess(null);
                }
            } else if (msiContext != null) {
                msiContext.onError("");
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Object[] objArr = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8283fa222f72d7aacfb1652d438408e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8283fa222f72d7aacfb1652d438408e4");
            } else if (sensorEvent == null || sensorEvent.values == null || sensorEvent.values.length < 3) {
            } else {
                this.g = (float[]) sensorEvent.values.clone();
                if (this.h != null) {
                    this.h.a();
                }
            }
        }
    }

    public static int a(AccelerometerParam accelerometerParam) {
        Object[] objArr = {accelerometerParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d220aa48a580285e365d27bd8f6786f6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d220aa48a580285e365d27bd8f6786f6")).intValue();
        }
        if (accelerometerParam != null) {
            String str = accelerometerParam.interval;
            if (!TextUtils.isEmpty(str)) {
                if ("ui".contentEquals(str)) {
                    return 2;
                }
                if ("game".contentEquals(str)) {
                    return 1;
                }
            }
        }
        return 3;
    }

    @Override // com.meituan.msi.api.device.b, com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12897ce4c6d65218c90c4948492f47d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12897ce4c6d65218c90c4948492f47d0");
        } else {
            super.c();
        }
    }

    @Override // com.meituan.msi.api.device.b, com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2a2dea14f77bcd4b3cafbca03b21500", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2a2dea14f77bcd4b3cafbca03b21500");
        } else {
            super.d();
        }
    }
}

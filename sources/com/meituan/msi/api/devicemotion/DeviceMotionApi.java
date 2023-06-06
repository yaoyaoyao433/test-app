package com.meituan.msi.api.devicemotion;

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
public class DeviceMotionApi extends b<a> implements IMsiApi {
    public static ChangeQuickRedirect a;
    public a b;

    @Override // com.meituan.msi.api.device.b
    public final /* synthetic */ a a(@NonNull MtSensorManager mtSensorManager, String str) {
        Object[] objArr = {mtSensorManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8016c1a28ed368b6b2e85cdb3079b66e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8016c1a28ed368b6b2e85cdb3079b66e") : new a(com.meituan.msi.a.f(), mtSensorManager, str);
    }

    @MsiApiMethod(name = "startDeviceMotionListening", request = DeviceMotionParam.class)
    public synchronized void startDeviceMotionListening(DeviceMotionParam deviceMotionParam, MsiContext msiContext) {
        Object[] objArr = {deviceMotionParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16ac6f1f71cb9db04b29b5ca8af2fea4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16ac6f1f71cb9db04b29b5ca8af2fea4");
        } else if (Build.VERSION.SDK_INT < 9) {
            msiContext.onError("该功能安卓系统不支持，当前版本为:" + Build.VERSION.SDK_INT + " 最低支持版本:24");
        } else {
            this.b = a(deviceMotionParam._mt == null ? "" : deviceMotionParam._mt.sceneToken, msiContext);
            if (this.b == null) {
                msiContext.onError("auth granted but got no data");
            } else {
                this.b.a(deviceMotionParam, msiContext);
            }
        }
    }

    @MsiApiMethod(name = "stopDeviceMotionListening", request = DeviceMotionParam.class)
    public synchronized void stopDeviceMotionListening(DeviceMotionParam deviceMotionParam, MsiContext msiContext) {
        Object[] objArr = {deviceMotionParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9993354bb2738a2c176731f904039b10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9993354bb2738a2c176731f904039b10");
            return;
        }
        this.b = b(deviceMotionParam._mt == null ? "" : deviceMotionParam._mt.sceneToken);
        if (this.b == null) {
            msiContext.onError("implement is null");
        } else {
            this.b.b(msiContext);
        }
    }

    @MsiApiMethod(isCallback = true, name = "onDeviceMotionChange", response = DeviceMotionEvent.class)
    public synchronized void onDeviceMotionChange(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "offDeviceMotionChange")
    public synchronized void offDeviceMotionChange(MsiContext msiContext) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.meituan.msi.api.device.a implements SensorEventListener {
        public static ChangeQuickRedirect a;
        private float[] g;
        private float[] h;
        private float[] i;
        private c j;
        private boolean k;

        @Override // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor, int i) {
        }

        public a(Context context, MtSensorManager mtSensorManager, String str) {
            super(context, mtSensorManager, str);
            Object[] objArr = {context, mtSensorManager, str};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44a7a92df615cf0229e02735b471601b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44a7a92df615cf0229e02735b471601b");
                return;
            }
            this.g = new float[9];
            this.h = new float[3];
            this.k = true;
        }

        @Override // com.meituan.msi.api.device.a
        public final void a(MsiContext msiContext) {
            Object[] objArr = {msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5579ef91c07e7511fb619310523853db", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5579ef91c07e7511fb619310523853db");
            } else {
                b(msiContext);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a(DeviceMotionParam deviceMotionParam, @Nullable final MsiContext msiContext) {
            Object[] objArr = {deviceMotionParam, msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "877af3e9107628ad772dd6833d338c7f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "877af3e9107628ad772dd6833d338c7f");
            } else if (!this.k && this.d != null) {
                if (msiContext != null) {
                    msiContext.onSuccess(null);
                }
            } else {
                this.k = false;
                if (this.d == null) {
                    this.d = Privacy.createSensorManager(this.c, this.e);
                }
                int a2 = DeviceMotionApi.a(deviceMotionParam);
                if (this.d != null) {
                    if (this.d.registerListener(this, this.d.getDefaultSensor(11), a2)) {
                        if (msiContext != null) {
                            msiContext.onSuccess(null);
                            this.j = new c(b.a(a2), new c.a() { // from class: com.meituan.msi.api.devicemotion.DeviceMotionApi.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.msi.api.device.c.a
                                public final boolean a() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e49bd943c6f92841c154b5c156efb90e", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e49bd943c6f92841c154b5c156efb90e")).booleanValue();
                                    }
                                    if (a.this.f) {
                                        SensorManager.getRotationMatrixFromVector(a.this.g, a.this.i);
                                        SensorManager.getOrientation(a.this.g, a.this.h);
                                        DeviceMotionEvent deviceMotionEvent = new DeviceMotionEvent();
                                        deviceMotionEvent.alpha = a.this.h[0] > 0.0f ? (a.this.h[0] * 180.0f) / 3.141592653589793d : 360.0d + ((a.this.h[0] * 180.0f) / 3.141592653589793d);
                                        deviceMotionEvent.beta = (a.this.h[1] * 180.0f) / 3.141592653589793d;
                                        deviceMotionEvent.gamma = (a.this.h[2] * 180.0f) / 3.141592653589793d;
                                        msiContext.dispatchEvent("onDeviceMotionChange", deviceMotionEvent);
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
                if (msiContext != null) {
                    msiContext.onError("mSensorManager is null");
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void b(@Nullable MsiContext msiContext) {
            Object[] objArr = {msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec65e47fd08f14c48287324cc04f2470", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec65e47fd08f14c48287324cc04f2470");
                return;
            }
            if (this.d != null) {
                this.d.unregisterListener(this);
                this.j = null;
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14544eafc2d88234a508e75dce57e079", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14544eafc2d88234a508e75dce57e079");
            } else if (sensorEvent.sensor.getType() != 11 || sensorEvent.values == null) {
            } else {
                this.i = (float[]) sensorEvent.values.clone();
                if (this.j != null) {
                    this.j.a();
                }
            }
        }
    }

    public static int a(DeviceMotionParam deviceMotionParam) {
        Object[] objArr = {deviceMotionParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "49f09344bc38cc548476f87bef576efe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "49f09344bc38cc548476f87bef576efe")).intValue();
        }
        if (deviceMotionParam != null) {
            String str = deviceMotionParam.interval;
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

    @Override // com.meituan.msi.api.device.b
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12c441433af2b8f9dff31a4354569a8d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12c441433af2b8f9dff31a4354569a8d") : TextUtils.isEmpty(str) ? "DeviceModuleDefault" : str;
    }

    @Override // com.meituan.msi.api.device.b, com.meituan.msi.lifecycle.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c3fe0c98392fcd60a4a0ab520470ad7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c3fe0c98392fcd60a4a0ab520470ad7");
        } else {
            super.c();
        }
    }

    @Override // com.meituan.msi.api.device.b, com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65ebb7a499b2ccdc62c5b663543554e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65ebb7a499b2ccdc62c5b663543554e2");
        } else {
            super.d();
        }
    }
}

package com.meituan.msi.api.gyroscope;

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
public class GyroscopeApi extends b<a> implements IMsiApi {
    public static ChangeQuickRedirect a;
    public a b;

    @Override // com.meituan.msi.api.device.b
    public final /* synthetic */ a a(@NonNull MtSensorManager mtSensorManager, String str) {
        Object[] objArr = {mtSensorManager, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e53ca567c3a20a96c96393e7d8c1e239", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e53ca567c3a20a96c96393e7d8c1e239") : new a(com.meituan.msi.a.f(), mtSensorManager, str);
    }

    public GyroscopeApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbfaece3844e5a90db382c9b4179d906", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbfaece3844e5a90db382c9b4179d906");
        } else {
            this.b = null;
        }
    }

    @MsiApiMethod(name = "startGyroscope", request = GyroscopeParam.class)
    public synchronized void startGyroscope(GyroscopeParam gyroscopeParam, MsiContext msiContext) {
        Object[] objArr = {gyroscopeParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b990b864cac0a3467fb39c4d95da9f99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b990b864cac0a3467fb39c4d95da9f99");
            return;
        }
        this.b = a(gyroscopeParam._mt == null ? "" : gyroscopeParam._mt.sceneToken, msiContext);
        if (this.b == null) {
            msiContext.onError("auth granted but got no data");
        } else {
            this.b.a(gyroscopeParam, msiContext);
        }
    }

    @MsiApiMethod(name = "stopGyroscope", request = GyroscopeParam.class)
    public synchronized void stopGyroscope(GyroscopeParam gyroscopeParam, MsiContext msiContext) {
        Object[] objArr = {gyroscopeParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f805a5e3b041335df17c99f0c3645f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f805a5e3b041335df17c99f0c3645f22");
            return;
        }
        this.b = b(gyroscopeParam._mt == null ? "" : gyroscopeParam._mt.sceneToken);
        if (this.b == null) {
            msiContext.onError("implement is null");
        } else {
            this.b.b(msiContext);
        }
    }

    @MsiApiMethod(isCallback = true, name = "onGyroscopeChange", response = GyroscopeChangeEvent.class)
    public synchronized void onGyroscopeChange(MsiContext msiContext) {
    }

    @MsiApiMethod(name = "offGyroscopeChange")
    public synchronized void offGyroscopeChange(MsiContext msiContext) {
    }

    @Override // com.meituan.msi.api.device.b
    public final String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9e3533517e67985bec6ecdb5fea037", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9e3533517e67985bec6ecdb5fea037") : TextUtils.isEmpty(str) ? "GyroscopeDefault" : str;
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9025e73433be49ca571d09be40d4fc9b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9025e73433be49ca571d09be40d4fc9b");
                return;
            }
            this.g = new float[3];
            this.i = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized void a(GyroscopeParam gyroscopeParam, @Nullable final MsiContext msiContext) {
            Object[] objArr = {gyroscopeParam, msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "089e08ad35fb5343c060cb75e0db936a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "089e08ad35fb5343c060cb75e0db936a");
            } else if (!this.i && this.d != null) {
                if (msiContext != null) {
                    msiContext.onSuccess(null);
                }
            } else {
                this.i = false;
                int a2 = GyroscopeApi.a(gyroscopeParam);
                if (this.d == null) {
                    this.d = Privacy.createSensorManager(this.c, this.e);
                }
                if (this.d != null) {
                    if (this.d.registerListener(this, this.d.getDefaultSensor(4), a2)) {
                        if (msiContext != null) {
                            msiContext.onSuccess(null);
                            this.h = new c(b.a(a2), new c.a() { // from class: com.meituan.msi.api.gyroscope.GyroscopeApi.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.meituan.msi.api.device.c.a
                                public final boolean a() {
                                    Object[] objArr2 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect2 = a;
                                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "425c98bfdcc9d609ff7b44c6a16562be", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "425c98bfdcc9d609ff7b44c6a16562be")).booleanValue();
                                    }
                                    if (a.this.f) {
                                        GyroscopeChangeEvent gyroscopeChangeEvent = new GyroscopeChangeEvent();
                                        gyroscopeChangeEvent.x = a.this.g[0];
                                        gyroscopeChangeEvent.y = a.this.g[1];
                                        gyroscopeChangeEvent.z = a.this.g[2];
                                        msiContext.dispatchEvent("onGyroscopeChange", gyroscopeChangeEvent);
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
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "89898ef6457f1b0f05ea8eb3b3ddaeb0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "89898ef6457f1b0f05ea8eb3b3ddaeb0");
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
                msiContext.onError("mSensorManager is null");
            }
        }

        @Override // com.meituan.msi.api.device.a
        public final void a(MsiContext msiContext) {
            Object[] objArr = {msiContext};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2690bb83e37451c96a927adae29cc8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2690bb83e37451c96a927adae29cc8");
            } else {
                b(msiContext);
            }
        }

        @Override // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent) {
            Object[] objArr = {sensorEvent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2621553024a208377159157d6abc2e57", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2621553024a208377159157d6abc2e57");
            } else if (sensorEvent.sensor.getType() == 4 && sensorEvent.values != null && sensorEvent.values.length == 3) {
                this.g = (float[]) sensorEvent.values.clone();
                if (this.h != null) {
                    this.h.a();
                }
            }
        }
    }

    public static int a(GyroscopeParam gyroscopeParam) {
        Object[] objArr = {gyroscopeParam};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "16aba940e678b811f0de883b3919d8ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "16aba940e678b811f0de883b3919d8ab")).intValue();
        }
        if (gyroscopeParam != null) {
            String str = gyroscopeParam.interval;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a3e7af8b5c840875b943ca9ba3929c5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a3e7af8b5c840875b943ca9ba3929c5");
        } else {
            super.c();
        }
    }

    @Override // com.meituan.msi.api.device.b, com.meituan.msi.lifecycle.a
    public final void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8e058bdeecce37ce04a4d33a6d562ec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8e058bdeecce37ce04a4d33a6d562ec");
        } else {
            super.d();
        }
    }
}

package com.sankuai.meituan.android.knb.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ShakeListener implements SensorEventListener {
    private static final int FORCE_THRESHOLD = 500;
    private static final int NUMBER_TEN_THOUSAND = 10000;
    private static final int SHAKE_DURATION = 1000;
    private static final int TIME_THRESHOLD = 100;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Context mContext;
    private long mLastShake;
    private long mLastTime;
    private float mLastX;
    private float mLastY;
    private float mLastZ;
    private MtSensorManager mSensorMgr;
    private OnShakeListener mShakeListener;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface OnShakeListener {
        void onShake();
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public ShakeListener(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ace61ab48b6044f3d4bb1b86c2b5bff", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ace61ab48b6044f3d4bb1b86c2b5bff");
            return;
        }
        this.mLastX = -1.0f;
        this.mLastY = -1.0f;
        this.mLastZ = -1.0f;
        this.mContext = context;
    }

    public void setOnShakeListener(OnShakeListener onShakeListener) {
        this.mShakeListener = onShakeListener;
    }

    public void resume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0af2a23814c7f5b7d7590803f1bf63de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0af2a23814c7f5b7d7590803f1bf63de");
            return;
        }
        try {
            this.mSensorMgr = Privacy.createSensorManager(this.mContext, "");
            if (this.mSensorMgr == null || this.mSensorMgr.registerListener(this, this.mSensorMgr.getDefaultSensor(1), 3)) {
                return;
            }
            this.mSensorMgr.unregisterListener(this, this.mSensorMgr.getDefaultSensor(1));
        } catch (Exception unused) {
        }
    }

    public void pause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45a1db2055d5791624432baec34007dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45a1db2055d5791624432baec34007dc");
        } else if (this.mSensorMgr != null) {
            this.mSensorMgr.unregisterListener(this, this.mSensorMgr.getDefaultSensor(1));
            this.mSensorMgr = null;
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        Object[] objArr = {sensorEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3d269ac237ba8ea275f69418dd0d42dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3d269ac237ba8ea275f69418dd0d42dd");
        } else if (sensorEvent.sensor.getType() == 1 && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.mLastTime > 100) {
                if ((Math.abs(((((fArr[0] + fArr[1]) + fArr[2]) - this.mLastX) - this.mLastY) - this.mLastZ) / ((float) (currentTimeMillis - this.mLastTime))) * 10000.0f > 500.0f && currentTimeMillis - this.mLastShake > 1000) {
                    this.mLastShake = currentTimeMillis;
                    if (this.mShakeListener != null) {
                        this.mShakeListener.onShake();
                    }
                }
                this.mLastTime = currentTimeMillis;
                this.mLastX = fArr[0];
                this.mLastY = fArr[1];
                this.mLastZ = fArr[2];
            }
        }
    }
}

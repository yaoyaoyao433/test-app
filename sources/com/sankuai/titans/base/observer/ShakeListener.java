package com.sankuai.titans.base.observer;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b02c03c2884c36f975bacbd2fa1d2007", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b02c03c2884c36f975bacbd2fa1d2007");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bea1b95ed4701d601ba38545cda04be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bea1b95ed4701d601ba38545cda04be");
            return;
        }
        this.mSensorMgr = Privacy.createSensorManager(this.mContext, TitansConstants.Privacy.TITANS_SHAKE_TOKEN);
        if (this.mSensorMgr == null || this.mSensorMgr.registerListener(this, this.mSensorMgr.getDefaultSensor(1), 3)) {
            return;
        }
        this.mSensorMgr.unregisterListener(this, this.mSensorMgr.getDefaultSensor(1));
    }

    public void pause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ca4c7834173de7d54f8f23152c3b3cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ca4c7834173de7d54f8f23152c3b3cc");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2cd8aac07203df49d45cf4f5a42d740", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2cd8aac07203df49d45cf4f5a42d740");
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

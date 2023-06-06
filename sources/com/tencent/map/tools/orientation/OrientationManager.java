package com.tencent.map.tools.orientation;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.OrientationEventListener;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class OrientationManager extends OrientationEventListener implements SensorEventListener {
    private Context contextObj;
    private float mLastAngle;
    private List<OrientationListener> mListeners;
    private int mOrientation;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public OrientationManager(Context context) {
        super(context, 3);
        this.mListeners = new ArrayList();
        this.contextObj = null;
        this.contextObj = context;
    }

    public void destroy() {
        this.mListeners.clear();
        try {
            disable();
            SensorManager sensorManager = (SensorManager) this.contextObj.getSystemService("sensor");
            if (!sensorManager.getSensorList(3).isEmpty()) {
                sensorManager.unregisterListener(this);
            }
        } catch (Exception unused) {
        }
        this.contextObj = null;
    }

    public void addOrientationListener(OrientationListener orientationListener) {
        if (this.mListeners.contains(orientationListener)) {
            return;
        }
        this.mListeners.add(orientationListener);
        if (this.mListeners.size() == 1) {
            try {
                enable();
                SensorManager sensorManager = (SensorManager) this.contextObj.getSystemService("sensor");
                List<Sensor> sensorList = sensorManager.getSensorList(3);
                if (sensorList.isEmpty()) {
                    return;
                }
                sensorManager.registerListener(this, sensorList.get(0), 2);
            } catch (Exception unused) {
            }
        }
    }

    public void removeOrientationListener(OrientationListener orientationListener) {
        if (this.mListeners.contains(orientationListener)) {
            this.mListeners.remove(orientationListener);
            if (this.mListeners.isEmpty()) {
                try {
                    disable();
                    SensorManager sensorManager = (SensorManager) this.contextObj.getSystemService("sensor");
                    if (sensorManager.getSensorList(3).isEmpty()) {
                        return;
                    }
                    sensorManager.unregisterListener(this);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 3) {
            boolean z = false;
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            if (f == 0.0f) {
                return;
            }
            if (Math.abs(this.mLastAngle - f) > 30.0f) {
                this.mLastAngle = f;
                return;
            }
            float f4 = (f + this.mLastAngle) / 2.0f;
            this.mLastAngle = f4;
            try {
                if (this.contextObj.getResources().getConfiguration().orientation == 2) {
                    z = true;
                }
            } catch (Exception unused) {
            }
            int i = this.mOrientation;
            if (z) {
                if (i > 45 && i <= 135) {
                    f4 = (f4 + 270.0f) % 360.0f;
                } else if (i > 135 && i <= 225) {
                    f4 = (f4 + 180.0f) % 360.0f;
                } else if (i > 225 && i < 315) {
                    f4 = (f4 + 90.0f) % 360.0f;
                }
            }
            try {
                ArrayList<OrientationListener> arrayList = new ArrayList();
                arrayList.addAll(this.mListeners);
                for (OrientationListener orientationListener : arrayList) {
                    if (orientationListener != null) {
                        orientationListener.onOrientationChanged(f4, f2, f3);
                    }
                }
            } catch (ArrayIndexOutOfBoundsException unused2) {
            } catch (OutOfMemoryError unused3) {
            }
        }
    }

    @Override // android.view.OrientationEventListener
    public void onOrientationChanged(int i) {
        if (i >= 0) {
            this.mOrientation = i;
        }
    }
}

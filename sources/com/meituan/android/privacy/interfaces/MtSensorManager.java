package com.meituan.android.privacy.interfaces;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.os.Handler;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public interface MtSensorManager {
    Sensor getDefaultSensor(int i);

    Sensor getDefaultSensor(int i, boolean z);

    List<Sensor> getSensorList(int i);

    boolean registerListener(SensorEventListener sensorEventListener, Sensor sensor, int i);

    boolean registerListener(SensorEventListener sensorEventListener, Sensor sensor, int i, int i2);

    boolean registerListener(SensorEventListener sensorEventListener, Sensor sensor, int i, int i2, Handler handler);

    boolean registerListener(SensorEventListener sensorEventListener, Sensor sensor, int i, Handler handler);

    void unregisterListener(SensorEventListener sensorEventListener);

    void unregisterListener(SensorEventListener sensorEventListener, Sensor sensor);
}

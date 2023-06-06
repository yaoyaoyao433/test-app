package com.meituan.android.common.statistics.sensor;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.pageinfo.PageInfoManager;
import com.meituan.android.common.statistics.utils.DeviceUtil;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.android.jarvis.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SensorCollectManager {
    private static final String BID = "b_techportal_gdqu72hh_sc";
    private static final String EXCEPTION_BID = "b_techportal_stnufdm9_sc";
    private static SensorEventListener accelerometerListener = null;
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static SensorEventListener gravityListener = null;
    private static SensorEventListener gyroscopeListener = null;
    private static SensorEventListener humidityListener = null;
    private static SensorEventListener lightListener = null;
    private static SensorEventListener linearAccelerationListener = null;
    private static SensorEventListener magneticFiledListener = null;
    private static SensorEventListener pressureListener = null;
    private static SensorEventListener proximityListener = null;
    public static final int reportSum = 15;
    private static SensorEventListener rotationVectorListener;
    private static MtSensorManager sensorManager;
    private static SensorEventListener temperatureListener;
    private volatile long beginCpu;
    private final int dispatchBlueTotal;
    private volatile long endCpu;
    private ScheduledExecutorService initScheduledExecutorService;
    private ScheduledFuture<?> initScheduledFuture;
    private volatile boolean isCollect;
    private volatile boolean isInit;
    private volatile boolean isStart;
    private int pauseDuration;
    private int reportTotal;
    private final SensorData sensorData;
    private final SensorDataElement sensorDataElementTemp;
    private List<ISensorDispatcher> sensorDispatcherList;
    private ScheduledExecutorService startScheduledExecutorService;
    private ScheduledFuture<?> startScheduledFuture;
    private ScheduledExecutorService stopScheduledExecutorService;
    private ScheduledFuture<?> stopScheduledFuture;

    public SensorCollectManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b9d4df461754553a01f1eac759eb2376", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b9d4df461754553a01f1eac759eb2376");
            return;
        }
        this.isInit = false;
        this.isCollect = true;
        this.isStart = true;
        this.sensorData = new SensorData();
        this.sensorDataElementTemp = new SensorDataElement();
        this.pauseDuration = 120;
        this.reportTotal = 1200;
        this.dispatchBlueTotal = 40;
        this.startScheduledFuture = null;
        this.stopScheduledFuture = null;
        this.initScheduledFuture = null;
        this.sensorDispatcherList = new ArrayList();
        sensorManager = Privacy.createSensorManager(Statistics.getContext(), "com.meituan.android.common.analyse");
        this.startScheduledExecutorService = c.b("Statistics-Sensor-start-Schedule", 1);
        this.stopScheduledExecutorService = c.b("Statistics-Sensor-stop-Schedule", 1);
        this.initScheduledExecutorService = c.b("Statistics-Sensor-init-Schedule", 1);
    }

    public static SensorCollectManager getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a715c504f9918f8b6819d6935b190ac7", 6917529027641081856L) ? (SensorCollectManager) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a715c504f9918f8b6819d6935b190ac7") : SensorCollectManagerHolder.instance;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class SensorCollectManagerHolder {
        public static ChangeQuickRedirect changeQuickRedirect;
        private static final SensorCollectManager instance = new SensorCollectManager();
    }

    public void init(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ee7f4dff3b3cb9f70a5ec0fab6e7f5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ee7f4dff3b3cb9f70a5ec0fab6e7f5e");
            return;
        }
        LogUtil.log("Sensor:init delay " + i + "s...");
        this.pauseDuration = i3;
        this.reportTotal = i2 * 20;
        initSensorListener();
        if (this.initScheduledFuture != null && !this.initScheduledFuture.isCancelled()) {
            this.initScheduledFuture.cancel(true);
        }
        this.initScheduledFuture = this.initScheduledExecutorService.schedule(new Runnable() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "91a3cf6a3b5048a7fe2c08f70e0292d1", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "91a3cf6a3b5048a7fe2c08f70e0292d1");
                    return;
                }
                LogUtil.log("Sensor:init delay finish!!! start collected!");
                SensorCollectManager.this.isInit = true;
                SensorCollectManager.this.startCollect();
            }
        }, i * 1000, TimeUnit.MILLISECONDS);
    }

    private void initSensorListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7baf4c77988448ca35ca1355fc2096d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7baf4c77988448ca35ca1355fc2096d3");
            return;
        }
        accelerometerListener = new SensorEventListener() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "018450f6e0d6aaa603f80139ad422744", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "018450f6e0d6aaa603f80139ad422744");
                    return;
                }
                try {
                    SensorCollectManager.this.sensorDataElementTemp.aX = sensorEvent.values[0];
                    SensorCollectManager.this.sensorDataElementTemp.aY = sensorEvent.values[1];
                    SensorCollectManager.this.sensorDataElementTemp.aZ = sensorEvent.values[2];
                } catch (Exception unused) {
                }
            }
        };
        linearAccelerationListener = new SensorEventListener() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a00349b2877d4d826b7aef2a22a0b165", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a00349b2877d4d826b7aef2a22a0b165");
                    return;
                }
                try {
                    SensorCollectManager.this.sensorDataElementTemp.laX = sensorEvent.values[0];
                    SensorCollectManager.this.sensorDataElementTemp.laY = sensorEvent.values[1];
                    SensorCollectManager.this.sensorDataElementTemp.laZ = sensorEvent.values[2];
                } catch (Exception unused) {
                }
            }
        };
        gravityListener = new SensorEventListener() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.4
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7b3b6326ae2114e6fbca7efdf854d31f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7b3b6326ae2114e6fbca7efdf854d31f");
                    return;
                }
                try {
                    SensorCollectManager.this.sensorDataElementTemp.gX = sensorEvent.values[0];
                    SensorCollectManager.this.sensorDataElementTemp.gY = sensorEvent.values[1];
                    SensorCollectManager.this.sensorDataElementTemp.gZ = sensorEvent.values[2];
                } catch (Exception unused) {
                }
            }
        };
        gyroscopeListener = new SensorEventListener() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.5
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "82fa4fbaa57e1eed0ea24ca8b8b0a5a8", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "82fa4fbaa57e1eed0ea24ca8b8b0a5a8");
                    return;
                }
                try {
                    SensorCollectManager.this.sensorDataElementTemp.gyX = sensorEvent.values[0];
                    SensorCollectManager.this.sensorDataElementTemp.gyY = sensorEvent.values[1];
                    SensorCollectManager.this.sensorDataElementTemp.gyZ = sensorEvent.values[2];
                } catch (Exception unused) {
                }
            }
        };
        rotationVectorListener = new SensorEventListener() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.6
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "52d65c9aac3ddf936f0c87415e237acf", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "52d65c9aac3ddf936f0c87415e237acf");
                    return;
                }
                try {
                    SensorCollectManager.this.sensorDataElementTemp.rvX = sensorEvent.values[0];
                    SensorCollectManager.this.sensorDataElementTemp.rvY = sensorEvent.values[1];
                    SensorCollectManager.this.sensorDataElementTemp.rvZ = sensorEvent.values[2];
                } catch (Exception unused) {
                }
            }
        };
        magneticFiledListener = new SensorEventListener() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.7
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "37df7acdaa548dad825e404b7a5bef3d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "37df7acdaa548dad825e404b7a5bef3d");
                    return;
                }
                try {
                    SensorCollectManager.this.sensorDataElementTemp.mfX = sensorEvent.values[0];
                    SensorCollectManager.this.sensorDataElementTemp.mfY = sensorEvent.values[1];
                    SensorCollectManager.this.sensorDataElementTemp.mfZ = sensorEvent.values[2];
                } catch (Exception unused) {
                }
            }
        };
        temperatureListener = new SensorEventListener() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.8
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8b1b554696ec05aa7edc50fa3434f6c1", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8b1b554696ec05aa7edc50fa3434f6c1");
                    return;
                }
                try {
                    SensorCollectManager.this.sensorDataElementTemp.temperature = sensorEvent.values[0];
                } catch (Exception unused) {
                }
            }
        };
        lightListener = new SensorEventListener() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.9
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ed868d20812c695233ba76f0d826e49d", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ed868d20812c695233ba76f0d826e49d");
                    return;
                }
                try {
                    SensorCollectManager.this.sensorDataElementTemp.light = sensorEvent.values[0];
                } catch (Exception unused) {
                }
            }
        };
        proximityListener = new SensorEventListener() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.10
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "73abdc1747c72a45dcc52820cc01f37e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "73abdc1747c72a45dcc52820cc01f37e");
                    return;
                }
                try {
                    SensorCollectManager.this.sensorDataElementTemp.proximity = sensorEvent.values[0];
                } catch (Exception unused) {
                }
            }
        };
        pressureListener = new SensorEventListener() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.11
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a8c69606e0cc6ef0db87bc6607e0246e", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a8c69606e0cc6ef0db87bc6607e0246e");
                    return;
                }
                try {
                    SensorCollectManager.this.sensorDataElementTemp.pressure = sensorEvent.values[0];
                } catch (Exception unused) {
                }
            }
        };
        humidityListener = new SensorEventListener() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.12
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(Sensor sensor, int i) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(SensorEvent sensorEvent) {
                Object[] objArr2 = {sensorEvent};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "89616738275cdaf4aa0a00385f6a1594", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "89616738275cdaf4aa0a00385f6a1594");
                    return;
                }
                try {
                    SensorCollectManager.this.sensorDataElementTemp.humidity = sensorEvent.values[0];
                } catch (Exception unused) {
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCollect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fb1ef52d47c99957b6190f523916faf2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fb1ef52d47c99957b6190f523916faf2");
            return;
        }
        LogUtil.log("Sensor:invoke startCollect()");
        this.beginCpu = DeviceUtil.getAppCpuTime();
        LogUtil.log("Sensor:begin cpu info" + this.beginCpu);
        this.isCollect = true;
        registerSensorListener();
        this.startScheduledFuture = this.startScheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.13
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "59d11185980a8ed6858723c4cf067771", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "59d11185980a8ed6858723c4cf067771");
                    return;
                }
                try {
                    if (!SensorCollectManager.this.isCollect || !SensorCollectManager.this.isStart) {
                        if (SensorCollectManager.this.stopScheduledFuture == null || SensorCollectManager.this.stopScheduledFuture.isCancelled()) {
                            SensorCollectManager.this.stopScheduledFuture = SensorCollectManager.this.stopScheduledExecutorService.schedule(new Runnable() { // from class: com.meituan.android.common.statistics.sensor.SensorCollectManager.13.1
                                public static ChangeQuickRedirect changeQuickRedirect;

                                @Override // java.lang.Runnable
                                public void run() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "711882dfa162c5ab9526bf6bb896c964", 6917529027641081856L)) {
                                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "711882dfa162c5ab9526bf6bb896c964");
                                        return;
                                    }
                                    LogUtil.log("Sensor:end pause");
                                    SensorCollectManager.this.registerSensorListener();
                                    SensorCollectManager.this.isCollect = true;
                                    SensorCollectManager.this.stopScheduledFuture.cancel(true);
                                }
                            }, SensorCollectManager.this.pauseDuration * 1000, TimeUnit.MILLISECONDS);
                            return;
                        }
                        return;
                    }
                    if (SensorCollectManager.this.sensorData.getElementCount() == 0) {
                        LogUtil.log("Sensor:start..)");
                        SensorCollectManager.this.sensorData.setCollectId(SensorUtils.generateCollectId());
                    }
                    SensorDataElement sensorDataElement = (SensorDataElement) SensorCollectManager.this.sensorDataElementTemp.clone();
                    sensorDataElement.seq = SensorCollectManager.this.sensorData.getElementCount() + 1;
                    sensorDataElement.pvCid = Statistics.getCid(PageInfoManager.getInstance().getCurrentPageInfoKey());
                    sensorDataElement.stm = String.valueOf(System.currentTimeMillis());
                    if (TextUtils.isEmpty(sensorDataElement.pvCid)) {
                        LogUtil.log("lx_sdk", "Sensor:pv_cid error!!! pageInfoKey=" + PageInfoManager.getInstance().getCurrentPageInfoKey());
                    }
                    SensorCollectManager.this.sensorData.addElement(sensorDataElement);
                    if (SensorCollectManager.this.sensorData.getDispatchBlueElementCount() >= 40) {
                        SensorCollectManager.this.dispatchBlue();
                        SensorCollectManager.this.sensorData.cleanBlueDispatchBlueElementList();
                    }
                    if (SensorCollectManager.this.sensorData.getElementCount() >= SensorCollectManager.this.reportTotal) {
                        SensorCollectManager.this.unRegisterSensorListener();
                        LogUtil.log("Sensor:pause...)");
                        SensorCollectManager.this.endCpu = DeviceUtil.getAppCpuTime();
                        LogUtil.log("Sensor:end cpu info=" + SensorCollectManager.this.endCpu);
                        SensorCollectManager.this.isCollect = false;
                        SensorCollectManager.this.reportNet();
                        SensorCollectManager.this.sensorData.cleanElementList();
                    }
                } catch (Exception unused) {
                }
            }
        }, 0L, 50L, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchBlue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6cb0174d27ecc161edaac9034a709528", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6cb0174d27ecc161edaac9034a709528");
        } else if (this.sensorDispatcherList != null && !this.sensorDispatcherList.isEmpty()) {
            for (ISensorDispatcher iSensorDispatcher : this.sensorDispatcherList) {
                if (iSensorDispatcher != null) {
                    iSensorDispatcher.dispatch(this.sensorData.toBlueJsonObject());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportNet() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91820f59e00956c294387f18f3de2f8e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91820f59e00956c294387f18f3de2f8e");
        } else if (!ConfigManager.getInstance(Statistics.getContext()).getMotionReportEnable()) {
            LogUtil.log("Sensor:motion_report_enable=false");
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < this.sensorData.getElementCount() / 15; i3++) {
                JSONObject valLabJsonObject = this.sensorData.toValLabJsonObject(i3);
                try {
                    valLabJsonObject.put("total_duration", (this.reportTotal / 20) * 1000);
                    valLabJsonObject.put("freq", "20");
                    valLabJsonObject.put("begin_cpu", this.beginCpu);
                    valLabJsonObject.put("end_cpu", this.endCpu);
                    Statistics.getChannel("techportal").writeSystemCheck(PageInfoManager.getInstance().getCurrentPageInfoKey(), BID, JsonUtil.jsonObjectToMap(valLabJsonObject));
                    i2++;
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            LogUtil.log("Sensor:report n=" + i2);
            if (this.sensorData.getElementCount() % 15 == 0 || (i = i2 * 15) >= this.sensorData.getElementCount()) {
                return;
            }
            LogUtil.log("Sensor:last sensor info report, last size=" + (this.sensorData.getElementCount() - i));
            JSONObject valLabLastJsonObject = this.sensorData.toValLabLastJsonObject(i);
            try {
                valLabLastJsonObject.put("total_duration", (this.reportTotal / 20) * 1000);
                valLabLastJsonObject.put("freq", "20");
                valLabLastJsonObject.put("begin_cpu", this.beginCpu);
                valLabLastJsonObject.put("end_cpu", this.endCpu);
                Statistics.getChannel("techportal").writeSystemCheck(PageInfoManager.getInstance().getCurrentPageInfoKey(), BID, JsonUtil.jsonObjectToMap(valLabLastJsonObject));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void start() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e6a8b8ee2672945a0835efc3d2c20001", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e6a8b8ee2672945a0835efc3d2c20001");
        } else if (this.isInit) {
            LogUtil.log("Sensor:AS");
            this.isStart = true;
            startCollect();
        }
    }

    public void stop() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a4628e0e28fc31d9bdd6cd2903c163a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a4628e0e28fc31d9bdd6cd2903c163a");
            return;
        }
        try {
            if (this.isInit) {
                LogUtil.log("Sensor:AQ");
                unRegisterSensorListener();
                this.isStart = false;
                this.isCollect = false;
                if (this.startScheduledFuture != null && !this.startScheduledFuture.isCancelled()) {
                    this.startScheduledFuture.cancel(true);
                }
                if (this.stopScheduledFuture != null && !this.stopScheduledFuture.isCancelled()) {
                    this.stopScheduledFuture.cancel(true);
                }
                this.sensorData.cleanBlueDispatchBlueElementList();
                this.endCpu = DeviceUtil.getAppCpuTime();
                LogUtil.log("Sensor:end cpu info=" + this.endCpu);
                reportNet();
                this.sensorData.cleanElementList();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerSensorListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1022cc4fe5b75c2a9882d7a4846e66b5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1022cc4fe5b75c2a9882d7a4846e66b5");
            return;
        }
        try {
            unRegisterSensorListener();
            LogUtil.log("Sensor:registerSensorListener");
            if (sensorManager != null) {
                if (accelerometerListener != null) {
                    sensorManager.registerListener(accelerometerListener, sensorManager.getDefaultSensor(1), 2);
                }
                if (linearAccelerationListener != null) {
                    sensorManager.registerListener(linearAccelerationListener, sensorManager.getDefaultSensor(10), 2);
                }
                if (gravityListener != null) {
                    sensorManager.registerListener(gravityListener, sensorManager.getDefaultSensor(9), 2);
                }
                if (gyroscopeListener != null) {
                    sensorManager.registerListener(gyroscopeListener, sensorManager.getDefaultSensor(4), 2);
                }
                if (rotationVectorListener != null) {
                    sensorManager.registerListener(rotationVectorListener, sensorManager.getDefaultSensor(11), 2);
                }
                if (magneticFiledListener != null) {
                    sensorManager.registerListener(magneticFiledListener, sensorManager.getDefaultSensor(2), 2);
                }
                if (temperatureListener != null) {
                    sensorManager.registerListener(temperatureListener, sensorManager.getDefaultSensor(13), 2);
                }
                if (humidityListener != null) {
                    sensorManager.registerListener(humidityListener, sensorManager.getDefaultSensor(12), 2);
                }
                if (pressureListener != null) {
                    sensorManager.registerListener(pressureListener, sensorManager.getDefaultSensor(6), 2);
                }
                if (proximityListener != null) {
                    sensorManager.registerListener(proximityListener, sensorManager.getDefaultSensor(8), 2);
                }
                if (lightListener != null) {
                    sensorManager.registerListener(lightListener, sensorManager.getDefaultSensor(5), 2);
                }
            }
        } catch (Exception e) {
            HashMap hashMap = new HashMap();
            hashMap.put("e", e.getMessage());
            Statistics.getChannel("techportal").writeSystemCheck(PageInfoManager.getInstance().getCurrentPageInfoKey(), EXCEPTION_BID, hashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unRegisterSensorListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53132473c2c655d4b9f1f0d4d4a89ef5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53132473c2c655d4b9f1f0d4d4a89ef5");
            return;
        }
        try {
            LogUtil.log("Sensor:unRegisterSensorListener");
            if (sensorManager != null) {
                if (accelerometerListener != null) {
                    sensorManager.unregisterListener(accelerometerListener);
                }
                if (linearAccelerationListener != null) {
                    sensorManager.unregisterListener(linearAccelerationListener);
                }
                if (gravityListener != null) {
                    sensorManager.unregisterListener(gravityListener);
                }
                if (gyroscopeListener != null) {
                    sensorManager.unregisterListener(gyroscopeListener);
                }
                if (rotationVectorListener != null) {
                    sensorManager.unregisterListener(rotationVectorListener);
                }
                if (magneticFiledListener != null) {
                    sensorManager.unregisterListener(magneticFiledListener);
                }
                if (temperatureListener != null) {
                    sensorManager.unregisterListener(temperatureListener);
                }
                if (lightListener != null) {
                    sensorManager.unregisterListener(lightListener);
                }
                if (proximityListener != null) {
                    sensorManager.unregisterListener(proximityListener);
                }
                if (pressureListener != null) {
                    sensorManager.unregisterListener(pressureListener);
                }
                if (humidityListener != null) {
                    sensorManager.unregisterListener(humidityListener);
                }
            }
        } catch (Exception e) {
            HashMap hashMap = new HashMap();
            hashMap.put("e", e.getMessage());
            Statistics.getChannel("techportal").writeSystemCheck(PageInfoManager.getInstance().getCurrentPageInfoKey(), EXCEPTION_BID, hashMap);
        }
    }

    public void registerSensor(ISensorDispatcher iSensorDispatcher) {
        Object[] objArr = {iSensorDispatcher};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5436e1714039d02f166ad5055a0dcc64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5436e1714039d02f166ad5055a0dcc64");
        } else {
            this.sensorDispatcherList.add(iSensorDispatcher);
        }
    }
}

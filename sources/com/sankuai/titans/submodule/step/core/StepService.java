package com.sankuai.titans.submodule.step.core;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.android.base.util.a;
import com.meituan.android.cipstorage.q;
import com.meituan.android.privacy.interfaces.MtSensorManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.c;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class StepService extends Service implements SensorEventListener {
    public static final String CURR_STEP = "footstep_curr_step";
    public static final String DATE_RECORD = "footstep_date_record";
    public static final String LAST_STEP = "footstep_last_step";
    private static final String STEP_TOKEN = "Titans_Step";
    private static final String TAG = "KNB_StepCountJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int stepSensorType = -1;
    private BroadcastReceiver broadcastReceiver;
    private q cipStorageCenter;
    private CountDownLatch getStepCountLatch;
    private boolean hasRecord;
    private int lastStepCount;
    private int sCurrStep;
    private MtSensorManager sensorManager;
    private StepBinder stepBinder;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    public StepService() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61787f0e6cb20c57e142757fd538d3c6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61787f0e6cb20c57e142757fd538d3c6");
            return;
        }
        this.hasRecord = false;
        this.lastStepCount = 0;
        this.sCurrStep = 0;
        this.getStepCountLatch = null;
        this.stepBinder = new StepBinder();
    }

    @Override // android.app.Service
    public void onCreate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1078332a1c8f1a19d95d91466a055621", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1078332a1c8f1a19d95d91466a055621");
            return;
        }
        c.a(this);
        super.onCreate();
        this.cipStorageCenter = q.a(getApplicationContext(), "mtplatform_group", 1);
        this.sCurrStep = getCurrentStep();
        registerReceiver();
        com.sankuai.android.jarvis.c.a("step-startStepDetector", new Runnable() { // from class: com.sankuai.titans.submodule.step.core.StepService.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0681b2651a4beafb2b1518e9cd8a66d0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0681b2651a4beafb2b1518e9cd8a66d0");
                } else {
                    StepService.this.startStepDetector();
                }
            }
        }).start();
        com.dianping.networklog.c.a(" StepService ，onCreate：", 3, new String[]{TAG});
    }

    private void registerReceiver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3a85e9aaaa8e0b0a69c440fcee6cbbbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3a85e9aaaa8e0b0a69c440fcee6cbbbd");
        } else if (this.broadcastReceiver == null) {
            this.broadcastReceiver = new BroadcastReceiver() { // from class: com.sankuai.titans.submodule.step.core.StepService.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Object[] objArr2 = {context, intent};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "58abd2f1ae923966d04035b7e45b56cf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "58abd2f1ae923966d04035b7e45b56cf");
                    } else if ("android.intent.action.DATE_CHANGED".equals(intent.getAction())) {
                        StepService.this.clearCurrentStep();
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.DATE_CHANGED");
            try {
                getApplicationContext().registerReceiver(this.broadcastReceiver, intentFilter);
            } catch (Exception unused) {
            }
        }
    }

    private void unregisterReceiver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1219bebb89c30c20674d8fa80292e819", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1219bebb89c30c20674d8fa80292e819");
        } else if (this.broadcastReceiver != null) {
            try {
                getApplicationContext().unregisterReceiver(this.broadcastReceiver);
            } catch (Exception unused) {
            }
            this.broadcastReceiver = null;
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72d81aae8545fc30deb7cb6e33bcc199", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72d81aae8545fc30deb7cb6e33bcc199");
            return;
        }
        c.b(this);
        unregisterReceiver();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startStepDetector() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "460db2fcdbb1c2483d7909812ac7006a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "460db2fcdbb1c2483d7909812ac7006a");
            return;
        }
        if (this.sensorManager != null) {
            this.sensorManager = null;
        }
        this.sensorManager = Privacy.createSensorManager(this, STEP_TOKEN);
        if (Build.VERSION.SDK_INT >= 19) {
            addCountStepListener();
        }
    }

    private void addCountStepListener() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b5abc058fbba5c7f176bc62b0da2b207", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b5abc058fbba5c7f176bc62b0da2b207");
            return;
        }
        Sensor defaultSensor = this.sensorManager.getDefaultSensor(19);
        Sensor defaultSensor2 = this.sensorManager.getDefaultSensor(18);
        if (defaultSensor != null) {
            stepSensorType = 19;
            this.sensorManager.registerListener(this, defaultSensor, 3);
        } else if (defaultSensor2 != null) {
            stepSensorType = 18;
            this.sensorManager.registerListener(this, defaultSensor2, 3);
        }
    }

    private boolean isNewDay(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f56fd9ea0b3cff4540b6495adf77bf4a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f56fd9ea0b3cff4540b6495adf77bf4a")).booleanValue() : (this.cipStorageCenter == null || TextUtils.equals(str, this.cipStorageCenter.b(DATE_RECORD, (String) null))) ? false : true;
    }

    private void saveDay(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51e93993b8d5d06314254596472b0dde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51e93993b8d5d06314254596472b0dde");
        } else if (this.cipStorageCenter != null) {
            this.cipStorageCenter.a(DATE_RECORD, str);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.stepBinder;
    }

    public void clearCurrentStep() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e3001b5efb32a01a6a5ab76b293b230", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e3001b5efb32a01a6a5ab76b293b230");
            return;
        }
        long c = a.c(System.currentTimeMillis());
        if (!isNewDay(String.valueOf(c)) || this.cipStorageCenter == null) {
            return;
        }
        this.cipStorageCenter.b(CURR_STEP);
        saveDay(String.valueOf(c));
        com.dianping.networklog.c.a("零点过，清空用户步数：" + this.sCurrStep, 3, new String[]{TAG});
    }

    public int getCurrentStep() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "213aaf284d60d06a6d0252acd2504719", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "213aaf284d60d06a6d0252acd2504719")).intValue();
        }
        int currentStepImpl = getCurrentStepImpl();
        if (currentStepImpl > 0) {
            return currentStepImpl;
        }
        this.getStepCountLatch = new CountDownLatch(1);
        try {
            this.getStepCountLatch.await(1000L, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            com.dianping.networklog.c.a(Log.getStackTraceString(th), 35);
        }
        this.getStepCountLatch = null;
        return getCurrentStepImpl();
    }

    private int getCurrentStepImpl() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf637304907862ee61b8ef87110f3131", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf637304907862ee61b8ef87110f3131")).intValue();
        }
        if (this.cipStorageCenter != null) {
            this.sCurrStep = (int) this.cipStorageCenter.b(CURR_STEP, 0.0f);
        }
        com.dianping.networklog.c.a("当前返回的用户步数为：" + this.sCurrStep, 3, new String[]{TAG});
        return this.sCurrStep;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        Object[] objArr = {sensorEvent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "194d83ebd06cabc2be759d8546933c46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "194d83ebd06cabc2be759d8546933c46");
            return;
        }
        if (stepSensorType == 19) {
            int i = (int) sensorEvent.values[0];
            long c = a.c(System.currentTimeMillis());
            this.lastStepCount = getLastStep();
            com.dianping.networklog.c.a("StepService onSensorChanged，event.values[0]: " + i + ", lastStepCount 为：" + this.lastStepCount, 3, new String[]{TAG});
            if (isNewDay(String.valueOf(c)) && i >= this.lastStepCount) {
                this.sCurrStep = i - this.lastStepCount;
                com.dianping.networklog.c.a("onSensorChanged调用，isNewDay为true，本地步数比上次步数记录多，当前返回步数为：" + this.sCurrStep, 3, new String[]{TAG});
                setLastStep(i);
            } else {
                if (!isNewDay(String.valueOf(c)) && i < this.lastStepCount) {
                    this.sCurrStep = this.lastStepCount + i;
                    com.dianping.networklog.c.a("onSensorChanged调用，isNewDay为false，本地步数比上次步数记录多，本次步数为：" + i + " 上次步数为：" + this.lastStepCount + " 当前返回步数为：" + this.sCurrStep, 3, new String[]{TAG});
                } else {
                    com.dianping.networklog.c.a("onSensorChanged调用，本次回调的步数为：" + i + " 上次步数为：" + this.lastStepCount + " 当前步数为：" + this.sCurrStep, 3, new String[]{TAG});
                    int i2 = i - this.lastStepCount;
                    if (i2 >= 0) {
                        this.sCurrStep += i2;
                    } else {
                        this.sCurrStep += i;
                    }
                }
                setLastStep(this.sCurrStep);
            }
            saveDay(String.valueOf(c));
        } else if (stepSensorType == 18 && sensorEvent.values[0] == 1.0d) {
            this.sCurrStep++;
        }
        setCurrentStep(this.sCurrStep);
        if (this.getStepCountLatch != null) {
            this.getStepCountLatch.countDown();
        }
    }

    private void setCurrentStep(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3c9f8d71c82ee9277f1aef3d0feb6275", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3c9f8d71c82ee9277f1aef3d0feb6275");
        } else if (this.cipStorageCenter != null) {
            this.cipStorageCenter.a(CURR_STEP, i);
        }
    }

    private void setLastStep(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1afd408d440ca6f6d85f19a240617e68", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1afd408d440ca6f6d85f19a240617e68");
        } else if (this.cipStorageCenter == null || i == 0) {
        } else {
            this.cipStorageCenter.a(LAST_STEP, i);
        }
    }

    private int getLastStep() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51a7ee7f04ba2cd2bb7f4b8725c3ac41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51a7ee7f04ba2cd2bb7f4b8725c3ac41")).intValue();
        }
        if (this.cipStorageCenter != null) {
            return (int) this.cipStorageCenter.b(LAST_STEP, 0.0f);
        }
        return 0;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class StepBinder extends Binder {
        public static ChangeQuickRedirect changeQuickRedirect;

        public StepBinder() {
        }

        public StepService getService() {
            return StepService.this;
        }
    }
}

package com.meituan.android.common.metricx.helpers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.cipstorage.q;
import com.meituan.android.common.locate.loader.LocationStrategy;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SysDateAlarm {
    private static final String CHANNEL_DATE_ALARM = "metrics_date_alarm";
    private static final String KEY_DATE = "date";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final ConcurrentLinkedQueue<Alarm> alarmListeners;
    private q center;
    private final Runnable checkDateTask;
    private String lastDate;
    private final ScheduledExecutorService service;
    private String today;
    private static final SysDateAlarm sInstance = new SysDateAlarm();
    private static volatile boolean isInit = false;
    private static volatile boolean shouldStickyAlarm = false;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface Alarm {
        void onMainProcessNewDate(String str, String str2);
    }

    public SysDateAlarm() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1bcaff31bbaf354b430dda31ee7f9b0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1bcaff31bbaf354b430dda31ee7f9b0e");
            return;
        }
        this.service = c.c("metrics-date-alarm");
        this.alarmListeners = new ConcurrentLinkedQueue<>();
        this.center = null;
        this.lastDate = "";
        this.today = "";
        this.checkDateTask = new Runnable() { // from class: com.meituan.android.common.metricx.helpers.SysDateAlarm.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2593e410f684abf6c0886644a0489611", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2593e410f684abf6c0886644a0489611");
                } else if (!SysDateAlarm.isInit || SysDateAlarm.this.center == null) {
                } else {
                    String b = SysDateAlarm.this.center.b("date", "");
                    String currentSysDate = TimeUtil.currentSysDate();
                    if (TextUtils.isEmpty(currentSysDate) || TextUtils.equals(b, currentSysDate)) {
                        return;
                    }
                    SysDateAlarm.sInstance.lastDate = b;
                    SysDateAlarm.sInstance.today = currentSysDate;
                    Iterator it = SysDateAlarm.this.alarmListeners.iterator();
                    while (it.hasNext()) {
                        ((Alarm) it.next()).onMainProcessNewDate(b, currentSysDate);
                    }
                    boolean unused = SysDateAlarm.shouldStickyAlarm = true;
                    SysDateAlarm.this.center.a("date", currentSysDate);
                }
            }
        };
    }

    public static SysDateAlarm getInstance() {
        return sInstance;
    }

    public void init(@NonNull Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04394c444dc02298e841b219811d725c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04394c444dc02298e841b219811d725c");
        } else if (isInit || !ProcessUtils.isMainProcess(context)) {
        } else {
            this.center = q.a(context, CHANNEL_DATE_ALARM);
            this.service.scheduleWithFixedDelay(this.checkDateTask, 8000L, LocationStrategy.LOCATION_TIMEOUT, TimeUnit.MILLISECONDS);
            isInit = true;
        }
    }

    public void registerListener(@NonNull Alarm alarm) {
        Object[] objArr = {alarm};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "58f3767b51ab308d32e79c1c4037cccb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "58f3767b51ab308d32e79c1c4037cccb");
        } else if (isInit) {
            this.alarmListeners.add(alarm);
            if (shouldStickyAlarm) {
                alarm.onMainProcessNewDate(this.lastDate, this.today);
            }
        }
    }
}

package com.meituan.android.common.statistics.report;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.InnerDataBuilder.InnerDataManager;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.cache.ICacheHandler;
import com.meituan.android.common.statistics.cat.CatMonitorManager;
import com.meituan.android.common.statistics.channel.DefaultEnvironment;
import com.meituan.android.common.statistics.config.ConfigManager;
import com.meituan.android.common.statistics.entity.EventLevel;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.ipc.independent.ProcessController;
import com.meituan.android.common.statistics.network.NetworkController;
import com.meituan.android.common.statistics.utils.ABCHelper;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.android.common.statistics.utils.NetworkUtils;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.sankuai.android.jarvis.c;
import com.sankuai.common.utils.ProcessUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class Reporter {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final ExecutorService mReportThreadExecutor = c.a("Statistics-Reporter");
    private ICacheHandler mCacheHandler;
    private Context mContext;
    private DefaultEnvironment mEnvironment;
    private List<Long> mFailedList;
    private AtomicBoolean mHighReporting;
    private AtomicBoolean mNormalReporting;
    private ScheduledFuture<?> mScheduledFuture;
    private ScheduledExecutorService mUrgentEventExecutor;
    private AtomicBoolean mUrgentReporting;
    private ScheduledExecutorService mWaitingExecutor;
    private ScheduledFuture<?> mWaitingScheduledFuture;

    public static void commit(Runnable runnable) {
        Object[] objArr = {runnable};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ad362e1a4654656a325e6de97881100f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ad362e1a4654656a325e6de97881100f");
        } else {
            mReportThreadExecutor.execute(runnable);
        }
    }

    public Reporter(Context context, ICacheHandler iCacheHandler, DefaultEnvironment defaultEnvironment) {
        Object[] objArr = {context, iCacheHandler, defaultEnvironment};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ce006acd70205b7d7a9c5462bf083ee", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ce006acd70205b7d7a9c5462bf083ee");
            return;
        }
        this.mScheduledFuture = null;
        this.mWaitingScheduledFuture = null;
        this.mContext = context;
        this.mCacheHandler = iCacheHandler;
        this.mEnvironment = defaultEnvironment;
        this.mFailedList = new ArrayList();
        this.mUrgentReporting = new AtomicBoolean(false);
        this.mHighReporting = new AtomicBoolean(false);
        this.mNormalReporting = new AtomicBoolean(false);
        this.mUrgentEventExecutor = c.b("Statistics-FixedSchedule", 1);
        if (mReportThreadExecutor != null) {
            mReportThreadExecutor.execute(new Runnable() { // from class: com.meituan.android.common.statistics.report.Reporter.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7652f42951a24db5d9d3e10f40a17b0f", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7652f42951a24db5d9d3e10f40a17b0f");
                    } else {
                        ReportStrategyController.clearPostData(Reporter.this.mCacheHandler);
                    }
                }
            });
        }
        this.mWaitingExecutor = c.b("Statistics-WaitingFixedSchedule", 1);
    }

    public void scheduledIndependenceReport(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "edc2e6313db27657b1c90dbb08465d6e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "edc2e6313db27657b1c90dbb08465d6e");
        } else {
            this.mWaitingScheduledFuture = this.mWaitingExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.meituan.android.common.statistics.report.Reporter.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "adb99288752695a5e98a037dee2e3b2b", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "adb99288752695a5e98a037dee2e3b2b");
                    } else if (ProcessController.getInstance().isMainProcessAlive(context) || !Statistics.isSubprocessIndependence()) {
                    } else {
                        try {
                            if (ReportStrategyController.checkIfNeedReport(Reporter.this.mContext, Reporter.this.mCacheHandler, EventLevel.URGENT.getValue()) && Reporter.mReportThreadExecutor != null) {
                                Reporter.mReportThreadExecutor.execute(new Runnable() { // from class: com.meituan.android.common.statistics.report.Reporter.2.1
                                    public static ChangeQuickRedirect changeQuickRedirect;

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        Object[] objArr3 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6ad66df0dd3c680c904ab5c8ca683684", 6917529027641081856L)) {
                                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6ad66df0dd3c680c904ab5c8ca683684");
                                        } else {
                                            Reporter.this.urgentReport(EventLevel.URGENT.getValue());
                                        }
                                    }
                                });
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }, 0L, (long) (ConfigManager.getInstance(this.mContext).uploadTimeInterval() * 1000.0d), TimeUnit.MILLISECONDS);
        }
    }

    public void scheduledReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "50999099950078a1f593e4a077199e24", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "50999099950078a1f593e4a077199e24");
            return;
        }
        LogUtil.log("scheduledReport poll duration:" + ((long) (ConfigManager.getInstance(this.mContext).uploadTimeInterval() * 1000.0d)));
        this.mScheduledFuture = this.mUrgentEventExecutor.scheduleAtFixedRate(new Runnable() { // from class: com.meituan.android.common.statistics.report.Reporter.3
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "227858574f4a46a64de10450e420b90f", 6917529027641081856L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "227858574f4a46a64de10450e420b90f");
                    return;
                }
                try {
                    if (ReportStrategyController.checkIfNeedReport(Reporter.this.mContext, Reporter.this.mCacheHandler, EventLevel.URGENT.getValue()) && Reporter.mReportThreadExecutor != null) {
                        Reporter.mReportThreadExecutor.execute(new Runnable() { // from class: com.meituan.android.common.statistics.report.Reporter.3.1
                            public static ChangeQuickRedirect changeQuickRedirect;

                            @Override // java.lang.Runnable
                            public void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = changeQuickRedirect;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "2ae347657692555f21d0dd5424d27083", 6917529027641081856L)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "2ae347657692555f21d0dd5424d27083");
                                } else {
                                    Reporter.this.urgentReport(EventLevel.URGENT.getValue());
                                }
                            }
                        });
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0L, (long) (ConfigManager.getInstance(this.mContext).uploadTimeInterval() * 1000.0d), TimeUnit.MILLISECONDS);
    }

    public void rescheduledReport() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3544630c5503ebc6e898d6f5035cc3a7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3544630c5503ebc6e898d6f5035cc3a7");
            return;
        }
        if (this.mScheduledFuture != null && !this.mScheduledFuture.isCancelled()) {
            this.mScheduledFuture.cancel(true);
        }
        scheduledReport();
    }

    public void immediateReport(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1487a4bb93480f9beba66d01d5fbe0ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1487a4bb93480f9beba66d01d5fbe0ab");
        } else if (ReportStrategyController.checkIfNeedReport(this.mContext, this.mCacheHandler, EventLevel.IMMEDIATE.getValue()) && mReportThreadExecutor != null) {
            mReportThreadExecutor.execute(new Runnable() { // from class: com.meituan.android.common.statistics.report.Reporter.4
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "18190dbc97e68f471974085e45847c19", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "18190dbc97e68f471974085e45847c19");
                    } else {
                        Reporter.this.realReport(i);
                    }
                }
            });
        }
    }

    public void urgentReport(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f65394375a2b655c9d53c944047dc69e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f65394375a2b655c9d53c944047dc69e");
        } else if (this.mUrgentReporting.get() || !this.mUrgentReporting.compareAndSet(false, true) || mReportThreadExecutor == null) {
        } else {
            mReportThreadExecutor.execute(new Runnable() { // from class: com.meituan.android.common.statistics.report.Reporter.5
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "a2e2b8bc5350ab4783315ec859a9c163", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "a2e2b8bc5350ab4783315ec859a9c163");
                        return;
                    }
                    Reporter.this.realReport(i);
                    Reporter.this.mUrgentReporting.set(false);
                }
            });
        }
    }

    @Deprecated
    public void highReport(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d0bfe6765e7b662a4f729ef8270f6e6c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d0bfe6765e7b662a4f729ef8270f6e6c");
        } else if (!this.mHighReporting.get() && this.mHighReporting.compareAndSet(false, true)) {
            mReportThreadExecutor.execute(new Runnable() { // from class: com.meituan.android.common.statistics.report.Reporter.6
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "631681737435e794abaee1e7607694c9", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "631681737435e794abaee1e7607694c9");
                        return;
                    }
                    Reporter.this.realReport(i);
                    Reporter.this.mHighReporting.set(false);
                }
            });
        }
    }

    public void normalReport(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf10dda770efe459fe492577ea053ae7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf10dda770efe459fe492577ea053ae7");
        } else if (!this.mNormalReporting.get() && this.mNormalReporting.compareAndSet(false, true)) {
            mReportThreadExecutor.execute(new Runnable() { // from class: com.meituan.android.common.statistics.report.Reporter.7
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e26b8a66fe08f2f34e33c0b79dd6d198", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e26b8a66fe08f2f34e33c0b79dd6d198");
                        return;
                    }
                    Reporter.this.realReport(i);
                    Reporter.this.mNormalReporting.set(false);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void realReport(int i) {
        boolean z = true;
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5255b836f83224ecd33989ccd24afad5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5255b836f83224ecd33989ccd24afad5");
        } else if (AppUtil.getNetWorkAvailable(this.mContext) && ReportStrategyController.checkIfAllowReport(this.mContext)) {
            StringBuilder sb = new StringBuilder(" level <= ?");
            ArrayList arrayList = new ArrayList();
            arrayList.add(String.valueOf(i));
            if (this.mFailedList != null && this.mFailedList.size() > 0) {
                if (!this.mCacheHandler.removeEventById(this.mFailedList)) {
                    sb.append(" and autokey > ?");
                    arrayList.add(String.valueOf(this.mFailedList.get(this.mFailedList.size() - 1)));
                } else {
                    this.mFailedList.clear();
                }
            }
            try {
                ReportStrategyController.clearJsonPackFailedData(this.mCacheHandler);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            LogUtil.log("this report event num:" + ConfigManager.getInstance(this.mContext).eventNumPerReport());
            List<ICacheHandler.Event> event = this.mCacheHandler.getEvent(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size() - 1]), ConfigManager.getInstance(this.mContext).eventNumPerReport() + 4);
            if (event == null || event.size() == 0) {
                return;
            }
            if (event.size() > ConfigManager.getInstance(this.mContext).eventNumPerReport()) {
                event = event.subList(0, ConfigManager.getInstance(this.mContext).eventNumPerReport());
            } else {
                z = false;
            }
            if (!packageAndReport(event)) {
                LogUtil.log("statistics", "Reporter - realTimeReport is report failed");
            } else {
                ReportStrategyController.CounterIncrease();
            }
            if (z || i < EventLevel.URGENT.getValue()) {
                if (!z) {
                    i = EventLevel.URGENT.getValue();
                }
                scheduleNextReport(i, 50L);
            }
        }
    }

    private void scheduleNextReport(final int i, long j) {
        Object[] objArr = {Integer.valueOf(i), new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fcba497873d30fc022769db962babece", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fcba497873d30fc022769db962babece");
        } else if (!ConfigManager.getInstance(this.mContext).continuePollReportAllowed() || this.mUrgentEventExecutor == null) {
        } else {
            this.mUrgentEventExecutor.schedule(new Runnable() { // from class: com.meituan.android.common.statistics.report.Reporter.8
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // java.lang.Runnable
                public void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bb7a0ca467df3e6d88c6bc9dabbd834d", 6917529027641081856L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bb7a0ca467df3e6d88c6bc9dabbd834d");
                    } else {
                        Reporter.this.urgentReport(i);
                    }
                }
            }, j, TimeUnit.MILLISECONDS);
        }
    }

    private boolean packageAndReport(List<ICacheHandler.Event> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69252d3bac92017e455a4e192823f04a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69252d3bac92017e455a4e192823f04a")).booleanValue();
        }
        String onPack = onPack(list);
        if (!TextUtils.isEmpty(onPack) && reportImpl(onPack)) {
            LogUtil.log("report evs: processName:" + ProcessUtils.getCurrentProcessName(this.mContext));
            if (this.mCacheHandler.removeEvent(list)) {
                return true;
            }
            for (int i = 0; i < list.size(); i++) {
                Long valueOf = Long.valueOf(list.get(i).getId());
                if (!this.mFailedList.contains(valueOf)) {
                    this.mFailedList.add(valueOf);
                }
            }
            CatMonitorManager.getInstance().reportDeleteDbLogFailed(list);
            return false;
        }
        return false;
    }

    private boolean reportImpl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f74be7e7e23ffece0c18e4b1d3a6e4ec", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f74be7e7e23ffece0c18e4b1d3a6e4ec")).booleanValue();
        }
        LogUtil.log("statistics", "events-to-upload: " + str);
        try {
            return NetworkController.report(AppUtil.getReportUrl(this.mContext), str);
        } catch (Exception e) {
            LogUtil.log("statistics", "Reporter - reportImpl: " + e.getMessage());
            return false;
        }
    }

    private String onPack(List<ICacheHandler.Event> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3e58e894bc052cb2571005c5bdfff0cf", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3e58e894bc052cb2571005c5bdfff0cf");
        }
        InnerDataManager.processDataOnReport(this.mContext, list);
        List<ICacheHandler.Event> mergeMVLEvents = mergeMVLEvents(list);
        LinkedList linkedList = new LinkedList();
        for (ICacheHandler.Event event : mergeMVLEvents) {
            List<ICacheHandler.Event> listIfExist = getListIfExist(event, linkedList);
            if (listIfExist == null) {
                listIfExist = new LinkedList<>();
                linkedList.add(listIfExist);
            }
            listIfExist.add(event);
        }
        try {
            JSONArray jSONArray = new JSONArray();
            for (List<ICacheHandler.Event> list2 : linkedList) {
                if (list2.size() != 0) {
                    ICacheHandler.Event event2 = list2.get(0);
                    JSONObject environment = event2.getEnvironment();
                    String optString = environment.optString("uuid", "");
                    String optString2 = environment.optString("dpid", "");
                    preProcessEnv();
                    if (TextUtils.isEmpty(optString)) {
                        String str = this.mEnvironment.getEnvironment().get("uuid");
                        if (!TextUtils.isEmpty(str)) {
                            environment.put("uuid", str);
                        }
                    }
                    if (TextUtils.isEmpty(optString2)) {
                        String str2 = this.mEnvironment.getEnvironment().get("dpid");
                        if (TextUtils.isEmpty(str2)) {
                            str2 = OneIdHandler.getInstance(this.mContext).getLocalDpid(this.mContext);
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            environment.put("dpid", str2);
                        }
                    }
                    environment.put("category", event2.getChannel());
                    String optString3 = environment.optString(Constants.Environment.KEY_UTM, "");
                    if (!TextUtils.isEmpty(optString3)) {
                        environment.put(Constants.Environment.KEY_UTM, new JSONObject(optString3));
                    }
                    JSONArray jSONArray2 = new JSONArray();
                    for (ICacheHandler.Event event3 : list2) {
                        JSONObject evs = event3.getEvs();
                        if (!evs.has("seq")) {
                            evs.put("seq", event3.getId());
                        }
                        jSONArray2.put(evs);
                    }
                    environment.put(Constants.Reporter.KEY_PACKAGE_TM, String.valueOf(System.currentTimeMillis()));
                    ABCHelper.process(environment);
                    ABCHelper.processLatLng(jSONArray2);
                    if (ConfigManager.getInstance(this.mContext).isEncReport()) {
                        environment.put(Constants.Environment.KEY_LX_DICT, "true");
                        environment.put("evs", ABCHelper.enc(jSONArray2.toString()));
                    } else {
                        environment.put(Constants.Environment.KEY_LX_DICT, "false");
                        environment.put("evs", jSONArray2);
                    }
                    jSONArray.put(environment);
                }
            }
            return jSONArray.length() > 0 ? jSONArray.toString() : "";
        } catch (Throwable th) {
            CatMonitorManager.getInstance().reportJsonPackFailed();
            ReportStrategyController.handleJsonPackFailed(list, this.mCacheHandler);
            LogUtil.log("statistics", "Reporter - onPack: " + th.getMessage());
            return "";
        }
    }

    private void preProcessEnv() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "45f8eed598dfb230af6e38023ab42499", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "45f8eed598dfb230af6e38023ab42499");
            return;
        }
        try {
            Map<String, String> environment = this.mEnvironment.getEnvironment();
            if (environment != null) {
                if (TextUtils.isEmpty(environment.get("mac"))) {
                    environment.put("mac", NetworkUtils.mac(this.mContext));
                }
                if (TextUtils.isEmpty(environment.get("did"))) {
                    environment.put("did", AppUtil.getDeviceId(this.mContext));
                }
                if (TextUtils.isEmpty(environment.get("imei"))) {
                    environment.put("imei", AppUtil.getIMEI(this.mContext));
                }
                if (TextUtils.isEmpty(environment.get("imei2"))) {
                    environment.put("imei2", AppUtil.getIMEI2(this.mContext));
                }
                if (TextUtils.isEmpty(environment.get(Constants.Environment.KEY_IMSI))) {
                    environment.put(Constants.Environment.KEY_IMSI, AppUtil.getIMSI(this.mContext));
                }
                if (TextUtils.isEmpty(environment.get("meid"))) {
                    environment.put("meid", AppUtil.getMEID(this.mContext));
                }
                if (TextUtils.isEmpty(environment.get(Constants.Environment.KEY_ICCID))) {
                    environment.put(Constants.Environment.KEY_ICCID, AppUtil.getICCID(this.mContext));
                }
                if (TextUtils.isEmpty(environment.get(Constants.Environment.KEY_SERIAL_NUMBER))) {
                    environment.put(Constants.Environment.KEY_SERIAL_NUMBER, com.meituan.android.common.unionid.oneid.util.AppUtil.getSerial(this.mContext));
                }
                if (TextUtils.isEmpty(environment.get(Constants.Environment.KEY_MNO))) {
                    environment.put(Constants.Environment.KEY_MNO, com.meituan.android.common.unionid.oneid.util.AppUtil.getMNO(this.mContext));
                }
            }
        } catch (Exception unused) {
        }
    }

    private List<ICacheHandler.Event> getListIfExist(ICacheHandler.Event event, List<List<ICacheHandler.Event>> list) {
        Object[] objArr = {event, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4feb0d7591cd7ed9801746683c547be5", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4feb0d7591cd7ed9801746683c547be5");
        }
        for (List<ICacheHandler.Event> list2 : list) {
            if (list2.size() != 0 && list2.get(0).compareTo(event)) {
                return list2;
            }
        }
        return null;
    }

    private List<ICacheHandler.Event> mergeMVLEvents(List<ICacheHandler.Event> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91a362aa2a138dca9bfe01fbcba67b54", 6917529027641081856L)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91a362aa2a138dca9bfe01fbcba67b54");
        }
        if (list == null || list.size() <= 0) {
            return list;
        }
        LinkedList linkedList = new LinkedList();
        HashMap<String, MVLEventHashEntry> hashMap = new HashMap<>();
        HashMap<String, JSONArray> hashMap2 = new HashMap<>();
        HashMap<String, JSONArray> hashMap3 = new HashMap<>();
        for (ICacheHandler.Event event : list) {
            if (event != null) {
                try {
                    JSONObject evs = event.getEvs();
                    if (evs != null && EventName.MODEL_VIEW_LIST.equals(evs.getString("nm")) && evs.optInt("nt") != 8) {
                        String generateHashKey = generateHashKey(event, evs);
                        MVLEventHashEntry mVLEventHashEntry = hashMap.get(generateHashKey);
                        if (mVLEventHashEntry == null || mVLEventHashEntry.tm > evs.getLong("tm")) {
                            if (mVLEventHashEntry == null) {
                                mVLEventHashEntry = new MVLEventHashEntry();
                                hashMap.put(generateHashKey, mVLEventHashEntry);
                            }
                            mVLEventHashEntry.update(evs.getLong("tm"), evs, event);
                        }
                        JSONArray jSONArray = hashMap2.get(generateHashKey);
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                            hashMap2.put(generateHashKey, jSONArray);
                        }
                        JSONObject optJSONObject = evs.optJSONObject("val_lab");
                        if (optJSONObject == null) {
                            optJSONObject = new JSONObject();
                        }
                        try {
                            optJSONObject.put("_tm", evs.get("tm"));
                            optJSONObject.put("_seq", evs.get("seq"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        jSONArray.put(optJSONObject);
                        JSONArray jSONArray2 = hashMap3.get(generateHashKey);
                        if (jSONArray2 == null) {
                            jSONArray2 = new JSONArray();
                            hashMap3.put(generateHashKey, jSONArray2);
                        }
                        JSONObject optJSONObject2 = evs.optJSONObject(Constants.EventInfoConsts.KEY_LX_INNER_DATA);
                        if (optJSONObject2 != null) {
                            jSONArray2.put(optJSONObject2);
                        }
                    } else {
                        linkedList.add(event);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    LogUtil.log("statistics", "Reporter - mergeMVLEvents: " + th.getMessage());
                }
            }
        }
        linkedList.addAll(packMVLEvent(hashMap, hashMap2, hashMap3));
        return linkedList;
    }

    private String generateHashKey(ICacheHandler.Event event, JSONObject jSONObject) throws JSONException {
        Object[] objArr = {event, jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7116c894498a4b2f76ebf7f755ae4da7", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7116c894498a4b2f76ebf7f755ae4da7");
        }
        return event.getChannel() + CommonConstant.Symbol.MINUS + jSONObject.getString(Constants.EventInfoConsts.KEY_REQ_ID) + CommonConstant.Symbol.MINUS + jSONObject.getString("val_bid");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:12:0x0053, B:14:0x0059, B:19:0x0073, B:21:0x0079, B:23:0x0084, B:24:0x008c, B:26:0x00a2, B:27:0x00a9), top: B:31:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2 A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:12:0x0053, B:14:0x0059, B:19:0x0073, B:21:0x0079, B:23:0x0084, B:24:0x008c, B:26:0x00a2, B:27:0x00a9), top: B:31:0x0053 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.List<com.meituan.android.common.statistics.cache.ICacheHandler.Event> packMVLEvent(java.util.HashMap<java.lang.String, com.meituan.android.common.statistics.report.Reporter.MVLEventHashEntry> r13, java.util.HashMap<java.lang.String, org.json.JSONArray> r14, java.util.HashMap<java.lang.String, org.json.JSONArray> r15) {
        /*
            r12 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r13
            r9 = 1
            r0[r9] = r14
            r1 = 2
            r0[r1] = r15
            com.meituan.robust.ChangeQuickRedirect r10 = com.meituan.android.common.statistics.report.Reporter.changeQuickRedirect
            java.lang.String r11 = "36c3f139e2ca29153ce0409d4f7a9414"
            r4 = 0
            r6 = 6917529027641081856(0x6000000000000000, double:2.6815615859885194E154)
            r1 = r0
            r2 = r12
            r3 = r10
            r5 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L24
            java.lang.Object r13 = com.meituan.robust.PatchProxy.accessDispatch(r0, r12, r10, r8, r11)
            java.util.List r13 = (java.util.List) r13
            return r13
        L24:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r13.get(r2)
            com.meituan.android.common.statistics.report.Reporter$MVLEventHashEntry r3 = (com.meituan.android.common.statistics.report.Reporter.MVLEventHashEntry) r3
            java.lang.Object r4 = r14.get(r2)
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            java.lang.Object r2 = r15.get(r2)
            org.json.JSONArray r2 = (org.json.JSONArray) r2
            if (r3 == 0) goto L31
            if (r4 == 0) goto L70
            int r5 = r4.length()     // Catch: java.lang.Exception -> L6e
            if (r5 <= 0) goto L70
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6e
            r5.<init>()     // Catch: java.lang.Exception -> L6e
            java.lang.String r6 = "mv_list"
            r5.put(r6, r4)     // Catch: java.lang.Exception -> L6e
            org.json.JSONObject r4 = r3.mvlEvsJson     // Catch: java.lang.Exception -> L6e
            java.lang.String r6 = "val_lab"
            r4.put(r6, r5)     // Catch: java.lang.Exception -> L6e
            r4 = 1
            goto L71
        L6e:
            r2 = move-exception
            goto Laf
        L70:
            r4 = 0
        L71:
            if (r2 == 0) goto La0
            int r5 = r2.length()     // Catch: java.lang.Exception -> L6e
            if (r5 <= 0) goto La0
            org.json.JSONObject r4 = r3.mvlEvsJson     // Catch: java.lang.Exception -> L6e
            java.lang.String r5 = "lx_inner_data"
            org.json.JSONObject r4 = r4.optJSONObject(r5)     // Catch: java.lang.Exception -> L6e
            if (r4 == 0) goto L8c
            org.json.JSONObject r4 = r3.mvlEvsJson     // Catch: java.lang.Exception -> L6e
            java.lang.String r5 = "lx_inner_data"
            r4.remove(r5)     // Catch: java.lang.Exception -> L6e
        L8c:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L6e
            r4.<init>()     // Catch: java.lang.Exception -> L6e
            java.lang.String r5 = "list"
            r4.put(r5, r2)     // Catch: java.lang.Exception -> L6e
            org.json.JSONObject r2 = r3.mvlEvsJson     // Catch: java.lang.Exception -> L6e
            java.lang.String r5 = "lx_inner_data"
            r2.put(r5, r4)     // Catch: java.lang.Exception -> L6e
            r4 = 1
        La0:
            if (r4 == 0) goto La9
            com.meituan.android.common.statistics.cache.ICacheHandler$Event r2 = r3.mvlEvent     // Catch: java.lang.Exception -> L6e
            org.json.JSONObject r4 = r3.mvlEvsJson     // Catch: java.lang.Exception -> L6e
            r2.setEvs(r4)     // Catch: java.lang.Exception -> L6e
        La9:
            com.meituan.android.common.statistics.cache.ICacheHandler$Event r2 = r3.mvlEvent     // Catch: java.lang.Exception -> L6e
            r0.add(r2)     // Catch: java.lang.Exception -> L6e
            goto L31
        Laf:
            r2.printStackTrace()
            goto L31
        Lb4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.common.statistics.report.Reporter.packMVLEvent(java.util.HashMap, java.util.HashMap, java.util.HashMap):java.util.List");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class MVLEventHashEntry {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ICacheHandler.Event mvlEvent;
        public JSONObject mvlEvsJson;
        public long tm;

        public MVLEventHashEntry() {
            Object[] objArr = {Reporter.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d5350681b7dc7b3bee6e4832fcb6f33b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d5350681b7dc7b3bee6e4832fcb6f33b");
            }
        }

        public void update(long j, JSONObject jSONObject, ICacheHandler.Event event) {
            Object[] objArr = {new Long(j), jSONObject, event};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bc39a3b1187815f33b13b3a741af12c0", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bc39a3b1187815f33b13b3a741af12c0");
                return;
            }
            this.tm = j;
            this.mvlEvsJson = jSONObject;
            this.mvlEvent = event;
        }
    }
}

package com.meituan.metrics.traffic.trace;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.android.common.metricx.config.MetricXConfigBean;
import com.meituan.android.common.metricx.config.MetricXConfigManager;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback;
import com.meituan.metrics.lifecycle.MetricsActivityLifecycleManager;
import com.meituan.metrics.traffic.MetricsTrafficManager;
import com.meituan.metrics.traffic.TrafficDispatcher;
import com.meituan.metrics.traffic.TrafficSysManager;
import com.meituan.metrics.traffic.TrafficTrace;
import com.meituan.metrics.traffic.TrafficTraceUtil;
import com.meituan.metrics.traffic.trace.TraceSQLHelper;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class PageTrafficTrace extends TrafficTrace implements MetricXConfigManager.ConfigChangedListener, MetricsActivityLifecycleCallback {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Gson gson = new GsonBuilder().disableHtmlEscaping().create();
    private int countLimit;
    private String currentActivityName;
    private Intent currentIntent;
    private final TraceSQLHelper.CustomMsgHandler customMsgHandler;
    private volatile BasicTrafficUnit increaseTraffic;
    private int intentLengthLimit;
    private ConcurrentHashMap<String, TrafficUnit> pageCache;
    private CopyOnWriteArrayList<String> whiteListActivity;

    @Override // com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback
    public void onActivityCreated(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "af132813ef16950bfc282212c6943d59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "af132813ef16950bfc282212c6943d59");
        }
    }

    @Override // com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback
    public void onActivityPaused(Activity activity) {
    }

    @Override // com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback
    public void onActivityResumed(Activity activity) {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class TrafficUnit {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long downTotal;
        public long mobileTotal;
        public String pageIntent;
        public long total;
        public long upTotal;
        public long wifiTotal;

        public TrafficUnit() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f81a8e79f3e380d5dfc5e34268f5828", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f81a8e79f3e380d5dfc5e34268f5828");
            } else {
                this.pageIntent = "";
            }
        }

        public void addTraffic(long j, long j2, long j3, long j4, long j5) {
            Object[] objArr = {new Long(j), new Long(j2), new Long(j3), new Long(j4), new Long(j5)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e55ae2f67bc743030b6d21ba182b90e9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e55ae2f67bc743030b6d21ba182b90e9");
                return;
            }
            this.total += j;
            this.upTotal += j2;
            this.downTotal += j3;
            this.wifiTotal += j4;
            this.mobileTotal += j5;
        }

        public void setIntent(String str) {
            this.pageIntent = str;
        }
    }

    public PageTrafficTrace() {
        super(Constants.TRACE_PAGE);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38bdd12bb8b43b4985148e602e76a3a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38bdd12bb8b43b4985148e602e76a3a0");
            return;
        }
        this.pageCache = new ConcurrentHashMap<>();
        this.whiteListActivity = new CopyOnWriteArrayList<>();
        this.countLimit = 300;
        this.intentLengthLimit = 2048;
        this.increaseTraffic = new BasicTrafficUnit();
        this.currentActivityName = "";
        this.currentIntent = null;
        this.customMsgHandler = new TraceSQLHelper.CustomMsgHandler() { // from class: com.meituan.metrics.traffic.trace.PageTrafficTrace.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.metrics.traffic.trace.TraceSQLHelper.CustomMsgHandler
            public String updateCustomMsg(String str, String str2) {
                return str2;
            }
        };
        MetricXConfigManager.getInstance().register(this);
    }

    @Override // com.meituan.metrics.Trace
    public void setEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4524e429f5cbd34fa3c7f1b13529e374", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4524e429f5cbd34fa3c7f1b13529e374");
            return;
        }
        super.setEnable(z);
        if (z) {
            this.increaseTraffic = TrafficSysManager.getInstance().triggerUpdateTraffic();
            MetricsActivityLifecycleManager.getInstance().register(this);
            return;
        }
        MetricsActivityLifecycleManager.getInstance().unRegister(this);
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public void saveTraceToStorage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c62395b481e0dbada2e2377daa6d4e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c62395b481e0dbada2e2377daa6d4e5a");
        } else if (isEnable()) {
            LinkedList linkedList = new LinkedList();
            String currentSysDate = TimeUtil.currentSysDate();
            for (Map.Entry<String, TrafficUnit> entry : this.pageCache.entrySet()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("type", getName());
                contentValues.put("date", currentSysDate);
                contentValues.put(TraceSQLHelper.KEY_TRAFFIC_KEY, entry.getKey());
                contentValues.put("value", Long.valueOf(entry.getValue().total));
                contentValues.put(TraceSQLHelper.KEY_UP, Long.valueOf(entry.getValue().upTotal));
                contentValues.put(TraceSQLHelper.KEY_DOWN, Long.valueOf(entry.getValue().downTotal));
                contentValues.put("wifi", Long.valueOf(entry.getValue().wifiTotal));
                contentValues.put("mobile", Long.valueOf(entry.getValue().mobileTotal));
                contentValues.put(TraceSQLHelper.KEY_CUSTOM_MSG, entry.getValue().pageIntent);
                linkedList.add(contentValues);
            }
            TraceSQLHelper.getInstance().updateDetails(linkedList, new String[]{"value", TraceSQLHelper.KEY_UP, TraceSQLHelper.KEY_DOWN, "wifi", "mobile", TraceSQLHelper.KEY_CUSTOM_MSG}, new String[]{"type", "date", TraceSQLHelper.KEY_TRAFFIC_KEY}, true, true, this.customMsgHandler);
            this.pageCache.clear();
        }
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public Object fetchTraceForReport(String str, TrafficDispatcher trafficDispatcher) {
        Object[] objArr = {str, trafficDispatcher};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad76f6509bcbe98e59e911838e72ebc3", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad76f6509bcbe98e59e911838e72ebc3");
        }
        LinkedList<ContentValues> executeQuery = executeQuery(str);
        JSONArray jSONArray = new JSONArray();
        Iterator<ContentValues> it = executeQuery.iterator();
        while (it.hasNext()) {
            ContentValues next = it.next();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("page", next.getAsString(TraceSQLHelper.KEY_TRAFFIC_KEY));
                jSONObject.put("intent", next.getAsString(TraceSQLHelper.KEY_CUSTOM_MSG));
                jSONObject.put("total", next.getAsString("value"));
                jSONObject.put(Constants.TRAFFIC_UP, next.getAsString(TraceSQLHelper.KEY_UP));
                jSONObject.put(Constants.TRAFFIC_DOWN, next.getAsString(TraceSQLHelper.KEY_DOWN));
                jSONObject.put(Constants.TRAFFIC_WIFI, next.getAsString("wifi"));
                jSONObject.put(Constants.TRAFFIC_MOBILE, next.getAsString("mobile"));
                jSONArray.put(jSONObject);
            } catch (Throwable th) {
                Logger.getMetricxLogger().e(th.getLocalizedMessage());
            }
        }
        if (executeQuery.size() > 0 && this.whiteListActivity.contains(executeQuery.get(0).getAsString(TraceSQLHelper.KEY_TRAFFIC_KEY))) {
            TrafficTraceUtil.markTraceType(Constants.TRACE_TYPE_P2, str);
        }
        return jSONArray;
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public void clearTraceStorage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "21bb4bbe5bdd0c6739d5b1e656922187", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "21bb4bbe5bdd0c6739d5b1e656922187");
        } else {
            TraceSQLHelper.getInstance().deleteAll(getName(), str);
        }
    }

    private void deleteMinPage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf075aa101664c272b1709882cb94e80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf075aa101664c272b1709882cb94e80");
            return;
        }
        String str = "";
        long j = Long.MAX_VALUE;
        for (Map.Entry<String, TrafficUnit> entry : this.pageCache.entrySet()) {
            if (entry.getValue().total < j) {
                str = entry.getKey();
                j = entry.getValue().total;
            }
        }
        this.pageCache.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePageCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1044304323deab315b11dc50bc3862c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1044304323deab315b11dc50bc3862c4");
            return;
        }
        String str = this.currentActivityName;
        Intent intent = this.currentIntent;
        BasicTrafficUnit triggerUpdateTraffic = TrafficSysManager.getInstance().triggerUpdateTraffic();
        if (triggerUpdateTraffic.total > this.increaseTraffic.total) {
            long j = triggerUpdateTraffic.total - this.increaseTraffic.total;
            long j2 = triggerUpdateTraffic.txBytes - this.increaseTraffic.txBytes;
            long j3 = triggerUpdateTraffic.rxBytes - this.increaseTraffic.rxBytes;
            long j4 = triggerUpdateTraffic.wifiBytes - this.increaseTraffic.wifiBytes;
            long j5 = triggerUpdateTraffic.mobileBytes - this.increaseTraffic.mobileBytes;
            String parseIntent = parseIntent(intent);
            if (this.pageCache.containsKey(str)) {
                TrafficUnit trafficUnit = this.pageCache.get(str);
                trafficUnit.addTraffic(j, j2, j3, j4, j5);
                trafficUnit.setIntent(parseIntent);
            } else {
                TrafficUnit trafficUnit2 = new TrafficUnit();
                trafficUnit2.addTraffic(j, j2, j3, j4, j5);
                trafficUnit2.setIntent(parseIntent);
                this.pageCache.put(str, trafficUnit2);
                if (this.pageCache.size() >= this.countLimit) {
                    deleteMinPage();
                }
            }
            this.increaseTraffic.copyValueFrom(triggerUpdateTraffic);
        }
    }

    private LinkedList<ContentValues> executeQuery(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "62ceb601c29ca26c025b08a82d4162b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinkedList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "62ceb601c29ca26c025b08a82d4162b3");
        }
        Pair<String, LinkedList<ContentValues>> queryAll = TraceSQLHelper.getInstance().queryAll(new String[]{TraceSQLHelper.KEY_TRAFFIC_KEY, "value", TraceSQLHelper.KEY_CUSTOM_MSG, TraceSQLHelper.KEY_UP, TraceSQLHelper.KEY_DOWN, "wifi", "mobile"}, "type=? and date=?", new String[]{getName(), str}, new StringBuilder("value desc").toString(), String.valueOf(this.countLimit));
        if (TextUtils.isEmpty((CharSequence) queryAll.first)) {
            return (LinkedList) queryAll.second;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(TraceSQLHelper.KEY_TRAFFIC_KEY, "query database fail");
        contentValues.put(TraceSQLHelper.KEY_CUSTOM_MSG, (String) queryAll.first);
        contentValues.put("value", (Integer) (-1));
        contentValues.put(TraceSQLHelper.KEY_UP, (Integer) (-1));
        contentValues.put(TraceSQLHelper.KEY_DOWN, (Integer) (-1));
        contentValues.put("wifi", (Integer) (-1));
        contentValues.put("mobile", (Integer) (-1));
        LinkedList<ContentValues> linkedList = new LinkedList<>();
        linkedList.add(contentValues);
        return linkedList;
    }

    private String parseIntent(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4b0d1ad2181e54e3f757f0f5749547b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4b0d1ad2181e54e3f757f0f5749547b");
        }
        if (intent == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String str = "";
        try {
            str = intent.getData().toString();
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append("{data=");
            sb.append(str);
        }
        sb.length();
        StringBuilder sb2 = new StringBuilder();
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                for (String str2 : extras.keySet()) {
                    sb2.append(str2);
                    sb2.append(CommonConstant.Symbol.COLON);
                    sb2.append(extras.get(str2));
                    sb2.append(CommonConstant.Symbol.COMMA);
                }
            }
        } catch (Throwable unused2) {
        }
        String sb3 = sb2.toString();
        if (!TextUtils.isEmpty(sb3)) {
            sb.append("(extras=");
            sb.append(sb3);
            sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(intent.getFlags()));
            sb.append(CommonConstant.Symbol.BIG_BRACKET_RIGHT);
        }
        String sb4 = sb.toString();
        return sb4.length() > this.intentLengthLimit ? sb4.substring(0, this.intentLengthLimit) : sb4;
    }

    @Override // com.meituan.android.common.metricx.config.MetricXConfigManager.ConfigChangedListener
    public void onConfigChanged(@NonNull MetricXConfigBean metricXConfigBean) {
        Object[] objArr = {metricXConfigBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cf4e1888ae8b20bdc22aaf8da8f134da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cf4e1888ae8b20bdc22aaf8da8f134da");
            return;
        }
        this.countLimit = metricXConfigBean.trace_page_count_limit;
        this.whiteListActivity = metricXConfigBean.trace_whitelist_activity;
        this.intentLengthLimit = metricXConfigBean.trace_page_intent_length_limit;
    }

    @Override // com.meituan.metrics.lifecycle.MetricsActivityLifecycleCallback
    public void onActivityStopped(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d75c31feef0197240da718752bf43396", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d75c31feef0197240da718752bf43396");
            return;
        }
        this.currentActivityName = activity.getClass().getName();
        this.currentIntent = activity.getIntent();
        MetricsTrafficManager.TrafficHandler.post(new Runnable() { // from class: com.meituan.metrics.traffic.trace.PageTrafficTrace.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // java.lang.Runnable
            public void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3cdb67fe49a5d9600b730be678084730", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3cdb67fe49a5d9600b730be678084730");
                } else {
                    PageTrafficTrace.this.updatePageCache();
                }
            }
        }, "updatePageCache");
    }
}

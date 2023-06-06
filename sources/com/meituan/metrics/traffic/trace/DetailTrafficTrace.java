package com.meituan.metrics.traffic.trace;

import android.content.ContentValues;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.metricx.config.MetricXConfigBean;
import com.meituan.android.common.metricx.config.MetricXConfigManager;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.TrafficDispatcher;
import com.meituan.metrics.traffic.TrafficListenerProxy;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.TrafficTrace;
import com.meituan.metrics.traffic.trace.TraceSQLHelper;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class DetailTrafficTrace extends TrafficTrace implements MetricXConfigManager.ConfigChangedListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private long byteLimit;
    private int countLimit;
    private final TraceSQLHelper.CustomMsgHandler customMsgHandler;
    private final String dbPriKeyName;
    public HashMap<String, DetailUnit> detailMap;
    private final Gson gson;

    public DetailTrafficTrace(String str, String str2) {
        super(str);
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46c268799df42fe4dd143bdcf81b494e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46c268799df42fe4dd143bdcf81b494e");
            return;
        }
        this.detailMap = new HashMap<>();
        this.byteLimit = 1048576L;
        this.countLimit = 200;
        this.gson = new Gson();
        this.customMsgHandler = new TraceSQLHelper.CustomMsgHandler() { // from class: com.meituan.metrics.traffic.trace.DetailTrafficTrace.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.meituan.metrics.traffic.trace.TraceSQLHelper.CustomMsgHandler
            public String updateCustomMsg(String str3, String str4) {
                Object[] objArr2 = {str3, str4};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "098e7c3a213e863c1890f19d0c175f4e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "098e7c3a213e863c1890f19d0c175f4e");
                }
                HashMap convertStringToReferer = DetailTrafficTrace.this.convertStringToReferer(str3);
                HashMap convertStringToReferer2 = DetailTrafficTrace.this.convertStringToReferer(str4);
                if (convertStringToReferer == null || convertStringToReferer.size() == 0) {
                    return str4;
                }
                if (convertStringToReferer2 == null || convertStringToReferer2.size() == 0) {
                    return str3;
                }
                for (Map.Entry entry : convertStringToReferer.entrySet()) {
                    String str5 = (String) entry.getKey();
                    if (convertStringToReferer2.containsKey(str5)) {
                        convertStringToReferer2.put(str5, Long.valueOf(((Long) entry.getValue()).longValue() + ((Long) convertStringToReferer2.get(str5)).longValue()));
                    }
                }
                try {
                    return DetailTrafficTrace.this.gson.toJson(convertStringToReferer2);
                } catch (Throwable unused) {
                    return "";
                }
            }
        };
        this.dbPriKeyName = str2;
        MetricXConfigManager.getInstance().register(this);
    }

    @Override // com.meituan.metrics.Trace
    public void setEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7bc9a309ae92df1eef4a0a07d36c63aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7bc9a309ae92df1eef4a0a07d36c63aa");
            return;
        }
        super.setEnable(z);
        if (z) {
            TrafficListenerProxy.getInstance().register(this);
        } else {
            TrafficListenerProxy.getInstance().unregister(this);
        }
    }

    @Override // com.meituan.metrics.Trace
    public boolean isEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0124803b7c1b5e038a2b1800462aa875", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0124803b7c1b5e038a2b1800462aa875")).booleanValue() : super.isEnable();
    }

    public void updateNewTraffic(String str, TrafficRecord trafficRecord) {
        DetailUnit detailUnit;
        Object[] objArr = {str, trafficRecord};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9c46e712af213329b264b42a4fe07c7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9c46e712af213329b264b42a4fe07c7d");
        } else if (isEnable()) {
            boolean isWifiConnected = NetWorkUtils.isWifiConnected(Metrics.getInstance().getContext());
            if (this.detailMap.containsKey(str)) {
                DetailUnit detailUnit2 = this.detailMap.get(str);
                if (detailUnit2 instanceof MTWebviewDetailUnit) {
                    ((MTWebviewDetailUnit) detailUnit2).updateNewTraffic(trafficRecord.rxBytes, trafficRecord.txBytes, isWifiConnected, trafficRecord.getMTWebviewReferer());
                    return;
                } else {
                    detailUnit2.updateNewTraffic(trafficRecord.rxBytes, trafficRecord.txBytes, isWifiConnected);
                    return;
                }
            }
            if (trafficRecord.getDetail() == null || trafficRecord.getDetail().networkTunnel != TrafficRecord.Detail.TUNNEL_MTWEBVIEW) {
                detailUnit = new DetailUnit(trafficRecord.rxBytes, trafficRecord.txBytes, isWifiConnected);
            } else {
                detailUnit = new MTWebviewDetailUnit(trafficRecord.rxBytes, trafficRecord.txBytes, isWifiConnected, trafficRecord.getMTWebviewReferer());
            }
            this.detailMap.put(str, detailUnit);
        }
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public void saveTraceToStorage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e7cde45e32e5f0ac72cf8cbb6316e735", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e7cde45e32e5f0ac72cf8cbb6316e735");
        } else if (isEnable() && this.detailMap.size() != 0) {
            LinkedList linkedList = new LinkedList();
            String currentSysDate = TimeUtil.currentSysDate();
            boolean z = false;
            for (Map.Entry<String, DetailUnit> entry : this.detailMap.entrySet()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("type", getName());
                contentValues.put("date", currentSysDate);
                contentValues.put(TraceSQLHelper.KEY_TRAFFIC_KEY, entry.getKey());
                contentValues.put("value", Long.valueOf(entry.getValue().total));
                contentValues.put(TraceSQLHelper.KEY_UP, Long.valueOf(entry.getValue().upTotal));
                contentValues.put(TraceSQLHelper.KEY_DOWN, Long.valueOf(entry.getValue().downTotal));
                contentValues.put("wifi", Long.valueOf(entry.getValue().wifiTotal));
                contentValues.put("mobile", Long.valueOf(entry.getValue().mobileTotal));
                contentValues.put("count", Integer.valueOf(entry.getValue().count));
                if (entry.getValue() instanceof MTWebviewDetailUnit) {
                    addMTWebviewRefererToCV(contentValues, (MTWebviewDetailUnit) entry.getValue());
                    if (!z) {
                        z = true;
                    }
                }
                linkedList.add(contentValues);
            }
            TraceSQLHelper.getInstance().updateDetails(linkedList, new String[]{"value", TraceSQLHelper.KEY_UP, TraceSQLHelper.KEY_DOWN, "wifi", "mobile", "count", TraceSQLHelper.KEY_CUSTOM_MSG}, new String[]{"type", "date", TraceSQLHelper.KEY_TRAFFIC_KEY}, true, z, this.customMsgHandler);
            this.detailMap.clear();
        }
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public Object fetchTraceForReport(String str, TrafficDispatcher trafficDispatcher) {
        Object[] objArr = {str, trafficDispatcher};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d66db2de486e8b7c750ddbc597dc0fe3", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d66db2de486e8b7c750ddbc597dc0fe3");
        }
        String[] strArr = {TraceSQLHelper.KEY_TRAFFIC_KEY, "value", TraceSQLHelper.KEY_UP, TraceSQLHelper.KEY_DOWN, "wifi", "mobile", "count", TraceSQLHelper.KEY_CUSTOM_MSG};
        Pair<String, LinkedList<ContentValues>> queryAll = TraceSQLHelper.getInstance().queryAll(strArr, "type=? and date=? and value>=?", new String[]{getName(), str, String.valueOf(this.byteLimit)}, new StringBuilder("value desc").toString(), String.valueOf(this.countLimit));
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty((CharSequence) queryAll.first)) {
            Iterator it = ((LinkedList) queryAll.second).iterator();
            while (it.hasNext()) {
                ContentValues contentValues = (ContentValues) it.next();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(this.dbPriKeyName, contentValues.getAsString(TraceSQLHelper.KEY_TRAFFIC_KEY));
                    jSONObject.put("total", contentValues.getAsLong("value"));
                    jSONObject.put(Constants.TRAFFIC_UP, contentValues.getAsLong(TraceSQLHelper.KEY_UP));
                    jSONObject.put(Constants.TRAFFIC_DOWN, contentValues.getAsLong(TraceSQLHelper.KEY_DOWN));
                    jSONObject.put(Constants.TRAFFIC_WIFI, contentValues.getAsLong("wifi"));
                    jSONObject.put(Constants.TRAFFIC_MOBILE, contentValues.getAsLong("mobile"));
                    jSONObject.put("count", contentValues.getAsString("count"));
                    String asString = contentValues.getAsString(TraceSQLHelper.KEY_CUSTOM_MSG);
                    if (!TextUtils.isEmpty(asString)) {
                        jSONObject.put(Constants.TRAFFIC_REFERER, asString);
                    }
                    jSONArray.put(jSONObject);
                } catch (Throwable th) {
                    Logger.getMetricxLogger().e(th.getLocalizedMessage());
                }
            }
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(this.dbPriKeyName, queryAll.first);
                jSONObject2.put("total", -1);
                jSONObject2.put(Constants.TRAFFIC_UP, -1);
                jSONObject2.put(Constants.TRAFFIC_DOWN, -1);
                jSONObject2.put(Constants.TRAFFIC_WIFI, -1);
                jSONObject2.put(Constants.TRAFFIC_MOBILE, -1);
                jSONObject2.put("count", -1);
                jSONArray.put(jSONObject2);
            } catch (Throwable th2) {
                Logger.getMetricxLogger().e(th2.getLocalizedMessage());
            }
        }
        return jSONArray;
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public void clearTraceStorage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd88360cfd7e7e7dc65c3acf9970dcdb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd88360cfd7e7e7dc65c3acf9970dcdb");
        } else {
            TraceSQLHelper.getInstance().deleteAll(getName(), str);
        }
    }

    @Override // com.meituan.android.common.metricx.config.MetricXConfigManager.ConfigChangedListener
    public void onConfigChanged(@NonNull MetricXConfigBean metricXConfigBean) {
        Object[] objArr = {metricXConfigBean};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b9cfc51307446bb15db9eb29b5cfc73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b9cfc51307446bb15db9eb29b5cfc73");
            return;
        }
        this.byteLimit = metricXConfigBean.trace_detail_byte_limit;
        this.countLimit = metricXConfigBean.trace_detail_count_limit;
    }

    private void addMTWebviewRefererToCV(ContentValues contentValues, MTWebviewDetailUnit mTWebviewDetailUnit) {
        String str;
        Object[] objArr = {contentValues, mTWebviewDetailUnit};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df26c470296ca64a96766b98ac709326", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df26c470296ca64a96766b98ac709326");
            return;
        }
        try {
            str = this.gson.toJson(mTWebviewDetailUnit.mtWebviewRefererMap);
        } catch (Throwable unused) {
            str = "";
        }
        contentValues.put(TraceSQLHelper.KEY_CUSTOM_MSG, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public HashMap<String, Long> convertStringToReferer(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e88f78bb3df2ec3fe4fddfb76018f538", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e88f78bb3df2ec3fe4fddfb76018f538");
        }
        try {
            return (HashMap) this.gson.fromJson(str, new TypeToken<HashMap<String, Long>>() { // from class: com.meituan.metrics.traffic.trace.DetailTrafficTrace.2
                public static ChangeQuickRedirect changeQuickRedirect;
            }.getType());
        } catch (Throwable unused) {
            return null;
        }
    }
}

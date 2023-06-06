package com.meituan.metrics.traffic.trace;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.Pair;
import com.meituan.android.common.kitefly.CatchException;
import com.meituan.android.common.metricx.helpers.AppBus;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.common.Constants;
import com.meituan.metrics.traffic.TrafficDispatcher;
import com.meituan.metrics.traffic.TrafficListenerProxy;
import com.meituan.metrics.traffic.TrafficRecord;
import com.meituan.metrics.traffic.TrafficTrace;
import com.meituan.metrics.util.BasicTrafficUnit;
import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NetWorkUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SummaryTrafficTrace extends TrafficTrace {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final CatchException exception;
    private BasicTrafficUnit unit;

    public SummaryTrafficTrace(String str) {
        super(str);
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "da9a6218ceb7fa6dea329faf451846ec", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "da9a6218ceb7fa6dea329faf451846ec");
            return;
        }
        this.unit = new BasicTrafficUnit();
        this.exception = new CatchException(str, 1, 300000L);
    }

    @Override // com.meituan.metrics.Trace
    public void setEnable(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cfc67c9ba4a39b9f83ad05183bead318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cfc67c9ba4a39b9f83ad05183bead318");
            return;
        }
        super.setEnable(z);
        if (z) {
            TrafficListenerProxy.getInstance().register(this);
        } else {
            TrafficListenerProxy.getInstance().unregister(this);
        }
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public void saveTraceToStorage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5fb1ae765a893c17bd34c182599dcd65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5fb1ae765a893c17bd34c182599dcd65");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", getName());
        contentValues.put(TraceSQLHelper.KEY_TRAFFIC_KEY, getName());
        contentValues.put("date", TimeUtil.currentSysDate());
        contentValues.put("value", Long.valueOf(this.unit.total));
        contentValues.put(TraceSQLHelper.KEY_UP, Long.valueOf(this.unit.txBytes));
        contentValues.put(TraceSQLHelper.KEY_DOWN, Long.valueOf(this.unit.rxBytes));
        contentValues.put("wifi", Long.valueOf(this.unit.wifiBytes));
        contentValues.put("mobile", Long.valueOf(this.unit.mobileBytes));
        contentValues.put("foreground", Long.valueOf(this.unit.foregroundBytes));
        contentValues.put("background", Long.valueOf(this.unit.backgroundBytes));
        LinkedList linkedList = new LinkedList();
        linkedList.add(contentValues);
        String[] strArr = {"value", TraceSQLHelper.KEY_UP, TraceSQLHelper.KEY_DOWN, "wifi", "mobile", "foreground", "background"};
        TraceSQLHelper.getInstance().updateDetails(linkedList, strArr, new String[]{"type", "date"}, true, false, null);
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public Object fetchTraceForReport(String str, TrafficDispatcher trafficDispatcher) {
        Object[] objArr = {str, trafficDispatcher};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7180d08dab045439bb96e0fb4851e3e2", RobustBitConfig.DEFAULT_VALUE)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7180d08dab045439bb96e0fb4851e3e2");
        }
        LinkedList<ContentValues> executeQuery = executeQuery(str);
        JSONObject jSONObject = new JSONObject();
        Iterator<ContentValues> it = executeQuery.iterator();
        while (it.hasNext()) {
            ContentValues next = it.next();
            try {
                jSONObject.put("total", next.getAsLong("value"));
                jSONObject.put(Constants.TRAFFIC_UP, next.getAsLong(TraceSQLHelper.KEY_UP));
                jSONObject.put(Constants.TRAFFIC_DOWN, next.getAsLong(TraceSQLHelper.KEY_DOWN));
                jSONObject.put(Constants.TRAFFIC_WIFI, next.getAsLong("wifi"));
                jSONObject.put(Constants.TRAFFIC_MOBILE, next.getAsLong("mobile"));
                jSONObject.put(Constants.TRAFFIC_FOREGROUND, next.getAsLong("foreground"));
                jSONObject.put(Constants.TRAFFIC_BACKGROUND, next.getAsLong("background"));
            } catch (Throwable th) {
                Logger.getMetricxLogger().e(getName(), th);
            }
        }
        trafficDispatcher.onLoganNeeded(jSONObject.toString(), getName());
        return jSONObject;
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficTraceHandler
    public void clearTraceStorage(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e94adc1b3602490e44b91501b744b13b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e94adc1b3602490e44b91501b744b13b");
        } else {
            TraceSQLHelper.getInstance().deleteAll(getName(), str);
        }
    }

    private LinkedList<ContentValues> executeQuery(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc79e986a136d5f46aa468d75758359a", RobustBitConfig.DEFAULT_VALUE)) {
            return (LinkedList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc79e986a136d5f46aa468d75758359a");
        }
        StringBuffer stringBuffer = new StringBuffer("type=? and ");
        stringBuffer.append("date=?");
        Pair<String, LinkedList<ContentValues>> queryAll = TraceSQLHelper.getInstance().queryAll(new String[]{"value", TraceSQLHelper.KEY_UP, TraceSQLHelper.KEY_DOWN, "wifi", "mobile", "foreground", "background"}, stringBuffer.toString(), new String[]{getName(), str}, null, null);
        if (TextUtils.isEmpty((CharSequence) queryAll.first)) {
            return (LinkedList) queryAll.second;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) (-1));
        contentValues.put(TraceSQLHelper.KEY_UP, (Integer) (-1));
        contentValues.put(TraceSQLHelper.KEY_DOWN, (Integer) (-1));
        contentValues.put("foreground", (Integer) (-1));
        contentValues.put("background", (Integer) (-1));
        contentValues.put("mobile", (Integer) (-1));
        contentValues.put("wifi", (Integer) (-1));
        LinkedList<ContentValues> linkedList = new LinkedList<>();
        linkedList.add(contentValues);
        HashMap hashMap = new HashMap();
        hashMap.put("failMsg", queryAll.first);
        this.exception.reportException(hashMap);
        return linkedList;
    }

    @Override // com.meituan.metrics.traffic.TrafficTrace, com.meituan.metrics.traffic.TrafficInterceptedManager.ITrafficInterceptedListener
    public void onTrafficIntercepted(TrafficRecord trafficRecord, int i) {
        Object[] objArr = {trafficRecord, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff86382192ebc178d890625e60540a80", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff86382192ebc178d890625e60540a80");
        } else if (isEnable()) {
            this.unit.rxBytes += trafficRecord.rxBytes;
            this.unit.txBytes += trafficRecord.txBytes;
            long j = trafficRecord.rxBytes + trafficRecord.txBytes;
            this.unit.total += j;
            if (NetWorkUtils.isWifiConnected(Metrics.getInstance().getContext())) {
                this.unit.wifiBytes += j;
            } else {
                this.unit.mobileBytes += j;
            }
            if (AppBus.getInstance().isForeground()) {
                this.unit.foregroundBytes += j;
                return;
            }
            this.unit.backgroundBytes += j;
        }
    }
}

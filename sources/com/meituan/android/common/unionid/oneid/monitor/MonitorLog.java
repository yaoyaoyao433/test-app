package com.meituan.android.common.unionid.oneid.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MonitorLog {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final AtomicInteger incementalid = new AtomicInteger(0);
    public static String processName;
    public JSONArray events;
    public JSONObject rtt;
    public long startTime;

    public MonitorLog() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "51b90847758d49af6159c57016da77a3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "51b90847758d49af6159c57016da77a3");
            return;
        }
        this.startTime = -1L;
        this.events = new JSONArray();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "488695542dc838b27731435eb53545e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "488695542dc838b27731435eb53545e8");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("processName", processName);
            jSONObject.put("events", this.events);
            jSONObject.put("rtt", this.rtt);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}

package com.meituan.metrics.model;

import com.meituan.metrics.util.TimeUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public abstract class AbstractEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int configFrom;
    public Map<String, Object> optionTags;
    private int pid;
    public String raw;
    private String sid;
    public long ts;

    public abstract void convertToJson(JSONObject jSONObject) throws JSONException;

    public abstract String getEventType();

    public abstract String getLocalEventType();

    public abstract double getMetricValue();

    public abstract String getPageName();

    public boolean isValid() {
        return true;
    }

    public AbstractEvent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "91ca3bdd4cefe03f26c23005bc2d49c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "91ca3bdd4cefe03f26c23005bc2d49c8");
            return;
        }
        this.ts = TimeUtil.currentTimeMillisSNTP();
        this.configFrom = 2;
        this.pid = -1;
    }

    public void setSid(String str) {
        this.sid = str;
    }

    public void setPid(int i) {
        this.pid = i;
    }

    public String getSid() {
        return this.sid;
    }

    public int getPid() {
        return this.pid;
    }

    public final JSONObject toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "829a8fa4e02fe364582d6f0243946006", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "829a8fa4e02fe364582d6f0243946006");
        }
        JSONObject jSONObject = new JSONObject();
        try {
            convertToJson(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83182313c29e3a6921ed4c56da0dd5bb", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83182313c29e3a6921ed4c56da0dd5bb") : toJson().toString();
    }
}

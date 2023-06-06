package com.meituan.msi.bean;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.msi.annotations.MsiSupport;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@MsiSupport
/* loaded from: classes3.dex */
public class BroadcastEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private Object data;
    private EventType eventType;
    private Map<String, String> innerData;
    private MetricsInfo metrics;
    private String name;
    private String scope;
    private String type;
    private Map<String, String> uiData;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public static class MetricsInfo {
        public static ChangeQuickRedirect changeQuickRedirect;
        public long startTime;
    }

    public BroadcastEvent(String str, Object obj) {
        this(str, null, obj);
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6418b04cc06b237e81466178bd56744a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6418b04cc06b237e81466178bd56744a");
        }
    }

    public BroadcastEvent(String str, String str2, Object obj) {
        Object[] objArr = {str, str2, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e9aca3d324f3df6d2cf4b4e0e5bce8eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e9aca3d324f3df6d2cf4b4e0e5bce8eb");
            return;
        }
        this.type = "event";
        this.scope = "default";
        this.name = str;
        this.metrics = new MetricsInfo();
        this.metrics.startTime = System.currentTimeMillis();
        this.data = obj;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.scope = str2;
    }

    public void setTaskId(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4099ed24e2653bba088640fc76b55a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4099ed24e2653bba088640fc76b55a0");
            return;
        }
        if (this.innerData == null) {
            this.innerData = new HashMap();
        }
        this.innerData.put(ResponseWithInnerData.TASK_ID, str);
    }

    public void setUiData(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "688a4c13ec4b1b58f2691781acd37ae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "688a4c13ec4b1b58f2691781acd37ae6");
        } else if (this.uiData == null) {
            this.uiData = map;
        } else {
            this.uiData.putAll(map);
        }
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public void addUiData(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e25e53a717c3c3cd9597f7ea07450de8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e25e53a717c3c3cd9597f7ea07450de8");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
        } else {
            if (this.uiData == null) {
                this.uiData = new HashMap();
            }
            this.uiData.put(str, str2);
        }
    }

    public void setInnerData(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fdac5dc06024b8b182e92d3102e32b1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fdac5dc06024b8b182e92d3102e32b1d");
        } else if (this.innerData == null) {
            this.innerData = map;
        } else {
            this.innerData.putAll(map);
        }
    }

    public void setScope(String str) {
        this.scope = str;
    }

    public String getName() {
        return this.name;
    }

    public Object getData() {
        return this.data;
    }

    public String getScope() {
        return this.scope;
    }

    public EventType getEventType() {
        return this.eventType;
    }

    public final Map<String, String> getUiData() {
        return this.uiData;
    }

    public final Map<String, String> getInnerData() {
        return this.innerData;
    }

    public void setData(Object obj) {
        this.data = obj;
    }
}

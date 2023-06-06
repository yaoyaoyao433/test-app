package com.meituan.android.neohybrid.base.jshandler;

import com.meituan.android.neohybrid.neo.report.a;
import com.meituan.android.neohybrid.neo.report.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class NeoBaseJsHandler<T> extends NeoFormatDataJsHandler<T> {
    private static final String KEY_TIMESTAMP = "timestamp";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String action;
    private long bridgeEndTime;
    private long bridgeStartTime;

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoFormatDataJsHandler
    public void onExecuteStart(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5cea4b31a0860efd1058a636b13b66b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5cea4b31a0860efd1058a636b13b66b0");
            return;
        }
        super.onExecuteStart(jSONObject);
        HashMap<String, Object> hashMap = a.c("bridge_name", getName()).b;
        if (jSONObject != null) {
            this.bridgeStartTime = System.currentTimeMillis();
            this.action = jSONObject.optString("action");
            hashMap.put("bridge_time", Long.valueOf(this.bridgeStartTime - jSONObject.optLong("timestamp")));
            hashMap.put("bridge_action", this.action);
        } else {
            hashMap.put("status", "error");
        }
        d.a(getNeoCompat(), "b_pay_neo_bridge_native_start_sc", (Map<String, Object>) hashMap);
        d.c(getNeoCompat(), "neo_bridge_native_start", hashMap);
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoFormatDataJsHandler
    public void onExecuteEnd(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "83715e98729475d679bec49729242900", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "83715e98729475d679bec49729242900");
            return;
        }
        super.onExecuteEnd(jSONObject);
        HashMap<String, Object> hashMap = a.c("bridge_name", getName()).b;
        this.bridgeEndTime = System.currentTimeMillis();
        hashMap.put("bridge_time", Long.valueOf(this.bridgeEndTime - this.bridgeStartTime));
        hashMap.put("action", this.action);
        d.a(getNeoCompat(), "b_pay_neo_bridge_native_end_sc", (Map<String, Object>) hashMap);
        d.c(getNeoCompat(), "neo_bridge_native_end", hashMap);
    }

    @Override // com.meituan.android.neohybrid.base.jshandler.NeoFormatDataJsHandler
    public void onExecuteFail(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "393beedfddaf522eec45700194b35503", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "393beedfddaf522eec45700194b35503");
            return;
        }
        super.onExecuteFail(i, str);
        HashMap<String, Object> hashMap = a.c("bridge_name", getName()).b;
        this.bridgeEndTime = System.currentTimeMillis();
        hashMap.put("status", "fail");
        hashMap.put("bridge_time", Long.valueOf(this.bridgeEndTime - this.bridgeStartTime));
        hashMap.put("action", this.action);
        d.a(getNeoCompat(), "b_pay_neo_bridge_native_end_sc", (Map<String, Object>) hashMap);
        d.c(getNeoCompat(), "neo_bridge_native_end", hashMap);
    }
}

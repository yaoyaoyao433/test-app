package com.sankuai.waimai.business.ugc.mach.live;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.js.JSInvokeNativeMethod;
import com.sankuai.waimai.mach.jsv8.a;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class MachLivePlayerNativeMethod implements JSInvokeNativeMethod {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final HashMap<Long, SoftReference<MachLivePlayerComponent>> sComponentRefMap = new HashMap<>();

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public String module() {
        return "liveplayer";
    }

    public static void registerComponent(long j, MachLivePlayerComponent machLivePlayerComponent) {
        Object[] objArr = {new Long(j), machLivePlayerComponent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "0a0b075920cdc8a4e79fb93828d43bf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "0a0b075920cdc8a4e79fb93828d43bf6");
        } else {
            sComponentRefMap.put(Long.valueOf(j), new SoftReference<>(machLivePlayerComponent));
        }
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public String[] methods() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a08dff22f38a92239cf25445a2f98f02", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a08dff22f38a92239cf25445a2f98f02") : new String[]{"sendLiveEvent"};
    }

    @Override // com.sankuai.waimai.mach.js.JSInvokeNativeMethod
    public void invoke(String str, String str2, String str3, a aVar) {
        Object[] objArr = {str, str2, str3, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9dd5320688d18a5ea0a3058a3b224a20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9dd5320688d18a5ea0a3058a3b224a20");
        } else if (TextUtils.isEmpty(str) || !"sendLiveEvent".equals(str)) {
        } else {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                long optLong = jSONObject.optLong("componentId");
                if (optLong <= 0) {
                    doCallback(aVar, str3, false, "componentId is valid");
                    return;
                }
                String optString = jSONObject.optString("event");
                if (TextUtils.isEmpty(optString)) {
                    doCallback(aVar, str3, false, "event is valid");
                    return;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                Map<String, Object> jsonToMap = optJSONObject != null ? jsonToMap(optJSONObject) : null;
                SoftReference<MachLivePlayerComponent> softReference = sComponentRefMap.get(Long.valueOf(optLong));
                if (softReference != null && softReference.get() != null) {
                    softReference.get().sendLiveEvent(optString, jsonToMap);
                    doCallback(aVar, str3, true, "event send success");
                    return;
                }
                doCallback(aVar, str3, false, "component is null");
            } catch (Exception e) {
                doCallback(aVar, str3, false, e.toString());
            }
        }
    }

    private static Map<String, Object> jsonToMap(JSONObject jSONObject) throws JSONException {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3314bc3a9c6e5bb22909ec87295c92db", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3314bc3a9c6e5bb22909ec87295c92db");
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.opt(next));
        }
        return hashMap;
    }

    private void doCallback(a aVar, String str, boolean z, String str2) {
        Object[] objArr = {aVar, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8482ec3cf7378ce6501c0ecf49d09ccd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8482ec3cf7378ce6501c0ecf49d09ccd");
        } else if (aVar != null) {
            StringBuilder sb = new StringBuilder("{\"status\":");
            sb.append(z ? 0 : -1);
            sb.append(",\"data\": {");
            sb.append("\"success\":");
            sb.append(z);
            sb.append(",\"message\":\"");
            sb.append(str2);
            sb.append("\"}}");
            aVar.a(str, sb.toString());
        }
    }
}

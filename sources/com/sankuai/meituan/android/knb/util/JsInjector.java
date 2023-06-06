package com.sankuai.meituan.android.knb.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.titans.debug.adapter.plugin.JsInjectEntity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class JsInjector {
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isBitmapMonitorEnable;

    public JsInjector() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d80ff3d210f76ae09bf1719b7807aa5c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d80ff3d210f76ae09bf1719b7807aa5c");
        } else {
            this.isBitmapMonitorEnable = false;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SingleTonHolder {
        private static final JsInjector INSTANCE = new JsInjector();
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static JsInjector getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b9b0708745d3af41bf224f9f30978931", RobustBitConfig.DEFAULT_VALUE) ? (JsInjector) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b9b0708745d3af41bf224f9f30978931") : SingleTonHolder.INSTANCE;
    }

    public boolean isBitmapMonitorEnable() {
        return this.isBitmapMonitorEnable;
    }

    public void setBitmapMonitorEnable(boolean z) {
        this.isBitmapMonitorEnable = z;
    }

    public List<JsInjectEntity> jsonArrayToList() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5685ba069b73f42c813f73dd839bb8cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5685ba069b73f42c813f73dd839bb8cf");
        }
        JSONArray jSONArray = (JSONArray) KNBConfig.getConfig(KNBConfig.CONFIG_INJECT_DEBUG_JS, JSONArray.class);
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("label");
                String optString2 = optJSONObject.optString("script");
                String optString3 = optJSONObject.optString("labelId");
                JsInjectEntity jsInjectEntity = new JsInjectEntity();
                jsInjectEntity.label = optString;
                jsInjectEntity.script = optString2;
                jsInjectEntity.labelId = optString3;
                arrayList.add(jsInjectEntity);
            }
        }
        return arrayList;
    }
}

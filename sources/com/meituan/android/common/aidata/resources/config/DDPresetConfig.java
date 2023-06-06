package com.meituan.android.common.aidata.resources.config;

import com.dianping.titans.js.JsBridgeResult;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DDPresetConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    private int mode;
    private String sceneName;
    private int useCache;

    public DDPresetConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ccb685ccbc7fdb0eebb777b37710e48", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ccb685ccbc7fdb0eebb777b37710e48");
        } else {
            this.mode = -1;
        }
    }

    public String getSceneName() {
        return this.sceneName;
    }

    private void setSceneName(String str) {
        this.sceneName = str;
    }

    public int getUseCache() {
        return this.useCache;
    }

    private void setUseCache(int i) {
        this.useCache = i;
    }

    public int getMode() {
        return this.mode;
    }

    private void setMode(int i) {
        this.mode = i;
    }

    public static Map<String, DDPresetConfig> parsePresetResource(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "69f51cc2603f7079e2f7e55cc78f3857", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "69f51cc2603f7079e2f7e55cc78f3857");
        }
        if (jSONObject == null) {
            return null;
        }
        synchronized (DDPresetConfig.class) {
            JSONObject optJSONObject = jSONObject.optJSONObject(ResourceConfigManager.KEY_PRESET_CONFIG_RESOURCE_LIST);
            if (optJSONObject != null && optJSONObject.keys() != null) {
                HashMap hashMap = new HashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(next);
                    if (optJSONObject2 != null) {
                        DDPresetConfig dDPresetConfig = new DDPresetConfig();
                        dDPresetConfig.setSceneName(next);
                        dDPresetConfig.setUseCache(optJSONObject2.optInt("use_cache", 0));
                        dDPresetConfig.setMode(optJSONObject2.optInt(JsBridgeResult.ARG_KEY_LOCATION_MODE, -1));
                        hashMap.put(next, dDPresetConfig);
                    }
                }
                return hashMap;
            }
            return null;
        }
    }
}

package com.huawei.hms.framework.common.hianalytics;

import com.huawei.hms.framework.common.Logger;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class HianalyticsBaseData {
    protected static final String SDK_NAME = "sdk_name";
    private static final String SDK_TYPE = "sdk_type";
    private static final String TAG = "HianalyticsBaseData";
    private LinkedHashMap<String, String> data = new LinkedHashMap<>();

    public HianalyticsBaseData() {
        this.data.put(SDK_TYPE, "UxPP");
        this.data.put(SDK_NAME, "Restclient");
    }

    public LinkedHashMap<String, String> get() {
        return this.data;
    }

    public HianalyticsBaseData put(String str, long j) {
        if (str == null) {
            Logger.v(TAG, "key = null : value = " + j);
        } else {
            LinkedHashMap<String, String> linkedHashMap = this.data;
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            linkedHashMap.put(str, sb.toString());
        }
        return this;
    }

    public HianalyticsBaseData put(String str, String str2) {
        if (str == null || str2 == null) {
            Logger.v(TAG, "key = " + str + " : value = " + str2);
        } else {
            this.data.put(str, str2);
        }
        return this;
    }

    public HianalyticsBaseData put(LinkedHashMap<String, String> linkedHashMap) {
        if (linkedHashMap == null || linkedHashMap.isEmpty()) {
            Logger.v(TAG, "data is null");
        } else {
            this.data.putAll(linkedHashMap);
        }
        return this;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, String> entry : get().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (JSONException e) {
            Logger.w(TAG, "catch JSONException", e);
        }
        return jSONObject.toString();
    }
}

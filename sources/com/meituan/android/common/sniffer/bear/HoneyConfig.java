package com.meituan.android.common.sniffer.bear;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HoneyConfig {
    private int mErrorSample;
    private int mMetricsFailedSample;
    private int mMetricsSuccessSample;
    public int mRemoteIgnore;
    private Map<String, Integer> mType2ErrorSample;
    private Map<String, Integer> mType2MetricsFailedSample;
    private Map<String, Integer> mType2MetricsSuccessSample;

    private HoneyConfig() {
    }

    @NonNull
    public static HoneyConfig ignoreAll() {
        HoneyConfig honeyConfig = new HoneyConfig();
        honeyConfig.mRemoteIgnore = 1;
        return honeyConfig;
    }

    public HoneyConfig(@NonNull JsonObject jsonObject, @Nullable HoneyConfig honeyConfig) {
        if (honeyConfig != null) {
            this.mRemoteIgnore = parseInt(jsonObject, "i", honeyConfig.mRemoteIgnore);
            this.mErrorSample = parseInt(jsonObject, "e", honeyConfig.mErrorSample);
            this.mMetricsSuccessSample = parseInt(jsonObject, "s", honeyConfig.mMetricsSuccessSample);
            this.mMetricsFailedSample = parseInt(jsonObject, "f", honeyConfig.mMetricsFailedSample);
        } else {
            this.mRemoteIgnore = jsonObject.get("i").getAsInt();
            this.mErrorSample = jsonObject.get("e").getAsInt();
            this.mMetricsSuccessSample = jsonObject.get("s").getAsInt();
            this.mMetricsFailedSample = jsonObject.get("f").getAsInt();
        }
        this.mType2ErrorSample = parseMap(jsonObject, "tE", this.mErrorSample);
        this.mType2MetricsSuccessSample = parseMap(jsonObject, "tS", this.mMetricsSuccessSample);
        this.mType2MetricsFailedSample = parseMap(jsonObject, "tF", this.mMetricsFailedSample);
    }

    public int sampleOfErrorLogForType(@Nullable String str) {
        if (this.mType2ErrorSample.containsKey(str)) {
            return this.mType2ErrorSample.get(str).intValue();
        }
        return this.mErrorSample;
    }

    public int sampleOfSuccessMetricsForType(@Nullable String str) {
        if (this.mType2MetricsSuccessSample.containsKey(str)) {
            return this.mType2MetricsSuccessSample.get(str).intValue();
        }
        return this.mMetricsSuccessSample;
    }

    public int sampleOfFailedMetricsForType(@Nullable String str) {
        if (this.mType2MetricsFailedSample.containsKey(str)) {
            return this.mType2MetricsFailedSample.get(str).intValue();
        }
        return this.mMetricsFailedSample;
    }

    private static int parseInt(@NonNull JsonObject jsonObject, @NonNull String str, int i) {
        JsonElement jsonElement = jsonObject.get(str);
        return jsonElement != null ? jsonElement.getAsInt() : i;
    }

    private static Map<String, Integer> parseMap(@NonNull JsonObject jsonObject, @NonNull String str, int i) {
        JsonElement jsonElement = jsonObject.get(str);
        if (jsonElement instanceof JsonObject) {
            JsonObject jsonObject2 = (JsonObject) jsonElement;
            if (jsonObject2.size() == 0) {
                return Collections.emptyMap();
            }
            HashMap hashMap = new HashMap();
            for (String str2 : jsonObject2.keySet()) {
                hashMap.put(str2, Integer.valueOf(parseInt(jsonObject2, str2, i)));
            }
            return hashMap;
        }
        return Collections.emptyMap();
    }
}

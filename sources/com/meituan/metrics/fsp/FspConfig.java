package com.meituan.metrics.fsp;

import android.text.TextUtils;
import com.meituan.metrics.Metrics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class FspConfig {
    private static final double DEFAULT_AREA = 0.05d;
    private static final int DEFAULT_DETECT_4G_DELAY_TIME = 500;
    private static final int DEFAULT_DETECT_FREQUENCY = 100;
    private static final int DEFAULT_DETECT_TIME = 3000;
    private static final int DEFAULT_MIN_VIEW_COUNT = 0;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final Map<String, Double> activityAreaMap;
    private final Map<String, Integer> activityMinViewCountMap;
    private final Map<String, Integer> activitySampleTimeMap;
    private double defaultAreaChange;
    private int defaultDetectTime;
    private int defaultMinViewCount;
    private int delayTime_4G;
    private int detectFrequency;
    private final Set<Pattern> ignoreSet;
    private boolean isDetectBottom;
    private boolean isOpen;
    private final Set<Pattern> whiteSet;

    public FspConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a471f2c3191ff50f67cb12911f94569e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a471f2c3191ff50f67cb12911f94569e");
            return;
        }
        this.activitySampleTimeMap = new HashMap();
        this.activityAreaMap = new HashMap();
        this.activityMinViewCountMap = new HashMap();
        this.ignoreSet = new HashSet();
        this.whiteSet = new HashSet();
    }

    public static FspConfig getDefaultConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "759a567662543623c18a06c59ed4e0b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (FspConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "759a567662543623c18a06c59ed4e0b8");
        }
        FspConfig fspConfig = new FspConfig();
        fspConfig.defaultDetectTime = 3000;
        fspConfig.detectFrequency = 100;
        fspConfig.defaultAreaChange = DEFAULT_AREA;
        fspConfig.delayTime_4G = 500;
        fspConfig.isOpen = Metrics.debug;
        fspConfig.isDetectBottom = true;
        return fspConfig;
    }

    public static FspConfig parse(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fb544601f5a911efd558e1c9ca657c9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (FspConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fb544601f5a911efd558e1c9ca657c9a");
        }
        if (TextUtils.isEmpty(str)) {
            return getDefaultConfig();
        }
        try {
            FspConfig fspConfig = new FspConfig();
            JSONObject jSONObject = new JSONObject(str);
            fspConfig.defaultDetectTime = jSONObject.optInt("default_detect_time", 3000);
            fspConfig.detectFrequency = jSONObject.optInt("detect_frequency", 100);
            fspConfig.defaultAreaChange = jSONObject.optDouble("default_detect_area", DEFAULT_AREA);
            fspConfig.delayTime_4G = jSONObject.optInt("detect_delay_4G_time", 500);
            fspConfig.defaultMinViewCount = jSONObject.optInt("default_min_view_count", 0);
            fspConfig.isDetectBottom = jSONObject.optBoolean("detect_reach_bottom", true);
            fspConfig.isOpen = jSONObject.optBoolean("detect_open", Metrics.debug);
            JSONObject optJSONObject = jSONObject.optJSONObject("detect_time_activity");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next) && optJSONObject.optInt(next, 0) > 0) {
                        fspConfig.activitySampleTimeMap.put(next, Integer.valueOf(optJSONObject.optInt(next)));
                    }
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("detect_area_activity");
            if (optJSONObject2 != null) {
                Iterator<String> keys2 = optJSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!TextUtils.isEmpty(next2) && optJSONObject2.optDouble(next2, 0.0d) > 0.0d) {
                        fspConfig.activityAreaMap.put(next2, Double.valueOf(optJSONObject2.optDouble(next2)));
                    }
                }
            }
            JSONObject optJSONObject3 = jSONObject.optJSONObject("min_view_count_activity");
            if (optJSONObject3 != null) {
                Iterator<String> keys3 = optJSONObject3.keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    if (!TextUtils.isEmpty(next3) && optJSONObject3.optInt(next3, 0) > 0) {
                        fspConfig.activityMinViewCountMap.put(next3, Integer.valueOf(optJSONObject3.optInt(next3)));
                    }
                }
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("detect_ignore_activity");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    fspConfig.ignoreSet.add(Pattern.compile(optJSONArray.optString(i)));
                }
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("detect_white_activity");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    fspConfig.whiteSet.add(Pattern.compile(optJSONArray2.optString(i2)));
                }
            }
            return fspConfig;
        } catch (Throwable unused) {
            return getDefaultConfig();
        }
    }

    public int getDetectFrequency() {
        return this.detectFrequency;
    }

    public int getDetectTime(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5d1ffdbf87c54760c77b40c954d85d59", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5d1ffdbf87c54760c77b40c954d85d59")).intValue();
        }
        int i = this.defaultDetectTime;
        if (this.activitySampleTimeMap.containsKey(str)) {
            i += this.activitySampleTimeMap.get(str).intValue();
        }
        return !z ? i + this.delayTime_4G : i;
    }

    public double getDetectArea(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b30314c012cc895fad6a856b0e8c6415", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b30314c012cc895fad6a856b0e8c6415")).doubleValue();
        }
        if (this.activityAreaMap.containsKey(str)) {
            return this.activityAreaMap.get(str).doubleValue();
        }
        return this.defaultAreaChange;
    }

    public boolean isOpen() {
        return this.isOpen;
    }

    public boolean isDetectReachBottom() {
        return this.isDetectBottom;
    }

    public boolean inBlackList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "738eb54ed1fb9eccb7f20337aec426a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "738eb54ed1fb9eccb7f20337aec426a3")).booleanValue();
        }
        for (Pattern pattern : this.ignoreSet) {
            if (pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public boolean inWhiteList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa526fac9076ee73bad783ee0ed2f56e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa526fac9076ee73bad783ee0ed2f56e")).booleanValue();
        }
        for (Pattern pattern : this.whiteSet) {
            if (pattern.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public int getMinViewCount(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a84a19c72d2569da298593552578962", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a84a19c72d2569da298593552578962")).intValue();
        }
        if (this.activityMinViewCountMap.containsKey(str)) {
            return this.activityMinViewCountMap.get(str).intValue();
        }
        return this.defaultMinViewCount;
    }
}

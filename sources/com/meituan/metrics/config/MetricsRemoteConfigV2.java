package com.meituan.metrics.config;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.android.common.metricx.Internal;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class MetricsRemoteConfigV2 {
    public static final String MATCH_ALL = "*";
    private static final String PROCESS_MAIN = "Main";
    public static final double RATE = Math.random();
    public static ChangeQuickRedirect changeQuickRedirect;
    public static boolean isMainProcess;
    public float anr;
    @SerializedName("big_image_threshold")
    public int bigImageThreshold;
    public PagesConfig cpu;
    @SerializedName("day_limit")
    public int dayLimit;
    @SerializedName("day_limit_per_page")
    public int dayLimitPerPage;
    @SerializedName(Constants.FPS_CUSTOM)
    public KeysConfig fpsCustom;
    @SerializedName(Constants.FPS_PAGE)
    public PagesConfig fpsPage;
    @SerializedName(Constants.FPS_SCROLL)
    public PagesConfig fpsScroll;
    public float lag;
    @SerializedName("lag_threshold")
    public int lagThreshold;
    @SerializedName("load_custom")
    public KeysConfig loadCustom;
    @SerializedName("load_homepage")
    public float loadHomepage;
    @SerializedName("load_page")
    public PagesConfig loadPage;
    @SerializedName("load_page_auto")
    public PagesConfig loadPageAuto;
    @SerializedName("max_report_callstack_times")
    public int maxReportCallstackTimes;
    public PagesConfig memory;
    @SerializedName("process_cpu")
    public Process processCpu;
    @SerializedName("process_memory")
    public Process processMemory;
    @SerializedName("traffic_daily_total")
    public float trafficDailyTotal;
    @SerializedName("versions_sample_ratio")
    public ConcurrentHashMap<String, Number> versionSampleRatio;

    public MetricsRemoteConfigV2() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34dd029e2fd9eef08789f66b3b111fe8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34dd029e2fd9eef08789f66b3b111fe8");
            return;
        }
        this.anr = 1.0f;
        this.trafficDailyTotal = 1.0f;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    static class PagesConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ConcurrentHashMap<String, Number> pages;

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0084243ce55af162b67ec58b4abf1412", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0084243ce55af162b67ec58b4abf1412");
            }
            return "PagesConfig{pages=" + this.pages + '}';
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    static class KeysConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ConcurrentHashMap<String, Number> keys;

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eb521a59cd7cd7ae56ada9b3bae5bd08", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eb521a59cd7cd7ae56ada9b3bae5bd08");
            }
            return "KeysConfig{keys=" + this.keys + '}';
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    static class Process {
        public static ChangeQuickRedirect changeQuickRedirect;
        public ConcurrentHashMap<String, Number> processes;

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12ebe997fd6a620fe67203e76f77e9b3", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12ebe997fd6a620fe67203e76f77e9b3");
            }
            return "Process{processes=" + this.processes + '}';
        }
    }

    public boolean isAppStartupEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e3f47236df79a5ec3af73f7d5df9b51b", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e3f47236df79a5ec3af73f7d5df9b51b")).booleanValue() : RATE < ((double) getSampleRate(this.loadHomepage));
    }

    public boolean isAnrEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4d53f6c182477c33cd789ce28cde293", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4d53f6c182477c33cd789ce28cde293")).booleanValue() : RATE < ((double) getSampleRate(this.anr));
    }

    public boolean isLagEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "649b5df3fdb7a30f8e1ba5f6874d1d6c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "649b5df3fdb7a30f8e1ba5f6874d1d6c")).booleanValue() : RATE < ((double) getSampleRate(this.lag));
    }

    public boolean isFpsPageEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4921ec13741ee956d2469265a2c1e018", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4921ec13741ee956d2469265a2c1e018")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.fpsPage == null) {
            return false;
        }
        return isSwitchEnable(this.fpsPage.pages, str);
    }

    public boolean isFpsPageEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e389672e49abaeefef54eadc1489c234", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e389672e49abaeefef54eadc1489c234")).booleanValue();
        }
        if (this.fpsPage == null) {
            return false;
        }
        return isPageOrKeyEnable(this.fpsPage.pages);
    }

    public boolean isFpsScrollEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1cb0239e5574ad4d3c3b87f56c1e5280", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1cb0239e5574ad4d3c3b87f56c1e5280")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.fpsScroll == null) {
            return false;
        }
        return isSwitchEnable(this.fpsScroll.pages, str);
    }

    public boolean isFpsScrollEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "868be0a1f29a062189ab289ac020f146", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "868be0a1f29a062189ab289ac020f146")).booleanValue();
        }
        if (this.fpsScroll == null) {
            return false;
        }
        return isPageOrKeyEnable(this.fpsScroll.pages);
    }

    public boolean isFpsCustomEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bbb843ff932d3fb11cc971f75dc0df9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bbb843ff932d3fb11cc971f75dc0df9e")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.fpsCustom == null) {
            return false;
        }
        return isSwitchEnable(this.fpsCustom.keys, str);
    }

    public boolean isFpsCustomEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a83e2c6965156432be19c64e43bbd90a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a83e2c6965156432be19c64e43bbd90a")).booleanValue();
        }
        if (this.fpsCustom == null) {
            return false;
        }
        return isPageOrKeyEnable(this.fpsCustom.keys);
    }

    public boolean isLoadPageEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aec0e4508e93749a36ce3f585a0f6070", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aec0e4508e93749a36ce3f585a0f6070")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.loadPage == null) {
            return false;
        }
        return isSwitchEnable(this.loadPage.pages, str);
    }

    public boolean isLoadPageAutoEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98b65a0521d411c09f8cd4fd293087cf", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98b65a0521d411c09f8cd4fd293087cf")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.loadPageAuto == null) {
            return false;
        }
        return isSwitchEnable(this.loadPageAuto.pages, str);
    }

    public boolean isLoadPageEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2d7ac004b8574fc70523e3e87ad5bd2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2d7ac004b8574fc70523e3e87ad5bd2")).booleanValue();
        }
        if (this.loadPage == null) {
            return false;
        }
        return isPageOrKeyEnable(this.loadPage.pages);
    }

    public boolean isLoadPageCustom(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4abc701b4440f7d714d08e0f11c8464c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4abc701b4440f7d714d08e0f11c8464c")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || this.loadCustom == null) {
            return false;
        }
        return isSwitchEnable(this.loadCustom.keys, str);
    }

    public boolean isLoadPageCustom() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44a1fc78dac1f9fc5dde78fd85a4c8cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44a1fc78dac1f9fc5dde78fd85a4c8cd")).booleanValue();
        }
        if (this.loadCustom == null) {
            return false;
        }
        return isPageOrKeyEnable(this.loadCustom.keys);
    }

    public boolean isMemoryEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12c4f68346569e3f356c92c071b68b98", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12c4f68346569e3f356c92c071b68b98")).booleanValue();
        }
        if (this.memory == null) {
            return false;
        }
        return isPageOrKeyEnable(this.memory.pages);
    }

    public boolean isMemoryEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b8e8aca0f13a323cec9cfd780ab6d2f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b8e8aca0f13a323cec9cfd780ab6d2f")).booleanValue();
        }
        if (this.memory == null) {
            return false;
        }
        return isSwitchEnable(this.memory.pages, str);
    }

    public boolean isProcessCpuEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "520b7a097e2c114d2967e03c0e3c8a56", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "520b7a097e2c114d2967e03c0e3c8a56")).booleanValue();
        }
        if (this.processCpu == null) {
            return false;
        }
        return isSwitchEnable(this.processCpu.processes, str, true);
    }

    public boolean isProcessMemoryEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1353cedea5c8bd1b2766fc90f7a2f2a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1353cedea5c8bd1b2766fc90f7a2f2a")).booleanValue();
        }
        if (this.processMemory == null) {
            return false;
        }
        return isSwitchEnable(this.processMemory.processes, str, true);
    }

    public boolean isCpuEnable() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92eb8394250c0a70702fad25ddc47c91", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92eb8394250c0a70702fad25ddc47c91")).booleanValue();
        }
        if (this.cpu == null) {
            return false;
        }
        return isPageOrKeyEnable(this.cpu.pages);
    }

    public boolean isCpuEnable(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "67116aa0a295cfd37e8f5e1ab1a0b0f1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "67116aa0a295cfd37e8f5e1ab1a0b0f1")).booleanValue();
        }
        if (this.cpu == null) {
            return false;
        }
        return isSwitchEnable(this.cpu.pages, str);
    }

    public float getTrafficRate() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "083da8198d9ac6e764e6456a14fdd4a9", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "083da8198d9ac6e764e6456a14fdd4a9")).floatValue() : getSampleRate(this.trafficDailyTotal);
    }

    private boolean isPageOrKeyEnable(Map<String, Number> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f3d9d76a6adce2661fbd13ef93a0b08", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f3d9d76a6adce2661fbd13ef93a0b08")).booleanValue();
        }
        if (map == null || map.size() <= 0) {
            return false;
        }
        Set<Map.Entry<String, Number>> entrySet = map.entrySet();
        if (entrySet.size() > 0) {
            for (Map.Entry<String, Number> entry : entrySet) {
                float floatValue = entry.getValue().floatValue();
                if (!TextUtils.isEmpty(entry.getKey()) && RATE < getSampleRate(floatValue)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isSwitchEnable(Map<String, Number> map, String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03b27fe07a9cb5c9fadd7042bc0c555a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03b27fe07a9cb5c9fadd7042bc0c555a")).booleanValue() : isSwitchEnable(map, str, false);
    }

    private boolean isSwitchEnable(Map<String, Number> map, String str, boolean z) {
        Object[] objArr = {map, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e40ca80976502a00a0298197494330b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e40ca80976502a00a0298197494330b7")).booleanValue();
        }
        if (map == null || map.size() <= 0) {
            return false;
        }
        Set<Map.Entry<String, Number>> entrySet = map.entrySet();
        if (entrySet.size() > 0) {
            for (Map.Entry<String, Number> entry : entrySet) {
                String key = entry.getKey();
                float floatValue = entry.getValue().floatValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.equals(key, "*") && !key.endsWith("*") && (TextUtils.equals(key, str) || (z && PROCESS_MAIN.equalsIgnoreCase(key) && isMainProcess))) {
                    return RATE < ((double) getSampleRate(floatValue));
                }
            }
            for (Map.Entry<String, Number> entry2 : entrySet) {
                String key2 = entry2.getKey();
                float floatValue2 = entry2.getValue().floatValue();
                if (!TextUtils.isEmpty(key2) && !TextUtils.equals(key2, "*") && key2.endsWith("*") && str.startsWith(key2.substring(0, key2.length() - 1))) {
                    return RATE < ((double) getSampleRate(floatValue2));
                }
            }
            for (Map.Entry<String, Number> entry3 : entrySet) {
                float floatValue3 = entry3.getValue().floatValue();
                if (TextUtils.equals(entry3.getKey(), "*")) {
                    return RATE < ((double) getSampleRate(floatValue3));
                }
            }
        }
        return false;
    }

    private float getSampleRate(float f) {
        Number number;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c4e0630443184a207c56a0575d70eaa2", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c4e0630443184a207c56a0575d70eaa2")).floatValue() : (this.versionSampleRatio == null || this.versionSampleRatio.size() <= 0 || (number = this.versionSampleRatio.get(Internal.getAppEnvironment().getAppVersion())) == null) ? f : Math.max(f, number.floatValue());
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "346f71b4406367649efe44c8c7b16bf9", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "346f71b4406367649efe44c8c7b16bf9");
        }
        return "MetricsRemoteConfigV2{RATE=" + RATE + ", loadHomepage=" + this.loadHomepage + ", lag=" + this.lag + ", anr=" + this.anr + ", fpsPage=" + this.fpsPage + ", fpsScroll=" + this.fpsScroll + ", fpsCustom=" + this.fpsCustom + ", memory=" + this.memory + ", processMemory=" + this.processMemory + ", processCpu=" + this.processCpu + ", cpu=" + this.cpu + ", loadPage=" + this.loadPage + ", loadPageAuto=" + this.loadPageAuto + ", loadCustom=" + this.loadCustom + ", dayLimit=" + this.dayLimit + ", dayLimitPerPage=" + this.dayLimitPerPage + ", lagThreshold=" + this.lagThreshold + ", maxReportCallstackTimes=" + this.maxReportCallstackTimes + ", bigImageThreshold=" + this.bigImageThreshold + ", trafficDailyTotal=" + this.trafficDailyTotal + ", versionSampleRatio=" + this.versionSampleRatio + '}';
    }
}

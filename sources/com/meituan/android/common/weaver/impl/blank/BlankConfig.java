package com.meituan.android.common.weaver.impl.blank;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.impl.utils.FFPDebugger;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BlankConfig {
    public static final int MAX_SAMPLE = 100000;
    public static ChangeQuickRedirect changeQuickRedirect;
    public double bottomTrip;
    public long delay;
    public boolean enable;
    public boolean ignoreResume;
    private Map<String, Integer> path2Sample;
    private Map<String, Integer> path2StartSample;
    private final Random random;
    private int sample;
    private int startSample;
    public double topTrip;

    public BlankConfig(@NonNull String str) throws Throwable {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22a339983a4f18f810c766896a1b538a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22a339983a4f18f810c766896a1b538a");
            return;
        }
        this.path2Sample = Collections.emptyMap();
        this.path2StartSample = Collections.emptyMap();
        this.random = new Random();
        JSONObject jSONObject = new JSONObject(str);
        this.enable = jSONObject.optBoolean("enable", false);
        this.sample = jSONObject.optInt("sample", MAX_SAMPLE);
        this.topTrip = jSONObject.optDouble("topTrip", 0.0d);
        this.bottomTrip = jSONObject.optDouble("bottomTrip", 0.0d);
        this.delay = jSONObject.optLong("delay", MetricsAnrManager.ANR_THRESHOLD);
        this.ignoreResume = jSONObject.optBoolean("ignoreResume");
        this.startSample = jSONObject.optInt("startSample");
        this.path2Sample = FFPUtil.json2Map(jSONObject.optJSONObject("path2Sample"));
        this.path2StartSample = FFPUtil.json2Map(jSONObject.optJSONObject("path2StartSample"));
        if (FFPDebugger.getFFPDebugger().isBlanksDebug()) {
            this.enable = true;
            this.sample = MAX_SAMPLE;
            this.startSample = MAX_SAMPLE;
            this.ignoreResume = true;
        }
    }

    private double sampleForSample(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "344213318b06657f376740ebea7f46dc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "344213318b06657f376740ebea7f46dc")).doubleValue();
        }
        if (i == 0) {
            return 0.0d;
        }
        if (i == 100000) {
            return 1.0d;
        }
        if (this.random.nextInt(MAX_SAMPLE) < i) {
            return (i * 1.0d) / 100000.0d;
        }
        return -1.0d;
    }

    @Nullable
    public PagePathHelper.NativePathHelper sampleForNativeActivity(@NonNull Activity activity) {
        int i;
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61462b5e7ac6e4fc8713406771955a1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (PagePathHelper.NativePathHelper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61462b5e7ac6e4fc8713406771955a1c");
        }
        if (this.enable) {
            PagePathHelper.NativePathHelper pagePathHelper = pagePathHelper(activity);
            String configPagePath = pagePathHelper.getConfigPagePath();
            if (this.path2Sample.containsKey(configPagePath)) {
                i = this.path2Sample.get(configPagePath).intValue();
            } else if (this.path2Sample.containsKey(pagePathHelper.getActivityClassName())) {
                i = this.path2Sample.get(pagePathHelper.getActivityClassName()).intValue();
            } else {
                String activityClassName = pagePathHelper.getActivityClassName();
                if (activityClassName.contains("Web") || activityClassName.contains("HeraActivity") || activityClassName.contains("MSCActivity")) {
                    return null;
                }
                i = this.sample;
            }
            double sampleForSample = sampleForSample(i);
            if (sampleForSample <= 0.0d) {
                return null;
            }
            pagePathHelper.withSample(sampleForSample);
            return pagePathHelper;
        }
        return null;
    }

    public boolean sampleForContainer(@NonNull PagePathHelper pagePathHelper) {
        Object[] objArr = {pagePathHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b366066377171ee46ad5e853cec8a29e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b366066377171ee46ad5e853cec8a29e")).booleanValue();
        }
        if (this.enable) {
            String configPagePath = pagePathHelper.getConfigPagePath();
            int i = this.sample;
            if (this.path2Sample.containsKey(configPagePath)) {
                i = this.path2Sample.get(configPagePath).intValue();
            }
            double sampleForSample = sampleForSample(i);
            if (sampleForSample > 0.0d) {
                pagePathHelper.withSample(sampleForSample);
                return true;
            }
            return false;
        }
        return false;
    }

    public double sampleForStart(@NonNull PagePathHelper pagePathHelper) {
        Object[] objArr = {pagePathHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8aba392bd8423b090ea11f8c97cbea2c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8aba392bd8423b090ea11f8c97cbea2c")).doubleValue();
        }
        if (this.enable) {
            String configPagePath = pagePathHelper.getConfigPagePath();
            int i = -1;
            if (this.path2StartSample.containsKey(configPagePath)) {
                i = this.path2StartSample.get(configPagePath).intValue();
            } else {
                String activityClassName = pagePathHelper.getActivityClassName();
                if (this.path2StartSample.containsKey(activityClassName)) {
                    i = this.path2StartSample.get(activityClassName).intValue();
                }
            }
            if (i < 0) {
                i = this.startSample;
            }
            if (this.random.nextInt(MAX_SAMPLE) >= i) {
                return -1.0d;
            }
            return (pagePathHelper.getSample() * i) / 100000.0d;
        }
        return -1.0d;
    }

    @VisibleForTesting
    public PagePathHelper.NativePathHelper pagePathHelper(@NonNull Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd4dc0130e73b7c916b663302765423f", RobustBitConfig.DEFAULT_VALUE) ? (PagePathHelper.NativePathHelper) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd4dc0130e73b7c916b663302765423f") : new PagePathHelper.NativePathHelper(activity);
    }
}

package com.meituan.android.common.weaver.impl;

import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.impl.natives.PagePathHelper;
import com.meituan.android.common.weaver.impl.utils.FFPDebugger;
import com.meituan.android.common.weaver.interfaces.ffp.FFPUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RemoteConfig {
    public static ChangeQuickRedirect changeQuickRedirect;
    @NonNull
    public static final RemoteConfig sConfig = new RemoteConfig();
    private Map<String, Object> activity2Grids;
    private Map<String, Object> activity2Sample;
    private Map<String, Object> activity2Timeout;
    private int delay;
    public boolean enable;
    private int grids;
    private Set<String> ignoreActivities;
    private final Random random;
    private double renderSample;
    private final ErrorReporter reporter;
    private long timeout;

    public RemoteConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7f44e7fb9d7dc20ea3a81d80380f7833", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7f44e7fb9d7dc20ea3a81d80380f7833");
            return;
        }
        this.enable = false;
        this.timeout = 6000L;
        this.grids = 17;
        this.renderSample = 1.0d;
        this.activity2Timeout = Collections.emptyMap();
        this.activity2Grids = Collections.emptyMap();
        this.activity2Sample = Collections.emptyMap();
        this.ignoreActivities = Collections.emptySet();
        this.reporter = new ErrorReporter("RemoteConfig", 2);
        this.random = new Random();
    }

    public boolean detectActivity(@NonNull PagePathHelper pagePathHelper) {
        Object[] objArr = {pagePathHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01337519d02e42642beb96d26551b1b7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01337519d02e42642beb96d26551b1b7")).booleanValue();
        }
        if (this.enable || FFPDebugger.isDebug()) {
            String activityClassName = pagePathHelper.getActivityClassName();
            if (this.ignoreActivities.contains(activityClassName) || activityClassName.contains("WebView") || activityClassName.contains("WebActivity") || activityClassName.contains("HeraActivity") || activityClassName.contains(".MPActivity")) {
                return false;
            }
            if ((pagePathHelper instanceof PagePathHelper.NativePathHelper) && activityClassName.contains("MSCActivity")) {
                return false;
            }
            if (pagePathHelper.hasSpecialPagePath() && this.ignoreActivities.contains(pagePathHelper.getConfigPagePath())) {
                return false;
            }
            double sampleForActivity = sampleForActivity(pagePathHelper);
            if (sampleForActivity == 1.0d) {
                return true;
            }
            pagePathHelper.withSample(sampleForActivity);
            return this.random.nextDouble() <= sampleForActivity;
        }
        return false;
    }

    private double sampleForActivity(PagePathHelper pagePathHelper) {
        Object[] objArr = {pagePathHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fd212d5c2e9330084d72e91ffc8137b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fd212d5c2e9330084d72e91ffc8137b")).doubleValue();
        }
        if (FFPDebugger.isDebug()) {
            return 1.0d;
        }
        Object obj = this.activity2Sample.get(pagePathHelper.getActivityClassName());
        if (obj == null && pagePathHelper.hasSpecialPagePath()) {
            obj = this.activity2Sample.get(pagePathHelper.getConfigPagePath());
        }
        if (obj instanceof Number) {
            return ((Number) obj).doubleValue();
        }
        return this.renderSample;
    }

    public long timeoutOfActivity(@NonNull PagePathHelper pagePathHelper) {
        Object[] objArr = {pagePathHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8475b18b60eb3d4d208f1ed0a253bbf2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8475b18b60eb3d4d208f1ed0a253bbf2")).longValue();
        }
        Object obj = this.activity2Timeout.get(pagePathHelper.getActivityClassName());
        if (obj == null && pagePathHelper.hasSpecialPagePath()) {
            obj = this.activity2Timeout.get(pagePathHelper.getConfigPagePath());
        }
        if (obj instanceof Number) {
            return ((Number) obj).longValue();
        }
        return this.timeout;
    }

    public int gridsOfActivity(@NonNull PagePathHelper pagePathHelper) {
        Object[] objArr = {pagePathHelper};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee1ef6b82a15894bd53ef40252280642", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee1ef6b82a15894bd53ef40252280642")).intValue();
        }
        Object obj = this.activity2Grids.get(pagePathHelper.getActivityClassName());
        if (obj == null && pagePathHelper.hasSpecialPagePath()) {
            obj = this.activity2Grids.get(pagePathHelper.getConfigPagePath());
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return this.grids;
    }

    public void fromHorn(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38d5caaf74142dec1e3add7d8797c6cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38d5caaf74142dec1e3add7d8797c6cc");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.enable = jSONObject.optBoolean("enable", this.enable);
            this.timeout = jSONObject.optLong("timeout", this.timeout);
            this.grids = jSONObject.optInt("grids", this.grids);
            this.delay = jSONObject.optInt("delay", 2000);
            this.renderSample = jSONObject.optDouble("renderSample", this.renderSample);
            this.activity2Sample = FFPUtil.json2Map(jSONObject.optJSONObject("activity2Sample"));
            this.activity2Timeout = FFPUtil.json2Map(jSONObject.optJSONObject("activity2timeout"));
            this.activity2Grids = FFPUtil.json2Map(jSONObject.optJSONObject("activity2grids"));
            this.ignoreActivities = FFPUtil.array2Set(jSONObject.optJSONArray("ignore_activity"));
        } catch (Throwable th) {
            this.reporter.report(th);
        }
    }

    public int getDelay() {
        return this.delay;
    }
}
